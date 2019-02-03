package org.moflon.tie.gt.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IWorkingSet;
import org.moflon.core.build.MoflonProjectCreator;
import org.moflon.core.plugins.PluginProducerWorkspaceRunnable;
import org.moflon.core.plugins.PluginProperties;
import org.moflon.core.ui.AbstractMoflonProjectInfoPage;
import org.moflon.core.ui.AbstractMoflonWizard;
import org.moflon.core.ui.WorkingSetUtilities;
import org.moflon.core.utilities.MoflonConventions;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.codegen.MoflonGenModelBuilder;
import org.moflon.emf.ui.wizard.DefaultContentGenerator;
import org.moflon.tie.gt.ide.core.codegeneration.StatusUtil;
import org.moflon.tie.gt.ide.core.runtime.natures.TieGtNature;

public class TieGtProjectWizard extends AbstractMoflonWizard {

	/**
	 * This is the ID that is also used in plugin.xml
	 */
	public static final String WIZARD_ID = "org.moflon.tie.gt.ui.wizard.TieGtProjectWizard";

	protected AbstractMoflonProjectInfoPage projectInfo;

	/**
	 * Configures this wizard to use the {@link NewMoflonTieGtProjectInfoPage}
	 */
	@Override
	public void addPages() {
		projectInfo = new NewMoflonTieGtProjectInfoPage();
		addPage(projectInfo);
	}

	@Override
	protected void doFinish(final IProgressMonitor monitor) throws CoreException {
		try {
			final SubMonitor subMon = SubMonitor.convert(monitor, "Creating eMoflon::TIE project", 8);

			final String projectName = projectInfo.getProjectName();

			final IProject project = WorkspaceHelper.getProjectByName(projectName);
			final PluginProperties pluginProperties = initializePluginProperties(projectName);
			createProject(subMon, project, pluginProperties);
			subMon.worked(3);

			generateDefaultFiles(subMon, project);
			subMon.worked(3);

			ResourcesPlugin.getWorkspace().run(new PluginProducerWorkspaceRunnable(project, pluginProperties),
					subMon.split(1));
			subMon.worked(2);

			addToWorkingSet(project);

		} catch (final Exception e) {
			throw new CoreException(StatusUtil.createErrorStatus(e, getPluginId()));
		}
	}

	private String getPluginId() {
		return WorkspaceHelper.getPluginId(getClass());
	}

	/**
	 * Create the properties for the project with the given name
	 * 
	 * @param projectName the project name
	 * @return the initialized properties
	 */
	public PluginProperties initializePluginProperties(final String projectName) {
		final PluginProperties pluginProperties = new PluginProperties();
		pluginProperties.put(PluginProperties.NAME_KEY, projectName);
		pluginProperties.put(PluginProperties.PLUGIN_ID_KEY, projectName);
		return pluginProperties;
	}

	/**
	 * Initializes and runs the {@link MoflonProjectCreator} for the current project
	 *
	 * @param monitor          the progress monitor
	 * @param project          the project being created
	 * @param pluginProperties the metadata of the project
	 * @throws CoreException if setting up the project fails
	 */
	protected void createProject(final IProgressMonitor monitor, final IProject project,
			final PluginProperties pluginProperties) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating project", 1);
		final TieGTProjectCreator createMoflonProject = new TieGTProjectCreator(project, pluginProperties,
				new TieGtNature());
		ResourcesPlugin.getWorkspace().run(createMoflonProject, subMon.split(1));
	}

	/**
	 * Stores the default Ecore file in the proper location
	 *
	 * @param monitor the progress monitor
	 * @param project the project being created currently
	 * @throws CoreException if storing the file fails
	 */
	protected void generateDefaultFiles(final IProgressMonitor monitor, final IProject project) throws CoreException {

		if (projectInfo.generateDefaultEmfaticFile())
			generateDefaultFilesForEmfatic(monitor, project);
		else
			generateDefaultFilesForEcore(monitor, project);
	}

	public void generateDefaultFilesForEcore(final IProgressMonitor monitor, final IProject project)
			throws CoreException {
		{
			final SubMonitor subMon = SubMonitor.convert(monitor, "Creating default files", 1);
			final String projectName = project.getName();
			final String packageName = MoflonUtil.lastSegmentOf(projectName);
			final URI projectUri = MoflonGenModelBuilder.determineProjectUriBasedOnPreferences(project);
			final URI packageUri = URI.createURI(
					projectUri.toString() + MoflonConventions.getDefaultPathToEcoreFileInProject(projectName));
			final String defaultEcoreFile = DefaultContentGenerator.generateDefaultEPackageForProject(projectName,
					packageName, packageUri.toString());
			WorkspaceHelper.addFile(project, MoflonConventions.getDefaultPathToEcoreFileInProject(projectName),
					defaultEcoreFile, subMon.split(1));
		}
	}

	public void generateDefaultFilesForEmfatic(final IProgressMonitor monitor, final IProject project)
			throws CoreException {
		{
			final SubMonitor subMon = SubMonitor.convert(monitor, "Creating default files", 1);
			final String projectName = project.getName();
			final String packageName = MoflonUtil.lastSegmentOf(projectName);
			final URI projectUri = MoflonGenModelBuilder.determineProjectUriBasedOnPreferences(project);
			final URI packageUri = URI.createURI(
					projectUri.toString() + MoflonConventions.getDefaultPathToEcoreFileInProject(projectName));
			final String defaultEmfaticFile = DefaultContentGenerator.generateDefaultEmfaticFileForProject(projectName,
					packageName, packageUri.toString());
			WorkspaceHelper.addFile(project, MoflonConventions.getDefaultPathToFileInProject(projectName, ".emf"),
					defaultEmfaticFile, subMon.split(1));
		}
	}

	/**
	 * Adds the given project to the selected working set (if exists)
	 *
	 * @param project the project being created
	 */
	private void addToWorkingSet(final IProject project) {
		final IWorkingSet[] recentWorkingSet = WorkingSetUtilities.getSelectedWorkingSet(getSelection(),
				getActivePart());
		if (recentWorkingSet.length != 0) {
			WorkingSetUtilities.addProjectToWorkingSet(project, recentWorkingSet[0]);
		}
	}

}
