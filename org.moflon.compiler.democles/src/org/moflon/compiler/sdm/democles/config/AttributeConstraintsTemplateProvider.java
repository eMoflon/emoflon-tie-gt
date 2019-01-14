package org.moflon.compiler.sdm.democles.config;

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.moflon.sdm.constraints.operationspecification.ConstraintSpecification;

/**
 * This class provides the operation-to-template mapping for operations that
 * belong to {@link ConstraintSpecification}s
 *
 * @author Frederik Deckwerth - Initial implementation
 * @author Roland Kluge - Docu
 */
public class AttributeConstraintsTemplateProvider implements CodeGeneratorProvider<Chain<TemplateController>> {

	@Override
	public Chain<TemplateController> getTemplateController(final GeneratorOperation operation,
			final Chain<TemplateController> tail) {

		final Object operationType = operation.getType();
		if (operationType instanceof ConstraintSpecification) {
			final ConstraintSpecification constraintType = (ConstraintSpecification) operationType;

			final String fullyQualifiedTemplateName = createTemplateName(operation, constraintType);
			return new Chain<>(new TemplateController(fullyQualifiedTemplateName, operation), tail);
		}
		throw new IllegalArgumentException(
				String.format("Invalid operation type '%s' for operation '%s'", operationType, operation));
	}

	private String createTemplateName(final GeneratorOperation operation,
			final ConstraintSpecification constraintType) {
		final String prefix = constraintType.getAttributeConstraintLibrary().getPrefix();
		final String operationIdentifier = constraintType.getOperationSpecificationGroup().getOperationIdentifier();
		final String adornmentString = operation.getPrecondition().toString();

		final String fullyQualifiedTemplateName = "/" + prefix + "/" + operationIdentifier + "/" + operationIdentifier
				+ adornmentString;
		return fullyQualifiedTemplateName;
	}

	/**
	 * This class is only responsible for {@link ConstraintSpecification} operations
	 */
	@Override
	public boolean isResponsibleFor(final GeneratorOperation operation) {
		return operation != null && operation.getType() instanceof ConstraintSpecification;
	}

}
