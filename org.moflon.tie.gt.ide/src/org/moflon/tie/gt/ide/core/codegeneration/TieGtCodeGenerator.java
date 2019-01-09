package org.moflon.tie.gt.ide.core.codegeneration;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;

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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.compiler.sdm.democles.DemoclesGeneratorAdapterFactory;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.compiler.sdm.democles.TemplateConfigurationProvider;
import org.moflon.compiler.sdm.democles.attributes.AttributeConstraintCodeGeneratorConfig;
import org.moflon.compiler.sdm.democles.eclipse.MethodBodyResourceFactory;
import org.moflon.compiler.sdm.democles.eclipse.PatternResourceFactory;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.build.MoflonEmfCodeGenerator;
import org.moflon.emf.build.MonitoredGenModelBuilder;
import org.moflon.emf.codegen.CodeGenerator;
import org.moflon.emf.injection.ide.InjectionManager;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;

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

			// Instantiate code generation engine
			final Resource resource = getEcoreResource();
			getResourceSet().getResources().add(resource);

			final IStatus mcfLoadStatus = this.loadControlFlowFiles();

			if (mcfLoadStatus.matches(IStatus.ERROR))
				return mcfLoadStatus;
			if (monitor.isCanceled())
				return Status.OK_STATUS;

			final AttributeConstraintsLibraryLoader attributeConstraintsLibraryLoader = new AttributeConstraintsLibraryLoader();
			final Collection<AttributeConstraintLibrary> attributeConstraintLibraries = attributeConstraintsLibraryLoader
					.run(this.getResourceSet());

			final IProject project = getEcoreFile().getProject();
			final AttributeConstraintCodeGeneratorConfig codeGeneratorConfig = new AttributeConstraintCodeGeneratorConfig(
					getResourceSet(), project, getPreferencesStorage(), attributeConstraintLibraries);
			inititializeResourceSet(getResourceSet());
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
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), IStatus.ERROR,
					e.getClass().getName() + " occurred during eMoflon code generation. Message: '" + e.getMessage()
							+ "'. (Stacktrace is logged with level debug)",
					e);
		}
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
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), e.getMessage(), e);
		}
	}

	private void inititializeResourceSet(final ResourceSet resourceSet) {
		final EList<AdapterFactory> adapterFactories = resourceSet.getAdapterFactories();
		final Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap();

		createAndRegisterMethodBodyFactory(adapterFactories, extensionToFactoryMap,
				DemoclesPatternType.CONTROL_FLOW_FILE_EXTENSION);

		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap,
				DemoclesPatternType.BINDING_AND_BLACK_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap,
				DemoclesPatternType.BLACK_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap,
				DemoclesPatternType.RED_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap,
				DemoclesPatternType.GREEN_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap,
				DemoclesPatternType.BINDING_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap,
				DemoclesPatternType.EXPRESSION_FILE_EXTENSION);
	}

	private static void createAndRegisterMethodBodyFactory(final EList<AdapterFactory> adapterFactories,
			final Map<String, Object> extensionToFactoryMap, final String extension) {
		final MethodBodyResourceFactory sdmFactory = new MethodBodyResourceFactory(extension);
		adapterFactories.add(sdmFactory);
		extensionToFactoryMap.put(extension, sdmFactory);
	}

	private static void createAndRegisterPatternFactory(final EList<AdapterFactory> adapterFactories,
			final Map<String, Object> extensionToFactoryMap, final String extension) {
		final PatternResourceFactory bindingAndBlackFactory = new PatternResourceFactory(extension);
		adapterFactories.add(bindingAndBlackFactory);
		extensionToFactoryMap.put(extension, bindingAndBlackFactory);
	}
}
