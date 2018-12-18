/**
 */
package SDMLanguage.patterns;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Condition Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.ApplicationConditionStoryPattern#getStoryPattern <em>Story Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.PatternsPackage#getApplicationConditionStoryPattern()
 * @model
 * @generated
 */
public interface ApplicationConditionStoryPattern extends StoryPattern {
	/**
	 * Returns the value of the '<em><b>Story Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.StoryPattern#getApplicationConditions <em>Application Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Pattern</em>' container reference.
	 * @see #setStoryPattern(StoryPattern)
	 * @see SDMLanguage.patterns.PatternsPackage#getApplicationConditionStoryPattern_StoryPattern()
	 * @see SDMLanguage.patterns.StoryPattern#getApplicationConditions
	 * @model opposite="applicationConditions" required="true" transient="false"
	 * @generated
	 */
	StoryPattern getStoryPattern();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.ApplicationConditionStoryPattern#getStoryPattern <em>Story Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story Pattern</em>' container reference.
	 * @see #getStoryPattern()
	 * @generated
	 */
	void setStoryPattern(StoryPattern value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ApplicationConditionStoryPattern
