/**
 */
package SDMLanguage.patterns.patternExpressions;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EAttribute;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.patternExpressions.AttributeValueExpression#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage#getAttributeValueExpression()
 * @model
 * @generated
 */
public interface AttributeValueExpression extends ObjectRefExpression, Expression {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(EAttribute)
	 * @see SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage#getAttributeValueExpression_Attribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAttribute();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.patternExpressions.AttributeValueExpression#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EAttribute value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AttributeValueExpression
