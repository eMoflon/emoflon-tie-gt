package org.moflon.tie.gt.compiler.democles.codegen.template;

import static org.moflon.tie.gt.compiler.democles.util.TemplateUtil.createChain;

import org.eclipse.emf.ecore.EReference;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.Reference;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class EMFRedTemplateProvider implements CodeGeneratorProvider<Chain<TemplateController>> {

	public final Chain<TemplateController> getTemplateController(final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		final Object type = operation.getType();
		final Adornment adornment = operation.getPrecondition();
		if (type instanceof Reference) {
			final Reference ref = (Reference) type;
			if (adornment.equals(Adornments.BB)) {
				if (ref.getLinkedElement().isMany()) {
					return createChain("/emf-delete/DeleteToManyLink", operation, tail);
				} else if (ref.getLinkedElement().isChangeable()) {
					return createChain("/emf-delete/DeleteToOneLink", operation, tail);
				} else if (ref.getLinkedElement().getEOpposite() != null) {
					final EReference opposite = ref.getLinkedElement().getEOpposite();
					if (opposite.isMany()) {
						return createChain("/emf-delete/ReverseDeleteToManyEReference", operation, tail);
					} else if (opposite.isChangeable()) {
						return createChain("/emf-delete/ReverseDeleteToOneEReference", operation, tail);
					}
				}
			}
		}
		throw new RuntimeException("Invalid operation");
	}

	public final boolean isResponsibleFor(final GeneratorOperation operation) {
		return operation.getType() instanceof EMFConstraint<?>;
	}
}
