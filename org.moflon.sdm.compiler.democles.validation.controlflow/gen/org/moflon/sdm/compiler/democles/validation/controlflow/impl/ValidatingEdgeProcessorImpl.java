/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.core.dfs.impl.EdgeProcessorImpl;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.Validator;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validating Edge Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatingEdgeProcessorImpl#getValidator <em>Validator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValidatingEdgeProcessorImpl extends EdgeProcessorImpl implements ValidatingEdgeProcessor
{
   /**
    * The cached value of the '{@link #getValidator() <em>Validator</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValidator()
    * @generated
    * @ordered
    */
   protected Validator validator;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ValidatingEdgeProcessorImpl()
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
      return ControlflowPackage.Literals.VALIDATING_EDGE_PROCESSOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Validator getValidator()
   {
      if (validator != null && validator.eIsProxy())
      {
         InternalEObject oldValidator = (InternalEObject) validator;
         validator = (Validator) eResolveProxy(oldValidator);
         if (validator != oldValidator)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.VALIDATING_EDGE_PROCESSOR__VALIDATOR, oldValidator, validator));
         }
      }
      return validator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Validator basicGetValidator()
   {
      return validator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValidator(Validator newValidator)
   {
      Validator oldValidator = validator;
      validator = newValidator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.VALIDATING_EDGE_PROCESSOR__VALIDATOR, oldValidator, validator));
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
      case ControlflowPackage.VALIDATING_EDGE_PROCESSOR__VALIDATOR:
         if (resolve)
            return getValidator();
         return basicGetValidator();
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
      case ControlflowPackage.VALIDATING_EDGE_PROCESSOR__VALIDATOR:
         setValidator((Validator) newValue);
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
      case ControlflowPackage.VALIDATING_EDGE_PROCESSOR__VALIDATOR:
         setValidator((Validator) null);
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
      case ControlflowPackage.VALIDATING_EDGE_PROCESSOR__VALIDATOR:
         return validator != null;
      }
      return super.eIsSet(featureID);
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ValidatingEdgeProcessorImpl
