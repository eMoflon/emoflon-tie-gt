package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class PatternInvocationSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof PatternInvocationConstraintType) {
				final int length = constraint.getParameters().size();
				final Adornment postcondition = Adornments.createBoundAdornment(length);
				return new SearchPlanOperation<>(operation, postcondition);
			}
		}
		return null;
	}

}
