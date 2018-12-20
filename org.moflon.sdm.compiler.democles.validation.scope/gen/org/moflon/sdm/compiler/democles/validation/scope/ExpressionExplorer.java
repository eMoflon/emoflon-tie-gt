/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Explorer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#getExpressionTransformer <em>Expression Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getExpressionExplorer()
 * @model
 * @generated
 */
public interface ExpressionExplorer extends EObject
{
   /**
    * Returns the value of the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Expression Transformer</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Expression Transformer</em>' reference.
    * @see #setExpressionTransformer(ExpressionTransformer)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getExpressionExplorer_ExpressionTransformer()
    * @model
    * @generated
    */
   ExpressionTransformer getExpressionTransformer();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#getExpressionTransformer <em>Expression Transformer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Expression Transformer</em>' reference.
    * @see #getExpressionTransformer()
    * @generated
    */
   void setExpressionTransformer(ExpressionTransformer value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void exploreExpression(PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, Expression expression);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void handleSymbolicParameter(PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, String variableName, EClassifier variableType);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ExpressionExplorer
