/**
 */
package SDMLanguage.patterns.patternExpressions;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.ObjectVariable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Ref Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.patternExpressions.ObjectRefExpression#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage#getObjectRefExpression()
 * @model abstract="true"
 * @generated
 */
public interface ObjectRefExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(ObjectVariable)
	 * @see SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage#getObjectRefExpression_Object()
	 * @model required="true"
	 * @generated
	 */
	ObjectVariable getObject();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.patternExpressions.ObjectRefExpression#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectVariable value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ObjectRefExpression
