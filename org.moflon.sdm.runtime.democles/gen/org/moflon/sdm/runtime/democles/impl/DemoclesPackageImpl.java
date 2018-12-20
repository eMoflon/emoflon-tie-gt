/**
 */
package org.moflon.sdm.runtime.democles.impl;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.activities.ActivitiesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.SpecificationPackage;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage;

import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.BindingPatternInvocation;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.CompoundNode;
import org.moflon.sdm.runtime.democles.ContinueStatement;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.ForEach;
import org.moflon.sdm.runtime.democles.HeadControlledLoop;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.Loop;
import org.moflon.sdm.runtime.democles.NodeDeletion;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
import org.moflon.sdm.runtime.democles.RepetitionNode;
import org.moflon.sdm.runtime.democles.ReturnStatement;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.SingleResultPatternInvocation;
import org.moflon.sdm.runtime.democles.TailControlledLoop;
import org.moflon.sdm.runtime.democles.UniformNoOperationVisitor;
import org.moflon.sdm.runtime.democles.VariableReference;
import org.moflon.sdm.runtime.democles.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoclesPackageImpl extends EPackageImpl implements DemoclesPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass continueStatementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass repetitionNodeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass loopEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass returnStatementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass headControlledLoopEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass tailControlledLoopEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass forEachEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass compoundNodeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass regularPatternInvocationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass cfVariableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass cfNodeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass bindingPatternInvocationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass singleResultPatternInvocationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass scopeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass actionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass uniformNoOperationVisitorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass nodeDeletionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass ifStatementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass patternInvocationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass visitorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass variableReferenceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EDataType adornmentEDataType = null;

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
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private DemoclesPackageImpl()
   {
      super(eNS_URI, DemoclesFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link DemoclesPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static DemoclesPackage init()
   {
      if (isInited)
         return (DemoclesPackage) EPackage.Registry.INSTANCE.getEPackage(DemoclesPackage.eNS_URI);

      // Obtain or create and register package
      DemoclesPackageImpl theDemoclesPackage = (DemoclesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemoclesPackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new DemoclesPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      SpecificationPackage.eINSTANCE.eClass();
      EMFTypePackage.eINSTANCE.eClass();
      RelationalConstraintPackage.eINSTANCE.eClass();
      SDMLanguagePackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theDemoclesPackage.createPackageContents();

      // Initialize created meta-data
      theDemoclesPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theDemoclesPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(DemoclesPackage.eNS_URI, theDemoclesPackage);
      return theDemoclesPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getContinueStatement()
   {
      return continueStatementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRepetitionNode()
   {
      return repetitionNodeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRepetitionNode_LastNodes()
   {
      return (EReference) repetitionNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRepetitionNode__HasShortcuts()
   {
      return repetitionNodeEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getLoop()
   {
      return loopEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLoop_LoopAlongTrue()
   {
      return (EAttribute) loopEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getLoop__GetRelevantScope()
   {
      return loopEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getReturnStatement()
   {
      return returnStatementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getHeadControlledLoop()
   {
      return headControlledLoopEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getHeadControlledLoop__Accept__Visitor()
   {
      return headControlledLoopEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getTailControlledLoop()
   {
      return tailControlledLoopEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getTailControlledLoop__Accept__Visitor()
   {
      return tailControlledLoopEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getForEach()
   {
      return forEachEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getForEach__Accept__Visitor()
   {
      return forEachEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompoundNode()
   {
      return compoundNodeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompoundNode_Scopes()
   {
      return (EReference) compoundNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCompoundNode__GetRelevantScope()
   {
      return compoundNodeEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRegularPatternInvocation()
   {
      return regularPatternInvocationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getRegularPatternInvocation__IsMultipleMatch()
   {
      return regularPatternInvocationEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCFVariable()
   {
      return cfVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFVariable_References()
   {
      return (EReference) cfVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFVariable_Scope()
   {
      return (EReference) cfVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFVariable_Reassignments()
   {
      return (EReference) cfVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFVariable_Constructor()
   {
      return (EReference) cfVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFVariable_Type()
   {
      return (EReference) cfVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFVariable_Destructors()
   {
      return (EReference) cfVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCFVariable_Local()
   {
      return (EAttribute) cfVariableEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCFVariable_Name()
   {
      return (EAttribute) cfVariableEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCFVariable__IsOnlyDefined()
   {
      return cfVariableEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCFNode()
   {
      return cfNodeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFNode_Scope()
   {
      return (EReference) cfNodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFNode_MainAction()
   {
      return (EReference) cfNodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFNode_Actions()
   {
      return (EReference) cfNodeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFNode_Next()
   {
      return (EReference) cfNodeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFNode_Prev()
   {
      return (EReference) cfNodeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFNode_Origin()
   {
      return (EReference) cfNodeEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCFNode_Header()
   {
      return (EReference) cfNodeEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCFNode_Id()
   {
      return (EAttribute) cfNodeEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCFNode__Accept__Visitor()
   {
      return cfNodeEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCFNode__GetRelevantScope()
   {
      return cfNodeEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBindingPatternInvocation()
   {
      return bindingPatternInvocationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSingleResultPatternInvocation()
   {
      return singleResultPatternInvocationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSingleResultPatternInvocation_ReturnType()
   {
      return (EReference) singleResultPatternInvocationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getScope()
   {
      return scopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScope_Parent()
   {
      return (EReference) scopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScope_NextScope()
   {
      return (EReference) scopeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScope_PreviousScope()
   {
      return (EReference) scopeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScope_Contents()
   {
      return (EReference) scopeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScope_Variables()
   {
      return (EReference) scopeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getScope__Accept__Visitor()
   {
      return scopeEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAction()
   {
      return actionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAction_ReassignedVariables()
   {
      return (EReference) actionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAction_CfNode()
   {
      return (EReference) actionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAction_ConstructedVariables()
   {
      return (EReference) actionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAction_Next()
   {
      return (EReference) actionEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAction_Prev()
   {
      return (EReference) actionEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getAction__HasReferencedFreeParameters()
   {
      return actionEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUniformNoOperationVisitor()
   {
      return uniformNoOperationVisitorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUniformNoOperationVisitor__VisitForEach__ForEach()
   {
      return uniformNoOperationVisitorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUniformNoOperationVisitor__VisitHeadControlledLoop__HeadControlledLoop()
   {
      return uniformNoOperationVisitorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUniformNoOperationVisitor__VisitIfStatement__IfStatement()
   {
      return uniformNoOperationVisitorEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUniformNoOperationVisitor__VisitTailControlledLoop__TailControlledLoop()
   {
      return uniformNoOperationVisitorEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNodeDeletion()
   {
      return nodeDeletionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNodeDeletion_DestructedVariables()
   {
      return (EReference) nodeDeletionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getIfStatement()
   {
      return ifStatementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getIfStatement__Accept__Visitor()
   {
      return ifStatementEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getIfStatement__GetRelevantScope()
   {
      return ifStatementEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPatternInvocation()
   {
      return patternInvocationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPatternInvocation_Pattern()
   {
      return (EReference) patternInvocationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPatternInvocation_Parameters()
   {
      return (EReference) patternInvocationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocation__HasReferencedFreeParameters()
   {
      return patternInvocationEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getPatternInvocation__IsMultipleMatch()
   {
      return patternInvocationEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getVisitor()
   {
      return visitorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVisitor__VisitHeadControlledLoop__HeadControlledLoop()
   {
      return visitorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVisitor__VisitIfStatement__IfStatement()
   {
      return visitorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVisitor__VisitNode__CFNode()
   {
      return visitorEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVisitor__VisitScope__Scope()
   {
      return visitorEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVisitor__VisitTailControlledLoop__TailControlledLoop()
   {
      return visitorEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVisitor__VisitForEach__ForEach()
   {
      return visitorEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getVariableReference()
   {
      return variableReferenceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableReference_Invocation()
   {
      return (EReference) variableReferenceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableReference_To()
   {
      return (EReference) variableReferenceEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableReference_From()
   {
      return (EReference) variableReferenceEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVariableReference__IsFree()
   {
      return variableReferenceEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVariableReference__IsConstructed()
   {
      return variableReferenceEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getVariableReference__IsReassigned()
   {
      return variableReferenceEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EDataType getAdornment()
   {
      return adornmentEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DemoclesFactory getDemoclesFactory()
   {
      return (DemoclesFactory) getEFactoryInstance();
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
      continueStatementEClass = createEClass(CONTINUE_STATEMENT);

      repetitionNodeEClass = createEClass(REPETITION_NODE);
      createEReference(repetitionNodeEClass, REPETITION_NODE__LAST_NODES);
      createEOperation(repetitionNodeEClass, REPETITION_NODE___HAS_SHORTCUTS);

      loopEClass = createEClass(LOOP);
      createEAttribute(loopEClass, LOOP__LOOP_ALONG_TRUE);
      createEOperation(loopEClass, LOOP___GET_RELEVANT_SCOPE);

      returnStatementEClass = createEClass(RETURN_STATEMENT);

      headControlledLoopEClass = createEClass(HEAD_CONTROLLED_LOOP);
      createEOperation(headControlledLoopEClass, HEAD_CONTROLLED_LOOP___ACCEPT__VISITOR);

      tailControlledLoopEClass = createEClass(TAIL_CONTROLLED_LOOP);
      createEOperation(tailControlledLoopEClass, TAIL_CONTROLLED_LOOP___ACCEPT__VISITOR);

      forEachEClass = createEClass(FOR_EACH);
      createEOperation(forEachEClass, FOR_EACH___ACCEPT__VISITOR);

      compoundNodeEClass = createEClass(COMPOUND_NODE);
      createEReference(compoundNodeEClass, COMPOUND_NODE__SCOPES);
      createEOperation(compoundNodeEClass, COMPOUND_NODE___GET_RELEVANT_SCOPE);

      regularPatternInvocationEClass = createEClass(REGULAR_PATTERN_INVOCATION);
      createEOperation(regularPatternInvocationEClass, REGULAR_PATTERN_INVOCATION___IS_MULTIPLE_MATCH);

      cfVariableEClass = createEClass(CF_VARIABLE);
      createEReference(cfVariableEClass, CF_VARIABLE__REFERENCES);
      createEReference(cfVariableEClass, CF_VARIABLE__SCOPE);
      createEReference(cfVariableEClass, CF_VARIABLE__REASSIGNMENTS);
      createEReference(cfVariableEClass, CF_VARIABLE__CONSTRUCTOR);
      createEReference(cfVariableEClass, CF_VARIABLE__TYPE);
      createEReference(cfVariableEClass, CF_VARIABLE__DESTRUCTORS);
      createEAttribute(cfVariableEClass, CF_VARIABLE__LOCAL);
      createEAttribute(cfVariableEClass, CF_VARIABLE__NAME);
      createEOperation(cfVariableEClass, CF_VARIABLE___IS_ONLY_DEFINED);

      cfNodeEClass = createEClass(CF_NODE);
      createEReference(cfNodeEClass, CF_NODE__SCOPE);
      createEReference(cfNodeEClass, CF_NODE__MAIN_ACTION);
      createEReference(cfNodeEClass, CF_NODE__ACTIONS);
      createEReference(cfNodeEClass, CF_NODE__NEXT);
      createEReference(cfNodeEClass, CF_NODE__PREV);
      createEReference(cfNodeEClass, CF_NODE__ORIGIN);
      createEReference(cfNodeEClass, CF_NODE__HEADER);
      createEAttribute(cfNodeEClass, CF_NODE__ID);
      createEOperation(cfNodeEClass, CF_NODE___ACCEPT__VISITOR);
      createEOperation(cfNodeEClass, CF_NODE___GET_RELEVANT_SCOPE);

      bindingPatternInvocationEClass = createEClass(BINDING_PATTERN_INVOCATION);

      singleResultPatternInvocationEClass = createEClass(SINGLE_RESULT_PATTERN_INVOCATION);
      createEReference(singleResultPatternInvocationEClass, SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE);

      scopeEClass = createEClass(SCOPE);
      createEReference(scopeEClass, SCOPE__PARENT);
      createEReference(scopeEClass, SCOPE__NEXT_SCOPE);
      createEReference(scopeEClass, SCOPE__PREVIOUS_SCOPE);
      createEReference(scopeEClass, SCOPE__CONTENTS);
      createEReference(scopeEClass, SCOPE__VARIABLES);
      createEOperation(scopeEClass, SCOPE___ACCEPT__VISITOR);

      actionEClass = createEClass(ACTION);
      createEReference(actionEClass, ACTION__REASSIGNED_VARIABLES);
      createEReference(actionEClass, ACTION__CF_NODE);
      createEReference(actionEClass, ACTION__CONSTRUCTED_VARIABLES);
      createEReference(actionEClass, ACTION__NEXT);
      createEReference(actionEClass, ACTION__PREV);
      createEOperation(actionEClass, ACTION___HAS_REFERENCED_FREE_PARAMETERS);

      uniformNoOperationVisitorEClass = createEClass(UNIFORM_NO_OPERATION_VISITOR);
      createEOperation(uniformNoOperationVisitorEClass, UNIFORM_NO_OPERATION_VISITOR___VISIT_FOR_EACH__FOREACH);
      createEOperation(uniformNoOperationVisitorEClass, UNIFORM_NO_OPERATION_VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP);
      createEOperation(uniformNoOperationVisitorEClass, UNIFORM_NO_OPERATION_VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT);
      createEOperation(uniformNoOperationVisitorEClass, UNIFORM_NO_OPERATION_VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP);

      nodeDeletionEClass = createEClass(NODE_DELETION);
      createEReference(nodeDeletionEClass, NODE_DELETION__DESTRUCTED_VARIABLES);

      ifStatementEClass = createEClass(IF_STATEMENT);
      createEOperation(ifStatementEClass, IF_STATEMENT___ACCEPT__VISITOR);
      createEOperation(ifStatementEClass, IF_STATEMENT___GET_RELEVANT_SCOPE);

      patternInvocationEClass = createEClass(PATTERN_INVOCATION);
      createEReference(patternInvocationEClass, PATTERN_INVOCATION__PATTERN);
      createEReference(patternInvocationEClass, PATTERN_INVOCATION__PARAMETERS);
      createEOperation(patternInvocationEClass, PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS);
      createEOperation(patternInvocationEClass, PATTERN_INVOCATION___IS_MULTIPLE_MATCH);

      visitorEClass = createEClass(VISITOR);
      createEOperation(visitorEClass, VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP);
      createEOperation(visitorEClass, VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT);
      createEOperation(visitorEClass, VISITOR___VISIT_NODE__CFNODE);
      createEOperation(visitorEClass, VISITOR___VISIT_SCOPE__SCOPE);
      createEOperation(visitorEClass, VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP);
      createEOperation(visitorEClass, VISITOR___VISIT_FOR_EACH__FOREACH);

      variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
      createEReference(variableReferenceEClass, VARIABLE_REFERENCE__INVOCATION);
      createEReference(variableReferenceEClass, VARIABLE_REFERENCE__TO);
      createEReference(variableReferenceEClass, VARIABLE_REFERENCE__FROM);
      createEOperation(variableReferenceEClass, VARIABLE_REFERENCE___IS_FREE);
      createEOperation(variableReferenceEClass, VARIABLE_REFERENCE___IS_CONSTRUCTED);
      createEOperation(variableReferenceEClass, VARIABLE_REFERENCE___IS_REASSIGNED);

      // Create data types
      adornmentEDataType = createEDataType(ADORNMENT);
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
      ActivitiesPackage theActivitiesPackage = (ActivitiesPackage) EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
      SpecificationPackage theSpecificationPackage = (SpecificationPackage) EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      continueStatementEClass.getESuperTypes().add(this.getCFNode());
      repetitionNodeEClass.getESuperTypes().add(this.getCompoundNode());
      loopEClass.getESuperTypes().add(this.getRepetitionNode());
      returnStatementEClass.getESuperTypes().add(this.getCFNode());
      headControlledLoopEClass.getESuperTypes().add(this.getLoop());
      tailControlledLoopEClass.getESuperTypes().add(this.getLoop());
      forEachEClass.getESuperTypes().add(this.getRepetitionNode());
      compoundNodeEClass.getESuperTypes().add(this.getCFNode());
      regularPatternInvocationEClass.getESuperTypes().add(this.getPatternInvocation());
      bindingPatternInvocationEClass.getESuperTypes().add(this.getRegularPatternInvocation());
      singleResultPatternInvocationEClass.getESuperTypes().add(this.getPatternInvocation());
      uniformNoOperationVisitorEClass.getESuperTypes().add(this.getVisitor());
      nodeDeletionEClass.getESuperTypes().add(this.getAction());
      ifStatementEClass.getESuperTypes().add(this.getCompoundNode());
      patternInvocationEClass.getESuperTypes().add(this.getAction());

      // Initialize classes, features, and operations; add parameters
      initEClass(continueStatementEClass, ContinueStatement.class, "ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(repetitionNodeEClass, RepetitionNode.class, "RepetitionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRepetitionNode_LastNodes(), this.getCFNode(), this.getCFNode_Header(), "lastNodes", null, 0, -1, RepetitionNode.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEOperation(getRepetitionNode__HasShortcuts(), ecorePackage.getEBoolean(), "hasShortcuts", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(loopEClass, Loop.class, "Loop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLoop_LoopAlongTrue(), ecorePackage.getEBoolean(), "loopAlongTrue", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEOperation(getLoop__GetRelevantScope(), this.getScope(), "getRelevantScope", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(headControlledLoopEClass, HeadControlledLoop.class, "HeadControlledLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      EOperation op = initEOperation(getHeadControlledLoop__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(tailControlledLoopEClass, TailControlledLoop.class, "TailControlledLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getTailControlledLoop__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(forEachEClass, ForEach.class, "ForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getForEach__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(compoundNodeEClass, CompoundNode.class, "CompoundNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompoundNode_Scopes(), this.getScope(), this.getScope_Parent(), "scopes", null, 1, -1, CompoundNode.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEOperation(getCompoundNode__GetRelevantScope(), this.getScope(), "getRelevantScope", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(regularPatternInvocationEClass, RegularPatternInvocation.class, "RegularPatternInvocation", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      initEOperation(getRegularPatternInvocation__IsMultipleMatch(), ecorePackage.getEBoolean(), "isMultipleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(cfVariableEClass, CFVariable.class, "CFVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCFVariable_References(), this.getVariableReference(), this.getVariableReference_From(), "references", null, 0, -1, CFVariable.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFVariable_Scope(), this.getScope(), this.getScope_Variables(), "scope", null, 1, 1, CFVariable.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFVariable_Reassignments(), this.getAction(), this.getAction_ReassignedVariables(), "reassignments", null, 0, -1, CFVariable.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFVariable_Constructor(), this.getAction(), this.getAction_ConstructedVariables(), "constructor", null, 0, 1, CFVariable.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFVariable_Type(), ecorePackage.getEClassifier(), null, "type", null, 1, 1, CFVariable.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFVariable_Destructors(), this.getNodeDeletion(), this.getNodeDeletion_DestructedVariables(), "destructors", null, 0, -1,
            CFVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
      initEAttribute(getCFVariable_Local(), ecorePackage.getEBoolean(), "local", null, 1, 1, CFVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getCFVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, CFVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEOperation(getCFVariable__IsOnlyDefined(), ecorePackage.getEBoolean(), "isOnlyDefined", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(cfNodeEClass, CFNode.class, "CFNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCFNode_Scope(), this.getScope(), this.getScope_Contents(), "scope", null, 1, 1, CFNode.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFNode_MainAction(), this.getAction(), null, "mainAction", null, 0, 1, CFNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFNode_Actions(), this.getAction(), this.getAction_CfNode(), "actions", null, 0, -1, CFNode.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFNode_Next(), this.getCFNode(), this.getCFNode_Prev(), "next", null, 0, 1, CFNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFNode_Prev(), this.getCFNode(), this.getCFNode_Next(), "prev", null, 0, 1, CFNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFNode_Origin(), theActivitiesPackage.getActivityNode(), null, "origin", null, 0, 1, CFNode.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCFNode_Header(), this.getRepetitionNode(), this.getRepetitionNode_LastNodes(), "header", null, 0, 1, CFNode.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getCFNode_Id(), ecorePackage.getEInt(), "id", null, 1, 1, CFNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getCFNode__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getCFNode__GetRelevantScope(), this.getScope(), "getRelevantScope", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(bindingPatternInvocationEClass, BindingPatternInvocation.class, "BindingPatternInvocation", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      initEClass(singleResultPatternInvocationEClass, SingleResultPatternInvocation.class, "SingleResultPatternInvocation", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSingleResultPatternInvocation_ReturnType(), ecorePackage.getEClassifier(), null, "returnType", null, 0, 1,
            SingleResultPatternInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

      initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getScope_Parent(), this.getCompoundNode(), this.getCompoundNode_Scopes(), "parent", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getScope_NextScope(), this.getScope(), this.getScope_PreviousScope(), "nextScope", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getScope_PreviousScope(), this.getScope(), this.getScope_NextScope(), "previousScope", null, 0, 1, Scope.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getScope_Contents(), this.getCFNode(), this.getCFNode_Scope(), "contents", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getScope_Variables(), this.getCFVariable(), this.getCFVariable_Scope(), "variables", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getScope__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAction_ReassignedVariables(), this.getCFVariable(), this.getCFVariable_Reassignments(), "reassignedVariables", null, 0, -1,
            Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAction_CfNode(), this.getCFNode(), this.getCFNode_Actions(), "cfNode", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAction_ConstructedVariables(), this.getCFVariable(), this.getCFVariable_Constructor(), "constructedVariables", null, 0, -1,
            Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAction_Next(), this.getAction(), this.getAction_Prev(), "next", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAction_Prev(), this.getAction(), this.getAction_Next(), "prev", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEOperation(getAction__HasReferencedFreeParameters(), ecorePackage.getEBoolean(), "hasReferencedFreeParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(uniformNoOperationVisitorEClass, UniformNoOperationVisitor.class, "UniformNoOperationVisitor", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getUniformNoOperationVisitor__VisitForEach__ForEach(), null, "visitForEach", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getForEach(), "forEach", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUniformNoOperationVisitor__VisitHeadControlledLoop__HeadControlledLoop(), null, "visitHeadControlledLoop", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, this.getHeadControlledLoop(), "headControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUniformNoOperationVisitor__VisitIfStatement__IfStatement(), null, "visitIfStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getIfStatement(), "ifStatement", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUniformNoOperationVisitor__VisitTailControlledLoop__TailControlledLoop(), null, "visitTailControlledLoop", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, this.getTailControlledLoop(), "tailControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(nodeDeletionEClass, NodeDeletion.class, "NodeDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNodeDeletion_DestructedVariables(), this.getCFVariable(), this.getCFVariable_Destructors(), "destructedVariables", null, 0, -1,
            NodeDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

      initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getIfStatement__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getIfStatement__GetRelevantScope(), this.getScope(), "getRelevantScope", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(patternInvocationEClass, PatternInvocation.class, "PatternInvocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPatternInvocation_Pattern(), theSpecificationPackage.getPattern(), null, "pattern", null, 1, 1, PatternInvocation.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getPatternInvocation_Parameters(), this.getVariableReference(), this.getVariableReference_Invocation(), "parameters", null, 0, -1,
            PatternInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

      initEOperation(getPatternInvocation__HasReferencedFreeParameters(), ecorePackage.getEBoolean(), "hasReferencedFreeParameters", 0, 1, IS_UNIQUE,
            IS_ORDERED);

      initEOperation(getPatternInvocation__IsMultipleMatch(), ecorePackage.getEBoolean(), "isMultipleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(visitorEClass, Visitor.class, "Visitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getVisitor__VisitHeadControlledLoop__HeadControlledLoop(), null, "visitHeadControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getHeadControlledLoop(), "headControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getVisitor__VisitIfStatement__IfStatement(), null, "visitIfStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getIfStatement(), "ifStatement", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getVisitor__VisitNode__CFNode(), null, "visitNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getVisitor__VisitScope__Scope(), null, "visitScope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getVisitor__VisitTailControlledLoop__TailControlledLoop(), null, "visitTailControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getTailControlledLoop(), "tailControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getVisitor__VisitForEach__ForEach(), null, "visitForEach", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getForEach(), "forEach", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getVariableReference_Invocation(), this.getPatternInvocation(), this.getPatternInvocation_Parameters(), "invocation", null, 1, 1,
            VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
      initEReference(getVariableReference_To(), theSpecificationPackage.getVariable(), null, "to", null, 1, 1, VariableReference.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getVariableReference_From(), this.getCFVariable(), this.getCFVariable_References(), "from", null, 1, 1, VariableReference.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEOperation(getVariableReference__IsFree(), ecorePackage.getEBoolean(), "isFree", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getVariableReference__IsConstructed(), ecorePackage.getEBoolean(), "isConstructed", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getVariableReference__IsReassigned(), ecorePackage.getEBoolean(), "isReassigned", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Initialize data types
      initEDataType(adornmentEDataType, Adornment.class, "Adornment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

      // Create resource
      createResource(eNS_URI);
   }

} //DemoclesPackageImpl
