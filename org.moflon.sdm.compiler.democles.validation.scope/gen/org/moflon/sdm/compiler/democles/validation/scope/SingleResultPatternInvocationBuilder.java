/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.ecore.EOperation;

import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.SingleResultPatternInvocation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Result Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#getPatternVariableHandler <em>Pattern Variable Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getSingleResultPatternInvocationBuilder()
 * @model
 * @generated
 */
public interface SingleResultPatternInvocationBuilder extends PatternInvocationBuilder
{
   /**
    * Returns the value of the '<em><b>Pattern Variable Handler</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern Variable Handler</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern Variable Handler</em>' containment reference.
    * @see #setPatternVariableHandler(PatternVariableHandler)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getSingleResultPatternInvocationBuilder_PatternVariableHandler()
    * @model containment="true" required="true"
    * @generated
    */
   PatternVariableHandler getPatternVariableHandler();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#getPatternVariableHandler <em>Pattern Variable Handler</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pattern Variable Handler</em>' containment reference.
    * @see #getPatternVariableHandler()
    * @generated
    */
   void setPatternVariableHandler(PatternVariableHandler value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildAction(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildAction(CFNode node, Expression expression, EOperation eOperation);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   SingleResultPatternInvocation createAction();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // SingleResultPatternInvocationBuilder
