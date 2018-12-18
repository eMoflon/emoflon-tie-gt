/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.calls.callExpressions.CallExpressionsPackage;

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

import org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.Errors;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternFactory;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.PatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;
import org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer;

import org.moflon.sdm.compiler.democles.validation.result.ResultPackage;

import org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternPackageImpl extends EPackageImpl implements PatternPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass greenPatternTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass patternVariableHandlerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass blackAndNacPatternTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass nacPatternTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass bindingPatternTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass defaultExpressionTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass patternTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass expressionTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass redPatternTransformerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass literalExpressionTransformerEClass = null;

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
    * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private PatternPackageImpl()
   {
      super(eNS_URI, PatternFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static PatternPackage init()
   {
      if (isInited)
         return (PatternPackage) EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

      // Obtain or create and register package
      PatternPackageImpl thePatternPackage = (PatternPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new PatternPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      SpecificationPackage.eINSTANCE.eClass();
      EMFTypePackage.eINSTANCE.eClass();
      RelationalConstraintPackage.eINSTANCE.eClass();
      SDMLanguagePackage.eINSTANCE.eClass();
      ResultPackage.eINSTANCE.eClass();
      LiteralexpressionsolverPackage.eINSTANCE.eClass();
      MocaTreePackage.eINSTANCE.eClass();

      // Create package meta-data objects
      thePatternPackage.createPackageContents();

      // Initialize created meta-data
      thePatternPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      thePatternPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
      return thePatternPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGreenPatternTransformer()
   {
      return greenPatternTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getGreenPatternTransformer__IsLinkToAdd__LinkVariable_Pattern()
   {
      return greenPatternTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getGreenPatternTransformer__IsVariableToAdd__ObjectVariable()
   {
      return greenPatternTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getGreenPatternTransformer__Postprocess__StoryPattern_Pattern()
   {
      return greenPatternTransformerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getGreenPatternTransformer__TransformAssignment__AttributeAssignment_Pattern()
   {
      return greenPatternTransformerEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPatternVariableHandler()
   {
      return patternVariableHandlerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternVariableHandler__Concat__String_String()
   {
      return patternVariableHandlerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternVariableHandler__GetAttributeVariable__ObjectVariable_EAttribute_Pattern()
   {
      return patternVariableHandlerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternVariableHandler__LookupVariableInPattern__Pattern_String_EClassifier()
   {
      return patternVariableHandlerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBlackAndNacPatternTransformer()
   {
      return blackAndNacPatternTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__AnalyzeInjectivity__Pattern()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__AreCompatibleTypes__EClassifier_EClassifier()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__CreateInjectivityConstraint__Pattern_Variable_Variable()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__CreateRelationalConstraint__ComparisonExpression()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__InjectiveMappingRequired__Variable_Variable()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__IsVariableToAdd__ObjectVariable()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__Postprocess__StoryPattern_Pattern()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBlackAndNacPatternTransformer__TransformAttributeConstraint__Constraint_Pattern()
   {
      return blackAndNacPatternTransformerEClass.getEOperations().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNacPatternTransformer()
   {
      return nacPatternTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternTransformer__AddLinkToPattern__LinkVariable_Pattern()
   {
      return nacPatternTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern()
   {
      return nacPatternTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternTransformer__IsVariableToAdd__ObjectVariable()
   {
      return nacPatternTransformerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternTransformer__Postprocess__StoryPattern_Pattern()
   {
      return nacPatternTransformerEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getNacPatternTransformer__TransformNacConstraints__ObjectVariable_Pattern()
   {
      return nacPatternTransformerEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBindingPatternTransformer()
   {
      return bindingPatternTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingPatternTransformer__IsVariableToAdd__ObjectVariable()
   {
      return bindingPatternTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingPatternTransformer__Postprocess__StoryPattern_Pattern()
   {
      return bindingPatternTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getBindingPatternTransformer__ProcessObjectVariables__StoryPattern_Pattern()
   {
      return bindingPatternTransformerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDefaultExpressionTransformer()
   {
      return defaultExpressionTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDefaultExpressionTransformer_CalleeETypeNameCounter()
   {
      return (EAttribute) defaultExpressionTransformerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDefaultExpressionTransformer__CreateLocalVariableNameAndIncrementCounter()
   {
      return defaultExpressionTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDefaultExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier()
   {
      return defaultExpressionTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDefaultExpressionTransformer__TransformMethodInvocation__ValidationReport_PatternVariableHandler_MethodCallExpression_Pattern_Constraint()
   {
      return defaultExpressionTransformerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDefaultExpressionTransformer__CheckTypeCompatibility__ValidationReport_Expression_EClassifier_EClassifier()
   {
      return defaultExpressionTransformerEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDefaultExpressionTransformer__AreEqual__EClassifier_EClassifier()
   {
      return defaultExpressionTransformerEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPatternTransformer()
   {
      return patternTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPatternTransformer_ValidationReport()
   {
      return (EReference) patternTransformerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPatternTransformer_ExpressionTransformer()
   {
      return (EReference) patternTransformerEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__AddLinkToPattern__LinkVariable_Pattern()
   {
      return patternTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__GetEReference__LinkVariable()
   {
      return patternTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__HasSymbolicParameter__Pattern_String()
   {
      return patternTransformerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__IsLinkToAdd__LinkVariable_Pattern()
   {
      return patternTransformerEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__IsVariableToAdd__ObjectVariable()
   {
      return patternTransformerEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__Postprocess__StoryPattern_Pattern()
   {
      return patternTransformerEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__ProcessLinkVariables__StoryPattern_Pattern()
   {
      return patternTransformerEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternTransformer__Transform__StoryPattern_Pattern()
   {
      return patternTransformerEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExpressionTransformer()
   {
      return expressionTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExpressionTransformer_Delegate()
   {
      return (EReference) expressionTransformerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExpressionTransformer__LookupErrorMessage__Errors()
   {
      return expressionTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExpressionTransformer__TransformAndAssignExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_Variable_EClassifier()
   {
      return expressionTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier()
   {
      return expressionTransformerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRedPatternTransformer()
   {
      return redPatternTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRedPatternTransformer__IsLinkToAdd__LinkVariable_Pattern()
   {
      return redPatternTransformerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRedPatternTransformer__IsVariableToAdd__ObjectVariable()
   {
      return redPatternTransformerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getLiteralExpressionTransformer()
   {
      return literalExpressionTransformerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLiteralExpressionTransformer_ConstantTransformer()
   {
      return (EReference) literalExpressionTransformerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getLiteralExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier()
   {
      return literalExpressionTransformerEClass.getEOperations().get(0);
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
   public PatternFactory getPatternFactory()
   {
      return (PatternFactory) getEFactoryInstance();
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
      greenPatternTransformerEClass = createEClass(GREEN_PATTERN_TRANSFORMER);
      createEOperation(greenPatternTransformerEClass, GREEN_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN);
      createEOperation(greenPatternTransformerEClass, GREEN_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);
      createEOperation(greenPatternTransformerEClass, GREEN_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN);
      createEOperation(greenPatternTransformerEClass, GREEN_PATTERN_TRANSFORMER___TRANSFORM_ASSIGNMENT__ATTRIBUTEASSIGNMENT_PATTERN);

      patternVariableHandlerEClass = createEClass(PATTERN_VARIABLE_HANDLER);
      createEOperation(patternVariableHandlerEClass, PATTERN_VARIABLE_HANDLER___CONCAT__STRING_STRING);
      createEOperation(patternVariableHandlerEClass, PATTERN_VARIABLE_HANDLER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN);
      createEOperation(patternVariableHandlerEClass, PATTERN_VARIABLE_HANDLER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER);

      blackAndNacPatternTransformerEClass = createEClass(BLACK_AND_NAC_PATTERN_TRANSFORMER);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___ANALYZE_INJECTIVITY__PATTERN);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___ARE_COMPATIBLE_TYPES__ECLASSIFIER_ECLASSIFIER);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_INJECTIVITY_CONSTRAINT__PATTERN_VARIABLE_VARIABLE);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_RELATIONAL_CONSTRAINT__COMPARISONEXPRESSION);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___INJECTIVE_MAPPING_REQUIRED__VARIABLE_VARIABLE);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN);
      createEOperation(blackAndNacPatternTransformerEClass, BLACK_AND_NAC_PATTERN_TRANSFORMER___TRANSFORM_ATTRIBUTE_CONSTRAINT__CONSTRAINT_PATTERN);

      nacPatternTransformerEClass = createEClass(NAC_PATTERN_TRANSFORMER);
      createEOperation(nacPatternTransformerEClass, NAC_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN);
      createEOperation(nacPatternTransformerEClass, NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN);
      createEOperation(nacPatternTransformerEClass, NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);
      createEOperation(nacPatternTransformerEClass, NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN);
      createEOperation(nacPatternTransformerEClass, NAC_PATTERN_TRANSFORMER___TRANSFORM_NAC_CONSTRAINTS__OBJECTVARIABLE_PATTERN);

      bindingPatternTransformerEClass = createEClass(BINDING_PATTERN_TRANSFORMER);
      createEOperation(bindingPatternTransformerEClass, BINDING_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);
      createEOperation(bindingPatternTransformerEClass, BINDING_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN);
      createEOperation(bindingPatternTransformerEClass, BINDING_PATTERN_TRANSFORMER___PROCESS_OBJECT_VARIABLES__STORYPATTERN_PATTERN);

      defaultExpressionTransformerEClass = createEClass(DEFAULT_EXPRESSION_TRANSFORMER);
      createEAttribute(defaultExpressionTransformerEClass, DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER);
      createEOperation(defaultExpressionTransformerEClass, DEFAULT_EXPRESSION_TRANSFORMER___CREATE_LOCAL_VARIABLE_NAME_AND_INCREMENT_COUNTER);
      createEOperation(defaultExpressionTransformerEClass,
            DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER);
      createEOperation(defaultExpressionTransformerEClass,
            DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_METHOD_INVOCATION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_METHODCALLEXPRESSION_PATTERN_CONSTRAINT);
      createEOperation(defaultExpressionTransformerEClass,
            DEFAULT_EXPRESSION_TRANSFORMER___CHECK_TYPE_COMPATIBILITY__VALIDATIONREPORT_EXPRESSION_ECLASSIFIER_ECLASSIFIER);
      createEOperation(defaultExpressionTransformerEClass, DEFAULT_EXPRESSION_TRANSFORMER___ARE_EQUAL__ECLASSIFIER_ECLASSIFIER);

      patternTransformerEClass = createEClass(PATTERN_TRANSFORMER);
      createEReference(patternTransformerEClass, PATTERN_TRANSFORMER__VALIDATION_REPORT);
      createEReference(patternTransformerEClass, PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN);
      createEOperation(patternTransformerEClass, PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN);

      expressionTransformerEClass = createEClass(EXPRESSION_TRANSFORMER);
      createEReference(expressionTransformerEClass, EXPRESSION_TRANSFORMER__DELEGATE);
      createEOperation(expressionTransformerEClass, EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS);
      createEOperation(expressionTransformerEClass,
            EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER);
      createEOperation(expressionTransformerEClass,
            EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER);

      redPatternTransformerEClass = createEClass(RED_PATTERN_TRANSFORMER);
      createEOperation(redPatternTransformerEClass, RED_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN);
      createEOperation(redPatternTransformerEClass, RED_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE);

      literalExpressionTransformerEClass = createEClass(LITERAL_EXPRESSION_TRANSFORMER);
      createEReference(literalExpressionTransformerEClass, LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER);
      createEOperation(literalExpressionTransformerEClass,
            LITERAL_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER);

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
      RelationalConstraintPackage theRelationalConstraintPackage = (RelationalConstraintPackage) EPackage.Registry.INSTANCE
            .getEPackage(RelationalConstraintPackage.eNS_URI);
      ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
      ResultPackage theResultPackage = (ResultPackage) EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);
      CallExpressionsPackage theCallExpressionsPackage = (CallExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(CallExpressionsPackage.eNS_URI);
      LiteralexpressionsolverPackage theLiteralexpressionsolverPackage = (LiteralexpressionsolverPackage) EPackage.Registry.INSTANCE
            .getEPackage(LiteralexpressionsolverPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      greenPatternTransformerEClass.getESuperTypes().add(this.getPatternTransformer());
      blackAndNacPatternTransformerEClass.getESuperTypes().add(this.getPatternTransformer());
      nacPatternTransformerEClass.getESuperTypes().add(this.getBlackAndNacPatternTransformer());
      bindingPatternTransformerEClass.getESuperTypes().add(this.getPatternTransformer());
      defaultExpressionTransformerEClass.getESuperTypes().add(this.getExpressionTransformer());
      patternTransformerEClass.getESuperTypes().add(this.getPatternVariableHandler());
      redPatternTransformerEClass.getESuperTypes().add(this.getPatternTransformer());
      literalExpressionTransformerEClass.getESuperTypes().add(this.getExpressionTransformer());

      // Initialize classes, features, and operations; add parameters
      initEClass(greenPatternTransformerEClass, GreenPatternTransformer.class, "GreenPatternTransformer", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      EOperation op = initEOperation(getGreenPatternTransformer__IsLinkToAdd__LinkVariable_Pattern(), ecorePackage.getEBoolean(), "isLinkToAdd", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getGreenPatternTransformer__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getGreenPatternTransformer__Postprocess__StoryPattern_Pattern(), null, "postprocess", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getGreenPatternTransformer__TransformAssignment__AttributeAssignment_Pattern(), null, "transformAssignment", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getAttributeAssignment(), "assignment", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(patternVariableHandlerEClass, PatternVariableHandler.class, "PatternVariableHandler", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getPatternVariableHandler__Concat__String_String(), ecorePackage.getEString(), "concat", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "first", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "second", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternVariableHandler__GetAttributeVariable__ObjectVariable_EAttribute_Pattern(), theSpecificationPackage.getVariable(),
            "getAttributeVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "attributeOwner", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEAttribute(), "eAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternVariableHandler__LookupVariableInPattern__Pattern_String_EClassifier(), theSpecificationPackage.getVariable(),
            "lookupVariableInPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "variableType", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(blackAndNacPatternTransformerEClass, BlackAndNacPatternTransformer.class, "BlackAndNacPatternTransformer", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getBlackAndNacPatternTransformer__AnalyzeInjectivity__Pattern(), null, "analyzeInjectivity", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__AreCompatibleTypes__EClassifier_EClassifier(), ecorePackage.getEBoolean(), "areCompatibleTypes", 0,
            1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "first", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "second", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__CreateInjectivityConstraint__Pattern_Variable_Variable(), null, "createInjectivityConstraint", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "first", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "second", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__CreateRelationalConstraint__ComparisonExpression(),
            theRelationalConstraintPackage.getRelationalConstraint(), "createRelationalConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getComparisonExpression(), "comparison", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__InjectiveMappingRequired__Variable_Variable(), ecorePackage.getEBoolean(),
            "injectiveMappingRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "first", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "second", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern(), ecorePackage.getEBoolean(), "isLinkToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__Postprocess__StoryPattern_Pattern(), null, "postprocess", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBlackAndNacPatternTransformer__TransformAttributeConstraint__Constraint_Pattern(), null, "transformAttributeConstraint", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getConstraint(), "constraint", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(nacPatternTransformerEClass, NacPatternTransformer.class, "NacPatternTransformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getNacPatternTransformer__AddLinkToPattern__LinkVariable_Pattern(), null, "addLinkToPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern(), ecorePackage.getEBoolean(), "isLinkToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternTransformer__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternTransformer__Postprocess__StoryPattern_Pattern(), null, "postprocess", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getNacPatternTransformer__TransformNacConstraints__ObjectVariable_Pattern(), null, "transformNacConstraints", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "nacObjectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "nacPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(bindingPatternTransformerEClass, BindingPatternTransformer.class, "BindingPatternTransformer", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getBindingPatternTransformer__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingPatternTransformer__Postprocess__StoryPattern_Pattern(), null, "postprocess", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getBindingPatternTransformer__ProcessObjectVariables__StoryPattern_Pattern(), null, "processObjectVariables", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(defaultExpressionTransformerEClass, DefaultExpressionTransformer.class, "DefaultExpressionTransformer", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getDefaultExpressionTransformer_CalleeETypeNameCounter(), ecorePackage.getEInt(), "calleeETypeNameCounter", null, 1, 1,
            DefaultExpressionTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEOperation(getDefaultExpressionTransformer__CreateLocalVariableNameAndIncrementCounter(), ecorePackage.getEString(),
            "createLocalVariableNameAndIncrementCounter", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getDefaultExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier(),
            theSpecificationPackage.getConstraintVariable(), "transformExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theResultPackage.getValidationReport(), "report", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternVariableHandler(), "patternVariableHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "expectedType", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(
            getDefaultExpressionTransformer__TransformMethodInvocation__ValidationReport_PatternVariableHandler_MethodCallExpression_Pattern_Constraint(), null,
            "transformMethodInvocation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theResultPackage.getValidationReport(), "report", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternVariableHandler(), "patternVariableHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theCallExpressionsPackage.getMethodCallExpression(), "methodCallExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getConstraint(), "constraint", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getDefaultExpressionTransformer__CheckTypeCompatibility__ValidationReport_Expression_EClassifier_EClassifier(), null,
            "checkTypeCompatibility", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theResultPackage.getValidationReport(), "report", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "expectedType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "producedType", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getDefaultExpressionTransformer__AreEqual__EClassifier_EClassifier(), ecorePackage.getEBoolean(), "areEqual", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "left", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(patternTransformerEClass, PatternTransformer.class, "PatternTransformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPatternTransformer_ValidationReport(), theResultPackage.getValidationReport(), null, "validationReport", null, 0, 1,
            PatternTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
      initEReference(getPatternTransformer_ExpressionTransformer(), this.getExpressionTransformer(), null, "expressionTransformer", null, 0, 1,
            PatternTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

      op = initEOperation(getPatternTransformer__AddLinkToPattern__LinkVariable_Pattern(), null, "addLinkToPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternTransformer__GetEReference__LinkVariable(), ecorePackage.getEReference(), "getEReference", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternTransformer__HasSymbolicParameter__Pattern_String(), ecorePackage.getEBoolean(), "hasSymbolicParameter", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "variableName", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternTransformer__IsLinkToAdd__LinkVariable_Pattern(), ecorePackage.getEBoolean(), "isLinkToAdd", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternTransformer__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternTransformer__Postprocess__StoryPattern_Pattern(), null, "postprocess", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternTransformer__ProcessLinkVariables__StoryPattern_Pattern(), null, "processLinkVariables", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getPatternTransformer__Transform__StoryPattern_Pattern(), theResultPackage.getValidationReport(), "transform", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getStoryPattern(), "storyPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(expressionTransformerEClass, ExpressionTransformer.class, "ExpressionTransformer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExpressionTransformer_Delegate(), this.getExpressionTransformer(), null, "delegate", null, 0, 1, ExpressionTransformer.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getExpressionTransformer__LookupErrorMessage__Errors(), ecorePackage.getEString(), "lookupErrorMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getErrors(), "errorID", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(
            getExpressionTransformer__TransformAndAssignExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_Variable_EClassifier(), null,
            "transformAndAssignExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theResultPackage.getValidationReport(), "report", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternVariableHandler(), "patternVariableHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "expectedType", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier(),
            theSpecificationPackage.getConstraintVariable(), "transformExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theResultPackage.getValidationReport(), "report", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternVariableHandler(), "patternVariableHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "expectedType", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(redPatternTransformerEClass, RedPatternTransformer.class, "RedPatternTransformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getRedPatternTransformer__IsLinkToAdd__LinkVariable_Pattern(), ecorePackage.getEBoolean(), "isLinkToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getLinkVariable(), "linkVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getRedPatternTransformer__IsVariableToAdd__ObjectVariable(), ecorePackage.getEBoolean(), "isVariableToAdd", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, thePatternsPackage.getObjectVariable(), "objectVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(literalExpressionTransformerEClass, LiteralExpressionTransformer.class, "LiteralExpressionTransformer", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getLiteralExpressionTransformer_ConstantTransformer(), theLiteralexpressionsolverPackage.getConstantTransformer(), null,
            "constantTransformer", null, 0, 1, LiteralExpressionTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getLiteralExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier(),
            theSpecificationPackage.getConstraintVariable(), "transformExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theResultPackage.getValidationReport(), "report", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getPatternVariableHandler(), "patternVariableHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theSpecificationPackage.getPattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEClassifier(), "expectedType", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(errorsEEnum, Errors.class, "Errors");
      addEEnumLiteral(errorsEEnum, Errors.MISSING_DELEGATE);
      addEEnumLiteral(errorsEEnum, Errors.UNHANDLED_EXPRESSION);
      addEEnumLiteral(errorsEEnum, Errors.MISSING_PARAMETER_BINDING);
      addEEnumLiteral(errorsEEnum, Errors.INCOMPATIBLE_TYPE);

      // Create resource
      createResource(eNS_URI);
   }

} //PatternPackageImpl
