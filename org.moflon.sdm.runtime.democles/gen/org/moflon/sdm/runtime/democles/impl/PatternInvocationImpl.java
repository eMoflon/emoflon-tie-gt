/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.PatternInvocationImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.PatternInvocationImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PatternInvocationImpl extends ActionImpl implements PatternInvocation
{
   /**
    * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPattern()
    * @generated
    * @ordered
    */
   protected Pattern pattern;

   /**
    * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameters()
    * @generated
    * @ordered
    */
   protected EList<VariableReference> parameters;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PatternInvocationImpl()
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
      return DemoclesPackage.Literals.PATTERN_INVOCATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pattern getPattern()
   {
      if (pattern != null && ((EObject) pattern).eIsProxy())
      {
         InternalEObject oldPattern = (InternalEObject) pattern;
         pattern = (Pattern) eResolveProxy(oldPattern);
         if (pattern != oldPattern)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.PATTERN_INVOCATION__PATTERN, oldPattern, pattern));
         }
      }
      return pattern;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pattern basicGetPattern()
   {
      return pattern;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPattern(Pattern newPattern)
   {
      Pattern oldPattern = pattern;
      pattern = newPattern;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.PATTERN_INVOCATION__PATTERN, oldPattern, pattern));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<VariableReference> getParameters()
   {
      if (parameters == null)
      {
         parameters = new EObjectContainmentWithInverseEList<VariableReference>(VariableReference.class, this, DemoclesPackage.PATTERN_INVOCATION__PARAMETERS,
               DemoclesPackage.VARIABLE_REFERENCE__INVOCATION);
      }
      return parameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean hasReferencedFreeParameters()
   {// 
      Object[] result1_black = PatternInvocationImpl.pattern_PatternInvocation_0_1_HasReferencedFreeParameter_blackBFFF(this);
      if (result1_black != null)
      {
         //nothing VariableReference parameter = (VariableReference) result1_black[1];
         //nothing CFVariable variable = (CFVariable) result1_black[2];
         //nothing VariableReference reference = (VariableReference) result1_black[3];
         return PatternInvocationImpl.pattern_PatternInvocation_0_2_expressionF();
      } else
      {
         return PatternInvocationImpl.pattern_PatternInvocation_0_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isMultipleMatch()
   {// 
      return PatternInvocationImpl.pattern_PatternInvocation_1_2_expressionF();
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
      case DemoclesPackage.PATTERN_INVOCATION__PARAMETERS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
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
      case DemoclesPackage.PATTERN_INVOCATION__PARAMETERS:
         return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
      case DemoclesPackage.PATTERN_INVOCATION__PATTERN:
         if (resolve)
            return getPattern();
         return basicGetPattern();
      case DemoclesPackage.PATTERN_INVOCATION__PARAMETERS:
         return getParameters();
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
      case DemoclesPackage.PATTERN_INVOCATION__PATTERN:
         setPattern((Pattern) newValue);
         return;
      case DemoclesPackage.PATTERN_INVOCATION__PARAMETERS:
         getParameters().clear();
         getParameters().addAll((Collection<? extends VariableReference>) newValue);
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
      case DemoclesPackage.PATTERN_INVOCATION__PATTERN:
         setPattern((Pattern) null);
         return;
      case DemoclesPackage.PATTERN_INVOCATION__PARAMETERS:
         getParameters().clear();
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
      case DemoclesPackage.PATTERN_INVOCATION__PATTERN:
         return pattern != null;
      case DemoclesPackage.PATTERN_INVOCATION__PARAMETERS:
         return parameters != null && !parameters.isEmpty();
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
      case DemoclesPackage.PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS:
         return hasReferencedFreeParameters();
      case DemoclesPackage.PATTERN_INVOCATION___IS_MULTIPLE_MATCH:
         return isMultipleMatch();
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_PatternInvocation_0_1_HasReferencedFreeParameter_blackBFFF(PatternInvocation _this)
   {
      for (VariableReference parameter : _this.getParameters())
      {
         CFVariable variable = parameter.getFrom();
         if (variable != null)
         {
            if (_this.equals(variable.getConstructor()))
            {
               for (VariableReference reference : variable.getReferences())
               {
                  if (!parameter.equals(reference))
                  {
                     return new Object[] { _this, parameter, variable, reference };
                  }
               }
            }
         }

      }
      return null;
   }

   public static final boolean pattern_PatternInvocation_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_PatternInvocation_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_PatternInvocation_1_2_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   @Override
   public String toString()
   {
      return "PatternInvocationImpl [pattern=" + pattern + ", parameters=" + parameters + ", hasReferencedFreeParameters()=" + hasReferencedFreeParameters()
            + ", isMultipleMatch()=" + isMultipleMatch() + "]";
   }

   // [user code injected with eMoflon] -->
} //PatternInvocationImpl
