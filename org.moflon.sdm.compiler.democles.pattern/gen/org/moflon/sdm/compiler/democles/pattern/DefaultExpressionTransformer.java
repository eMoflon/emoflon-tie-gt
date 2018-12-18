/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.calls.callExpressions.MethodCallExpression;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EClassifier;

import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Expression Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#getCalleeETypeNameCounter <em>Callee EType Name Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getDefaultExpressionTransformer()
 * @model
 * @generated
 */
public interface DefaultExpressionTransformer extends ExpressionTransformer
{
   /**
    * Returns the value of the '<em><b>Callee EType Name Counter</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Callee EType Name Counter</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Callee EType Name Counter</em>' attribute.
    * @see #setCalleeETypeNameCounter(int)
    * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getDefaultExpressionTransformer_CalleeETypeNameCounter()
    * @model required="true" ordered="false"
    * @generated
    */
   int getCalleeETypeNameCounter();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#getCalleeETypeNameCounter <em>Callee EType Name Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Callee EType Name Counter</em>' attribute.
    * @see #getCalleeETypeNameCounter()
    * @generated
    */
   void setCalleeETypeNameCounter(int value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   String createLocalVariableNameAndIncrementCounter();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ConstraintVariable transformExpression(ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern,
         EClassifier expectedType);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void transformMethodInvocation(ValidationReport report, PatternVariableHandler patternVariableHandler, MethodCallExpression methodCallExpression,
         Pattern pattern, Constraint constraint);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void checkTypeCompatibility(ValidationReport report, Expression expression, EClassifier expectedType, EClassifier producedType);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean areEqual(EClassifier left, EClassifier right);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // DefaultExpressionTransformer
