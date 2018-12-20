/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage
 * @generated
 */
public interface ScopeFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ScopeFactory eINSTANCE = org.moflon.sdm.compiler.democles.validation.scope.impl.ScopeFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Binding Expression Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Binding Expression Builder</em>'.
    * @generated
    */
   BindingExpressionBuilder createBindingExpressionBuilder();

   /**
    * Returns a new object of class '<em>Red Node Deletion Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Red Node Deletion Builder</em>'.
    * @generated
    */
   RedNodeDeletionBuilder createRedNodeDeletionBuilder();

   /**
    * Returns a new object of class '<em>Nac Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Nac Pattern Builder</em>'.
    * @generated
    */
   NacPatternBuilder createNacPatternBuilder();

   /**
    * Returns a new object of class '<em>Red Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Red Pattern Builder</em>'.
    * @generated
    */
   RedPatternBuilder createRedPatternBuilder();

   /**
    * Returns a new object of class '<em>Binding And Black Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Binding And Black Pattern Builder</em>'.
    * @generated
    */
   BindingAndBlackPatternBuilder createBindingAndBlackPatternBuilder();

   /**
    * Returns a new object of class '<em>Black Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Black Pattern Builder</em>'.
    * @generated
    */
   BlackPatternBuilder createBlackPatternBuilder();

   /**
    * Returns a new object of class '<em>Validator</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Validator</em>'.
    * @generated
    */
   ScopeValidator createScopeValidator();

   /**
    * Returns a new object of class '<em>Compound Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Compound Pattern Invocation Builder</em>'.
    * @generated
    */
   CompoundPatternInvocationBuilder createCompoundPatternInvocationBuilder();

   /**
    * Returns a new object of class '<em>Regular Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Regular Pattern Invocation Builder</em>'.
    * @generated
    */
   RegularPatternInvocationBuilder createRegularPatternInvocationBuilder();

   /**
    * Returns a new object of class '<em>Single Result Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Single Result Pattern Invocation Builder</em>'.
    * @generated
    */
   SingleResultPatternInvocationBuilder createSingleResultPatternInvocationBuilder();

   /**
    * Returns a new object of class '<em>Story Node Action Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Story Node Action Builder</em>'.
    * @generated
    */
   StoryNodeActionBuilder createStoryNodeActionBuilder();

   /**
    * Returns a new object of class '<em>Green Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Green Pattern Builder</em>'.
    * @generated
    */
   GreenPatternBuilder createGreenPatternBuilder();

   /**
    * Returns a new object of class '<em>Expression Explorer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Expression Explorer</em>'.
    * @generated
    */
   ExpressionExplorer createExpressionExplorer();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ScopePackage getScopePackage();

} //ScopeFactory
