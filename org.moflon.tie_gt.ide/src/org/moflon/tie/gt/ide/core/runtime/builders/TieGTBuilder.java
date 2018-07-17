package org.moflon.tie.gt.ide.core.runtime.builders;

import com.google.inject.Injector;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IBuildConfiguration;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.compiler.sdm.democles.eclipse.MethodBodyResourceFactory;
import org.moflon.compiler.sdm.democles.eclipse.PatternResourceFactory;
import org.moflon.core.build.AbstractVisitorBuilder;
import org.moflon.core.build.CleanVisitor;
import org.moflon.core.plugins.manifest.ExportedPackagesInManifestUpdater;
import org.moflon.core.plugins.manifest.PluginXmlUpdater;
import org.moflon.core.preferences.EMoflonPreferencesActivator;
import org.moflon.core.utilities.ClasspathUtil;
import org.moflon.core.utilities.ErrorReporter;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.gt.mosl.controlflow.language.ui.internal.LanguageActivator;
import org.moflon.tie.gt.ide.core.codegeneration.MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase;
import org.moflon.tie.gt.ide.core.codegeneration.TieGTControlFlowBuilder;

public class TieGTBuilder extends AbstractVisitorBuilder{
	
	public static String TIE_GT_BUILDER_ID=TieGTBuilder.class.getName();

	public static final Logger logger = Logger.getLogger(TieGTBuilder.class);

	/**
	 * Initializes the visitor condition
	 *
	 * This builder gets triggered whenever any ecore file in /models changes
	 */
	public TieGTBuilder() {
		super(new AntPatternCondition(new String[] { "model/*.ecore" }));
	}

	/**
	 * This builder locks the surrounding project
	 */
	@Override
	public ISchedulingRule getRule(final int kind, final Map<String, String> args) {
		return getProject();
	}

	/**
	 * The cleans generated code and problem markers
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Cleaning " + getProject(), 4);

		deleteProblemMarkers();
		subMon.worked(1);

		removeGeneratedCode(getProject());
		subMon.worked(3);
	}

	/**
	 * Converts the given {@link Status} to problem markers in the Eclipse UI
	 *
	 * @param status
	 *            the status to be converted
	 * @param file
	 *            the file contains problems
	 */
	public void handleErrorsInEclipse(final IStatus status, final IFile file) {
		final String reporterClass = "org.moflon.core.ui.errorhandling.MultiStatusAwareErrorReporter";
		final ErrorReporter eclipseErrorReporter = (ErrorReporter) Platform.getAdapterManager().loadAdapter(file,
				reporterClass);
		if (eclipseErrorReporter != null) {
			eclipseErrorReporter.report(status);
		} else {
			logger.error(String.format("Could not load error reporter '%s' to report status", reporterClass));
		}
	}

