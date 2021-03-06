package org.moflon.tie.gt.ide.core.codegeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorGTFile;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.build.MoflonEmfCodeGenerator;
import org.moflon.emf.build.MonitoredGenModelBuilder;
import org.moflon.emf.codegen.CodeGenerator;
import org.moflon.emf.injection.ide.InjectionManager;
import org.moflon.tie.gt.compiler.democles.codegen.template.TemplateConfigurationProvider;
import org.moflon.tie.gt.compiler.democles.config.DemoclesGeneratorAdapterFactory;
import org.moflon.tie.gt.compiler.democles.config.TieGtCodeGenerationConfiguration;
import org.moflon.tie.gt.compiler.democles.config.TypeLookup;
import org.moflon.tie.gt.compiler.democles.eclipse.MethodBodyResourceFactory;
import org.moflon.tie.gt.compiler.democles.eclipse.PatternResourceFactory;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.compiler.democles.util.StatusUtil;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintsLibraryRegistry;
import org.moflon.tie.gt.ide.core.patterns.util.TieGtEcoreUtil;

public class TieGtCodeGenerator extends MoflonEmfCodeGenerator {

	private static final Logger logger = Logger.getLogger(TieGtCodeGenerator.class);

	public TieGtCodeGenerator(final IFile ecoreFile, final ResourceSet resourceSet,
			final EMoflonPreferencesStorage preferencesStorage) {
		super(ecoreFile, resourceSet, preferencesStorage);
	}

	@Override
	public IStatus processResource(final IProgressMonitor monitor) {
		try {
			final MultiStatus processStatus = new MultiStatus(getPluginId(), 0, "Problems during code generation",
					null);
			final int totalWork = 5 + 10 + 10 + 15 + 35 + 30 + 5;
			final SubMonitor subMon = SubMonitor.convert(monitor, "Code generation task for " + getProject().getName(),
					totalWork);
			LogUtils.info(logger, "Generating code for: %s", getProject().getName());

			final long tic = System.nanoTime();

			final Resource resource = getEcoreResource();
			getResourceSet().getResources().add(resource);

			final IStatus controlFlowLoaderStatus = loadControlFlowFiles();
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
			if (StatusUtil.addAndCheckForErrors(controlFlowLoaderStatus, processStatus))
				return processStatus;

			final IStatus resourceErrorStatus = checkResourcesForErrors();
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
			if (StatusUtil.addAndCheckForErrors(resourceErrorStatus, processStatus))
				return processStatus;

			final IStatus genModelBuilderStatus = processGenModel(subMon);
			if (subMon.isCanceled())
				return Status.CANCEL_STATUS;
			if (StatusUtil.addAndCheckForErrors(genModelBuilderStatus, processStatus))
				return processStatus;

			final TieGtCodeGenerationConfiguration codeGeneratorConfig = createCodeGeneratorConfiguration();
			subMon.worked(5);
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			final IStatus controlFlowBuilderStatus = processControlFlowSpecification(codeGeneratorConfig, subMon);
			if (subMon.isCanceled())
				return Status.CANCEL_STATUS;
			if (StatusUtil.addAndCheckForErrors(controlFlowBuilderStatus, processStatus))
				return processStatus;

			final IStatus injectionStatus = loadInjections();
			if (subMon.isCanceled())
				return Status.CANCEL_STATUS;
			if (StatusUtil.addAndCheckForErrors(injectionStatus, processStatus))
				return processStatus;

			final IStatus codeGenerationStatus = generateCode(codeGeneratorConfig, subMon);
			if (subMon.isCanceled())
				return Status.CANCEL_STATUS;
			if (StatusUtil.addAndCheckForErrors(codeGenerationStatus, processStatus))
				return processStatus;
			subMon.worked(5);

			reportDuration(tic);

			return StatusUtil.returnIfNotOK(processStatus);
		} catch (final Exception e) {
			logger.debug(WorkspaceHelper.printStacktraceToString(e));
			final String message = String.format(
					"%s occurred during eMoflon code generation. Message: '%s'. (Stacktrace is logged with level debug)",
					e.getClass().getName(), e.getMessage());
			return createErrorStatus(message, e);
		}
	}

