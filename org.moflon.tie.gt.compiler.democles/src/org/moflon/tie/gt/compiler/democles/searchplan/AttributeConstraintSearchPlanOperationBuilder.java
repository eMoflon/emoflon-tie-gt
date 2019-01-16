package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.constraints.operationspecification.ConstraintSpecification;

public class AttributeConstraintSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof ConstraintSpecification) {
				final Adornment postcondition = Adornments.createConstantAdornment(constraint.getParameters().size(),
						Adornments.ADORNMENT_SYMBOL_BOUND);
				return new SearchPlanOperation<>(operation, postcondition);
			}
		}
		return null;
	}

}
