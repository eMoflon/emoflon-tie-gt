/**
 */
package SDMLanguage.calls.callExpressions;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EParameter;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.calls.callExpressions.ParameterExpression#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.calls.callExpressions.CallExpressionsPackage#getParameterExpression()
 * @model
 * @generated
 */
public interface ParameterExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(EParameter)
	 * @see SDMLanguage.calls.callExpressions.CallExpressionsPackage#getParameterExpression_Parameter()
	 * @model required="true"
	 * @generated
	 */
	EParameter getParameter();

	/**
	 * Sets the value of the '{@link SDMLanguage.calls.callExpressions.ParameterExpression#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(EParameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ParameterExpression
