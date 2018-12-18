/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.ForEach;
import org.moflon.sdm.runtime.democles.HeadControlledLoop;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.TailControlledLoop;
import org.moflon.sdm.runtime.democles.Visitor;
// <-- [user defined imports]
// [user defined imports] -->

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
