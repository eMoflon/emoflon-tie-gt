package org.moflon.tie.gt.compiler.democles.util;

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

/**
 * Convenience methods for working with StringTemplates in the context of
 * Democles
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public final class TemplateUtil {

	public TemplateUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static Chain<TemplateController> createChain(final String templateName, final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		return new Chain<>(new TemplateController(templateName, operation), tail);
	}
}
