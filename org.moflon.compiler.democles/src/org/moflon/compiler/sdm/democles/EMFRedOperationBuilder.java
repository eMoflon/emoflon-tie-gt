package org.moflon.compiler.sdm.democles;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.Reference;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;

public class EMFRedOperationBuilder implements TieGtOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		if (constraint instanceof Reference) {
			final List<CompilableAdornedOperation> result = new LinkedList<>();
			final Adornment precondition = Adornments.createAdornment("BB");
			result.add(new CompilableAdornedOperation(precondition, constraint,
					CompilableAdornedOperation.ALWAYS_SUCCESSFUL));

			return result;
		}
		return null;

	}

	@Override
	public CompilableAdornedOperation getVariableOperation(final VariableType variable,
			final SpecificationExtendedVariableRuntime runtimeVariable) {
		if (variable instanceof EMFVariable) {
			final EClassifier eClassifier = ((EMFVariable) variable).getLinkedElement();
			if (eClassifier instanceof EClass) {
				final Adornment precondition = Adornments.createAdornment("U");
				return new CompilableAdornedOperation(precondition, variable,
						CompilableAdornedOperation.ALWAYS_SUCCESSFUL);
			}
		}
		return null;
	}

}
