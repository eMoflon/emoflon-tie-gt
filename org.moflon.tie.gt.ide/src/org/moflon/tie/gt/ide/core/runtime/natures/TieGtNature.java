package org.moflon.tie.gt.ide.core.runtime.natures;

import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.moflon.tie.gt.ide.core.runtime.builders.TieGtBuilder;

public class TieGtNature extends MoflonProjectConfigurator {

	private static final String TIE_GT_NATURE_ID = TieGtNature.class.getName();

	@Override
	protected String getBuilderId() {
		return TieGtBuilder.getId();
	}

	public static String getId() {
		return TIE_GT_NATURE_ID;
	}

	@Override
	protected String getNatureId() {
		return TIE_GT_NATURE_ID;
	}

}
