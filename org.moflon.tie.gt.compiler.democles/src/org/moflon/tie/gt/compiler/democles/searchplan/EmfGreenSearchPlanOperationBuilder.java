package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.Variable;
import org.gervarro.democles.specification.VariableType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class EmfGreenSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		final Adornment adornment = operation.getPrecondition();
		if (origin instanceof Variable) {
			final VariableType variableType = ((Variable) origin).getType();
			if (variableType instanceof EMFVariable) {
				if (adornment.equals(Adornments.F)) {
					return new SearchPlanOperation<>(operation, Adornments.B);
				}
			}
		} else if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof StructuralFeature<?>) {
				if (adornment.equals(Adornments.BB)) {
					return new SearchPlanOperation<>(operation, Adornment.create(Adornment.BOUND, Adornment.BOUND));
				}
			}
		}
		return null;
	}

}
