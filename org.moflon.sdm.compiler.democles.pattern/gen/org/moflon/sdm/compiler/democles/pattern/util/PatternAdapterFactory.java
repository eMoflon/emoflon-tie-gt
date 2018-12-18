/**
 */
package org.moflon.sdm.compiler.democles.pattern.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.sdm.compiler.democles.pattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage
 * @generated
 */
public class PatternAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static PatternPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = PatternPackage.eINSTANCE;
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
   protected PatternSwitch<Adapter> modelSwitch = new PatternSwitch<Adapter>() {
      @Override
      public Adapter caseGreenPatternTransformer(GreenPatternTransformer object)
      {
         return createGreenPatternTransformerAdapter();
      }

      @Override
      public Adapter casePatternVariableHandler(PatternVariableHandler object)
      {
         return createPatternVariableHandlerAdapter();
      }

      @Override
      public Adapter caseBlackAndNacPatternTransformer(BlackAndNacPatternTransformer object)
      {
         return createBlackAndNacPatternTransformerAdapter();
      }

      @Override
      public Adapter caseNacPatternTransformer(NacPatternTransformer object)
      {
         return createNacPatternTransformerAdapter();
      }

      @Override
      public Adapter caseBindingPatternTransformer(BindingPatternTransformer object)
      {
         return createBindingPatternTransformerAdapter();
      }

      @Override
      public Adapter caseDefaultExpressionTransformer(DefaultExpressionTransformer object)
      {
         return createDefaultExpressionTransformerAdapter();
      }

      @Override
      public Adapter casePatternTransformer(PatternTransformer object)
      {
         return createPatternTransformerAdapter();
      }

      @Override
      public Adapter caseExpressionTransformer(ExpressionTransformer object)
      {
         return createExpressionTransformerAdapter();
      }

      @Override
      public Adapter caseRedPatternTransformer(RedPatternTransformer object)
      {
         return createRedPatternTransformerAdapter();
      }

      @Override
      public Adapter caseLiteralExpressionTransformer(LiteralExpressionTransformer object)
      {
         return createLiteralExpressionTransformerAdapter();
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
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer <em>Green Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer
    * @generated
    */
   public Adapter createGreenPatternTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler <em>Variable Handler</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler
    * @generated
    */
   public Adapter createPatternVariableHandlerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer <em>Black And Nac Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer
    * @generated
    */
   public Adapter createBlackAndNacPatternTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer <em>Nac Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer
    * @generated
    */
   public Adapter createNacPatternTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer <em>Binding Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer
    * @generated
    */
   public Adapter createBindingPatternTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer <em>Default Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer
    * @generated
    */
   public Adapter createDefaultExpressionTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer <em>Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer
    * @generated
    */
   public Adapter createPatternTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer <em>Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer
    * @generated
    */
   public Adapter createExpressionTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer <em>Red Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer
    * @generated
    */
   public Adapter createRedPatternTransformerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer <em>Literal Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer
    * @generated
    */
   public Adapter createLiteralExpressionTransformerAdapter()
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

} //PatternAdapterFactory