/**
 */
package org.moflon.core.moca.processing;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.Problem#getCodeAdapter <em>Code Adapter</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.Problem#getCharacterPositionEnd <em>Character Position End</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.Problem#getCharacterPositionStart <em>Character Position Start</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.Problem#getLine <em>Line</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.Problem#getMessage <em>Message</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.Problem#getSource <em>Source</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.Problem#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem()
 * @model
 * @generated
 */
public interface Problem extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Adapter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.core.moca.processing.CodeAdapter#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Adapter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Adapter</em>' container reference.
	 * @see #setCodeAdapter(CodeAdapter)
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem_CodeAdapter()
	 * @see org.moflon.core.moca.processing.CodeAdapter#getProblems
	 * @model opposite="problems" required="true" transient="false"
	 * @generated
	 */
	CodeAdapter getCodeAdapter();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.Problem#getCodeAdapter <em>Code Adapter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Adapter</em>' container reference.
	 * @see #getCodeAdapter()
	 * @generated
	 */
	void setCodeAdapter(CodeAdapter value);

	/**
	 * Returns the value of the '<em><b>Character Position End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Position End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Position End</em>' attribute.
	 * @see #setCharacterPositionEnd(int)
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem_CharacterPositionEnd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCharacterPositionEnd();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.Problem#getCharacterPositionEnd <em>Character Position End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Position End</em>' attribute.
	 * @see #getCharacterPositionEnd()
	 * @generated
	 */
	void setCharacterPositionEnd(int value);

	/**
	 * Returns the value of the '<em><b>Character Position Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Position Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Position Start</em>' attribute.
	 * @see #setCharacterPositionStart(int)
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem_CharacterPositionStart()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCharacterPositionStart();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.Problem#getCharacterPositionStart <em>Character Position Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Position Start</em>' attribute.
	 * @see #getCharacterPositionStart()
	 * @generated
	 */
	void setCharacterPositionStart(int value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem_Line()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.Problem#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.Problem#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.Problem#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.moflon.core.moca.processing.ProblemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.moflon.core.moca.processing.ProblemType
	 * @see #setType(ProblemType)
	 * @see org.moflon.core.moca.processing.ProcessingPackage#getProblem_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProblemType getType();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.Problem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.moflon.core.moca.processing.ProblemType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProblemType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Problem
