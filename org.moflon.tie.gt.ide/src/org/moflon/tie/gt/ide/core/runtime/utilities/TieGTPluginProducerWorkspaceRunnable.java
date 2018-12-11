package org.moflon.tie.gt.ide.core.runtime.utilities;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.moflon.core.plugins.PluginProducerWorkspaceRunnable;
import org.moflon.core.plugins.PluginProperties;

public class TieGTPluginProducerWorkspaceRunnable extends PluginProducerWorkspaceRunnable {

	public TieGTPluginProducerWorkspaceRunnable(final IProject project, final PluginProperties projectProperties) {
		super(project, projectProperties);
	}

	@Override
	public void run(final IProgressMonitor monitor) throws CoreException {
		this.configureManifest(monitor);
	}
}
