package org.moflon.tie.gt.ide.core.codegeneration;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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
import org.moflon.tie.gt.compiler.democles.eclipse.MethodBodyResourceFactory;
import org.moflon.tie.gt.compiler.democles.eclipse.PatternResourceFactory;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintsLibraryRegistry;

public class TieGtCodeGenerator extends MoflonEmfCodeGenerator {

	private static final Logger logger = Logger.getLogger(TieGtCodeGenerator.class);

	public TieGtCodeGenerator(final IFile ecoreFile, final ResourceSet resourceSet,
			final EMoflonPreferencesStorage preferencesStorage) {
		super(ecoreFile, resourceSet, preferencesStorage);
	}

	@Override
	public IStatus processResource(final IProgressMonitor monitor) {
		try {
			final int totalWork = 5 + 10 + 10 + 15 + 35 + 30 + 5;
			final SubMonitor subMon = SubMonitor.convert(monitor, "Code generation task for " + getProject().getName(),
					totalWork);
			LogUtils.info(logger, "Generating code for: %s", getProject().getName());

			final long toc = System.nanoTime();

			final Resource resource = getEcoreResource();
			getResourceSet().getResources().add(resource);

			final IStatus mcfLoadStatus = this.loadControlFlowFiles();

			if (mcfLoadStatus.matches(IStatus.ERROR))
				return mcfLoadStatus;
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;

			final IStatus resourceErrorStatus = checkResourceErrorFlags();
			if (resourceErrorStatus.matches(IStatus.ERROR))
				return resourceErrorStatus;
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;

			final AttributeConstraintsLibraryRegistry attributeConstraintLibraries = loadAttributeConstraintLibraries();

			final IProject project = getEcoreFile().getProject();
			final TieGtCodeGenerationConfiguration codeGeneratorConfig = new TieGtCodeGenerationConfiguration(
					getResourceSet(), getPreferencesStorage(), attributeConstraintLibraries);
			inititializeResourceSet();
			subMon.worked(5);
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// Build or load GenModel
			final MonitoredGenModelBuilder genModelBuilderJob = new MonitoredGenModelBuilder(getResourceSet(),
					getAllResources(), getEcoreFile(), true, getMoflonProperties());
			final IStatus genModelBuilderStatus = genModelBuilderJob.run(subMon.split(15));
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			if (genModelBuilderStatus.matches(IStatus.ERROR)) {
				return genModelBuilderStatus;
			}
			this.setGenModel(genModelBuilderJob.getGenModel());

			final TieGtControlFlowBuilder controlFlowBuilder = new TieGtControlFlowBuilder(getPreferencesStorage());
			this.getGenModel().findGenPackage(EcorePackage.eINSTANCE);
			controlFlowBuilder.setECorePackage(this.getGenModel().getEcoreGenPackage().getEcorePackage());
			final IStatus controlFlowBuilderStatus = controlFlowBuilder.run(getProject(), getEcoreResource(),
					codeGeneratorConfig.getSearchPlanGenerators(), subMon.split(10));

			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			if (controlFlowBuilderStatus.matches(IStatus.ERROR)) {
				return controlFlowBuilderStatus;
			}

			// Load injections
			final InjectionManager injectionManager = createInjectionManager(project);
			this.setInjectorManager(injectionManager);
			final IStatus injectionStatus = createInjections(project);
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			if (injectionStatus.matches(IStatus.ERROR)) {
				return injectionStatus;
			}

			// Generate code
			subMon.subTask("Generating code for project " + project.getName());
			final TemplateConfigurationProvider templateConfig = codeGeneratorConfig
					.createTemplateConfiguration(this.getGenModel());
			final Descriptor codeGenerationEngine = new DemoclesGeneratorAdapterFactory(templateConfig,
					this.getInjectorManager());
			final CodeGenerator codeGenerator = new CodeGenerator(codeGenerationEngine);
			final IStatus codeGenerationStatus = codeGenerator.generateCode(getGenModel(),
					new BasicMonitor.EclipseSubProgress(subMon, 30));
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			if (codeGenerationStatus.matches(IStatus.ERROR)) {
				return codeGenerationStatus;
			}
			subMon.worked(5);

			final long tic = System.nanoTime();

			logger.info(String.format(Locale.US, "Code generation completed in %.3fs", (tic - toc) / 1e9));

			return injectionStatus.isOK() ? Status.OK_STATUS : injectionStatus;
		} catch (final Exception e) {
			logger.debug(WorkspaceHelper.printStacktraceToString(e));
			final String message = e.getClass().getName() + " occurred during eMoflon code generation. Message: '"
					+ e.getMessage() + "'. (Stacktrace is logged with level debug)";
			return createErrorStatus(message, e);
		}
	}

	/**
	 * Checks whether any {@link Resource} in {@link #getResourceSet()} contains
	 * errors and returns a corresponding {@link IStatus}
	 * 
	 * @return the resulting status
	 */
	private IStatus checkResourceErrorFlags() {
		final List<Resource> resourcesWithErrors = getResourceSet().getResources().stream()
				.filter(r -> !r.getErrors().isEmpty()).collect(Collectors.toList());
		if (!resourcesWithErrors.isEmpty()) {
			final List<URI> uriList = resourcesWithErrors.stream().map(resource -> resource.getURI())
					.collect(Collectors.toList());
			final String message = String.format(
					"eMoflon::TIE-GT skipped project %s due to errors in the resources with the following URIs: %s",
					getProject().getName(), uriList);
			return createErrorStatus(message);
		} else {
			return Status.OK_STATUS;
		}
	}

	/**
	 * Loads all attribute constraint libraries from the {@link EditorGTFile}
	 * objects in the resource set ({@link #getResourceSet()}
	 * 
	 * @return
	 */
	private AttributeConstraintsLibraryRegistry loadAttributeConstraintLibraries() {
		final AttributeConstraintsLibraryLoader attributeConstraintsLibraryLoader = new AttributeConstraintsLibraryLoader();
		final AttributeConstraintsLibraryRegistry attributeConstraintLibraries = attributeConstraintsLibraryLoader
				.run(this.getResourceSet());
		return attributeConstraintLibraries;
	}

	/**
	 * This routine identifies and loads all mcf files in the current project.
	 *
	 * For each mcf file, an appropriate resource is created in this generator's
	 * resource set ({@link #getResourceSet()}
	 */
	private IStatus loadControlFlowFiles() {
		try {
			getProject().accept(new GtResourceLoadingVisitor(this.getResourceSet()));
			getProject().accept(new McfResourceLoadingVisitor(this.getResourceSet()));

			return Status.OK_STATUS;
		} catch (final CoreException e) {
			return createErrorStatus(e);
		}
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

	private Status createErrorStatus(final Throwable e) {
		return createErrorStatus(e.getMessage(), e);
	}

	private Status createErrorStatus(final String message) {
		return createErrorStatus(message, null);
	}

	private Status createErrorStatus(final String message, final Throwable e) {
		return new Status(IStatus.ERROR, getPluginId(), IStatus.ERROR, message, e);
	}

	private String getPluginId() {
		return WorkspaceHelper.getPluginId(getClass());
	}
}
