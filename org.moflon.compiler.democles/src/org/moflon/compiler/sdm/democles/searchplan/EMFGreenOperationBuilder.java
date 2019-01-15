package org.moflon.compiler.sdm.democles.searchplan;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.codegen.emf.BasicEMFOperationBuilder;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.moflon.compiler.sdm.democles.pattern.Adornments;

public class EMFGreenOperationBuilder extends BasicEMFOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		if (constraint instanceof EMFConstraint<?>) {
			List<CompilableAdornedOperation> result = super.getConstraintOperation(constraint, parameters);
			if (result == null) {
				result = new LinkedList<>();
			}
			if (constraint instanceof StructuralFeature<?>) {
				final Adornment precondition = Adornments.create("BB");
				result.add(new CompilableAdornedOperation(precondition, constraint,
						CompilableAdornedOperation.ALWAYS_SUCCESSFUL));
			}
			return result;
		}
		return super.getConstraintOperation(constraint, parameters);
	}

	@Override
	public CompilableAdornedOperation getVariableOperation(final VariableType variable,
			final SpecificationExtendedVariableRuntime runtimeVariable) {
		if (variable instanceof EMFVariable) {
			final EClassifier eClassifier = ((EMFVariable) variable).getLinkedElement();
			if (eClassifier instanceof EClass) {
				final Adornment precondition = Adornments.create("F");
				return new CompilableAdornedOperation(precondition, variable,
						CompilableAdornedOperation.ALWAYS_SUCCESSFUL);
			}
		}
		return super.getVariableOperation(variable, runtimeVariable);
	}

}
