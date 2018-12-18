/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.expressions.ComparingOperator;
import SDMLanguage.expressions.ComparisonExpression;
import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.BindingOperator;
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

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.Larger;
import org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;
import org.gervarro.democles.specification.emf.constraint.relational.Smaller;
import org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.Unequal;

import org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.eclipse.emf.ecore.EcorePackage;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Black And Nac Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BlackAndNacPatternTransformerImpl extends PatternTransformerImpl implements BlackAndNacPatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BlackAndNacPatternTransformerImpl()
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
      return PatternPackage.Literals.BLACK_AND_NAC_PATTERN_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeInjectivity(Pattern pattern)
   {

      Object[] result1_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_1_LookupPatternBody_blackBFB(pattern, this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[this] = " + this + ".");
      }
      PatternBody body = (PatternBody) result1_black[1];
      // ForEach 
      for (Object[] result2_black : BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_2_ForAllSymbolicParameterPairs_blackBFF(pattern))
      {
         Variable firstSymbolic = (Variable) result2_black[1];
         Variable secondSymbolic = (Variable) result2_black[2];
         // 
         if (BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_3_IsInjectiveMappingRequired1_expressionFBBB(this, firstSymbolic,
               secondSymbolic))
         {
            // 
            BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_4_CreateInjectivityConstraint1_expressionBBBB(this, pattern,
                  firstSymbolic, secondSymbolic);

         } else
         {
         }

      }
      // ForEach 
      for (Object[] result5_black : BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_5_ForAllMixedPairs_blackBFFB(pattern, body))
      {
         Variable symbolic = (Variable) result5_black[1];
         Variable local = (Variable) result5_black[2];
         // 
         if (BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_6_IsInjectiveMappingRequired2_expressionFBBB(this, symbolic, local))
         {
            // 
            BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_7_CreateInjectivityConstraint2_expressionBBBB(this, pattern, symbolic,
                  local);

         } else
         {
         }

      }
      // ForEach 
      for (Object[] result8_black : BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_8_ForAllLocalVariablePairs_blackBFF(body))
      {
         Variable secondLocal = (Variable) result8_black[1];
         Variable firstLocal = (Variable) result8_black[2];
         // 
         if (BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_9_InjectiveMappingRequired3_expressionFBBB(this, firstLocal,
               secondLocal))
         {
            // 
            BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_0_10_CreateInjectivityConstraint3_expressionBBBB(this, pattern, firstLocal,
                  secondLocal);

         } else
         {
         }

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean areCompatibleTypes(EClassifier first, EClassifier second)
   {
      // [user code injected with eMoflon]

      EClass eClass = EcorePackage.eINSTANCE.getEClass();
      if (eClass.isInstance(first) && eClass.isInstance(second))
      {
         EClass firstClass = (EClass) first;
         EClass secondClass = (EClass) second;
         return first == second || firstClass.isSuperTypeOf(secondClass) || secondClass.isSuperTypeOf(firstClass);
      } else
      {
         return false;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createInjectivityConstraint(Pattern pattern, Variable first, Variable second)
   {

      Object[] result1_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_2_1_CreateConstraint_blackBF(pattern);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ".");
      }
      PatternBody body = (PatternBody) result1_black[1];
      Object[] result1_green = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_2_1_CreateConstraint_greenFB(body);
      Unequal unequalityConstraint = (Unequal) result1_green[0];

      Object[] result2_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_2_2_CreateFirstParameter_blackBB(unequalityConstraint,
            first);
      if (result2_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[unequalityConstraint] = " + unequalityConstraint + ", " + "[first] = " + first + ".");
      }
      BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_2_2_CreateFirstParameter_greenBFB(unequalityConstraint, first);
      //nothing ConstraintParameter firstParameter = (ConstraintParameter) result2_green[1];

      Object[] result3_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_2_3_CreateSecondParameter_blackBB(unequalityConstraint,
            second);
      if (result3_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[unequalityConstraint] = " + unequalityConstraint + ", " + "[second] = " + second + ".");
      }
      BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_2_3_CreateSecondParameter_greenBFB(unequalityConstraint, second);
      //nothing ConstraintParameter secondParameter = (ConstraintParameter) result3_green[1];

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RelationalConstraint createRelationalConstraint(ComparisonExpression comparison)
   {// 
      Object[] result1_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_1_IsEquality_blackB(comparison);
      if (result1_black != null)
      {
         Object[] result1_green = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_1_IsEquality_greenF();
         Equal equalsConstraint = (Equal) result1_green[0];

         return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_2_expressionFB(equalsConstraint);
      } else
      {
         // 
         Object[] result3_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_3_IsInequality_blackB(comparison);
         if (result3_black != null)
         {
            Object[] result3_green = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_3_IsInequality_greenF();
            Unequal unequalsConstraint = (Unequal) result3_green[0];

            return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_4_expressionFB(unequalsConstraint);
         } else
         {
            // 
            Object[] result5_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_5_IsSmaller_blackB(comparison);
            if (result5_black != null)
            {
               Object[] result5_green = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_5_IsSmaller_greenF();
               Smaller smallerConstraint = (Smaller) result5_green[0];

               return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_6_expressionFB(smallerConstraint);
            } else
            {
               // 
               Object[] result7_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_7_IsSmallerOrEqual_blackB(comparison);
               if (result7_black != null)
               {
                  Object[] result7_green = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_7_IsSmallerOrEqual_greenF();
                  SmallerOrEqual smallerOrEqualConstraint = (SmallerOrEqual) result7_green[0];

                  return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_8_expressionFB(smallerOrEqualConstraint);
               } else
               {
                  // 
                  Object[] result9_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_9_IsLarger_blackB(comparison);
                  if (result9_black != null)
                  {
                     Object[] result9_green = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_9_IsLarger_greenF();
                     Larger largerConstraint = (Larger) result9_green[0];

                     return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_10_expressionFB(largerConstraint);
                  } else
                  {
                     // 
                     Object[] result11_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_11_IsLargerOrEqual_blackB(comparison);
                     if (result11_black != null)
                     {
                        Object[] result11_green = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_11_IsLargerOrEqual_greenF();
                        LargerOrEqual largerOrEqualConstraint = (LargerOrEqual) result11_green[0];

                        return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_12_expressionFB(largerOrEqualConstraint);
                     } else
                     {
                        return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_3_13_expressionF();
                     }

                  }

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
   public boolean injectiveMappingRequired(Variable first, Variable second)
   {
      // [user code injected with eMoflon]

      EClass emfVariableClass = EMFTypePackage.eINSTANCE.getEMFVariable();
      if (emfVariableClass.isInstance(first) && emfVariableClass.isInstance(second))
      {
         return areCompatibleTypes(((EMFVariable) first).getEClassifier(), ((EMFVariable) second).getEClassifier());
      }
      return false;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLinkToAdd(LinkVariable linkVariable, Pattern pattern)
   {// 
      Object[] result1_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_1_IsLinkNegative_blackB(linkVariable);
      if (result1_black != null)
      {
         return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_2_expressionF();
      } else
      {
         // 
         Object[] result3_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_3_IsSourceMandatory_blackFB(linkVariable);
         if (result3_black != null)
         {
            //nothing ObjectVariable source = (ObjectVariable) result3_black[0];
            // 
            Object[] result4_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_4_IsTargetMandatory_blackBF(linkVariable);
            if (result4_black != null)
            {
               //nothing ObjectVariable target = (ObjectVariable) result4_black[1];
               // 
               Object[] result5_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_5_IsLinkBlack_blackB(linkVariable);
               if (result5_black != null)
               {
                  return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_6_expressionF();
               } else
               {
                  // 
                  Object[] result7_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_7_IsLinkRed_blackB(linkVariable);
                  if (result7_black != null)
                  {
                     return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_8_expressionF();
                  } else
                  {
                     return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_9_expressionF();
                  }

               }

            } else
            {
               return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_10_expressionF();
            }

         } else
         {
            return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_5_11_expressionF();
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {// 
      Object[] result1_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_6_1_IsVariableBlackAndMandatory_blackB(objectVariable);
      if (result1_black != null)
      {
         return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_6_2_expressionF();
      } else
      {
         // 
         Object[] result3_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_6_3_IsVariableRed_blackB(objectVariable);
         if (result3_black != null)
         {
            return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_6_4_expressionF();
         } else
         {
            return BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_6_5_expressionF();
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

      Object[] result1_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_7_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // ForEach 
      for (Object[] result2_black : BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_7_2_ForAllObjectVariables_blackBF(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[1];
         // ForEach 
         for (Object[] result3_black : BlackAndNacPatternTransformerImpl
               .pattern_BlackAndNacPatternTransformer_7_3_ForAllAttributeConstraints_blackBF(objectVariable))
         {
            Constraint constraint = (Constraint) result3_black[1];
            // 
            BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_7_4_TransformAttributeConstraint_expressionBBB(this, constraint, pattern);

         }

      }
      // 
      BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_7_5_InjectivityAnalysisForPositivePattern_expressionBB(this, pattern);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transformAttributeConstraint(Constraint constraint, Pattern pattern)
   {

      Object[] result1_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_8_1_LookupExpressionTransformer_blackFFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ExpressionTransformer expressionTransformer = (ExpressionTransformer) result1_black[0];
      ValidationReport report = (ValidationReport) result1_black[1];
      // 
      Object[] result2_black = BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_8_2_LookupConstraintContext_blackFFFFFBF(constraint);
      if (result2_black != null)
      {
         EDataType eDataType = (EDataType) result2_black[0];
         ComparisonExpression binaryExpression = (ComparisonExpression) result2_black[1];
         ObjectVariable objectVariable = (ObjectVariable) result2_black[2];
         EAttribute eAttribute = (EAttribute) result2_black[3];
         Expression expression = (Expression) result2_black[4];
         //nothing AttributeValueExpression attributeValueExpression = (AttributeValueExpression) result2_black[6];

         Object[] result3_bindingAndBlack = BlackAndNacPatternTransformerImpl
               .pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_bindingAndBlackFBB(this, binaryExpression);
         if (result3_bindingAndBlack == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[binaryExpression] = " + binaryExpression + ".");
         }
         RelationalConstraint newConstraint = (RelationalConstraint) result3_bindingAndBlack[0];

         Object[] result4_bindingAndBlack = BlackAndNacPatternTransformerImpl
               .pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_bindingAndBlackFBBFBBB(pattern, newConstraint, this, objectVariable, eAttribute);
         if (result4_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[newConstraint] = " + newConstraint
                  + ", " + "[this] = " + this + ", " + "[objectVariable] = " + objectVariable + ", " + "[eAttribute] = " + eAttribute + ".");
         }
         PatternBody patternBody = (PatternBody) result4_bindingAndBlack[0];
         Variable attribute = (Variable) result4_bindingAndBlack[3];
         BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_greenBBBF(patternBody, newConstraint, attribute);
         //nothing ConstraintParameter firstParameter = (ConstraintParameter) result4_green[3];

         // 
         Object[] result5_bindingAndBlack = BlackAndNacPatternTransformerImpl
               .pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_bindingAndBlackFBBBBBBB(newConstraint, expressionTransformer, report, this,
                     expression, pattern, eDataType);
         if (result5_bindingAndBlack != null)
         {
            ConstraintVariable rightSideExpression = (ConstraintVariable) result5_bindingAndBlack[0];
            BlackAndNacPatternTransformerImpl.pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_greenBFB(rightSideExpression, newConstraint);
            //nothing ConstraintParameter secondParameter = (ConstraintParameter) result5_green[1];

         } else
         {
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
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___ANALYZE_INJECTIVITY__PATTERN:
         analyzeInjectivity((Pattern) arguments.get(0));
         return null;
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___ARE_COMPATIBLE_TYPES__ECLASSIFIER_ECLASSIFIER:
         return areCompatibleTypes((EClassifier) arguments.get(0), (EClassifier) arguments.get(1));
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_INJECTIVITY_CONSTRAINT__PATTERN_VARIABLE_VARIABLE:
         createInjectivityConstraint((Pattern) arguments.get(0), (Variable) arguments.get(1), (Variable) arguments.get(2));
         return null;
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_RELATIONAL_CONSTRAINT__COMPARISONEXPRESSION:
         return createRelationalConstraint((ComparisonExpression) arguments.get(0));
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___INJECTIVE_MAPPING_REQUIRED__VARIABLE_VARIABLE:
         return injectiveMappingRequired((Variable) arguments.get(0), (Variable) arguments.get(1));
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN:
         return isLinkToAdd((LinkVariable) arguments.get(0), (Pattern) arguments.get(1));
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN:
         postprocess((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER___TRANSFORM_ATTRIBUTE_CONSTRAINT__CONSTRAINT_PATTERN:
         transformAttributeConstraint((Constraint) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_0_1_LookupPatternBody_blackBFB(Pattern pattern, BlackAndNacPatternTransformer _this)
   {
      for (PatternBody body : pattern.getBodies())
      {
         return new Object[] { pattern, body, _this };
      }
      return null;
   }

   public static final Iterable<Object[]> pattern_BlackAndNacPatternTransformer_0_2_ForAllSymbolicParameterPairs_blackBFF(Pattern pattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Variable firstSymbolic : pattern.getSymbolicParameters())
      {
         String firstSymbolic_name = firstSymbolic.getName();
         for (Variable secondSymbolic : pattern.getSymbolicParameters())
         {
            if (!firstSymbolic.equals(secondSymbolic))
            {
               String secondSymbolic_name = secondSymbolic.getName();
               if (firstSymbolic_name.compareTo(secondSymbolic_name) < 0)
               {
                  _result.add(new Object[] { pattern, firstSymbolic, secondSymbolic });
               }

            }
         }

      }
      return _result;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_0_3_IsInjectiveMappingRequired1_expressionFBBB(BlackAndNacPatternTransformer _this,
         Variable firstSymbolic, Variable secondSymbolic)
   {
      boolean _localVariable_0 = _this.injectiveMappingRequired(firstSymbolic, secondSymbolic);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final void pattern_BlackAndNacPatternTransformer_0_4_CreateInjectivityConstraint1_expressionBBBB(BlackAndNacPatternTransformer _this,
         Pattern pattern, Variable firstSymbolic, Variable secondSymbolic)
   {
      _this.createInjectivityConstraint(pattern, firstSymbolic, secondSymbolic);

   }

   public static final Iterable<Object[]> pattern_BlackAndNacPatternTransformer_0_5_ForAllMixedPairs_blackBFFB(Pattern pattern, PatternBody body)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Variable symbolic : pattern.getSymbolicParameters())
      {
         for (Variable local : body.getLocalVariables())
         {
            if (!local.equals(symbolic))
            {
               _result.add(new Object[] { pattern, symbolic, local, body });
            }
         }
      }
      return _result;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_0_6_IsInjectiveMappingRequired2_expressionFBBB(BlackAndNacPatternTransformer _this,
         Variable symbolic, Variable local)
   {
      boolean _localVariable_0 = _this.injectiveMappingRequired(symbolic, local);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final void pattern_BlackAndNacPatternTransformer_0_7_CreateInjectivityConstraint2_expressionBBBB(BlackAndNacPatternTransformer _this,
         Pattern pattern, Variable symbolic, Variable local)
   {
      _this.createInjectivityConstraint(pattern, symbolic, local);

   }

   public static final Iterable<Object[]> pattern_BlackAndNacPatternTransformer_0_8_ForAllLocalVariablePairs_blackBFF(PatternBody body)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Variable secondLocal : body.getLocalVariables())
      {
         String secondLocal_name = secondLocal.getName();
         for (Variable firstLocal : body.getLocalVariables())
         {
            if (!firstLocal.equals(secondLocal))
            {
               String firstLocal_name = firstLocal.getName();
               if (firstLocal_name.compareTo(secondLocal_name) < 0)
               {
                  _result.add(new Object[] { body, secondLocal, firstLocal });
               }

            }
         }

      }
      return _result;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_0_9_InjectiveMappingRequired3_expressionFBBB(BlackAndNacPatternTransformer _this,
         Variable firstLocal, Variable secondLocal)
   {
      boolean _localVariable_0 = _this.injectiveMappingRequired(firstLocal, secondLocal);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final void pattern_BlackAndNacPatternTransformer_0_10_CreateInjectivityConstraint3_expressionBBBB(BlackAndNacPatternTransformer _this,
         Pattern pattern, Variable firstLocal, Variable secondLocal)
   {
      _this.createInjectivityConstraint(pattern, firstLocal, secondLocal);

   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_2_1_CreateConstraint_blackBF(Pattern pattern)
   {
      for (PatternBody body : pattern.getBodies())
      {
         return new Object[] { pattern, body };
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_2_1_CreateConstraint_greenFB(PatternBody body)
   {
      Unequal unequalityConstraint = RelationalConstraintFactory.eINSTANCE.createUnequal();
      body.getConstraints().add(unequalityConstraint);
      return new Object[] { unequalityConstraint, body };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_2_2_CreateFirstParameter_blackBB(Unequal unequalityConstraint, Variable first)
   {
      return new Object[] { unequalityConstraint, first };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_2_2_CreateFirstParameter_greenBFB(Unequal unequalityConstraint, Variable first)
   {
      ConstraintParameter firstParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      unequalityConstraint.getParameters().add(firstParameter);
      firstParameter.setReference(first);
      return new Object[] { unequalityConstraint, firstParameter, first };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_2_3_CreateSecondParameter_blackBB(Unequal unequalityConstraint, Variable second)
   {
      return new Object[] { unequalityConstraint, second };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_2_3_CreateSecondParameter_greenBFB(Unequal unequalityConstraint, Variable second)
   {
      ConstraintParameter secondParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      unequalityConstraint.getParameters().add(secondParameter);
      secondParameter.setReference(second);
      return new Object[] { unequalityConstraint, secondParameter, second };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_1_IsEquality_blackB(ComparisonExpression comparison)
   {
      ComparingOperator comparison_operator = comparison.getOperator();
      if (comparison_operator.equals(ComparingOperator.EQUAL))
      {
         return new Object[] { comparison };
      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_1_IsEquality_greenF()
   {
      Equal equalsConstraint = RelationalConstraintFactory.eINSTANCE.createEqual();
      return new Object[] { equalsConstraint };
   }

   public static final RelationalConstraint pattern_BlackAndNacPatternTransformer_3_2_expressionFB(Equal equalsConstraint)
   {
      RelationalConstraint _result = equalsConstraint;
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_3_IsInequality_blackB(ComparisonExpression comparison)
   {
      ComparingOperator comparison_operator = comparison.getOperator();
      if (comparison_operator.equals(ComparingOperator.UNEQUAL))
      {
         return new Object[] { comparison };
      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_3_IsInequality_greenF()
   {
      Unequal unequalsConstraint = RelationalConstraintFactory.eINSTANCE.createUnequal();
      return new Object[] { unequalsConstraint };
   }

   public static final RelationalConstraint pattern_BlackAndNacPatternTransformer_3_4_expressionFB(Unequal unequalsConstraint)
   {
      RelationalConstraint _result = unequalsConstraint;
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_5_IsSmaller_blackB(ComparisonExpression comparison)
   {
      ComparingOperator comparison_operator = comparison.getOperator();
      if (comparison_operator.equals(ComparingOperator.LESS))
      {
         return new Object[] { comparison };
      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_5_IsSmaller_greenF()
   {
      Smaller smallerConstraint = RelationalConstraintFactory.eINSTANCE.createSmaller();
      return new Object[] { smallerConstraint };
   }

   public static final RelationalConstraint pattern_BlackAndNacPatternTransformer_3_6_expressionFB(Smaller smallerConstraint)
   {
      RelationalConstraint _result = smallerConstraint;
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_7_IsSmallerOrEqual_blackB(ComparisonExpression comparison)
   {
      ComparingOperator comparison_operator = comparison.getOperator();
      if (comparison_operator.equals(ComparingOperator.LESS_OR_EQUAL))
      {
         return new Object[] { comparison };
      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_7_IsSmallerOrEqual_greenF()
   {
      SmallerOrEqual smallerOrEqualConstraint = RelationalConstraintFactory.eINSTANCE.createSmallerOrEqual();
      return new Object[] { smallerOrEqualConstraint };
   }

   public static final RelationalConstraint pattern_BlackAndNacPatternTransformer_3_8_expressionFB(SmallerOrEqual smallerOrEqualConstraint)
   {
      RelationalConstraint _result = smallerOrEqualConstraint;
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_9_IsLarger_blackB(ComparisonExpression comparison)
   {
      ComparingOperator comparison_operator = comparison.getOperator();
      if (comparison_operator.equals(ComparingOperator.GREATER))
      {
         return new Object[] { comparison };
      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_9_IsLarger_greenF()
   {
      Larger largerConstraint = RelationalConstraintFactory.eINSTANCE.createLarger();
      return new Object[] { largerConstraint };
   }

   public static final RelationalConstraint pattern_BlackAndNacPatternTransformer_3_10_expressionFB(Larger largerConstraint)
   {
      RelationalConstraint _result = largerConstraint;
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_11_IsLargerOrEqual_blackB(ComparisonExpression comparison)
   {
      ComparingOperator comparison_operator = comparison.getOperator();
      if (comparison_operator.equals(ComparingOperator.GREATER_OR_EQUAL))
      {
         return new Object[] { comparison };
      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_3_11_IsLargerOrEqual_greenF()
   {
      LargerOrEqual largerOrEqualConstraint = RelationalConstraintFactory.eINSTANCE.createLargerOrEqual();
      return new Object[] { largerOrEqualConstraint };
   }

   public static final RelationalConstraint pattern_BlackAndNacPatternTransformer_3_12_expressionFB(LargerOrEqual largerOrEqualConstraint)
   {
      RelationalConstraint _result = largerOrEqualConstraint;
      return _result;
   }

   public static final RelationalConstraint pattern_BlackAndNacPatternTransformer_3_13_expressionF()
   {
      RelationalConstraint _result = null;
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_5_1_IsLinkNegative_blackB(LinkVariable linkVariable)
   {
      BindingSemantics linkVariable_bindingSemantics = linkVariable.getBindingSemantics();
      if (linkVariable_bindingSemantics.equals(BindingSemantics.NEGATIVE))
      {
         return new Object[] { linkVariable };
      }

      return null;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_5_2_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_5_3_IsSourceMandatory_blackFB(LinkVariable linkVariable)
   {
      ObjectVariable source = linkVariable.getSource();
      if (source != null)
      {
         BindingSemantics source_bindingSemantics = source.getBindingSemantics();
         if (source_bindingSemantics.equals(BindingSemantics.MANDATORY))
         {
            return new Object[] { source, linkVariable };
         }

      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_5_4_IsTargetMandatory_blackBF(LinkVariable linkVariable)
   {
      ObjectVariable target = linkVariable.getTarget();
      if (target != null)
      {
         BindingSemantics target_bindingSemantics = target.getBindingSemantics();
         if (target_bindingSemantics.equals(BindingSemantics.MANDATORY))
         {
            return new Object[] { linkVariable, target };
         }

      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_5_5_IsLinkBlack_blackB(LinkVariable linkVariable)
   {
      BindingOperator linkVariable_bindingOperator = linkVariable.getBindingOperator();
      if (linkVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
      {
         return new Object[] { linkVariable };
      }

      return null;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_5_6_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_5_7_IsLinkRed_blackB(LinkVariable linkVariable)
   {
      BindingOperator linkVariable_bindingOperator = linkVariable.getBindingOperator();
      if (linkVariable_bindingOperator.equals(BindingOperator.DESTROY))
      {
         return new Object[] { linkVariable };
      }

      return null;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_5_8_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_5_9_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_5_10_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_5_11_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_6_1_IsVariableBlackAndMandatory_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
      {
         BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
         if (objectVariable_bindingSemantics.equals(BindingSemantics.MANDATORY))
         {
            return new Object[] { objectVariable };
         }

      }

      return null;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_6_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_6_3_IsVariableRed_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.DESTROY))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_6_4_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_BlackAndNacPatternTransformer_6_5_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_7_1_Init_blackB(BlackAndNacPatternTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final Iterable<Object[]> pattern_BlackAndNacPatternTransformer_7_2_ForAllObjectVariables_blackBF(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { storyPattern, objectVariable });
      }
      return _result;
   }

   public static final Iterable<Object[]> pattern_BlackAndNacPatternTransformer_7_3_ForAllAttributeConstraints_blackBF(ObjectVariable objectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
      if (objectVariable_bindingSemantics.equals(BindingSemantics.MANDATORY))
      {
         for (Constraint constraint : objectVariable.getConstraint())
         {
            _result.add(new Object[] { objectVariable, constraint });
         }
      }

      return _result;
   }

   public static final void pattern_BlackAndNacPatternTransformer_7_4_TransformAttributeConstraint_expressionBBB(BlackAndNacPatternTransformer _this,
         Constraint constraint, Pattern pattern)
   {
      _this.transformAttributeConstraint(constraint, pattern);

   }

   public static final void pattern_BlackAndNacPatternTransformer_7_5_InjectivityAnalysisForPositivePattern_expressionBB(BlackAndNacPatternTransformer _this,
         Pattern pattern)
   {
      _this.analyzeInjectivity(pattern);

   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_1_LookupExpressionTransformer_blackFFB(BlackAndNacPatternTransformer _this)
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

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_2_LookupConstraintContext_blackFFFFFBF(Constraint constraint)
   {
      ObjectVariable objectVariable = constraint.getObjectVariable();
      if (objectVariable != null)
      {
         Expression tmpBinaryExpression = constraint.getConstraintExpression();
         if (tmpBinaryExpression instanceof ComparisonExpression)
         {
            ComparisonExpression binaryExpression = (ComparisonExpression) tmpBinaryExpression;
            Expression expression = binaryExpression.getRightExpression();
            if (expression != null)
            {
               if (!binaryExpression.equals(expression))
               {
                  Expression tmpAttributeValueExpression = binaryExpression.getLeftExpression();
                  if (tmpAttributeValueExpression instanceof AttributeValueExpression)
                  {
                     AttributeValueExpression attributeValueExpression = (AttributeValueExpression) tmpAttributeValueExpression;
                     if (!attributeValueExpression.equals(expression))
                     {
                        EAttribute eAttribute = attributeValueExpression.getAttribute();
                        if (eAttribute != null)
                        {
                           EClassifier tmpEDataType = eAttribute.getEType();
                           if (tmpEDataType instanceof EDataType)
                           {
                              EDataType eDataType = (EDataType) tmpEDataType;
                              return new Object[] { eDataType, binaryExpression, objectVariable, eAttribute, expression, constraint, attributeValueExpression };
                           }

                        }

                     }
                  }

               }
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_bindingFBB(BlackAndNacPatternTransformer _this,
         ComparisonExpression binaryExpression)
   {
      RelationalConstraint _localVariable_0 = _this.createRelationalConstraint(binaryExpression);
      RelationalConstraint newConstraint = _localVariable_0;
      if (newConstraint != null)
      {
         return new Object[] { newConstraint, _this, binaryExpression };
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_blackB(RelationalConstraint newConstraint)
   {
      return new Object[] { newConstraint };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_bindingAndBlackFBB(BlackAndNacPatternTransformer _this,
         ComparisonExpression binaryExpression)
   {
      Object[] result_pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_binding = pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_bindingFBB(
            _this, binaryExpression);
      if (result_pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_binding != null)
      {
         RelationalConstraint newConstraint = (RelationalConstraint) result_pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_binding[0];

         Object[] result_pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_black = pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_blackB(
               newConstraint);
         if (result_pattern_BlackAndNacPatternTransformer_8_3_CreateConstraint_black != null)
         {

            return new Object[] { newConstraint, _this, binaryExpression };
         }
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_bindingFBBBB(BlackAndNacPatternTransformer _this,
         ObjectVariable objectVariable, EAttribute eAttribute, Pattern pattern)
   {
      Variable _localVariable_1 = _this.getAttributeVariable(objectVariable, eAttribute, pattern);
      Variable attribute = _localVariable_1;
      if (attribute != null)
      {
         return new Object[] { attribute, _this, objectVariable, eAttribute, pattern };
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_blackFBBB(Pattern pattern, RelationalConstraint newConstraint,
         Variable attribute)
   {
      for (PatternBody patternBody : pattern.getBodies())
      {
         return new Object[] { patternBody, pattern, newConstraint, attribute };
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_bindingAndBlackFBBFBBB(Pattern pattern,
         RelationalConstraint newConstraint, BlackAndNacPatternTransformer _this, ObjectVariable objectVariable, EAttribute eAttribute)
   {
      Object[] result_pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_binding = pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_bindingFBBBB(
            _this, objectVariable, eAttribute, pattern);
      if (result_pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_binding != null)
      {
         Variable attribute = (Variable) result_pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_binding[0];

         Object[] result_pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_black = pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_blackFBBB(
               pattern, newConstraint, attribute);
         if (result_pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_black != null)
         {
            PatternBody patternBody = (PatternBody) result_pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_black[0];

            return new Object[] { patternBody, pattern, newConstraint, attribute, _this, objectVariable, eAttribute };
         }
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_4_AddFirstParameter_greenBBBF(PatternBody patternBody,
         RelationalConstraint newConstraint, Variable attribute)
   {
      ConstraintParameter firstParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      patternBody.getConstraints().add(newConstraint);
      newConstraint.getParameters().add(firstParameter);
      firstParameter.setReference(attribute);
      return new Object[] { patternBody, newConstraint, attribute, firstParameter };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_bindingFBBBBBB(ExpressionTransformer expressionTransformer,
         ValidationReport report, BlackAndNacPatternTransformer _this, Expression expression, Pattern pattern, EDataType eDataType)
   {
      ConstraintVariable _localVariable_0 = expressionTransformer.transformExpression(report, _this, expression, pattern, eDataType);
      ConstraintVariable rightSideExpression = _localVariable_0;
      if (rightSideExpression != null)
      {
         return new Object[] { rightSideExpression, expressionTransformer, report, _this, expression, pattern, eDataType };
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_blackBB(ConstraintVariable rightSideExpression,
         RelationalConstraint newConstraint)
   {
      return new Object[] { rightSideExpression, newConstraint };
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_bindingAndBlackFBBBBBBB(RelationalConstraint newConstraint,
         ExpressionTransformer expressionTransformer, ValidationReport report, BlackAndNacPatternTransformer _this, Expression expression, Pattern pattern,
         EDataType eDataType)
   {
      Object[] result_pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_binding = pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_bindingFBBBBBB(
            expressionTransformer, report, _this, expression, pattern, eDataType);
      if (result_pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_binding != null)
      {
         ConstraintVariable rightSideExpression = (ConstraintVariable) result_pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_binding[0];

         Object[] result_pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_black = pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_blackBB(
               rightSideExpression, newConstraint);
         if (result_pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_black != null)
         {

            return new Object[] { rightSideExpression, newConstraint, expressionTransformer, report, _this, expression, pattern, eDataType };
         }
      }
      return null;
   }

   public static final Object[] pattern_BlackAndNacPatternTransformer_8_5_AddSecondParameter_greenBFB(ConstraintVariable rightSideExpression,
         RelationalConstraint newConstraint)
   {
      ConstraintParameter secondParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      secondParameter.setReference(rightSideExpression);
      newConstraint.getParameters().add(secondParameter);
      return new Object[] { rightSideExpression, secondParameter, newConstraint };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //BlackAndNacPatternTransformerImpl
