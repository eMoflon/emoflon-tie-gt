/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.Loop;
import org.moflon.sdm.runtime.democles.Scope;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.LoopImpl#isLoopAlongTrue <em>Loop Along True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LoopImpl extends RepetitionNodeImpl implements Loop
{
   /**
    * The default value of the '{@link #isLoopAlongTrue() <em>Loop Along True</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isLoopAlongTrue()
    * @generated
    * @ordered
    */
   protected static final boolean LOOP_ALONG_TRUE_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isLoopAlongTrue() <em>Loop Along True</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isLoopAlongTrue()
    * @generated
    * @ordered
    */
   protected boolean loopAlongTrue = LOOP_ALONG_TRUE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected LoopImpl()
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
      return DemoclesPackage.Literals.LOOP;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLoopAlongTrue()
   {
      return loopAlongTrue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLoopAlongTrue(boolean newLoopAlongTrue)
   {
      boolean oldLoopAlongTrue = loopAlongTrue;
      loopAlongTrue = newLoopAlongTrue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.LOOP__LOOP_ALONG_TRUE, oldLoopAlongTrue, loopAlongTrue));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope getRelevantScope()
   {// 
      Object[] result1_black = LoopImpl.pattern_Loop_0_1_LoopsAlongTrueBranch_blackB(this);
      if (result1_black != null)
      {

         Object[] result2_black = LoopImpl.pattern_Loop_0_2_SelectChildScopeAsRelevant_blackBF(this);
         if (result2_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         Scope child = (Scope) result2_black[1];
         return LoopImpl.pattern_Loop_0_3_expressionFB(child);
      } else
      {

         Object[] result4_black = LoopImpl.pattern_Loop_0_4_SelectParentScopeAsRelevant_blackFB(this);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         Scope parent = (Scope) result4_black[0];
         return LoopImpl.pattern_Loop_0_5_expressionFB(parent);
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
      case DemoclesPackage.LOOP__LOOP_ALONG_TRUE:
         return isLoopAlongTrue();
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
      case DemoclesPackage.LOOP__LOOP_ALONG_TRUE:
         setLoopAlongTrue((Boolean) newValue);
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
      case DemoclesPackage.LOOP__LOOP_ALONG_TRUE:
         setLoopAlongTrue(LOOP_ALONG_TRUE_EDEFAULT);
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
      case DemoclesPackage.LOOP__LOOP_ALONG_TRUE:
         return loopAlongTrue != LOOP_ALONG_TRUE_EDEFAULT;
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
      case DemoclesPackage.LOOP___GET_RELEVANT_SCOPE:
         return getRelevantScope();
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
      result.append(" (loopAlongTrue: ");
      result.append(loopAlongTrue);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_Loop_0_1_LoopsAlongTrueBranch_blackB(Loop _this)
   {
      boolean this_loopAlongTrue = _this.isLoopAlongTrue();
      if (Boolean.valueOf(this_loopAlongTrue).equals(Boolean.valueOf(true)))
      {
         return new Object[] { _this };
      }

      return null;
   }

   public static final Object[] pattern_Loop_0_2_SelectChildScopeAsRelevant_blackBF(Loop _this)
   {
      for (Scope child : _this.getScopes())
      {
         return new Object[] { _this, child };
      }
      return null;
   }

   public static final Scope pattern_Loop_0_3_expressionFB(Scope child)
   {
      Scope _result = child;
      return _result;
   }

   public static final Object[] pattern_Loop_0_4_SelectParentScopeAsRelevant_blackFB(Loop _this)
   {
      Scope parent = _this.getScope();
      if (parent != null)
      {
         return new Object[] { parent, _this };
      }

      return null;
   }

   public static final Scope pattern_Loop_0_5_expressionFB(Scope parent)
   {
      Scope _result = parent;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //LoopImpl
