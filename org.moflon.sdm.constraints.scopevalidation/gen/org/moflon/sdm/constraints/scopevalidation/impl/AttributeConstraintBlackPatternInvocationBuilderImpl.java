/**
 */
package org.moflon.sdm.constraints.scopevalidation.impl;

import SDMLanguage.patterns.AttributeConstraints.AssignmentConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;
import SDMLanguage.patterns.AttributeConstraints.PrimitiveVariable;

import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;

import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;

import org.moflon.sdm.compiler.democles.validation.scope.impl.BlackPatternBuilderImpl;

import org.moflon.sdm.constraints.scopevalidation.AttributeConstraintBlackPatternInvocationBuilder;
import org.moflon.sdm.constraints.scopevalidation.ScopevalidationPackage;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint Black Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintBlackPatternInvocationBuilderImpl extends BlackPatternBuilderImpl implements AttributeConstraintBlackPatternInvocationBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AttributeConstraintBlackPatternInvocationBuilderImpl()
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
      return ScopevalidationPackage.Literals.ATTRIBUTE_CONSTRAINT_BLACK_PATTERN_INVOCATION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeDependencies(PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = AttributeConstraintBlackPatternInvocationBuilderImpl
            .pattern_AttributeConstraintBlackPatternInvocationBuilder_0_1_ActivityNode4_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      AttributeConstraintBlackPatternInvocationBuilderImpl.pattern_AttributeConstraintBlackPatternInvocationBuilder_0_2_ActivityNode5_expressionBBBB(this,
            patternInvocationBuilder, storyPattern, pattern);
      // ForEach 
      for (Object[] result3_black : AttributeConstraintBlackPatternInvocationBuilderImpl
            .pattern_AttributeConstraintBlackPatternInvocationBuilder_0_3_ActivityNode1_blackFB(storyPattern))
      {
         AssignmentConstraint assignmentConstraint = (AssignmentConstraint) result3_black[0];
         // 
         Object[] result4_black = AttributeConstraintBlackPatternInvocationBuilderImpl
               .pattern_AttributeConstraintBlackPatternInvocationBuilder_0_4_ActivityNode2_blackFBFB(pattern, assignmentConstraint);
         if (result4_black != null)
         {
            EDataType variableType = (EDataType) result4_black[0];
            PrimitiveVariable primitiveVariable = (PrimitiveVariable) result4_black[2];
            Object[] result4_green = AttributeConstraintBlackPatternInvocationBuilderImpl
                  .pattern_AttributeConstraintBlackPatternInvocationBuilder_0_4_ActivityNode2_greenBBFB(variableType, pattern, primitiveVariable);
            EMFVariable newVariable = (EMFVariable) result4_green[2];

            // 
            AttributeConstraintBlackPatternInvocationBuilderImpl.pattern_AttributeConstraintBlackPatternInvocationBuilder_0_5_ActivityNode9_expressionFBBB(this,
                  newVariable, variableType);

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
   public void callSuperAnalyzeDependencies(PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {
      // [user code injected with eMoflon]

      super.analyzeDependencies(patternInvocationBuilder, storyPattern, pattern);

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String concat(String param1, int param2)
   {
      // [user code injected with eMoflon]

      return param1 + "_" + param2;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String calcLocalVariableName(Variable variable)
   {

      Object[] result1_black = AttributeConstraintBlackPatternInvocationBuilderImpl
            .pattern_AttributeConstraintBlackPatternInvocationBuilder_3_1_ActivityNode8_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }

      Object[] result2_bindingAndBlack = AttributeConstraintBlackPatternInvocationBuilderImpl
            .pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_bindingAndBlackFFBFB(variable, this);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[variable] = " + variable + ", " + "[this] = " + this + ".");
      }
      //nothing Action action = (Action) result2_bindingAndBlack[0];
      CFNode cfNode = (CFNode) result2_bindingAndBlack[1];
      //nothing PatternInvocationBuilder builder = (PatternInvocationBuilder) result2_bindingAndBlack[3];
      return AttributeConstraintBlackPatternInvocationBuilderImpl.pattern_AttributeConstraintBlackPatternInvocationBuilder_3_3_expressionFBBB(this, variable,
            cfNode);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableReference handleAttrVariableReference(Variable variable, EClassifier variableType)
   {

      Object[] result1_black = AttributeConstraintBlackPatternInvocationBuilderImpl
            .pattern_AttributeConstraintBlackPatternInvocationBuilder_4_1_ActivityNode7_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      Object[] result2_bindingAndBlack = AttributeConstraintBlackPatternInvocationBuilderImpl
            .pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_bindingAndBlackFFFBB(variable, this);
      if (result2_bindingAndBlack != null)
      {
         //nothing PatternInvocationBuilder correspondingBuilder = (PatternInvocationBuilder) result2_bindingAndBlack[0];
         PatternInvocation invocation = (PatternInvocation) result2_bindingAndBlack[1];
         //nothing Pattern democlesPattern = (Pattern) result2_bindingAndBlack[2];

         Object[] result3_bindingAndBlack = AttributeConstraintBlackPatternInvocationBuilderImpl
               .pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_bindingAndBlackFBBBB(this, invocation, variable,
                     variableType);
         if (result3_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[invocation] = " + invocation + ", "
                  + "[variable] = " + variable + ", " + "[variableType] = " + variableType + ".");
         }
         CFVariable cfVariable = (CFVariable) result3_bindingAndBlack[0];

         Object[] result4_black = AttributeConstraintBlackPatternInvocationBuilderImpl
               .pattern_AttributeConstraintBlackPatternInvocationBuilder_4_4_CreateVariableReference_blackBBB(variable, invocation, cfVariable);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[variable] = " + variable + ", " + "[invocation] = " + invocation + ", "
                  + "[cfVariable] = " + cfVariable + ".");
         }
         Object[] result4_green = AttributeConstraintBlackPatternInvocationBuilderImpl
               .pattern_AttributeConstraintBlackPatternInvocationBuilder_4_4_CreateVariableReference_greenBBBF(variable, invocation, cfVariable);
         VariableReference newReference = (VariableReference) result4_green[3];

         return AttributeConstraintBlackPatternInvocationBuilderImpl.pattern_AttributeConstraintBlackPatternInvocationBuilder_4_5_expressionFB(newReference);
      } else
      {
         return AttributeConstraintBlackPatternInvocationBuilderImpl.pattern_AttributeConstraintBlackPatternInvocationBuilder_4_6_expressionF();
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
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_BLACK_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_BLACK_PATTERN_INVOCATION_BUILDER___CALL_SUPER_ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         callSuperAnalyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_BLACK_PATTERN_INVOCATION_BUILDER___CONCAT__STRING_INT:
         return concat((String) arguments.get(0), (Integer) arguments.get(1));
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_BLACK_PATTERN_INVOCATION_BUILDER___CALC_LOCAL_VARIABLE_NAME__VARIABLE:
         return calcLocalVariableName((Variable) arguments.get(0));
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_BLACK_PATTERN_INVOCATION_BUILDER___HANDLE_ATTR_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER:
         return handleAttrVariableReference((Variable) arguments.get(0), (EClassifier) arguments.get(1));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_0_1_ActivityNode4_blackB(
         AttributeConstraintBlackPatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_AttributeConstraintBlackPatternInvocationBuilder_0_2_ActivityNode5_expressionBBBB(
         AttributeConstraintBlackPatternInvocationBuilder _this, PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {
      _this.callSuperAnalyzeDependencies(patternInvocationBuilder, storyPattern, pattern);

   }

   public static final Iterable<Object[]> pattern_AttributeConstraintBlackPatternInvocationBuilder_0_3_ActivityNode1_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (AttributeConstraint tmpAssignmentConstraint : storyPattern.getConstraints())
      {
         if (tmpAssignmentConstraint instanceof AssignmentConstraint)
         {
            AssignmentConstraint assignmentConstraint = (AssignmentConstraint) tmpAssignmentConstraint;
            _result.add(new Object[] { assignmentConstraint, storyPattern });
         }
      }
      return _result;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_0_4_ActivityNode2_black_nac_0BB(Pattern pattern,
         PrimitiveVariable primitiveVariable)
   {
      String primitiveVariable_name = primitiveVariable.getName();
      for (Variable tmpExistingVariable : pattern.getSymbolicParameters())
      {
         if (tmpExistingVariable instanceof EMFVariable)
         {
            EMFVariable existingVariable = (EMFVariable) tmpExistingVariable;
            String existingVariable_name = existingVariable.getName();
            if (existingVariable_name.equals(primitiveVariable_name))
            {
               return new Object[] { pattern, primitiveVariable };
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_0_4_ActivityNode2_blackFBFB(Pattern pattern,
         AssignmentConstraint assignmentConstraint)
   {
      AttributeConstraintVariable tmpPrimitiveVariable = assignmentConstraint.getParameter();
      if (tmpPrimitiveVariable instanceof PrimitiveVariable)
      {
         PrimitiveVariable primitiveVariable = (PrimitiveVariable) tmpPrimitiveVariable;
         EDataType variableType = primitiveVariable.getType();
         if (variableType != null)
         {
            if (pattern_AttributeConstraintBlackPatternInvocationBuilder_0_4_ActivityNode2_black_nac_0BB(pattern, primitiveVariable) == null)
            {
               return new Object[] { variableType, pattern, primitiveVariable, assignmentConstraint };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_0_4_ActivityNode2_greenBBFB(EDataType variableType, Pattern pattern,
         PrimitiveVariable primitiveVariable)
   {
      EMFVariable newVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      pattern.getSymbolicParameters().add(newVariable);
      newVariable.setEClassifier(variableType);
      String primitiveVariable_name = primitiveVariable.getName();
      String newVariable_name_prime = primitiveVariable_name;
      newVariable.setName(newVariable_name_prime);
      return new Object[] { variableType, pattern, newVariable, primitiveVariable };

   }

   public static final VariableReference pattern_AttributeConstraintBlackPatternInvocationBuilder_0_5_ActivityNode9_expressionFBBB(
         AttributeConstraintBlackPatternInvocationBuilder _this, EMFVariable newVariable, EDataType variableType)
   {
      VariableReference _localVariable_0 = _this.handleAttrVariableReference(newVariable, variableType);
      VariableReference _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_3_1_ActivityNode8_blackB(
         AttributeConstraintBlackPatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_bindingFB(
         AttributeConstraintBlackPatternInvocationBuilder _this)
   {
      RegularPatternInvocationBuilder _localVariable_0 = _this.getPatternInvocationBuilder();
      PatternInvocationBuilder builder = _localVariable_0;
      if (builder != null)
      {
         return new Object[] { builder, _this };
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_blackFFBB(Variable variable,
         PatternInvocationBuilder builder)
   {
      Action action = builder.getResult();
      if (action != null)
      {
         CFNode cfNode = action.getCfNode();
         if (cfNode != null)
         {
            return new Object[] { action, cfNode, variable, builder };
         }

      }

      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_bindingAndBlackFFBFB(Variable variable,
         AttributeConstraintBlackPatternInvocationBuilder _this)
   {
      Object[] result_pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_binding = pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_bindingFB(
            _this);
      if (result_pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_binding != null)
      {
         PatternInvocationBuilder builder = (PatternInvocationBuilder) result_pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_binding[0];

         Object[] result_pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_black = pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_blackFFBB(
               variable, builder);
         if (result_pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_black != null)
         {
            Action action = (Action) result_pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_black[0];
            CFNode cfNode = (CFNode) result_pattern_AttributeConstraintBlackPatternInvocationBuilder_3_2_ActivityNode6_black[1];

            return new Object[] { action, cfNode, variable, builder, _this };
         }
      }
      return null;
   }

   public static final String pattern_AttributeConstraintBlackPatternInvocationBuilder_3_3_expressionFBBB(
         AttributeConstraintBlackPatternInvocationBuilder _this, Variable variable, CFNode cfNode)
   {
      String variable_name = variable.getName();
      int cfNode_id = cfNode.getId();
      String _localVariable_0 = _this.concat(variable_name, Integer.valueOf(cfNode_id));
      String _result = _localVariable_0;
      return _result;

   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_1_ActivityNode7_blackB(
         AttributeConstraintBlackPatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_bindingFB(
         AttributeConstraintBlackPatternInvocationBuilder _this)
   {
      RegularPatternInvocationBuilder _localVariable_0 = _this.getPatternInvocationBuilder();
      PatternInvocationBuilder correspondingBuilder = _localVariable_0;
      if (correspondingBuilder != null)
      {
         return new Object[] { correspondingBuilder, _this };
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_blackBFFB(
         PatternInvocationBuilder correspondingBuilder, Variable variable)
   {
      Action tmpInvocation = correspondingBuilder.getResult();
      if (tmpInvocation instanceof PatternInvocation)
      {
         PatternInvocation invocation = (PatternInvocation) tmpInvocation;
         Pattern democlesPattern = invocation.getPattern();
         if (democlesPattern != null)
         {
            if (democlesPattern.getSymbolicParameters().contains(variable))
            {
               return new Object[] { correspondingBuilder, invocation, democlesPattern, variable };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_bindingAndBlackFFFBB(Variable variable,
         AttributeConstraintBlackPatternInvocationBuilder _this)
   {
      Object[] result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_binding = pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_bindingFB(
            _this);
      if (result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_binding != null)
      {
         PatternInvocationBuilder correspondingBuilder = (PatternInvocationBuilder) result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_binding[0];

         Object[] result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_black = pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_blackBFFB(
               correspondingBuilder, variable);
         if (result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_black != null)
         {
            PatternInvocation invocation = (PatternInvocation) result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_black[1];
            Pattern democlesPattern = (Pattern) result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_2_LookupPatternInvocation_black[2];

            return new Object[] { correspondingBuilder, invocation, democlesPattern, variable, _this };
         }
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_bindingFBBBB(
         AttributeConstraintBlackPatternInvocationBuilder _this, PatternInvocation invocation, Variable variable, EClassifier variableType)
   {
      String _localVariable_2 = _this.calcLocalVariableName(variable);
      CFVariable _localVariable_1 = _this.lookupControlFlowVariable(invocation, _localVariable_2, variableType);
      CFVariable cfVariable = _localVariable_1;
      if (cfVariable != null)
      {
         return new Object[] { cfVariable, _this, invocation, variable, variableType };
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_blackB(CFVariable cfVariable)
   {
      return new Object[] { cfVariable };
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_bindingAndBlackFBBBB(
         AttributeConstraintBlackPatternInvocationBuilder _this, PatternInvocation invocation, Variable variable, EClassifier variableType)
   {
      Object[] result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_binding = pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_bindingFBBBB(
            _this, invocation, variable, variableType);
      if (result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_binding != null)
      {
         CFVariable cfVariable = (CFVariable) result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_binding[0];

         Object[] result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_black = pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_blackB(
               cfVariable);
         if (result_pattern_AttributeConstraintBlackPatternInvocationBuilder_4_3_LookupOrCreateControlFlowVariable_black != null)
         {

            return new Object[] { cfVariable, _this, invocation, variable, variableType };
         }
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_4_CreateVariableReference_blackBBB(Variable variable,
         PatternInvocation invocation, CFVariable cfVariable)
   {
      return new Object[] { variable, invocation, cfVariable };
   }

   public static final Object[] pattern_AttributeConstraintBlackPatternInvocationBuilder_4_4_CreateVariableReference_greenBBBF(Variable variable,
         PatternInvocation invocation, CFVariable cfVariable)
   {
      VariableReference newReference = DemoclesFactory.eINSTANCE.createVariableReference();
      boolean cfVariable_local_prime = Boolean.valueOf(true);
      newReference.setInvocation(invocation);
      newReference.setFrom(cfVariable);
      newReference.setTo(variable);
      cfVariable.setLocal(Boolean.valueOf(cfVariable_local_prime));
      return new Object[] { variable, invocation, cfVariable, newReference };
   }

   public static final VariableReference pattern_AttributeConstraintBlackPatternInvocationBuilder_4_5_expressionFB(VariableReference newReference)
   {
      VariableReference _result = newReference;
      return _result;
   }

   public static final VariableReference pattern_AttributeConstraintBlackPatternInvocationBuilder_4_6_expressionF()
   {
      VariableReference _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //AttributeConstraintBlackPatternInvocationBuilderImpl
