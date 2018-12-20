/**
 */
package org.moflon.core.moca.processing.unparser;

import MocaTree.Node;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.moca.processing.CodeAdapter;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unparser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.unparser.Unparser#getCodeAdapter <em>Code Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.moca.processing.unparser.UnparserPackage#getUnparser()
 * @model abstract="true"
 * @generated
 */
public interface Unparser extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Adapter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.core.moca.processing.CodeAdapter#getUnparser <em>Unparser</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Adapter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Adapter</em>' container reference.
	 * @see #setCodeAdapter(CodeAdapter)
	 * @see org.moflon.core.moca.processing.unparser.UnparserPackage#getUnparser_CodeAdapter()
	 * @see org.moflon.core.moca.processing.CodeAdapter#getUnparser
	 * @model opposite="unparser" required="true" transient="false"
	 * @generated
	 */
	CodeAdapter getCodeAdapter();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.unparser.Unparser#getCodeAdapter <em>Code Adapter</em>}' container reference.
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
	String unparse(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canUnparseFile(String fileName);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Unparser
