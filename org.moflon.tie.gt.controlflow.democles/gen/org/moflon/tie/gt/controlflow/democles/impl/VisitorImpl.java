/**
 */
package org.moflon.tie.gt.controlflow.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;
import org.moflon.tie.gt.controlflow.democles.ForEach;
import org.moflon.tie.gt.controlflow.democles.HeadControlledLoop;
import org.moflon.tie.gt.controlflow.democles.IfStatement;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.TailControlledLoop;
import org.moflon.tie.gt.controlflow.democles.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VisitorImpl extends EObjectImpl implements Visitor
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected VisitorImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return DemoclesPackage.Literals.VISITOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitHeadControlledLoop(HeadControlledLoop headControlledLoop)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitIfStatement(IfStatement ifStatement)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitNode(CFNode node)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitScope(Scope scope)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitTailControlledLoop(TailControlledLoop tailControlledLoop)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitForEach(ForEach forEach)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case DemoclesPackage.VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP:
         visitHeadControlledLoop((HeadControlledLoop) arguments.get(0));
         return null;
      case DemoclesPackage.VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT:
         visitIfStatement((IfStatement) arguments.get(0));
         return null;
      case DemoclesPackage.VISITOR___VISIT_NODE__CFNODE:
         visitNode((CFNode) arguments.get(0));
         return null;
      case DemoclesPackage.VISITOR___VISIT_SCOPE__SCOPE:
         visitScope((Scope) arguments.get(0));
         return null;
      case DemoclesPackage.VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP:
         visitTailControlledLoop((TailControlledLoop) arguments.get(0));
         return null;
      case DemoclesPackage.VISITOR___VISIT_FOR_EACH__FOREACH:
         visitForEach((ForEach) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //VisitorImpl
