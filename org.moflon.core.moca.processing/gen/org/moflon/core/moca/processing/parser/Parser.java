/**
 */
package org.moflon.core.moca.processing.parser;

import MocaTree.Node;

import java.io.File;
import java.io.Reader;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.moca.processing.CodeAdapter;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.parser.Parser#getCodeAdapter <em>Code Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.moca.processing.parser.ParserPackage#getParser()
 * @model abstract="true"
 * @generated
 */
public interface Parser extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Adapter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.core.moca.processing.CodeAdapter#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Adapter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Adapter</em>' container reference.
	 * @see #setCodeAdapter(CodeAdapter)
	 * @see org.moflon.core.moca.processing.parser.ParserPackage#getParser_CodeAdapter()
	 * @see org.moflon.core.moca.processing.CodeAdapter#getParser
	 * @model opposite="parser" required="true" transient="false"
	 * @generated
	 */
	CodeAdapter getCodeAdapter();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.parser.Parser#getCodeAdapter <em>Code Adapter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Adapter</em>' container reference.
	 * @see #getCodeAdapter()
	 * @generated
	 */
	void setCodeAdapter(CodeAdapter value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileDataType="org.moflon.core.moca.processing.File" readerDataType="org.moflon.core.moca.processing.Reader"
	 * @generated
	 */
	Node parse(File file, Reader reader);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Parser
