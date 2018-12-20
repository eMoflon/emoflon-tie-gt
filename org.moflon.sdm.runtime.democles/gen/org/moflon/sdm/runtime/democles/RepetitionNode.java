/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repetition Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.RepetitionNode#getLastNodes <em>Last Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getRepetitionNode()
 * @model abstract="true"
 * @generated
 */
public interface RepetitionNode extends CompoundNode
{
   /**
    * Returns the value of the '<em><b>Last Nodes</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.CFNode}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.CFNode#getHeader <em>Header</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Last Nodes</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Last Nodes</em>' reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getRepetitionNode_LastNodes()
    * @see org.moflon.sdm.runtime.democles.CFNode#getHeader
    * @model opposite="header"
    * @generated
    */
   EList<CFNode> getLastNodes();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean hasShortcuts();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // RepetitionNode