	private TieGtCodeGenerationConfiguration createCodeGeneratorConfiguration() {
		final TypeLookup typeLookup = createTypeLookup();
		final AttributeConstraintsLibraryRegistry attributeConstraintLibraries = loadAttributeConstraintLibraries(
				typeLookup);

		final TieGtCodeGenerationConfiguration codeGeneratorConfig = new TieGtCodeGenerationConfiguration(
				getResourceSet(), getPreferencesStorage(), attributeConstraintLibraries, typeLookup);
		inititializeResourceSet();
		return codeGeneratorConfig;
	}

	private TypeLookup createTypeLookup() {
		final List<EPackage> typeList = new ArrayList<>();
		this.getGenModel().findGenPackage(EcorePackage.eINSTANCE);
		typeList.add(this.getGenModel().getEcoreGenPackage().getEcorePackage());
		getResourceSet().getResources().stream().filter(TieGtEcoreUtil::isEcoreResource)
				.forEach(resource -> typeList.addAll(TieGtEcoreUtil.getEPackages(resource)));
		return new TypeLookup(typeList);
	}

	private IStatus processGenModel(final SubMonitor subMon) {
		final MonitoredGenModelBuilder genModelBuilderJob = new MonitoredGenModelBuilder(getResourceSet(),
				getAllResources(), getEcoreFile(), true, getMoflonProperties());
		final IStatus genModelBuilderStatus = genModelBuilderJob.run(subMon.split(15));
		if (genModelBuilderJob.getGenModel() != null)
			this.setGenModel(genModelBuilderJob.getGenModel());
		return genModelBuilderStatus;
	}

	private IStatus processControlFlowSpecification(final TieGtCodeGenerationConfiguration codeGeneratorConfig,
			final SubMonitor monitor) {
		final TieGtControlFlowBuilder controlFlowBuilder = new TieGtControlFlowBuilder(getPreferencesStorage());
		final IStatus controlFlowBuilderStatus = controlFlowBuilder.run(getProject(), getEcoreResource(),
				codeGeneratorConfig.getSearchPlanGenerators(), codeGeneratorConfig.getTypeLookup(), monitor.split(10));
		return controlFlowBuilderStatus;
	}

	private IStatus loadInjections() throws CoreException {
		final InjectionManager injectionManager = createInjectionManager(getProject());
		this.setInjectorManager(injectionManager);
		final IStatus injectionStatus = createInjections(getProject());
		return injectionStatus;
	}

	private IStatus generateCode(final TieGtCodeGenerationConfiguration codeGeneratorConfig, final SubMonitor monitor)
			throws CoreException {
		monitor.subTask("Generating code for project " + getProject().getName());
		final TemplateConfigurationProvider templateConfig = codeGeneratorConfig
				.createTemplateConfiguration(this.getGenModel());
		final Descriptor codeGenerationEngine = new DemoclesGeneratorAdapterFactory(templateConfig,
				this.getInjectorManager());
		final IStatus codeGenerationStatus = generateCode(codeGenerationEngine, getGenModel(),
				new BasicMonitor.EclipseSubProgress(monitor, 30));

		getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);

