/**
 */
package org.moflon.core.moca.processing.unparser;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.core.moca.processing.unparser.UnparserPackage
 * @generated
 */
public interface UnparserFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnparserFactory eINSTANCE = org.moflon.core.moca.processing.unparser.impl.UnparserFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnparserPackage getUnparserPackage();

} //UnparserFactory
