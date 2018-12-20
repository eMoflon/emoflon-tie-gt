/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.expressions.ComparisonExpression;
import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.BindingSemantics;
import SDMLanguage.patterns.Constraint;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import SDMLanguage.patterns.patternExpressions.AttributeValueExpression;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;

import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;

import org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nac Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NacPatternTransformerImpl extends BlackAndNacPatternTransformerImpl implements NacPatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NacPatternTransformerImpl()
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
      return PatternPackage.Literals.NAC_PATTERN_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void addLinkToPattern(LinkVariable linkVariable, Pattern pattern)
   {

      Object[] result1_bindingAndBlack = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_1_CreateConstraint_bindingAndBlackBBFFB(this, pattern,
            linkVariable);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[pattern] = " + pattern + ", "
               + "[linkVariable] = " + linkVariable + ".");
      }
      EReference eReference = (EReference) result1_bindingAndBlack[2];
      PatternBody patternBody = (PatternBody) result1_bindingAndBlack[3];
      Object[] result1_green = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_1_CreateConstraint_greenBFB(eReference, patternBody);
      Reference constraint = (Reference) result1_green[1];

      Object[] result2_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_2_LookupSource_blackBF(linkVariable);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[linkVariable] = " + linkVariable + ".");
      }
      ObjectVariable source = (ObjectVariable) result2_black[1];
      // 
      Object[] result3_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_3_IsSourceNegative_blackB(source);
      if (result3_black != null)
      {

         Object[] result4_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_4_LookUpSourceInBody_blackBFBB(constraint, patternBody, source);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[patternBody] = " + patternBody
                  + ", " + "[source] = " + source + ".");
         }
         Variable negativeSource = (Variable) result4_black[1];
         NacPatternTransformerImpl.pattern_NacPatternTransformer_0_4_LookUpSourceInBody_greenBBFB(constraint, negativeSource, source);
         //nothing ConstraintParameter negativeSourceParameter = (ConstraintParameter) result4_green[2];

      } else
      {

         Object[] result5_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_5_LookUpSourceInPattern_blackBBFB(constraint, pattern, source);
         if (result5_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[pattern] = " + pattern + ", "
                  + "[source] = " + source + ".");
         }
         Variable mandatorySource = (Variable) result5_black[2];
         NacPatternTransformerImpl.pattern_NacPatternTransformer_0_5_LookUpSourceInPattern_greenBFBB(constraint, mandatorySource, source);
         //nothing ConstraintParameter mandatorySourceParameter = (ConstraintParameter) result5_green[1];

      }

      Object[] result6_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_6_LookupTarget_blackBF(linkVariable);
      if (result6_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[linkVariable] = " + linkVariable + ".");
      }
      ObjectVariable target = (ObjectVariable) result6_black[1];
      // 
      Object[] result7_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_7_IsTargetNegative_blackB(target);
      if (result7_black != null)
      {

         Object[] result8_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_8_LookUpTargetInBody_blackFBBB(constraint, patternBody, target);
         if (result8_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[patternBody] = " + patternBody
                  + ", " + "[target] = " + target + ".");
         }
         Variable negativeTarget = (Variable) result8_black[0];
         NacPatternTransformerImpl.pattern_NacPatternTransformer_0_8_LookUpTargetInBody_greenBFBB(negativeTarget, constraint, target);
         //nothing ConstraintParameter negativeTargetParameter = (ConstraintParameter) result8_green[1];

         return;
      } else
      {

         Object[] result10_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_0_10_LookUpTargetInPattern_blackFBBB(constraint, pattern, target);
         if (result10_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[pattern] = " + pattern + ", "
                  + "[target] = " + target + ".");
         }
         Variable mandatoryTarget = (Variable) result10_black[0];
         NacPatternTransformerImpl.pattern_NacPatternTransformer_0_10_LookUpTargetInPattern_greenBFBB(mandatoryTarget, constraint, target);
         //nothing ConstraintParameter mandatoryTargetParameter = (ConstraintParameter) result10_green[1];

         return;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLinkToAdd(LinkVariable linkVariable, Pattern pattern)
   {

      Object[] result1_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_1_1_LookupPatternBody_blackBF(pattern);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ".");
      }
      PatternBody body = (PatternBody) result1_black[1];
      // 
      Object[] result2_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_1_2_IsSourceNegative_blackBF(linkVariable);
      if (result2_black != null)
      {
         ObjectVariable source = (ObjectVariable) result2_black[1];
         // 
         Object[] result3_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_1_3_ExistsSourceLocalVariable_blackBFB(body, source);
         if (result3_black != null)
         {
            //nothing Variable sourceLocal = (Variable) result3_black[1];
            return NacPatternTransformerImpl.pattern_NacPatternTransformer_1_4_expressionF();
         } else
         {
         }

      } else
      {
      }
      // 
      Object[] result5_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_1_5_IsTargetNegative_blackBF(linkVariable);
      if (result5_black != null)
      {
         ObjectVariable target = (ObjectVariable) result5_black[1];
         // 
         Object[] result6_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_1_6_ExistsTargetLocalVariable_blackBFB(body, target);
         if (result6_black != null)
         {
            //nothing Variable targetLocal = (Variable) result6_black[1];
            return NacPatternTransformerImpl.pattern_NacPatternTransformer_1_7_expressionF();
         } else
         {
         }

      } else
      {
      }
      return NacPatternTransformerImpl.pattern_NacPatternTransformer_1_8_expressionF();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {// 
      Object[] result1_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_2_1_IsNegativeVariable_blackB(objectVariable);
      if (result1_black != null)
      {
         return NacPatternTransformerImpl.pattern_NacPatternTransformer_2_2_expressionF();
      } else
      {
         return NacPatternTransformerImpl.pattern_NacPatternTransformer_2_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void postprocess(StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_3_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // ForEach 
      for (Object[] result2_black : NacPatternTransformerImpl.pattern_NacPatternTransformer_3_2_ForEachObjectVariable_blackFB(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[0];
         // 
         if (NacPatternTransformerImpl.pattern_NacPatternTransformer_3_3_IsRelevantObjectVariable_expressionFBB(this, objectVariable))
         {
            // 
            NacPatternTransformerImpl.pattern_NacPatternTransformer_3_4_TransformNacConstraints_expressionBBB(this, objectVariable, pattern);

         } else
         {
         }

      }
      // 
      NacPatternTransformerImpl.pattern_NacPatternTransformer_3_5_AnalyzeInjectivity_expressionBB(this, pattern);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transformNacConstraints(ObjectVariable nacObjectVariable, Pattern nacPattern)
   {// 
      Object[] result1_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_4_1_BelongsToNacPattern_blackBFFB(nacPattern, nacObjectVariable);
      if (result1_black != null)
      {
         PatternBody patternBody = (PatternBody) result1_black[1];
         //nothing Variable localVariable = (Variable) result1_black[2];

         Object[] result2_black = NacPatternTransformerImpl.pattern_NacPatternTransformer_4_2_Init_blackFFB(this);
         if (result2_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         ExpressionTransformer expressionTransformer = (ExpressionTransformer) result2_black[0];
         ValidationReport report = (ValidationReport) result2_black[1];
         // ForEach 
         for (Object[] result3_black : NacPatternTransformerImpl.pattern_NacPatternTransformer_4_3_ForEachConstraint_blackFFFFFFB(nacObjectVariable))
         {
            Expression expression = (Expression) result3_black[0];
            EAttribute eAttribute = (EAttribute) result3_black[1];
            //nothing Constraint sdmConstraint = (Constraint) result3_black[2];
            //nothing AttributeValueExpression attributeValueExpression = (AttributeValueExpression) result3_black[3];
            EDataType eDataType = (EDataType) result3_black[4];
            ComparisonExpression binaryExpression = (ComparisonExpression) result3_black[5];

            Object[] result4_bindingAndBlack = NacPatternTransformerImpl.pattern_NacPatternTransformer_4_4_CreateConstraint_bindingAndBlackFBB(this,
                  binaryExpression);
            if (result4_bindingAndBlack == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[binaryExpression] = " + binaryExpression + ".");
            }
            RelationalConstraint constraint = (RelationalConstraint) result4_bindingAndBlack[0];

            Object[] result5_bindingAndBlack = NacPatternTransformerImpl
                  .pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_bindingAndBlackFBBBBBB(patternBody, constraint, this,
                        nacObjectVariable, eAttribute, nacPattern);
            if (result5_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternBody] = " + patternBody + ", " + "[constraint] = " + constraint
                     + ", " + "[this] = " + this + ", " + "[nacObjectVariable] = " + nacObjectVariable + ", " + "[eAttribute] = " + eAttribute + ", "
                     + "[nacPattern] = " + nacPattern + ".");
            }
            Variable attribute = (Variable) result5_bindingAndBlack[0];
            NacPatternTransformerImpl.pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_greenBBFB(attribute, patternBody,
                  constraint);
            //nothing ConstraintParameter leftParameter = (ConstraintParameter) result5_green[2];

            Object[] result6_bindingAndBlack = NacPatternTransformerImpl.pattern_NacPatternTransformer_4_6_HandleRightSideExpression_bindingAndBlackBFBBBBBB(
                  constraint, expressionTransformer, report, this, expression, nacPattern, eDataType);
            if (result6_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[expressionTransformer] = "
                     + expressionTransformer + ", " + "[report] = " + report + ", " + "[this] = " + this + ", " + "[expression] = " + expression + ", "
                     + "[nacPattern] = " + nacPattern + ", " + "[eDataType] = " + eDataType + ".");
            }
            ConstraintVariable rightSideExpression = (ConstraintVariable) result6_bindingAndBlack[1];
            NacPatternTransformerImpl.pattern_NacPatternTransformer_4_6_HandleRightSideExpression_greenBFB(constraint, rightSideExpression);
            //nothing ConstraintParameter rightParameter = (ConstraintParameter) result6_green[1];

         }
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
      case PatternPackage.NAC_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN:
         addLinkToPattern((LinkVariable) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN:
         return isLinkToAdd((LinkVariable) arguments.get(0), (Pattern) arguments.get(1));
      case PatternPackage.NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      case PatternPackage.NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN:
         postprocess((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.NAC_PATTERN_TRANSFORMER___TRANSFORM_NAC_CONSTRAINTS__OBJECTVARIABLE_PATTERN:
         transformNacConstraints((ObjectVariable) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_NacPatternTransformer_0_1_CreateConstraint_bindingFBB(BlackAndNacPatternTransformer _this, LinkVariable linkVariable)
   {
      EReference _localVariable_0 = _this.getEReference(linkVariable);
      EReference eReference = _localVariable_0;
      if (eReference != null)
      {
         return new Object[] { eReference, _this, linkVariable };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_1_CreateConstraint_blackBBBF(BlackAndNacPatternTransformer _this, Pattern pattern,
         EReference eReference)
   {
      for (PatternBody patternBody : pattern.getBodies())
      {
         return new Object[] { _this, pattern, eReference, patternBody };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_1_CreateConstraint_bindingAndBlackBBFFB(BlackAndNacPatternTransformer _this, Pattern pattern,
         LinkVariable linkVariable)
   {
      Object[] result_pattern_NacPatternTransformer_0_1_CreateConstraint_binding = pattern_NacPatternTransformer_0_1_CreateConstraint_bindingFBB(_this,
            linkVariable);
      if (result_pattern_NacPatternTransformer_0_1_CreateConstraint_binding != null)
      {
         EReference eReference = (EReference) result_pattern_NacPatternTransformer_0_1_CreateConstraint_binding[0];

         Object[] result_pattern_NacPatternTransformer_0_1_CreateConstraint_black = pattern_NacPatternTransformer_0_1_CreateConstraint_blackBBBF(_this, pattern,
               eReference);
         if (result_pattern_NacPatternTransformer_0_1_CreateConstraint_black != null)
         {
            PatternBody patternBody = (PatternBody) result_pattern_NacPatternTransformer_0_1_CreateConstraint_black[3];

            return new Object[] { _this, pattern, eReference, patternBody, linkVariable };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_1_CreateConstraint_greenBFB(EReference eReference, PatternBody patternBody)
   {
      Reference constraint = EMFTypeFactory.eINSTANCE.createReference();
      constraint.setEModelElement(eReference);
      patternBody.getConstraints().add(constraint);
      return new Object[] { eReference, constraint, patternBody };
   }

   public static final Object[] pattern_NacPatternTransformer_0_2_LookupSource_blackBF(LinkVariable linkVariable)
   {
      ObjectVariable source = linkVariable.getSource();
      if (source != null)
      {
         return new Object[] { linkVariable, source };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_3_IsSourceNegative_blackB(ObjectVariable source)
   {
      BindingSemantics source_bindingSemantics = source.getBindingSemantics();
      if (source_bindingSemantics.equals(BindingSemantics.NEGATIVE))
      {
         return new Object[] { source };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_4_LookUpSourceInBody_blackBFBB(Reference constraint, PatternBody patternBody,
         ObjectVariable source)
   {
      String source_name = source.getName();
      for (Variable negativeSource : patternBody.getLocalVariables())
      {
         String negativeSource_name = negativeSource.getName();
         if (negativeSource_name.equals(source_name))
         {
            return new Object[] { constraint, negativeSource, patternBody, source };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_4_LookUpSourceInBody_greenBBFB(Reference constraint, Variable negativeSource,
         ObjectVariable source)
   {
      ConstraintParameter negativeSourceParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraint.getParameters().add(negativeSourceParameter);
      negativeSourceParameter.setReference(negativeSource);
      return new Object[] { constraint, negativeSource, negativeSourceParameter, source };
   }

   public static final Object[] pattern_NacPatternTransformer_0_5_LookUpSourceInPattern_blackBBFB(Reference constraint, Pattern pattern, ObjectVariable source)
   {
      String source_name = source.getName();
      for (Variable mandatorySource : pattern.getSymbolicParameters())
      {
         String mandatorySource_name = mandatorySource.getName();
         if (mandatorySource_name.equals(source_name))
         {
            return new Object[] { constraint, pattern, mandatorySource, source };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_5_LookUpSourceInPattern_greenBFBB(Reference constraint, Variable mandatorySource,
         ObjectVariable source)
   {
      ConstraintParameter mandatorySourceParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraint.getParameters().add(mandatorySourceParameter);
      mandatorySourceParameter.setReference(mandatorySource);
      return new Object[] { constraint, mandatorySourceParameter, mandatorySource, source };
   }

   public static final Object[] pattern_NacPatternTransformer_0_6_LookupTarget_blackBF(LinkVariable linkVariable)
   {
      ObjectVariable target = linkVariable.getTarget();
      if (target != null)
      {
         return new Object[] { linkVariable, target };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_7_IsTargetNegative_blackB(ObjectVariable target)
   {
      BindingSemantics target_bindingSemantics = target.getBindingSemantics();
      if (target_bindingSemantics.equals(BindingSemantics.NEGATIVE))
      {
         return new Object[] { target };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_8_LookUpTargetInBody_blackFBBB(Reference constraint, PatternBody patternBody,
         ObjectVariable target)
   {
      String target_name = target.getName();
      for (Variable negativeTarget : patternBody.getLocalVariables())
      {
         String negativeTarget_name = negativeTarget.getName();
         if (negativeTarget_name.equals(target_name))
         {
            return new Object[] { negativeTarget, constraint, patternBody, target };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_8_LookUpTargetInBody_greenBFBB(Variable negativeTarget, Reference constraint,
         ObjectVariable target)
   {
      ConstraintParameter negativeTargetParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      negativeTargetParameter.setReference(negativeTarget);
      constraint.getParameters().add(negativeTargetParameter);
      return new Object[] { negativeTarget, negativeTargetParameter, constraint, target };
   }

   public static final Object[] pattern_NacPatternTransformer_0_10_LookUpTargetInPattern_blackFBBB(Reference constraint, Pattern pattern, ObjectVariable target)
   {
      String target_name = target.getName();
      for (Variable mandatoryTarget : pattern.getSymbolicParameters())
      {
         String mandatoryTarget_name = mandatoryTarget.getName();
         if (mandatoryTarget_name.equals(target_name))
         {
            return new Object[] { mandatoryTarget, constraint, pattern, target };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_0_10_LookUpTargetInPattern_greenBFBB(Variable mandatoryTarget, Reference constraint,
         ObjectVariable target)
   {
      ConstraintParameter mandatoryTargetParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      mandatoryTargetParameter.setReference(mandatoryTarget);
      constraint.getParameters().add(mandatoryTargetParameter);
      return new Object[] { mandatoryTarget, mandatoryTargetParameter, constraint, target };
   }

   public static final Object[] pattern_NacPatternTransformer_1_1_LookupPatternBody_blackBF(Pattern pattern)
   {
      for (PatternBody body : pattern.getBodies())
      {
         return new Object[] { pattern, body };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_1_2_IsSourceNegative_blackBF(LinkVariable linkVariable)
   {
      ObjectVariable source = linkVariable.getSource();
      if (source != null)
      {
         BindingSemantics source_bindingSemantics = source.getBindingSemantics();
         if (source_bindingSemantics.equals(BindingSemantics.NEGATIVE))
         {
            return new Object[] { linkVariable, source };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_1_3_ExistsSourceLocalVariable_blackBFB(PatternBody body, ObjectVariable source)
   {
      String source_name = source.getName();
      for (Variable sourceLocal : body.getLocalVariables())
      {
         String sourceLocal_name = sourceLocal.getName();
         if (sourceLocal_name.equals(source_name))
         {
            return new Object[] { body, sourceLocal, source };
         }

      }

      return null;
   }

   public static final boolean pattern_NacPatternTransformer_1_4_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_NacPatternTransformer_1_5_IsTargetNegative_blackBF(LinkVariable linkVariable)
   {
      ObjectVariable target = linkVariable.getTarget();
      if (target != null)
      {
         BindingSemantics target_bindingSemantics = target.getBindingSemantics();
         if (target_bindingSemantics.equals(BindingSemantics.NEGATIVE))
         {
            return new Object[] { linkVariable, target };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_1_6_ExistsTargetLocalVariable_blackBFB(PatternBody body, ObjectVariable target)
   {
      String target_name = target.getName();
      for (Variable targetLocal : body.getLocalVariables())
      {
         String targetLocal_name = targetLocal.getName();
         if (targetLocal_name.equals(target_name))
         {
            return new Object[] { body, targetLocal, target };
         }

      }

      return null;
   }

   public static final boolean pattern_NacPatternTransformer_1_7_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_NacPatternTransformer_1_8_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_NacPatternTransformer_2_1_IsNegativeVariable_blackB(ObjectVariable objectVariable)
   {
      BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
      if (objectVariable_bindingSemantics.equals(BindingSemantics.NEGATIVE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final boolean pattern_NacPatternTransformer_2_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_NacPatternTransformer_2_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_NacPatternTransformer_3_1_Init_blackB(NacPatternTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final Iterable<Object[]> pattern_NacPatternTransformer_3_2_ForEachObjectVariable_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { objectVariable, storyPattern });
      }
      return _result;
   }

   public static final boolean pattern_NacPatternTransformer_3_3_IsRelevantObjectVariable_expressionFBB(NacPatternTransformer _this,
         ObjectVariable objectVariable)
   {
      boolean _localVariable_0 = _this.isVariableToAdd(objectVariable);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final void pattern_NacPatternTransformer_3_4_TransformNacConstraints_expressionBBB(NacPatternTransformer _this, ObjectVariable objectVariable,
         Pattern pattern)
   {
      _this.transformNacConstraints(objectVariable, pattern);

   }

   public static final void pattern_NacPatternTransformer_3_5_AnalyzeInjectivity_expressionBB(NacPatternTransformer _this, Pattern pattern)
   {
      _this.analyzeInjectivity(pattern);

   }

   public static final Object[] pattern_NacPatternTransformer_4_1_BelongsToNacPattern_blackBFFB(Pattern nacPattern, ObjectVariable nacObjectVariable)
   {
      String nacObjectVariable_name = nacObjectVariable.getName();
      for (PatternBody patternBody : nacPattern.getBodies())
      {
         for (Variable localVariable : patternBody.getLocalVariables())
         {
            String localVariable_name = localVariable.getName();
            if (localVariable_name.equals(nacObjectVariable_name))
            {
               return new Object[] { nacPattern, patternBody, localVariable, nacObjectVariable };
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_4_2_Init_blackFFB(BlackAndNacPatternTransformer _this)
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

   public static final Iterable<Object[]> pattern_NacPatternTransformer_4_3_ForEachConstraint_blackFFFFFFB(ObjectVariable nacObjectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Constraint sdmConstraint : nacObjectVariable.getConstraint())
      {
         Expression tmpBinaryExpression = sdmConstraint.getConstraintExpression();
         if (tmpBinaryExpression instanceof ComparisonExpression)
         {
            ComparisonExpression binaryExpression = (ComparisonExpression) tmpBinaryExpression;
            Expression tmpAttributeValueExpression = binaryExpression.getLeftExpression();
            if (tmpAttributeValueExpression instanceof AttributeValueExpression)
            {
               AttributeValueExpression attributeValueExpression = (AttributeValueExpression) tmpAttributeValueExpression;
               Expression expression = binaryExpression.getRightExpression();
               if (expression != null)
               {
                  if (!attributeValueExpression.equals(expression))
                  {
                     if (!binaryExpression.equals(expression))
                     {
                        EAttribute eAttribute = attributeValueExpression.getAttribute();
                        if (eAttribute != null)
                        {
                           EClassifier tmpEDataType = eAttribute.getEType();
                           if (tmpEDataType instanceof EDataType)
                           {
                              EDataType eDataType = (EDataType) tmpEDataType;
                              _result.add(new Object[] { expression, eAttribute, sdmConstraint, attributeValueExpression, eDataType, binaryExpression,
                                    nacObjectVariable });
                           }

                        }

                     }
                  }
               }

            }

         }

      }
      return _result;
   }

   public static final Object[] pattern_NacPatternTransformer_4_4_CreateConstraint_bindingFBB(BlackAndNacPatternTransformer _this,
         ComparisonExpression binaryExpression)
   {
      RelationalConstraint _localVariable_0 = _this.createRelationalConstraint(binaryExpression);
      RelationalConstraint constraint = _localVariable_0;
      if (constraint != null)
      {
         return new Object[] { constraint, _this, binaryExpression };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_4_4_CreateConstraint_blackB(RelationalConstraint constraint)
   {
      return new Object[] { constraint };
   }

   public static final Object[] pattern_NacPatternTransformer_4_4_CreateConstraint_bindingAndBlackFBB(BlackAndNacPatternTransformer _this,
         ComparisonExpression binaryExpression)
   {
      Object[] result_pattern_NacPatternTransformer_4_4_CreateConstraint_binding = pattern_NacPatternTransformer_4_4_CreateConstraint_bindingFBB(_this,
            binaryExpression);
      if (result_pattern_NacPatternTransformer_4_4_CreateConstraint_binding != null)
      {
         RelationalConstraint constraint = (RelationalConstraint) result_pattern_NacPatternTransformer_4_4_CreateConstraint_binding[0];

         Object[] result_pattern_NacPatternTransformer_4_4_CreateConstraint_black = pattern_NacPatternTransformer_4_4_CreateConstraint_blackB(constraint);
         if (result_pattern_NacPatternTransformer_4_4_CreateConstraint_black != null)
         {

            return new Object[] { constraint, _this, binaryExpression };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_bindingFBBBB(BlackAndNacPatternTransformer _this,
         ObjectVariable nacObjectVariable, EAttribute eAttribute, Pattern nacPattern)
   {
      Variable _localVariable_1 = _this.getAttributeVariable(nacObjectVariable, eAttribute, nacPattern);
      Variable attribute = _localVariable_1;
      if (attribute != null)
      {
         return new Object[] { attribute, _this, nacObjectVariable, eAttribute, nacPattern };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_blackBBB(Variable attribute,
         PatternBody patternBody, RelationalConstraint constraint)
   {
      return new Object[] { attribute, patternBody, constraint };
   }

   public static final Object[] pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_bindingAndBlackFBBBBBB(PatternBody patternBody,
         RelationalConstraint constraint, BlackAndNacPatternTransformer _this, ObjectVariable nacObjectVariable, EAttribute eAttribute, Pattern nacPattern)
   {
      Object[] result_pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_binding = pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_bindingFBBBB(
            _this, nacObjectVariable, eAttribute, nacPattern);
      if (result_pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_binding != null)
      {
         Variable attribute = (Variable) result_pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_binding[0];

         Object[] result_pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_black = pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_blackBBB(
               attribute, patternBody, constraint);
         if (result_pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_black != null)
         {

            return new Object[] { attribute, patternBody, constraint, _this, nacObjectVariable, eAttribute, nacPattern };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_4_5_CreateConstraintAndHandleLeftSideAttribute_greenBBFB(Variable attribute,
         PatternBody patternBody, RelationalConstraint constraint)
   {
      ConstraintParameter leftParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      patternBody.getConstraints().add(constraint);
      leftParameter.setReference(attribute);
      constraint.getParameters().add(leftParameter);
      return new Object[] { attribute, patternBody, leftParameter, constraint };
   }

   public static final Object[] pattern_NacPatternTransformer_4_6_HandleRightSideExpression_bindingFBBBBBB(ExpressionTransformer expressionTransformer,
         ValidationReport report, BlackAndNacPatternTransformer _this, Expression expression, Pattern nacPattern, EDataType eDataType)
   {
      ConstraintVariable _localVariable_0 = expressionTransformer.transformExpression(report, _this, expression, nacPattern, eDataType);
      ConstraintVariable rightSideExpression = _localVariable_0;
      if (rightSideExpression != null)
      {
         return new Object[] { rightSideExpression, expressionTransformer, report, _this, expression, nacPattern, eDataType };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_4_6_HandleRightSideExpression_blackBB(RelationalConstraint constraint,
         ConstraintVariable rightSideExpression)
   {
      return new Object[] { constraint, rightSideExpression };
   }

   public static final Object[] pattern_NacPatternTransformer_4_6_HandleRightSideExpression_bindingAndBlackBFBBBBBB(RelationalConstraint constraint,
         ExpressionTransformer expressionTransformer, ValidationReport report, BlackAndNacPatternTransformer _this, Expression expression, Pattern nacPattern,
         EDataType eDataType)
   {
      Object[] result_pattern_NacPatternTransformer_4_6_HandleRightSideExpression_binding = pattern_NacPatternTransformer_4_6_HandleRightSideExpression_bindingFBBBBBB(
            expressionTransformer, report, _this, expression, nacPattern, eDataType);
      if (result_pattern_NacPatternTransformer_4_6_HandleRightSideExpression_binding != null)
      {
         ConstraintVariable rightSideExpression = (ConstraintVariable) result_pattern_NacPatternTransformer_4_6_HandleRightSideExpression_binding[0];

         Object[] result_pattern_NacPatternTransformer_4_6_HandleRightSideExpression_black = pattern_NacPatternTransformer_4_6_HandleRightSideExpression_blackBB(
               constraint, rightSideExpression);
         if (result_pattern_NacPatternTransformer_4_6_HandleRightSideExpression_black != null)
         {

            return new Object[] { constraint, rightSideExpression, expressionTransformer, report, _this, expression, nacPattern, eDataType };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternTransformer_4_6_HandleRightSideExpression_greenBFB(RelationalConstraint constraint,
         ConstraintVariable rightSideExpression)
   {
      ConstraintParameter rightParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraint.getParameters().add(rightParameter);
      rightParameter.setReference(rightSideExpression);
      return new Object[] { constraint, rightParameter, rightSideExpression };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //NacPatternTransformerImpl
