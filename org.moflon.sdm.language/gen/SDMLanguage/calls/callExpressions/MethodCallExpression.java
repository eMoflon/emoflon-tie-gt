/**
 */
package SDMLanguage.calls.callExpressions;

import SDMLanguage.calls.Invocation;

import SDMLanguage.expressions.Expression;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.calls.callExpressions.MethodCallExpression#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.calls.callExpressions.CallExpressionsPackage#getMethodCallExpression()
 * @model
 * @generated
 */
public interface MethodCallExpression extends Expression, Invocation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see SDMLanguage.calls.callExpressions.CallExpressionsPackage#getMethodCallExpression_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link SDMLanguage.calls.callExpressions.MethodCallExpression#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MethodCallExpression
