/**
 */
package org.moflon.sdm.runtime.democles;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform No Operation Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getUniformNoOperationVisitor()
 * @model
 * @generated
 */
public interface UniformNoOperationVisitor extends Visitor
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitForEach(ForEach forEach);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitHeadControlledLoop(HeadControlledLoop headControlledLoop);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitIfStatement(IfStatement ifStatement);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitTailControlledLoop(TailControlledLoop tailControlledLoop);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // UniformNoOperationVisitor
