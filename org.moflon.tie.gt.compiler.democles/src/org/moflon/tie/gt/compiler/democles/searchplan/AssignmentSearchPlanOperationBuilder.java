package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class AssignmentSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		final Adornment adornment = operation.getPrecondition();
		if (origin instanceof Constraint) {
			final ConstraintType constraintType = ((Constraint) origin).getType();
			if (Adornments.equals(adornment, "FB")) {
				if (constraintType == CoreConstraintModule.EQUAL) {
					return new SearchPlanOperation<>(operation, Adornment.create(Adornment.BOUND, Adornment.BOUND));
				}
			}
		}
		return null;
	}
}
