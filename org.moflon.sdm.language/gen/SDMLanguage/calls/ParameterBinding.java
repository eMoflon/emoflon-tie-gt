/**
 */
package SDMLanguage.calls;

import SDMLanguage.CommentableElement;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EParameter;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.calls.ParameterBinding#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link SDMLanguage.calls.ParameterBinding#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link SDMLanguage.calls.ParameterBinding#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.calls.CallsPackage#getParameterBinding()
 * @model
 * @generated
 */
public interface ParameterBinding extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expression</em>' containment reference.
	 * @see #setValueExpression(Expression)
	 * @see SDMLanguage.calls.CallsPackage#getParameterBinding_ValueExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link SDMLanguage.calls.ParameterBinding#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Invocation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.calls.Invocation#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation</em>' container reference.
	 * @see #setInvocation(Invocation)
	 * @see SDMLanguage.calls.CallsPackage#getParameterBinding_Invocation()
	 * @see SDMLanguage.calls.Invocation#getOwnedParameterBindings
	 * @model opposite="ownedParameterBindings" required="true" transient="false"
	 * @generated
	 */
	Invocation getInvocation();

	/**
	 * Sets the value of the '{@link SDMLanguage.calls.ParameterBinding#getInvocation <em>Invocation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation</em>' container reference.
	 * @see #getInvocation()
	 * @generated
	 */
	void setInvocation(Invocation value);

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
	 * @see SDMLanguage.calls.CallsPackage#getParameterBinding_Parameter()
	 * @model required="true"
	 * @generated
	 */
	EParameter getParameter();

	/**
	 * Sets the value of the '{@link SDMLanguage.calls.ParameterBinding#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(EParameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ParameterBinding
