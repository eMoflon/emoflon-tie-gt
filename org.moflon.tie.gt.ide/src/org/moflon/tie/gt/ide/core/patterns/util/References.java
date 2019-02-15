package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EReference;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class References {
	private References() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Creates a {@link Reference} constraint and adds it to the given
	 * {@link PatternBody}
	 * @param source          the source variable of the reference
	 * @param target            the target variable of the reference
	 * @param referenceType the type of the {@link EReference}
	 * @param body   the body
	 * 
	 * @return the constraint
	 */
	public static Reference add(final ConstraintParameter source, final ConstraintParameter target, final EReference referenceType,
			final PatternBody body) {
		final Reference referenceConstraint = EMFTypeFactory.eINSTANCE.createReference();
		referenceConstraint.setEModelElement(referenceType);
		referenceConstraint.getParameters().add(source);
		referenceConstraint.getParameters().add(target);
		body.getConstraints().add(referenceConstraint);
		return referenceConstraint;
	}
}
