/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator;

import org.moflon.sdm.runtime.democles.CFNode;

import org.moflon.sdm.runtime.democles.impl.UniformNoOperationVisitorImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Allocator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.IdentifierAllocatorImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentifierAllocatorImpl extends UniformNoOperationVisitorImpl implements IdentifierAllocator
{
   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final int ID_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected int id = ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected IdentifierAllocatorImpl()
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
      return ControlflowPackage.Literals.IDENTIFIER_ALLOCATOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getId()
   {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setId(int newId)
   {
      int oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.IDENTIFIER_ALLOCATOR__ID, oldId, id));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int incrementIdentifier()
   {
      // [user code injected with eMoflon]

      return getId() + 1;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitNode(CFNode node)
   {

      Object[] result1_black = IdentifierAllocatorImpl.pattern_IdentifierAllocator_1_1_IncreaseNextIdentifier_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      IdentifierAllocatorImpl.pattern_IdentifierAllocator_1_1_IncreaseNextIdentifier_greenB(this);

      Object[] result2_black = IdentifierAllocatorImpl.pattern_IdentifierAllocator_1_2_AssignNodeIdentifier_blackBB(node, this);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[this] = " + this + ".");
      }
      IdentifierAllocatorImpl.pattern_IdentifierAllocator_1_2_AssignNodeIdentifier_greenBB(node, this);

      return;
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
      case ControlflowPackage.IDENTIFIER_ALLOCATOR__ID:
         return getId();
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
      case ControlflowPackage.IDENTIFIER_ALLOCATOR__ID:
         setId((Integer) newValue);
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
      case ControlflowPackage.IDENTIFIER_ALLOCATOR__ID:
         setId(ID_EDEFAULT);
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
      case ControlflowPackage.IDENTIFIER_ALLOCATOR__ID:
         return id != ID_EDEFAULT;
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
      case ControlflowPackage.IDENTIFIER_ALLOCATOR___INCREMENT_IDENTIFIER:
         return incrementIdentifier();
      case ControlflowPackage.IDENTIFIER_ALLOCATOR___VISIT_NODE__CFNODE:
         visitNode((CFNode) arguments.get(0));
         return null;
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
      result.append(" (id: ");
      result.append(id);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_IdentifierAllocator_1_1_IncreaseNextIdentifier_blackB(IdentifierAllocator _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_IdentifierAllocator_1_1_IncreaseNextIdentifier_greenB(IdentifierAllocator _this)
   {
      int _localVariable_0 = _this.incrementIdentifier();
      int this_id_prime = Integer.valueOf(_localVariable_0);
      _this.setId(Integer.valueOf(this_id_prime));
      return new Object[] { _this };
   }

   public static final Object[] pattern_IdentifierAllocator_1_2_AssignNodeIdentifier_blackBB(CFNode node, IdentifierAllocator _this)
   {
      return new Object[] { node, _this };
   }

   public static final Object[] pattern_IdentifierAllocator_1_2_AssignNodeIdentifier_greenBB(CFNode node, IdentifierAllocator _this)
   {
      int this_id = _this.getId();
      int node_id_prime = Integer.valueOf(this_id);
      node.setId(Integer.valueOf(node_id_prime));
      return new Object[] { node, _this };

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //IdentifierAllocatorImpl
