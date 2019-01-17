/**
 */
package org.moflon.tie.gt.controlflow.democles.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;
import org.moflon.tie.gt.controlflow.democles.SingleResultPatternInvocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Result Pattern Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.SingleResultPatternInvocationImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleResultPatternInvocationImpl extends PatternInvocationImpl implements SingleResultPatternInvocation
{
   /**
    * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReturnType()
    * @generated
    * @ordered
    */
   protected EClassifier returnType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SingleResultPatternInvocationImpl()
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
      return DemoclesPackage.Literals.SINGLE_RESULT_PATTERN_INVOCATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier getReturnType()
   {
      if (returnType != null && returnType.eIsProxy())
      {
         InternalEObject oldReturnType = (InternalEObject) returnType;
         returnType = (EClassifier) eResolveProxy(oldReturnType);
         if (returnType != oldReturnType)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE, oldReturnType,
                     returnType));
         }
      }
      return returnType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier basicGetReturnType()
   {
      return returnType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setReturnType(EClassifier newReturnType)
   {
      EClassifier oldReturnType = returnType;
      returnType = newReturnType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE, oldReturnType, returnType));
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
      case DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE:
         if (resolve)
            return getReturnType();
         return basicGetReturnType();
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
      case DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE:
         setReturnType((EClassifier) newValue);
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
      case DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE:
         setReturnType((EClassifier) null);
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
      case DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE:
         return returnType != null;
      }
      return super.eIsSet(featureID);
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //SingleResultPatternInvocationImpl
