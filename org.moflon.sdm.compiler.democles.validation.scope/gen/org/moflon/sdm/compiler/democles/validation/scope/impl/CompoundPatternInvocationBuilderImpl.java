/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundPatternInvocationBuilderImpl#getChildBuilders <em>Child Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundPatternInvocationBuilderImpl extends RegularPatternInvocationBuilderImpl implements CompoundPatternInvocationBuilder
{
   /**
    * The cached value of the '{@link #getChildBuilders() <em>Child Builders</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getChildBuilders()
    * @generated
    * @ordered
    */
   protected EList<RegularPatternInvocationBuilder> childBuilders;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CompoundPatternInvocationBuilderImpl()
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
      return ScopePackage.Literals.COMPOUND_PATTERN_INVOCATION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<RegularPatternInvocationBuilder> getChildBuilders()
   {
      if (childBuilders == null)
      {
         childBuilders = new EObjectContainmentWithInverseEList<RegularPatternInvocationBuilder>(RegularPatternInvocationBuilder.class, this,
               ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS, ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER);
      }
      return childBuilders;
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
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildBuilders()).basicAdd(otherEnd, msgs);
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
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS:
         return ((InternalEList<?>) getChildBuilders()).basicRemove(otherEnd, msgs);
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
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS:
         return getChildBuilders();
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
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS:
         getChildBuilders().clear();
         getChildBuilders().addAll((Collection<? extends RegularPatternInvocationBuilder>) newValue);
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
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS:
         getChildBuilders().clear();
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
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS:
         return childBuilders != null && !childBuilders.isEmpty();
      }
      return super.eIsSet(featureID);
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //CompoundPatternInvocationBuilderImpl
