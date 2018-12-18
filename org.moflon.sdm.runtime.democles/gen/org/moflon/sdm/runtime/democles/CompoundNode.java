/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.CompoundNode#getScopes <em>Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCompoundNode()
 * @model abstract="true"
 * @generated
 */
public interface CompoundNode extends CFNode
{
   /**
    * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.Scope}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.Scope#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Scopes</em>' containment reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCompoundNode_Scopes()
    * @see org.moflon.sdm.runtime.democles.Scope#getParent
    * @model opposite="parent" containment="true" required="true"
    * @generated
    */
   EList<Scope> getScopes();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   Scope getRelevantScope();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // CompoundNode
