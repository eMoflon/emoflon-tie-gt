package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
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
		parameters.stream().map(ConstraintParameters::create)
				.forEach(parameter -> constraint.getParameters().add(parameter));
		return constraint;
	}

	public static PatternInvocationConstraint add(final Pattern pattern, final boolean isPositive,
			final List<? extends Variable> parameters, final PatternBody body) {
		final PatternInvocationConstraint constraint = create(pattern, isPositive, parameters);
		Patterns.addConstraint(constraint, body);
		return constraint;
	}

	public static Stream<PatternInvocationConstraint> streamPatternInvocationConstraints(final Pattern pattern) {
		return Patterns.getConstraints(pattern).stream()
				.filter(constraint -> constraint instanceof PatternInvocationConstraint)
				.map(constraint -> (PatternInvocationConstraint) constraint);
	}

	public static Adornment getAdornment(final PatternInvocationConstraint constraint,
			final List<Variable> invokerParameters, final List<Variable> invokerLocalVariables,
			final boolean isBinding) {
		final EList<ConstraintParameter> constraintParameters = constraint.getParameters();
		final Adornment adornment = new Adornment(constraintParameters.size());
		int i = 0;
		for (final ConstraintParameter constraintParameter : constraintParameters) {
			final String constraintParameterName = getReferencedVariableName(constraintParameter);
			final int adornmentValue;
			if (invokerParameters.stream().map(Variable::getName)
					.anyMatch(variable -> constraintParameterName.equals(variable)))
				adornmentValue = Adornment.BOUND;
			else if (!isBinding && invokerLocalVariables.stream().map(Variable::getName)
					.anyMatch(variable -> constraintParameterName.equals(variable)))
				adornmentValue = Adornment.BOUND;
			else
				adornmentValue = Adornment.FREE;
			adornment.set(i, adornmentValue);
			i++;
		}
		return adornment;
	
	}

	public static String getReferencedVariableName(final ConstraintParameter param) {
		return ((EMFVariable) param.getReference()).getName();
	}

}
