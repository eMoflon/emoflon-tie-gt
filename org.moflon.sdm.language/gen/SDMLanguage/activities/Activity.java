/**
 */
package SDMLanguage.activities;

import SDMLanguage.CommentableElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.activities.Activity#getOwnedActivityEdge <em>Owned Activity Edge</em>}</li>
 *   <li>{@link SDMLanguage.activities.Activity#getOwnedActivityNode <em>Owned Activity Node</em>}</li>
 *   <li>{@link SDMLanguage.activities.Activity#getOwningOperation <em>Owning Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.activities.ActivitiesPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Owned Activity Edge</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Activity Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Activity Edge</em>' containment reference list.
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivity_OwnedActivityEdge()
	 * @see SDMLanguage.activities.ActivityEdge#getOwningActivity
	 * @model opposite="owningActivity" containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getOwnedActivityEdge();

	/**
	 * Returns the value of the '<em><b>Owned Activity Node</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Activity Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Activity Node</em>' containment reference list.
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivity_OwnedActivityNode()
	 * @see SDMLanguage.activities.ActivityNode#getOwningActivity
	 * @model opposite="owningActivity" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getOwnedActivityNode();

	/**
	 * Returns the value of the '<em><b>Owning Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Operation</em>' reference.
	 * @see #setOwningOperation(EOperation)
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivity_OwningOperation()
	 * @model
	 * @generated
	 */
	EOperation getOwningOperation();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.Activity#getOwningOperation <em>Owning Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Operation</em>' reference.
	 * @see #getOwningOperation()
	 * @generated
	 */
	void setOwningOperation(EOperation value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Activity
