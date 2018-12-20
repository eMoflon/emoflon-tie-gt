/**
 */
package SDMLanguage.patterns.patternExpressions;

import SDMLanguage.expressions.ExpressionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see SDMLanguage.patterns.patternExpressions.PatternExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patternExpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SDMLanguage/model/SDMLanguage.ecore#//patterns/patternExpressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patternExpressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternExpressionsPackage eINSTANCE = SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.patternExpressions.impl.ObjectRefExpressionImpl <em>Object Ref Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.patternExpressions.impl.ObjectRefExpressionImpl
	 * @see SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl#getObjectRefExpression()
	 * @generated
	 */
	int OBJECT_REF_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_EXPRESSION__OBJECT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Ref Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_EXPRESSION___COMPARE__EXPRESSION = ExpressionsPackage.EXPRESSION___COMPARE__EXPRESSION;

	/**
	 * The number of operations of the '<em>Object Ref Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.patternExpressions.impl.AttributeValueExpressionImpl <em>Attribute Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.patternExpressions.impl.AttributeValueExpressionImpl
	 * @see SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl#getAttributeValueExpression()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__COMMENT = OBJECT_REF_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__OBJECT = OBJECT_REF_EXPRESSION__OBJECT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE = OBJECT_REF_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION_FEATURE_COUNT = OBJECT_REF_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION___COMPARE__EXPRESSION = OBJECT_REF_EXPRESSION___COMPARE__EXPRESSION;

	/**
	 * The number of operations of the '<em>Attribute Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EXPRESSION_OPERATION_COUNT = OBJECT_REF_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.patternExpressions.impl.ObjectVariableExpressionImpl <em>Object Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.patternExpressions.impl.ObjectVariableExpressionImpl
	 * @see SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl#getObjectVariableExpression()
	 * @generated
	 */
	int OBJECT_VARIABLE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION__OBJECT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION___COMPARE__EXPRESSION = ExpressionsPackage.EXPRESSION___COMPARE__EXPRESSION;

	/**
	 * The number of operations of the '<em>Object Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.patternExpressions.AttributeValueExpression <em>Attribute Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Expression</em>'.
	 * @see SDMLanguage.patterns.patternExpressions.AttributeValueExpression
	 * @generated
	 */
	EClass getAttributeValueExpression();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.patternExpressions.AttributeValueExpression#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see SDMLanguage.patterns.patternExpressions.AttributeValueExpression#getAttribute()
	 * @see #getAttributeValueExpression()
	 * @generated
	 */
	EReference getAttributeValueExpression_Attribute();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.patternExpressions.ObjectRefExpression <em>Object Ref Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref Expression</em>'.
	 * @see SDMLanguage.patterns.patternExpressions.ObjectRefExpression
	 * @generated
	 */
	EClass getObjectRefExpression();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.patternExpressions.ObjectRefExpression#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see SDMLanguage.patterns.patternExpressions.ObjectRefExpression#getObject()
	 * @see #getObjectRefExpression()
	 * @generated
	 */
	EReference getObjectRefExpression_Object();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.patternExpressions.ObjectVariableExpression <em>Object Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Variable Expression</em>'.
	 * @see SDMLanguage.patterns.patternExpressions.ObjectVariableExpression
	 * @generated
	 */
	EClass getObjectVariableExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternExpressionsFactory getPatternExpressionsFactory();

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
		 * The meta object literal for the '{@link SDMLanguage.patterns.patternExpressions.impl.AttributeValueExpressionImpl <em>Attribute Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.patternExpressions.impl.AttributeValueExpressionImpl
		 * @see SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl#getAttributeValueExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EXPRESSION = eINSTANCE.getAttributeValueExpression();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE = eINSTANCE.getAttributeValueExpression_Attribute();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.patternExpressions.impl.ObjectRefExpressionImpl <em>Object Ref Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.patternExpressions.impl.ObjectRefExpressionImpl
		 * @see SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl#getObjectRefExpression()
		 * @generated
		 */
		EClass OBJECT_REF_EXPRESSION = eINSTANCE.getObjectRefExpression();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_REF_EXPRESSION__OBJECT = eINSTANCE.getObjectRefExpression_Object();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.patternExpressions.impl.ObjectVariableExpressionImpl <em>Object Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.patternExpressions.impl.ObjectVariableExpressionImpl
		 * @see SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl#getObjectVariableExpression()
		 * @generated
		 */
		EClass OBJECT_VARIABLE_EXPRESSION = eINSTANCE.getObjectVariableExpression();

	}

} //PatternExpressionsPackage
