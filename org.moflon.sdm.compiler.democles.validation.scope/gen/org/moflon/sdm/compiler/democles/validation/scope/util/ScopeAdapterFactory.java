/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.sdm.compiler.democles.validation.scope.*;

import org.moflon.sdm.runtime.democles.UniformNoOperationVisitor;
import org.moflon.sdm.runtime.democles.Visitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage
 * @generated
 */
public class ScopeAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ScopePackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = ScopePackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ScopeSwitch<Adapter> modelSwitch = new ScopeSwitch<Adapter>() {
      @Override
      public Adapter caseBindingExpressionBuilder(BindingExpressionBuilder object)
      {
         return createBindingExpressionBuilderAdapter();
      }

      @Override
      public Adapter caseRedNodeDeletionBuilder(RedNodeDeletionBuilder object)
      {
         return createRedNodeDeletionBuilderAdapter();
      }

      @Override
      public Adapter caseNacPatternBuilder(NacPatternBuilder object)
      {
         return createNacPatternBuilderAdapter();
      }

      @Override
      public Adapter caseRedPatternBuilder(RedPatternBuilder object)
      {
         return createRedPatternBuilderAdapter();
      }

      @Override
      public Adapter caseBindingAndBlackPatternBuilder(BindingAndBlackPatternBuilder object)
      {
         return createBindingAndBlackPatternBuilderAdapter();
      }

      @Override
      public Adapter caseBlackPatternBuilder(BlackPatternBuilder object)
      {
         return createBlackPatternBuilderAdapter();
      }

      @Override
      public Adapter caseActionBuilder(ActionBuilder object)
      {
         return createActionBuilderAdapter();
      }

      @Override
      public Adapter caseScopeValidator(ScopeValidator object)
      {
         return createScopeValidatorAdapter();
      }

      @Override
      public Adapter caseCompoundPatternInvocationBuilder(CompoundPatternInvocationBuilder object)
      {
         return createCompoundPatternInvocationBuilderAdapter();
      }

      @Override
      public Adapter caseRegularPatternInvocationBuilder(RegularPatternInvocationBuilder object)
      {
         return createRegularPatternInvocationBuilderAdapter();
      }

      @Override
      public Adapter casePatternMatcher(PatternMatcher object)
      {
         return createPatternMatcherAdapter();
      }

      @Override
      public Adapter caseSingleResultPatternInvocationBuilder(SingleResultPatternInvocationBuilder object)
      {
         return createSingleResultPatternInvocationBuilderAdapter();
      }

      @Override
      public Adapter casePatternInvocationBuilder(PatternInvocationBuilder object)
      {
         return createPatternInvocationBuilderAdapter();
      }

      @Override
      public Adapter caseStoryNodeActionBuilder(StoryNodeActionBuilder object)
      {
         return createStoryNodeActionBuilderAdapter();
      }

      @Override
      public Adapter caseCompoundActionBuilder(CompoundActionBuilder object)
      {
         return createCompoundActionBuilderAdapter();
      }

      @Override
      public Adapter caseGreenPatternBuilder(GreenPatternBuilder object)
      {
         return createGreenPatternBuilderAdapter();
      }

      @Override
      public Adapter caseExpressionExplorer(ExpressionExplorer object)
      {
         return createExpressionExplorerAdapter();
      }

      @Override
      public Adapter caseVisitor(Visitor object)
      {
         return createVisitorAdapter();
      }

      @Override
      public Adapter caseUniformNoOperationVisitor(UniformNoOperationVisitor object)
      {
         return createUniformNoOperationVisitorAdapter();
      }

      @Override
      public Adapter defaultCase(EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder <em>Binding Expression Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder
    * @generated
    */
   public Adapter createBindingExpressionBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder <em>Red Node Deletion Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder
    * @generated
    */
   public Adapter createRedNodeDeletionBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder <em>Nac Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder
    * @generated
    */
   public Adapter createNacPatternBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder <em>Red Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder
    * @generated
    */
   public Adapter createRedPatternBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder <em>Binding And Black Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder
    * @generated
    */
   public Adapter createBindingAndBlackPatternBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder <em>Black Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder
    * @generated
    */
   public Adapter createBlackPatternBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder <em>Action Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder
    * @generated
    */
   public Adapter createActionBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator
    * @generated
    */
   public Adapter createScopeValidatorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder <em>Compound Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder
    * @generated
    */
   public Adapter createCompoundPatternInvocationBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder <em>Regular Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder
    * @generated
    */
   public Adapter createRegularPatternInvocationBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher <em>Pattern Matcher</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher
    * @generated
    */
   public Adapter createPatternMatcherAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder <em>Single Result Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder
    * @generated
    */
   public Adapter createSingleResultPatternInvocationBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder <em>Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder
    * @generated
    */
   public Adapter createPatternInvocationBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder <em>Story Node Action Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder
    * @generated
    */
   public Adapter createStoryNodeActionBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder <em>Compound Action Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder
    * @generated
    */
   public Adapter createCompoundActionBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder <em>Green Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder
    * @generated
    */
   public Adapter createGreenPatternBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer <em>Expression Explorer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer
    * @generated
    */
   public Adapter createExpressionExplorerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.Visitor <em>Visitor</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.Visitor
    * @generated
    */
   public Adapter createVisitorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.UniformNoOperationVisitor <em>Uniform No Operation Visitor</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.UniformNoOperationVisitor
    * @generated
    */
   public Adapter createUniformNoOperationVisitorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter()
   {
      return null;
   }

} //ScopeAdapterFactory
