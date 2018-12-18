/**
 */
package SDMLanguage.patterns;

import SDMLanguage.CommentableElement;

import SDMLanguage.activities.StoryNode;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.StoryPattern#getObjectVariable <em>Object Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.StoryPattern#getLinkVariable <em>Link Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.StoryPattern#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link SDMLanguage.patterns.StoryPattern#getVariables <em>Variables</em>}</li>
 *   <li>{@link SDMLanguage.patterns.StoryPattern#getApplicationConditions <em>Application Conditions</em>}</li>
 *   <li>{@link SDMLanguage.patterns.StoryPattern#getStoryNode <em>Story Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.PatternsPackage#getStoryPattern()
 * @model
 * @generated
 */
public interface StoryPattern extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Object Variable</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.ObjectVariable}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.ObjectVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Variable</em>' containment reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getStoryPattern_ObjectVariable()
	 * @see SDMLanguage.patterns.ObjectVariable#getPattern
	 * @model opposite="pattern" containment="true"
	 * @generated
	 */
	EList<ObjectVariable> getObjectVariable();

	/**
	 * Returns the value of the '<em><b>Link Variable</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.LinkVariable}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.LinkVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Variable</em>' containment reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getStoryPattern_LinkVariable()
	 * @see SDMLanguage.patterns.LinkVariable#getPattern
	 * @model opposite="pattern" containment="true"
	 * @generated
	 */
	EList<LinkVariable> getLinkVariable();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getStoryPattern_Constraints()
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraint#getStoryPattern
	 * @model opposite="storyPattern" containment="true"
	 * @generated
	 */
	EList<AttributeConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getStoryPattern_Variables()
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getStoryPattern
	 * @model opposite="storyPattern" containment="true"
	 * @generated
	 */
	EList<AttributeConstraintVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Application Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.ApplicationConditionStoryPattern}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.ApplicationConditionStoryPattern#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Conditions</em>' containment reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getStoryPattern_ApplicationConditions()
	 * @see SDMLanguage.patterns.ApplicationConditionStoryPattern#getStoryPattern
	 * @model opposite="storyPattern" containment="true"
	 * @generated
	 */
	EList<ApplicationConditionStoryPattern> getApplicationConditions();

	/**
	 * Returns the value of the '<em><b>Story Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.activities.StoryNode#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Node</em>' container reference.
	 * @see #setStoryNode(StoryNode)
	 * @see SDMLanguage.patterns.PatternsPackage#getStoryPattern_StoryNode()
	 * @see SDMLanguage.activities.StoryNode#getStoryPattern
	 * @model opposite="storyPattern" required="true" transient="false"
	 * @generated
	 */
	StoryNode getStoryNode();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.StoryPattern#getStoryNode <em>Story Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story Node</em>' container reference.
	 * @see #getStoryNode()
	 * @generated
	 */
	void setStoryNode(StoryNode value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StoryPattern
