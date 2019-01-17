package org.moflon.tie.gt.compiler.democles.searchplan;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.impl.Variable;

public class AssignmentOperationBuilder implements TieGtOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		if (constraint == CoreConstraintModule.EQUAL) {
			final List<CompilableAdornedOperation> result = new LinkedList<>();
			final boolean isTypeCheckNeeded = isTypeCheckNeeded(parameters);
//			Adornment.create(isTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND, Adornment.BOUND)
			final int isAlwaysSuccessfull = isTypeCheckNeeded ? 0 : CompilableAdornedOperation.ALWAYS_SUCCESSFUL;
			final Adornment precondition = Adornment.create(Adornment.FREE, Adornment.BOUND);
			result.add(new CompilableAdornedOperation(precondition, constraint, isAlwaysSuccessfull));
			return result;
		}
		return null;
	}

	@Override
	public CompilableAdornedOperation getVariableOperation(final VariableType variable,
			final SpecificationExtendedVariableRuntime runtimeVariable) {
		return null;
	}

	final boolean isTypeCheckNeeded(final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		final EClassifier leftType = lookupEClassifier(parameters.get(0));
		if (EcorePackage.eINSTANCE.getEClass().isInstance(leftType)) {
			if (parameters.get(1).getSpecification() instanceof Variable) {
				final EClassifier rightType = lookupEClassifier(parameters.get(1));
				return EcorePackage.eINSTANCE.getEClass().isInstance(rightType)
						&& !((EClass) leftType).isSuperTypeOf((EClass) rightType);
			}
		}
		return false;
	}

	public static EClassifier lookupEClassifier(final SpecificationExtendedVariableRuntime variableRuntime) {
		final Variable variable = (Variable) variableRuntime.getSpecification();
		final EMFVariable emfVariable = (EMFVariable) variable.getType();
		return emfVariable.getLinkedElement();
	}

}
