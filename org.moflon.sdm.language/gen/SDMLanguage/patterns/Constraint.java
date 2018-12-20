/**
 */
package SDMLanguage.patterns;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}</li>
 *   <li>{@link SDMLanguage.patterns.Constraint#getObjectVariable <em>Object Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.PatternsPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Expression</em>' containment reference.
	 * @see #setConstraintExpression(Expression)
	 * @see SDMLanguage.patterns.PatternsPackage#getConstraint_ConstraintExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getConstraintExpression();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Expression</em>' containment reference.
	 * @see #getConstraintExpression()
	 * @generated
	 */
	void setConstraintExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Object Variable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.ObjectVariable#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Variable</em>' container reference.
	 * @see #setObjectVariable(ObjectVariable)
	 * @see SDMLanguage.patterns.PatternsPackage#getConstraint_ObjectVariable()
	 * @see SDMLanguage.patterns.ObjectVariable#getConstraint
	 * @model opposite="constraint" required="true" transient="false"
	 * @generated
	 */
	ObjectVariable getObjectVariable();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.Constraint#getObjectVariable <em>Object Variable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Variable</em>' container reference.
	 * @see #getObjectVariable()
	 * @generated
	 */
	void setObjectVariable(ObjectVariable value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Constraint
