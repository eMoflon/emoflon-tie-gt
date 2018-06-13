package org.moflon.tie.gt.ide.core.runtime.utilities;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.moflon.core.utilities.WorkspaceHelper;

public class TieGTWorkspaceHelper extends WorkspaceHelper {

	public final static String GT_FOLDER = "gt";

	
	public static IFolder getGTFolder(IProject project) {
		return project.getFolder(GT_FOLDER);
	}
	
	

}
