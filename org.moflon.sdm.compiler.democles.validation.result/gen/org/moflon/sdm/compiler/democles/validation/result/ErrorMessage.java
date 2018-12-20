/**
 */
package org.moflon.sdm.compiler.democles.validation.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getLocation <em>Location</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getContext <em>Context</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getErrorMessage()
 * @model
 * @generated
 */
public interface ErrorMessage extends EObject
{
   /**
    * Returns the value of the '<em><b>Validation Report</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getErrorMessages <em>Error Messages</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Validation Report</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Validation Report</em>' container reference.
    * @see #setValidationReport(ValidationReport)
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getErrorMessage_ValidationReport()
    * @see org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getErrorMessages
    * @model opposite="errorMessages" required="true" transient="false"
    * @generated
    */
   ValidationReport getValidationReport();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getValidationReport <em>Validation Report</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validation Report</em>' container reference.
    * @see #getValidationReport()
    * @generated
    */
   void setValidationReport(ValidationReport value);

   /**
    * Returns the value of the '<em><b>Location</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Location</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Location</em>' reference list.
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getErrorMessage_Location()
    * @model
    * @generated
    */
   EList<EObject> getLocation();

   /**
    * Returns the value of the '<em><b>Context</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Context</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Context</em>' reference list.
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getErrorMessage_Context()
    * @model
    * @generated
    */
   EList<EObject> getContext();

   /**
    * Returns the value of the '<em><b>Severity</b></em>' attribute.
    * The literals are from the enumeration {@link org.moflon.sdm.compiler.democles.validation.result.Severity}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Severity</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Severity</em>' attribute.
    * @see org.moflon.sdm.compiler.democles.validation.result.Severity
    * @see #setSeverity(Severity)
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getErrorMessage_Severity()
    * @model required="true" ordered="false"
    * @generated
    */
   Severity getSeverity();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getSeverity <em>Severity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Severity</em>' attribute.
    * @see org.moflon.sdm.compiler.democles.validation.result.Severity
    * @see #getSeverity()
    * @generated
    */
   void setSeverity(Severity value);

   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#getErrorMessage_Id()
    * @model ordered="false"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ErrorMessage
