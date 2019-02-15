package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class Attributes {
	private Attributes() {
		throw new UtilityClassNotInstantiableException();
	}

	public static Attribute create(final EAttribute modelElement, final ConstraintVariable objectVariable,
			final ConstraintVariable attributeVariable) {
		final ConstraintParameter fromParameter = ConstraintParameters.create(objectVariable);
		final ConstraintParameter toParameter = ConstraintParameters.create(attributeVariable);

		final Attribute attribute = EMFTypeFactory.eINSTANCE.createAttribute();
		attribute.setEModelElement(modelElement);
		attribute.getParameters().add(fromParameter);
		attribute.getParameters().add(toParameter);
		return attribute;
	}

	/**
	 * Uses {@link #create(EAttribute, EMFVariable, EMFVariable)} to create an
	 * {@link Attribute} constraint that connects the given {@link EMFVariable}
	 * objects and adds the constraint to the given {@link PatternBody} if no such
	 * constraint exists yet.
	 * 
	 * @param attribute         the type of the constraint
	 * @param objectVariable    the variable representing the object
	 * @param attributeVariable the variable representing the attribute value
	 * @param body              the pattern body
	 * @return the created {@link Attribute} it it did not exist, yet. Else the
	 *         existing {@link Attribute} constraint.
	 */
	public static Attribute add(final EAttribute attribute, final ConstraintVariable objectVariable,
			final ConstraintVariable attributeVariable, final PatternBody body) {
		final Attribute attributeConstraint = create(attribute, objectVariable, attributeVariable);

		final Optional<Attribute> existingConstraint = findExisting(attributeConstraint, body);
		if (!existingConstraint.isPresent()) {
			Patterns.addConstraint(attributeConstraint, body);
			return attributeConstraint;
		} else {
			return existingConstraint.get();
		}
	}

	private static Optional<Attribute> findExisting(final Attribute attributeConstraint,
			final PatternBody patternBody) {
		final Optional<Attribute> existingAttributeConstraint = patternBody.getConstraints().stream()
				.filter(constraint -> constraint instanceof Attribute)//
				.map(Attribute.class::cast)
				.filter(candidateConstraint -> areEqual(candidateConstraint, attributeConstraint)).findAny();
		return existingAttributeConstraint;
	}

	private static boolean areEqual(final Attribute constraint1, final Attribute constraint2) {
		final List<ConstraintParameter> parameters1 = constraint1.getParameters();
		final List<ConstraintParameter> parameters2 = constraint2.getParameters();
		final int parameterCount1 = parameters1.size();
		final int parameterCount2 = parameters2.size();
		if (parameterCount1 != 2)
			throw new IllegalArgumentException(
					String.format("Attribute constraint must have two parameters but given are '%s'", parameterCount1));

		if (parameterCount2 != 2)
			throw new IllegalArgumentException(
					String.format("Attribute constraint must have two parameters but given are '%s'", parameterCount2));

		if (!constraint1.getEModelElement().equals(constraint2.getEModelElement()))
			return false;

		for (int i = 0; i < parameterCount1; ++i) {
			final ConstraintParameter parameter1 = parameters1.get(i);
			final ConstraintParameter parameter2 = parameters2.get(i);
			if (!parameter1.getReference().equals(parameter2.getReference())) {
				return false;
			}
		}

		return true;
	}

}
