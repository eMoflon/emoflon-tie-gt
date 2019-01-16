/**
 */
package org.moflon.tie.gt.controlflow.democles;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage#getVisitor()
 * @model
 * @generated
 */
public interface Visitor extends EObject
{
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
   void visitNode(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitScope(Scope scope);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitTailControlledLoop(TailControlledLoop tailControlledLoop);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitForEach(ForEach forEach);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Visitor
