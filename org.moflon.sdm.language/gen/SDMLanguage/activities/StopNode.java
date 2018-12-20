/**
 */
package SDMLanguage.activities;

import SDMLanguage.expressions.Expression;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.activities.StopNode#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.activities.ActivitiesPackage#getStopNode()
 * @model
 * @generated
 */
public interface StopNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(Expression)
	 * @see SDMLanguage.activities.ActivitiesPackage#getStopNode_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReturnValue();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.StopNode#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Expression value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StopNode
