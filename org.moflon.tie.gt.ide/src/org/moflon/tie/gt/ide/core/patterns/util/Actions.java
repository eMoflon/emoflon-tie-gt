package org.moflon.tie.gt.ide.core.patterns.util;

import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.DemoclesFactory;

/**
 * Convenience functions for working with {@link Action} objects
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public class Actions {

	private Actions() {
		throw new UtilityClassNotInstantiableException();
	}

	public static void attachEmptyAction(
			final org.moflon.tie.gt.controlflow.democles.ReturnStatement returnStmtDemocles) {
		final Action emptyAction = DemoclesFactory.eINSTANCE.createAction();
		returnStmtDemocles.setMainAction(emptyAction);
		emptyAction.setCfNode(returnStmtDemocles);
	}
}
