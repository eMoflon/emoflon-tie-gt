package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EClassifier;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.controlflow.democles.DemoclesFactory;
import org.moflon.tie.gt.controlflow.democles.Scope;

public final class CFVariables {
	private static final Action NO_CONSTRUCTOR = null;

	private CFVariables() {
		throw new UtilityClassNotInstantiableException();
	}

	public static CFVariable create(final String name, final EClassifier type, final Action constructor,
			final Scope scope) {
		final CFVariable variable = DemoclesFactory.eINSTANCE.createCFVariable();
		variable.setName(name);
		variable.setType(type);
		variable.setLocal(false);
		variable.setConstructor(constructor);
		variable.setScope(scope);
		return variable;
	}

	public static CFVariable createWithoutConstructor(final String name, final EClassifier type, final Scope scope) {
		return create(name, type, NO_CONSTRUCTOR, scope);
	}
}
