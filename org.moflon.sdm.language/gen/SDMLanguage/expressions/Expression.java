/**
 */
package SDMLanguage.expressions;

import SDMLanguage.CommentableElement;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SDMLanguage.expressions.ExpressionsPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends CommentableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean compare(Expression expression);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Expression
