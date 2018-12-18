/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getExpressionTransformer()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionTransformer extends EObject
{
   /**
    * Returns the value of the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Delegate</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Delegate</em>' reference.
    * @see #setDelegate(ExpressionTransformer)
    * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getExpressionTransformer_Delegate()
    * @model
    * @generated
    */
   ExpressionTransformer getDelegate();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#getDelegate <em>Delegate</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Delegate</em>' reference.
    * @see #getDelegate()
    * @generated
    */
   void setDelegate(ExpressionTransformer value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   String lookupErrorMessage(Errors errorID);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void transformAndAssignExpression(ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern,
         Variable variable, EClassifier expectedType);

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
} // ExpressionTransformer
