/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import SDMLanguage.activities.Activity;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.sdm.runtime.democles.Scope;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moflon Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getRootScope <em>Root Scope</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getMoflonOperation()
 * @model
 * @generated
 */
public interface MoflonOperation extends EObject, EOperation
{
   /**
    * Returns the value of the '<em><b>Root Scope</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Root Scope</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Root Scope</em>' containment reference.
    * @see #setRootScope(Scope)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getMoflonOperation_RootScope()
    * @model containment="true"
    * @generated
    */
   Scope getRootScope();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getRootScope <em>Root Scope</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Root Scope</em>' containment reference.
    * @see #getRootScope()
    * @generated
    */
   void setRootScope(Scope value);

   /**
    * Returns the value of the '<em><b>Activity</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Activity</em>' containment reference.
    * @see #setActivity(Activity)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getMoflonOperation_Activity()
    * @model containment="true"
    * @generated
    */
   Activity getActivity();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getActivity <em>Activity</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Activity</em>' containment reference.
    * @see #getActivity()
    * @generated
    */
   void setActivity(Activity value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // MoflonOperation
