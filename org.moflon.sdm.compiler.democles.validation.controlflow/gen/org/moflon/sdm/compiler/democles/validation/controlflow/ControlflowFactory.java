/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage
 * @generated
 */
public interface ControlflowFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ControlflowFactory eINSTANCE = org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Validator</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Validator</em>'.
    * @generated
    */
   Validator createValidator();

   /**
    * Returns a new object of class '<em>SDM Activity Graph Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>SDM Activity Graph Builder</em>'.
    * @generated
    */
   SDMActivityGraphBuilder createSDMActivityGraphBuilder();

   /**
    * Returns a new object of class '<em>Cross Edge Analyzer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Cross Edge Analyzer</em>'.
    * @generated
    */
   CrossEdgeAnalyzer createCrossEdgeAnalyzer();

   /**
    * Returns a new object of class '<em>Inefficient Bootstrapping Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Inefficient Bootstrapping Builder</em>'.
    * @generated
    */
   InefficientBootstrappingBuilder createInefficientBootstrappingBuilder();

   /**
    * Returns a new object of class '<em>Sub Tree Tester</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Sub Tree Tester</em>'.
    * @generated
    */
   SubTreeTester createSubTreeTester();

   /**
    * Returns a new object of class '<em>Tree Edge Backward Navigator Terminal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Tree Edge Backward Navigator Terminal</em>'.
    * @generated
    */
   TreeEdgeBackwardNavigatorTerminal createTreeEdgeBackwardNavigatorTerminal();

   /**
    * Returns a new object of class '<em>For Each Component Processor</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>For Each Component Processor</em>'.
    * @generated
    */
   ForEachComponentProcessor createForEachComponentProcessor();

   /**
    * Returns a new object of class '<em>Tree Edge Navigator</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Tree Edge Navigator</em>'.
    * @generated
    */
   TreeEdgeNavigator createTreeEdgeNavigator();

   /**
    * Returns a new object of class '<em>Join Node Finder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Join Node Finder</em>'.
    * @generated
    */
   JoinNodeFinder createJoinNodeFinder();

   /**
    * Returns a new object of class '<em>Moflon Operation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Moflon Operation</em>'.
    * @generated
    */
   MoflonOperation createMoflonOperation();

   /**
    * Returns a new object of class '<em>Default Component Processor</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Default Component Processor</em>'.
    * @generated
    */
   DefaultComponentProcessor createDefaultComponentProcessor();

   /**
    * Returns a new object of class '<em>Control Flow Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Control Flow Builder</em>'.
    * @generated
    */
   ControlFlowBuilder createControlFlowBuilder();

   /**
    * Returns a new object of class '<em>Identifier Allocator</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Identifier Allocator</em>'.
    * @generated
    */
   IdentifierAllocator createIdentifierAllocator();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ControlflowPackage getControlflowPackage();

} //ControlflowFactory
