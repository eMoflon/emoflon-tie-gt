package org.moflon.compiler.sdm.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.Variable;
import org.gervarro.democles.specification.VariableType;
import org.moflon.compiler.sdm.democles.pattern.Adornments;

public class EmfGreenWeightedOperationBuilder implements TieGtWeightedOperationBuilder {

	@Override
	public WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> createSearchPlanOperation(
			final SearchPlanOperation<GeneratorOperation> operation) {
		final Object origin = operation.getOrigin();
		final Adornment adornment = operation.getPrecondition();
		if (origin instanceof Variable) {
			final VariableType variableType = ((Variable) origin).getType();
			if (variableType instanceof EMFVariable) {
				if (Adornments.equals(adornment, "F")) {
					return WeightedOperation.createOperation(operation, -5);
				}
			}
		} else if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (constraintType instanceof StructuralFeature<?>) {
				if (Adornments.equals(adornment, "BB")) {
					return WeightedOperation.createOperation(operation, 1);
				}
			}
		}
		return null;
	}

}
