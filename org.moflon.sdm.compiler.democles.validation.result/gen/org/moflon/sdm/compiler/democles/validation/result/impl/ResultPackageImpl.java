/**
 */
package org.moflon.sdm.compiler.democles.validation.result.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.ResultPackage;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultPackageImpl extends EPackageImpl implements ResultPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass errorMessageEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass validationReportEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum severityEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ResultPackageImpl()
   {
      super(eNS_URI, ResultFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link ResultPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ResultPackage init()
   {
      if (isInited)
         return (ResultPackage) EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);

      // Obtain or create and register package
      ResultPackageImpl theResultPackage = (ResultPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResultPackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new ResultPackageImpl());

      isInited = true;

      // Create package meta-data objects
      theResultPackage.createPackageContents();

      // Initialize created meta-data
      theResultPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theResultPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ResultPackage.eNS_URI, theResultPackage);
      return theResultPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getErrorMessage()
   {
      return errorMessageEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getErrorMessage_ValidationReport()
   {
      return (EReference) errorMessageEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getErrorMessage_Location()
   {
      return (EReference) errorMessageEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getErrorMessage_Context()
   {
      return (EReference) errorMessageEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getErrorMessage_Severity()
   {
      return (EAttribute) errorMessageEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getErrorMessage_Id()
   {
      return (EAttribute) errorMessageEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getValidationReport()
   {
      return validationReportEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getValidationReport_ErrorMessages()
   {
      return (EReference) validationReportEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getValidationReport_Result()
   {
      return (EReference) validationReportEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidationReport__Merge__ValidationReport()
   {
      return validationReportEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidationReport__GetErrorMessageCount()
   {
      return validationReportEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getSeverity()
   {
      return severityEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResultFactory getResultFactory()
   {
      return (ResultFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      errorMessageEClass = createEClass(ERROR_MESSAGE);
      createEReference(errorMessageEClass, ERROR_MESSAGE__VALIDATION_REPORT);
      createEReference(errorMessageEClass, ERROR_MESSAGE__LOCATION);
      createEReference(errorMessageEClass, ERROR_MESSAGE__CONTEXT);
      createEAttribute(errorMessageEClass, ERROR_MESSAGE__SEVERITY);
      createEAttribute(errorMessageEClass, ERROR_MESSAGE__ID);

      validationReportEClass = createEClass(VALIDATION_REPORT);
      createEReference(validationReportEClass, VALIDATION_REPORT__ERROR_MESSAGES);
      createEReference(validationReportEClass, VALIDATION_REPORT__RESULT);
      createEOperation(validationReportEClass, VALIDATION_REPORT___MERGE__VALIDATIONREPORT);
      createEOperation(validationReportEClass, VALIDATION_REPORT___GET_ERROR_MESSAGE_COUNT);

      // Create enums
      severityEEnum = createEEnum(SEVERITY);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes

      // Initialize classes, features, and operations; add parameters
      initEClass(errorMessageEClass, ErrorMessage.class, "ErrorMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getErrorMessage_ValidationReport(), this.getValidationReport(), this.getValidationReport_ErrorMessages(), "validationReport", null, 1, 1,
            ErrorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
      initEReference(getErrorMessage_Location(), ecorePackage.getEObject(), null, "location", null, 0, -1, ErrorMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getErrorMessage_Context(), ecorePackage.getEObject(), null, "context", null, 0, -1, ErrorMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getErrorMessage_Severity(), this.getSeverity(), "severity", null, 1, 1, ErrorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getErrorMessage_Id(), ecorePackage.getEString(), "id", null, 0, 1, ErrorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(validationReportEClass, ValidationReport.class, "ValidationReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getValidationReport_ErrorMessages(), this.getErrorMessage(), this.getErrorMessage_ValidationReport(), "errorMessages", null, 0, -1,
            ValidationReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
      initEReference(getValidationReport_Result(), ecorePackage.getEObject(), null, "result", null, 0, 1, ValidationReport.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      EOperation op = initEOperation(getValidationReport__Merge__ValidationReport(), null, "merge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getValidationReport(), "otherReport", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getValidationReport__GetErrorMessageCount(), ecorePackage.getEInt(), "getErrorMessageCount", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(severityEEnum, Severity.class, "Severity");
      addEEnumLiteral(severityEEnum, Severity.OK);
      addEEnumLiteral(severityEEnum, Severity.INFO);
      addEEnumLiteral(severityEEnum, Severity.WARNING);
      addEEnumLiteral(severityEEnum, Severity.ERROR);
      addEEnumLiteral(severityEEnum, Severity.FATAL);

      // Create resource
      createResource(eNS_URI);
   }

} //ResultPackageImpl
