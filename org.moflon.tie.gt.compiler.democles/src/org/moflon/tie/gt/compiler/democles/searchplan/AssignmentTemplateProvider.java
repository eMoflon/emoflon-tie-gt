package org.moflon.tie.gt.compiler.democles.searchplan;

import org.eclipse.emf.ecore.EClass;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.CoreConstraintType;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Variable;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.pattern.PatternPrintingUtil;

public class AssignmentTemplateProvider implements CodeGeneratorProvider<Chain<TemplateController>> {

	@Override
	public final Chain<TemplateController> getTemplateController(final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		final Adornment adornment = operation.getPrecondition();
		if (Adornments.equals(adornment, "FB")) {
			final ConstraintType type = (ConstraintType) operation.getType();
			if (type == CoreConstraintModule.EQUAL) {
				final Object origin = operation.getOrigin();
				if (origin instanceof Constraint) {
					final Constraint constraint = (Constraint) origin;
					final Variable lhsVariable = (Variable) constraint.getParameters().get(0);
					final Variable rhsVariable = (Variable) constraint.getParameters().get(1);
					final EMFVariable lhsType = (EMFVariable) lhsVariable.getType();
					final EMFVariable rhsType = (EMFVariable) rhsVariable.getType();
					final EClass lhsEClass = (EClass) lhsType.getLinkedElement();
					final EClass rhsEClass = (EClass) rhsType.getLinkedElement();
					if (!rhsEClass.equals(lhsEClass)) {
						if (rhsEClass.isSuperTypeOf(lhsEClass)) {
							return createChain("/assignment/AssignWithTypeCheck", operation, tail);
						} else if (!(lhsEClass.isSuperTypeOf(rhsEClass)))
							throw new IllegalArgumentException(String.format("Incompatible types in constraint %s",
									PatternPrintingUtil.describe(constraint)));
					}
				}

				if (operation.isAlwaysSuccessful()) {
					return createChain("/assignment/Assign", operation, tail);
				} else {
					return createChain("/assignment/AssignWithNullCheck", operation, tail);
				}
			}
		}
		throw new RuntimeException("Invalid operation");
	}

	private Chain<TemplateController> createChain(final String templateName, final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		return new Chain<>(new TemplateController(templateName, operation), tail);
	}

	@Override
	public final boolean isResponsibleFor(final GeneratorOperation operation) {
		return operation != null && operation.getType() instanceof CoreConstraintType;
	}
}
