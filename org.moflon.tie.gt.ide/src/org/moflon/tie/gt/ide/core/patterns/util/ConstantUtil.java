package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.gervarro.democles.specification.emf.Constant;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class ConstantUtil {
	private ConstantUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static void setConstantValueWithAdjustedType(final Constant constant, final Object valueObject) {
		if (valueObject == null) {
			constant.setValue(null);
		} else if (valueObject instanceof Integer) {
			final Integer value = (Integer) valueObject;
			constant.setValue(value);
		} else if (valueObject instanceof String) {
			final String value = (String) valueObject;
			constant.setValue(value);
		} else if (valueObject instanceof Boolean) {
			final Boolean value = (Boolean) valueObject;
			constant.setValue(value.booleanValue());
		} else if (valueObject instanceof Double) {
			final Double value = (Double) valueObject;
			constant.setValue(value.doubleValue());
		} else if (valueObject instanceof Float) {
			final Float value = (Float) valueObject;
			constant.setValue(value.floatValue());
		} else if (valueObject instanceof Long) {
			final Long value = (Long) valueObject;
			constant.setValue(value.longValue());
		} else if (valueObject instanceof EEnumLiteral) {
			final EEnumLiteral literal = (EEnumLiteral) valueObject;
			constant.setValue(literal);
		} else {
			throw new IllegalArgumentException("Unsupported value type: " + valueObject);
		}
	}

	public static Object getValueForType(final EClassifier type, final String val) {
		if (type instanceof EDataType) {
			final EDataType dataType = (EDataType) type;
			return dataType.getEPackage().getEFactoryInstance().createFromString(dataType, val);
		} else if ("null".equals(val)) {
			return null;
		} else {
			throw new IllegalArgumentException(String.format("Cannot handle value %s for EClassifier %s", val, type));
		}
	}

}
