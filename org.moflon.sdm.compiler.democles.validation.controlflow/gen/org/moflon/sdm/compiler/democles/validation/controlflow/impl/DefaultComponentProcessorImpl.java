/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.EdgeGuard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Component Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.DefaultComponentProcessorImpl#getBuilder <em>Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultComponentProcessorImpl extends ValidatingEdgeProcessorImpl implements DefaultComponentProcessor
{
   /**
    * The cached value of the '{@link #getBuilder() <em>Builder</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBuilder()
    * @generated
    * @ordered
    */
   protected SDMActivityGraphBuilder builder;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DefaultComponentProcessorImpl()
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
      return ControlflowPackage.Literals.DEFAULT_COMPONENT_PROCESSOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SDMActivityGraphBuilder getBuilder()
   {
      if (builder != null && builder.eIsProxy())
      {
         InternalEObject oldBuilder = (InternalEObject) builder;
         builder = (SDMActivityGraphBuilder) eResolveProxy(oldBuilder);
         if (builder != oldBuilder)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR__BUILDER, oldBuilder, builder));
         }
      }
      return builder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SDMActivityGraphBuilder basicGetBuilder()
   {
      return builder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBuilder(SDMActivityGraphBuilder newBuilder)
   {
      SDMActivityGraphBuilder oldBuilder = builder;
      builder = newBuilder;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR__BUILDER, oldBuilder, builder));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreTargetNode(Edge edge)
   {// 
      Object[] result1_black = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_0_1_HasExistingTargetNode_blackFB(edge);
      if (result1_black != null)
      {
         Node targetNode = (Node) result1_black[0];
         return DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_0_2_expressionFB(targetNode);
      } else
      {

         Object[] result3_black = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_0_3_LookupGraphBuilder_blackFB(this);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         SDMActivityGraphBuilder builder = (SDMActivityGraphBuilder) result3_black[0];

         Object[] result4_bindingAndBlack = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_0_4_LookupTargetNode_bindingAndBlackFBB(builder,
               edge);
         if (result4_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[builder] = " + builder + ", " + "[edge] = " + edge + ".");
         }
         Node newTargetNode = (Node) result4_bindingAndBlack[0];

         Object[] result5_black = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_0_5_ConnectTargetNode_blackBB(edge, newTargetNode);
         if (result5_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ", " + "[newTargetNode] = " + newTargetNode + ".");
         }
         DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_0_5_ConnectTargetNode_greenBB(edge, newTargetNode);

         return DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_0_6_expressionFB(newTargetNode);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processEdge(Edge edge)
   {

      Object[] result1_black = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_2_ExploreTargetNode_expressionFBB(this, edge);
      // 
      Object[] result3_black = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_3_IsForEachEdge_blackBF(edge);
      if (result3_black != null)
      {
         //nothing ActivityEdge actEdge = (ActivityEdge) result3_black[1];
         return DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_4_expressionF();
      } else
      {
         // 
         Object[] result5_black = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_5_LookupDelegate_blackBF(this);
         if (result5_black != null)
         {
            EdgeProcessor delegate = (EdgeProcessor) result5_black[1];
            // 
            Object[] result6_bindingAndBlack = DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_6_Delegation_bindingAndBlackFBB(delegate,
                  edge);
            if (result6_bindingAndBlack != null)
            {
               EObject result = (EObject) result6_bindingAndBlack[0];
               return DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_7_expressionFB(result);
            } else
            {
               return DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_8_expressionF();
            }

         } else
         {
            return DefaultComponentProcessorImpl.pattern_DefaultComponentProcessor_1_9_expressionF();
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR__BUILDER:
         if (resolve)
            return getBuilder();
         return basicGetBuilder();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR__BUILDER:
         setBuilder((SDMActivityGraphBuilder) newValue);
         return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR__BUILDER:
         setBuilder((SDMActivityGraphBuilder) null);
         return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR__BUILDER:
         return builder != null;
      }
      return super.eIsSet(featureID);
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
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR___EXPLORE_TARGET_NODE__EDGE:
         return exploreTargetNode((Edge) arguments.get(0));
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE:
         return processEdge((Edge) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_DefaultComponentProcessor_0_1_HasExistingTargetNode_blackFB(Edge edge)
   {
      Node targetNode = edge.getTarget();
      if (targetNode != null)
      {
         return new Object[] { targetNode, edge };
      }

      return null;
   }

   public static final Node pattern_DefaultComponentProcessor_0_2_expressionFB(Node targetNode)
   {
      Node _result = targetNode;
      return _result;
   }

   public static final Object[] pattern_DefaultComponentProcessor_0_3_LookupGraphBuilder_blackFB(DefaultComponentProcessor _this)
   {
      SDMActivityGraphBuilder builder = _this.getBuilder();
      if (builder != null)
      {
         return new Object[] { builder, _this };
      }

      return null;
   }

   public static final Object[] pattern_DefaultComponentProcessor_0_4_LookupTargetNode_bindingFBB(SDMActivityGraphBuilder builder, Edge edge)
   {
      Node _localVariable_0 = builder.exploreEdge(edge);
      Node newTargetNode = _localVariable_0;
      if (newTargetNode != null)
      {
         return new Object[] { newTargetNode, builder, edge };
      }
      return null;
   }

   public static final Object[] pattern_DefaultComponentProcessor_0_4_LookupTargetNode_blackB(Node newTargetNode)
   {
      return new Object[] { newTargetNode };
   }

   public static final Object[] pattern_DefaultComponentProcessor_0_4_LookupTargetNode_bindingAndBlackFBB(SDMActivityGraphBuilder builder, Edge edge)
   {
      Object[] result_pattern_DefaultComponentProcessor_0_4_LookupTargetNode_binding = pattern_DefaultComponentProcessor_0_4_LookupTargetNode_bindingFBB(
            builder, edge);
      if (result_pattern_DefaultComponentProcessor_0_4_LookupTargetNode_binding != null)
      {
         Node newTargetNode = (Node) result_pattern_DefaultComponentProcessor_0_4_LookupTargetNode_binding[0];

         Object[] result_pattern_DefaultComponentProcessor_0_4_LookupTargetNode_black = pattern_DefaultComponentProcessor_0_4_LookupTargetNode_blackB(
               newTargetNode);
         if (result_pattern_DefaultComponentProcessor_0_4_LookupTargetNode_black != null)
         {

            return new Object[] { newTargetNode, builder, edge };
         }
      }
      return null;
   }

   public static final Object[] pattern_DefaultComponentProcessor_0_5_ConnectTargetNode_blackBB(Edge edge, Node newTargetNode)
   {
      return new Object[] { edge, newTargetNode };
   }

   public static final Object[] pattern_DefaultComponentProcessor_0_5_ConnectTargetNode_greenBB(Edge edge, Node newTargetNode)
   {
      newTargetNode.getIncoming().add(edge);
      return new Object[] { edge, newTargetNode };
   }

   public static final Node pattern_DefaultComponentProcessor_0_6_expressionFB(Node newTargetNode)
   {
      Node _result = newTargetNode;
      return _result;
   }

   public static final Object[] pattern_DefaultComponentProcessor_1_1_LookupThisObject_blackB(DefaultComponentProcessor _this)
   {
      return new Object[] { _this };
   }

   public static final Node pattern_DefaultComponentProcessor_1_2_ExploreTargetNode_expressionFBB(DefaultComponentProcessor _this, Edge edge)
   {
      Node _localVariable_0 = _this.exploreTargetNode(edge);
      Node _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_DefaultComponentProcessor_1_3_IsForEachEdge_blackBF(Edge edge)
   {
      EObject tmpActEdge = edge.getOrigin();
      if (tmpActEdge instanceof ActivityEdge)
      {
         ActivityEdge actEdge = (ActivityEdge) tmpActEdge;
         EdgeGuard actEdge_guard = actEdge.getGuard();
         if (actEdge_guard.equals(EdgeGuard.EACH_TIME))
         {
            return new Object[] { edge, actEdge };
         }

      }

      return null;
   }

   public static final EObject pattern_DefaultComponentProcessor_1_4_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_DefaultComponentProcessor_1_5_LookupDelegate_blackBF(DefaultComponentProcessor _this)
   {
      EdgeProcessor delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { _this, delegate };
         }
      }

      return null;
   }

   public static final Object[] pattern_DefaultComponentProcessor_1_6_Delegation_bindingFBB(EdgeProcessor delegate, Edge edge)
   {
      EObject _localVariable_0 = delegate.processEdge(edge);
      EObject result = _localVariable_0;
      if (result != null)
      {
         return new Object[] { result, delegate, edge };
      }
      return null;
   }

   public static final Object[] pattern_DefaultComponentProcessor_1_6_Delegation_blackB(EObject result)
   {
      return new Object[] { result };
   }

   public static final Object[] pattern_DefaultComponentProcessor_1_6_Delegation_bindingAndBlackFBB(EdgeProcessor delegate, Edge edge)
   {
      Object[] result_pattern_DefaultComponentProcessor_1_6_Delegation_binding = pattern_DefaultComponentProcessor_1_6_Delegation_bindingFBB(delegate, edge);
      if (result_pattern_DefaultComponentProcessor_1_6_Delegation_binding != null)
      {
         EObject result = (EObject) result_pattern_DefaultComponentProcessor_1_6_Delegation_binding[0];

         Object[] result_pattern_DefaultComponentProcessor_1_6_Delegation_black = pattern_DefaultComponentProcessor_1_6_Delegation_blackB(result);
         if (result_pattern_DefaultComponentProcessor_1_6_Delegation_black != null)
         {

            return new Object[] { result, delegate, edge };
         }
      }
      return null;
   }

   public static final EObject pattern_DefaultComponentProcessor_1_7_expressionFB(EObject result)
   {
      EObject _result = result;
      return _result;
   }

   public static final EObject pattern_DefaultComponentProcessor_1_8_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_DefaultComponentProcessor_1_9_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //DefaultComponentProcessorImpl
