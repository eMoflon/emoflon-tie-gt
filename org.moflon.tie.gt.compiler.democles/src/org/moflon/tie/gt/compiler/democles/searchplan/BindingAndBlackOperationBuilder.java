package org.moflon.tie.gt.compiler.democles.searchplan;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.PatternMatcherPlugin;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class BindingAndBlackOperationBuilder implements TieGtOperationBuilder {
	private final Pattern pattern;

	private final Adornment adornment;

	public BindingAndBlackOperationBuilder(final Pattern pattern, final Adornment adornment) {
		this.pattern = pattern;
		this.adornment = adornment;
	}

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		if (constraint instanceof PatternInvocationConstraintType) {
			final PatternInvocationConstraintType invocation = (PatternInvocationConstraintType) constraint;
			if (invocation.isPositive()) {
				final PatternBody body = pattern.getBodies().get(0);

				// Prepare initial adornment
				Adornment current = getBodyAdornment(pattern, adornment);

				// Apply operations one by one
				for (final org.gervarro.democles.specification.emf.Constraint bodyConstraint : body.getConstraints()) {
					if (bodyConstraint instanceof PatternInvocationConstraint) {
						final PatternInvocationConstraint invocationConstraint = (PatternInvocationConstraint) bodyConstraint;

						final Pattern emfPattern = invocationConstraint.getInvokedPattern();
						final org.gervarro.democles.specification.impl.Pattern internalPattern = invocation
								.getInvokedPattern();
						if (PatternMatcherPlugin
								.getIdentifier(emfPattern.getName(), emfPattern.getSymbolicParameters().size())
								.equals(PatternMatcherPlugin.getIdentifier(internalPattern.getName(),
										internalPattern.getSymbolicParameters().size()))) {
							final List<CompilableAdornedOperation> result = new LinkedList<>();
							result.add(new CompilableAdornedOperation(
									getOperationAdornment(this.pattern, current, invocationConstraint), invocation));
							return result;
						}
						current = getNextAdornment(this.pattern, current, invocationConstraint);
					}
				}
			}
		}

		return null;
	}

	@Override
	public CompilableAdornedOperation getVariableOperation(final VariableType variable,
			final SpecificationExtendedVariableRuntime runtimeVariable) {
		return null;
	}

	private static final int determineParameterIndex(final Pattern pattern, final ConstraintParameter cp) {
		final PatternBody body = pattern.getBodies().get(0);
		final ConstraintVariable constraintVariable = cp.getReference();
		int index = pattern.getSymbolicParameters().indexOf(constraintVariable);
		if (index < 0) {
			index = body.getLocalVariables().indexOf(constraintVariable);
			if (index >= 0) {
				index += pattern.getSymbolicParameters().size();
			} else {
				index = body.getConstants().indexOf(constraintVariable);
				if (index >= 0) {
					index += pattern.getSymbolicParameters().size() + body.getLocalVariables().size();
				} else {
					throw new RuntimeException("Invalid constraint parameter");
				}
			}
		}
		return index;
	}

	private static final Adornment getBodyAdornment(final Pattern pattern, final Adornment adornment) {
		assert pattern.getSymbolicParameters().size() == adornment.size();
		final PatternBody body = pattern.getBodies().get(0);
		final int[] bindings = new int[pattern.getSymbolicParameters().size() + body.getLocalVariables().size()
				+ body.getConstants().size()];
		for (int i = 0; i < pattern.getSymbolicParameters().size(); i++) {
			bindings[i] = adornment.get(i);
		}
		int offset = pattern.getSymbolicParameters().size();
		for (int i = 0; i < body.getLocalVariables().size(); i++) {
			bindings[offset + i] = Adornment.FREE;
		}
		offset += body.getLocalVariables().size();
		for (int i = 0; i < body.getConstants().size(); i++) {
			bindings[offset + i] = Adornment.BOUND;
		}
		return new Adornment(bindings);
	}

	private static final Adornment getNextAdornment(final Pattern pattern, final Adornment adornment,
			final PatternInvocationConstraint patternInvocationConstraint) {
		final Adornment result = Adornment.create(adornment);
		final List<ConstraintParameter> constraintParameters = patternInvocationConstraint.getParameters();
		for (int operationIndex = 0; operationIndex < constraintParameters.size(); operationIndex++) {
			final ConstraintParameter cp = constraintParameters.get(operationIndex);
			final int index = determineParameterIndex(pattern, cp);
			if (Adornments.isFree(adornment, index) || Adornments.isNotTypechecked(adornment, index)) {
				result.set(index, Adornment.BOUND);
			}
		}
		return result;
	}

	private static final Adornment getOperationAdornment(final Pattern pattern, final Adornment adornment,
			final PatternInvocationConstraint patternInvocationConstraint) {
		final List<ConstraintParameter> constraintParameters = patternInvocationConstraint.getParameters();
		final int[] result = new int[constraintParameters.size()];
		for (int operationIndex = 0; operationIndex < constraintParameters.size(); operationIndex++) {
			final ConstraintParameter cp = constraintParameters.get(operationIndex);
			final int index = determineParameterIndex(pattern, cp);
			result[operationIndex] = adornment.get(index);
		}
		return new Adornment(result);
	}

}
