/**
 */
package SDMLanguage.activities;

import SDMLanguage.expressions.Expression;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.activities.ActivitiesPackage#getStatementNode()
 * @model
 * @generated
 */
public interface StatementNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Statement Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Expression</em>' containment reference.
	 * @see #setStatementExpression(Expression)
	 * @see SDMLanguage.activities.ActivitiesPackage#getStatementNode_StatementExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getStatementExpression();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Expression</em>' containment reference.
	 * @see #getStatementExpression()
	 * @generated
	 */
	void setStatementExpression(Expression value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StatementNode
