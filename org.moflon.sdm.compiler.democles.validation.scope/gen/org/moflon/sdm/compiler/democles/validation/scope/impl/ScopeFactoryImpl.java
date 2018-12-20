/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.sdm.compiler.democles.validation.scope.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopeFactoryImpl extends EFactoryImpl implements ScopeFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ScopeFactory init()
   {
      try
      {
         ScopeFactory theScopeFactory = (ScopeFactory) EPackage.Registry.INSTANCE.getEFactory(ScopePackage.eNS_URI);
         if (theScopeFactory != null)
         {
            return theScopeFactory;
         }
      } catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ScopeFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
      case ScopePackage.BINDING_EXPRESSION_BUILDER:
         return createBindingExpressionBuilder();
      case ScopePackage.RED_NODE_DELETION_BUILDER:
         return createRedNodeDeletionBuilder();
      case ScopePackage.NAC_PATTERN_BUILDER:
         return createNacPatternBuilder();
      case ScopePackage.RED_PATTERN_BUILDER:
         return createRedPatternBuilder();
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER:
         return createBindingAndBlackPatternBuilder();
      case ScopePackage.BLACK_PATTERN_BUILDER:
         return createBlackPatternBuilder();
      case ScopePackage.SCOPE_VALIDATOR:
         return createScopeValidator();
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER:
         return createCompoundPatternInvocationBuilder();
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER:
         return createRegularPatternInvocationBuilder();
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER:
         return createSingleResultPatternInvocationBuilder();
      case ScopePackage.STORY_NODE_ACTION_BUILDER:
         return createStoryNodeActionBuilder();
      case ScopePackage.GREEN_PATTERN_BUILDER:
         return createGreenPatternBuilder();
      case ScopePackage.EXPRESSION_EXPLORER:
         return createExpressionExplorer();
      default:
         throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
      case ScopePackage.ERRORS:
         return createErrorsFromString(eDataType, initialValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
      case ScopePackage.ERRORS:
         return convertErrorsToString(eDataType, instanceValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingExpressionBuilder createBindingExpressionBuilder()
   {
      BindingExpressionBuilderImpl bindingExpressionBuilder = new BindingExpressionBuilderImpl();
      return bindingExpressionBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RedNodeDeletionBuilder createRedNodeDeletionBuilder()
   {
      RedNodeDeletionBuilderImpl redNodeDeletionBuilder = new RedNodeDeletionBuilderImpl();
      return redNodeDeletionBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NacPatternBuilder createNacPatternBuilder()
   {
      NacPatternBuilderImpl nacPatternBuilder = new NacPatternBuilderImpl();
      return nacPatternBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RedPatternBuilder createRedPatternBuilder()
   {
      RedPatternBuilderImpl redPatternBuilder = new RedPatternBuilderImpl();
      return redPatternBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingAndBlackPatternBuilder createBindingAndBlackPatternBuilder()
   {
      BindingAndBlackPatternBuilderImpl bindingAndBlackPatternBuilder = new BindingAndBlackPatternBuilderImpl();
      return bindingAndBlackPatternBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BlackPatternBuilder createBlackPatternBuilder()
   {
      BlackPatternBuilderImpl blackPatternBuilder = new BlackPatternBuilderImpl();
      return blackPatternBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeValidator createScopeValidator()
   {
      ScopeValidatorImpl scopeValidator = new ScopeValidatorImpl();
      return scopeValidator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompoundPatternInvocationBuilder createCompoundPatternInvocationBuilder()
   {
      CompoundPatternInvocationBuilderImpl compoundPatternInvocationBuilder = new CompoundPatternInvocationBuilderImpl();
      return compoundPatternInvocationBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RegularPatternInvocationBuilder createRegularPatternInvocationBuilder()
   {
      RegularPatternInvocationBuilderImpl regularPatternInvocationBuilder = new RegularPatternInvocationBuilderImpl();
      return regularPatternInvocationBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SingleResultPatternInvocationBuilder createSingleResultPatternInvocationBuilder()
   {
      SingleResultPatternInvocationBuilderImpl singleResultPatternInvocationBuilder = new SingleResultPatternInvocationBuilderImpl();
      return singleResultPatternInvocationBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StoryNodeActionBuilder createStoryNodeActionBuilder()
   {
      StoryNodeActionBuilderImpl storyNodeActionBuilder = new StoryNodeActionBuilderImpl();
      return storyNodeActionBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GreenPatternBuilder createGreenPatternBuilder()
   {
      GreenPatternBuilderImpl greenPatternBuilder = new GreenPatternBuilderImpl();
      return greenPatternBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionExplorer createExpressionExplorer()
   {
      ExpressionExplorerImpl expressionExplorer = new ExpressionExplorerImpl();
      return expressionExplorer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Errors createErrorsFromString(EDataType eDataType, String initialValue)
   {
      Errors result = Errors.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertErrorsToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopePackage getScopePackage()
   {
      return (ScopePackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ScopePackage getPackage()
   {
      return ScopePackage.eINSTANCE;
   }

} //ScopeFactoryImpl
