package org.moflon.tie.gt.ide.core.runtime.natures;

import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.moflon.tie.gt.ide.core.runtime.builders.TieGTBuilder;

public class TieGTNature extends MoflonProjectConfigurator {

	public static final String TIE_GT_NATURE_ID = TieGTNature.class.getName();

	@Override
	protected String getBuilderId() {
		return TieGTBuilder.getId();
	}

	public static String getId() {
		return TIE_GT_NATURE_ID;
	}

	@Override
	protected String getNatureId() {
		return TIE_GT_NATURE_ID;
	}

}
