/**
 */
package SDMLanguage.expressions;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.expressions.ComparisonExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.expressions.ExpressionsPackage#getComparisonExpression()
 * @model
 * @generated
 */
public interface ComparisonExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SDMLanguage.expressions.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SDMLanguage.expressions.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see SDMLanguage.expressions.ExpressionsPackage#getComparisonExpression_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link SDMLanguage.expressions.ComparisonExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SDMLanguage.expressions.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ComparisonExpression
