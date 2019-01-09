package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

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
}
