/**
 */
package SDMLanguage.activities;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}</li>
 *   <li>{@link SDMLanguage.activities.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link SDMLanguage.activities.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link SDMLanguage.activities.ActivityEdge#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.activities.ActivitiesPackage#getActivityEdge()
 * @model
 * @generated
 */
public interface ActivityEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.Activity#getOwnedActivityEdge <em>Owned Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Activity</em>' container reference.
	 * @see #setOwningActivity(Activity)
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivityEdge_OwningActivity()
	 * @see SDMLanguage.activities.Activity#getOwnedActivityEdge
	 * @model opposite="ownedActivityEdge" required="true" transient="false"
	 * @generated
	 */
	Activity getOwningActivity();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Activity</em>' container reference.
	 * @see #getOwningActivity()
	 * @generated
	 */
	void setOwningActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivityEdge_Source()
	 * @see SDMLanguage.activities.ActivityNode#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivityEdge_Target()
	 * @see SDMLanguage.activities.ActivityNode#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * The default value is <code>"EdgeGuard.NONE"</code>.
	 * The literals are from the enumeration {@link SDMLanguage.activities.EdgeGuard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see SDMLanguage.activities.EdgeGuard
	 * @see #setGuard(EdgeGuard)
	 * @see SDMLanguage.activities.ActivitiesPackage#getActivityEdge_Guard()
	 * @model default="EdgeGuard.NONE" required="true" ordered="false"
	 * @generated
	 */
	EdgeGuard getGuard();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.ActivityEdge#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see SDMLanguage.activities.EdgeGuard
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(EdgeGuard value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ActivityEdge
