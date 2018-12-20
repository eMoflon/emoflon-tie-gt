/**
 */
package org.moflon.sdm.runtime.democles.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.sdm.runtime.democles.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage
 * @generated
 */
public class DemoclesAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static DemoclesPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DemoclesAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = DemoclesPackage.eINSTANCE;
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
   protected DemoclesSwitch<Adapter> modelSwitch = new DemoclesSwitch<Adapter>() {
      @Override
      public Adapter caseContinueStatement(ContinueStatement object)
      {
         return createContinueStatementAdapter();
      }

      @Override
      public Adapter caseRepetitionNode(RepetitionNode object)
      {
         return createRepetitionNodeAdapter();
      }

      @Override
      public Adapter caseLoop(Loop object)
      {
         return createLoopAdapter();
      }

      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
         return createReturnStatementAdapter();
      }

      @Override
      public Adapter caseHeadControlledLoop(HeadControlledLoop object)
      {
         return createHeadControlledLoopAdapter();
      }

      @Override
      public Adapter caseTailControlledLoop(TailControlledLoop object)
      {
         return createTailControlledLoopAdapter();
      }

      @Override
      public Adapter caseForEach(ForEach object)
      {
         return createForEachAdapter();
      }

      @Override
      public Adapter caseCompoundNode(CompoundNode object)
      {
         return createCompoundNodeAdapter();
      }

      @Override
      public Adapter caseRegularPatternInvocation(RegularPatternInvocation object)
      {
         return createRegularPatternInvocationAdapter();
      }

      @Override
      public Adapter caseCFVariable(CFVariable object)
      {
         return createCFVariableAdapter();
      }

      @Override
      public Adapter caseCFNode(CFNode object)
      {
         return createCFNodeAdapter();
      }

      @Override
      public Adapter caseBindingPatternInvocation(BindingPatternInvocation object)
      {
         return createBindingPatternInvocationAdapter();
      }

      @Override
      public Adapter caseSingleResultPatternInvocation(SingleResultPatternInvocation object)
      {
         return createSingleResultPatternInvocationAdapter();
      }

      @Override
      public Adapter caseScope(Scope object)
      {
         return createScopeAdapter();
      }

      @Override
      public Adapter caseAction(Action object)
      {
         return createActionAdapter();
      }

      @Override
      public Adapter caseUniformNoOperationVisitor(UniformNoOperationVisitor object)
      {
         return createUniformNoOperationVisitorAdapter();
      }

      @Override
      public Adapter caseNodeDeletion(NodeDeletion object)
      {
         return createNodeDeletionAdapter();
      }

      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
         return createIfStatementAdapter();
      }

      @Override
      public Adapter casePatternInvocation(PatternInvocation object)
      {
         return createPatternInvocationAdapter();
      }

      @Override
      public Adapter caseVisitor(Visitor object)
      {
         return createVisitorAdapter();
      }

      @Override
      public Adapter caseVariableReference(VariableReference object)
      {
         return createVariableReferenceAdapter();
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
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.ContinueStatement <em>Continue Statement</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.ContinueStatement
    * @generated
    */
   public Adapter createContinueStatementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.RepetitionNode <em>Repetition Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.RepetitionNode
    * @generated
    */
   public Adapter createRepetitionNodeAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.Loop <em>Loop</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.Loop
    * @generated
    */
   public Adapter createLoopAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.ReturnStatement <em>Return Statement</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.ReturnStatement
    * @generated
    */
   public Adapter createReturnStatementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.HeadControlledLoop <em>Head Controlled Loop</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.HeadControlledLoop
    * @generated
    */
   public Adapter createHeadControlledLoopAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.TailControlledLoop <em>Tail Controlled Loop</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.TailControlledLoop
    * @generated
    */
   public Adapter createTailControlledLoopAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.ForEach <em>For Each</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.ForEach
    * @generated
    */
   public Adapter createForEachAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.CompoundNode <em>Compound Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.CompoundNode
    * @generated
    */
   public Adapter createCompoundNodeAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.RegularPatternInvocation <em>Regular Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.RegularPatternInvocation
    * @generated
    */
   public Adapter createRegularPatternInvocationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.CFVariable <em>CF Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.CFVariable
    * @generated
    */
   public Adapter createCFVariableAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.CFNode <em>CF Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.CFNode
    * @generated
    */
   public Adapter createCFNodeAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.BindingPatternInvocation <em>Binding Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.BindingPatternInvocation
    * @generated
    */
   public Adapter createBindingPatternInvocationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.SingleResultPatternInvocation <em>Single Result Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.SingleResultPatternInvocation
    * @generated
    */
   public Adapter createSingleResultPatternInvocationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.Scope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.Scope
    * @generated
    */
   public Adapter createScopeAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.Action <em>Action</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.Action
    * @generated
    */
   public Adapter createActionAdapter()
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
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.NodeDeletion <em>Node Deletion</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.NodeDeletion
    * @generated
    */
   public Adapter createNodeDeletionAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.IfStatement <em>If Statement</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.IfStatement
    * @generated
    */
   public Adapter createIfStatementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.PatternInvocation <em>Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.PatternInvocation
    * @generated
    */
   public Adapter createPatternInvocationAdapter()
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
    * Creates a new adapter for an object of class '{@link org.moflon.sdm.runtime.democles.VariableReference <em>Variable Reference</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.moflon.sdm.runtime.democles.VariableReference
    * @generated
    */
   public Adapter createVariableReferenceAdapter()
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

} //DemoclesAdapterFactory
