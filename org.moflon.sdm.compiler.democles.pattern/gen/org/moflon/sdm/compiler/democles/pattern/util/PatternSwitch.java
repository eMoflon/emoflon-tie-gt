/**
 */
package org.moflon.sdm.compiler.democles.pattern.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.sdm.compiler.democles.pattern.*;

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
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage
 * @generated
 */
public class PatternSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static PatternPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = PatternPackage.eINSTANCE;
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
      case PatternPackage.GREEN_PATTERN_TRANSFORMER:
      {
         GreenPatternTransformer greenPatternTransformer = (GreenPatternTransformer) theEObject;
         T result = caseGreenPatternTransformer(greenPatternTransformer);
         if (result == null)
            result = casePatternTransformer(greenPatternTransformer);
         if (result == null)
            result = casePatternVariableHandler(greenPatternTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.PATTERN_VARIABLE_HANDLER:
      {
         PatternVariableHandler patternVariableHandler = (PatternVariableHandler) theEObject;
         T result = casePatternVariableHandler(patternVariableHandler);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER:
      {
         BlackAndNacPatternTransformer blackAndNacPatternTransformer = (BlackAndNacPatternTransformer) theEObject;
         T result = caseBlackAndNacPatternTransformer(blackAndNacPatternTransformer);
         if (result == null)
            result = casePatternTransformer(blackAndNacPatternTransformer);
         if (result == null)
            result = casePatternVariableHandler(blackAndNacPatternTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.NAC_PATTERN_TRANSFORMER:
      {
         NacPatternTransformer nacPatternTransformer = (NacPatternTransformer) theEObject;
         T result = caseNacPatternTransformer(nacPatternTransformer);
         if (result == null)
            result = caseBlackAndNacPatternTransformer(nacPatternTransformer);
         if (result == null)
            result = casePatternTransformer(nacPatternTransformer);
         if (result == null)
            result = casePatternVariableHandler(nacPatternTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.BINDING_PATTERN_TRANSFORMER:
      {
         BindingPatternTransformer bindingPatternTransformer = (BindingPatternTransformer) theEObject;
         T result = caseBindingPatternTransformer(bindingPatternTransformer);
         if (result == null)
            result = casePatternTransformer(bindingPatternTransformer);
         if (result == null)
            result = casePatternVariableHandler(bindingPatternTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER:
      {
         DefaultExpressionTransformer defaultExpressionTransformer = (DefaultExpressionTransformer) theEObject;
         T result = caseDefaultExpressionTransformer(defaultExpressionTransformer);
         if (result == null)
            result = caseExpressionTransformer(defaultExpressionTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.PATTERN_TRANSFORMER:
      {
         PatternTransformer patternTransformer = (PatternTransformer) theEObject;
         T result = casePatternTransformer(patternTransformer);
         if (result == null)
            result = casePatternVariableHandler(patternTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.EXPRESSION_TRANSFORMER:
      {
         ExpressionTransformer expressionTransformer = (ExpressionTransformer) theEObject;
         T result = caseExpressionTransformer(expressionTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.RED_PATTERN_TRANSFORMER:
      {
         RedPatternTransformer redPatternTransformer = (RedPatternTransformer) theEObject;
         T result = caseRedPatternTransformer(redPatternTransformer);
         if (result == null)
            result = casePatternTransformer(redPatternTransformer);
         if (result == null)
            result = casePatternVariableHandler(redPatternTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case PatternPackage.LITERAL_EXPRESSION_TRANSFORMER:
      {
         LiteralExpressionTransformer literalExpressionTransformer = (LiteralExpressionTransformer) theEObject;
         T result = caseLiteralExpressionTransformer(literalExpressionTransformer);
         if (result == null)
            result = caseExpressionTransformer(literalExpressionTransformer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      default:
         return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Green Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Green Pattern Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGreenPatternTransformer(GreenPatternTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Variable Handler</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Variable Handler</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePatternVariableHandler(PatternVariableHandler object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Black And Nac Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Black And Nac Pattern Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBlackAndNacPatternTransformer(BlackAndNacPatternTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Nac Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Nac Pattern Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNacPatternTransformer(NacPatternTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Binding Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Binding Pattern Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBindingPatternTransformer(BindingPatternTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Default Expression Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Default Expression Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDefaultExpressionTransformer(DefaultExpressionTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePatternTransformer(PatternTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Expression Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Expression Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExpressionTransformer(ExpressionTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Red Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Red Pattern Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRedPatternTransformer(RedPatternTransformer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Literal Expression Transformer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Literal Expression Transformer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLiteralExpressionTransformer(LiteralExpressionTransformer object)
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

} //PatternSwitch
