package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.util.ConstraintUtil;

public class AssignmentSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		final Adornment adornment = operation.getPrecondition();
		if (ConstraintUtil.isConstraint(origin)) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (adornment.equals(Adornments.FB)) {
				if (ConstraintUtil.isEqual(constraintType)) {
					final Adornment postcondition = getPostcondition(constraint);
					return new SearchPlanOperation<>(operation, postcondition);
				}
			}
		}
		return null;
	}

	private Adornment getPostcondition(final Constraint constraint) {
		final boolean requiresTypeCheck = ConstraintUtil.requiresTypeCheck(constraint);

		if (requiresTypeCheck)
			return Adornments.UB;
		else
			return Adornments.BB;
	}
}
