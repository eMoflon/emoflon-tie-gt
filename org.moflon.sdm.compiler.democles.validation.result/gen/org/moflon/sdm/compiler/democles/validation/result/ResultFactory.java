/**
 */
package org.moflon.sdm.compiler.democles.validation.result;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.result.ResultPackage
 * @generated
 */
public interface ResultFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ResultFactory eINSTANCE = org.moflon.sdm.compiler.democles.validation.result.impl.ResultFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Error Message</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Error Message</em>'.
    * @generated
    */
   ErrorMessage createErrorMessage();

   /**
    * Returns a new object of class '<em>Validation Report</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Validation Report</em>'.
    * @generated
    */
   ValidationReport createValidationReport();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ResultPackage getResultPackage();

} //ResultFactory