		return codeGenerationStatus;
	}

	private void reportDuration(final long tic) {
		final long toc = System.nanoTime();
		logger.info(String.format(Locale.US, "Code generation completed in %.3fs", (toc - tic) / 1e9));
	}

	/**
	 * This routine identifies and loads all mcf files in the current project.
	 *
	 * For each mcf file, an appropriate resource is created in this generator's
	 * resource set ({@link #getResourceSet()}
	 */
	private IStatus loadControlFlowFiles() {
		try {
			getProject().accept(new GtResourceLoadingVisitor(getResourceSet(), getProject()));
			getProject().accept(new McfResourceLoadingVisitor(getResourceSet(), getProject()));

			return Status.OK_STATUS;
		} catch (final CoreException e) {
			return createErrorStatus(e);
		}
	}

	/**
	 * Checks whether any {@link Resource} in {@link #getResourceSet()} contains
	 * errors and returns a corresponding {@link IStatus}
	 * 
	 * @return the resulting status
	 */
	private IStatus checkResourcesForErrors() {
		getResourceSet().getResources().forEach(resource -> {
			try {
				resource.load(null);
			} catch (final IOException e) {
				e.printStackTrace();
			}
		});
		final List<Resource> resourcesWithErrors = getResourceSet().getResources().stream()
				.filter(r -> !r.getErrors().isEmpty()).collect(Collectors.toList());
		if (!resourcesWithErrors.isEmpty()) {
			final List<URI> uriList = resourcesWithErrors.stream().map(resource -> resource.getURI())
					.collect(Collectors.toList());
			final String message = String.format(
					"eMoflon::TIE-GT skipped project %s due to errors in the resources with the following URIs: %s",
					getProject().getName(), uriList);
			return createErrorStatus(message);
		} else
			return Status.OK_STATUS;
	}

	/**
	 * Loads all attribute constraint libraries from the {@link EditorGTFile}
	 * objects in the resource set ({@link #getResourceSet()}
	 * 
	 * @param typeLookup
	 * 
	 * @return
	 */
	private AttributeConstraintsLibraryRegistry loadAttributeConstraintLibraries(final TypeLookup typeLookup) {
		final AttributeConstraintsLibraryLoader attributeConstraintsLibraryLoader = new AttributeConstraintsLibraryLoader(
				typeLookup);
		final AttributeConstraintsLibraryRegistry attributeConstraintLibraries = attributeConstraintsLibraryLoader
				.run(this.getResourceSet());
		return attributeConstraintLibraries;
	}

	private void inititializeResourceSet() {
		registerMethodBodyFactory();

		registerPatternFactory(DemoclesPatternType.BINDING_AND_BLACK_PATTERN);
		registerPatternFactory(DemoclesPatternType.BLACK_PATTERN);
		registerPatternFactory(DemoclesPatternType.RED_PATTERN);
		registerPatternFactory(DemoclesPatternType.GREEN_PATTERN);
		registerPatternFactory(DemoclesPatternType.BINDING_PATTERN);
		registerPatternFactory(DemoclesPatternType.EXPRESSION_PATTERN);
	}

	private void registerMethodBodyFactory() {
		final ResourceSet resourceSet = getResourceSet();
		final EList<AdapterFactory> adapterFactories = resourceSet.getAdapterFactories();
		final Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap();
		final String extension = DemoclesPatternType.CONTROL_FLOW_FILE_EXTENSION;
		final MethodBodyResourceFactory sdmFactory = new MethodBodyResourceFactory(extension);
		adapterFactories.add(sdmFactory);
		extensionToFactoryMap.put(extension, sdmFactory);
	}

	private void registerPatternFactory(final DemoclesPatternType patternType) {
		final ResourceSet resourceSet = getResourceSet();
		final EList<AdapterFactory> adapterFactories = resourceSet.getAdapterFactories();
		final Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap();
		final String extension = patternType.getSuffix();
		final PatternResourceFactory bindingAndBlackFactory = new PatternResourceFactory(extension);
		adapterFactories.add(bindingAndBlackFactory);
		extensionToFactoryMap.put(extension, bindingAndBlackFactory);
	}

	private IStatus createErrorStatus(final Throwable e) {
		return createErrorStatus(e.getMessage(), e);
	}

	private IStatus createErrorStatus(final String message) {
		return createErrorStatus(message, null);
	}

	private IStatus createErrorStatus(final String message, final Throwable e) {
		return StatusUtil.createErrorStatus(e, getPluginId(), message);
	}

	private String getPluginId() {
		return WorkspaceHelper.getPluginId(getClass());
	}

	private final IStatus generateCode(final Descriptor descriptor, final GenModel genModel, final Monitor monitor) {
		final CodeGenerator codeGenerator = new CodeGenerator(descriptor);
		codeGenerator.setTaskName("eMoflon::TIE-GT Code Genertion");
		return codeGenerator.generateCode(genModel, monitor);
	}

}
