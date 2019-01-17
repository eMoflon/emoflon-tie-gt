package org.moflon.tie.gt.ui.wizard;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.moflon.core.build.MoflonProjectCreator;
import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.moflon.core.plugins.PluginProperties;
import org.moflon.tie.gt.ide.core.runtime.builders.TieGtBuilder;
import org.moflon.tie.gt.ide.core.runtime.natures.TieGtNature;

public class TieGTProjectCreator extends MoflonProjectCreator {
	private static final List<String> GITIGNORE_LINES = Arrays.asList(//
			"/bin", //
			"/gen", //
			"/model/*.genmodel");

	/**
	 * Pass-through constructor to {@link MoflonProjectCreator}
	 * 
	 * @param project             the project to create
	 * @param projectProperties   the metadata to use
	 * @param projectConfigurator the project configurator
	 */
	public TieGTProjectCreator(final IProject project, final PluginProperties projectProperties,
			final MoflonProjectConfigurator projectConfigurator) throws CoreException {
		super(project, projectProperties, projectConfigurator);
	}

	@Override
	protected List<String> getGitignoreLines() {
		return GITIGNORE_LINES;
	}

	@Override
	protected String getNatureId() throws CoreException {
		return TieGtNature.getId();
	}

	@Override
	protected String getBuilderId() throws CoreException {
		return TieGtBuilder.getId();
	}
}
