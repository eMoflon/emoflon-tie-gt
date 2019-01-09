package org.moflon.tie.gt.ide.core.patterns.util;

import org.emoflon.ibex.gt.editor.gT.EditorEnumExpression;
import org.emoflon.ibex.gt.editor.gT.EditorLiteralExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraint;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintArgument;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintAttributeValueExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintPredicate;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintVariable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public class GtFormatter {
	private GtFormatter() {
		throw new UtilityClassNotInstantiableException();
	}

	public static String describe(final EditorPatternAttributeConstraint constraint) {
		if (constraint instanceof EditorPatternAttributeConstraintPredicate)
			return format(EditorPatternAttributeConstraintPredicate.class.cast(constraint));
		else if (constraint instanceof EditorPatternAttributeConstraintVariable)
			return describe(EditorPatternAttributeConstraintVariable.class.cast(constraint));
		else
			return describeDefault(constraint);
	}

	public static String format(final EditorPatternAttributeConstraintPredicate predicate) {
		final StringBuilder sb = new StringBuilder();
		sb.append(predicate.getName().getName());
		sb.append("(");
		for (final EditorPatternAttributeConstraintArgument predicateArgument : predicate.getArgs()) {
			sb.append(describe(predicateArgument)).append(",");
		}
		sb.replace(sb.length() - 1, sb.length(), ")");
		return sb.toString();
	}

	public static String describe(final EditorPatternAttributeConstraintArgument predicateArgument) {
		if (predicateArgument instanceof EditorPatternAttributeConstraintAttributeValueExpression)
			return describe(EditorPatternAttributeConstraintAttributeValueExpression.class.cast(predicateArgument));
		else if (predicateArgument instanceof EditorLiteralExpression)
			return describe(EditorLiteralExpression.class.cast(predicateArgument));
		else if (predicateArgument instanceof EditorEnumExpression)
			return describe(EditorEnumExpression.class.cast(predicateArgument));
		else
			return describeDefault(predicateArgument);
	}

	public static String describe(final EditorPatternAttributeConstraintAttributeValueExpression expression) {
		return String.format("%s.%s", expression.getEditorNode().getName(), expression.getAttribute().getName());
	}

	public static String describe(final EditorLiteralExpression expression) {
		return String.format("%s", expression.getValue());
	}

	public static String describe(final EditorEnumExpression expression) {
		return String.format("%s::%s", expression.getLiteral(), expression.getLiteral().getEEnum().getName());
	}

	public static String describeDefault(final Object object) {
		return object.toString();
	}
}
