package org.moflon.compiler.sdm.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Constraint;
import org.moflon.compiler.sdm.democles.pattern.Adornments;

public class AssignmentWeightedOperationBuilder implements TieGtWeightedOperationBuilder {

	@Override
	public WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> createSearchPlanOperation(
			final SearchPlanOperation<GeneratorOperation> operation) {

		final Adornment adornment = operation.getPrecondition();
		final Object object = operation.getOrigin();
		if (object instanceof Constraint) {
			final Constraint constraint = (Constraint) object;
			final ConstraintType cType = constraint.getType();
			if (cType == CoreConstraintModule.EQUAL && Adornments.equals(adornment, "FB")) {
				return WeightedOperation.createOperation(operation, -5);
			}
		}
		return null;
	}

}
