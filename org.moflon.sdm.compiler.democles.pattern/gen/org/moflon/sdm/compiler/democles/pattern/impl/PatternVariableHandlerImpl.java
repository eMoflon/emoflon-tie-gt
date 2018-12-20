/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.patterns.ObjectVariable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;

import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatternVariableHandlerImpl extends EObjectImpl implements PatternVariableHandler
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PatternVariableHandlerImpl()
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
      return PatternPackage.Literals.PATTERN_VARIABLE_HANDLER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String concat(String first, String second)
   {
      // [user code injected with eMoflon]

      return first + second;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Variable getAttributeVariable(ObjectVariable attributeOwner, EAttribute eAttribute, Pattern pattern)
   {

      Object[] result1_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_1_LookupAttributeOwnerType_blackBFB(this, attributeOwner);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[attributeOwner] = " + attributeOwner + ".");
      }
      EClassifier eClassifier = (EClassifier) result1_black[1];

      Object[] result2_bindingAndBlack = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_bindingAndBlackFBBBB(this,
            pattern, attributeOwner, eClassifier);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[pattern] = " + pattern + ", "
               + "[attributeOwner] = " + attributeOwner + ", " + "[eClassifier] = " + eClassifier + ".");
      }
      Variable variable = (Variable) result2_bindingAndBlack[0];

      Object[] result3_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_3_LookupPatternBody_blackBF(pattern);
      if (result3_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ".");
      }
      PatternBody patternBody = (PatternBody) result3_black[1];
      // 
      Object[] result4_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_4_IsAttributeOfOwnerAlreadyKnown_blackFBBBB(patternBody, this,
            variable, eAttribute);
      if (result4_black != null)
      {
         Variable attribute = (Variable) result4_black[0];
         return PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_5_expressionFB(attribute);
      } else
      {

         Object[] result6_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_6_CreateAttributeLookupConstraint_blackBBB(eAttribute, variable,
               patternBody);
         if (result6_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eAttribute] = " + eAttribute + ", " + "[variable] = " + variable + ", "
                  + "[patternBody] = " + patternBody + ".");
         }
         Object[] result6_green = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_6_CreateAttributeLookupConstraint_greenFBBFB(eAttribute, variable,
               patternBody);
         Attribute newConstraint = (Attribute) result6_green[0];
         //nothing ConstraintParameter parameter = (ConstraintParameter) result6_green[3];

         Object[] result7_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_7_CreateAttributeVariable_blackFBBB(patternBody, eAttribute,
               newConstraint);
         if (result7_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternBody] = " + patternBody + ", " + "[eAttribute] = " + eAttribute
                  + ", " + "[newConstraint] = " + newConstraint + ".");
         }
         EDataType eDataType = (EDataType) result7_black[0];
         Object[] result7_green = PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_7_CreateAttributeVariable_greenFBBBFBBB(eDataType, patternBody,
               newConstraint, this, variable, eAttribute);
         //nothing ConstraintParameter newAttributeParameter = (ConstraintParameter) result7_green[0];
         EMFVariable newAttribute = (EMFVariable) result7_green[4];

         return PatternVariableHandlerImpl.pattern_PatternVariableHandler_1_8_expressionFB(newAttribute);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Variable lookupVariableInPattern(Pattern pattern, String variableName, EClassifier variableType)
   {// 
      Object[] result1_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_2_1_IsSymbolicParameter_blackBFB(pattern, variableName);
      if (result1_black != null)
      {
         Variable symbolicParameter = (Variable) result1_black[1];
         return PatternVariableHandlerImpl.pattern_PatternVariableHandler_2_2_expressionFB(symbolicParameter);
      } else
      {
         // 
         Object[] result3_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_2_3_IsLocalVariable_blackFBFB(pattern, variableName);
         if (result3_black != null)
         {
            //nothing PatternBody body = (PatternBody) result3_black[0];
            Variable localVariable = (Variable) result3_black[2];
            return PatternVariableHandlerImpl.pattern_PatternVariableHandler_2_4_expressionFB(localVariable);
         } else
         {

            Object[] result5_black = PatternVariableHandlerImpl.pattern_PatternVariableHandler_2_5_CreateNewSymbolicParameter_blackBB(pattern, variableType);
            if (result5_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[variableType] = " + variableType + ".");
            }
            Object[] result5_green = PatternVariableHandlerImpl.pattern_PatternVariableHandler_2_5_CreateNewSymbolicParameter_greenBBFB(pattern, variableType,
                  variableName);
            EMFVariable newSymbolicParameter = (EMFVariable) result5_green[2];

            return PatternVariableHandlerImpl.pattern_PatternVariableHandler_2_6_expressionFB(newSymbolicParameter);
         }

      }

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
      case PatternPackage.PATTERN_VARIABLE_HANDLER___CONCAT__STRING_STRING:
         return concat((String) arguments.get(0), (String) arguments.get(1));
      case PatternPackage.PATTERN_VARIABLE_HANDLER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN:
         return getAttributeVariable((ObjectVariable) arguments.get(0), (EAttribute) arguments.get(1), (Pattern) arguments.get(2));
      case PatternPackage.PATTERN_VARIABLE_HANDLER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER:
         return lookupVariableInPattern((Pattern) arguments.get(0), (String) arguments.get(1), (EClassifier) arguments.get(2));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_PatternVariableHandler_1_1_LookupAttributeOwnerType_blackBFB(PatternVariableHandler _this,
         ObjectVariable attributeOwner)
   {
      EClassifier eClassifier = attributeOwner.getType();
      if (eClassifier != null)
      {
         return new Object[] { _this, eClassifier, attributeOwner };
      }

      return null;
   }

   public static final Object[] pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_bindingFBBBB(PatternVariableHandler _this, Pattern pattern,
         ObjectVariable attributeOwner, EClassifier eClassifier)
   {
      String attributeOwner_name = attributeOwner.getName();
      Variable _localVariable_0 = _this.lookupVariableInPattern(pattern, attributeOwner_name, eClassifier);
      Variable variable = _localVariable_0;
      if (variable != null)
      {
         return new Object[] { variable, _this, pattern, attributeOwner, eClassifier };
      }

      return null;
   }

   public static final Object[] pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_blackB(Variable variable)
   {
      return new Object[] { variable };
   }

   public static final Object[] pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_bindingAndBlackFBBBB(PatternVariableHandler _this,
         Pattern pattern, ObjectVariable attributeOwner, EClassifier eClassifier)
   {
      Object[] result_pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_binding = pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_bindingFBBBB(
            _this, pattern, attributeOwner, eClassifier);
      if (result_pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_binding != null)
      {
         Variable variable = (Variable) result_pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_binding[0];

         Object[] result_pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_black = pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_blackB(
               variable);
         if (result_pattern_PatternVariableHandler_1_2_LookupAttributeOwnerVariable_black != null)
         {

            return new Object[] { variable, _this, pattern, attributeOwner, eClassifier };
         }
      }
      return null;
   }

   public static final Object[] pattern_PatternVariableHandler_1_3_LookupPatternBody_blackBF(Pattern pattern)
   {
      for (PatternBody patternBody : pattern.getBodies())
      {
         return new Object[] { pattern, patternBody };
      }
      return null;
   }

   public static final Object[] pattern_PatternVariableHandler_1_4_IsAttributeOfOwnerAlreadyKnown_blackFBBBB(PatternBody patternBody,
         PatternVariableHandler _this, Variable variable, EAttribute eAttribute)
   {
      String variable_name = variable.getName();
      String _localVariable_1 = _this.concat(variable_name, "_");
      String eAttribute_name = eAttribute.getName();
      String _localVariable_0 = _this.concat(_localVariable_1, eAttribute_name);
      for (Variable attribute : patternBody.getLocalVariables())
      {
         if (!attribute.equals(variable))
         {
            String attribute_name = attribute.getName();
            if (attribute_name.equals(_localVariable_0))
            {
               return new Object[] { attribute, patternBody, _this, variable, eAttribute };
            }

         }
      }

      return null;
   }

   public static final Variable pattern_PatternVariableHandler_1_5_expressionFB(Variable attribute)
   {
      Variable _result = attribute;
      return _result;
   }

   public static final Object[] pattern_PatternVariableHandler_1_6_CreateAttributeLookupConstraint_blackBBB(EAttribute eAttribute, Variable variable,
         PatternBody patternBody)
   {
      return new Object[] { eAttribute, variable, patternBody };
   }

   public static final Object[] pattern_PatternVariableHandler_1_6_CreateAttributeLookupConstraint_greenFBBFB(EAttribute eAttribute, Variable variable,
         PatternBody patternBody)
   {
      Attribute newConstraint = EMFTypeFactory.eINSTANCE.createAttribute();
      ConstraintParameter parameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      newConstraint.setEModelElement(eAttribute);
      patternBody.getConstraints().add(newConstraint);
      newConstraint.getParameters().add(parameter);
      parameter.setReference(variable);
      return new Object[] { newConstraint, eAttribute, variable, parameter, patternBody };
   }

   public static final Object[] pattern_PatternVariableHandler_1_7_CreateAttributeVariable_blackFBBB(PatternBody patternBody, EAttribute eAttribute,
         Attribute newConstraint)
   {
      EClassifier tmpEDataType = eAttribute.getEType();
      if (tmpEDataType instanceof EDataType)
      {
         EDataType eDataType = (EDataType) tmpEDataType;
         return new Object[] { eDataType, patternBody, eAttribute, newConstraint };
      }

      return null;
   }

   public static final Object[] pattern_PatternVariableHandler_1_7_CreateAttributeVariable_greenFBBBFBBB(EDataType eDataType, PatternBody patternBody,
         Attribute newConstraint, PatternVariableHandler _this, Variable variable, EAttribute eAttribute)
   {
      ConstraintParameter newAttributeParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      EMFVariable newAttribute = EMFTypeFactory.eINSTANCE.createEMFVariable();
      newConstraint.getParameters().add(newAttributeParameter);
      newAttributeParameter.setReference(newAttribute);
      patternBody.getLocalVariables().add(newAttribute);
      newAttribute.setEClassifier(eDataType);
      String variable_name = variable.getName();
      String _localVariable_1 = _this.concat(variable_name, "_");
      String eAttribute_name = eAttribute.getName();
      String _localVariable_0 = _this.concat(_localVariable_1, eAttribute_name);
      String newAttribute_name_prime = _localVariable_0;
      newAttribute.setName(newAttribute_name_prime);
      return new Object[] { newAttributeParameter, eDataType, patternBody, newConstraint, newAttribute, _this, variable, eAttribute };

   }

   public static final Variable pattern_PatternVariableHandler_1_8_expressionFB(EMFVariable newAttribute)
   {
      Variable _result = newAttribute;
      return _result;
   }

   public static final Object[] pattern_PatternVariableHandler_2_1_IsSymbolicParameter_blackBFB(Pattern pattern, String variableName)
   {
      for (Variable symbolicParameter : pattern.getSymbolicParameters())
      {
         String symbolicParameter_name = symbolicParameter.getName();
         if (symbolicParameter_name.equals(variableName))
         {
            return new Object[] { pattern, symbolicParameter, variableName };
         }

      }
      return null;
   }

   public static final Variable pattern_PatternVariableHandler_2_2_expressionFB(Variable symbolicParameter)
   {
      Variable _result = symbolicParameter;
      return _result;
   }

   public static final Object[] pattern_PatternVariableHandler_2_3_IsLocalVariable_blackFBFB(Pattern pattern, String variableName)
   {
      for (PatternBody body : pattern.getBodies())
      {
         for (Variable localVariable : body.getLocalVariables())
         {
            String localVariable_name = localVariable.getName();
            if (localVariable_name.equals(variableName))
            {
               return new Object[] { body, pattern, localVariable, variableName };
            }

         }
      }
      return null;
   }

   public static final Variable pattern_PatternVariableHandler_2_4_expressionFB(Variable localVariable)
   {
      Variable _result = localVariable;
      return _result;
   }

   public static final Object[] pattern_PatternVariableHandler_2_5_CreateNewSymbolicParameter_blackBB(Pattern pattern, EClassifier variableType)
   {
      return new Object[] { pattern, variableType };
   }

   public static final Object[] pattern_PatternVariableHandler_2_5_CreateNewSymbolicParameter_greenBBFB(Pattern pattern, EClassifier variableType,
         String variableName)
   {
      EMFVariable newSymbolicParameter = EMFTypeFactory.eINSTANCE.createEMFVariable();
      String newSymbolicParameter_name_prime = variableName;
      pattern.getSymbolicParameters().add(newSymbolicParameter);
      newSymbolicParameter.setEClassifier(variableType);
      newSymbolicParameter.setName(newSymbolicParameter_name_prime);
      return new Object[] { pattern, variableType, newSymbolicParameter, variableName };
   }

   public static final Variable pattern_PatternVariableHandler_2_6_expressionFB(EMFVariable newSymbolicParameter)
   {
      Variable _result = newSymbolicParameter;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //PatternVariableHandlerImpl
