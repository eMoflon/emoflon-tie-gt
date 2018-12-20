/**
 */
package SDMLanguage.activities;

import SDMLanguage.patterns.StoryPattern;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.activities.StoryNode#getStoryPattern <em>Story Pattern</em>}</li>
 *   <li>{@link SDMLanguage.activities.StoryNode#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.activities.ActivitiesPackage#getStoryNode()
 * @model
 * @generated
 */
public interface StoryNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Story Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.StoryPattern#getStoryNode <em>Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Pattern</em>' containment reference.
	 * @see #setStoryPattern(StoryPattern)
	 * @see SDMLanguage.activities.ActivitiesPackage#getStoryNode_StoryPattern()
	 * @see SDMLanguage.patterns.StoryPattern#getStoryNode
	 * @model opposite="storyNode" containment="true" required="true"
	 * @generated
	 */
	StoryPattern getStoryPattern();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.StoryNode#getStoryPattern <em>Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story Pattern</em>' containment reference.
	 * @see #getStoryPattern()
	 * @generated
	 */
	void setStoryPattern(StoryPattern value);

	/**
	 * Returns the value of the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Each</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Each</em>' attribute.
	 * @see #setForEach(boolean)
	 * @see SDMLanguage.activities.ActivitiesPackage#getStoryNode_ForEach()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isForEach();

	/**
	 * Sets the value of the '{@link SDMLanguage.activities.StoryNode#isForEach <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' attribute.
	 * @see #isForEach()
	 * @generated
	 */
	void setForEach(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StoryNode
