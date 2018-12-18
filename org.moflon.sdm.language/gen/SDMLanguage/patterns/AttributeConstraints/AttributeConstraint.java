/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint#getStoryPattern <em>Story Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraint()
 * @model
 * @generated
 */
public interface AttributeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Story Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.StoryPattern#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Pattern</em>' container reference.
	 * @see #setStoryPattern(StoryPattern)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getAttributeConstraint_StoryPattern()
	 * @see SDMLanguage.patterns.StoryPattern#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	StoryPattern getStoryPattern();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint#getStoryPattern <em>Story Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story Pattern</em>' container reference.
	 * @see #getStoryPattern()
	 * @generated
	 */
	void setStoryPattern(StoryPattern value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AttributeConstraint
