package org.moflon.tie.gt.compiler.democles.codegen.template;

import static org.moflon.tie.gt.compiler.democles.util.TemplateUtil.createChain;

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;

public class BindingAndBlackTemplateProvider implements CodeGeneratorProvider<Chain<TemplateController>> {

	public final Chain<TemplateController> getTemplateController(final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		return createChain("/priority/PatternCall", operation, tail);
	}

	@Override
	public final boolean isResponsibleFor(final GeneratorOperation operation) {
		return operation != null && operation.getType() instanceof PatternInvocationConstraintType
				&& ((PatternInvocationConstraintType) operation.getType()).isPositive();
	}
}
