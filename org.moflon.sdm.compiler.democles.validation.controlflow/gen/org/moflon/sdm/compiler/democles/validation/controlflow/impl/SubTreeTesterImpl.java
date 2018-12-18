/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Tree Tester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SubTreeTesterImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SubTreeTesterImpl#isIncludeRoot <em>Include Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubTreeTesterImpl extends EObjectImpl implements SubTreeTester
{
   /**
    * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRoot()
    * @generated
    * @ordered
    */
   protected Node root;

   /**
    * The default value of the '{@link #isIncludeRoot() <em>Include Root</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isIncludeRoot()
    * @generated
    * @ordered
    */
   protected static final boolean INCLUDE_ROOT_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isIncludeRoot() <em>Include Root</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isIncludeRoot()
    * @generated
    * @ordered
    */
   protected boolean includeRoot = INCLUDE_ROOT_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SubTreeTesterImpl()
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
      return ControlflowPackage.Literals.SUB_TREE_TESTER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getRoot()
   {
      if (root != null && root.eIsProxy())
      {
         InternalEObject oldRoot = (InternalEObject) root;
         root = (Node) eResolveProxy(oldRoot);
         if (root != oldRoot)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.SUB_TREE_TESTER__ROOT, oldRoot, root));
         }
      }
      return root;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetRoot()
   {
      return root;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRoot(Node newRoot)
   {
      Node oldRoot = root;
      root = newRoot;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.SUB_TREE_TESTER__ROOT, oldRoot, root));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isIncludeRoot()
   {
      return includeRoot;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setIncludeRoot(boolean newIncludeRoot)
   {
      boolean oldIncludeRoot = includeRoot;
      includeRoot = newIncludeRoot;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.SUB_TREE_TESTER__INCLUDE_ROOT, oldIncludeRoot, includeRoot));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isInSubTree(Node node)
   {// 
      Object[] result1_black = SubTreeTesterImpl.pattern_SubTreeTester_0_1_IncludeRoot_blackB(this);
      if (result1_black != null)
      {
         // 
         Object[] result2_black = SubTreeTesterImpl.pattern_SubTreeTester_0_2_LookupRoot_blackBB(this, node);
         if (result2_black != null)
         {
            return SubTreeTesterImpl.pattern_SubTreeTester_0_3_expressionF();
         } else
         {
         }

      } else
      {
      }
      // 
      Object[] result4_black = SubTreeTesterImpl.pattern_SubTreeTester_0_4_NodeInSubTreeBelowRoot_blackBFB(this, node);
      if (result4_black != null)
      {
         //nothing Node root = (Node) result4_black[1];
         return SubTreeTesterImpl.pattern_SubTreeTester_0_5_expressionF();
      } else
      {
         return SubTreeTesterImpl.pattern_SubTreeTester_0_6_expressionF();
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
      case ControlflowPackage.SUB_TREE_TESTER__ROOT:
         if (resolve)
            return getRoot();
         return basicGetRoot();
      case ControlflowPackage.SUB_TREE_TESTER__INCLUDE_ROOT:
         return isIncludeRoot();
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
      case ControlflowPackage.SUB_TREE_TESTER__ROOT:
         setRoot((Node) newValue);
         return;
      case ControlflowPackage.SUB_TREE_TESTER__INCLUDE_ROOT:
         setIncludeRoot((Boolean) newValue);
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
      case ControlflowPackage.SUB_TREE_TESTER__ROOT:
         setRoot((Node) null);
         return;
      case ControlflowPackage.SUB_TREE_TESTER__INCLUDE_ROOT:
         setIncludeRoot(INCLUDE_ROOT_EDEFAULT);
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
      case ControlflowPackage.SUB_TREE_TESTER__ROOT:
         return root != null;
      case ControlflowPackage.SUB_TREE_TESTER__INCLUDE_ROOT:
         return includeRoot != INCLUDE_ROOT_EDEFAULT;
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
      case ControlflowPackage.SUB_TREE_TESTER___IS_IN_SUB_TREE__NODE:
         return isInSubTree((Node) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (includeRoot: ");
      result.append(includeRoot);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_SubTreeTester_0_1_IncludeRoot_blackB(SubTreeTester _this)
   {
      boolean this_includeRoot = _this.isIncludeRoot();
      if (Boolean.valueOf(this_includeRoot).equals(Boolean.valueOf(true)))
      {
         return new Object[] { _this };
      }

      return null;
   }

   public static final Object[] pattern_SubTreeTester_0_2_LookupRoot_blackBB(SubTreeTester _this, Node node)
   {
      if (node.equals(_this.getRoot()))
      {
         return new Object[] { _this, node };
      }
      return null;
   }

   public static final boolean pattern_SubTreeTester_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_SubTreeTester_0_4_NodeInSubTreeBelowRoot_blackBFB(SubTreeTester _this, Node node)
   {
      Node root = _this.getRoot();
      if (root != null)
      {
         if (!node.equals(root))
         {
            int node_preTraversal = node.getPreTraversal();
            int node_postTraversal = node.getPostTraversal();
            int root_preTraversal = root.getPreTraversal();
            if (Integer.valueOf(node_preTraversal).compareTo(Integer.valueOf(root_preTraversal)) > 0)
            {
               int root_postTraversal = root.getPostTraversal();
               if (Integer.valueOf(node_postTraversal).compareTo(Integer.valueOf(root_postTraversal)) < 0)
               {
                  return new Object[] { _this, root, node };
               }

            }

         }
      }

      return null;
   }

   public static final boolean pattern_SubTreeTester_0_5_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_SubTreeTester_0_6_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //SubTreeTesterImpl
