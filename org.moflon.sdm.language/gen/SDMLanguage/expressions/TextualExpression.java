/**
 */
package SDMLanguage.expressions;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.expressions.TextualExpression#getExpressionText <em>Expression Text</em>}</li>
 *   <li>{@link SDMLanguage.expressions.TextualExpression#getLanguage <em>Language</em>}</li>
 *   <li>{@link SDMLanguage.expressions.TextualExpression#getLanguageVersion <em>Language Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.expressions.ExpressionsPackage#getTextualExpression()
 * @model
 * @generated
 */
public interface TextualExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Text</em>' attribute.
	 * @see #setExpressionText(String)
	 * @see SDMLanguage.expressions.ExpressionsPackage#getTextualExpression_ExpressionText()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getExpressionText();

	/**
	 * Sets the value of the '{@link SDMLanguage.expressions.TextualExpression#getExpressionText <em>Expression Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Text</em>' attribute.
	 * @see #getExpressionText()
	 * @generated
	 */
	void setExpressionText(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see SDMLanguage.expressions.ExpressionsPackage#getTextualExpression_Language()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link SDMLanguage.expressions.TextualExpression#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Language Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Version</em>' attribute.
	 * @see #setLanguageVersion(String)
	 * @see SDMLanguage.expressions.ExpressionsPackage#getTextualExpression_LanguageVersion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguageVersion();

	/**
	 * Sets the value of the '{@link SDMLanguage.expressions.TextualExpression#getLanguageVersion <em>Language Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Version</em>' attribute.
	 * @see #getLanguageVersion()
	 * @generated
	 */
	void setLanguageVersion(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TextualExpression
