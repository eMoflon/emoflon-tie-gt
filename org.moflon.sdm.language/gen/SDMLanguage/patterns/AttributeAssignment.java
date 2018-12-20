/**
 */
package SDMLanguage.patterns;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeAssignment#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeAssignment#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.PatternsPackage#getAttributeAssignment()
 * @model
 * @generated
 */
public interface AttributeAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Variable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.ObjectVariable#getAttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Variable</em>' container reference.
	 * @see #setObjectVariable(ObjectVariable)
	 * @see SDMLanguage.patterns.PatternsPackage#getAttributeAssignment_ObjectVariable()
	 * @see SDMLanguage.patterns.ObjectVariable#getAttributeAssignment
	 * @model opposite="attributeAssignment" required="true" transient="false"
	 * @generated
	 */
	ObjectVariable getObjectVariable();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Variable</em>' container reference.
	 * @see #getObjectVariable()
	 * @generated
	 */
	void setObjectVariable(ObjectVariable value);

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
	 * @see SDMLanguage.patterns.PatternsPackage#getAttributeAssignment_ValueExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeAssignment#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

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
	 * @see SDMLanguage.patterns.PatternsPackage#getAttributeAssignment_Attribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAttribute();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeAssignment#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EAttribute value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AttributeAssignment
