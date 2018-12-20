/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import SDMLanguage.patterns.ObjectVariable;

import org.eclipse.emf.ecore.EAttribute;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getParameter <em>Parameter</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getObjectVariable <em>Object Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeValueConstraint()
 * @model
 * @generated
 */
public interface AttributeValueConstraint extends AttributeConstraint {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getAttributeValueConstraints <em>Attribute Value Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(AttributeConstraintVariable)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeValueConstraint_Parameter()
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getAttributeValueConstraints
	 * @model opposite="attributeValueConstraints"
	 * @generated
	 */
	AttributeConstraintVariable getParameter();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(AttributeConstraintVariable value);

	/**
	 * Returns the value of the '<em><b>Object Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Variable</em>' reference.
	 * @see #setObjectVariable(ObjectVariable)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeValueConstraint_ObjectVariable()
	 * @model
	 * @generated
	 */
	ObjectVariable getObjectVariable();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getObjectVariable <em>Object Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Variable</em>' reference.
	 * @see #getObjectVariable()
	 * @generated
	 */
	void setObjectVariable(ObjectVariable value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EAttribute)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeValueConstraint_Type()
	 * @model
	 * @generated
	 */
	EAttribute getType();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EAttribute value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AttributeValueConstraint
