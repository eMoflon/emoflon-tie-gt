/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.activities.ActivityNode;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gervarro.democles.common.Adornment;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternInvocationBuilderImpl#getExpressionExplorer <em>Expression Explorer</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternInvocationBuilderImpl#getPatternMatcher <em>Pattern Matcher</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternInvocationBuilderImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PatternInvocationBuilderImpl extends ActionBuilderImpl implements PatternInvocationBuilder
{
   /**
    * The cached value of the '{@link #getExpressionExplorer() <em>Expression Explorer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExpressionExplorer()
    * @generated
    * @ordered
    */
   protected ExpressionExplorer expressionExplorer;

   /**
    * The cached value of the '{@link #getPatternMatcher() <em>Pattern Matcher</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPatternMatcher()
    * @generated
    * @ordered
    */
   protected PatternMatcher patternMatcher;

   /**
    * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSuffix()
    * @generated
    * @ordered
    */
   protected static final String SUFFIX_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSuffix()
    * @generated
    * @ordered
    */
   protected String suffix = SUFFIX_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PatternInvocationBuilderImpl()
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
      return ScopePackage.Literals.PATTERN_INVOCATION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionExplorer getExpressionExplorer()
   {
      if (expressionExplorer != null && expressionExplorer.eIsProxy())
      {
         InternalEObject oldExpressionExplorer = (InternalEObject) expressionExplorer;
         expressionExplorer = (ExpressionExplorer) eResolveProxy(oldExpressionExplorer);
         if (expressionExplorer != oldExpressionExplorer)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScopePackage.PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER, oldExpressionExplorer,
                     expressionExplorer));
         }
      }
      return expressionExplorer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionExplorer basicGetExpressionExplorer()
   {
      return expressionExplorer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExpressionExplorer(ExpressionExplorer newExpressionExplorer)
   {
      ExpressionExplorer oldExpressionExplorer = expressionExplorer;
      expressionExplorer = newExpressionExplorer;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER, oldExpressionExplorer,
               expressionExplorer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternMatcher getPatternMatcher()
   {
      if (patternMatcher != null && patternMatcher.eIsProxy())
      {
         InternalEObject oldPatternMatcher = (InternalEObject) patternMatcher;
         patternMatcher = (PatternMatcher) eResolveProxy(oldPatternMatcher);
         if (patternMatcher != oldPatternMatcher)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScopePackage.PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER, oldPatternMatcher,
                     patternMatcher));
         }
      }
      return patternMatcher;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternMatcher basicGetPatternMatcher()
   {
      return patternMatcher;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPatternMatcher(PatternMatcher newPatternMatcher)
   {
      PatternMatcher oldPatternMatcher = patternMatcher;
      patternMatcher = newPatternMatcher;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER, oldPatternMatcher, patternMatcher));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getSuffix()
   {
      return suffix;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSuffix(String newSuffix)
   {
      String oldSuffix = suffix;
      suffix = newSuffix;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.PATTERN_INVOCATION_BUILDER__SUFFIX, oldSuffix, suffix));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void attachToResource(CFNode node, Pattern pattern)
   {
      // [user code injected with eMoflon]

      EClass eClass = node.getOrigin().getOwningActivity().getOwningOperation().getEContainingClass();
      Resource patternResource = (Resource) EcoreUtil.getRegisteredAdapter(eClass, getSuffix());
      if (patternResource != null)
      {
         patternResource.getContents().add(pattern);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Adornment calculateAdornment(PatternInvocation invocation)
   {
      // [user code injected with eMoflon]

      List<VariableReference> parameters = invocation.getParameters();
      Adornment adornment = new Adornment(parameters.size());
      for (int i = 0; i < parameters.size(); i++)
      {
         adornment.set(i, parameters.get(i).isFree() ? Adornment.FREE : Adornment.BOUND);
      }
      return adornment;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String calculatePatternName(CFNode node)
   {
      // [user code injected with eMoflon]

      final EOperation eOperation = node.getOrigin().getOwningActivity().getOwningOperation();
      String storyNodeName = node.getOrigin().getName() != null ? node.getOrigin().getName().trim() : "";
      storyNodeName = storyNodeName.replaceAll("\\s+", "");
      final EClass eClass = eOperation.getEContainingClass();
      final int operationIndex = eClass.getEOperations().indexOf(eOperation);
      if (storyNodeName.matches("[_a-zA-Z\\d]+"))
         return "pattern_" + eClass.getName() + "_" + operationIndex + "_" + node.getId() + "_" + storyNodeName + "_" + getSuffix();
      else
      {
         return "pattern_" + eClass.getName() + "_" + operationIndex + "_" + node.getId() + "_" + getSuffix();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternInvocation createAction()
   {
      // [user code injected with eMoflon]

      // TODO: implement this method here but do not remove the injection marker 
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void handlePatternMatcherReport(PatternInvocation invocation, ValidationReport report)
   {// 
      Object[] result1_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_4_1_LookupActivityNode_blackFBF(invocation);
      if (result1_black != null)
      {
         ActivityNode activity = (ActivityNode) result1_black[0];
         //nothing CFNode node = (CFNode) result1_black[2];
         // ForEach 
         for (Object[] result2_black : PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_4_2_SetErrorMessageLocation_blackFBB(activity, report))
         {
            ErrorMessage message = (ErrorMessage) result2_black[0];
            PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_4_2_SetErrorMessageLocation_greenBB(message, activity);

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
   public VariableReference handleVariableReference(Variable variable, EClassifier variableType)
   {

      Object[] result1_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_5_1_LookupPatternInvocation_blackBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      PatternInvocation invocation = (PatternInvocation) result1_black[1];

      Object[] result2_bindingAndBlack = PatternInvocationBuilderImpl
            .pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_bindingAndBlackFBBBB(this, invocation, variable, variableType);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[invocation] = " + invocation + ", "
               + "[variable] = " + variable + ", " + "[variableType] = " + variableType + ".");
      }
      CFVariable cfVariable = (CFVariable) result2_bindingAndBlack[0];

      Object[] result3_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_5_3_CreateVariableReference_blackBBB(invocation, variable,
            cfVariable);
      if (result3_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = " + invocation + ", " + "[variable] = " + variable + ", "
               + "[cfVariable] = " + cfVariable + ".");
      }
      Object[] result3_green = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_5_3_CreateVariableReference_greenBBFB(invocation, variable,
            cfVariable);
      VariableReference newReference = (VariableReference) result3_green[2];

      return PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_5_4_expressionFB(newReference);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean hasErrors()
   {

      Object[] result1_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_6_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }

      Object[] result2_bindingAndBlack = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_6_2_LookupValidationReport_bindingAndBlackFFB(this);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result2_bindingAndBlack[0];
      //nothing ScopeValidator scopeValidator = (ScopeValidator) result2_bindingAndBlack[1];
      // 
      Object[] result3_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_6_3_HasFatal_blackFB(report);
      if (result3_black != null)
      {
         //nothing ErrorMessage fatal = (ErrorMessage) result3_black[0];
         return PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_6_4_expressionF();
      } else
      {
         // 
         Object[] result5_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_6_5_HasError_blackBF(report);
         if (result5_black != null)
         {
            //nothing ErrorMessage error = (ErrorMessage) result5_black[1];
            return PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_6_6_expressionF();
         } else
         {
            return PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_6_7_expressionF();
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternInvocation lookupAction(CFNode node)
   {// 
      Object[] result1_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_1_ResultAlreadyAvailable_blackFB(this);
      if (result1_black != null)
      {
         PatternInvocation patternInvocation = (PatternInvocation) result1_black[0];
         return PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_2_expressionFB(patternInvocation);
      } else
      {

         Object[] result3_bindingAndBlack = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_bindingAndBlackFB(this);
         if (result3_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         PatternInvocation newPatternInvocation = (PatternInvocation) result3_bindingAndBlack[0];
         Object[] result3_green = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_greenBBFB(newPatternInvocation,
               this, node);
         Pattern newPattern = (Pattern) result3_green[2];

         // 
         PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_4_AttachPatternToResource_expressionBBB(this, node, newPattern);

         Object[] result5_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_5_InitializePattern_blackBB(newPattern, newPatternInvocation);
         if (result5_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[newPattern] = " + newPattern + ", " + "[newPatternInvocation] = "
                  + newPatternInvocation + ".");
         }
         PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_5_InitializePattern_greenBB(newPattern, newPatternInvocation);

         Object[] result6_black = PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_6_InitializePatternBody_blackB(newPattern);
         if (result6_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[newPattern] = " + newPattern + ".");
         }
         PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_6_InitializePatternBody_greenBF(newPattern);
         //nothing PatternBody newBody = (PatternBody) result6_green[1];

         // 
         PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_7_AddPatternInvocation_expressionBBB(this, node, newPatternInvocation);
         return PatternInvocationBuilderImpl.pattern_PatternInvocationBuilder_7_8_expressionFB(newPatternInvocation);
      }

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
      case ScopePackage.PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER:
         if (resolve)
            return getExpressionExplorer();
         return basicGetExpressionExplorer();
      case ScopePackage.PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER:
         if (resolve)
            return getPatternMatcher();
         return basicGetPatternMatcher();
      case ScopePackage.PATTERN_INVOCATION_BUILDER__SUFFIX:
         return getSuffix();
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
      case ScopePackage.PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER:
         setExpressionExplorer((ExpressionExplorer) newValue);
         return;
      case ScopePackage.PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER:
         setPatternMatcher((PatternMatcher) newValue);
         return;
      case ScopePackage.PATTERN_INVOCATION_BUILDER__SUFFIX:
         setSuffix((String) newValue);
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
      case ScopePackage.PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER:
         setExpressionExplorer((ExpressionExplorer) null);
         return;
      case ScopePackage.PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER:
         setPatternMatcher((PatternMatcher) null);
         return;
      case ScopePackage.PATTERN_INVOCATION_BUILDER__SUFFIX:
         setSuffix(SUFFIX_EDEFAULT);
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
      case ScopePackage.PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER:
         return expressionExplorer != null;
      case ScopePackage.PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER:
         return patternMatcher != null;
      case ScopePackage.PATTERN_INVOCATION_BUILDER__SUFFIX:
         return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
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
      case ScopePackage.PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN:
         attachToResource((CFNode) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case ScopePackage.PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION:
         return calculateAdornment((PatternInvocation) arguments.get(0));
      case ScopePackage.PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE:
         return calculatePatternName((CFNode) arguments.get(0));
      case ScopePackage.PATTERN_INVOCATION_BUILDER___CREATE_ACTION:
         return createAction();
      case ScopePackage.PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT:
         handlePatternMatcherReport((PatternInvocation) arguments.get(0), (ValidationReport) arguments.get(1));
         return null;
      case ScopePackage.PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER:
         return handleVariableReference((Variable) arguments.get(0), (EClassifier) arguments.get(1));
      case ScopePackage.PATTERN_INVOCATION_BUILDER___HAS_ERRORS:
         return hasErrors();
      case ScopePackage.PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE:
         return lookupAction((CFNode) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (suffix: ");
      result.append(suffix);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_PatternInvocationBuilder_4_1_LookupActivityNode_blackFBF(PatternInvocation invocation)
   {
      CFNode node = invocation.getCfNode();
      if (node != null)
      {
         ActivityNode activity = node.getOrigin();
         if (activity != null)
         {
            return new Object[] { activity, invocation, node };
         }

      }

      return null;
   }

   public static final Iterable<Object[]> pattern_PatternInvocationBuilder_4_2_SetErrorMessageLocation_blackFBB(ActivityNode activity, ValidationReport report)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ErrorMessage message : report.getErrorMessages())
      {
         _result.add(new Object[] { message, activity, report });
      }
      return _result;
   }

   public static final Object[] pattern_PatternInvocationBuilder_4_2_SetErrorMessageLocation_greenBB(ErrorMessage message, ActivityNode activity)
   {
      message.getLocation().add(activity);
      return new Object[] { message, activity };
   }

   public static final Object[] pattern_PatternInvocationBuilder_5_1_LookupPatternInvocation_blackBF(PatternInvocationBuilder _this)
   {
      Action tmpInvocation = _this.getResult();
      if (tmpInvocation instanceof PatternInvocation)
      {
         PatternInvocation invocation = (PatternInvocation) tmpInvocation;
         return new Object[] { _this, invocation };
      }

      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_bindingFBBBB(PatternInvocationBuilder _this,
         PatternInvocation invocation, Variable variable, EClassifier variableType)
   {
      String variable_name = variable.getName();
      CFVariable _localVariable_0 = _this.lookupControlFlowVariable(invocation, variable_name, variableType);
      CFVariable cfVariable = _localVariable_0;
      if (cfVariable != null)
      {
         return new Object[] { cfVariable, _this, invocation, variable, variableType };
      }

      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_blackB(CFVariable cfVariable)
   {
      return new Object[] { cfVariable };
   }

   public static final Object[] pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_bindingAndBlackFBBBB(PatternInvocationBuilder _this,
         PatternInvocation invocation, Variable variable, EClassifier variableType)
   {
      Object[] result_pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_binding = pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_bindingFBBBB(
            _this, invocation, variable, variableType);
      if (result_pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_binding != null)
      {
         CFVariable cfVariable = (CFVariable) result_pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_binding[0];

         Object[] result_pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_black = pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_blackB(
               cfVariable);
         if (result_pattern_PatternInvocationBuilder_5_2_LookupOrCreateControlFlowVariable_black != null)
         {

            return new Object[] { cfVariable, _this, invocation, variable, variableType };
         }
      }
      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_5_3_CreateVariableReference_blackBBB(PatternInvocation invocation, Variable variable,
         CFVariable cfVariable)
   {
      return new Object[] { invocation, variable, cfVariable };
   }

   public static final Object[] pattern_PatternInvocationBuilder_5_3_CreateVariableReference_greenBBFB(PatternInvocation invocation, Variable variable,
         CFVariable cfVariable)
   {
      VariableReference newReference = DemoclesFactory.eINSTANCE.createVariableReference();
      newReference.setInvocation(invocation);
      newReference.setFrom(cfVariable);
      newReference.setTo(variable);
      return new Object[] { invocation, variable, newReference, cfVariable };
   }

   public static final VariableReference pattern_PatternInvocationBuilder_5_4_expressionFB(VariableReference newReference)
   {
      VariableReference _result = newReference;
      return _result;
   }

   public static final Object[] pattern_PatternInvocationBuilder_6_1_Init_blackB(PatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_PatternInvocationBuilder_6_2_LookupValidationReport_bindingFB(PatternInvocationBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_6_2_LookupValidationReport_blackFB(ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_6_2_LookupValidationReport_bindingAndBlackFFB(PatternInvocationBuilder _this)
   {
      Object[] result_pattern_PatternInvocationBuilder_6_2_LookupValidationReport_binding = pattern_PatternInvocationBuilder_6_2_LookupValidationReport_bindingFB(
            _this);
      if (result_pattern_PatternInvocationBuilder_6_2_LookupValidationReport_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_PatternInvocationBuilder_6_2_LookupValidationReport_binding[0];

         Object[] result_pattern_PatternInvocationBuilder_6_2_LookupValidationReport_black = pattern_PatternInvocationBuilder_6_2_LookupValidationReport_blackFB(
               scopeValidator);
         if (result_pattern_PatternInvocationBuilder_6_2_LookupValidationReport_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_PatternInvocationBuilder_6_2_LookupValidationReport_black[0];

            return new Object[] { report, scopeValidator, _this };
         }
      }
      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_6_3_HasFatal_blackFB(ValidationReport report)
   {
      for (ErrorMessage fatal : report.getErrorMessages())
      {
         Severity fatal_severity = fatal.getSeverity();
         if (fatal_severity.equals(Severity.FATAL))
         {
            return new Object[] { fatal, report };
         }

      }
      return null;
   }

   public static final boolean pattern_PatternInvocationBuilder_6_4_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_PatternInvocationBuilder_6_5_HasError_blackBF(ValidationReport report)
   {
      for (ErrorMessage error : report.getErrorMessages())
      {
         Severity error_severity = error.getSeverity();
         if (error_severity.equals(Severity.ERROR))
         {
            return new Object[] { report, error };
         }

      }
      return null;
   }

   public static final boolean pattern_PatternInvocationBuilder_6_6_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_PatternInvocationBuilder_6_7_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_1_ResultAlreadyAvailable_blackFB(PatternInvocationBuilder _this)
   {
      Action tmpPatternInvocation = _this.getResult();
      if (tmpPatternInvocation instanceof PatternInvocation)
      {
         PatternInvocation patternInvocation = (PatternInvocation) tmpPatternInvocation;
         return new Object[] { patternInvocation, _this };
      }

      return null;
   }

   public static final PatternInvocation pattern_PatternInvocationBuilder_7_2_expressionFB(PatternInvocation patternInvocation)
   {
      PatternInvocation _result = patternInvocation;
      return _result;
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_bindingFB(PatternInvocationBuilder _this)
   {
      PatternInvocation _localVariable_0 = _this.createAction();
      PatternInvocation newPatternInvocation = _localVariable_0;
      if (newPatternInvocation != null)
      {
         return new Object[] { newPatternInvocation, _this };
      }
      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_blackBB(PatternInvocation newPatternInvocation,
         PatternInvocationBuilder _this)
   {
      return new Object[] { newPatternInvocation, _this };
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_bindingAndBlackFB(PatternInvocationBuilder _this)
   {
      Object[] result_pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_binding = pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_bindingFB(
            _this);
      if (result_pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_binding != null)
      {
         PatternInvocation newPatternInvocation = (PatternInvocation) result_pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_binding[0];

         Object[] result_pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_black = pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_blackBB(
               newPatternInvocation, _this);
         if (result_pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_black != null)
         {

            return new Object[] { newPatternInvocation, _this };
         }
      }
      return null;
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_3_CreatePatternInvocation_greenBBFB(PatternInvocation newPatternInvocation,
         PatternInvocationBuilder _this, CFNode node)
   {
      Pattern newPattern = SpecificationFactory.eINSTANCE.createPattern();
      _this.setResult(newPatternInvocation);
      String _localVariable_0 = _this.calculatePatternName(node);
      String newPattern_name_prime = _localVariable_0;
      newPattern.setName(newPattern_name_prime);
      return new Object[] { newPatternInvocation, _this, newPattern, node };
   }

   public static final void pattern_PatternInvocationBuilder_7_4_AttachPatternToResource_expressionBBB(PatternInvocationBuilder _this, CFNode node,
         Pattern newPattern)
   {
      _this.attachToResource(node, newPattern);

   }

   public static final Object[] pattern_PatternInvocationBuilder_7_5_InitializePattern_blackBB(Pattern newPattern, PatternInvocation newPatternInvocation)
   {
      return new Object[] { newPattern, newPatternInvocation };
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_5_InitializePattern_greenBB(Pattern newPattern, PatternInvocation newPatternInvocation)
   {
      newPatternInvocation.setPattern(newPattern);
      return new Object[] { newPattern, newPatternInvocation };
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_6_InitializePatternBody_blackB(Pattern newPattern)
   {
      return new Object[] { newPattern };
   }

   public static final Object[] pattern_PatternInvocationBuilder_7_6_InitializePatternBody_greenBF(Pattern newPattern)
   {
      PatternBody newBody = SpecificationFactory.eINSTANCE.createPatternBody();
      newBody.setHeader(newPattern);
      return new Object[] { newPattern, newBody };
   }

   public static final void pattern_PatternInvocationBuilder_7_7_AddPatternInvocation_expressionBBB(PatternInvocationBuilder _this, CFNode node,
         PatternInvocation newPatternInvocation)
   {
      _this.addAction(node, newPatternInvocation);

   }

   public static final PatternInvocation pattern_PatternInvocationBuilder_7_8_expressionFB(PatternInvocation newPatternInvocation)
   {
      PatternInvocation _result = newPatternInvocation;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //PatternInvocationBuilderImpl
