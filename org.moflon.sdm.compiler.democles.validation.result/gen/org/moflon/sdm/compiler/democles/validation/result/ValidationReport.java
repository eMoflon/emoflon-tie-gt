/**
 */
package org.moflon.sdm.compiler.democles.validation.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getErrorMessages <em>Error Messages</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getValidationReport()
 * @model
 * @generated
 */
public interface ValidationReport extends EObject
{
   /**
    * Returns the value of the '<em><b>Error Messages</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getValidationReport <em>Validation Report</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Error Messages</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Error Messages</em>' containment reference list.
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getValidationReport_ErrorMessages()
    * @see org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getValidationReport
    * @model opposite="validationReport" containment="true"
    * @generated
    */
   EList<ErrorMessage> getErrorMessages();

   /**
    * Returns the value of the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Result</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Result</em>' reference.
    * @see #setResult(EObject)
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getValidationReport_Result()
    * @model
    * @generated
    */
   EObject getResult();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getResult <em>Result</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Result</em>' reference.
    * @see #getResult()
    * @generated
    */
   void setResult(EObject value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void merge(ValidationReport otherReport);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   int getErrorMessageCount();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ValidationReport
