/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.UniformNoOperationVisitor;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Allocator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getIdentifierAllocator()
 * @model
 * @generated
 */
public interface IdentifierAllocator extends UniformNoOperationVisitor
{
   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(int)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getIdentifierAllocator_Id()
    * @model required="true" ordered="false"
    * @generated
    */
   int getId();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(int value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   int incrementIdentifier();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitNode(CFNode node);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // IdentifierAllocator
