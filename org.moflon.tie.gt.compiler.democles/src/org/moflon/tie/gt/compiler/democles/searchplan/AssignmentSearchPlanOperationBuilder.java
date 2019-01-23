package org.moflon.tie.gt.compiler.democles.searchplan;

import org.eclipse.emf.ecore.EClass;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Variable;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.pattern.PatternPrintingUtil;

public class AssignmentSearchPlanOperationBuilder implements TieGtSearchPlanOperationBuilder {

	@Override
	public SearchPlanOperation<GeneratorOperation> createSearchPlanOperation(final GeneratorOperation operation) {
		final Object origin = operation.getOrigin();
		final Adornment adornment = operation.getPrecondition();
		if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			final ConstraintType constraintType = constraint.getType();
			if (Adornments.equals(adornment, "FB")) {
				if (constraintType == CoreConstraintModule.EQUAL) {
					final Variable lhsVariable = (Variable) constraint.getParameters().get(0);
					final Variable rhsVariable = (Variable) constraint.getParameters().get(1);
					final EMFVariable lhsType = (EMFVariable) lhsVariable.getType();
					final EMFVariable rhsType = (EMFVariable) rhsVariable.getType();
					final EClass lhsEClass = (EClass) lhsType.getLinkedElement();
					final EClass rhsEClass = (EClass) rhsType.getLinkedElement();
					final Adornment postcondition;
					if (typesEqual(lhsEClass, rhsEClass))
						postcondition = Adornments.create("BB");
					else if (isSuperType(lhsEClass, rhsEClass))
						postcondition = Adornments.create("BB");
					else if (isSuperType(rhsEClass, lhsEClass))
						postcondition = Adornments.create("UB");
					else
						throw new IllegalArgumentException(String.format("Incompatible types in constraint %s",
								PatternPrintingUtil.describe(constraint)));
					return new SearchPlanOperation<>(operation, postcondition);
				}
			}
		}
		return null;
	}

	private boolean isSuperType(final EClass eClass1, final EClass eClass2) {
		return eClass1.isSuperTypeOf(eClass2);
	}

	private boolean typesEqual(final EClass eClassifier1, final EClass eClassifier2) {
		return eClassifier1.equals(eClassifier2);
	}
}
