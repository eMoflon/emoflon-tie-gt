/**
 */
package org.moflon.core.moca.processing;

import MocaTree.Folder;

import java.io.File;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.moca.processing.parser.Parser;

import org.moflon.core.moca.processing.unparser.Unparser;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.CodeAdapter#getUnparser <em>Unparser</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.CodeAdapter#getProblems <em>Problems</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.CodeAdapter#getParser <em>Parser</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.moca.processing.ProcessingPackage#getCodeAdapter()
 * @model
 * @generated
 */
public interface CodeAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Unparser</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.core.moca.processing.unparser.Unparser}.
	 * It is bidirectional and its opposite is '{@link org.moflon.core.moca.processing.unparser.Unparser#getCodeAdapter <em>Code Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unparser</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unparser</em>' containment reference list.
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getCodeAdapter_Unparser()
	 * @see org.moflon.core.moca.processing.unparser.Unparser#getCodeAdapter
	 * @model opposite="codeAdapter" containment="true"
	 * @generated
	 */
	EList<Unparser> getUnparser();

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.core.moca.processing.Problem}.
	 * It is bidirectional and its opposite is '{@link org.moflon.core.moca.processing.Problem#getCodeAdapter <em>Code Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getCodeAdapter_Problems()
	 * @see org.moflon.core.moca.processing.Problem#getCodeAdapter
	 * @model opposite="codeAdapter" containment="true"
	 * @generated
	 */
	EList<Problem> getProblems();

	/**
	 * Returns the value of the '<em><b>Parser</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.core.moca.processing.parser.Parser}.
	 * It is bidirectional and its opposite is '{@link org.moflon.core.moca.processing.parser.Parser#getCodeAdapter <em>Code Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser</em>' containment reference list.
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getCodeAdapter_Parser()
	 * @see org.moflon.core.moca.processing.parser.Parser#getCodeAdapter
	 * @model opposite="codeAdapter" containment="true"
	 * @generated
	 */
	EList<Parser> getParser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dirDataType="org.moflon.core.moca.processing.Directory"
	 * @generated
	 */
	Folder parse(File dir);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.moflon.core.moca.processing.Directory"
	 * @generated
	 */
	File unparse(String path, Folder folder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileDataType="org.moflon.core.moca.processing.Directory"
	 * @generated
	 */
	MocaTree.File parseFile(File file, Folder parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dirDataType="org.moflon.core.moca.processing.Directory"
	 * @generated
	 */
	void unparseFile(MocaTree.File eFile, File dir);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CodeAdapter
