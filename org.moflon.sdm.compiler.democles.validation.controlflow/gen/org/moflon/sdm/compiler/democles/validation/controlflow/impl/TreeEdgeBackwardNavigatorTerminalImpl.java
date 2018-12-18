/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal;
import org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Edge Backward Navigator Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TreeEdgeBackwardNavigatorTerminalImpl extends ValidatingEdgeProcessorImpl implements TreeEdgeBackwardNavigatorTerminal
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected TreeEdgeBackwardNavigatorTerminalImpl()
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
      return ControlflowPackage.Literals.TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processEdge(Edge edge)
   {

      Object[] result1_black = TreeEdgeBackwardNavigatorTerminalImpl.pattern_TreeEdgeBackwardNavigatorTerminal_0_1_LookupDelegate_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      TreeEdgeNavigator treeEdgeNav = (TreeEdgeNavigator) result1_black[0];
      // 
      Object[] result2_black = TreeEdgeBackwardNavigatorTerminalImpl.pattern_TreeEdgeBackwardNavigatorTerminal_0_2_ReturnEdgeIfTerminal_blackBFB(edge,
            treeEdgeNav);
      if (result2_black != null)
      {
         //nothing Node termNode = (Node) result2_black[1];
         return TreeEdgeBackwardNavigatorTerminalImpl.pattern_TreeEdgeBackwardNavigatorTerminal_0_3_expressionFB(edge);
      } else
      {
         // 
         Object[] result4_bindingAndBlack = TreeEdgeBackwardNavigatorTerminalImpl
               .pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_bindingAndBlackFBB(treeEdgeNav, edge);
         if (result4_bindingAndBlack != null)
         {
            EObject result = (EObject) result4_bindingAndBlack[0];
            return TreeEdgeBackwardNavigatorTerminalImpl.pattern_TreeEdgeBackwardNavigatorTerminal_0_5_expressionFB(result);
         } else
         {
            return TreeEdgeBackwardNavigatorTerminalImpl.pattern_TreeEdgeBackwardNavigatorTerminal_0_6_expressionF();
         }

      }

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
      case ControlflowPackage.TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL___PROCESS_EDGE__EDGE:
         return processEdge((Edge) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_TreeEdgeBackwardNavigatorTerminal_0_1_LookupDelegate_blackFB(TreeEdgeBackwardNavigatorTerminal _this)
   {
      EdgeProcessor tmpTreeEdgeNav = _this.getDelegate();
      if (tmpTreeEdgeNav instanceof TreeEdgeNavigator)
      {
         TreeEdgeNavigator treeEdgeNav = (TreeEdgeNavigator) tmpTreeEdgeNav;
         return new Object[] { treeEdgeNav, _this };
      }

      return null;
   }

   public static final Object[] pattern_TreeEdgeBackwardNavigatorTerminal_0_2_ReturnEdgeIfTerminal_blackBFB(Edge edge, TreeEdgeNavigator treeEdgeNav)
   {
      Node termNode = edge.getSource();
      if (termNode != null)
      {
         if (termNode.equals(treeEdgeNav.getTerminalNode()))
         {
            return new Object[] { edge, termNode, treeEdgeNav };
         }
      }

      return null;
   }

   public static final EObject pattern_TreeEdgeBackwardNavigatorTerminal_0_3_expressionFB(Edge edge)
   {
      Edge tmp_result = edge;
      if (tmp_result instanceof EObject)
      {
         EObject _result = (EObject) tmp_result;
         return _result;
      }
      return null;
   }

   public static final Object[] pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_bindingFBB(TreeEdgeNavigator treeEdgeNav, Edge edge)
   {
      EObject _localVariable_0 = treeEdgeNav.processEdge(edge);
      EObject result = _localVariable_0;
      if (result != null)
      {
         return new Object[] { result, treeEdgeNav, edge };
      }
      return null;
   }

   public static final Object[] pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_blackB(EObject result)
   {
      return new Object[] { result };
   }

   public static final Object[] pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_bindingAndBlackFBB(TreeEdgeNavigator treeEdgeNav, Edge edge)
   {
      Object[] result_pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_binding = pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_bindingFBB(
            treeEdgeNav, edge);
      if (result_pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_binding != null)
      {
         EObject result = (EObject) result_pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_binding[0];

         Object[] result_pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_black = pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_blackB(result);
         if (result_pattern_TreeEdgeBackwardNavigatorTerminal_0_4_Delegate_black != null)
         {

            return new Object[] { result, treeEdgeNav, edge };
         }
      }
      return null;
   }

   public static final EObject pattern_TreeEdgeBackwardNavigatorTerminal_0_5_expressionFB(EObject result)
   {
      EObject _result = result;
      return _result;
   }

   public static final EObject pattern_TreeEdgeBackwardNavigatorTerminal_0_6_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //TreeEdgeBackwardNavigatorTerminalImpl
