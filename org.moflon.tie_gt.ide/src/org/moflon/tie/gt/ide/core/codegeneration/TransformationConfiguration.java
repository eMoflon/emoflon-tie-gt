package org.moflon.tie.gt.ide.core.codegeneration;

import org.moflon.tie.gt.ide.core.patterns.TIEGTAdapterTrafo;
import org.moflon.tie.gt.ide.core.runtime.utilities.ContextController;

public class TransformationConfiguration {

	public CodeadapterTrafo getCodeadapterTransformator() {
		// TODO Auto-generated method stub
		return new TIEGTAdapterTrafo();
	}

	public StatementBuilder getStatementCreationController() {
		// TODO Auto-generated method stub
		return null;
	}

	public PatternBuilder getPatternCreationController() {
		// TODO Auto-generated method stub
		return null;
	}

	public ContextController getContextController() {
		// TODO Auto-generated method stub
		return null;
	}

	public ECoreAdapterController getECoreAdapterController() {
		// TODO Auto-generated method stub
		return null;
	}

}
