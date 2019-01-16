/**
 */
package org.moflon.tie.gt.controlflow.democles;

import org.eclipse.emf.ecore.EObject;

import org.gervarro.democles.specification.emf.Variable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.VariableReference#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.VariableReference#getTo <em>To</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.VariableReference#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends EObject
{
   /**
    * Returns the value of the '<em><b>Invocation</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.tie.gt.controlflow.democles.PatternInvocation#getParameters <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Invocation</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Invocation</em>' container reference.
    * @see #setInvocation(PatternInvocation)
    * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage#getVariableReference_Invocation()
    * @see org.moflon.tie.gt.controlflow.democles.PatternInvocation#getParameters
    * @model opposite="parameters" required="true" transient="false"
    * @generated
    */
   PatternInvocation getInvocation();

   /**
    * Sets the value of the '{@link org.moflon.tie.gt.controlflow.democles.VariableReference#getInvocation <em>Invocation</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Invocation</em>' container reference.
    * @see #getInvocation()
    * @generated
    */
   void setInvocation(PatternInvocation value);

   /**
    * Returns the value of the '<em><b>To</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>To</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>To</em>' reference.
    * @see #setTo(Variable)
    * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage#getVariableReference_To()
    * @model required="true"
    * @generated
    */
   Variable getTo();

   /**
    * Sets the value of the '{@link org.moflon.tie.gt.controlflow.democles.VariableReference#getTo <em>To</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>To</em>' reference.
    * @see #getTo()
    * @generated
    */
   void setTo(Variable value);

   /**
    * Returns the value of the '<em><b>From</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.tie.gt.controlflow.democles.CFVariable#getReferences <em>References</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>From</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>From</em>' reference.
    * @see #setFrom(CFVariable)
    * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage#getVariableReference_From()
    * @see org.moflon.tie.gt.controlflow.democles.CFVariable#getReferences
    * @model opposite="references" required="true"
    * @generated
    */
   CFVariable getFrom();

   /**
    * Sets the value of the '{@link org.moflon.tie.gt.controlflow.democles.VariableReference#getFrom <em>From</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>From</em>' reference.
    * @see #getFrom()
    * @generated
    */
   void setFrom(CFVariable value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   boolean isFree();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   boolean isConstructed();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   boolean isReassigned();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // VariableReference
