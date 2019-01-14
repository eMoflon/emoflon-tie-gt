package org.moflon.compiler.sdm.democles.config;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.compiler.sdm.democles.searchplan.TieGtWeightedOperationBuilder;
import org.moflon.sdm.constraints.operationspecification.ConstraintSpecification;

public class AttributeConstraintWeightedOperationBuilder implements TieGtWeightedOperationBuilder {

	@Override
	public WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> createSearchPlanOperation(
			final SearchPlanOperation<GeneratorOperation> operation) {
		final Object origin = operation.getOrigin();
		if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof ConstraintSpecification) {
				return WeightedOperation.createOperation(operation, 100);
			}
		}
		return null;
	}

}
