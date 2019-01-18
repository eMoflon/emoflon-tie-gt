/**
 */
package org.moflon.tie.gt.controlflow.democles;

import org.eclipse.emf.ecore.EClassifier;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Result Pattern Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.SingleResultPatternInvocation#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage#getSingleResultPatternInvocation()
 * @model
 * @generated
 */
public interface SingleResultPatternInvocation extends PatternInvocation
{
   /**
    * Returns the value of the '<em><b>Return Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Return Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Return Type</em>' reference.
    * @see #setReturnType(EClassifier)
    * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage#getSingleResultPatternInvocation_ReturnType()
    * @model
    * @generated
    */
   EClassifier getReturnType();

   /**
    * Sets the value of the '{@link org.moflon.tie.gt.controlflow.democles.SingleResultPatternInvocation#getReturnType <em>Return Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Return Type</em>' reference.
    * @see #getReturnType()
    * @generated
    */
   void setReturnType(EClassifier value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // SingleResultPatternInvocation
