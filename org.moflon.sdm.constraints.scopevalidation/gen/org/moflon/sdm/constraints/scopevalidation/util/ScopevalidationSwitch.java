/**
 */
package org.moflon.sdm.constraints.scopevalidation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;

import org.moflon.sdm.constraints.scopevalidation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.constraints.scopevalidation.ScopevalidationPackage
 * @generated
 */
public class ScopevalidationSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ScopevalidationPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopevalidationSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = ScopevalidationPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_BLACK_PATTERN_INVOCATION_BUILDER:
      {
         AttributeConstraintBlackPatternInvocationBuilder attributeConstraintBlackPatternInvocationBuilder = (AttributeConstraintBlackPatternInvocationBuilder) theEObject;
         T result = caseAttributeConstraintBlackPatternInvocationBuilder(attributeConstraintBlackPatternInvocationBuilder);
         if (result == null)
            result = caseBlackPatternBuilder(attributeConstraintBlackPatternInvocationBuilder);
         if (result == null)
            result = caseCompoundPatternInvocationBuilder(attributeConstraintBlackPatternInvocationBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(attributeConstraintBlackPatternInvocationBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(attributeConstraintBlackPatternInvocationBuilder);
         if (result == null)
            result = caseActionBuilder(attributeConstraintBlackPatternInvocationBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_GREEN_PATTERN_INVOCATION_BUILDER:
      {
         AttributeConstraintGreenPatternInvocationBuilder attributeConstraintGreenPatternInvocationBuilder = (AttributeConstraintGreenPatternInvocationBuilder) theEObject;
         T result = caseAttributeConstraintGreenPatternInvocationBuilder(attributeConstraintGreenPatternInvocationBuilder);
         if (result == null)
            result = caseAttributeConstraintBlackPatternInvocationBuilder(attributeConstraintGreenPatternInvocationBuilder);
         if (result == null)
            result = caseBlackPatternBuilder(attributeConstraintGreenPatternInvocationBuilder);
         if (result == null)
            result = caseCompoundPatternInvocationBuilder(attributeConstraintGreenPatternInvocationBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(attributeConstraintGreenPatternInvocationBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(attributeConstraintGreenPatternInvocationBuilder);
         if (result == null)
            result = caseActionBuilder(attributeConstraintGreenPatternInvocationBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      default:
         return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint Black Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Attribute Constraint Black Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAttributeConstraintBlackPatternInvocationBuilder(AttributeConstraintBlackPatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint Green Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Attribute Constraint Green Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAttributeConstraintGreenPatternInvocationBuilder(AttributeConstraintGreenPatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Action Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Action Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActionBuilder(ActionBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePatternInvocationBuilder(PatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Regular Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Regular Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRegularPatternInvocationBuilder(RegularPatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Compound Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Compound Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCompoundPatternInvocationBuilder(CompoundPatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Black Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Black Pattern Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBlackPatternBuilder(BlackPatternBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object)
   {
      return null;
   }

} //ScopevalidationSwitch