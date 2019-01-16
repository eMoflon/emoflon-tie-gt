package org.moflon.tie.gt.compiler.democles.codegen.template;

import java.util.List;

import org.eclipse.emf.ecore.EcorePackage;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.CoreConstraintType;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Variable;
import org.moflon.tie.gt.compiler.democles.searchplan.AssignmentOperationBuilder;

public class AttributeAssignmentTemplateProvider implements CodeGeneratorProvider<Chain<TemplateController>> {

	@Override
	public final Chain<TemplateController> getTemplateController(final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		final Adornment adornment = operation.getPrecondition();
		if (adornment.get(0) == Adornment.FREE && adornment.get(1) == Adornment.BOUND) {
			final ConstraintType type = (ConstraintType) operation.getType();
			if (type == CoreConstraintModule.EQUAL) {
				// TODO@rkluge: No more postcondition
//				if (operation.getPostcondition().get(0) == Adornment.NOT_TYPECHECKED) {
//					return new Chain<TemplateController>(
//							new TemplateController("/assignment/AssignWithTypeCheck", operation), tail);
//				} else 
				if (operation.isAlwaysSuccessful()) {
					if (forceCasting(operation)) {
						return new Chain<TemplateController>(
								new TemplateController("/assignment/AssignWithClassCastException", operation), tail);
					} else {
						return new Chain<TemplateController>(new TemplateController("/assignment/Assign", operation),
								tail);
					}
				} else {
					return new Chain<TemplateController>(
							new TemplateController("/assignment/AssignWithNullCheck", operation), tail);
				}
			}
		}

		throw new RuntimeException("Invalid operation");
	}

	@Override
	public final boolean isResponsibleFor(final GeneratorOperation operation) {
		return operation != null && operation.getType() instanceof CoreConstraintType;
	}

	private final boolean forceCasting(final GeneratorOperation operation) {
		final List<SpecificationExtendedVariableRuntime> parameters = operation.getParameters();
		if (EcorePackage.eINSTANCE.getEDataType()
				.isInstance(AssignmentOperationBuilder.lookupEClassifier(parameters.get(0)))) {
			final SpecificationExtendedVariableRuntime variable = parameters.get(1);
			if (variable.getSpecification() instanceof Variable && EcorePackage.eINSTANCE.getEJavaObject()
					.equals(AssignmentOperationBuilder.lookupEClassifier(variable))) {
				return true;
			}
		}
		return false;
	}
}
