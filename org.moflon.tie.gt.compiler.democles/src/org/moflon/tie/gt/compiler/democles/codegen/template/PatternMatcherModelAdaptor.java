package org.moflon.tie.gt.compiler.democles.codegen.template;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.stringtemplate.ParameterHandler;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.specification.impl.Variable;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ST;

public class PatternMatcherModelAdaptor extends ParameterHandler {

	public synchronized Object getProperty(final Interpreter interpreter, final ST template, final Object object,
			final Object property, final String propertyName) {
		if (object instanceof GeneratorOperation) {
			switch (propertyName) {
			case "freeParameters":
				return collectFreeParameters((GeneratorOperation) object);
			case "boundParameters":
				return collectBoundParameters((GeneratorOperation) object);
			}
		}
		final Object result = super.getProperty(interpreter, template, object, property, propertyName);
		if (object instanceof Variable && "name".equals(propertyName)) {
			if (result instanceof String) {
				return getJavaSafeVariable((String) result);
			}
		}
		return result;
	}

	private Object collectBoundParameters(final GeneratorOperation operation) {
		return collectParametersWithAdornment(operation, Adornment.BOUND);
	}

	private Object collectFreeParameters(final GeneratorOperation operation) {
		return collectParametersWithAdornment(operation, Adornment.FREE);
	}

	private Object collectParametersWithAdornment(final GeneratorOperation operation, final int bound) {
		final List<SpecificationExtendedVariableRuntime> boundParameters = new LinkedList<>();
		final Adornment precondition = operation.getPrecondition();
		for (int i = 0; i < precondition.size(); i++) {
			if (Adornments.is(bound, precondition, i)) {
				boundParameters.add(operation.getParameters().get(i));
			}
		}
		return boundParameters;
	}

	public String toString(final Object o, final String formatString, final Locale locale) {
		if (o instanceof Variable) {
			return getJavaSafeVariable(super.toString((Variable) o, formatString, locale));
		}
		return super.toString(o, formatString, locale);
	}

	private final String getJavaSafeVariable(final String name) {
		if ("this".equals(name)) {
			return "_this";
		} else {
			return name;
		}
	}
}
