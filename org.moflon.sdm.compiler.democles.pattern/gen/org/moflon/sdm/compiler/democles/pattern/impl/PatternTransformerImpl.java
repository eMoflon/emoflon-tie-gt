/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;

import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.PatternTransformer;

import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.impl.PatternTransformerImpl#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.impl.PatternTransformerImpl#getExpressionTransformer <em>Expression Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternTransformerImpl extends PatternVariableHandlerImpl implements PatternTransformer
{
   /**
    * The cached value of the '{@link #getValidationReport() <em>Validation Report</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValidationReport()
    * @generated
    * @ordered
    */
   protected ValidationReport validationReport;

   /**
    * The cached value of the '{@link #getExpressionTransformer() <em>Expression Transformer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExpressionTransformer()
    * @generated
    * @ordered
    */
   protected ExpressionTransformer expressionTransformer;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PatternTransformerImpl()
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
      return PatternPackage.Literals.PATTERN_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport getValidationReport()
   {
      if (validationReport != null && validationReport.eIsProxy())
      {
         InternalEObject oldValidationReport = (InternalEObject) validationReport;
         validationReport = (ValidationReport) eResolveProxy(oldValidationReport);
         if (validationReport != oldValidationReport)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.PATTERN_TRANSFORMER__VALIDATION_REPORT, oldValidationReport,
                     validationReport));
         }
      }
      return validationReport;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport basicGetValidationReport()
   {
      return validationReport;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValidationReport(ValidationReport newValidationReport)
   {
      ValidationReport oldValidationReport = validationReport;
      validationReport = newValidationReport;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN_TRANSFORMER__VALIDATION_REPORT, oldValidationReport, validationReport));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionTransformer getExpressionTransformer()
   {
      if (expressionTransformer != null && expressionTransformer.eIsProxy())
      {
         InternalEObject oldExpressionTransformer = (InternalEObject) expressionTransformer;
         expressionTransformer = (ExpressionTransformer) eResolveProxy(oldExpressionTransformer);
         if (expressionTransformer != oldExpressionTransformer)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER, oldExpressionTransformer,
                     expressionTransformer));
         }
      }
      return expressionTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionTransformer basicGetExpressionTransformer()
   {
      return expressionTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExpressionTransformer(ExpressionTransformer newExpressionTransformer)
   {
      ExpressionTransformer oldExpressionTransformer = expressionTransformer;
      expressionTransformer = newExpressionTransformer;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER, oldExpressionTransformer,
               expressionTransformer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void addLinkToPattern(LinkVariable linkVariable, Pattern pattern)
   {

      Object[] result1_black = PatternTransformerImpl.pattern_PatternTransformer_0_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      Object[] result2_black = PatternTransformerImpl.pattern_PatternTransformer_0_2_LookupSourceVariable_blackBFBF(linkVariable, pattern);
      if (result2_black != null)
      {
         //nothing ObjectVariable source = (ObjectVariable) result2_black[1];
         Variable sourceVariable = (Variable) result2_black[3];
         // 
         Object[] result3_black = PatternTransformerImpl.pattern_PatternTransformer_0_3_LookupTargetVariable_blackBBFF(linkVariable, pattern);
         if (result3_black != null)
         {
            //nothing ObjectVariable target = (ObjectVariable) result3_black[2];
            Variable targetVariable = (Variable) result3_black[3];
            // 
            Object[] result4_bindingAndBlack = PatternTransformerImpl.pattern_PatternTransformer_0_4_AddLinkToPattern_bindingAndBlackBFFBB(pattern, this,
                  linkVariable);
            if (result4_bindingAndBlack != null)
            {
               PatternBody patternBody = (PatternBody) result4_bindingAndBlack[1];
               EReference eReference = (EReference) result4_bindingAndBlack[2];
               Object[] result4_green = PatternTransformerImpl.pattern_PatternTransformer_0_4_AddLinkToPattern_greenFBB(patternBody, eReference);
               Reference constraint = (Reference) result4_green[0];

               Object[] result5_black = PatternTransformerImpl.pattern_PatternTransformer_0_5_HandleSourceVariable_blackBB(constraint, sourceVariable);
               if (result5_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[sourceVariable] = " + sourceVariable + ".");
               }
               PatternTransformerImpl.pattern_PatternTransformer_0_5_HandleSourceVariable_greenBFB(constraint, sourceVariable);
               //nothing ConstraintParameter sourceParameter = (ConstraintParameter) result5_green[1];

               Object[] result6_black = PatternTransformerImpl.pattern_PatternTransformer_0_6_HandleTargetVariable_blackBB(constraint, targetVariable);
               if (result6_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[targetVariable] = " + targetVariable + ".");
               }
               PatternTransformerImpl.pattern_PatternTransformer_0_6_HandleTargetVariable_greenBBF(constraint, targetVariable);
               //nothing ConstraintParameter targetParameter = (ConstraintParameter) result6_green[2];

               return;
            } else
            {
            }

         } else
         {
         }

      } else
      {
      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEReference(LinkVariable linkVariable)
   {// 
      Object[] result1_black = PatternTransformerImpl.pattern_PatternTransformer_1_1_LookupEReference_blackBFFF(linkVariable);
      if (result1_black != null)
      {
         //nothing EClass sourceEClass = (EClass) result1_black[1];
         //nothing ObjectVariable source = (ObjectVariable) result1_black[2];
         EReference eReference = (EReference) result1_black[3];
         return PatternTransformerImpl.pattern_PatternTransformer_1_2_expressionFB(eReference);
      } else
      {
         return PatternTransformerImpl.pattern_PatternTransformer_1_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean hasSymbolicParameter(Pattern pattern, String variableName)
   {// 
      Object[] result1_black = PatternTransformerImpl.pattern_PatternTransformer_2_1_HasSymbolicParameter_blackBFB(pattern, variableName);
      if (result1_black != null)
      {
         //nothing Variable variable = (Variable) result1_black[1];
         return PatternTransformerImpl.pattern_PatternTransformer_2_2_expressionF();
      } else
      {
         return PatternTransformerImpl.pattern_PatternTransformer_2_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLinkToAdd(LinkVariable linkVariable, Pattern pattern)
   {// 
      return PatternTransformerImpl.pattern_PatternTransformer_3_2_expressionF();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {// 
      return PatternTransformerImpl.pattern_PatternTransformer_4_2_expressionF();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void postprocess(StoryPattern storyPattern, Pattern pattern)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void processLinkVariables(StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = PatternTransformerImpl.pattern_PatternTransformer_6_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // ForEach 
      for (Object[] result2_black : PatternTransformerImpl.pattern_PatternTransformer_6_2_ForEachLinkVariable_blackBF(storyPattern))
      {
         LinkVariable linkVariable = (LinkVariable) result2_black[1];
         // 
         if (PatternTransformerImpl.pattern_PatternTransformer_6_3_IsLinkAppropriate_expressionFBBB(this, linkVariable, pattern))
         {
            // 
            PatternTransformerImpl.pattern_PatternTransformer_6_4_AddLinkToPattern_expressionBBB(this, linkVariable, pattern);

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
   public ValidationReport transform(StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = PatternTransformerImpl.pattern_PatternTransformer_7_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Object[] result1_green = PatternTransformerImpl.pattern_PatternTransformer_7_1_Init_greenBF(this);
      ValidationReport report = (ValidationReport) result1_green[1];

      // 
      PatternTransformerImpl.pattern_PatternTransformer_7_2_ProcessLinkVariables_expressionBBB(this, storyPattern, pattern);
      // 
      PatternTransformerImpl.pattern_PatternTransformer_7_3_Postprocess_expressionBBB(this, storyPattern, pattern);

      Object[] result4_black = PatternTransformerImpl.pattern_PatternTransformer_7_4_DisposeValidationReport_blackBB(this, report);
      if (result4_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[report] = " + report + ".");
      }
      PatternTransformerImpl.pattern_PatternTransformer_7_4_DisposeValidationReport_redBB(this, report);

      return PatternTransformerImpl.pattern_PatternTransformer_7_5_expressionFB(report);
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
      case PatternPackage.PATTERN_TRANSFORMER__VALIDATION_REPORT:
         if (resolve)
            return getValidationReport();
         return basicGetValidationReport();
      case PatternPackage.PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER:
         if (resolve)
            return getExpressionTransformer();
         return basicGetExpressionTransformer();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case PatternPackage.PATTERN_TRANSFORMER__VALIDATION_REPORT:
         setValidationReport((ValidationReport) newValue);
         return;
      case PatternPackage.PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER:
         setExpressionTransformer((ExpressionTransformer) newValue);
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
      case PatternPackage.PATTERN_TRANSFORMER__VALIDATION_REPORT:
         setValidationReport((ValidationReport) null);
         return;
      case PatternPackage.PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER:
         setExpressionTransformer((ExpressionTransformer) null);
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
      case PatternPackage.PATTERN_TRANSFORMER__VALIDATION_REPORT:
         return validationReport != null;
      case PatternPackage.PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER:
         return expressionTransformer != null;
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
      case PatternPackage.PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN:
         addLinkToPattern((LinkVariable) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE:
         return getEReference((LinkVariable) arguments.get(0));
      case PatternPackage.PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING:
         return hasSymbolicParameter((Pattern) arguments.get(0), (String) arguments.get(1));
      case PatternPackage.PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN:
         return isLinkToAdd((LinkVariable) arguments.get(0), (Pattern) arguments.get(1));
      case PatternPackage.PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      case PatternPackage.PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN:
         postprocess((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN:
         processLinkVariables((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case PatternPackage.PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN:
         return transform((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_PatternTransformer_0_1_Init_blackB(PatternTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_PatternTransformer_0_2_LookupSourceVariable_blackBFBF(LinkVariable linkVariable, Pattern pattern)
   {
      ObjectVariable source = linkVariable.getSource();
      if (source != null)
      {
         String source_name = source.getName();
         for (Variable sourceVariable : pattern.getSymbolicParameters())
         {
            String sourceVariable_name = sourceVariable.getName();
            if (sourceVariable_name.equals(source_name))
            {
               return new Object[] { linkVariable, source, pattern, sourceVariable };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_PatternTransformer_0_3_LookupTargetVariable_blackBBFF(LinkVariable linkVariable, Pattern pattern)
   {
      ObjectVariable target = linkVariable.getTarget();
      if (target != null)
      {
         String target_name = target.getName();
         for (Variable targetVariable : pattern.getSymbolicParameters())
         {
            String targetVariable_name = targetVariable.getName();
            if (targetVariable_name.equals(target_name))
            {
               return new Object[] { linkVariable, pattern, target, targetVariable };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_PatternTransformer_0_4_AddLinkToPattern_bindingFBB(PatternTransformer _this, LinkVariable linkVariable)
   {
      EReference _localVariable_0 = _this.getEReference(linkVariable);
      EReference eReference = _localVariable_0;
      if (eReference != null)
      {
         return new Object[] { eReference, _this, linkVariable };
      }
      return null;
   }

   public static final Object[] pattern_PatternTransformer_0_4_AddLinkToPattern_blackBFB(Pattern pattern, EReference eReference)
   {
      for (PatternBody patternBody : pattern.getBodies())
      {
         return new Object[] { pattern, patternBody, eReference };
      }
      return null;
   }

   public static final Object[] pattern_PatternTransformer_0_4_AddLinkToPattern_bindingAndBlackBFFBB(Pattern pattern, PatternTransformer _this,
         LinkVariable linkVariable)
   {
      Object[] result_pattern_PatternTransformer_0_4_AddLinkToPattern_binding = pattern_PatternTransformer_0_4_AddLinkToPattern_bindingFBB(_this, linkVariable);
      if (result_pattern_PatternTransformer_0_4_AddLinkToPattern_binding != null)
      {
         EReference eReference = (EReference) result_pattern_PatternTransformer_0_4_AddLinkToPattern_binding[0];

         Object[] result_pattern_PatternTransformer_0_4_AddLinkToPattern_black = pattern_PatternTransformer_0_4_AddLinkToPattern_blackBFB(pattern, eReference);
         if (result_pattern_PatternTransformer_0_4_AddLinkToPattern_black != null)
         {
            PatternBody patternBody = (PatternBody) result_pattern_PatternTransformer_0_4_AddLinkToPattern_black[1];

            return new Object[] { pattern, patternBody, eReference, _this, linkVariable };
         }
      }
      return null;
   }

   public static final Object[] pattern_PatternTransformer_0_4_AddLinkToPattern_greenFBB(PatternBody patternBody, EReference eReference)
   {
      Reference constraint = EMFTypeFactory.eINSTANCE.createReference();
      constraint.setEModelElement(eReference);
      patternBody.getConstraints().add(constraint);
      return new Object[] { constraint, patternBody, eReference };
   }

   public static final Object[] pattern_PatternTransformer_0_5_HandleSourceVariable_blackBB(Reference constraint, Variable sourceVariable)
   {
      return new Object[] { constraint, sourceVariable };
   }

   public static final Object[] pattern_PatternTransformer_0_5_HandleSourceVariable_greenBFB(Reference constraint, Variable sourceVariable)
   {
      ConstraintParameter sourceParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraint.getParameters().add(sourceParameter);
      sourceParameter.setReference(sourceVariable);
      return new Object[] { constraint, sourceParameter, sourceVariable };
   }

   public static final Object[] pattern_PatternTransformer_0_6_HandleTargetVariable_blackBB(Reference constraint, Variable targetVariable)
   {
      return new Object[] { constraint, targetVariable };
   }

   public static final Object[] pattern_PatternTransformer_0_6_HandleTargetVariable_greenBBF(Reference constraint, Variable targetVariable)
   {
      ConstraintParameter targetParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraint.getParameters().add(targetParameter);
      targetParameter.setReference(targetVariable);
      return new Object[] { constraint, targetVariable, targetParameter };
   }

   public static final Object[] pattern_PatternTransformer_1_1_LookupEReference_blackBFFF(LinkVariable linkVariable)
   {
      ObjectVariable source = linkVariable.getSource();
      if (source != null)
      {
         String linkVariable_name = linkVariable.getName();
         EClassifier tmpSourceEClass = source.getType();
         if (tmpSourceEClass instanceof EClass)
         {
            EClass sourceEClass = (EClass) tmpSourceEClass;
            for (EReference eReference : sourceEClass.getEAllReferences())
            {
               String eReference_name = eReference.getName();
               if (eReference_name.equals(linkVariable_name))
               {
                  return new Object[] { linkVariable, sourceEClass, source, eReference };
               }

            }
         }

      }

      return null;
   }

   public static final EReference pattern_PatternTransformer_1_2_expressionFB(EReference eReference)
   {
      EReference _result = eReference;
      return _result;
   }

   public static final EReference pattern_PatternTransformer_1_3_expressionF()
   {
      EReference _result = null;
      return _result;
   }

   public static final Object[] pattern_PatternTransformer_2_1_HasSymbolicParameter_blackBFB(Pattern pattern, String variableName)
   {
      for (Variable variable : pattern.getSymbolicParameters())
      {
         String variable_name = variable.getName();
         if (variable_name.equals(variableName))
         {
            return new Object[] { pattern, variable, variableName };
         }

      }
      return null;
   }

   public static final boolean pattern_PatternTransformer_2_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_PatternTransformer_2_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_PatternTransformer_3_2_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_PatternTransformer_4_2_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_PatternTransformer_6_1_Init_blackB(PatternTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final Iterable<Object[]> pattern_PatternTransformer_6_2_ForEachLinkVariable_blackBF(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (LinkVariable linkVariable : storyPattern.getLinkVariable())
      {
         _result.add(new Object[] { storyPattern, linkVariable });
      }
      return _result;
   }

   public static final boolean pattern_PatternTransformer_6_3_IsLinkAppropriate_expressionFBBB(PatternTransformer _this, LinkVariable linkVariable,
         Pattern pattern)
   {
      boolean _localVariable_0 = _this.isLinkToAdd(linkVariable, pattern);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final void pattern_PatternTransformer_6_4_AddLinkToPattern_expressionBBB(PatternTransformer _this, LinkVariable linkVariable, Pattern pattern)
   {
      _this.addLinkToPattern(linkVariable, pattern);

   }

   public static final Object[] pattern_PatternTransformer_7_1_Init_blackB(PatternTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_PatternTransformer_7_1_Init_greenBF(PatternTransformer _this)
   {
      ValidationReport report = ResultFactory.eINSTANCE.createValidationReport();
      _this.setValidationReport(report);
      return new Object[] { _this, report };
   }

   public static final void pattern_PatternTransformer_7_2_ProcessLinkVariables_expressionBBB(PatternTransformer _this, StoryPattern storyPattern,
         Pattern pattern)
   {
      _this.processLinkVariables(storyPattern, pattern);

   }

   public static final void pattern_PatternTransformer_7_3_Postprocess_expressionBBB(PatternTransformer _this, StoryPattern storyPattern, Pattern pattern)
   {
      _this.postprocess(storyPattern, pattern);

   }

   public static final Object[] pattern_PatternTransformer_7_4_DisposeValidationReport_blackBB(PatternTransformer _this, ValidationReport report)
   {
      if (report.equals(_this.getValidationReport()))
      {
         return new Object[] { _this, report };
      }
      return null;
   }

   public static final Object[] pattern_PatternTransformer_7_4_DisposeValidationReport_redBB(PatternTransformer _this, ValidationReport report)
   {
      _this.setValidationReport(null);
      return new Object[] { _this, report };
   }

   public static final ValidationReport pattern_PatternTransformer_7_5_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //PatternTransformerImpl
