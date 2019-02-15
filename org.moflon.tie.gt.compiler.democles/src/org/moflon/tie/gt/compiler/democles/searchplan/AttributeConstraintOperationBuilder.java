package org.moflon.tie.gt.compiler.democles.searchplan;

import java.util.List;
import java.util.stream.Collectors;

import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.Variable;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.moflon.tie.gt.compiler.democles.CodeConventions;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.util.ConstraintUtil;
import org.moflon.tie.gt.constraints.operationspecification.ConstraintSpecification;
import org.moflon.tie.gt.constraints.operationspecification.OperationSpecification;
import org.moflon.tie.gt.constraints.operationspecification.OperationSpecificationGroup;

public class AttributeConstraintOperationBuilder implements TieGtOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {

		if (constraint instanceof ConstraintSpecification) {
			final ConstraintSpecification constraintSpecification = (ConstraintSpecification) constraint;
			return getOperations(constraintSpecification, parameters);
		}
		return null;

	}

	public List<CompilableAdornedOperation> getOperations(final ConstraintSpecification constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		final OperationSpecificationGroup specificationGroup = constraint.getOperationSpecificationGroup();

		final List<CompilableAdornedOperation> result = specificationGroup.getOperationSpecifications().stream()//
				.filter(specification -> hasCompatibleAdornment(specification, parameters))//
				.map(specification -> getOperation(constraint, parameters, specification)).collect(Collectors.toList());

		if (result.isEmpty())
			return null;
		else
			return result;

	}

	private boolean hasCompatibleAdornment(final OperationSpecification specification,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		final String adornmentString = specification.getAdornmentString();
		for (int i = 0; i < parameters.size(); ++i) {
			final ConstraintVariable referencedConstraintVariable = parameters.get(i).getSpecification();
			if (ConstraintUtil.isVariable(referencedConstraintVariable)) {
				final Variable variable = (Variable) referencedConstraintVariable;
				if (variable.getName().endsWith(CodeConventions.FREE_VARIABLE_SUFFIX)
						&& adornmentString.charAt(i) != Adornments.ADORNMENT_SYMBOL_FREE)
					return false;
			}
		}
		return true;
	}

	public CompilableAdornedOperation getOperation(final ConstraintSpecification constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters,
			final OperationSpecification operationSpecification) {
		final String adornmentString = operationSpecification.getAdornmentString();
		final Adornment precondition = Adornments.create(adornmentString);
		final CompilableAdornedOperation operation;
		if (operationSpecification.isAlwaysSuccessful()) {
			operation = new CompilableAdornedOperation(precondition, constraint,
					CompilableAdornedOperation.ALWAYS_SUCCESSFUL);
		} else {
			operation = new CompilableAdornedOperation(precondition, constraint);
		}
		return operation;
	}

	@Override
	public CompilableAdornedOperation getVariableOperation(final VariableType variable,
			final SpecificationExtendedVariableRuntime runtimeVariable) {
		return null;
	}

}
