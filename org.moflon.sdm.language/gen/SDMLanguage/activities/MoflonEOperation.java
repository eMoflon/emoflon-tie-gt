/**
 */
package SDMLanguage.activities;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moflon EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.activities.MoflonEOperation#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.activities.ActivitiesPackage#getMoflonEOperation()
 * @model
 * @generated
 */
public interface MoflonEOperation extends EObject, EOperation {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see SDMLanguage.activities.ActivitiesPackage#getMoflonEOperation_Activity()
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.MoflonEOperation#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MoflonEOperation
