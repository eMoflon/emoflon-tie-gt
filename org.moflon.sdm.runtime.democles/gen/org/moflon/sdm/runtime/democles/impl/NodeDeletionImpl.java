/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.NodeDeletion;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Deletion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.NodeDeletionImpl#getDestructedVariables <em>Destructed Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeDeletionImpl extends ActionImpl implements NodeDeletion
{
   /**
    * The cached value of the '{@link #getDestructedVariables() <em>Destructed Variables</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDestructedVariables()
    * @generated
    * @ordered
    */
   protected EList<CFVariable> destructedVariables;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NodeDeletionImpl()
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
      return DemoclesPackage.Literals.NODE_DELETION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CFVariable> getDestructedVariables()
   {
      if (destructedVariables == null)
      {
         destructedVariables = new EObjectWithInverseResolvingEList.ManyInverse<CFVariable>(CFVariable.class, this,
               DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES, DemoclesPackage.CF_VARIABLE__DESTRUCTORS);
      }
      return destructedVariables;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getDestructedVariables()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES:
         return ((InternalEList<?>) getDestructedVariables()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES:
         return getDestructedVariables();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES:
         getDestructedVariables().clear();
         getDestructedVariables().addAll((Collection<? extends CFVariable>) newValue);
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
      case DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES:
         getDestructedVariables().clear();
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
      case DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES:
         return destructedVariables != null && !destructedVariables.isEmpty();
      }
      return super.eIsSet(featureID);
   }
   // <-- [user code injected with eMoflon]

   @Override
   public String toString()
   {
      return "NodeDeletionImpl [destructedVariables=" + destructedVariables + "]";
   }

   // [user code injected with eMoflon] -->
} //NodeDeletionImpl
