/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   PatternFactory eINSTANCE = org.moflon.sdm.compiler.democles.pattern.impl.PatternFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Green Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Green Pattern Transformer</em>'.
    * @generated
    */
   GreenPatternTransformer createGreenPatternTransformer();

   /**
    * Returns a new object of class '<em>Variable Handler</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Variable Handler</em>'.
    * @generated
    */
   PatternVariableHandler createPatternVariableHandler();

   /**
    * Returns a new object of class '<em>Black And Nac Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Black And Nac Pattern Transformer</em>'.
    * @generated
    */
   BlackAndNacPatternTransformer createBlackAndNacPatternTransformer();

   /**
    * Returns a new object of class '<em>Nac Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Nac Pattern Transformer</em>'.
    * @generated
    */
   NacPatternTransformer createNacPatternTransformer();

   /**
    * Returns a new object of class '<em>Binding Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Binding Pattern Transformer</em>'.
    * @generated
    */
   BindingPatternTransformer createBindingPatternTransformer();

   /**
    * Returns a new object of class '<em>Default Expression Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Default Expression Transformer</em>'.
    * @generated
    */
   DefaultExpressionTransformer createDefaultExpressionTransformer();

   /**
    * Returns a new object of class '<em>Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Transformer</em>'.
    * @generated
    */
   PatternTransformer createPatternTransformer();

   /**
    * Returns a new object of class '<em>Red Pattern Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Red Pattern Transformer</em>'.
    * @generated
    */
   RedPatternTransformer createRedPatternTransformer();

   /**
    * Returns a new object of class '<em>Literal Expression Transformer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Literal Expression Transformer</em>'.
    * @generated
    */
   LiteralExpressionTransformer createLiteralExpressionTransformer();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   PatternPackage getPatternPackage();

} //PatternFactory
