package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.MultiStatus;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.ide.core.patterns.PatternType;

public final class PatternUtil {

	private PatternUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Creates a {@link Pattern} with a single empty {@link PatternBody}
	 * 
	 * @return an empty pattern
	 */
	public static Pattern createEmptyPattern() {
		final Pattern pattern = SpecificationFactory.eINSTANCE.createPattern();
		final PatternBody body = SpecificationFactory.eINSTANCE.createPatternBody();
		pattern.getBodies().add(body);
		return pattern;
	}

	/**
	 * Returns the first {@link PatternBody} of the given pattern.
	 * 
	 * By convention, a {@link Pattern} in TIE-GT has exactly one
	 * {@link PatternBody}.
	 * 
	 * @param pattern
	 * @return
	 */
	public static PatternBody getBody(final Pattern pattern) {
		return pattern.getBodies().get(0);
	}

	public static List<PatternType> mapOperatorToPatternTypes(final EditorReference editorReference,
			final MultiStatus transformationStatus) {
		final EditorOperator operator = editorReference.getOperator();
		return mapOperatorToPatternTypes(operator, transformationStatus);
	}

	public static List<PatternType> mapOperatorToPatternTypes(final EditorNode editorNode,
			final MultiStatus transformationStatus) {
		final EditorOperator operator = editorNode.getOperator();
		return mapOperatorToPatternTypes(operator, transformationStatus);
	}

	private static List<PatternType> mapOperatorToPatternTypes(final EditorOperator operator,
			final MultiStatus transformationStatus) {
		switch (operator) {
		case CONTEXT:
			return Arrays.asList(PatternType.BLACK_PATTERN);
		case DELETE:
			return Arrays.asList(PatternType.BLACK_PATTERN, PatternType.RED_PATTERN);
		case CREATE:
			return Arrays.asList(PatternType.GREEN_PATTERN);
		default:
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Unsupported operator: " + operator);
			return null;
		}
	}

	public static boolean isOnlyBound(final Adornment adornment) {
		return adornment.getBoundColumns().length == adornment.size();
	}

}
