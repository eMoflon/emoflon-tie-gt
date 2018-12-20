/**
 */
package org.moflon.core.moca.processing.parser;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.core.moca.processing.parser.ParserPackage
 * @generated
 */
public interface ParserFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParserFactory eINSTANCE = org.moflon.core.moca.processing.parser.impl.ParserFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XML Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Parser</em>'.
	 * @generated
	 */
	XMLParser createXMLParser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParserPackage getParserPackage();

} //ParserFactory
