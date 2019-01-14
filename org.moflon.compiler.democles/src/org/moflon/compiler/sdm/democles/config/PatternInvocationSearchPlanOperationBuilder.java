package org.moflon.compiler.sdm.democles.config;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.compiler.sdm.democles.pattern.Adornments;
import org.moflon.compiler.sdm.democles.searchplan.TieGtSearchPlanOperationBuilder;

public class PatternInvocationSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof PatternInvocationConstraintType) {
				final Adornment postcondition = Adornments.createConstantAdornment(constraint.getParameters().size(),
						Adornments.ADORNMENT_SYMBOL_BOUND);
				return new SearchPlanOperation<>(operation, postcondition);
			}
		}
		return null;
	}

}
