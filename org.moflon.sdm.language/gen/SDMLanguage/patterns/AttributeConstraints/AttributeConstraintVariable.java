/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getStoryPattern <em>Story Pattern</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getAttributeValueConstraints <em>Attribute Value Constraints</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getType <em>Type</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintVariable()
 * @model
 * @generated
 */
public interface AttributeConstraintVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Story Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.StoryPattern#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Pattern</em>' container reference.
	 * @see #setStoryPattern(StoryPattern)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintVariable_StoryPattern()
	 * @see SDMLanguage.patterns.StoryPattern#getVariables
	 * @model opposite="variables" transient="false"
	 * @generated
	 */
	StoryPattern getStoryPattern();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getStoryPattern <em>Story Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story Pattern</em>' container reference.
	 * @see #getStoryPattern()
	 * @generated
	 */
	void setStoryPattern(StoryPattern value);

	/**
	 * Returns the value of the '<em><b>Attribute Value Constraints</b></em>' reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Value Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value Constraints</em>' reference list.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintVariable_AttributeValueConstraints()
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getParameter
	 * @model opposite="parameter"
	 * @generated
	 */
	EList<AttributeValueConstraint> getAttributeValueConstraints();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDataType)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintVariable_Type()
	 * @model
	 * @generated
	 */
	EDataType getType();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDataType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraintVariable_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AttributeConstraintVariable
