/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getContainedVariables <em>Contained Variables</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getContainedConstraints <em>Contained Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintExpression()
 * @model
 * @generated
 */
public interface AttributeConstraintExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' reference.
	 * @see #setTargetVariable(AttributeConstraintVariable)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintExpression_TargetVariable()
	 * @model required="true"
	 * @generated
	 */
	AttributeConstraintVariable getTargetVariable();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getTargetVariable <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' reference.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(AttributeConstraintVariable value);

	/**
	 * Returns the value of the '<em><b>Contained Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Variables</em>' containment reference list.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintExpression_ContainedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeConstraintVariable> getContainedVariables();

	/**
	 * Returns the value of the '<em><b>Contained Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Constraints</em>' containment reference list.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintExpression_ContainedConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeConstraint> getContainedConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean compare(Expression expression);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AttributeConstraintExpression
