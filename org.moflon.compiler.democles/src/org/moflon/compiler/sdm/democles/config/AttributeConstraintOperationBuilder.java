package org.moflon.compiler.sdm.democles.config;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.moflon.compiler.sdm.democles.pattern.Adornments;
import org.moflon.compiler.sdm.democles.searchplan.TieGtOperationBuilder;
import org.moflon.sdm.constraints.operationspecification.ConstraintSpecification;
import org.moflon.sdm.constraints.operationspecification.OperationSpecification;
import org.moflon.sdm.constraints.operationspecification.OperationSpecificationGroup;

public class AttributeConstraintOperationBuilder implements TieGtOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {

		if (constraint instanceof ConstraintSpecification) {
			final ConstraintSpecification constraintSpecification = (ConstraintSpecification) constraint;
			return getOperations(constraint, parameters, constraintSpecification);
		}
		return null;

	}

	public List<CompilableAdornedOperation> getOperations(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters,
			final ConstraintSpecification constraintType) {
		final List<CompilableAdornedOperation> result = new LinkedList<>();
		final OperationSpecificationGroup operationSpecificationGroup = constraintType.getOperationSpecificationGroup();
		for (final OperationSpecification operationSpecification : operationSpecificationGroup.getOperationSpecifications()) {
			result.add(getOperation(constraint, parameters, constraintType, operationSpecification));
		}

		return result;
	}

	public CompilableAdornedOperation getOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters,
			final ConstraintSpecification constraintType, final OperationSpecification operationSpecification) {
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
