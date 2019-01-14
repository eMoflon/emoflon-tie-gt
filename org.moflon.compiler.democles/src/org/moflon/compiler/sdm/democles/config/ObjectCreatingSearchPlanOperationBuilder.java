package org.moflon.compiler.sdm.democles.config;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.specification.Variable;
import org.gervarro.democles.specification.VariableType;
import org.moflon.compiler.sdm.democles.pattern.Adornments;
import org.moflon.compiler.sdm.democles.searchplan.TieGtSearchPlanOperationBuilder;

public class ObjectCreatingSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		if (origin instanceof Variable) {
			final VariableType variableType = ((Variable) origin).getType();
			if (variableType instanceof EMFVariable) {
				final Adornment adornment = operation.getPrecondition();
				if (Adornments.equals(adornment, "F")) {
					return new SearchPlanOperation<GeneratorOperation>(operation, Adornments.create("B"));
				}
			}
		}
		return null;
	}

}
