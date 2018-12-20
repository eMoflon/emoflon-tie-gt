/**
 */
package org.moflon.core.dfs.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.core.dfs.DfsPackage;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.impl.EdgeProcessorImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EdgeProcessorImpl extends EObjectImpl implements EdgeProcessor
{
   /**
    * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDelegate()
    * @generated
    * @ordered
    */
   protected EdgeProcessor delegate;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EdgeProcessorImpl()
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
      return DfsPackage.Literals.EDGE_PROCESSOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EdgeProcessor getDelegate()
   {
      if (delegate != null && delegate.eIsProxy())
      {
         InternalEObject oldDelegate = (InternalEObject) delegate;
         delegate = (EdgeProcessor) eResolveProxy(oldDelegate);
         if (delegate != oldDelegate)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DfsPackage.EDGE_PROCESSOR__DELEGATE, oldDelegate, delegate));
         }
      }
      return delegate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EdgeProcessor basicGetDelegate()
   {
      return delegate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDelegate(EdgeProcessor newDelegate)
   {
      EdgeProcessor oldDelegate = delegate;
      delegate = newDelegate;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE_PROCESSOR__DELEGATE, oldDelegate, delegate));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processEdge(Edge edge)
   {// 
      Object[] result1_black = EdgeProcessorImpl.pattern_EdgeProcessor_0_1_LookupDelegate_blackBF(this);
      if (result1_black != null)
      {
         EdgeProcessor delegate = (EdgeProcessor) result1_black[1];
         // 
         Object[] result2_bindingAndBlack = EdgeProcessorImpl.pattern_EdgeProcessor_0_2_Delegation_bindingAndBlackFBB(delegate, edge);
         if (result2_bindingAndBlack != null)
         {
            EObject result = (EObject) result2_bindingAndBlack[0];
            return EdgeProcessorImpl.pattern_EdgeProcessor_0_3_expressionFB(result);
         } else
         {
            return EdgeProcessorImpl.pattern_EdgeProcessor_0_4_expressionF();
         }

      } else
      {
         return EdgeProcessorImpl.pattern_EdgeProcessor_0_5_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processNode(Node node)
   {// 
      Object[] result1_black = EdgeProcessorImpl.pattern_EdgeProcessor_1_1_LookupDelegate_blackFB(this);
      if (result1_black != null)
      {
         EdgeProcessor delegate = (EdgeProcessor) result1_black[0];
         // 
         Object[] result2_bindingAndBlack = EdgeProcessorImpl.pattern_EdgeProcessor_1_2_Delegation_bindingAndBlackFBB(delegate, node);
         if (result2_bindingAndBlack != null)
         {
            EObject result = (EObject) result2_bindingAndBlack[0];
            return EdgeProcessorImpl.pattern_EdgeProcessor_1_3_expressionFB(result);
         } else
         {
            return EdgeProcessorImpl.pattern_EdgeProcessor_1_4_expressionF();
         }

      } else
      {
         return EdgeProcessorImpl.pattern_EdgeProcessor_1_5_expressionF();
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
      case DfsPackage.EDGE_PROCESSOR__DELEGATE:
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
      case DfsPackage.EDGE_PROCESSOR__DELEGATE:
         setDelegate((EdgeProcessor) newValue);
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
      case DfsPackage.EDGE_PROCESSOR__DELEGATE:
         setDelegate((EdgeProcessor) null);
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
      case DfsPackage.EDGE_PROCESSOR__DELEGATE:
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
      case DfsPackage.EDGE_PROCESSOR___PROCESS_EDGE__EDGE:
         return processEdge((Edge) arguments.get(0));
      case DfsPackage.EDGE_PROCESSOR___PROCESS_NODE__NODE:
         return processNode((Node) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_EdgeProcessor_0_1_LookupDelegate_blackBF(EdgeProcessor _this)
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

   public static final Object[] pattern_EdgeProcessor_0_2_Delegation_bindingFBB(EdgeProcessor delegate, Edge edge)
   {
      EObject _localVariable_0 = delegate.processEdge(edge);
      EObject result = _localVariable_0;
      if (result != null)
      {
         return new Object[] { result, delegate, edge };
      }
      return null;
   }

   public static final Object[] pattern_EdgeProcessor_0_2_Delegation_blackB(EObject result)
   {
      return new Object[] { result };
   }

   public static final Object[] pattern_EdgeProcessor_0_2_Delegation_bindingAndBlackFBB(EdgeProcessor delegate, Edge edge)
   {
      Object[] result_pattern_EdgeProcessor_0_2_Delegation_binding = pattern_EdgeProcessor_0_2_Delegation_bindingFBB(delegate, edge);
      if (result_pattern_EdgeProcessor_0_2_Delegation_binding != null)
      {
         EObject result = (EObject) result_pattern_EdgeProcessor_0_2_Delegation_binding[0];

         Object[] result_pattern_EdgeProcessor_0_2_Delegation_black = pattern_EdgeProcessor_0_2_Delegation_blackB(result);
         if (result_pattern_EdgeProcessor_0_2_Delegation_black != null)
         {

            return new Object[] { result, delegate, edge };
         }
      }
      return null;
   }

   public static final EObject pattern_EdgeProcessor_0_3_expressionFB(EObject result)
   {
      EObject _result = result;
      return _result;
   }

   public static final EObject pattern_EdgeProcessor_0_4_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_EdgeProcessor_0_5_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_EdgeProcessor_1_1_LookupDelegate_blackFB(EdgeProcessor _this)
   {
      EdgeProcessor delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { delegate, _this };
         }
      }

      return null;
   }

   public static final Object[] pattern_EdgeProcessor_1_2_Delegation_bindingFBB(EdgeProcessor delegate, Node node)
   {
      EObject _localVariable_0 = delegate.processNode(node);
      EObject result = _localVariable_0;
      if (result != null)
      {
         return new Object[] { result, delegate, node };
      }
      return null;
   }

   public static final Object[] pattern_EdgeProcessor_1_2_Delegation_blackB(EObject result)
   {
      return new Object[] { result };
   }

   public static final Object[] pattern_EdgeProcessor_1_2_Delegation_bindingAndBlackFBB(EdgeProcessor delegate, Node node)
   {
      Object[] result_pattern_EdgeProcessor_1_2_Delegation_binding = pattern_EdgeProcessor_1_2_Delegation_bindingFBB(delegate, node);
      if (result_pattern_EdgeProcessor_1_2_Delegation_binding != null)
      {
         EObject result = (EObject) result_pattern_EdgeProcessor_1_2_Delegation_binding[0];

         Object[] result_pattern_EdgeProcessor_1_2_Delegation_black = pattern_EdgeProcessor_1_2_Delegation_blackB(result);
         if (result_pattern_EdgeProcessor_1_2_Delegation_black != null)
         {

            return new Object[] { result, delegate, node };
         }
      }
      return null;
   }

   public static final EObject pattern_EdgeProcessor_1_3_expressionFB(EObject result)
   {
      EObject _result = result;
      return _result;
   }

   public static final EObject pattern_EdgeProcessor_1_4_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_EdgeProcessor_1_5_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //EdgeProcessorImpl
