/**
 */
package org.moflon.core.moca.processing.parser;

import MocaTree.Node;

import java.io.Reader;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.parser.XMLParser#isIgnoreWhitespaces <em>Ignore Whitespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.moca.processing.parser.ParserPackage#getXMLParser()
 * @model
 * @generated
 */
public interface XMLParser extends Parser {
	/**
	 * Returns the value of the '<em><b>Ignore Whitespaces</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Whitespaces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Whitespaces</em>' attribute.
	 * @see #setIgnoreWhitespaces(boolean)
	 * @see org.moflon.core.moca.processing.parser.ParserPackage#getXMLParser_IgnoreWhitespaces()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isIgnoreWhitespaces();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.parser.XMLParser#isIgnoreWhitespaces <em>Ignore Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Whitespaces</em>' attribute.
	 * @see #isIgnoreWhitespaces()
	 * @generated
	 */
	void setIgnoreWhitespaces(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canParseFile(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model readerDataType="org.moflon.core.moca.processing.Reader"
	 * @generated
	 */
	Node parse(Reader reader);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XMLParser
