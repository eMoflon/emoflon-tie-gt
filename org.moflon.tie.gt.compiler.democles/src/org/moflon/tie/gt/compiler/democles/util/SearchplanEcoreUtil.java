package org.moflon.tie.gt.compiler.democles.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

/**
 * Convenience methods for working with Ecore
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public final class SearchplanEcoreUtil {

	private SearchplanEcoreUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static boolean isEClass(final EClassifier type) {
		return EcorePackage.eINSTANCE.getEClass().isInstance(type);
	}

	public static boolean isSuperType(final EClassifier eClassifier1, final EClassifier eClassifier2) {
		if (!isEClass(eClassifier1) || !isEClass(eClassifier2))
			return false;

		final EClass eClass1 = (EClass) eClassifier1;
		final EClass eClass2 = (EClass) eClassifier2;
		return eClass1.isSuperTypeOf(eClass2);
	}

	public static boolean typesEqual(final EClassifier eClassifier1, final EClassifier eClassifier2) {
		return eClassifier1.equals(eClassifier2);
	}
}
