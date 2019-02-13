package org.moflon.tie.gt.ide.core.patterns.util;

import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.controlflow.democles.CompoundNode;
import org.moflon.tie.gt.controlflow.democles.Scope;

/**
 * Utility methods for working with {@link Scope} objects
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public final class Scopes {

	private Scopes() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Returns the scope that contains the parent of the given scope (if exists)
	 * 
	 * @param scope the current scope
	 * @return the next higher scope or <code>null</code> if no parent scope exists
	 */
	public static Scope getParent(final Scope scope) {
		final CompoundNode scopeContainer = scope.getParent();
		if (scopeContainer != null) {
			return scopeContainer.getScope();
		}
		return null;
	}
}
