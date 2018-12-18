/**
 */
package org.moflon.core.moca.processing.compare;

import MocaTree.TreeElement;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moca Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.compare.MocaDiff#getElement <em>Element</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.compare.MocaDiff#getLeftParent <em>Left Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.moca.processing.compare.ComparePackage#getMocaDiff()
 * @model abstract="true"
 * @generated
 */
public interface MocaDiff extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(TreeElement)
	 * @see org.moflon.core.moca.processing.compare.ComparePackage#getMocaDiff_Element()
	 * @model
	 * @generated
	 */
	TreeElement getElement();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.compare.MocaDiff#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(TreeElement value);

	/**
	 * Returns the value of the '<em><b>Left Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Parent</em>' reference.
	 * @see #setLeftParent(TreeElement)
	 * @see org.moflon.core.moca.processing.compare.ComparePackage#getMocaDiff_LeftParent()
	 * @model
	 * @generated
	 */
	TreeElement getLeftParent();

	/**
	 * Sets the value of the '{@link org.moflon.core.moca.processing.compare.MocaDiff#getLeftParent <em>Left Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Parent</em>' reference.
	 * @see #getLeftParent()
	 * @generated
	 */
	void setLeftParent(TreeElement value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MocaDiff
