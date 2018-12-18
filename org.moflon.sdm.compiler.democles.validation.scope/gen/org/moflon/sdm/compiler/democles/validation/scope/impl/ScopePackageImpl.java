/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.expressions.ExpressionsPackage;

import SDMLanguage.patterns.PatternsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gervarro.democles.specification.emf.SpecificationPackage;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage;

import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage;

import org.moflon.sdm.compiler.democles.pattern.PatternPackage;

import org.moflon.sdm.compiler.democles.validation.result.ResultPackage;

import org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer;
import org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeFactory;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;
import org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder;

import org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverPackage;

import org.moflon.sdm.runtime.democles.DemoclesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopePackageImpl extends EPackageImpl implements ScopePackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass bindingExpressionBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass redNodeDeletionBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass nacPatternBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass redPatternBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass bindingAndBlackPatternBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass blackPatternBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass actionBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass scopeValidatorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass compoundPatternInvocationBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass regularPatternInvocationBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass patternMatcherEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass singleResultPatternInvocationBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass patternInvocationBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass storyNodeActionBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass compoundActionBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass greenPatternBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass expressionExplorerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum errorsEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ScopePackageImpl()
   {
      super(eNS_URI, ScopeFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link ScopePackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ScopePackage init()
   {
      if (isInited)
         return (ScopePackage) EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI);

      // Obtain or create and register package
      ScopePackageImpl theScopePackage = (ScopePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScopePackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new ScopePackageImpl());

      isInited = true;

      // Initialize simple dependencies
      SpecificationPackage.eINSTANCE.eClass();
      EMFTypePackage.eINSTANCE.eClass();
      RelationalConstraintPackage.eINSTANCE.eClass();
      SDMLanguagePackage.eINSTANCE.eClass();
      DemoclesPackage.eINSTANCE.eClass();
      ResultPackage.eINSTANCE.eClass();
      PatternPackage.eINSTANCE.eClass();
      LiteralexpressionsolverPackage.eINSTANCE.eClass();
      MocaTreePackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theScopePackage.createPackageContents();

      // Initialize created meta-data
      theScopePackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theScopePackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ScopePackage.eNS_URI, theScopePackage);
      return theScopePackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBindingExpressionBuilder()
   {
      return bindingExpressionBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingExpressionBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern()
   {
      return bindingExpressionBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingExpressionBuilder__CreateAction()
   {
      return bindingExpressionBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingExpressionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable()
   {
      return bindingExpressionBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRedNodeDeletionBuilder()
   {
      return redNodeDeletionBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRedNodeDeletionBuilder__BuildAction__CFNode()
   {
      return redNodeDeletionBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRedNodeDeletionBuilder__LookupAction__CFNode()
   {
      return redNodeDeletionBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRedNodeDeletionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable()
   {
      return redNodeDeletionBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNacPatternBuilder()
   {
      return nacPatternBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNacPatternBuilder_NacPatternCounter()
   {
      return (EAttribute) nacPatternBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__AttachToResource__Pattern_Pattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__CreateAllBoundAdornment__Pattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__CreateNacPatternNameAndIncrementCounter__Pattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__EmbedNacPattern__Pattern_PatternInvocationConstraint_Pattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__ExploreNacPatternVariables__ObjectVariable_Pattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable()
   {
      return nacPatternBuilderEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__HandleSimpleNacPattern__StoryPattern_Pattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__LookupAction__CFNode()
   {
      return nacPatternBuilderEClass.getEOperations().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternBuilder__PostprocessPatternInterface__StoryPattern()
   {
      return nacPatternBuilderEClass.getEOperations().get(10);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRedPatternBuilder()
   {
      return redPatternBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRedPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable()
   {
      return redPatternBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRedPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern()
   {
      return redPatternBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBindingAndBlackPatternBuilder()
   {
      return bindingAndBlackPatternBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBindingAndBlackPatternBuilder_BlackPatternBuilder()
   {
      return (EReference) bindingAndBlackPatternBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__BuildAction__CFNode()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__BuildActionInSuperClass__CFNode()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__CalculateNextAdornment__Pattern_Adornment_PatternInvocationConstraint()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__CalculatePatternInvocationAdornment__Pattern_Adornment_PatternInvocationConstraint()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__ConstructEmbeddedPattern__RegularPatternInvocationBuilder_StoryPattern_Pattern()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__IsVariableToAdd__ObjectVariable()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__ProcessChildPattern__RegularPatternInvocationBuilder_RegularPatternInvocation_StoryPattern_Adornment()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingAndBlackPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable()
   {
      return bindingAndBlackPatternBuilderEClass.getEOperations().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBlackPatternBuilder()
   {
      return blackPatternBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern()
   {
      return blackPatternBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackPatternBuilder__AnalyzeDependenciesInSuperclass__PatternInvocationBuilder_StoryPattern_Pattern()
   {
      return blackPatternBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern()
   {
      return blackPatternBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackPatternBuilder__BuildPatternContentInSuperclass__RegularPatternInvocation_StoryPattern()
   {
      return blackPatternBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getActionBuilder()
   {
      return actionBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getActionBuilder_Validator()
   {
      return (EReference) actionBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getActionBuilder_Parent()
   {
      return (EReference) actionBuilderEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getActionBuilder_Result()
   {
      return (EReference) actionBuilderEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getActionBuilder__AddAction__CFNode_Action()
   {
      return actionBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getActionBuilder__BuildAction__CFNode()
   {
      return actionBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getActionBuilder__LookupAction__CFNode()
   {
      return actionBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getActionBuilder__LookupControlFlowVariable__Action_String_EClassifier()
   {
      return actionBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getActionBuilder__LookupScopeValidator()
   {
      return actionBuilderEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getActionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable()
   {
      return actionBuilderEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getScopeValidator()
   {
      return scopeValidatorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScopeValidator_ValidationReport()
   {
      return (EReference) scopeValidatorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScopeValidator_ActionBuilders()
   {
      return (EReference) scopeValidatorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__AnalyzeLinkVariable__CFNode_LinkVariable()
   {
      return scopeValidatorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__AnalyzeObjectVariable__CFNode_ObjectVariable()
   {
      return scopeValidatorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__CheckDeletionOfBoundVariable__ObjectVariable_CFVariable_CFNode_CFNode()
   {
      return scopeValidatorEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__CheckRedBoundVariable__CFVariable_Scope_ObjectVariable()
   {
      return scopeValidatorEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__FollowsInSameScope__CFNode_CFNode()
   {
      return scopeValidatorEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__IsNull__CFVariable()
   {
      return scopeValidatorEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__LookupControlFlowVariable__CFNode_String()
   {
      return scopeValidatorEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__LookupErrorMessage__Errors()
   {
      return scopeValidatorEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__VisitNode__CFNode()
   {
      return scopeValidatorEClass.getEOperations().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScopeValidator__VisitScope__Scope()
   {
      return scopeValidatorEClass.getEOperations().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompoundPatternInvocationBuilder()
   {
      return compoundPatternInvocationBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompoundPatternInvocationBuilder_ChildBuilders()
   {
      return (EReference) compoundPatternInvocationBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRegularPatternInvocationBuilder()
   {
      return regularPatternInvocationBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRegularPatternInvocationBuilder_ParentBuilder()
   {
      return (EReference) regularPatternInvocationBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRegularPatternInvocationBuilder_PatternTransformer()
   {
      return (EReference) regularPatternInvocationBuilderEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRegularPatternInvocationBuilder_MainActionBuilder()
   {
      return (EAttribute) regularPatternInvocationBuilderEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__BuildAction__CFNode()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__BuildPatternInterface__CFNode_StoryPattern()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__CreateAction()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__ExploreAttributeAssignments__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__ExploreAttributeConstraints__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__GetPatternInvocationBuilder()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__HandleVariableReferenceInSuperclass__Variable_EClassifier()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(10);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__IsVariableToAdd__ObjectVariable()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(11);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__LookupScopeValidator()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(12);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__PostprocessPatternInterface__StoryPattern()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(13);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocationBuilder__TransformPattern__StoryPattern_Pattern()
   {
      return regularPatternInvocationBuilderEClass.getEOperations().get(14);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPatternMatcher()
   {
      return patternMatcherEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPatternMatcher_ValidationReport()
   {
      return (EReference) patternMatcherEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternMatcher__GenerateSearchPlan__Pattern_Adornment_boolean()
   {
      return patternMatcherEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSingleResultPatternInvocationBuilder()
   {
      return singleResultPatternInvocationBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSingleResultPatternInvocationBuilder_PatternVariableHandler()
   {
      return (EReference) singleResultPatternInvocationBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSingleResultPatternInvocationBuilder__BuildAction__CFNode()
   {
      return singleResultPatternInvocationBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSingleResultPatternInvocationBuilder__BuildAction__CFNode_Expression_EOperation()
   {
      return singleResultPatternInvocationBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSingleResultPatternInvocationBuilder__CreateAction()
   {
      return singleResultPatternInvocationBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPatternInvocationBuilder()
   {
      return patternInvocationBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPatternInvocationBuilder_ExpressionExplorer()
   {
      return (EReference) patternInvocationBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPatternInvocationBuilder_PatternMatcher()
   {
      return (EReference) patternInvocationBuilderEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPatternInvocationBuilder_Suffix()
   {
      return (EAttribute) patternInvocationBuilderEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__AttachToResource__CFNode_Pattern()
   {
      return patternInvocationBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__CalculateAdornment__PatternInvocation()
   {
      return patternInvocationBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__CalculatePatternName__CFNode()
   {
      return patternInvocationBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__CreateAction()
   {
      return patternInvocationBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__HandlePatternMatcherReport__PatternInvocation_ValidationReport()
   {
      return patternInvocationBuilderEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier()
   {
      return patternInvocationBuilderEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__HasErrors()
   {
      return patternInvocationBuilderEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocationBuilder__LookupAction__CFNode()
   {
      return patternInvocationBuilderEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStoryNodeActionBuilder()
   {
      return storyNodeActionBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStoryNodeActionBuilder_RequiresForEach()
   {
      return (EAttribute) storyNodeActionBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getStoryNodeActionBuilder__BuildAction__CFNode()
   {
      return storyNodeActionBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompoundActionBuilder()
   {
      return compoundActionBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompoundActionBuilder_Children()
   {
      return (EReference) compoundActionBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGreenPatternBuilder()
   {
      return greenPatternBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getGreenPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable()
   {
      return greenPatternBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExpressionExplorer()
   {
      return expressionExplorerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExpressionExplorer_ExpressionTransformer()
   {
      return (EReference) expressionExplorerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExpressionExplorer__ExploreExpression__PatternInvocationBuilder_Pattern_Expression()
   {
      return expressionExplorerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExpressionExplorer__HandleSymbolicParameter__PatternInvocationBuilder_Pattern_String_EClassifier()
   {
      return expressionExplorerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getErrors()
   {
      return errorsEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeFactory getScopeFactory()
   {
      return (ScopeFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      bindingExpressionBuilderEClass = createEClass(BINDING_EXPRESSION_BUILDER);
      createEOperation(bindingExpressionBuilderEClass, BINDING_EXPRESSION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);
      createEOperation(bindingExpressionBuilderEClass, BINDING_EXPRESSION_BUILDER___CREATE_ACTION);
      createEOperation(bindingExpressionBuilderEClass, BINDING_EXPRESSION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE);

      redNodeDeletionBuilderEClass = createEClass(RED_NODE_DELETION_BUILDER);
      createEOperation(redNodeDeletionBuilderEClass, RED_NODE_DELETION_BUILDER___BUILD_ACTION__CFNODE);
      createEOperation(redNodeDeletionBuilderEClass, RED_NODE_DELETION_BUILDER___LOOKUP_ACTION__CFNODE);
      createEOperation(redNodeDeletionBuilderEClass, RED_NODE_DELETION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE);

      nacPatternBuilderEClass = createEClass(NAC_PATTERN_BUILDER);
      createEAttribute(nacPatternBuilderEClass, NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___ATTACH_TO_RESOURCE__PATTERN_PATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___CREATE_ALL_BOUND_ADORNMENT__PATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___CREATE_NAC_PATTERN_NAME_AND_INCREMENT_COUNTER__PATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___EMBED_NAC_PATTERN__PATTERN_PATTERNINVOCATIONCONSTRAINT_PATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___EXPLORE_NAC_PATTERN_VARIABLES__OBJECTVARIABLE_PATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___HANDLE_SIMPLE_NAC_PATTERN__STORYPATTERN_PATTERN);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE);
      createEOperation(nacPatternBuilderEClass, NAC_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN);

      redPatternBuilderEClass = createEClass(RED_PATTERN_BUILDER);
      createEOperation(redPatternBuilderEClass, RED_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE);
      createEOperation(redPatternBuilderEClass, RED_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);

      bindingAndBlackPatternBuilderEClass = createEClass(BINDING_AND_BLACK_PATTERN_BUILDER);
      createEReference(bindingAndBlackPatternBuilderEClass, BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER);
      createEOperation(bindingAndBlackPatternBuilderEClass,
            BINDING_AND_BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);
      createEOperation(bindingAndBlackPatternBuilderEClass, BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION__CFNODE);
      createEOperation(bindingAndBlackPatternBuilderEClass, BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION_IN_SUPER_CLASS__CFNODE);
      createEOperation(bindingAndBlackPatternBuilderEClass, BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN);
      createEOperation(bindingAndBlackPatternBuilderEClass,
            BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_NEXT_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT);
      createEOperation(bindingAndBlackPatternBuilderEClass,
            BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_PATTERN_INVOCATION_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT);
      createEOperation(bindingAndBlackPatternBuilderEClass,
            BINDING_AND_BLACK_PATTERN_BUILDER___CONSTRUCT_EMBEDDED_PATTERN__REGULARPATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);
      createEOperation(bindingAndBlackPatternBuilderEClass, BINDING_AND_BLACK_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);
      createEOperation(bindingAndBlackPatternBuilderEClass,
            BINDING_AND_BLACK_PATTERN_BUILDER___PROCESS_CHILD_PATTERN__REGULARPATTERNINVOCATIONBUILDER_REGULARPATTERNINVOCATION_STORYPATTERN_ADORNMENT);
      createEOperation(bindingAndBlackPatternBuilderEClass, BINDING_AND_BLACK_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE);

      blackPatternBuilderEClass = createEClass(BLACK_PATTERN_BUILDER);
      createEOperation(blackPatternBuilderEClass, BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);
      createEOperation(blackPatternBuilderEClass, BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES_IN_SUPERCLASS__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);
      createEOperation(blackPatternBuilderEClass, BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN);
      createEOperation(blackPatternBuilderEClass, BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT_IN_SUPERCLASS__REGULARPATTERNINVOCATION_STORYPATTERN);

      actionBuilderEClass = createEClass(ACTION_BUILDER);
      createEReference(actionBuilderEClass, ACTION_BUILDER__VALIDATOR);
      createEReference(actionBuilderEClass, ACTION_BUILDER__PARENT);
      createEReference(actionBuilderEClass, ACTION_BUILDER__RESULT);
      createEOperation(actionBuilderEClass, ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION);
      createEOperation(actionBuilderEClass, ACTION_BUILDER___BUILD_ACTION__CFNODE);
      createEOperation(actionBuilderEClass, ACTION_BUILDER___LOOKUP_ACTION__CFNODE);
      createEOperation(actionBuilderEClass, ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER);
      createEOperation(actionBuilderEClass, ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR);
      createEOperation(actionBuilderEClass, ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE);

      scopeValidatorEClass = createEClass(SCOPE_VALIDATOR);
      createEReference(scopeValidatorEClass, SCOPE_VALIDATOR__VALIDATION_REPORT);
      createEReference(scopeValidatorEClass, SCOPE_VALIDATOR__ACTION_BUILDERS);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___ANALYZE_LINK_VARIABLE__CFNODE_LINKVARIABLE);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___ANALYZE_OBJECT_VARIABLE__CFNODE_OBJECTVARIABLE);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___CHECK_DELETION_OF_BOUND_VARIABLE__OBJECTVARIABLE_CFVARIABLE_CFNODE_CFNODE);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___CHECK_RED_BOUND_VARIABLE__CFVARIABLE_SCOPE_OBJECTVARIABLE);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___FOLLOWS_IN_SAME_SCOPE__CFNODE_CFNODE);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___IS_NULL__CFVARIABLE);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___LOOKUP_CONTROL_FLOW_VARIABLE__CFNODE_STRING);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___VISIT_NODE__CFNODE);
      createEOperation(scopeValidatorEClass, SCOPE_VALIDATOR___VISIT_SCOPE__SCOPE);

      compoundPatternInvocationBuilderEClass = createEClass(COMPOUND_PATTERN_INVOCATION_BUILDER);
      createEReference(compoundPatternInvocationBuilderEClass, COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS);

      regularPatternInvocationBuilderEClass = createEClass(REGULAR_PATTERN_INVOCATION_BUILDER);
      createEReference(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER);
      createEReference(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER);
      createEAttribute(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER);
      createEOperation(regularPatternInvocationBuilderEClass,
            REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE);
      createEOperation(regularPatternInvocationBuilderEClass,
            REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION);
      createEOperation(regularPatternInvocationBuilderEClass,
            REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN);
      createEOperation(regularPatternInvocationBuilderEClass,
            REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER);
      createEOperation(regularPatternInvocationBuilderEClass,
            REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER);
      createEOperation(regularPatternInvocationBuilderEClass,
            REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN);
      createEOperation(regularPatternInvocationBuilderEClass, REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN);

      patternMatcherEClass = createEClass(PATTERN_MATCHER);
      createEReference(patternMatcherEClass, PATTERN_MATCHER__VALIDATION_REPORT);
      createEOperation(patternMatcherEClass, PATTERN_MATCHER___GENERATE_SEARCH_PLAN__PATTERN_ADORNMENT_BOOLEAN);

      singleResultPatternInvocationBuilderEClass = createEClass(SINGLE_RESULT_PATTERN_INVOCATION_BUILDER);
      createEReference(singleResultPatternInvocationBuilderEClass, SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER);
      createEOperation(singleResultPatternInvocationBuilderEClass, SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE);
      createEOperation(singleResultPatternInvocationBuilderEClass, SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE_EXPRESSION_EOPERATION);
      createEOperation(singleResultPatternInvocationBuilderEClass, SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___CREATE_ACTION);

      patternInvocationBuilderEClass = createEClass(PATTERN_INVOCATION_BUILDER);
      createEReference(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER);
      createEReference(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER);
      createEAttribute(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER__SUFFIX);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___CREATE_ACTION);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___HAS_ERRORS);
      createEOperation(patternInvocationBuilderEClass, PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE);

      storyNodeActionBuilderEClass = createEClass(STORY_NODE_ACTION_BUILDER);
      createEAttribute(storyNodeActionBuilderEClass, STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH);
      createEOperation(storyNodeActionBuilderEClass, STORY_NODE_ACTION_BUILDER___BUILD_ACTION__CFNODE);

      compoundActionBuilderEClass = createEClass(COMPOUND_ACTION_BUILDER);
      createEReference(compoundActionBuilderEClass, COMPOUND_ACTION_BUILDER__CHILDREN);

      greenPatternBuilderEClass = createEClass(GREEN_PATTERN_BUILDER);
      createEOperation(greenPatternBuilderEClass, GREEN_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE);

      expressionExplorerEClass = createEClass(EXPRESSION_EXPLORER);
      createEReference(expressionExplorerEClass, EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER);
      createEOperation(expressionExplorerEClass, EXPRESSION_EXPLORER___EXPLORE_EXPRESSION__PATTERNINVOCATIONBUILDER_PATTERN_EXPRESSION);
      createEOperation(expressionExplorerEClass, EXPRESSION_EXPLORER___HANDLE_SYMBOLIC_PARAMETER__PATTERNINVOCATIONBUILDER_PATTERN_STRING_ECLASSIFIER);

      // Create enums
      errorsEEnum = createEEnum(ERRORS);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      PatternsPackage thePatternsPackage = (PatternsPackage) EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
      SpecificationPackage theSpecificationPackage = (SpecificationPackage) EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);
      DemoclesPackage theDemoclesPackage = (DemoclesPackage) EPackage.Registry.INSTANCE.getEPackage(DemoclesPackage.eNS_URI);
      ResultPackage theResultPackage = (ResultPackage) EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);
      PatternPackage thePatternPackage = (PatternPackage) EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
      ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      bindingExpressionBuilderEClass.getESuperTypes().add(this.getRegularPatternInvocationBuilder());
      redNodeDeletionBuilderEClass.getESuperTypes().add(this.getActionBuilder());
      nacPatternBuilderEClass.getESuperTypes().add(this.getRegularPatternInvocationBuilder());
      redPatternBuilderEClass.getESuperTypes().add(this.getRegularPatternInvocationBuilder());
      bindingAndBlackPatternBuilderEClass.getESuperTypes().add(this.getCompoundPatternInvocationBuilder());
      blackPatternBuilderEClass.getESuperTypes().add(this.getCompoundPatternInvocationBuilder());
      scopeValidatorEClass.getESuperTypes().add(theDemoclesPackage.getUniformNoOperationVisitor());
      compoundPatternInvocationBuilderEClass.getESuperTypes().add(this.getRegularPatternInvocationBuilder());
      regularPatternInvocationBuilderEClass.getESuperTypes().add(this.getPatternInvocationBuilder());
      singleResultPatternInvocationBuilderEClass.getESuperTypes().add(this.getPatternInvocationBuilder());
      patternInvocationBuilderEClass.getESuperTypes().add(this.getActionBuilder());
      storyNodeActionBuilderEClass.getESuperTypes().add(this.getCompoundActionBuilder());
      compoundActionBuilderEClass.getESuperTypes().add(this.getActionBuilder());
      greenPatternBuilderEClass.getESuperTypes().add(this.getRegularPatternInvocationBuilder());

      // Initialize classes, features, and operations; add parameters
      initEClass(bindingExpressionBuilderEClass, BindingExpressionBuilder.class, "BindingExpressionBuilder", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      EOperation op = initEOperation(getBindingExpressionBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern(), null,
            "analyzeDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "patternInvocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getBindingExpressionBuilder__CreateAction(), theDemoclesPackage.getBindingPatternInvocation(), "createAction", 0, 1, IS_UNIQUE,
            IS_ORDERED);

      op = initEOperation(getBindingExpressionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable(), null, "validateVariable", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(redNodeDeletionBuilderEClass, RedNodeDeletionBuilder.class, "RedNodeDeletionBuilder", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getRedNodeDeletionBuilder__BuildAction__CFNode(), null, "buildAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRedNodeDeletionBuilder__LookupAction__CFNode(), theDemoclesPackage.getNodeDeletion(), "lookupAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRedNodeDeletionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable(), null, "validateVariable", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(nacPatternBuilderEClass, NacPatternBuilder.class, "NacPatternBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getNacPatternBuilder_NacPatternCounter(), ecorePackage.getEInt(), "nacPatternCounter", null, 1, 1, NacPatternBuilder.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern(), null, "analyzeDependencies", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "invocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__AttachToResource__Pattern_Pattern(), null, "attachToResource", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "nacPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern(), null, "buildPatternContent", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getRegularPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__CreateAllBoundAdornment__Pattern(), theDemoclesPackage.getAdornment(), "createAllBoundAdornment", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__CreateNacPatternNameAndIncrementCounter__Pattern(), ecorePackage.getEString(),
            "createNacPatternNameAndIncrementCounter", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__EmbedNacPattern__Pattern_PatternInvocationConstraint_Pattern(), null, "embedNacPattern", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPatternInvocationConstraint(), "patternInvocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "nacPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__ExploreNacPatternVariables__ObjectVariable_Pattern(), null, "exploreNacPatternVariables", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "nacPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable(), null, "handleRelevantObjectVariable", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__HandleSimpleNacPattern__StoryPattern_Pattern(), null, "handleSimpleNacPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__LookupAction__CFNode(), theDemoclesPackage.getPatternInvocation(), "lookupAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternBuilder__PostprocessPatternInterface__StoryPattern(), null, "postprocessPatternInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(redPatternBuilderEClass, RedPatternBuilder.class, "RedPatternBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getRedPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable(), null, "validateVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRedPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern(), null, "analyzeDependencies", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "patternInvocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(bindingAndBlackPatternBuilderEClass, BindingAndBlackPatternBuilder.class, "BindingAndBlackPatternBuilder", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBindingAndBlackPatternBuilder_BlackPatternBuilder(), this.getBlackPatternBuilder(), null, "blackPatternBuilder", null, 1, 1,
            BindingAndBlackPatternBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern(), null, "analyzeDependencies",
            0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "patternInvocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__BuildAction__CFNode(), null, "buildAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__BuildActionInSuperClass__CFNode(), null, "buildActionInSuperClass", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern(), null, "buildPatternContent", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getRegularPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__CalculateNextAdornment__Pattern_Adornment_PatternInvocationConstraint(),
            theDemoclesPackage.getAdornment(), "calculateNextAdornment", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAdornment(), "adornment", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPatternInvocationConstraint(), "patternInvocationConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__CalculatePatternInvocationAdornment__Pattern_Adornment_PatternInvocationConstraint(),
            theDemoclesPackage.getAdornment(), "calculatePatternInvocationAdornment", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAdornment(), "adornment", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPatternInvocationConstraint(), "patternInvocationConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__ConstructEmbeddedPattern__RegularPatternInvocationBuilder_StoryPattern_Pattern(), null,
            "constructEmbeddedPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getRegularPatternInvocationBuilder(), "patternBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(
            getBindingAndBlackPatternBuilder__ProcessChildPattern__RegularPatternInvocationBuilder_RegularPatternInvocation_StoryPattern_Adornment(),
            theDemoclesPackage.getAdornment(), "processChildPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getRegularPatternInvocationBuilder(), "childPatternBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getRegularPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAdornment(), "adornment", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingAndBlackPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable(), null, "validateVariable", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(blackPatternBuilderEClass, BlackPatternBuilder.class, "BlackPatternBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern(), null, "analyzeDependencies", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "invocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackPatternBuilder__AnalyzeDependenciesInSuperclass__PatternInvocationBuilder_StoryPattern_Pattern(), null,
            "analyzeDependenciesInSuperclass", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "invocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern(), null, "buildPatternContent", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getRegularPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackPatternBuilder__BuildPatternContentInSuperclass__RegularPatternInvocation_StoryPattern(), null,
            "buildPatternContentInSuperclass", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getRegularPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(actionBuilderEClass, ActionBuilder.class, "ActionBuilder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getActionBuilder_Validator(), this.getScopeValidator(), this.getScopeValidator_ActionBuilders(), "validator", null, 1, 1,
            ActionBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
      initEReference(getActionBuilder_Parent(), this.getCompoundActionBuilder(), this.getCompoundActionBuilder_Children(), "parent", null, 0, 1,
            ActionBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
      initEReference(getActionBuilder_Result(), theDemoclesPackage.getAction(), null, "result", null, 0, 1, ActionBuilder.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getActionBuilder__AddAction__CFNode_Action(), null, "addAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "newAction", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getActionBuilder__BuildAction__CFNode(), null, "buildAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getActionBuilder__LookupAction__CFNode(), theDemoclesPackage.getAction(), "lookupAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getActionBuilder__LookupControlFlowVariable__Action_String_EClassifier(), theDemoclesPackage.getCFVariable(),
            "lookupControlFlowVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "variableType", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getActionBuilder__LookupScopeValidator(), this.getScopeValidator(), "lookupScopeValidator", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getActionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable(), null, "validateVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(scopeValidatorEClass, ScopeValidator.class, "ScopeValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getScopeValidator_ValidationReport(), theResultPackage.getValidationReport(), null, "validationReport", null, 0, 1, ScopeValidator.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getScopeValidator_ActionBuilders(), this.getActionBuilder(), this.getActionBuilder_Validator(), "actionBuilders", null, 0, -1,
            ScopeValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

      op = initEOperation(getScopeValidator__AnalyzeLinkVariable__CFNode_LinkVariable(), null, "analyzeLinkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__AnalyzeObjectVariable__CFNode_ObjectVariable(), null, "analyzeObjectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__CheckDeletionOfBoundVariable__ObjectVariable_CFVariable_CFNode_CFNode(), null, "checkDeletionOfBoundVariable", 0,
            1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "deletionNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__CheckRedBoundVariable__CFVariable_Scope_ObjectVariable(), null, "checkRedBoundVariable", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objVar", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__FollowsInSameScope__CFNode_CFNode(), ecorePackage.getEBoolean(), "followsInSameScope", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "deletionNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__IsNull__CFVariable(), ecorePackage.getEBoolean(), "isNull", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__LookupControlFlowVariable__CFNode_String(), theDemoclesPackage.getCFVariable(), "lookupControlFlowVariable", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__LookupErrorMessage__Errors(), ecorePackage.getEString(), "lookupErrorMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getErrors(), "errorID", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__VisitNode__CFNode(), null, "visitNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getScopeValidator__VisitScope__Scope(), null, "visitScope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(compoundPatternInvocationBuilderEClass, CompoundPatternInvocationBuilder.class, "CompoundPatternInvocationBuilder", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompoundPatternInvocationBuilder_ChildBuilders(), this.getRegularPatternInvocationBuilder(),
            this.getRegularPatternInvocationBuilder_ParentBuilder(), "childBuilders", null, 0, -1, CompoundPatternInvocationBuilder.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(regularPatternInvocationBuilderEClass, RegularPatternInvocationBuilder.class, "RegularPatternInvocationBuilder", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRegularPatternInvocationBuilder_ParentBuilder(), this.getCompoundPatternInvocationBuilder(),
            this.getCompoundPatternInvocationBuilder_ChildBuilders(), "parentBuilder", null, 0, 1, RegularPatternInvocationBuilder.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getRegularPatternInvocationBuilder_PatternTransformer(), thePatternPackage.getPatternTransformer(), null, "patternTransformer", null, 1, 1,
            RegularPatternInvocationBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
      initEAttribute(getRegularPatternInvocationBuilder_MainActionBuilder(), ecorePackage.getEBoolean(), "mainActionBuilder", null, 1, 1,
            RegularPatternInvocationBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern(), null, "analyzeDependencies",
            0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "patternInvocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__BuildAction__CFNode(), null, "buildAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern(), null, "buildPatternContent", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getRegularPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__BuildPatternInterface__CFNode_StoryPattern(), null, "buildPatternInterface", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getRegularPatternInvocationBuilder__CreateAction(), theDemoclesPackage.getRegularPatternInvocation(), "createAction", 0, 1, IS_UNIQUE,
            IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__ExploreAttributeAssignments__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern(),
            null, "exploreAttributeAssignments", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "invocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExpressionExplorer(), "expressionExplorer", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__ExploreAttributeConstraints__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern(),
            null, "exploreAttributeConstraints", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "invocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExpressionExplorer(), "expressionExplorer", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getRegularPatternInvocationBuilder__GetPatternInvocationBuilder(), this.getRegularPatternInvocationBuilder(),
            "getPatternInvocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable(), null,
            "handleRelevantObjectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier(), theDemoclesPackage.getVariableReference(),
            "handleVariableReference", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "variableType", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__HandleVariableReferenceInSuperclass__Variable_EClassifier(),
            theDemoclesPackage.getVariableReference(), "handleVariableReferenceInSuperclass", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "variableType", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getRegularPatternInvocationBuilder__LookupScopeValidator(), this.getScopeValidator(), "lookupScopeValidator", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__PostprocessPatternInterface__StoryPattern(), null, "postprocessPatternInterface", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRegularPatternInvocationBuilder__TransformPattern__StoryPattern_Pattern(), null, "transformPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "democlesPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(patternMatcherEClass, PatternMatcher.class, "PatternMatcher", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPatternMatcher_ValidationReport(), theResultPackage.getValidationReport(), null, "validationReport", null, 0, 1, PatternMatcher.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getPatternMatcher__GenerateSearchPlan__Pattern_Adornment_boolean(), theResultPackage.getValidationReport(), "generateSearchPlan", 0,
            1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAdornment(), "adornment", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "isMultipleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(singleResultPatternInvocationBuilderEClass, SingleResultPatternInvocationBuilder.class, "SingleResultPatternInvocationBuilder", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSingleResultPatternInvocationBuilder_PatternVariableHandler(), thePatternPackage.getPatternVariableHandler(), null,
            "patternVariableHandler", null, 1, 1, SingleResultPatternInvocationBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getSingleResultPatternInvocationBuilder__BuildAction__CFNode(), null, "buildAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getSingleResultPatternInvocationBuilder__BuildAction__CFNode_Expression_EOperation(), null, "buildAction", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEOperation(), "eOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getSingleResultPatternInvocationBuilder__CreateAction(), theDemoclesPackage.getSingleResultPatternInvocation(), "createAction", 0, 1,
            IS_UNIQUE, IS_ORDERED);

      initEClass(patternInvocationBuilderEClass, PatternInvocationBuilder.class, "PatternInvocationBuilder", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPatternInvocationBuilder_ExpressionExplorer(), this.getExpressionExplorer(), null, "expressionExplorer", null, 0, 1,
            PatternInvocationBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
      initEReference(getPatternInvocationBuilder_PatternMatcher(), this.getPatternMatcher(), null, "patternMatcher", null, 0, 1, PatternInvocationBuilder.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getPatternInvocationBuilder_Suffix(), ecorePackage.getEString(), "suffix", null, 1, 1, PatternInvocationBuilder.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getPatternInvocationBuilder__AttachToResource__CFNode_Pattern(), null, "attachToResource", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternInvocationBuilder__CalculateAdornment__PatternInvocation(), theDemoclesPackage.getAdornment(), "calculateAdornment", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternInvocationBuilder__CalculatePatternName__CFNode(), ecorePackage.getEString(), "calculatePatternName", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getPatternInvocationBuilder__CreateAction(), theDemoclesPackage.getPatternInvocation(), "createAction", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternInvocationBuilder__HandlePatternMatcherReport__PatternInvocation_ValidationReport(), null, "handlePatternMatcherReport", 0,
            1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getPatternInvocation(), "invocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theResultPackage.getValidationReport(), "report", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier(), theDemoclesPackage.getVariableReference(),
            "handleVariableReference", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "variableType", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getPatternInvocationBuilder__HasErrors(), ecorePackage.getEBoolean(), "hasErrors", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternInvocationBuilder__LookupAction__CFNode(), theDemoclesPackage.getPatternInvocation(), "lookupAction", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(storyNodeActionBuilderEClass, StoryNodeActionBuilder.class, "StoryNodeActionBuilder", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStoryNodeActionBuilder_RequiresForEach(), ecorePackage.getEBoolean(), "requiresForEach", null, 1, 1, StoryNodeActionBuilder.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getStoryNodeActionBuilder__BuildAction__CFNode(), null, "buildAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(compoundActionBuilderEClass, CompoundActionBuilder.class, "CompoundActionBuilder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompoundActionBuilder_Children(), this.getActionBuilder(), this.getActionBuilder_Parent(), "children", null, 0, -1,
            CompoundActionBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

      initEClass(greenPatternBuilderEClass, GreenPatternBuilder.class, "GreenPatternBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getGreenPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable(), null, "validateVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(expressionExplorerEClass, ExpressionExplorer.class, "ExpressionExplorer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExpressionExplorer_ExpressionTransformer(), thePatternPackage.getExpressionTransformer(), null, "expressionTransformer", null, 0, 1,
            ExpressionExplorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

      op = initEOperation(getExpressionExplorer__ExploreExpression__PatternInvocationBuilder_Pattern_Expression(), null, "exploreExpression", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "patternInvocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExpressionExplorer__HandleSymbolicParameter__PatternInvocationBuilder_Pattern_String_EClassifier(), null,
            "handleSymbolicParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternInvocationBuilder(), "patternInvocationBuilder", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "variableType", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(errorsEEnum, Errors.class, "Errors");
      addEEnumLiteral(errorsEEnum, Errors.GREEN_BOUND_VAR_FOUND);
      addEEnumLiteral(errorsEEnum, Errors.BOUND_IS_UNBOUND_IN_SPEC);
      addEEnumLiteral(errorsEEnum, Errors.UNBOUND_IS_BOUND_IN_SPEC);
      addEEnumLiteral(errorsEEnum, Errors.BOUND_VARIABLE_ALREADY_DELETED);
      addEEnumLiteral(errorsEEnum, Errors.RED_BOUND_VAR_IN_LOOP);
      addEEnumLiteral(errorsEEnum, Errors.FREE_VAR_IS_RED);
      addEEnumLiteral(errorsEEnum, Errors.GREEN_VAR_IS_NOT_NEW);
      addEEnumLiteral(errorsEEnum, Errors.BINDING_VAR_NOT_FREE);
      addEEnumLiteral(errorsEEnum, Errors.OPTIONAL_VAR_FOUND);
      addEEnumLiteral(errorsEEnum, Errors.REASSIGNED_METHOD_PARAMETER);
      addEEnumLiteral(errorsEEnum, Errors.MULTIPLE_ATTRIBUTE_ASSIGNMENT);
      addEEnumLiteral(errorsEEnum, Errors.EMPTY_COMPOUND_NODE);
      addEEnumLiteral(errorsEEnum, Errors.INFINITE_LOOP);
      addEEnumLiteral(errorsEEnum, Errors.FREE_GREEN_VARIABLE_MARKED_AS_BOUND);
      addEEnumLiteral(errorsEEnum, Errors.GREEN_VARIABLE_WITH_BINDING);
      addEEnumLiteral(errorsEEnum, Errors.THIS_OBJECT_DELETED);
      addEEnumLiteral(errorsEEnum, Errors.EMPTY_FOREACH_NODE);

      // Create resource
      createResource(eNS_URI);
   }

} //ScopePackageImpl
