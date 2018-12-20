/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EClassifier;

import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Expression Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer#getConstantTransformer <em>Constant Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getLiteralExpressionTransformer()
 * @model
 * @generated
 */
public interface LiteralExpressionTransformer extends ExpressionTransformer
{
   /**
    * Returns the value of the '<em><b>Constant Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constant Transformer</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Constant Transformer</em>' reference.
    * @see #setConstantTransformer(ConstantTransformer)
    * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getLiteralExpressionTransformer_ConstantTransformer()
    * @model
    * @generated
    */
   ConstantTransformer getConstantTransformer();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer#getConstantTransformer <em>Constant Transformer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Constant Transformer</em>' reference.
    * @see #getConstantTransformer()
    * @generated
    */
   void setConstantTransformer(ConstantTransformer value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ConstraintVariable transformExpression(ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern,
         EClassifier expectedType);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // LiteralExpressionTransformer
