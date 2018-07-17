package org.moflon.tie.gt.ide.core.codegeneration;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.codegen.eclipse.MoflonCodeGeneratorPhase;
import org.moflon.compiler.sdm.democles.eclipse.DemoclesAdapterFactory;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.propertycontainer.MoflonPropertiesContainer;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.build.MoflonEmfCodeGenerator;
import org.moflon.emf.build.MonitoredGenModelBuilder;
import org.moflon.emf.codegen.CodeGenerator;
import org.moflon.emf.codegen.InjectionAwareGeneratorAdapterFactory;
import org.moflon.emf.injection.build.CodeInjectorImpl;
import org.moflon.emf.injection.build.XTextInjectionExtractor;
import org.moflon.emf.injection.ide.CodeInjector;
import org.moflon.emf.injection.ide.InjectionExtractor;
import org.moflon.emf.injection.ide.InjectionManager;
import org.moflon.sdm.runtime.democles.DemoclesFactory;

public class MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase extends MoflonEmfCodeGenerator{
	
	private static final Logger logger = Logger.getLogger(MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase.class);
	
	//TODO: this should be only a protected field in MoflonEmfCodeGenerator
	private GenModel genModel;
	//TODO: this should be only a protected field in MoflonEmfCodeGenerator
	private InjectionManager injectionManager;
	
	protected MoflonCodeGeneratorPhase additionalCodeGenerationPhase;

	public MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase(IFile ecoreFile, ResourceSet resourceSet,
			EMoflonPreferencesStorage preferencesStorage) {
		super(ecoreFile, resourceSet, preferencesStorage);
	}
	
	@Override
	protected String getFullProjectName(MoflonPropertiesContainer moflonProperties) {
		return moflonProperties.getProjectName();
	}
	
	@Override
	public IStatus processResource(final IProgressMonitor monitor) {
		try {
			final int totalWork = 5 + 10 + 10 + 15 + 35 + 30 + 5;
			final SubMonitor subMon = SubMonitor.convert(monitor, "Code generation task for " + getProject().getName(),
					totalWork);
			logger.info("Generating code for: " + getProject().getName());

			long toc = System.nanoTime();

			
			// (2.1) Perform additional code generation phase
			final IStatus weaverStatus;
			if (this.additionalCodeGenerationPhase != null) {
				weaverStatus = this.additionalCodeGenerationPhase.run(getProject(), getEcoreResource(), null,subMon.split(10));

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
			this.genModel = genModelBuilderJob.getGenModel();

			// Load injections
			final IProject project = getEcoreFile().getProject();

			final IStatus injectionStatus = createInjections(project, genModel);
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			if (injectionStatus.matches(IStatus.ERROR)) {
				return injectionStatus;
			}

			// Generate code
			subMon.subTask("Generating code for project " + project.getName());
			final Descriptor codeGenerationEngine = new InjectionAwareGeneratorAdapterFactory(injectionManager);
			final CodeGenerator codeGenerator = new CodeGenerator(codeGenerationEngine);
			final IStatus codeGenerationStatus = codeGenerator.generateCode(genModel,
					new BasicMonitor.EclipseSubProgress(subMon, 30));
			if (subMon.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			if (codeGenerationStatus.matches(IStatus.ERROR)) {
				return codeGenerationStatus;
			}
			subMon.worked(5);

			long tic = System.nanoTime();

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
	
	
	//TODO: this should just be a protected method in MoflonEmfCodeGenerator
	/**
	 * Loads the injections from the /injection folder
	 */
	private IStatus createInjections(final IProject project, final GenModel genModel) throws CoreException {
		final IFolder injectionFolder = WorkspaceHelper.addFolder(project, WorkspaceHelper.INJECTION_FOLDER,
				new NullProgressMonitor());
		final CodeInjector injector = new CodeInjectorImpl(project.getLocation().toOSString());

		final InjectionExtractor injectionExtractor = new XTextInjectionExtractor(injectionFolder, genModel);

		injectionManager = new InjectionManager(injectionExtractor, injector);
		final IStatus extractionStatus = injectionManager.extractInjections();
		return extractionStatus;
	}
	
	//TODO: this method should not be final in MoflonEmfCodeGenerator / if field is protected getter is sufficient
	public GenModel getGenModelDummy() {
		return genModel;
	}

	//TODO: should not need to be overridden as soon as injection manager is only a protected field in MoflonEmfCodeGenerator
	public InjectionManager getInjectionManager() {
		return injectionManager;
	}
	
	public void setAdditionalCodeGenerationPhase(final MoflonCodeGeneratorPhase codeGenerationPhase) {
		this.additionalCodeGenerationPhase = codeGenerationPhase;
	}
}
