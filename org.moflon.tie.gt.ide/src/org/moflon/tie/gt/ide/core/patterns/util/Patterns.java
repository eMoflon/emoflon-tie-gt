package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.MultiStatus;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.compiler.sdm.democles.PatternPrintingUtil;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class Patterns {

	private Patterns() {
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

	public static List<DemoclesPatternType> mapOperatorToPatternTypes(final EditorReference editorReference,
			final MultiStatus transformationStatus) {
		final EditorOperator operator = editorReference.getOperator();
		return mapOperatorToPatternTypes(operator, transformationStatus);
	}

	public static List<DemoclesPatternType> mapOperatorToPatternTypes(final EditorNode editorNode,
			final MultiStatus transformationStatus) {
		final EditorOperator operator = editorNode.getOperator();
		return mapOperatorToPatternTypes(operator, transformationStatus);
	}

	private static List<DemoclesPatternType> mapOperatorToPatternTypes(final EditorOperator operator,
			final MultiStatus transformationStatus) {
		switch (operator) {
		case CONTEXT:
			return Arrays.asList(DemoclesPatternType.BLACK_PATTERN);
		case DELETE:
			return Arrays.asList(DemoclesPatternType.BLACK_PATTERN, DemoclesPatternType.RED_PATTERN);
		case CREATE:
			return Arrays.asList(DemoclesPatternType.GREEN_PATTERN);
		default:
			TransformationExceptions.recordTransformationErrorMessage(transformationStatus,
					"Unsupported operator: " + operator);
			return null;
		}
	}

	public static boolean isOnlyBound(final Adornment adornment) {
		return adornment.getBoundColumns().length == adornment.size();
	}

	public static ConstraintParameter createConstraintParameter(final ConstraintVariable variable) {
		final ConstraintParameter constraintParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
		constraintParameter.setReference(variable);
		return constraintParameter;
	}

	public static DemoclesPatternType getPatternTypeForOperator(final EditorAttribute editorAttribute) {
		switch (editorAttribute.getRelation()) {
		case ASSIGNMENT:
			return DemoclesPatternType.GREEN_PATTERN;
		default:
			return DemoclesPatternType.BLACK_PATTERN;
		}
	}

	public static void moveSymbolicParameterToLocalVariable(final Variable symbolicParameter,
			final Pattern newPattern) {
		newPattern.getSymbolicParameters().remove(symbolicParameter);
		newPattern.getBodies().get(0).getLocalVariables().add(symbolicParameter);
	}

	public static Variable getSymbolicParameterByName(final Pattern pattern, final String variableName) {
		final Optional<Variable> match = pattern.getSymbolicParameters().stream()
				.filter(parameter -> parameter.getName().equals(variableName)).findAny();
		if (match.isPresent()) {
			return match.get();
		}
		throw new IllegalArgumentException(
				String.format("No symbolic parameter with name %s in %s (available parameters: %s)", variableName,
						pattern.getName(), PatternPrintingUtil.describeSymbolicParameters(pattern)));
	}

	public static boolean registerConstant(final PatternBody patternBody, final Constant constant) {
		return patternBody.getConstants().add(constant);
	}

	public static boolean registerConstraint(final Constraint constraint, final PatternBody body) {
		return body.getConstraints().add(constraint);
	}

	public static boolean registerSymbolicParameter(final Variable symbolicParameter, final Pattern pattern) {
		return pattern.getSymbolicParameters().add(symbolicParameter);
	}

	public static boolean registerLocalVariable(final Variable newAttribute, final Pattern pattern) {
		return getBody(pattern).getLocalVariables().add(newAttribute);
	}

	public static boolean removeSymbolicParameter(final Pattern blackPattern, final EMFVariable toBeRemoved) {
		return blackPattern.getSymbolicParameters().remove(toBeRemoved);
	}

}
