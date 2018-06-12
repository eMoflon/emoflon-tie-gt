package org.moflon.tie_gt.ide.core.runtime.natures;

import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.moflon.tie_gt.ide.core.runtime.builders.TieGTBuilder;

public class TieGTNature extends MoflonProjectConfigurator{

	public static final String NATURE_ID=TieGTNature.class.toString();
	@Override
	protected String getBuilderId() {
		return TieGTBuilder.BUILDER_ID;
	}

	@Override
	protected String getNatureId() {
		return NATURE_ID;
	}

}
