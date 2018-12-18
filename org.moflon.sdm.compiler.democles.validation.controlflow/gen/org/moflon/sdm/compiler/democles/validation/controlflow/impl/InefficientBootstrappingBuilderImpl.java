/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.StatementNode;
import SDMLanguage.activities.StopNode;
import SDMLanguage.activities.StoryNode;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inefficient Bootstrapping Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.InefficientBootstrappingBuilderImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InefficientBootstrappingBuilderImpl extends SDMActivityGraphBuilderImpl implements InefficientBootstrappingBuilder
{
   /**
    * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDelegate()
    * @generated
    * @ordered
    */
   protected SDMActivityGraphBuilder delegate;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InefficientBootstrappingBuilderImpl()
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
      return ControlflowPackage.Literals.INEFFICIENT_BOOTSTRAPPING_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SDMActivityGraphBuilder getDelegate()
   {
      if (delegate != null && delegate.eIsProxy())
      {
         InternalEObject oldDelegate = (InternalEObject) delegate;
         delegate = (SDMActivityGraphBuilder) eResolveProxy(oldDelegate);
         if (delegate != oldDelegate)
         {
            if (eNotificationRequired())
               eNotify(
                     new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE, oldDelegate, delegate));
         }
      }
      return delegate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SDMActivityGraphBuilder basicGetDelegate()
   {
      return delegate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDelegate(SDMActivityGraphBuilder newDelegate)
   {
      SDMActivityGraphBuilder oldDelegate = delegate;
      delegate = newDelegate;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE, oldDelegate, delegate));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreStatementNode(StatementNode statementNode)
   {// 
      Object[] result1_black = InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_0_1_LookupExistingNode_blackFBBF(this,
            statementNode);
      if (result1_black != null)
      {
         //nothing DFSGraph graph = (DFSGraph) result1_black[0];
         Node node = (Node) result1_black[3];
         return InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_0_2_expressionFB(node);
      } else
      {

         Object[] result3_black = InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_0_3_LookupDelegate_blackBF(this);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         SDMActivityGraphBuilder delegate = (SDMActivityGraphBuilder) result3_black[1];

         Object[] result4_bindingAndBlack = InefficientBootstrappingBuilderImpl
               .pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_bindingAndBlackFBB(delegate, statementNode);
         if (result4_bindingAndBlack == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[delegate] = " + delegate + ", " + "[statementNode] = " + statementNode + ".");
         }
         Node newNode = (Node) result4_bindingAndBlack[0];
         return InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_0_5_expressionFB(newNode);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreStopNode(StopNode stopNode)
   {// 
      Object[] result1_black = InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_1_1_LookupExistingNode_blackBFFB(this, stopNode);
      if (result1_black != null)
      {
         //nothing DFSGraph graph = (DFSGraph) result1_black[1];
         Node node = (Node) result1_black[2];
         return InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_1_2_expressionFB(node);
      } else
      {

         Object[] result3_black = InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_1_3_LookupDelegate_blackFB(this);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         SDMActivityGraphBuilder delegate = (SDMActivityGraphBuilder) result3_black[0];

         Object[] result4_bindingAndBlack = InefficientBootstrappingBuilderImpl
               .pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_bindingAndBlackFBB(delegate, stopNode);
         if (result4_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[delegate] = " + delegate + ", " + "[stopNode] = " + stopNode + ".");
         }
         Node newNode = (Node) result4_bindingAndBlack[0];
         return InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_1_5_expressionFB(newNode);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreStoryNode(StoryNode storyNode)
   {// 
      Object[] result1_black = InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_2_1_LookupExistingNode_blackFBBF(this, storyNode);
      if (result1_black != null)
      {
         Node node = (Node) result1_black[0];
         //nothing DFSGraph graph = (DFSGraph) result1_black[3];
         return InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_2_2_expressionFB(node);
      } else
      {

         Object[] result3_black = InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_2_3_LookupDelegate_blackBF(this);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         SDMActivityGraphBuilder delegate = (SDMActivityGraphBuilder) result3_black[1];

         Object[] result4_bindingAndBlack = InefficientBootstrappingBuilderImpl
               .pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_bindingAndBlackFBB(delegate, storyNode);
         if (result4_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[delegate] = " + delegate + ", " + "[storyNode] = " + storyNode + ".");
         }
         Node newNode = (Node) result4_bindingAndBlack[0];
         return InefficientBootstrappingBuilderImpl.pattern_InefficientBootstrappingBuilder_2_5_expressionFB(newNode);
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
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE:
         if (resolve)
            return getDelegate();
         return basicGetDelegate();
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
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE:
         setDelegate((SDMActivityGraphBuilder) newValue);
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
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE:
         setDelegate((SDMActivityGraphBuilder) null);
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
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE:
         return delegate != null;
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
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE:
         return exploreStatementNode((StatementNode) arguments.get(0));
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STOP_NODE__STOPNODE:
         return exploreStopNode((StopNode) arguments.get(0));
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STORY_NODE__STORYNODE:
         return exploreStoryNode((StoryNode) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_0_1_LookupExistingNode_blackFBBF(InefficientBootstrappingBuilder _this,
         StatementNode statementNode)
   {
      DFSGraph graph = _this.getGraph();
      if (graph != null)
      {
         for (Node node : graph.getNodes())
         {
            if (statementNode.equals(node.getOrigin()))
            {
               return new Object[] { graph, _this, statementNode, node };
            }
         }
      }

      return null;
   }

   public static final Node pattern_InefficientBootstrappingBuilder_0_2_expressionFB(Node node)
   {
      Node _result = node;
      return _result;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_0_3_LookupDelegate_blackBF(InefficientBootstrappingBuilder _this)
   {
      SDMActivityGraphBuilder delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { _this, delegate };
         }
      }

      return null;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_bindingFBB(SDMActivityGraphBuilder delegate,
         StatementNode statementNode)
   {
      Node _localVariable_0 = delegate.exploreStatementNode(statementNode);
      Node newNode = _localVariable_0;
      if (newNode != null)
      {
         return new Object[] { newNode, delegate, statementNode };
      }
      return null;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_blackB(Node newNode)
   {
      return new Object[] { newNode };
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_bindingAndBlackFBB(SDMActivityGraphBuilder delegate,
         StatementNode statementNode)
   {
      Object[] result_pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_binding = pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_bindingFBB(
            delegate, statementNode);
      if (result_pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_binding != null)
      {
         Node newNode = (Node) result_pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_binding[0];

         Object[] result_pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_black = pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_blackB(
               newNode);
         if (result_pattern_InefficientBootstrappingBuilder_0_4_BuildNewNode_black != null)
         {

            return new Object[] { newNode, delegate, statementNode };
         }
      }
      return null;
   }

   public static final Node pattern_InefficientBootstrappingBuilder_0_5_expressionFB(Node newNode)
   {
      Node _result = newNode;
      return _result;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_1_1_LookupExistingNode_blackBFFB(InefficientBootstrappingBuilder _this,
         StopNode stopNode)
   {
      DFSGraph graph = _this.getGraph();
      if (graph != null)
      {
         for (Node node : graph.getNodes())
         {
            if (stopNode.equals(node.getOrigin()))
            {
               return new Object[] { _this, graph, node, stopNode };
            }
         }
      }

      return null;
   }

   public static final Node pattern_InefficientBootstrappingBuilder_1_2_expressionFB(Node node)
   {
      Node _result = node;
      return _result;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_1_3_LookupDelegate_blackFB(InefficientBootstrappingBuilder _this)
   {
      SDMActivityGraphBuilder delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { delegate, _this };
         }
      }

      return null;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_bindingFBB(SDMActivityGraphBuilder delegate, StopNode stopNode)
   {
      Node _localVariable_0 = delegate.exploreStopNode(stopNode);
      Node newNode = _localVariable_0;
      if (newNode != null)
      {
         return new Object[] { newNode, delegate, stopNode };
      }
      return null;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_blackB(Node newNode)
   {
      return new Object[] { newNode };
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_bindingAndBlackFBB(SDMActivityGraphBuilder delegate, StopNode stopNode)
   {
      Object[] result_pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_binding = pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_bindingFBB(
            delegate, stopNode);
      if (result_pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_binding != null)
      {
         Node newNode = (Node) result_pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_binding[0];

         Object[] result_pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_black = pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_blackB(
               newNode);
         if (result_pattern_InefficientBootstrappingBuilder_1_4_BuildNewNode_black != null)
         {

            return new Object[] { newNode, delegate, stopNode };
         }
      }
      return null;
   }

   public static final Node pattern_InefficientBootstrappingBuilder_1_5_expressionFB(Node newNode)
   {
      Node _result = newNode;
      return _result;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_2_1_LookupExistingNode_blackFBBF(InefficientBootstrappingBuilder _this,
         StoryNode storyNode)
   {
      DFSGraph graph = _this.getGraph();
      if (graph != null)
      {
         for (Node node : graph.getNodes())
         {
            if (storyNode.equals(node.getOrigin()))
            {
               return new Object[] { node, _this, storyNode, graph };
            }
         }
      }

      return null;
   }

   public static final Node pattern_InefficientBootstrappingBuilder_2_2_expressionFB(Node node)
   {
      Node _result = node;
      return _result;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_2_3_LookupDelegate_blackBF(InefficientBootstrappingBuilder _this)
   {
      SDMActivityGraphBuilder delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { _this, delegate };
         }
      }

      return null;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_bindingFBB(SDMActivityGraphBuilder delegate, StoryNode storyNode)
   {
      Node _localVariable_0 = delegate.exploreStoryNode(storyNode);
      Node newNode = _localVariable_0;
      if (newNode != null)
      {
         return new Object[] { newNode, delegate, storyNode };
      }
      return null;
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_blackB(Node newNode)
   {
      return new Object[] { newNode };
   }

   public static final Object[] pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_bindingAndBlackFBB(SDMActivityGraphBuilder delegate,
         StoryNode storyNode)
   {
      Object[] result_pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_binding = pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_bindingFBB(
            delegate, storyNode);
      if (result_pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_binding != null)
      {
         Node newNode = (Node) result_pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_binding[0];

         Object[] result_pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_black = pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_blackB(
               newNode);
         if (result_pattern_InefficientBootstrappingBuilder_2_4_BuildNewNode_black != null)
         {

            return new Object[] { newNode, delegate, storyNode };
         }
      }
      return null;
   }

   public static final Node pattern_InefficientBootstrappingBuilder_2_5_expressionFB(Node newNode)
   {
      Node _result = newNode;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //InefficientBootstrappingBuilderImpl
