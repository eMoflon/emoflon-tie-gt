package org.moflon.compiler.sdm.democles;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.codegen.emf.BasicEMFOperationBuilder;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;

public class EMFGreenOperationBuilder extends BasicEMFOperationBuilder {

	public List<GeneratorOperation> getConstraintOperations(Constraint constraint, List<SpecificationExtendedVariableRuntime> parameters) {
		if (constraint.getType() instanceof EMFConstraint<?>) {
			List<GeneratorOperation> result = super.getConstraintOperations(constraint, parameters);
			if (result == null) {
				result = new LinkedList<GeneratorOperation>();
			}
			EMFConstraint<?> cType = (EMFConstraint<?>) constraint.getType();
			if (cType instanceof StructuralFeature<?>) {
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(Adornment.BOUND, Adornment.BOUND),
						Adornment.create(Adornment.BOUND, Adornment.BOUND), cType,
						GeneratorOperation.ALWAYS_SUCCESSFUL));
			}
			return result;
		}
		return super.getConstraintOperations(constraint, parameters);
	}

	public GeneratorOperation getVariableOperation(Variable variable, SpecificationExtendedVariableRuntime runtimeVariable) {
		if (variable.getType() instanceof EMFVariable) {
			EClassifier eClassifier = ((EMFVariable) variable.getType()).getLinkedElement();
			if (eClassifier instanceof EClass) {
				return new GeneratorOperation(variable, Collections.singletonList(runtimeVariable),
						Adornment.create(Adornment.FREE), Adornment.create(Adornment.BOUND), variable.getType(),
						GeneratorOperation.ALWAYS_SUCCESSFUL);
			}
		}
		return super.getVariableOperation(variable, runtimeVariable);
	}

}
