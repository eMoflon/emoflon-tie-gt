package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.Optional;

import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EParameter;
import org.emoflon.ibex.gt.editor.gT.EditorEnumExpression;
import org.emoflon.ibex.gt.editor.gT.EditorLiteralExpression;
import org.emoflon.ibex.gt.editor.utils.GTEditorAttributeUtils;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.compiler.democles.util.ExceptionUtil;
import org.moflon.tie.gt.constraints.democles.DemoclesFactory;
import org.moflon.tie.gt.constraints.democles.TypedConstant;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameter;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.LiteralExpression;

public final class Constants {
	private Constants() {
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
			throw ExceptionUtil.createIllegalArgumentException("Unsupported value type: %s.", valueObject);
		}
	}

	public static Object getValueForType(final EClassifier type, final String val) {
		if (type instanceof EDataType) {
			final EDataType dataType = (EDataType) type;
			return dataType.getEPackage().getEFactoryInstance().createFromString(dataType, val);
		}

		if ("null".equals(val))
			return null;

		throw ExceptionUtil.createIllegalArgumentException("Cannot handle value %s for EClassifier %s", val, type);
	}

	public static Constant createAndRegister(final EditorEnumExpression editorEnumExpression, final PatternBody body) {
		final EEnumLiteral literal = editorEnumExpression.getLiteral();
		final Constant enumLiteralConstant = SpecificationFactory.eINSTANCE.createConstant();
		enumLiteralConstant.setValue(literal);
		Patterns.addConstant(body, enumLiteralConstant);
		return enumLiteralConstant;
	}

	public static Constant add(final EditorLiteralExpression literalExpression, final EDataType eDataType,
			final PatternBody patternBody) {
		final Optional<Object> value = GTEditorAttributeUtils.convertLiteralValueToObject(eDataType, literalExpression);
		final Constant constant = SpecificationFactory.eINSTANCE.createConstant();
		if (value.isPresent()) {
			final Object valueObject = value.get();
			setConstantValueWithAdjustedType(constant, valueObject);
		} else {
			constant.setValue(literalExpression.getValue());
		}
		Patterns.addConstant(patternBody, constant);
		return constant;
	}

	public static TypedConstant createAndRegisterTypedConstant(final EditorLiteralExpression literalExpression,
			final EDataType eDataType, final PatternBody patternBody) {

		final TypedConstant constant = DemoclesFactory.eINSTANCE.createTypedConstant();
		constant.setEClassifier(eDataType);

		final Optional<Object> value = GTEditorAttributeUtils.convertLiteralValueToObject(eDataType, literalExpression);
		if (value.isPresent()) {
			final Object valueObject = value.get();
			setConstantValueWithAdjustedType(constant, valueObject);
		} else {
			constant.setValue(literalExpression.getValue());
		}

		Patterns.addConstant(patternBody, constant);

		return constant;
	}

	public static TypedConstant createAndRegisterTypedConstant(final EditorEnumExpression enumExpression,
			final EDataType eDataType, final PatternBody patternBody) {

		final TypedConstant constant = DemoclesFactory.eINSTANCE.createTypedConstant();
		constant.setEClassifier(eDataType);
		constant.setValue(enumExpression.getLiteral());
		Patterns.addConstant(patternBody, constant);

		return constant;
	}

	public static Constant createConstant(final LiteralExpression literalExpression, final EParameter eParameter,
			final PatternBody body, final MultiStatus transformationStatus) {

		final EClassifier parameterType = eParameter.getEType();
		if (parameterType instanceof EDataType) {
			final EDataType parameterDataType = (EDataType) parameterType;

			final Constant constant = SpecificationFactory.eINSTANCE.createConstant();
			final Optional<Object> value = LiteralExpressions.convertLiteralValueToObject(parameterDataType,
					literalExpression);
			if (value.isPresent()) {
				final Object valueObject = value.get();
				setConstantValueWithAdjustedType(constant, valueObject);
			} else {
				constant.setValue(literalExpression.getVal());
			}

			body.getConstants().add(constant);
			return constant;
		} else {
			TransformationExceptions.recordError(transformationStatus, "The type of %s::%s must be an EDataType but is",
					eParameter.getEOperation().getName(), eParameter.getName(), parameterType);
			return null;
		}
	}

	public static Constant createConstant(final CalledPatternParameter patternParameter, final Variable patternVariable,
			final Pattern pattern, final MultiStatus transformationStatus) {

		final EMFVariable emfPatternVariable = (EMFVariable) patternVariable;

		final EClassifier parameterType = emfPatternVariable.getEClassifier();
		if (parameterType instanceof EDataType) {
			final EDataType parameterDataType = (EDataType) parameterType;

			final Constant constant = SpecificationFactory.eINSTANCE.createConstant();
			final LiteralExpression literalExpression = patternParameter.getLiteral();
			final Optional<Object> value = LiteralExpressions.convertLiteralValueToObject(parameterDataType,
					literalExpression);
			if (value.isPresent()) {
				final Object valueObject = value.get();
				setConstantValueWithAdjustedType(constant, valueObject);
			} else {
				constant.setValue(literalExpression.getVal());
			}

			Patterns.getBody(pattern).getConstants().add(constant);
			return constant;
		} else {
			TransformationExceptions.recordError(transformationStatus, "The type of %s::%s must be an EDataType but is",
					pattern.getName(), patternParameter.getParameter().getName(), parameterType);
			return null;
		}
	}

}
