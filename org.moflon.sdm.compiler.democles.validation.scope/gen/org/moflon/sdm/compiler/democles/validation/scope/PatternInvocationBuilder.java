/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import org.eclipse.emf.ecore.EClassifier;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getExpressionExplorer <em>Expression Explorer</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getPatternMatcher <em>Pattern Matcher</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getPatternInvocationBuilder()
 * @model abstract="true"
 * @generated
 */
public interface PatternInvocationBuilder extends ActionBuilder
{
   /**
    * Returns the value of the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Expression Explorer</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Expression Explorer</em>' reference.
    * @see #setExpressionExplorer(ExpressionExplorer)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getPatternInvocationBuilder_ExpressionExplorer()
    * @model
    * @generated
    */
   ExpressionExplorer getExpressionExplorer();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getExpressionExplorer <em>Expression Explorer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Expression Explorer</em>' reference.
    * @see #getExpressionExplorer()
    * @generated
    */
   void setExpressionExplorer(ExpressionExplorer value);

   /**
    * Returns the value of the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern Matcher</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern Matcher</em>' reference.
    * @see #setPatternMatcher(PatternMatcher)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getPatternInvocationBuilder_PatternMatcher()
    * @model
    * @generated
    */
   PatternMatcher getPatternMatcher();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getPatternMatcher <em>Pattern Matcher</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pattern Matcher</em>' reference.
    * @see #getPatternMatcher()
    * @generated
    */
   void setPatternMatcher(PatternMatcher value);

   /**
    * Returns the value of the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Suffix</em>' attribute.
    * @see #setSuffix(String)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getPatternInvocationBuilder_Suffix()
    * @model required="true" ordered="false"
    * @generated
    */
   String getSuffix();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getSuffix <em>Suffix</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Suffix</em>' attribute.
    * @see #getSuffix()
    * @generated
    */
   void setSuffix(String value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void attachToResource(CFNode node, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model dataType="org.moflon.sdm.runtime.democles.Adornment"
    * @generated
    */
   Adornment calculateAdornment(PatternInvocation invocation);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   String calculatePatternName(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   PatternInvocation createAction();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void handlePatternMatcherReport(PatternInvocation invocation, ValidationReport report);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   VariableReference handleVariableReference(Variable variable, EClassifier variableType);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean hasErrors();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   PatternInvocation lookupAction(CFNode node);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // PatternInvocationBuilder
