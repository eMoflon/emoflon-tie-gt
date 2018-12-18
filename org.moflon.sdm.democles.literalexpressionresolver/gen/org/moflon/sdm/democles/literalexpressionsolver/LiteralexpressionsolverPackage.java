/**
 */
package org.moflon.sdm.democles.literalexpressionsolver;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.sdm.democles'"
 * @generated
 */
public interface LiteralexpressionsolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "literalexpressionsolver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.sdm.democles.literalexpressionsolver/model/Literalexpressionsolver.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.sdm.democles.literalexpressionsolver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralexpressionsolverPackage eINSTANCE = org.moflon.sdm.democles.literalexpressionsolver.impl.LiteralexpressionsolverPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.moflon.sdm.democles.literalexpressionsolver.impl.ConstantTransformerImpl <em>Constant Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.sdm.democles.literalexpressionsolver.impl.ConstantTransformerImpl
	 * @see org.moflon.sdm.democles.literalexpressionsolver.impl.LiteralexpressionsolverPackageImpl#getConstantTransformer()
	 * @generated
	 */
	int CONSTANT_TRANSFORMER = 0;

	/**
	 * The number of structural features of the '<em>Constant Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TRANSFORMER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Parse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TRANSFORMER___PARSE__STRING = 0;

	/**
	 * The operation id for the '<em>Transform Literal Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TRANSFORMER___TRANSFORM_LITERAL_EXPRESSION__LITERALEXPRESSION_ECLASSIFIER = 1;

	/**
	 * The operation id for the '<em>Can Create Data Type From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TRANSFORMER___CAN_CREATE_DATA_TYPE_FROM_STRING__EFACTORY_EDATATYPE_STRING = 2;

	/**
	 * The operation id for the '<em>Can Create Enum Literal From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TRANSFORMER___CAN_CREATE_ENUM_LITERAL_FROM_STRING__EENUM_STRING = 3;

	/**
	 * The number of operations of the '<em>Constant Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TRANSFORMER_OPERATION_COUNT = 4;

	/**
	 * Returns the meta object for class '{@link org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer <em>Constant Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Transformer</em>'.
	 * @see org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer
	 * @generated
	 */
	EClass getConstantTransformer();

	/**
	 * Returns the meta object for the '{@link org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#parse(java.lang.String) <em>Parse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse</em>' operation.
	 * @see org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#parse(java.lang.String)
	 * @generated
	 */
	EOperation getConstantTransformer__Parse__String();

	/**
	 * Returns the meta object for the '{@link org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#transformLiteralExpression(SDMLanguage.expressions.LiteralExpression, org.eclipse.emf.ecore.EClassifier) <em>Transform Literal Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Literal Expression</em>' operation.
	 * @see org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#transformLiteralExpression(SDMLanguage.expressions.LiteralExpression, org.eclipse.emf.ecore.EClassifier)
	 * @generated
	 */
	EOperation getConstantTransformer__TransformLiteralExpression__LiteralExpression_EClassifier();

	/**
	 * Returns the meta object for the '{@link org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#canCreateDataTypeFromString(org.eclipse.emf.ecore.EFactory, org.eclipse.emf.ecore.EDataType, java.lang.String) <em>Can Create Data Type From String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Create Data Type From String</em>' operation.
	 * @see org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#canCreateDataTypeFromString(org.eclipse.emf.ecore.EFactory, org.eclipse.emf.ecore.EDataType, java.lang.String)
	 * @generated
	 */
	EOperation getConstantTransformer__CanCreateDataTypeFromString__EFactory_EDataType_String();

	/**
	 * Returns the meta object for the '{@link org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#canCreateEnumLiteralFromString(org.eclipse.emf.ecore.EEnum, java.lang.String) <em>Can Create Enum Literal From String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Create Enum Literal From String</em>' operation.
	 * @see org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer#canCreateEnumLiteralFromString(org.eclipse.emf.ecore.EEnum, java.lang.String)
	 * @generated
	 */
	EOperation getConstantTransformer__CanCreateEnumLiteralFromString__EEnum_String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LiteralexpressionsolverFactory getLiteralexpressionsolverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.moflon.sdm.democles.literalexpressionsolver.impl.ConstantTransformerImpl <em>Constant Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.sdm.democles.literalexpressionsolver.impl.ConstantTransformerImpl
		 * @see org.moflon.sdm.democles.literalexpressionsolver.impl.LiteralexpressionsolverPackageImpl#getConstantTransformer()
		 * @generated
		 */
		EClass CONSTANT_TRANSFORMER = eINSTANCE.getConstantTransformer();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTANT_TRANSFORMER___PARSE__STRING = eINSTANCE.getConstantTransformer__Parse__String();

		/**
		 * The meta object literal for the '<em><b>Transform Literal Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTANT_TRANSFORMER___TRANSFORM_LITERAL_EXPRESSION__LITERALEXPRESSION_ECLASSIFIER = eINSTANCE
				.getConstantTransformer__TransformLiteralExpression__LiteralExpression_EClassifier();

		/**
		 * The meta object literal for the '<em><b>Can Create Data Type From String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTANT_TRANSFORMER___CAN_CREATE_DATA_TYPE_FROM_STRING__EFACTORY_EDATATYPE_STRING = eINSTANCE
				.getConstantTransformer__CanCreateDataTypeFromString__EFactory_EDataType_String();

		/**
		 * The meta object literal for the '<em><b>Can Create Enum Literal From String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTANT_TRANSFORMER___CAN_CREATE_ENUM_LITERAL_FROM_STRING__EENUM_STRING = eINSTANCE
				.getConstantTransformer__CanCreateEnumLiteralFromString__EEnum_String();

	}

} //LiteralexpressionsolverPackage
