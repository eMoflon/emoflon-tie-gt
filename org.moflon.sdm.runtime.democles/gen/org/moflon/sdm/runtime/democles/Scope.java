/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.Scope#getParent <em>Parent</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Scope#getNextScope <em>Next Scope</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Scope#getPreviousScope <em>Previous Scope</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Scope#getContents <em>Contents</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.Scope#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
   /**
    * Returns the value of the '<em><b>Parent</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CompoundNode#getScopes <em>Scopes</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent</em>' container reference.
    * @see #setParent(CompoundNode)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getScope_Parent()
    * @see org.moflon.sdm.runtime.democles.CompoundNode#getScopes
    * @model opposite="scopes" transient="false"
    * @generated
    */
   CompoundNode getParent();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.Scope#getParent <em>Parent</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent</em>' container reference.
    * @see #getParent()
    * @generated
    */
   void setParent(CompoundNode value);

   /**
    * Returns the value of the '<em><b>Next Scope</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Scope#getPreviousScope <em>Previous Scope</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Next Scope</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Next Scope</em>' containment reference.
    * @see #setNextScope(Scope)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getScope_NextScope()
    * @see org.moflon.sdm.runtime.democles.Scope#getPreviousScope
    * @model opposite="previousScope" containment="true"
    * @generated
    */
   Scope getNextScope();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.Scope#getNextScope <em>Next Scope</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Next Scope</em>' containment reference.
    * @see #getNextScope()
    * @generated
    */
   void setNextScope(Scope value);

   /**
    * Returns the value of the '<em><b>Previous Scope</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Scope#getNextScope <em>Next Scope</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Previous Scope</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Previous Scope</em>' container reference.
    * @see #setPreviousScope(Scope)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getScope_PreviousScope()
    * @see org.moflon.sdm.runtime.democles.Scope#getNextScope
    * @model opposite="nextScope" transient="false"
    * @generated
    */
   Scope getPreviousScope();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.Scope#getPreviousScope <em>Previous Scope</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Previous Scope</em>' container reference.
    * @see #getPreviousScope()
    * @generated
    */
   void setPreviousScope(Scope value);

   /**
    * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.CFNode}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CFNode#getScope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Contents</em>' containment reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getScope_Contents()
    * @see org.moflon.sdm.runtime.democles.CFNode#getScope
    * @model opposite="scope" containment="true"
    * @generated
    */
   EList<CFNode> getContents();

   /**
    * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.CFVariable}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CFVariable#getScope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Variables</em>' containment reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getScope_Variables()
    * @see org.moflon.sdm.runtime.democles.CFVariable#getScope
    * @model opposite="scope" containment="true"
    * @generated
    */
   EList<CFVariable> getVariables();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void accept(Visitor visitor);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Scope
