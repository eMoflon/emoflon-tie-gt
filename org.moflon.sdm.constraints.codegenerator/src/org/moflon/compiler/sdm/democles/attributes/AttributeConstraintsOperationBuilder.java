package org.moflon.compiler.sdm.democles.attributes;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;
import org.moflon.compiler.sdm.democles.Adornments;
import org.moflon.sdm.constraints.operationspecification.ConstraintSpecification;
import org.moflon.sdm.constraints.operationspecification.OperationSpecification;
import org.moflon.sdm.constraints.operationspecification.OperationSpecificationGroup;

public class AttributeConstraintsOperationBuilder implements OperationBuilder<GeneratorOperation, GeneratorVariable> {

	@Override
	public List<GeneratorOperation> getConstraintOperations(final Constraint constraint,
			final List<GeneratorVariable> parameters) {

		final ConstraintType constraintType = constraint.getType();
		if (constraintType instanceof ConstraintSpecification) {
			final ConstraintSpecification constraintSpecification = (ConstraintSpecification) constraintType;
			return getOperations(constraint, parameters, constraintSpecification);
		}
		return null;

	}

	public List<GeneratorOperation> getOperations(final Constraint constraint, final List<GeneratorVariable> parameters,
			final ConstraintSpecification cType) {
		final List<GeneratorOperation> result = new LinkedList<>();
		final OperationSpecificationGroup opSpecGroup = cType.getOperationSpecificationGroup();
		for (final OperationSpecification opSpec : opSpecGroup.getOperationSpecifications()) {
			result.add(getOperation(constraint, parameters, cType, opSpec));
		}

		return result;
	}

	public GeneratorOperation getOperation(final Constraint constraint, final List<GeneratorVariable> parameters,
			final ConstraintSpecification constraintType, final OperationSpecification opSpec) {
		final String adornmentString = opSpec.getAdornmentString();
		final int adornmentSize = adornmentString.length();
		final GeneratorOperation operation;
		final Adornment postcondition = Adornments.createConstantAdornment(adornmentSize,
				Adornments.ADORNMENT_BOUND);
		if (opSpec.isAlwaysSuccessful()) {
			operation = new GeneratorOperation(constraint, parameters,
					Adornments.createAdornment(adornmentString), postcondition, constraintType,
					GeneratorOperation.ALWAYS_SUCCESSFUL);
		} else {
			operation = new GeneratorOperation(constraint, parameters,
					Adornments.createAdornment(adornmentString), postcondition, constraintType);
		}
		return operation;
	}

	@Override
	public GeneratorOperation getVariableOperation(final Variable variable, final GeneratorVariable runtimeVariable) {
		return null;
	}

}
