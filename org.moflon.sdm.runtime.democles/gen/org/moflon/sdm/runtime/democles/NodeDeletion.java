/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Deletion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.NodeDeletion#getDestructedVariables <em>Destructed Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getNodeDeletion()
 * @model
 * @generated
 */
public interface NodeDeletion extends Action
{
   /**
    * Returns the value of the '<em><b>Destructed Variables</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.CFVariable}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CFVariable#getDestructors <em>Destructors</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Destructed Variables</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Destructed Variables</em>' reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getNodeDeletion_DestructedVariables()
    * @see org.moflon.sdm.runtime.democles.CFVariable#getDestructors
    * @model opposite="destructors"
    * @generated
    */
   EList<CFVariable> getDestructedVariables();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // NodeDeletion
