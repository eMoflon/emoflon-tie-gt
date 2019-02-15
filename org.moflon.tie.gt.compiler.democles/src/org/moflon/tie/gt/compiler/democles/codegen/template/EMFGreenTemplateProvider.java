package org.moflon.tie.gt.compiler.democles.codegen.template;

import static org.moflon.tie.gt.compiler.democles.util.TemplateUtil.createChain;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.codegen.emf.EMFTemplateProvider;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class EMFGreenTemplateProvider extends EMFTemplateProvider {

	public final Chain<TemplateController> getTemplateController(final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		final Object type = operation.getType();
		final Adornment adornment = operation.getPrecondition();
		if (type instanceof StructuralFeature<?>) {
			final StructuralFeature<?> sf = (StructuralFeature<?>) type;
			if (adornment.equals(Adornments.BB)) {
				if (sf.getLinkedElement().isMany()) {
					return createChain("/emf-create/CreateToManyLink", operation, tail);
				} else if (sf.getLinkedElement().isChangeable()) {
					return createChain("/emf-create/CreateToOneLink", operation, tail);
				} else if (EcorePackage.eINSTANCE.getEReference().isInstance(sf.getLinkedElement())
						&& ((EReference) sf.getLinkedElement()).getEOpposite() != null) {
					final EReference opposite = ((EReference) sf.getLinkedElement()).getEOpposite();
					if (opposite.isMany()) {
						return createChain("/emf-create/ReverseCreateToManyEReference", operation, tail);
					} else if (opposite.isChangeable()) {
						return createChain("/emf-create/ReverseCreateToOneEReference", operation, tail);
					}
				}
			}
		} else if (type instanceof EMFVariable) {
			if (adornment.equals(Adornments.F)) {
				return createChain("/emf-create/CreateObject", operation, tail);
			}
		}
		return super.getTemplateController(operation, tail);
	}
}
