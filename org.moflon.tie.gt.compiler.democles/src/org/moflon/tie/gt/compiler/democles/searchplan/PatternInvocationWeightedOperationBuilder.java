package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;

public class PatternInvocationWeightedOperationBuilder implements TieGtWeightedOperationBuilder {

	@Override
	public WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> createSearchPlanOperation(
			final SearchPlanOperation<GeneratorOperation> operation) {
		final Object origin = operation.getOrigin();
		if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof PatternInvocationConstraintType) {
				return WeightedOperation.createOperation(operation, 5);
			}
		}
		return null;
	}

}
