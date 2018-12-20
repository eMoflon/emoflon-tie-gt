/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.AttributeAssignment;
import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;

import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Green Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GreenPatternTransformerImpl extends PatternTransformerImpl implements GreenPatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GreenPatternTransformerImpl()
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
      return PatternPackage.Literals.GREEN_PATTERN_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLinkToAdd(LinkVariable linkVariable, Pattern pattern)
   {// 
      Object[] result1_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_0_1_IsLinkGreen_blackB(linkVariable);
      if (result1_black != null)
      {
         return GreenPatternTransformerImpl.pattern_GreenPatternTransformer_0_2_expressionF();
      } else
      {
         return GreenPatternTransformerImpl.pattern_GreenPatternTransformer_0_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {// 
      Object[] result1_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_1_IsVariableGreen_blackB(objectVariable);
      if (result1_black != null)
      {
         return GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_2_expressionF();
      } else
      {
         // 
         Object[] result3_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_3_HasIncomingGreenLink_blackBF(objectVariable);
         if (result3_black != null)
         {
            //nothing LinkVariable inComingLink = (LinkVariable) result3_black[1];
            return GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_4_expressionF();
         } else
         {
            // 
            Object[] result5_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_5_HasOutgoingGreenLink_blackFB(objectVariable);
            if (result5_black != null)
            {
               //nothing LinkVariable outGoingLink = (LinkVariable) result5_black[0];
               return GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_6_expressionF();
            } else
            {
               // 
               Object[] result7_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_7_HasAttributeAssignment_blackBF(objectVariable);
               if (result7_black != null)
               {
                  //nothing AttributeAssignment assignment = (AttributeAssignment) result7_black[1];
                  return GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_8_expressionF();
               } else
               {
                  return GreenPatternTransformerImpl.pattern_GreenPatternTransformer_1_9_expressionF();
               }

            }

         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void postprocess(StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_2_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // ForEach 
      for (Object[] result2_black : GreenPatternTransformerImpl.pattern_GreenPatternTransformer_2_2_ForAllObjectVariables_blackFB(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[0];
         // ForEach 
         for (Object[] result3_black : GreenPatternTransformerImpl.pattern_GreenPatternTransformer_2_3_ForAllAttributeAssignments_blackBF(objectVariable))
         {
            AttributeAssignment assignment = (AttributeAssignment) result3_black[1];
            // 
            GreenPatternTransformerImpl.pattern_GreenPatternTransformer_2_4_HandleAttributeAssignment_expressionBBB(this, assignment, pattern);

         }

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transformAssignment(AttributeAssignment assignment, Pattern pattern)
   {

      Object[] result1_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_1_Init_blackFFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ExpressionTransformer expressionTransformer = (ExpressionTransformer) result1_black[0];
      ValidationReport report = (ValidationReport) result1_black[1];
      // 
      Object[] result2_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_2_LookupAssignmentDetails_blackFBFF(assignment);
      if (result2_black != null)
      {
         EAttribute eAttribute = (EAttribute) result2_black[0];
         Expression expression = (Expression) result2_black[2];
         ObjectVariable objectVariable = (ObjectVariable) result2_black[3];

         Object[] result3_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_3_LookupObjectVariableType_blackBF(objectVariable);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ".");
         }
         EClassifier eClassifier = (EClassifier) result3_black[1];

         Object[] result4_bindingAndBlack = GreenPatternTransformerImpl
               .pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_bindingAndBlackFBBBB(this, pattern, objectVariable, eClassifier);
         if (result4_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[pattern] = " + pattern + ", "
                  + "[objectVariable] = " + objectVariable + ", " + "[eClassifier] = " + eClassifier + ".");
         }
         Variable variable = (Variable) result4_bindingAndBlack[0];

         Object[] result5_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_5_CreateAttributeConstraint_blackBBBF(pattern, eAttribute,
               variable);
         if (result5_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[eAttribute] = " + eAttribute + ", "
                  + "[variable] = " + variable + ".");
         }
         PatternBody patternBody = (PatternBody) result5_black[3];
         Object[] result5_green = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_5_CreateAttributeConstraint_greenFBFBB(eAttribute, variable,
               patternBody);
         //nothing ConstraintParameter variableParameter = (ConstraintParameter) result5_green[0];
         Attribute attribute = (Attribute) result5_green[2];

         Object[] result6_black = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_6_HandleAttributeVariable_blackFBBB(patternBody, attribute,
               eAttribute);
         if (result6_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternBody] = " + patternBody + ", " + "[attribute] = " + attribute
                  + ", " + "[eAttribute] = " + eAttribute + ".");
         }
         EDataType eDataType = (EDataType) result6_black[0];
         Object[] result6_green = GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_6_HandleAttributeVariable_greenFBBFBBBB(eDataType, patternBody,
               attribute, this, variable, eAttribute);
         EMFVariable attributeVariable = (EMFVariable) result6_green[0];
         //nothing ConstraintParameter attributeVariableParameter = (ConstraintParameter) result6_green[3];

         // 
         GreenPatternTransformerImpl.pattern_GreenPatternTransformer_3_7_TransformAndAssignExpression_expressionBBBBBBB(expressionTransformer, report, this,
               expression, pattern, attributeVariable, eDataType);
         return;
      } else
      {
         return;
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
      case PatternPackage.GREEN_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN:
         return isLinkToAdd((LinkVariable) arguments.get(0), (Pattern) arguments.get(1));
      case PatternPackage.GREEN_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      case PatternPackage.GREEN_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN:
         postprocess((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.GREEN_PATTERN_TRANSFORMER___TRANSFORM_ASSIGNMENT__ATTRIBUTEASSIGNMENT_PATTERN:
         transformAssignment((AttributeAssignment) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_GreenPatternTransformer_0_1_IsLinkGreen_blackB(LinkVariable linkVariable)
   {
      BindingOperator linkVariable_bindingOperator = linkVariable.getBindingOperator();
      if (linkVariable_bindingOperator.equals(BindingOperator.CREATE))
      {
         return new Object[] { linkVariable };
      }

      return null;
   }

   public static final boolean pattern_GreenPatternTransformer_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_GreenPatternTransformer_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_GreenPatternTransformer_1_1_IsVariableGreen_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CREATE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final boolean pattern_GreenPatternTransformer_1_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_GreenPatternTransformer_1_3_HasIncomingGreenLink_blackBF(ObjectVariable objectVariable)
   {
      for (LinkVariable inComingLink : objectVariable.getIncomingLink())
      {
         BindingOperator inComingLink_bindingOperator = inComingLink.getBindingOperator();
         if (inComingLink_bindingOperator.equals(BindingOperator.CREATE))
         {
            return new Object[] { objectVariable, inComingLink };
         }

      }
      return null;
   }

   public static final boolean pattern_GreenPatternTransformer_1_4_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_GreenPatternTransformer_1_5_HasOutgoingGreenLink_blackFB(ObjectVariable objectVariable)
   {
      for (LinkVariable outGoingLink : objectVariable.getOutgoingLink())
      {
         BindingOperator outGoingLink_bindingOperator = outGoingLink.getBindingOperator();
         if (outGoingLink_bindingOperator.equals(BindingOperator.CREATE))
         {
            return new Object[] { outGoingLink, objectVariable };
         }

      }
      return null;
   }

   public static final boolean pattern_GreenPatternTransformer_1_6_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_GreenPatternTransformer_1_7_HasAttributeAssignment_blackBF(ObjectVariable objectVariable)
   {
      for (AttributeAssignment assignment : objectVariable.getAttributeAssignment())
      {
         return new Object[] { objectVariable, assignment };
      }
      return null;
   }

   public static final boolean pattern_GreenPatternTransformer_1_8_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_GreenPatternTransformer_1_9_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_GreenPatternTransformer_2_1_Init_blackB(GreenPatternTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final Iterable<Object[]> pattern_GreenPatternTransformer_2_2_ForAllObjectVariables_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { objectVariable, storyPattern });
      }
      return _result;
   }

   public static final Iterable<Object[]> pattern_GreenPatternTransformer_2_3_ForAllAttributeAssignments_blackBF(ObjectVariable objectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (AttributeAssignment assignment : objectVariable.getAttributeAssignment())
      {
         _result.add(new Object[] { objectVariable, assignment });
      }
      return _result;
   }

   public static final void pattern_GreenPatternTransformer_2_4_HandleAttributeAssignment_expressionBBB(GreenPatternTransformer _this,
         AttributeAssignment assignment, Pattern pattern)
   {
      _this.transformAssignment(assignment, pattern);

   }

   public static final Object[] pattern_GreenPatternTransformer_3_1_Init_blackFFB(GreenPatternTransformer _this)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         ExpressionTransformer expressionTransformer = _this.getExpressionTransformer();
         if (expressionTransformer != null)
         {
            return new Object[] { expressionTransformer, report, _this };
         }

      }

      return null;
   }

   public static final Object[] pattern_GreenPatternTransformer_3_2_LookupAssignmentDetails_blackFBFF(AttributeAssignment assignment)
   {
      Expression expression = assignment.getValueExpression();
      if (expression != null)
      {
         EAttribute eAttribute = assignment.getAttribute();
         if (eAttribute != null)
         {
            ObjectVariable objectVariable = assignment.getObjectVariable();
            if (objectVariable != null)
            {
               return new Object[] { eAttribute, assignment, expression, objectVariable };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_GreenPatternTransformer_3_3_LookupObjectVariableType_blackBF(ObjectVariable objectVariable)
   {
      EClassifier eClassifier = objectVariable.getType();
      if (eClassifier != null)
      {
         return new Object[] { objectVariable, eClassifier };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_bindingFBBBB(GreenPatternTransformer _this, Pattern pattern,
         ObjectVariable objectVariable, EClassifier eClassifier)
   {
      String objectVariable_name = objectVariable.getName();
      Variable _localVariable_0 = _this.lookupVariableInPattern(pattern, objectVariable_name, eClassifier);
      Variable variable = _localVariable_0;
      if (variable != null)
      {
         return new Object[] { variable, _this, pattern, objectVariable, eClassifier };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_blackB(Variable variable)
   {
      return new Object[] { variable };
   }

   public static final Object[] pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_bindingAndBlackFBBBB(GreenPatternTransformer _this,
         Pattern pattern, ObjectVariable objectVariable, EClassifier eClassifier)
   {
      Object[] result_pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_binding = pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_bindingFBBBB(
            _this, pattern, objectVariable, eClassifier);
      if (result_pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_binding != null)
      {
         Variable variable = (Variable) result_pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_binding[0];

         Object[] result_pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_black = pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_blackB(
               variable);
         if (result_pattern_GreenPatternTransformer_3_4_LookupObjectVariableInPattern_black != null)
         {

            return new Object[] { variable, _this, pattern, objectVariable, eClassifier };
         }
      }
      return null;
   }

   public static final Object[] pattern_GreenPatternTransformer_3_5_CreateAttributeConstraint_blackBBBF(Pattern pattern, EAttribute eAttribute,
         Variable variable)
   {
      for (PatternBody patternBody : pattern.getBodies())
      {
         return new Object[] { pattern, eAttribute, variable, patternBody };
      }
      return null;
   }

   public static final Object[] pattern_GreenPatternTransformer_3_5_CreateAttributeConstraint_greenFBFBB(EAttribute eAttribute, Variable variable,
         PatternBody patternBody)
   {
      ConstraintParameter variableParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      Attribute attribute = EMFTypeFactory.eINSTANCE.createAttribute();
      variableParameter.setReference(variable);
      attribute.setEModelElement(eAttribute);
      attribute.getParameters().add(variableParameter);
      patternBody.getConstraints().add(attribute);
      return new Object[] { variableParameter, eAttribute, attribute, variable, patternBody };
   }

   public static final Object[] pattern_GreenPatternTransformer_3_6_HandleAttributeVariable_blackFBBB(PatternBody patternBody, Attribute attribute,
         EAttribute eAttribute)
   {
      EClassifier tmpEDataType = eAttribute.getEType();
      if (tmpEDataType instanceof EDataType)
      {
         EDataType eDataType = (EDataType) tmpEDataType;
         return new Object[] { eDataType, patternBody, attribute, eAttribute };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternTransformer_3_6_HandleAttributeVariable_greenFBBFBBBB(EDataType eDataType, PatternBody patternBody,
         Attribute attribute, GreenPatternTransformer _this, Variable variable, EAttribute eAttribute)
   {
      EMFVariable attributeVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      ConstraintParameter attributeVariableParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      attributeVariable.setEClassifier(eDataType);
      patternBody.getLocalVariables().add(attributeVariable);
      attributeVariableParameter.setReference(attributeVariable);
      attribute.getParameters().add(attributeVariableParameter);
      String variable_name = variable.getName();
      String _localVariable_2 = _this.concat(variable_name, "_");
      String eAttribute_name = eAttribute.getName();
      String _localVariable_1 = _this.concat(_localVariable_2, eAttribute_name);
      String _localVariable_0 = _this.concat(_localVariable_1, "_prime");
      String attributeVariable_name_prime = _localVariable_0;
      attributeVariable.setName(attributeVariable_name_prime);
      return new Object[] { attributeVariable, eDataType, patternBody, attributeVariableParameter, attribute, _this, variable, eAttribute };

   }

   public static final void pattern_GreenPatternTransformer_3_7_TransformAndAssignExpression_expressionBBBBBBB(ExpressionTransformer expressionTransformer,
         ValidationReport report, GreenPatternTransformer _this, Expression expression, Pattern pattern, EMFVariable attributeVariable, EDataType eDataType)
   {
      expressionTransformer.transformAndAssignExpression(report, _this, expression, pattern, attributeVariable, eDataType);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //GreenPatternTransformerImpl
