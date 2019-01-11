package org.moflon.compiler.sdm.democles;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.PatternMatcherPlugin;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;

public class BindingAndBlackOperationBuilder implements OperationBuilder<GeneratorOperation, SpecificationExtendedVariableRuntime> {
	private final Pattern pattern;

	private final Adornment adornment;

	public BindingAndBlackOperationBuilder(final Pattern pattern, final Adornment adornment) {
		this.pattern = pattern;
		this.adornment = adornment;
	}

	@Override
	public final List<GeneratorOperation> getConstraintOperations(final Constraint constraint,
			final List<SpecificationExtendedVariableRuntime> parameters) {
		final ConstraintType cType = constraint.getType();
		if (cType instanceof PatternInvocationConstraintType) {
			final PatternInvocationConstraintType invocation = (PatternInvocationConstraintType) cType;
			if (invocation.isPositive()) {
				final PatternBody body = pattern.getBodies().get(0);

				// Prepare initial adornment
				Adornment current = getBodyAdornment(pattern, adornment);

				// Apply operations one by one
				for (final org.gervarro.democles.specification.emf.Constraint c : body.getConstraints()) {
					if (c instanceof PatternInvocationConstraint) {
						final PatternInvocationConstraint pic = (PatternInvocationConstraint) c;

						final Pattern emfPattern = pic.getInvokedPattern();
						final org.gervarro.democles.specification.impl.Pattern internalPattern = invocation
								.getInvokedPattern();
						if (PatternMatcherPlugin
								.getIdentifier(emfPattern.getName(), emfPattern.getSymbolicParameters().size())
								.equals(PatternMatcherPlugin.getIdentifier(internalPattern.getName(),
										internalPattern.getSymbolicParameters().size()))) {
							final int[] allBoundArray = new int[pic.getParameters().size()];
							Arrays.fill(allBoundArray, Adornment.BOUND);
							final List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
							result.add(new GeneratorOperation(constraint, parameters,
									getOperationAdornment(this.pattern, current, pic), Adornment.create(allBoundArray),
									invocation));
							return result;
						}
						current = getNextAdornment(this.pattern, current, pic);
					}
				}
			}
		}

		return null;
	}

	@Override
	public GeneratorOperation getVariableOperation(final Variable variable, final SpecificationExtendedVariableRuntime runtimeVariable) {
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
			if (adornment.get(index) > Adornment.BOUND) {
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
