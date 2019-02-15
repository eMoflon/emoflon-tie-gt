package org.moflon.tie.gt.compiler.democles.util;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.ConstraintVariable;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.impl.Variable;

public class ConstraintUtil {

	public static boolean isEqual(final ConstraintType constraintType) {
		return constraintType == CoreConstraintModule.EQUAL;
	}

	public static boolean isConstraint(final Object origin) {
		return origin instanceof Constraint;
	}

	public static boolean isVariable(final ConstraintVariable constraintVariable) {
		return constraintVariable instanceof Variable;
	}

	public static boolean isEmfVariable(final VariableType type) {
		return type instanceof EMFVariable;
	}

	public static boolean requiresTypeCheck(final Constraint binaryConstraint) {
		final List<? extends ConstraintVariable> parameters = binaryConstraint.getParameters();
		validateBinaryConstraint(binaryConstraint);

		final ConstraintVariable lhsParameter = parameters.get(0);
		final ConstraintVariable rhsParameter = parameters.get(1);
		if (isVariable(lhsParameter) && isVariable(rhsParameter))
			return requiresTypeCheck((Variable) lhsParameter, (Variable) rhsParameter);

		return false;
	}

	public static boolean requiresTypeCheck(final EClassifier eclassifier1, final EClassifier eclassifier2) {
		if (SearchplanEcoreUtil.typesEqual(eclassifier1, eclassifier2))
			return false;
		if (SearchplanEcoreUtil.isSuperType(eclassifier1, eclassifier2))
			return false;
		if (SearchplanEcoreUtil.isSuperType(eclassifier2, eclassifier1))
			return true;

		throw new IllegalArgumentException(
				String.format("Incompatible types %s and %s", eclassifier1.getName(), eclassifier2.getName()));
	}

	public static boolean isVariable(final Object origin) {
		return origin instanceof Variable;
	}

	public static EClassifier lookupEClassifier(final SpecificationExtendedVariableRuntime variableRuntime) {
		final org.gervarro.democles.specification.impl.ConstraintVariable specification = variableRuntime
				.getSpecification();
		if (isVariable(specification)) {
			final Variable variable = (Variable) specification;
			final EMFVariable emfVariable = (EMFVariable) variable.getType();
			return emfVariable.getLinkedElement();
		}
		return null;
	}

	private static boolean requiresTypeCheck(final Variable lhsVariable, final Variable rhsVariable) {
		if (isEmfVariable(lhsVariable.getType()) && isEmfVariable(rhsVariable.getType())) {
			final EMFVariable lhsEmfVariable = (EMFVariable) lhsVariable.getType();
			final EMFVariable rhsEmfVariable = (EMFVariable) rhsVariable.getType();
			final EClassifier lhsEClass = (EClassifier) lhsEmfVariable.getLinkedElement();
			final EClassifier rhsEClass = (EClassifier) rhsEmfVariable.getLinkedElement();

			return requiresTypeCheck(lhsEClass, rhsEClass);
		} else {
			return false;
		}
	}

	private static void validateBinaryConstraint(final Constraint constraint) {
		if (constraint.getParameters().size() != 2)
			throw ExceptionUtil.createIllegalArgumentException("Expected %s to be binary.", constraint);
	}

}
