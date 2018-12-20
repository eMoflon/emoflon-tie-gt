/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CF Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#getReferences <em>References</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#getScope <em>Scope</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#getReassignments <em>Reassignments</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#getType <em>Type</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#getDestructors <em>Destructors</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#isLocal <em>Local</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.CFVariable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable()
 * @model
 * @generated
 */
public interface CFVariable extends EObject
{
   /**
    * Returns the value of the '<em><b>References</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.VariableReference}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.VariableReference#getFrom <em>From</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>References</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>References</em>' reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_References()
    * @see org.moflon.sdm.runtime.democles.VariableReference#getFrom
    * @model opposite="from"
    * @generated
    */
   EList<VariableReference> getReferences();

   /**
    * Returns the value of the '<em><b>Scope</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Scope#getVariables <em>Variables</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scope</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Scope</em>' container reference.
    * @see #setScope(Scope)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_Scope()
    * @see org.moflon.sdm.runtime.democles.Scope#getVariables
    * @model opposite="variables" required="true" transient="false"
    * @generated
    */
   Scope getScope();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFVariable#getScope <em>Scope</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Scope</em>' container reference.
    * @see #getScope()
    * @generated
    */
   void setScope(Scope value);

   /**
    * Returns the value of the '<em><b>Reassignments</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.Action}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Action#getReassignedVariables <em>Reassigned Variables</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Reassignments</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Reassignments</em>' reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_Reassignments()
    * @see org.moflon.sdm.runtime.democles.Action#getReassignedVariables
    * @model opposite="reassignedVariables"
    * @generated
    */
   EList<Action> getReassignments();

   /**
    * Returns the value of the '<em><b>Constructor</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Action#getConstructedVariables <em>Constructed Variables</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constructor</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Constructor</em>' reference.
    * @see #setConstructor(Action)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_Constructor()
    * @see org.moflon.sdm.runtime.democles.Action#getConstructedVariables
    * @model opposite="constructedVariables"
    * @generated
    */
   Action getConstructor();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFVariable#getConstructor <em>Constructor</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Constructor</em>' reference.
    * @see #getConstructor()
    * @generated
    */
   void setConstructor(Action value);

   /**
    * Returns the value of the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Type</em>' reference.
    * @see #setType(EClassifier)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_Type()
    * @model required="true"
    * @generated
    */
   EClassifier getType();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFVariable#getType <em>Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Type</em>' reference.
    * @see #getType()
    * @generated
    */
   void setType(EClassifier value);

   /**
    * Returns the value of the '<em><b>Destructors</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.NodeDeletion}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.NodeDeletion#getDestructedVariables <em>Destructed Variables</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Destructors</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Destructors</em>' reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_Destructors()
    * @see org.moflon.sdm.runtime.democles.NodeDeletion#getDestructedVariables
    * @model opposite="destructedVariables"
    * @generated
    */
   EList<NodeDeletion> getDestructors();

   /**
    * Returns the value of the '<em><b>Local</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Local</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Local</em>' attribute.
    * @see #setLocal(boolean)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_Local()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isLocal();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFVariable#isLocal <em>Local</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Local</em>' attribute.
    * @see #isLocal()
    * @generated
    */
   void setLocal(boolean value);

   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFVariable_Name()
    * @model required="true" ordered="false"
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFVariable#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   boolean isOnlyDefined();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // CFVariable
