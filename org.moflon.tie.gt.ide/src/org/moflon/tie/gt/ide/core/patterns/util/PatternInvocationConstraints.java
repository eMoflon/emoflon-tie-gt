package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.List;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class PatternInvocationConstraints {
	private PatternInvocationConstraints() {
		throw new UtilityClassNotInstantiableException();
	}

	public static PatternInvocationConstraint create(final Pattern pattern, final boolean isPositive,
			final List<? extends Variable> parameters) {
		final PatternInvocationConstraint constraint = SpecificationFactory.eINSTANCE
				.createPatternInvocationConstraint();
		constraint.setPositive(isPositive);
		constraint.setInvokedPattern(pattern);
		parameters.stream().map(Patterns::createConstraintParameter)
				.forEach(parameter -> constraint.getParameters().add(parameter));
		return constraint;
	}

	public static PatternInvocationConstraint createAndRegister(final Pattern pattern, final boolean isPositive,
			final List<? extends Variable> parameters, final PatternBody body) {
		final PatternInvocationConstraint constraint = create(pattern, isPositive, parameters);
		Patterns.registerConstraint(constraint, body);
		return constraint;
	}

}
