/**
 */
package SDMLanguage.activities;

import SDMLanguage.CommentableElement;
import SDMLanguage.NamedElement;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.activities.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link SDMLanguage.activities.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link SDMLanguage.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.activities.ActivitiesPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link SDMLanguage.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivityNode_Outgoing()
	 * @see SDMLanguage.activities.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link SDMLanguage.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivityNode_Incoming()
	 * @see SDMLanguage.activities.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Owning Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.Activity#getOwnedActivityNode <em>Owned Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Activity</em>' container reference.
	 * @see #setOwningActivity(Activity)
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivityNode_OwningActivity()
	 * @see SDMLanguage.activities.Activity#getOwnedActivityNode
	 * @model opposite="ownedActivityNode" required="true" transient="false"
	 * @generated
	 */
	Activity getOwningActivity();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Activity</em>' container reference.
	 * @see #getOwningActivity()
	 * @generated
	 */
	void setOwningActivity(Activity value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ActivityNode
