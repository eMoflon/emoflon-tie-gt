/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.VariableReferenceImpl#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.VariableReferenceImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.VariableReferenceImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableReferenceImpl extends EObjectImpl implements VariableReference
{
   /**
    * The cached value of the '{@link #getTo() <em>To</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTo()
    * @generated
    * @ordered
    */
   protected Variable to;

   /**
    * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFrom()
    * @generated
    * @ordered
    */
   protected CFVariable from;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected VariableReferenceImpl()
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
      return DemoclesPackage.Literals.VARIABLE_REFERENCE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternInvocation getInvocation()
   {
      if (eContainerFeatureID() != DemoclesPackage.VARIABLE_REFERENCE__INVOCATION)
         return null;
      return (PatternInvocation) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInvocation(PatternInvocation newInvocation, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newInvocation, DemoclesPackage.VARIABLE_REFERENCE__INVOCATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInvocation(PatternInvocation newInvocation)
   {
      if (newInvocation != eInternalContainer() || (eContainerFeatureID() != DemoclesPackage.VARIABLE_REFERENCE__INVOCATION && newInvocation != null))
      {
         if (EcoreUtil.isAncestor(this, newInvocation))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newInvocation != null)
            msgs = ((InternalEObject) newInvocation).eInverseAdd(this, DemoclesPackage.PATTERN_INVOCATION__PARAMETERS, PatternInvocation.class, msgs);
         msgs = basicSetInvocation(newInvocation, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.VARIABLE_REFERENCE__INVOCATION, newInvocation, newInvocation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Variable getTo()
   {
      if (to != null && ((EObject) to).eIsProxy())
      {
         InternalEObject oldTo = (InternalEObject) to;
         to = (Variable) eResolveProxy(oldTo);
         if (to != oldTo)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.VARIABLE_REFERENCE__TO, oldTo, to));
         }
      }
      return to;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Variable basicGetTo()
   {
      return to;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTo(Variable newTo)
   {
      Variable oldTo = to;
      to = newTo;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.VARIABLE_REFERENCE__TO, oldTo, to));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CFVariable getFrom()
   {
      if (from != null && from.eIsProxy())
      {
         InternalEObject oldFrom = (InternalEObject) from;
         from = (CFVariable) eResolveProxy(oldFrom);
         if (from != oldFrom)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.VARIABLE_REFERENCE__FROM, oldFrom, from));
         }
      }
      return from;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CFVariable basicGetFrom()
   {
      return from;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetFrom(CFVariable newFrom, NotificationChain msgs)
   {
      CFVariable oldFrom = from;
      from = newFrom;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoclesPackage.VARIABLE_REFERENCE__FROM, oldFrom, newFrom);
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
   public void setFrom(CFVariable newFrom)
   {
      if (newFrom != from)
      {
         NotificationChain msgs = null;
         if (from != null)
            msgs = ((InternalEObject) from).eInverseRemove(this, DemoclesPackage.CF_VARIABLE__REFERENCES, CFVariable.class, msgs);
         if (newFrom != null)
            msgs = ((InternalEObject) newFrom).eInverseAdd(this, DemoclesPackage.CF_VARIABLE__REFERENCES, CFVariable.class, msgs);
         msgs = basicSetFrom(newFrom, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.VARIABLE_REFERENCE__FROM, newFrom, newFrom));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isFree()
   {

      Object[] result1_black = VariableReferenceImpl.pattern_VariableReference_0_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      if (VariableReferenceImpl.pattern_VariableReference_0_2_IsConstructedVariable_expressionFB(this))
      {
         return VariableReferenceImpl.pattern_VariableReference_0_3_expressionF();
      } else
      {
         // 
         if (VariableReferenceImpl.pattern_VariableReference_0_4_IsReassignedVariable_expressionFB(this))
         {
            return VariableReferenceImpl.pattern_VariableReference_0_5_expressionF();
         } else
         {
            return VariableReferenceImpl.pattern_VariableReference_0_6_expressionF();
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isConstructed()
   {// 
      Object[] result1_black = VariableReferenceImpl.pattern_VariableReference_1_1_IsVariableConstructed_blackBFF(this);
      if (result1_black != null)
      {
         //nothing PatternInvocation patternInvocation = (PatternInvocation) result1_black[1];
         //nothing CFVariable variable = (CFVariable) result1_black[2];
         return VariableReferenceImpl.pattern_VariableReference_1_2_expressionF();
      } else
      {
         return VariableReferenceImpl.pattern_VariableReference_1_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isReassigned()
   {// 
      Object[] result1_black = VariableReferenceImpl.pattern_VariableReference_2_1_IsVariableReassigned_blackBFF(this);
      if (result1_black != null)
      {
         //nothing PatternInvocation patternInvocation = (PatternInvocation) result1_black[1];
         //nothing CFVariable variable = (CFVariable) result1_black[2];
         return VariableReferenceImpl.pattern_VariableReference_2_2_expressionF();
      } else
      {
         return VariableReferenceImpl.pattern_VariableReference_2_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DemoclesPackage.VARIABLE_REFERENCE__INVOCATION:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetInvocation((PatternInvocation) otherEnd, msgs);
      case DemoclesPackage.VARIABLE_REFERENCE__FROM:
         if (from != null)
            msgs = ((InternalEObject) from).eInverseRemove(this, DemoclesPackage.CF_VARIABLE__REFERENCES, CFVariable.class, msgs);
         return basicSetFrom((CFVariable) otherEnd, msgs);
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
      case DemoclesPackage.VARIABLE_REFERENCE__INVOCATION:
         return basicSetInvocation(null, msgs);
      case DemoclesPackage.VARIABLE_REFERENCE__FROM:
         return basicSetFrom(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
      case DemoclesPackage.VARIABLE_REFERENCE__INVOCATION:
         return eInternalContainer().eInverseRemove(this, DemoclesPackage.PATTERN_INVOCATION__PARAMETERS, PatternInvocation.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
      case DemoclesPackage.VARIABLE_REFERENCE__INVOCATION:
         return getInvocation();
      case DemoclesPackage.VARIABLE_REFERENCE__TO:
         if (resolve)
            return getTo();
         return basicGetTo();
      case DemoclesPackage.VARIABLE_REFERENCE__FROM:
         if (resolve)
            return getFrom();
         return basicGetFrom();
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
      case DemoclesPackage.VARIABLE_REFERENCE__INVOCATION:
         setInvocation((PatternInvocation) newValue);
         return;
      case DemoclesPackage.VARIABLE_REFERENCE__TO:
         setTo((Variable) newValue);
         return;
      case DemoclesPackage.VARIABLE_REFERENCE__FROM:
         setFrom((CFVariable) newValue);
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
      case DemoclesPackage.VARIABLE_REFERENCE__INVOCATION:
         setInvocation((PatternInvocation) null);
         return;
      case DemoclesPackage.VARIABLE_REFERENCE__TO:
         setTo((Variable) null);
         return;
      case DemoclesPackage.VARIABLE_REFERENCE__FROM:
         setFrom((CFVariable) null);
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
      case DemoclesPackage.VARIABLE_REFERENCE__INVOCATION:
         return getInvocation() != null;
      case DemoclesPackage.VARIABLE_REFERENCE__TO:
         return to != null;
      case DemoclesPackage.VARIABLE_REFERENCE__FROM:
         return from != null;
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
      case DemoclesPackage.VARIABLE_REFERENCE___IS_FREE:
         return isFree();
      case DemoclesPackage.VARIABLE_REFERENCE___IS_CONSTRUCTED:
         return isConstructed();
      case DemoclesPackage.VARIABLE_REFERENCE___IS_REASSIGNED:
         return isReassigned();
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_VariableReference_0_1_LookupThisObject_blackB(VariableReference _this)
   {
      return new Object[] { _this };
   }

   public static final boolean pattern_VariableReference_0_2_IsConstructedVariable_expressionFB(VariableReference _this)
   {
      boolean _localVariable_0 = _this.isConstructed();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_VariableReference_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_VariableReference_0_4_IsReassignedVariable_expressionFB(VariableReference _this)
   {
      boolean _localVariable_0 = _this.isReassigned();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_VariableReference_0_5_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_VariableReference_0_6_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_VariableReference_1_1_IsVariableConstructed_blackBFF(VariableReference _this)
   {
      CFVariable variable = _this.getFrom();
      if (variable != null)
      {
         PatternInvocation patternInvocation = _this.getInvocation();
         if (patternInvocation != null)
         {
            if (patternInvocation.equals(variable.getConstructor()))
            {
               return new Object[] { _this, patternInvocation, variable };
            }
         }

      }

      return null;
   }

   public static final boolean pattern_VariableReference_1_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_VariableReference_1_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_VariableReference_2_1_IsVariableReassigned_blackBFF(VariableReference _this)
   {
      PatternInvocation patternInvocation = _this.getInvocation();
      if (patternInvocation != null)
      {
         CFVariable variable = _this.getFrom();
         if (variable != null)
         {
            if (variable.getReassignments().contains(patternInvocation))
            {
               return new Object[] { _this, patternInvocation, variable };
            }
         }

      }

      return null;
   }

   public static final boolean pattern_VariableReference_2_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_VariableReference_2_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   @Override
   public String toString()
   {
      return "VariableReferenceImpl [to=" + to + ", from=" + from + "]";
   }

   // [user code injected with eMoflon] -->
} //VariableReferenceImpl
