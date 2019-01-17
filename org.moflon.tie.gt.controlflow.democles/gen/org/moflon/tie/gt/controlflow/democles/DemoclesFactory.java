/**
 */
package org.moflon.tie.gt.controlflow.democles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage
 * @generated
 */
public interface DemoclesFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   DemoclesFactory eINSTANCE = org.moflon.tie.gt.controlflow.democles.impl.DemoclesFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Continue Statement</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Continue Statement</em>'.
    * @generated
    */
   ContinueStatement createContinueStatement();

   /**
    * Returns a new object of class '<em>Return Statement</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Return Statement</em>'.
    * @generated
    */
   ReturnStatement createReturnStatement();

   /**
    * Returns a new object of class '<em>Head Controlled Loop</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Head Controlled Loop</em>'.
    * @generated
    */
   HeadControlledLoop createHeadControlledLoop();

   /**
    * Returns a new object of class '<em>Tail Controlled Loop</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Tail Controlled Loop</em>'.
    * @generated
    */
   TailControlledLoop createTailControlledLoop();

   /**
    * Returns a new object of class '<em>For Each</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>For Each</em>'.
    * @generated
    */
   ForEach createForEach();

   /**
    * Returns a new object of class '<em>Regular Pattern Invocation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Regular Pattern Invocation</em>'.
    * @generated
    */
   RegularPatternInvocation createRegularPatternInvocation();

   /**
    * Returns a new object of class '<em>CF Variable</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>CF Variable</em>'.
    * @generated
    */
   CFVariable createCFVariable();

   /**
    * Returns a new object of class '<em>CF Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>CF Node</em>'.
    * @generated
    */
   CFNode createCFNode();

   /**
    * Returns a new object of class '<em>Binding Pattern Invocation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Binding Pattern Invocation</em>'.
    * @generated
    */
   BindingPatternInvocation createBindingPatternInvocation();

   /**
    * Returns a new object of class '<em>Single Result Pattern Invocation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Single Result Pattern Invocation</em>'.
    * @generated
    */
   SingleResultPatternInvocation createSingleResultPatternInvocation();

   /**
    * Returns a new object of class '<em>Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Scope</em>'.
    * @generated
    */
   Scope createScope();

   /**
    * Returns a new object of class '<em>Action</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Action</em>'.
    * @generated
    */
   Action createAction();

   /**
    * Returns a new object of class '<em>Uniform No Operation Visitor</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Uniform No Operation Visitor</em>'.
    * @generated
    */
   UniformNoOperationVisitor createUniformNoOperationVisitor();

   /**
    * Returns a new object of class '<em>Node Deletion</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Node Deletion</em>'.
    * @generated
    */
   NodeDeletion createNodeDeletion();

   /**
    * Returns a new object of class '<em>If Statement</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>If Statement</em>'.
    * @generated
    */
   IfStatement createIfStatement();

   /**
    * Returns a new object of class '<em>Visitor</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Visitor</em>'.
    * @generated
    */
   Visitor createVisitor();

   /**
    * Returns a new object of class '<em>Variable Reference</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Variable Reference</em>'.
    * @generated
    */
   VariableReference createVariableReference();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   DemoclesPackage getDemoclesPackage();

} //DemoclesFactory
