/**
 */
package org.moflon.sdm.democles.literalexpressionsolver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverPackage
 * @generated
 */
public interface LiteralexpressionsolverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralexpressionsolverFactory eINSTANCE = org.moflon.sdm.democles.literalexpressionsolver.impl.LiteralexpressionsolverFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Constant Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Transformer</em>'.
	 * @generated
	 */
	ConstantTransformer createConstantTransformer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LiteralexpressionsolverPackage getLiteralexpressionsolverPackage();

} //LiteralexpressionsolverFactory
