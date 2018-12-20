/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BindingPatternTransformerImpl extends PatternTransformerImpl implements BindingPatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BindingPatternTransformerImpl()
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
      return PatternPackage.Literals.BINDING_PATTERN_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {// 
      Object[] result1_black = BindingPatternTransformerImpl.pattern_BindingPatternTransformer_0_1_HasBindingExpression_blackBF(objectVariable);
      if (result1_black != null)
      {
         //nothing Expression bindingExpression = (Expression) result1_black[1];
         return BindingPatternTransformerImpl.pattern_BindingPatternTransformer_0_2_expressionF();
      } else
      {
         return BindingPatternTransformerImpl.pattern_BindingPatternTransformer_0_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void postprocess(StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = BindingPatternTransformerImpl.pattern_BindingPatternTransformer_1_1_LookupExpressionTransformer_blackBFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ExpressionTransformer expressionTransformer = (ExpressionTransformer) result1_black[1];
      ValidationReport report = (ValidationReport) result1_black[2];
      // ForEach 
      for (Object[] result2_black : BindingPatternTransformerImpl
            .pattern_BindingPatternTransformer_1_2_ForAllObjectVariablesWithBindingExpression_blackBFF(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[1];
         Expression bindingExpression = (Expression) result2_black[2];

         Object[] result3_black = BindingPatternTransformerImpl.pattern_BindingPatternTransformer_1_3_LookupObjectVariableType_blackFB(objectVariable);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ".");
         }
         EClassifier type = (EClassifier) result3_black[0];

         Object[] result4_bindingAndBlack = BindingPatternTransformerImpl.pattern_BindingPatternTransformer_1_4_LookupReturnVariable_bindingAndBlackFBBBB(this,
               pattern, objectVariable, type);
         if (result4_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[pattern] = " + pattern + ", "
                  + "[objectVariable] = " + objectVariable + ", " + "[type] = " + type + ".");
         }
         Variable returnVariable = (Variable) result4_bindingAndBlack[0];
         // 
         BindingPatternTransformerImpl.pattern_BindingPatternTransformer_1_5_TransformAndAssignExpression_expressionBBBBBBB(expressionTransformer, report, this,
               bindingExpression, pattern, returnVariable, type);

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void processObjectVariables(StoryPattern storyPattern, Pattern pattern)
   {// 
      return;
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
      case PatternPackage.BINDING_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      case PatternPackage.BINDING_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN:
         postprocess((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.BINDING_PATTERN_TRANSFORMER___PROCESS_OBJECT_VARIABLES__STORYPATTERN_PATTERN:
         processObjectVariables((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_BindingPatternTransformer_0_1_HasBindingExpression_blackBF(ObjectVariable objectVariable)
   {
      Expression bindingExpression = objectVariable.getBindingExpression();
      if (bindingExpression != null)
      {
         return new Object[] { objectVariable, bindingExpression };
      }

      return null;
   }

   public static final boolean pattern_BindingPatternTransformer_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_BindingPatternTransformer_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_BindingPatternTransformer_1_1_LookupExpressionTransformer_blackBFF(BindingPatternTransformer _this)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         ExpressionTransformer expressionTransformer = _this.getExpressionTransformer();
         if (expressionTransformer != null)
         {
            return new Object[] { _this, expressionTransformer, report };
         }

      }

      return null;
   }

   public static final Iterable<Object[]> pattern_BindingPatternTransformer_1_2_ForAllObjectVariablesWithBindingExpression_blackBFF(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         Expression bindingExpression = objectVariable.getBindingExpression();
         if (bindingExpression != null)
         {
            _result.add(new Object[] { storyPattern, objectVariable, bindingExpression });
         }

      }
      return _result;
   }

   public static final Object[] pattern_BindingPatternTransformer_1_3_LookupObjectVariableType_blackFB(ObjectVariable objectVariable)
   {
      EClassifier type = objectVariable.getType();
      if (type != null)
      {
         return new Object[] { type, objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_BindingPatternTransformer_1_4_LookupReturnVariable_bindingFBBBB(BindingPatternTransformer _this, Pattern pattern,
         ObjectVariable objectVariable, EClassifier type)
   {
      String objectVariable_name = objectVariable.getName();
      Variable _localVariable_0 = _this.lookupVariableInPattern(pattern, objectVariable_name, type);
      Variable returnVariable = _localVariable_0;
      if (returnVariable != null)
      {
         return new Object[] { returnVariable, _this, pattern, objectVariable, type };
      }

      return null;
   }

   public static final Object[] pattern_BindingPatternTransformer_1_4_LookupReturnVariable_blackB(Variable returnVariable)
   {
      return new Object[] { returnVariable };
   }

   public static final Object[] pattern_BindingPatternTransformer_1_4_LookupReturnVariable_bindingAndBlackFBBBB(BindingPatternTransformer _this,
         Pattern pattern, ObjectVariable objectVariable, EClassifier type)
   {
      Object[] result_pattern_BindingPatternTransformer_1_4_LookupReturnVariable_binding = pattern_BindingPatternTransformer_1_4_LookupReturnVariable_bindingFBBBB(
            _this, pattern, objectVariable, type);
      if (result_pattern_BindingPatternTransformer_1_4_LookupReturnVariable_binding != null)
      {
         Variable returnVariable = (Variable) result_pattern_BindingPatternTransformer_1_4_LookupReturnVariable_binding[0];

         Object[] result_pattern_BindingPatternTransformer_1_4_LookupReturnVariable_black = pattern_BindingPatternTransformer_1_4_LookupReturnVariable_blackB(
               returnVariable);
         if (result_pattern_BindingPatternTransformer_1_4_LookupReturnVariable_black != null)
         {

            return new Object[] { returnVariable, _this, pattern, objectVariable, type };
         }
      }
      return null;
   }

   public static final void pattern_BindingPatternTransformer_1_5_TransformAndAssignExpression_expressionBBBBBBB(ExpressionTransformer expressionTransformer,
         ValidationReport report, BindingPatternTransformer _this, Expression bindingExpression, Pattern pattern, Variable returnVariable, EClassifier type)
   {
      expressionTransformer.transformAndAssignExpression(report, _this, bindingExpression, pattern, returnVariable, type);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //BindingPatternTransformerImpl
