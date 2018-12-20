/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.Visitor;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends CompoundNodeImpl implements IfStatement
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected IfStatementImpl()
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
      return DemoclesPackage.Literals.IF_STATEMENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void accept(Visitor visitor)
   {

      Object[] result1_black = IfStatementImpl.pattern_IfStatement_0_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      IfStatementImpl.pattern_IfStatement_0_2_VisitNode_expressionBB(visitor, this);

      Object[] result3_black = IfStatementImpl.pattern_IfStatement_0_3_LookupBranches_blackBFF(this);
      if (result3_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Scope firstBranch = (Scope) result3_black[1];
      Scope secondBranch = (Scope) result3_black[2];
      // 
      IfStatementImpl.pattern_IfStatement_0_4_TraverseFirstBranch_expressionBB(firstBranch, visitor);
      // 
      IfStatementImpl.pattern_IfStatement_0_5_TraverseSecondBranch_expressionBB(secondBranch, visitor);
      // 
      Object[] result6_black = IfStatementImpl.pattern_IfStatement_0_6_LookupNextNode_blackFB(this);
      if (result6_black != null)
      {
         CFNode nextNode = (CFNode) result6_black[0];
         // 
         IfStatementImpl.pattern_IfStatement_0_7_TraverseNextNode_expressionBB(nextNode, visitor);

      } else
      {
      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope getRelevantScope()
   {

      Object[] result1_black = IfStatementImpl.pattern_IfStatement_1_1_LookupFirstScope_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Scope firstScope = (Scope) result1_black[0];

      Object[] result2_black = IfStatementImpl.pattern_IfStatement_1_2_LookupSecondScope_blackBBF(firstScope, this);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[firstScope] = " + firstScope + ", " + "[this] = " + this + ".");
      }
      //nothing Scope secondScope = (Scope) result2_black[2];
      return IfStatementImpl.pattern_IfStatement_1_3_expressionFB(firstScope);
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
      case DemoclesPackage.IF_STATEMENT___ACCEPT__VISITOR:
         accept((Visitor) arguments.get(0));
         return null;
      case DemoclesPackage.IF_STATEMENT___GET_RELEVANT_SCOPE:
         return getRelevantScope();
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_IfStatement_0_1_LookupThisObject_blackB(IfStatement _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_IfStatement_0_2_VisitNode_expressionBB(Visitor visitor, IfStatement _this)
   {
      visitor.visitIfStatement(_this);

   }

   public static final Object[] pattern_IfStatement_0_3_LookupBranches_blackBFF(IfStatement _this)
   {
      for (Scope firstBranch : _this.getScopes())
      {
         for (Scope secondBranch : _this.getScopes())
         {
            if (!firstBranch.equals(secondBranch))
            {
               return new Object[] { _this, firstBranch, secondBranch };
            }
         }
      }
      return null;
   }

   public static final void pattern_IfStatement_0_4_TraverseFirstBranch_expressionBB(Scope firstBranch, Visitor visitor)
   {
      firstBranch.accept(visitor);

   }

   public static final void pattern_IfStatement_0_5_TraverseSecondBranch_expressionBB(Scope secondBranch, Visitor visitor)
   {
      secondBranch.accept(visitor);

   }

   public static final Object[] pattern_IfStatement_0_6_LookupNextNode_blackFB(IfStatement _this)
   {
      CFNode nextNode = _this.getNext();
      if (nextNode != null)
      {
         if (!nextNode.equals(_this))
         {
            return new Object[] { nextNode, _this };
         }
      }

      return null;
   }

   public static final void pattern_IfStatement_0_7_TraverseNextNode_expressionBB(CFNode nextNode, Visitor visitor)
   {
      nextNode.accept(visitor);

   }

   public static final Object[] pattern_IfStatement_1_1_LookupFirstScope_blackFB(IfStatement _this)
   {
      for (Scope firstScope : _this.getScopes())
      {
         return new Object[] { firstScope, _this };
      }
      return null;
   }

   public static final Object[] pattern_IfStatement_1_2_LookupSecondScope_blackBBF(Scope firstScope, IfStatement _this)
   {
      for (Scope secondScope : _this.getScopes())
      {
         if (!firstScope.equals(secondScope))
         {
            return new Object[] { firstScope, _this, secondScope };
         }
      }
      return null;
   }

   public static final Scope pattern_IfStatement_1_3_expressionFB(Scope firstScope)
   {
      Scope _result = firstScope;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //IfStatementImpl
