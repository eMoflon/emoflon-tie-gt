/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.Action#getReassignedVariables <em>Reassigned Variables</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Action#getCfNode <em>Cf Node</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Action#getConstructedVariables <em>Constructed Variables</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Action#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Action#getPrev <em>Prev</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
   /**
    * Returns the value of the '<em><b>Reassigned Variables</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.CFVariable}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CFVariable#getReassignments <em>Reassignments</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Reassigned Variables</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Reassigned Variables</em>' reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getAction_ReassignedVariables()
    * @see org.moflon.sdm.runtime.democles.CFVariable#getReassignments
    * @model opposite="reassignments"
    * @generated
    */
   EList<CFVariable> getReassignedVariables();

   /**
    * Returns the value of the '<em><b>Cf Node</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CFNode#getActions <em>Actions</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Cf Node</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Cf Node</em>' container reference.
    * @see #setCfNode(CFNode)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getAction_CfNode()
    * @see org.moflon.sdm.runtime.democles.CFNode#getActions
    * @model opposite="actions" required="true" transient="false"
    * @generated
    */
   CFNode getCfNode();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.Action#getCfNode <em>Cf Node</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Cf Node</em>' container reference.
    * @see #getCfNode()
    * @generated
    */
   void setCfNode(CFNode value);

   /**
    * Returns the value of the '<em><b>Constructed Variables</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.CFVariable}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CFVariable#getConstructor <em>Constructor</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constructed Variables</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Constructed Variables</em>' reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getAction_ConstructedVariables()
    * @see org.moflon.sdm.runtime.democles.CFVariable#getConstructor
    * @model opposite="constructor"
    * @generated
    */
   EList<CFVariable> getConstructedVariables();

   /**
    * Returns the value of the '<em><b>Next</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Action#getPrev <em>Prev</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Next</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Next</em>' reference.
    * @see #setNext(Action)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getAction_Next()
    * @see org.moflon.sdm.runtime.democles.Action#getPrev
    * @model opposite="prev"
    * @generated
    */
   Action getNext();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.Action#getNext <em>Next</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Next</em>' reference.
    * @see #getNext()
    * @generated
    */
   void setNext(Action value);

   /**
    * Returns the value of the '<em><b>Prev</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Action#getNext <em>Next</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Prev</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Prev</em>' reference.
    * @see #setPrev(Action)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getAction_Prev()
    * @see org.moflon.sdm.runtime.democles.Action#getNext
    * @model opposite="next"
    * @generated
    */
   Action getPrev();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.Action#getPrev <em>Prev</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Prev</em>' reference.
    * @see #getPrev()
    * @generated
    */
   void setPrev(Action value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean hasReferencedFreeParameters();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Action
