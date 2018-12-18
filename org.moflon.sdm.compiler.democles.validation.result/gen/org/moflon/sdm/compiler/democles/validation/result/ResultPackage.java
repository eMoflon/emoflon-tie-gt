/**
 */
package org.moflon.sdm.compiler.democles.validation.result;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.result.ResultFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.sdm.compiler.democles.validation'"
 * @generated
 */
public interface ResultPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "result";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "platform:/plugin/org.moflon.sdm.compiler.democles.validation.result/model/Result.ecore";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "org.moflon.sdm.compiler.democles.validation.result";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ResultPackage eINSTANCE = org.moflon.sdm.compiler.democles.validation.result.impl.ResultPackageImpl.init();

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl <em>Error Message</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl
    * @see org.moflon.sdm.compiler.democles.validation.result.impl.ResultPackageImpl#getErrorMessage()
    * @generated
    */
   int ERROR_MESSAGE = 0;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ERROR_MESSAGE__VALIDATION_REPORT = 0;

   /**
    * The feature id for the '<em><b>Location</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ERROR_MESSAGE__LOCATION = 1;

   /**
    * The feature id for the '<em><b>Context</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ERROR_MESSAGE__CONTEXT = 2;

   /**
    * The feature id for the '<em><b>Severity</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ERROR_MESSAGE__SEVERITY = 3;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ERROR_MESSAGE__ID = 4;

   /**
    * The number of structural features of the '<em>Error Message</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ERROR_MESSAGE_FEATURE_COUNT = 5;

   /**
    * The number of operations of the '<em>Error Message</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ERROR_MESSAGE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.result.impl.ValidationReportImpl <em>Validation Report</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.result.impl.ValidationReportImpl
    * @see org.moflon.sdm.compiler.democles.validation.result.impl.ResultPackageImpl#getValidationReport()
    * @generated
    */
   int VALIDATION_REPORT = 1;

   /**
    * The feature id for the '<em><b>Error Messages</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATION_REPORT__ERROR_MESSAGES = 0;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATION_REPORT__RESULT = 1;

   /**
    * The number of structural features of the '<em>Validation Report</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATION_REPORT_FEATURE_COUNT = 2;

   /**
    * The operation id for the '<em>Merge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATION_REPORT___MERGE__VALIDATIONREPORT = 0;

   /**
    * The operation id for the '<em>Get Error Message Count</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATION_REPORT___GET_ERROR_MESSAGE_COUNT = 1;

   /**
    * The number of operations of the '<em>Validation Report</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATION_REPORT_OPERATION_COUNT = 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.result.Severity <em>Severity</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.result.Severity
    * @see org.moflon.sdm.compiler.democles.validation.result.impl.ResultPackageImpl#getSeverity()
    * @generated
    */
   int SEVERITY = 2;

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage <em>Error Message</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Error Message</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ErrorMessage
    * @generated
    */
   EClass getErrorMessage();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getValidationReport <em>Validation Report</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Validation Report</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getValidationReport()
    * @see #getErrorMessage()
    * @generated
    */
   EReference getErrorMessage_ValidationReport();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getLocation <em>Location</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Location</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getLocation()
    * @see #getErrorMessage()
    * @generated
    */
   EReference getErrorMessage_Location();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getContext <em>Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Context</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getContext()
    * @see #getErrorMessage()
    * @generated
    */
   EReference getErrorMessage_Context();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getSeverity <em>Severity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Severity</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getSeverity()
    * @see #getErrorMessage()
    * @generated
    */
   EAttribute getErrorMessage_Severity();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ErrorMessage#getId()
    * @see #getErrorMessage()
    * @generated
    */
   EAttribute getErrorMessage_Id();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport <em>Validation Report</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Validation Report</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ValidationReport
    * @generated
    */
   EClass getValidationReport();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getErrorMessages <em>Error Messages</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Error Messages</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getErrorMessages()
    * @see #getValidationReport()
    * @generated
    */
   EReference getValidationReport_ErrorMessages();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getResult <em>Result</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Result</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getResult()
    * @see #getValidationReport()
    * @generated
    */
   EReference getValidationReport_Result();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#merge(org.moflon.sdm.compiler.democles.validation.result.ValidationReport) <em>Merge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Merge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.result.ValidationReport#merge(org.moflon.sdm.compiler.democles.validation.result.ValidationReport)
    * @generated
    */
   EOperation getValidationReport__Merge__ValidationReport();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getErrorMessageCount() <em>Get Error Message Count</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Error Message Count</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.result.ValidationReport#getErrorMessageCount()
    * @generated
    */
   EOperation getValidationReport__GetErrorMessageCount();

   /**
    * Returns the meta object for enum '{@link org.moflon.sdm.compiler.democles.validation.result.Severity <em>Severity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Severity</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.result.Severity
    * @generated
    */
   EEnum getSeverity();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ResultFactory getResultFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each operation of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl <em>Error Message</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl
       * @see org.moflon.sdm.compiler.democles.validation.result.impl.ResultPackageImpl#getErrorMessage()
       * @generated
       */
      EClass ERROR_MESSAGE = eINSTANCE.getErrorMessage();

      /**
       * The meta object literal for the '<em><b>Validation Report</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ERROR_MESSAGE__VALIDATION_REPORT = eINSTANCE.getErrorMessage_ValidationReport();

      /**
       * The meta object literal for the '<em><b>Location</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ERROR_MESSAGE__LOCATION = eINSTANCE.getErrorMessage_Location();

      /**
       * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ERROR_MESSAGE__CONTEXT = eINSTANCE.getErrorMessage_Context();

      /**
       * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ERROR_MESSAGE__SEVERITY = eINSTANCE.getErrorMessage_Severity();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ERROR_MESSAGE__ID = eINSTANCE.getErrorMessage_Id();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.result.impl.ValidationReportImpl <em>Validation Report</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.result.impl.ValidationReportImpl
       * @see org.moflon.sdm.compiler.democles.validation.result.impl.ResultPackageImpl#getValidationReport()
       * @generated
       */
      EClass VALIDATION_REPORT = eINSTANCE.getValidationReport();

      /**
       * The meta object literal for the '<em><b>Error Messages</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VALIDATION_REPORT__ERROR_MESSAGES = eINSTANCE.getValidationReport_ErrorMessages();

      /**
       * The meta object literal for the '<em><b>Result</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VALIDATION_REPORT__RESULT = eINSTANCE.getValidationReport_Result();

      /**
       * The meta object literal for the '<em><b>Merge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATION_REPORT___MERGE__VALIDATIONREPORT = eINSTANCE.getValidationReport__Merge__ValidationReport();

      /**
       * The meta object literal for the '<em><b>Get Error Message Count</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATION_REPORT___GET_ERROR_MESSAGE_COUNT = eINSTANCE.getValidationReport__GetErrorMessageCount();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.result.Severity <em>Severity</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.result.Severity
       * @see org.moflon.sdm.compiler.democles.validation.result.impl.ResultPackageImpl#getSeverity()
       * @generated
       */
      EEnum SEVERITY = eINSTANCE.getSeverity();

   }

} //ResultPackage