	@Override
	protected void processResource(final IResource ecoreResource, final int kind, Map<String, String> args,
			final IProgressMonitor monitor) {
		if (WorkspaceHelper.isEcoreFile(ecoreResource)) {
			final IFile ecoreFile = Platform.getAdapterManager().getAdapter(ecoreResource, IFile.class);
			final MultiStatus emfBuilderStatus = new MultiStatus(WorkspaceHelper.getPluginId(getClass()), 0,
					"Problems during EMF code generation", null);
			try {
				final SubMonitor subMon = SubMonitor.convert(monitor,
						"Generating code for project " + getProject().getName(), 13);

				final IProject project = getProject();
				createFoldersIfNecessary(project, subMon.split(1));
				ClasspathUtil.makeSourceFolderIfNecessary(WorkspaceHelper.getGenFolder(getProject()));
				ClasspathUtil.makeSourceFolderIfNecessary(WorkspaceHelper.getInjectionFolder(getProject()));

				// Compute project dependencies
				final IBuildConfiguration[] referencedBuildConfigs = project
						.getReferencedBuildConfigs(project.getActiveBuildConfig().getName(), false);
				for (final IBuildConfiguration referencedConfig : referencedBuildConfigs) {
					addTriggerProject(referencedConfig.getProject());
				}

				// Remove markers and delete generated code
				deleteProblemMarkers();
				removeGeneratedCode(project);

				// Build
				//final ResourceSet resourceSet = eMoflonEMFUtil.createDefaultResourceSet();
				final ResourceSet resourceSet = TieGTBuilder.initializeResourceSet();
				final PatternResourceFactory blackFactory = new PatternResourceFactory(DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION);
			    resourceSet.getAdapterFactories().add(blackFactory);
			    final MethodBodyResourceFactory cfFactory = new MethodBodyResourceFactory(DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);
			    resourceSet.getAdapterFactories().add(cfFactory);
				eMoflonEMFUtil.installCrossReferencers(resourceSet);
				subMon.worked(1);
				final MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase codeGenerationTask= new MoflonEmfCodeGeneratorWithAdditionalCodeGenPhase(ecoreFile,resourceSet,EMoflonPreferencesActivator.getDefault().getPreferencesStorage());
				TieGTControlFlowBuilder tieGTCodeGenerationPhase = new TieGTControlFlowBuilder();
				codeGenerationTask.setAdditionalCodeGenerationPhase(tieGTCodeGenerationPhase);
				final IStatus status = codeGenerationTask.run(subMon.split(1));
				subMon.worked(3);
				emfBuilderStatus.add(status);

				if (!emfBuilderStatus.isOK())
					return;

				//TODO: fix this when MoflonEmfCodeGenerator is fixed
				final GenModel genModel = codeGenerationTask.getGenModelDummy();
				if (genModel == null) {
					emfBuilderStatus.add(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
							String.format("No GenModel found for '%s'", getProject())));
				} else {
					ExportedPackagesInManifestUpdater.updateExportedPackageInManifest(project, genModel);

					PluginXmlUpdater.updatePluginXml(project, genModel, subMon.split(1));
				}
				ResourcesPlugin.getWorkspace().checkpoint(false);

			} catch (final CoreException e) {
				emfBuilderStatus.add(new Status(e.getStatus().getSeverity(), WorkspaceHelper.getPluginId(getClass()),
						e.getMessage(), e));
			} finally {
				handleErrorsInEclipse(emfBuilderStatus, ecoreFile);
			}
		}
	}

	@Override
	protected final AntPatternCondition getTriggerCondition(final IProject project) {
		return new AntPatternCondition(new String[0]);
	}

	/**
	 * Handles errors and warning produced by the code generation task
	 *
	 * @param status
	 *            the {@link IStatus} that contains the errors and warnings
	 */
	protected void handleErrorsAndWarnings(final IStatus status, final IFile ecoreFile) throws CoreException {
		if (status.matches(IStatus.ERROR)) {
			handleErrorsInEclipse(status, ecoreFile);
		}
		if (status.matches(IStatus.WARNING)) {
			handleInjectionWarningsAndErrors(status);
		}
	}

	/**
	 * Removes all contents in /gen, but preserves all versioning files
	 *
	 * @param project
	 *            the project to be cleaned
	 * @throws CoreException
	 *             if cleaning fails
	 */
	private void removeGeneratedCode(final IProject project) throws CoreException {
		final CleanVisitor cleanVisitor = new CleanVisitor(project, //
				new AntPatternCondition(new String[] { "gen/**" }), //
				new AntPatternCondition(new String[] { "gen/.keep*" }));
		project.accept(cleanVisitor, IResource.DEPTH_INFINITE, IResource.NONE);
	}

	private void handleInjectionWarningsAndErrors(final IStatus status) {
		final String reporterClass = "org.moflon.emf.injection.validation.InjectionErrorReporter";
		final ErrorReporter errorReporter = (ErrorReporter) Platform.getAdapterManager().loadAdapter(getProject(),
				reporterClass);
		if (errorReporter != null) {
			errorReporter.report(status);
		} else {
			logger.debug("Could not load error reporter '" + reporterClass + "'");
		}
	}

	private static void createFoldersIfNecessary(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating folders within project " + project, 5);

		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getSourceFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getBinFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getGenFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getInjectionFolder(project), subMon.split(1));
	}

	
	public static String getId() {
		return TIE_GT_BUILDER_ID;
	}
	
	/**
	    * Prepare an {@link ResourceSet} that is suitable for a MOSL-GT-based build process
	    * 
	    * @return the initialized resource set
	    */
	   public static ResourceSet initializeResourceSet()
	   {
	      final Injector injector = LanguageActivator.getInstance().getInjector(LanguageActivator.ORG_MOFLON_GT_MOSL_CONTROLFLOW_LANGUAGE_MOSLCONTROLFLOW);
	      final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	      eMoflonEMFUtil.installCrossReferencers(resourceSet);
	      return resourceSet;
	   }

}
