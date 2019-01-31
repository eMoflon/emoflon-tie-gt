package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
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
				TransformationExceptions.recordError(transformationStatus,
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
			TransformationExceptions.recordError(transformationStatus,
					"Parameter count mismatches for EOperation %s.%s (%d in .ecore, %d in .mcf)",
					eOperation.getEContainingClass().getName(), eOperation.getName(), parameterCountInEcore,
					parameterCountInMcf);
		}
	}

	public static boolean isEcoreResource(final Resource resource) {
		return resource.getURI().fileExtension().equals("ecore");
	}

	public static List<EPackage> getEPackages(final Resource resource) {
		return resource.getContents().stream().filter(object -> object instanceof EPackage)
				.map(object -> (EPackage) object).collect(Collectors.toList());
	}

	public static boolean haveSuperTypeSubtypeRelation(final EditorNode subTypeNode, final EditorNode superTypeNode) {
		final EClass lhsType = superTypeNode.getType();
		final EClass rhsType = subTypeNode.getType();
		return haveSupertypeSubtypeRelation(lhsType, rhsType);
	}

	private static boolean haveSupertypeSubtypeRelation(final EClassifier superType, final EClassifier subType) {
		if (superType instanceof EClass && subType instanceof EClass) {
			final EClass superTypeEClass = (EClass) superType;
			final EClass subTypeEClass = (EClass) subType;
			return superTypeEClass.isSuperTypeOf(subTypeEClass);
		} else
			return false;
	}

	public static boolean haveSuperTypeSubtypeRelationEMF(final EMFVariable subTypeNode,
			final EMFVariable superTypeNode) {
		return haveSupertypeSubtypeRelation(superTypeNode.getEClassifier(), subTypeNode.getEClassifier());
	}
}
