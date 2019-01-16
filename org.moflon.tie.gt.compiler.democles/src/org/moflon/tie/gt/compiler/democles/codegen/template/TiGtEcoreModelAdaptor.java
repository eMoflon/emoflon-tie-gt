package org.moflon.tie.gt.compiler.democles.codegen.template;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.gervarro.democles.codegen.emf.EcoreToGenModelConverter;
import org.gervarro.democles.codegen.stringtemplate.emf.EcoreModelAdaptor;
import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

public class TiGtEcoreModelAdaptor extends EcoreModelAdaptor {

	public TiGtEcoreModelAdaptor(final EcoreToGenModelConverter converter) {
		super(converter);
	}

	public synchronized Object getProperty(final Interpreter interpreter, final ST template, final Object object,
			final Object property, final String propertyName) throws STNoSuchPropertyException {
		if (object instanceof EClassifier) {
			if ("isEDataType".equals(propertyName)) {
				return object instanceof EDataType;
			}
		}
		return super.getProperty(interpreter, template, object, property, propertyName);
	}
}
