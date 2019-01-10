package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.ide.core.runtime.utilities.TypeLookup;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodDec;

public final class TieGtEcoreUtil {
	private TieGtEcoreUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Returns true if the given {@link EOperation} is has a 'void' return type
	 * 
	 * @param eOperation the operation to check
	 * @return true if the given operation has a void return type
	 */
	public static boolean isVoidOperation(final EOperation eOperation) {
		return eOperation.getEType() == null;
	}

	/**
	 * Returns a representative string for the given {@link EClassifier}
	 * 
	 * @param eClassifier the {@link EClassifier}
	 * @return the formatted string
	 */
	public static String formatEClassifier(final EClassifier eClassifier) {
		return eClassifier == null ? "null" : eClassifier.getName();
	}

	public static void validateSameParameterNames(final EOperation eOperation, final MethodDec editorEOperation,
			final MultiStatus transformationStatus) {
		for (int i = 0; i < editorEOperation.getEParameters().size(); i++) {
			final EParameter editorEParam = editorEOperation.getEParameters().get(i);
			final EParameter ecoreEParam = eOperation.getEParameters().get(i);
			if (!(editorEParam.getName().equals(ecoreEParam.getName()))) {
				TransformationExceptions.recordTransformationErrorMessage(transformationStatus,
						"Cannot find parameter with name %s in EOperation %s", editorEParam.getName(),
						eOperation.getName());
			}
		}
	}

	public static void validateEqualParameterCount(final EOperation eOperation, final MethodDec editorEOperation,
			final MultiStatus transformationStatus) {
		final EList<EParameter> editorOperationParameters = editorEOperation.getEParameters();
		final int parameterCountInEcore = eOperation.getEParameters().size();
		final int parameterCountInMcf = editorOperationParameters.size();
		if (parameterCountInEcore != parameterCountInMcf) {
			TransformationExceptions.recordTransformationErrorMessage(transformationStatus,
					"Parameter count mismatches for EOperation %s.%s (%d in .ecore, %d in .mcf)",
					eOperation.getEContainingClass().getName(), eOperation.getName(), parameterCountInEcore,
					parameterCountInMcf);
		}
	}

	public static EClassifier validateTypeExists(final Variable var, final MultiStatus transformationStatus) {
		final EClassifier editorObjectVariableType = ((EMFVariable) var).getEClassifier();
		if (editorObjectVariableType == null) {
			TransformationExceptions.recordTransformationErrorMessage(transformationStatus,
					"Variable %s has no type.", var);
		}
		return editorObjectVariableType;
	}

	public static void validateTypeExistsInMetamodel(final Variable var, final EPackage ePackage,
			final EPackage ecorePackage, final MultiStatus transformationStatus) {
		final EClassifier editorObjectVariableType = ((EMFVariable) var).getEClassifier();
		final EClassifier properCfVariableType = TypeLookup
				.lookupTypeInEcoreFile(editorObjectVariableType, ePackage, ecorePackage);
		if (properCfVariableType == null) {
			TransformationExceptions.recordTransformationErrorMessage(transformationStatus,
					"Cannot translate the type %s (from the editor) to an EClassifier in %s", var, ePackage);
		}
	}
}
