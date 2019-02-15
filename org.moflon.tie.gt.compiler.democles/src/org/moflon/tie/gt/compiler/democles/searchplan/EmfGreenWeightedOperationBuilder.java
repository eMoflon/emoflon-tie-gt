package org.moflon.tie.gt.compiler.democles.searchplan;

import static org.moflon.tie.gt.compiler.democles.util.ConstraintUtil.isConstraint;
import static org.moflon.tie.gt.compiler.democles.util.ConstraintUtil.isVariable;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.Variable;
import org.gervarro.democles.specification.VariableType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class EmfGreenWeightedOperationBuilder implements TieGtWeightedOperationBuilder {

	@Override
	public WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> createSearchPlanOperation(
			final SearchPlanOperation<GeneratorOperation> operation) {
		final Object origin = operation.getOrigin();
		final Adornment adornment = operation.getPrecondition();
		if (isVariable(origin)) {
			final Variable variable = (Variable) origin;
			final VariableType variableType = variable.getType();
			if (variableType instanceof EMFVariable) {
				if (adornment.equals(Adornments.F)) {
					return WeightedOperation.createOperation(operation, -5);
				}
			}
		} else if (isConstraint(origin)) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof StructuralFeature<?>) {
				if (adornment.equals(Adornments.BB)) {
					return WeightedOperation.createOperation(operation, 1);
				}
			}
		}
		return null;
	}

}
