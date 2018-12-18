/**
 */
package org.moflon.sdm.runtime.democles;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends CompoundNode
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void accept(Visitor visitor);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   Scope getRelevantScope();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // IfStatement
