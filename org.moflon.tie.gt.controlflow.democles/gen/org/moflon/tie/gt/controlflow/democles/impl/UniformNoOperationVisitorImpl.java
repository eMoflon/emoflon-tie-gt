/**
 */
package org.moflon.tie.gt.controlflow.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;
import org.moflon.tie.gt.controlflow.democles.ForEach;
import org.moflon.tie.gt.controlflow.democles.HeadControlledLoop;
import org.moflon.tie.gt.controlflow.democles.IfStatement;
import org.moflon.tie.gt.controlflow.democles.TailControlledLoop;
import org.moflon.tie.gt.controlflow.democles.UniformNoOperationVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniform No Operation Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UniformNoOperationVisitorImpl extends VisitorImpl implements UniformNoOperationVisitor
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UniformNoOperationVisitorImpl()
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
      return DemoclesPackage.Literals.UNIFORM_NO_OPERATION_VISITOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitForEach(ForEach forEach)
   {

      Object[] result1_black = UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_0_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_0_2_PerformVisit_expressionBB(this, forEach);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitHeadControlledLoop(HeadControlledLoop headControlledLoop)
   {

      Object[] result1_black = UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_1_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_1_2_PerformVisit_expressionBB(this, headControlledLoop);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitIfStatement(IfStatement ifStatement)
   {

      Object[] result1_black = UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_2_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_2_2_PerformVisit_expressionBB(this, ifStatement);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitTailControlledLoop(TailControlledLoop tailControlledLoop)
   {

      Object[] result1_black = UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_3_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      UniformNoOperationVisitorImpl.pattern_UniformNoOperationVisitor_3_2_PerformVisit_expressionBB(this, tailControlledLoop);
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
      case DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_FOR_EACH__FOREACH:
         visitForEach((ForEach) arguments.get(0));
         return null;
      case DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP:
         visitHeadControlledLoop((HeadControlledLoop) arguments.get(0));
         return null;
      case DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT:
         visitIfStatement((IfStatement) arguments.get(0));
         return null;
      case DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP:
         visitTailControlledLoop((TailControlledLoop) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_UniformNoOperationVisitor_0_1_LookupThisObject_blackB(UniformNoOperationVisitor _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_UniformNoOperationVisitor_0_2_PerformVisit_expressionBB(UniformNoOperationVisitor _this, ForEach forEach)
   {
      _this.visitNode(forEach);

   }

   public static final Object[] pattern_UniformNoOperationVisitor_1_1_LookupThisObject_blackB(UniformNoOperationVisitor _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_UniformNoOperationVisitor_1_2_PerformVisit_expressionBB(UniformNoOperationVisitor _this,
         HeadControlledLoop headControlledLoop)
   {
      _this.visitNode(headControlledLoop);

   }

   public static final Object[] pattern_UniformNoOperationVisitor_2_1_LookupThisObject_blackB(UniformNoOperationVisitor _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_UniformNoOperationVisitor_2_2_PerformVisit_expressionBB(UniformNoOperationVisitor _this, IfStatement ifStatement)
   {
      _this.visitNode(ifStatement);

   }

   public static final Object[] pattern_UniformNoOperationVisitor_3_1_LookupThisObject_blackB(UniformNoOperationVisitor _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_UniformNoOperationVisitor_3_2_PerformVisit_expressionBB(UniformNoOperationVisitor _this,
         TailControlledLoop tailControlledLoop)
   {
      _this.visitNode(tailControlledLoop);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //UniformNoOperationVisitorImpl
