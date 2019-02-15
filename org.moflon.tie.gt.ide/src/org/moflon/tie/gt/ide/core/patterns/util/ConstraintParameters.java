package org.moflon.tie.gt.ide.core.patterns.util;

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

/**
 * Utility methods related to {@link ConstraintParameter}
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public final class ConstraintParameters {
	private ConstraintParameters() {
		throw new UtilityClassNotInstantiableException();
	}

	public static ConstraintParameter create(final ConstraintVariable variable) {
		final ConstraintParameter constraintParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
		constraintParameter.setReference(variable);
		return constraintParameter;
	}

}
