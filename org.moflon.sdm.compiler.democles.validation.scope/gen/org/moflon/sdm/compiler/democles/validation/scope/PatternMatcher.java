/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import org.eclipse.emf.ecore.EObject;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Matcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher#getValidationReport <em>Validation Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getPatternMatcher()
 * @model abstract="true"
 * @generated
 */
public interface PatternMatcher extends EObject
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
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getPatternMatcher_ValidationReport()
    * @model
    * @generated
    */
   ValidationReport getValidationReport();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher#getValidationReport <em>Validation Report</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validation Report</em>' reference.
    * @see #getValidationReport()
    * @generated
    */
   void setValidationReport(ValidationReport value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model adornmentDataType="org.moflon.sdm.runtime.democles.Adornment"
    * @generated
    */
   ValidationReport generateSearchPlan(Pattern pattern, Adornment adornment, boolean isMultipleMatch);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // PatternMatcher
