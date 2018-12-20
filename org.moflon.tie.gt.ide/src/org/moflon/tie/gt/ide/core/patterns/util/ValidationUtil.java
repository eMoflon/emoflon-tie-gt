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
import org.moflon.tie.gt.ide.core.patterns.EditorToControlFlowTransformation;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodDec;

public final class ValidationUtil {
	private ValidationUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static void validateSameParameterNames(final EOperation eOperation, final MethodDec editorEOperation,
			final MultiStatus transformationStatus) {
		for (int i = 0; i < editorEOperation.getEParameters().size(); i++) {
			final EParameter editorEParam = editorEOperation.getEParameters().get(i);
			final EParameter ecoreEParam = eOperation.getEParameters().get(i);
			if (!(editorEParam.getName().equals(ecoreEParam.getName()))) {
				TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
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
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Parameter count mismatches for EOperation %s.%s (%d in .ecore, %d in .mcf)",
					eOperation.getEContainingClass().getName(), eOperation.getName(), parameterCountInEcore,
					parameterCountInMcf);
		}
	}

	public static EClassifier validateTypeExists(final Variable var, final MultiStatus transformationStatus) {
		final EClassifier editorObjectVariableType = ((EMFVariable) var).getEClassifier();
		if (editorObjectVariableType == null) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Variable %s has no type.", var);
		}
		return editorObjectVariableType;
	}

	public static void validateTypeExistsInMetamodel(final Variable var, final EPackage ePackage,
			final EPackage ecorePackage, final MultiStatus transformationStatus) {
		final EClassifier editorObjectVariableType = ((EMFVariable) var).getEClassifier();
		final EClassifier properCfVariableType = EditorToControlFlowTransformation
				.lookupTypeInEcoreFile(editorObjectVariableType, ePackage, ecorePackage);
		if (properCfVariableType == null) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Cannot translate the type %s (from the editor) to an EClassifier in %s", var, ePackage);
		}
	}

}
