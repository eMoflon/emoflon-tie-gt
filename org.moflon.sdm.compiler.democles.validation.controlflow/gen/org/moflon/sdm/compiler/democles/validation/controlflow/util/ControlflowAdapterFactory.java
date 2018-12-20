/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.ETypedElement;

import org.moflon.core.dfs.EdgeProcessor;

import org.moflon.sdm.compiler.democles.validation.controlflow.*;

import org.moflon.sdm.runtime.democles.UniformNoOperationVisitor;
import org.moflon.sdm.runtime.democles.Visitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage
 * @generated
 */
public class ControlflowAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ControlflowPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ControlflowAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = ControlflowPackage.eINSTANCE;
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
   protected ControlflowSwitch<Adapter> modelSwitch = new ControlflowSwitch<Adapter>() {
      @Override
      public Adapter caseValidator(Validator object)
      {
         return createValidatorAdapter();
      }

      @Override
      public Adapter caseSDMActivityGraphBuilder(SDMActivityGraphBuilder object)
      {
         return createSDMActivityGraphBuilderAdapter();
      }

      @Override
      public Adapter caseCrossEdgeAnalyzer(CrossEdgeAnalyzer object)
      {
         return createCrossEdgeAnalyzerAdapter();
      }

      @Override
      public Adapter caseInefficientBootstrappingBuilder(InefficientBootstrappingBuilder object)
      {
         return createInefficientBootstrappingBuilderAdapter();
      }

      @Override
      public Adapter caseSubTreeTester(SubTreeTester object)
      {
         return createSubTreeTesterAdapter();
      }

      @Override
      public Adapter caseTreeEdgeBackwardNavigatorTerminal(TreeEdgeBackwardNavigatorTerminal object)
      {
         return createTreeEdgeBackwardNavigatorTerminalAdapter();
      }

      @Override
      public Adapter caseForEachComponentProcessor(ForEachComponentProcessor object)
      {
         return createForEachComponentProcessorAdapter();
      }

      @Override
      public Adapter caseTreeEdgeNavigator(TreeEdgeNavigator object)
      {
         return createTreeEdgeNavigatorAdapter();
      }

      @Override
      public Adapter caseJoinNodeFinder(JoinNodeFinder object)
      {
         return createJoinNodeFinderAdapter();
      }

      @Override
      public Adapter caseMoflonOperation(MoflonOperation object)
      {
         return createMoflonOperationAdapter();
      }

      @Override
      public Adapter caseDefaultComponentProcessor(DefaultComponentProcessor object)
      {
         return createDefaultComponentProcessorAdapter();
      }

      @Override
      public Adapter caseControlFlowBuilder(ControlFlowBuilder object)
      {
         return createControlFlowBuilderAdapter();
      }

      @Override
      public Adapter caseIdentifierAllocator(IdentifierAllocator object)
      {
         return createIdentifierAllocatorAdapter();
      }

      @Override
      public Adapter caseValidatingEdgeProcessor(ValidatingEdgeProcessor object)
      {
         return createValidatingEdgeProcessorAdapter();
      }

      @Override
      public Adapter caseEdgeProcessor(EdgeProcessor object)
      {
         return createEdgeProcessorAdapter();
      }

      @Override
      public Adapter caseEModelElement(EModelElement object)
      {
         return createEModelElementAdapter();
      }

      @Override
      public Adapter caseENamedElement(ENamedElement object)
      {
         return createENamedElementAdapter();
      }

      @Override
      public Adapter caseETypedElement(ETypedElement object)
      {
         return createETypedElementAdapter();
      }

      @Override
      public Adapter caseEOperation(EOperation object)
      {
         return createEOperationAdapter();
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
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator
    * @generated
    */
   public Adapter createValidatorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder <em>SDM Activity Graph Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder
    * @generated
    */
   public Adapter createSDMActivityGraphBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer <em>Cross Edge Analyzer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer
    * @generated
    */
   public Adapter createCrossEdgeAnalyzerAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder <em>Inefficient Bootstrapping Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder
    * @generated
    */
   public Adapter createInefficientBootstrappingBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester <em>Sub Tree Tester</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester
    * @generated
    */
   public Adapter createSubTreeTesterAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal <em>Tree Edge Backward Navigator Terminal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal
    * @generated
    */
   public Adapter createTreeEdgeBackwardNavigatorTerminalAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor <em>For Each Component Processor</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor
    * @generated
    */
   public Adapter createForEachComponentProcessorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator <em>Tree Edge Navigator</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator
    * @generated
    */
   public Adapter createTreeEdgeNavigatorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder <em>Join Node Finder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder
    * @generated
    */
   public Adapter createJoinNodeFinderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation <em>Moflon Operation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation
    * @generated
    */
   public Adapter createMoflonOperationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor <em>Default Component Processor</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor
    * @generated
    */
   public Adapter createDefaultComponentProcessorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder <em>Control Flow Builder</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder
    * @generated
    */
   public Adapter createControlFlowBuilderAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator <em>Identifier Allocator</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator
    * @generated
    */
   public Adapter createIdentifierAllocatorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor <em>Validating Edge Processor</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor
    * @generated
    */
   public Adapter createValidatingEdgeProcessorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.core.dfs.EdgeProcessor <em>Edge Processor</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.core.dfs.EdgeProcessor
    * @generated
    */
   public Adapter createEdgeProcessorAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.emf.ecore.EModelElement
    * @generated
    */
   public Adapter createEModelElementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.emf.ecore.ENamedElement
    * @generated
    */
   public Adapter createENamedElementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ETypedElement <em>ETyped Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.emf.ecore.ETypedElement
    * @generated
    */
   public Adapter createETypedElementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EOperation <em>EOperation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.emf.ecore.EOperation
    * @generated
    */
   public Adapter createEOperationAdapter()
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

} //ControlflowAdapterFactory
