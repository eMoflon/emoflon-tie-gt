/**
 */
package org.moflon.sdm.democles.literalexpressionsolver;

import MocaTree.Node;

import SDMLanguage.expressions.LiteralExpression;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

import org.gervarro.democles.specification.emf.Constant;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverPackage#getConstantTransformer()
 * @model
 * @generated
 */
public interface ConstantTransformer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Node parse(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Constant transformLiteralExpression(LiteralExpression literalExpression, EClassifier expectedType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canCreateDataTypeFromString(EFactory factory, EDataType dataType, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canCreateEnumLiteralFromString(EEnum eEnum, String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ConstantTransformer
