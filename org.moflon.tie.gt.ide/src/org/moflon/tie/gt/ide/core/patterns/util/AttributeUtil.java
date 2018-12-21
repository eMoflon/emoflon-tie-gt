package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class AttributeUtil {
	private AttributeUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static Attribute createAttribute(final EAttribute modelElement, final ConstraintParameter fromParameter,
			final ConstraintParameter toParameter) {
		final Attribute attribute = EMFTypeFactory.eINSTANCE.createAttribute();
		attribute.setEModelElement(modelElement);
		attribute.getParameters().add(fromParameter);
		attribute.getParameters().add(toParameter);
		return attribute;
	}

	public static Attribute createAttribute(final EAttribute modelElement, final EMFVariable fromVariable,
			final EMFVariable toVariable) {
		final ConstraintParameter fromParameter = PatternUtil.createConstraintParameter(fromVariable);
		final ConstraintParameter toParameter = PatternUtil.createConstraintParameter(toVariable);
		return createAttribute(modelElement, fromParameter, toParameter);
	}

	public static boolean areEqual(final Attribute attributeReferenceConstraint1,
			final Attribute attributeReferenceConstraint2) {
		final List<ConstraintParameter> parameters1 = attributeReferenceConstraint1.getParameters();
		final List<ConstraintParameter> parameters2 = attributeReferenceConstraint2.getParameters();
		final int parameterCount1 = parameters1.size();
		final int parameterCount2 = parameters2.size();
		if (parameterCount1 != 2)
			throw new IllegalArgumentException(
					String.format("Attribute constraint must have two parameters but given are '%s'", parameterCount1));

		if (parameterCount2 != 2)
			throw new IllegalArgumentException(
					String.format("Attribute constraint must have two parameters but given are '%s'", parameterCount2));

		if (!attributeReferenceConstraint1.getEModelElement().equals(attributeReferenceConstraint2.getEModelElement()))
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

	public static Optional<Attribute> findAttributeConstraintInPatternBody(final Attribute attributeReference,
			final PatternBody patternBody) {
		final Optional<Attribute> existingAttributeConstraint = patternBody.getConstraints().stream()
				.filter(constraint -> constraint instanceof Attribute).map(Attribute.class::cast)
				.filter(attribute -> areEqual(attribute, attributeReference)).findAny();
		return existingAttributeConstraint;
	}

}
