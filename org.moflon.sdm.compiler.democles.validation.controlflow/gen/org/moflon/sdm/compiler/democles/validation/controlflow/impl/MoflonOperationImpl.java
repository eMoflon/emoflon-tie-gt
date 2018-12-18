/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.Activity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EOperationImpl;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation;

import org.moflon.sdm.runtime.democles.Scope;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moflon Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.MoflonOperationImpl#getRootScope <em>Root Scope</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.MoflonOperationImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoflonOperationImpl extends EOperationImpl implements MoflonOperation
{
   /**
    * The cached value of the '{@link #getRootScope() <em>Root Scope</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRootScope()
    * @generated
    * @ordered
    */
   protected Scope rootScope;

   /**
    * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getActivity()
    * @generated
    * @ordered
    */
   protected Activity activity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected MoflonOperationImpl()
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
      return ControlflowPackage.Literals.MOFLON_OPERATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope getRootScope()
   {
      return rootScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRootScope(Scope newRootScope, NotificationChain msgs)
   {
      Scope oldRootScope = rootScope;
      rootScope = newRootScope;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE, oldRootScope,
               newRootScope);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRootScope(Scope newRootScope)
   {
      if (newRootScope != rootScope)
      {
         NotificationChain msgs = null;
         if (rootScope != null)
            msgs = ((InternalEObject) rootScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE, null, msgs);
         if (newRootScope != null)
            msgs = ((InternalEObject) newRootScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE, null, msgs);
         msgs = basicSetRootScope(newRootScope, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE, newRootScope, newRootScope));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Activity getActivity()
   {
      return activity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs)
   {
      Activity oldActivity = activity;
      activity = newActivity;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.MOFLON_OPERATION__ACTIVITY, oldActivity,
               newActivity);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setActivity(Activity newActivity)
   {
      if (newActivity != activity)
      {
         NotificationChain msgs = null;
         if (activity != null)
            msgs = ((InternalEObject) activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.MOFLON_OPERATION__ACTIVITY, null, msgs);
         if (newActivity != null)
            msgs = ((InternalEObject) newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.MOFLON_OPERATION__ACTIVITY, null, msgs);
         msgs = basicSetActivity(newActivity, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.MOFLON_OPERATION__ACTIVITY, newActivity, newActivity));
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
      case ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE:
         return basicSetRootScope(null, msgs);
      case ControlflowPackage.MOFLON_OPERATION__ACTIVITY:
         return basicSetActivity(null, msgs);
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
      case ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE:
         return getRootScope();
      case ControlflowPackage.MOFLON_OPERATION__ACTIVITY:
         return getActivity();
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
      case ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE:
         setRootScope((Scope) newValue);
         return;
      case ControlflowPackage.MOFLON_OPERATION__ACTIVITY:
         setActivity((Activity) newValue);
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
      case ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE:
         setRootScope((Scope) null);
         return;
      case ControlflowPackage.MOFLON_OPERATION__ACTIVITY:
         setActivity((Activity) null);
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
      case ControlflowPackage.MOFLON_OPERATION__ROOT_SCOPE:
         return rootScope != null;
      case ControlflowPackage.MOFLON_OPERATION__ACTIVITY:
         return activity != null;
      }
      return super.eIsSet(featureID);
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //MoflonOperationImpl
