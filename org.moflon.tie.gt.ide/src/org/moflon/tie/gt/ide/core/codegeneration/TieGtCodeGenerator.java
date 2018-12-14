package org.moflon.tie.gt.ide.core.codegeneration;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.JobGroup;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.eclipse.task.ITask;
import org.moflon.codegen.MethodBodyHandler;
import org.moflon.codegen.eclipse.MoflonCodeGenerator;
import org.moflon.codegen.eclipse.MoflonCodeGeneratorPhase;
import org.moflon.compiler.sdm.democles.DefaultCodeGeneratorConfig;
import org.moflon.compiler.sdm.democles.DemoclesGeneratorAdapterFactory;
import org.moflon.compiler.sdm.democles.TemplateConfigurationProvider;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.propertycontainer.MoflonPropertiesContainer;
import org.moflon.core.propertycontainer.SDMCodeGeneratorIds;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.build.MoflonEmfCodeGenerator;
import org.moflon.emf.build.MonitoredGenModelBuilder;
import org.moflon.emf.codegen.CodeGenerator;
import org.moflon.emf.injection.ide.InjectionManager;

public class MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase extends MoflonEmfCodeGenerator {

	private static final Logger logger = Logger.getLogger(MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase.class);

	protected MoflonCodeGeneratorPhase additionalCodeGenerationPhase;

	public MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase(final IFile ecoreFile, final ResourceSet resourceSet,
			final EMoflonPreferencesStorage preferencesStorage) {
		super(ecoreFile, resourceSet, preferencesStorage);
	}

	@Override
	protected String getFullProjectName(final MoflonPropertiesContainer moflonProperties) {
		return moflonProperties.getProjectName();
	}

	@Override
	public IStatus processResource(final IProgressMonitor monitor) {
		try {
			final int totalWork = 5 + 10 + 10 + 15 + 35 + 30 + 5;
			final SubMonitor subMon = SubMonitor.convert(monitor, "Code generation task for " + getProject().getName(),
					totalWork);
			logger.info("Generating code for: " + getProject().getName());

			final long toc = System.nanoTime();

			// (1) Instantiate code generation engine
			final Resource resource = getEcoreResource();
			getResourceSet().getResources().add(resource);
			final EPackage ePackage = (EPackage) resource.getContents().get(0);
			// TODO@rkluge: Switch to DEMOCLES_ATTRIBUTES
			final String engineID = SDMCodeGeneratorIds.DEMOCLES.getLiteral();
			final MethodBodyHandler methodBodyHandler = (MethodBodyHandler) Platform.getAdapterManager()
					.loadAdapter(this, engineID);
			subMon.worked(5);
			if (methodBodyHandler == null) {
				return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
						"Unknown method body handler: " + engineID + ". Code generation aborted.");
			}
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// TODO@rkluge: Only serves to initialize the template configuration and search
			// plan builders
			// See for instance org.moflon.compiler.sdm.democles.DefaultValidatorConfig
			final ITask validator = methodBodyHandler.createValidator(ePackage);
			final StatusHolder validationStatusHolder = new StatusHolder();
			final WorkspaceJob validationJob = new WorkspaceJob(engineID) {
				@Override
				public IStatus runInWorkspace(final IProgressMonitor monitor) throws CoreException {
					final SubMonitor subMon = SubMonitor.convert(monitor, "Validation job", 100);
					try {
						validationStatusHolder.status = validator.run(subMon.split(100));
					} catch (final Exception e) {
						validationStatusHolder.status = new Status(IStatus.ERROR,
								WorkspaceHelper.getPluginId(MoflonCodeGenerator.class),
								String.format("%s occurred during validation with message %s",
										e.getClass().getSimpleName(), e.getMessage()));
					}
					return validationStatusHolder.status;
				}
			};
			final JobGroup jobGroup = new JobGroup("Validation job group", 1, 1);
			validationJob.setJobGroup(jobGroup);
			validationJob.schedule();
			final int timeoutForValidationTaskInMillis = getPreferencesStorage().getValidationTimeout();
			jobGroup.join(timeoutForValidationTaskInMillis, subMon.split(10));

			if (validationJob.getResult() == null) {
				throw new OperationCanceledException(String.format(
						"Validation took longer than %ds. This could(!) mean that some of your patterns have no valid search plan. You may increase the timeout value using the eMoflon property page",
						(timeoutForValidationTaskInMillis / 1000)));
			}

			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			final IStatus validationStatus = validationStatusHolder.status;
			if (validationStatus.matches(IStatus.ERROR)) {
				return validationStatus;
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

			// (2.1) Perform additional code generation phase
			final IStatus weaverStatus;
			if (this.additionalCodeGenerationPhase != null) {
				if (this.additionalCodeGenerationPhase instanceof TieGTControlFlowBuilder) {
					final TieGTControlFlowBuilder cfBuilder = (TieGTControlFlowBuilder) this.additionalCodeGenerationPhase;
					cfBuilder.setECorePackage(this.getGenModel().getEcoreGenPackage().getEcorePackage());
				}
				weaverStatus = this.additionalCodeGenerationPhase.run(getProject(), getEcoreResource(),
						methodBodyHandler, subMon.split(10));

				if (subMon.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				if (weaverStatus.matches(IStatus.ERROR)) {
					return weaverStatus;
				}
			} else {
				weaverStatus = Status.OK_STATUS;
				subMon.worked(10);
			}

			// Load injections
			final IProject project = getEcoreFile().getProject();
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
			final DefaultCodeGeneratorConfig defaultCodeGeneratorConfig = new DefaultCodeGeneratorConfig(
					getResourceSet(), getPreferencesStorage());
			final TemplateConfigurationProvider templateConfig = defaultCodeGeneratorConfig
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

			logger.info(String.format(Locale.US, "Completed in %.3fs", (tic - toc) / 1e9));

			return injectionStatus.isOK() ? Status.OK_STATUS : injectionStatus;
		} catch (final Exception e) {
			logger.debug(WorkspaceHelper.printStacktraceToString(e));
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), IStatus.ERROR,
					e.getClass().getName() + " occurred during eMoflon code generation. Message: '" + e.getMessage()
							+ "'. (Stacktrace is logged with level debug)",
					e);
		}
	}

	public void setAdditionalCodeGenerationPhase(final MoflonCodeGeneratorPhase codeGenerationPhase) {
		this.additionalCodeGenerationPhase = codeGenerationPhase;
	}

	private static class StatusHolder {
		IStatus status;
	}

}