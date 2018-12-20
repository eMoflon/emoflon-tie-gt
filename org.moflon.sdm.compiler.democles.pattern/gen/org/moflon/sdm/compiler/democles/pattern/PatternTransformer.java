/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.ecore.EReference;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getExpressionTransformer <em>Expression Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getPatternTransformer()
 * @model
 * @generated
 */
public interface PatternTransformer extends PatternVariableHandler
{
   /**
    * Returns the value of the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Validation Report</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Validation Report</em>' reference.
    * @see #setValidationReport(ValidationReport)
    * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getPatternTransformer_ValidationReport()
    * @model
    * @generated
    */
   ValidationReport getValidationReport();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getValidationReport <em>Validation Report</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validation Report</em>' reference.
    * @see #getValidationReport()
    * @generated
    */
   void setValidationReport(ValidationReport value);

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
    * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getPatternTransformer_ExpressionTransformer()
    * @model
    * @generated
    */
   ExpressionTransformer getExpressionTransformer();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getExpressionTransformer <em>Expression Transformer</em>}' reference.
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
   void addLinkToPattern(LinkVariable linkVariable, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EReference getEReference(LinkVariable linkVariable);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean hasSymbolicParameter(Pattern pattern, String variableName);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isLinkToAdd(LinkVariable linkVariable, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isVariableToAdd(ObjectVariable objectVariable);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void postprocess(StoryPattern storyPattern, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void processLinkVariables(StoryPattern storyPattern, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport transform(StoryPattern storyPattern, Pattern pattern);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // PatternTransformer
