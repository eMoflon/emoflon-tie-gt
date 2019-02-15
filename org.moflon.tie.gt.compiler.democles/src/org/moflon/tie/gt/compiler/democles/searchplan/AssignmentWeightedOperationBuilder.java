package org.moflon.tie.gt.compiler.democles.searchplan;

import static org.moflon.tie.gt.compiler.democles.util.ConstraintUtil.isConstraint;
import static org.moflon.tie.gt.compiler.democles.util.ConstraintUtil.isEqual;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Constraint;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class AssignmentWeightedOperationBuilder implements TieGtWeightedOperationBuilder {

	@Override
	public WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> createSearchPlanOperation(
			final SearchPlanOperation<GeneratorOperation> operation) {

		final Adornment adornment = operation.getPrecondition();
		final Object object = operation.getOrigin();
		if (isConstraint(object)) {
			final Constraint constraint = (Constraint) object;
			final ConstraintType cType = constraint.getType();
			if (isEqual(cType) && adornment.equals(Adornments.FB)) {
				return WeightedOperation.createOperation(operation, -5);
			}
		}
		return null;
	}

}
