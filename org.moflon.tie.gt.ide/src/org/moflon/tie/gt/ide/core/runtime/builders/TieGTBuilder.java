package org.moflon.tie.gt.ide.core.runtime.builders;

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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.gervarro.eclipse.workspace.util.RelevantElementCollector;
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.compiler.sdm.democles.eclipse.MethodBodyResourceFactory;
import org.moflon.compiler.sdm.democles.eclipse.PatternResourceFactory;
import org.moflon.core.build.AbstractVisitorBuilder;
import org.moflon.core.build.CleanVisitor;
import org.moflon.core.plugins.manifest.ExportedPackagesInManifestUpdater;
import org.moflon.core.plugins.manifest.PluginXmlUpdater;
import org.moflon.core.preferences.EMoflonPreferencesActivator;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.ClasspathUtil;
import org.moflon.core.utilities.ErrorReporter;
import org.moflon.core.utilities.MoflonConventions;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tie.gt.ide.core.codegeneration.TieGtCodeGenerator;
import org.moflon.tie.gt.mosl.controlflow.language.ui.internal.LanguageActivator;

import com.google.inject.Injector;

public class TieGTBuilder extends AbstractVisitorBuilder {

	private static final AntPatternCondition VISITOR_CONDITION = new AntPatternCondition(
			new String[] { "model/*.ecore", "src/*.gt", "src/**/*.gt", "src/*.mcf", "src/**/*.mcf" });

	private static String BUILDER_ID = TieGTBuilder.class.getName();

	private static final Logger logger = Logger.getLogger(TieGTBuilder.class);

	/**
	 * Initializes the visitor condition
	 *
	 * This builder gets triggered whenever any ecore file in /models changes
	 */
	public TieGTBuilder() {
		super(VISITOR_CONDITION);
	}

	public static String getId() {
		return BUILDER_ID;
	}

	/**
	 * This builder locks the surrounding project
	 */
	@Override
	public ISchedulingRule getRule(final int kind, final Map<String, String> args) {
		return getProject();
	}

	@Override
	protected void postprocess(final RelevantElementCollector buildVisitor, final int originalKind,
			final Map<String, String> builderArguments, final IProgressMonitor monitor) {
		final RelevantElementCollector filteredBuildVisitor = new SingleResourceRelevantElementCollector(buildVisitor,
				VISITOR_CONDITION, getProject());
		super.postprocess(filteredBuildVisitor, originalKind, builderArguments, monitor);
	}

	/**
	 * The cleans generated code and problem markers
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Cleaning " + getProject(), 7);

		deleteProblemMarkers();
		subMon.worked(1);

		removeGeneratedCode(getProject());
		subMon.worked(3);

		removeGeneratedModels(getProject());
		subMon.worked(3);
	}

	@Override
	protected void processResource(final IResource ecoreResource, final int kind, final Map<String, String> args,
			final IProgressMonitor monitor) {
		final IFile ecoreFile = getProject()
				.getFile(MoflonConventions.getDefaultPathToEcoreFileInProject(getProject().getName()));
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

			clean(new NullProgressMonitor());

			// Build
			final ResourceSet resourceSet = TieGTBuilder.initializeResourceSet();
			final PatternResourceFactory blackFactory = new PatternResourceFactory(
					DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION);
			resourceSet.getAdapterFactories().add(blackFactory);
			final PatternResourceFactory redFactory = new PatternResourceFactory(
					DemoclesMethodBodyHandler.RED_FILE_EXTENSION);
			resourceSet.getAdapterFactories().add(redFactory);
			final PatternResourceFactory greenFactory = new PatternResourceFactory(
					DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION);
			resourceSet.getAdapterFactories().add(greenFactory);
			final MethodBodyResourceFactory cfFactory = new MethodBodyResourceFactory(
					DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);
			resourceSet.getAdapterFactories().add(cfFactory);
			eMoflonEMFUtil.installCrossReferencers(resourceSet);
			subMon.worked(1);

			final EMoflonPreferencesStorage preferencesStorage = EMoflonPreferencesActivator.getDefault()
					.getPreferencesStorage();
			final TieGtCodeGenerator codeGenerationTask = new TieGtCodeGenerator(ecoreFile, resourceSet,
					preferencesStorage);
			final IStatus status = codeGenerationTask.run(subMon.split(4));
			emfBuilderStatus.add(status);

			if (!emfBuilderStatus.isOK())
				return;

			final GenModel genModel = codeGenerationTask.getGenModel();
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

	@Override
	protected AntPatternCondition getTriggerCondition(final IProject project) {
		return new AntPatternCondition(new String[0]);
	}

	/**
	 * Prepare an {@link ResourceSet} that is suitable for a MOSL-GT-based build
	 * process
	 *
	 * @return the initialized resource set
	 */
	private static ResourceSet initializeResourceSet() {
		final Injector injector = LanguageActivator.getInstance()
				.getInjector(LanguageActivator.ORG_MOFLON_TIE_GT_MOSL_CONTROLFLOW_LANGUAGE_MOSLCONTROLFLOW);
		final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		eMoflonEMFUtil.installCrossReferencers(resourceSet);
		return resourceSet;
	}

	private static void createFoldersIfNecessary(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating folders within project " + project, 5);

		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getSourceFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getBinFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getGenFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getInjectionFolder(project), subMon.split(1));
	}

	private void removeGeneratedModels(final IProject project) throws CoreException {
		final CleanVisitor cleanVisitor = new CleanVisitor(project, //
				new AntPatternCondition(new String[] { "model/generated/**" }));
		project.accept(cleanVisitor, IResource.DEPTH_INFINITE, IResource.NONE);
	}

	/**
	 * Removes all contents in /gen, but preserves all versioning files
	 *
	 * @param project the project to be cleaned
	 * @throws CoreException if cleaning fails
	 */
	private void removeGeneratedCode(final IProject project) throws CoreException {
		final CleanVisitor cleanVisitor = new CleanVisitor(project, //
				new AntPatternCondition(new String[] { "gen/**" }), //
				new AntPatternCondition(new String[] { "gen/.keep*" }));
		project.accept(cleanVisitor, IResource.DEPTH_INFINITE, IResource.NONE);
	}

	/**
	 * Converts the given {@link Status} to problem markers in the Eclipse UI
	 *
	 * @param status the status to be converted
	 * @param file   the file contains problems
	 */
	private void handleErrorsInEclipse(final IStatus status, final IFile file) {
		final String reporterClass = "org.moflon.core.ui.errorhandling.MultiStatusAwareErrorReporter";
		final ErrorReporter eclipseErrorReporter = (ErrorReporter) Platform.getAdapterManager().loadAdapter(file,
				reporterClass);
		if (eclipseErrorReporter != null) {
			eclipseErrorReporter.report(status);
		} else {
			logger.error(String.format("Could not load error reporter '%s' to report status", reporterClass));
		}
	}

}
