/**
 */
package SDMLanguage.calls;

import SDMLanguage.CommentableElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.calls.Invocation#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 *   <li>{@link SDMLanguage.calls.Invocation#getCallee <em>Callee</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.calls.CallsPackage#getInvocation()
 * @model abstract="true"
 * @generated
 */
public interface Invocation extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.calls.ParameterBinding}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.calls.ParameterBinding#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Bindings</em>' containment reference list.
	 * @see SDMLanguage.calls.CallsPackage#getInvocation_OwnedParameterBindings()
	 * @see SDMLanguage.calls.ParameterBinding#getInvocation
	 * @model opposite="invocation" containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getOwnedParameterBindings();

	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference.
	 * @see #setCallee(EOperation)
	 * @see SDMLanguage.calls.CallsPackage#getInvocation_Callee()
	 * @model required="true"
	 * @generated
	 */
	EOperation getCallee();

	/**
	 * Sets the value of the '{@link SDMLanguage.calls.Invocation#getCallee <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(EOperation value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Invocation
