package org.moflon.tie.gt.mosl.controlflow.language.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.moflon.core.utilities.WorkspaceHelper;

public class TieGTWorkspaceSearch {
	private static String TIE_GT_PROJECT_NATURE_ID ="org.moflon.tie.gt.ide.core.runtime.natures.TieGtNature";
	/**
	 * Returns a list of URIs to .ecore files of eMoflon EMF Projects in the
	 * workspace.
	 * 
	 * @param excludeURIs
	 *            the URIs to exclude from the list
	 * @return the URIs to ecore files
	 */
	public static List<String> getEcoreURIsInWorkspace(final List<String> excludeURIs) {
		ArrayList<String> uris = new ArrayList<String>();
		Arrays.stream(ResourcesPlugin.getWorkspace().getRoot().getProjects()) //
				.filter(project -> WorkspaceHelper.hasNature(project,TIE_GT_PROJECT_NATURE_ID)) //
				.forEach(project -> uris.addAll(TieGTWorkspaceSearch.getEcoreURIsInProject(project)));
		if (excludeURIs != null) {
			uris.removeAll(excludeURIs);
		}
		return uris;
	}

	/**
	 * Returns a list of URIs to .ecore files in the model folder of the give
	 * project.
	 * 
	 * @param project
	 *            the project
	 * @return the URIs to ecore files
	 */
	private static List<String> getEcoreURIsInProject(final IProject project) {
		ArrayList<String> uris = new ArrayList<String>();
		IFolder modelFolder = WorkspaceHelper.getModelFolder(project);
		if (modelFolder.exists()) {
			try {
				IResource[] members = modelFolder.members();
				Arrays.stream(members).filter(m -> WorkspaceHelper.isEcoreFile(m)).forEach(m -> {
					URI uri = URI.createPlatformResourceURI(m.getFullPath().toString(), true);
					uris.add(uri.toString());
				});
			} catch (CoreException e) {
				// Do nothing.
			}
		}
		return uris;
	}
}
