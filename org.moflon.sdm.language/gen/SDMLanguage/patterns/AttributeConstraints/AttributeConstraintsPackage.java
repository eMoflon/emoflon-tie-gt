/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import SDMLanguage.expressions.ExpressionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface AttributeConstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AttributeConstraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SDMLanguage/model/SDMLanguage.ecore#//patterns/AttributeConstraints";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AttributeConstraints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributeConstraintsPackage eINSTANCE = SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeConstraint()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__STORY_PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeValueConstraintImpl <em>Attribute Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeValueConstraintImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeValueConstraint()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONSTRAINT__STORY_PATTERN = ATTRIBUTE_CONSTRAINT__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER = ATTRIBUTE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE = ATTRIBUTE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONSTRAINT__TYPE = ATTRIBUTE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONSTRAINT_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONSTRAINT_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AssignmentConstraintImpl <em>Assignment Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AssignmentConstraintImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAssignmentConstraint()
	 * @generated
	 */
	int ASSIGNMENT_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONSTRAINT__STORY_PATTERN = ATTRIBUTE_VALUE_CONSTRAINT__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONSTRAINT__PARAMETER = ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONSTRAINT__OBJECT_VARIABLE = ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONSTRAINT__TYPE = ATTRIBUTE_VALUE_CONSTRAINT__TYPE;

	/**
	 * The number of structural features of the '<em>Assignment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONSTRAINT_FEATURE_COUNT = ATTRIBUTE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONSTRAINT_OPERATION_COUNT = ATTRIBUTE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintExpressionImpl <em>Attribute Constraint Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintExpressionImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeConstraintExpression()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Constraint Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION___COMPARE__EXPRESSION = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Constraint Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl <em>Attribute Constraint Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeConstraintVariable()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Attribute Value Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_VARIABLE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Attribute Constraint Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute Constraint Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeLookupConstraintImpl <em>Attribute Lookup Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeLookupConstraintImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeLookupConstraint()
	 * @generated
	 */
	int ATTRIBUTE_LOOKUP_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LOOKUP_CONSTRAINT__STORY_PATTERN = ATTRIBUTE_VALUE_CONSTRAINT__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LOOKUP_CONSTRAINT__PARAMETER = ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LOOKUP_CONSTRAINT__OBJECT_VARIABLE = ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LOOKUP_CONSTRAINT__TYPE = ATTRIBUTE_VALUE_CONSTRAINT__TYPE;

	/**
	 * The number of structural features of the '<em>Attribute Lookup Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LOOKUP_CONSTRAINT_FEATURE_COUNT = ATTRIBUTE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Lookup Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LOOKUP_CONSTRAINT_OPERATION_COUNT = ATTRIBUTE_VALUE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintImpl <em>Csp Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getCspConstraint()
	 * @generated
	 */
	int CSP_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT__STORY_PATTERN = ATTRIBUTE_CONSTRAINT__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT__PARAMETERS = ATTRIBUTE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT__NAME = ATTRIBUTE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Csp Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Csp Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.LiteralVariableImpl <em>Literal Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.LiteralVariableImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getLiteralVariable()
	 * @generated
	 */
	int LITERAL_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VARIABLE__STORY_PATTERN = ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Attribute Value Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS = ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VARIABLE__TYPE = ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VARIABLE__NAME = ATTRIBUTE_CONSTRAINT_VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Literal Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VARIABLE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VARIABLE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.PrimitiveVariableImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getPrimitiveVariable()
	 * @generated
	 */
	int PRIMITIVE_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__STORY_PATTERN = ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Attribute Value Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS = ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__TYPE = ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE__NAME = ATTRIBUTE_CONSTRAINT_VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Primitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_FEATURE_COUNT = ATTRIBUTE_CONSTRAINT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VARIABLE_OPERATION_COUNT = ATTRIBUTE_CONSTRAINT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintVariableReferenceImpl <em>Csp Constraint Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintVariableReferenceImpl
	 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getCspConstraintVariableReference()
	 * @generated
	 */
	int CSP_CONSTRAINT_VARIABLE_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Csp Constraint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Attribute Constraint Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Csp Constraint Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT_VARIABLE_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Csp Constraint Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSP_CONSTRAINT_VARIABLE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.AssignmentConstraint <em>Assignment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Constraint</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AssignmentConstraint
	 * @generated
	 */
	EClass getAssignmentConstraint();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint <em>Attribute Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraint
	 * @generated
	 */
	EClass getAttributeConstraint();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Story Pattern</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraint#getStoryPattern()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_StoryPattern();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression <em>Attribute Constraint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint Expression</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression
	 * @generated
	 */
	EClass getAttributeConstraintExpression();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Variable</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getTargetVariable()
	 * @see #getAttributeConstraintExpression()
	 * @generated
	 */
	EReference getAttributeConstraintExpression_TargetVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getContainedVariables <em>Contained Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Variables</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getContainedVariables()
	 * @see #getAttributeConstraintExpression()
	 * @generated
	 */
	EReference getAttributeConstraintExpression_ContainedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getContainedConstraints <em>Contained Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Constraints</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#getContainedConstraints()
	 * @see #getAttributeConstraintExpression()
	 * @generated
	 */
	EReference getAttributeConstraintExpression_ContainedConstraints();

	/**
	 * Returns the meta object for the '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#compare(SDMLanguage.expressions.Expression) <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression#compare(SDMLanguage.expressions.Expression)
	 * @generated
	 */
	EOperation getAttributeConstraintExpression__Compare__Expression();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable <em>Attribute Constraint Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint Variable</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable
	 * @generated
	 */
	EClass getAttributeConstraintVariable();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Story Pattern</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getStoryPattern()
	 * @see #getAttributeConstraintVariable()
	 * @generated
	 */
	EReference getAttributeConstraintVariable_StoryPattern();

	/**
	 * Returns the meta object for the reference list '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getAttributeValueConstraints <em>Attribute Value Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Value Constraints</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getAttributeValueConstraints()
	 * @see #getAttributeConstraintVariable()
	 * @generated
	 */
	EReference getAttributeConstraintVariable_AttributeValueConstraints();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getType()
	 * @see #getAttributeConstraintVariable()
	 * @generated
	 */
	EReference getAttributeConstraintVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable#getName()
	 * @see #getAttributeConstraintVariable()
	 * @generated
	 */
	EAttribute getAttributeConstraintVariable_Name();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeLookupConstraint <em>Attribute Lookup Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Lookup Constraint</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeLookupConstraint
	 * @generated
	 */
	EClass getAttributeLookupConstraint();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint <em>Attribute Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Constraint</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint
	 * @generated
	 */
	EClass getAttributeValueConstraint();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getParameter()
	 * @see #getAttributeValueConstraint()
	 * @generated
	 */
	EReference getAttributeValueConstraint_Parameter();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Variable</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getObjectVariable()
	 * @see #getAttributeValueConstraint()
	 * @generated
	 */
	EReference getAttributeValueConstraint_ObjectVariable();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint#getType()
	 * @see #getAttributeValueConstraint()
	 * @generated
	 */
	EReference getAttributeValueConstraint_Type();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint <em>Csp Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csp Constraint</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraint
	 * @generated
	 */
	EClass getCspConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraint#getParameters()
	 * @see #getCspConstraint()
	 * @generated
	 */
	EReference getCspConstraint_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraint#getName()
	 * @see #getCspConstraint()
	 * @generated
	 */
	EAttribute getCspConstraint_Name();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.LiteralVariable <em>Literal Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Variable</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.LiteralVariable
	 * @generated
	 */
	EClass getLiteralVariable();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.PrimitiveVariable <em>Primitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Variable</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.PrimitiveVariable
	 * @generated
	 */
	EClass getPrimitiveVariable();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference <em>Csp Constraint Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csp Constraint Variable Reference</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference
	 * @generated
	 */
	EClass getCspConstraintVariableReference();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getCspConstraint <em>Csp Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Csp Constraint</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getCspConstraint()
	 * @see #getCspConstraintVariableReference()
	 * @generated
	 */
	EReference getCspConstraintVariableReference_CspConstraint();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getAttributeConstraintVariable <em>Attribute Constraint Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Constraint Variable</em>'.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getAttributeConstraintVariable()
	 * @see #getCspConstraintVariableReference()
	 * @generated
	 */
	EReference getCspConstraintVariableReference_AttributeConstraintVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AttributeConstraintsFactory getAttributeConstraintsFactory();

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
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AssignmentConstraintImpl <em>Assignment Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AssignmentConstraintImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAssignmentConstraint()
		 * @generated
		 */
		EClass ASSIGNMENT_CONSTRAINT = eINSTANCE.getAssignmentConstraint();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT = eINSTANCE.getAttributeConstraint();

		/**
		 * The meta object literal for the '<em><b>Story Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT__STORY_PATTERN = eINSTANCE.getAttributeConstraint_StoryPattern();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintExpressionImpl <em>Attribute Constraint Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintExpressionImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeConstraintExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT_EXPRESSION = eINSTANCE.getAttributeConstraintExpression();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE = eINSTANCE
				.getAttributeConstraintExpression_TargetVariable();

		/**
		 * The meta object literal for the '<em><b>Contained Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES = eINSTANCE
				.getAttributeConstraintExpression_ContainedVariables();

		/**
		 * The meta object literal for the '<em><b>Contained Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS = eINSTANCE
				.getAttributeConstraintExpression_ContainedConstraints();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_CONSTRAINT_EXPRESSION___COMPARE__EXPRESSION = eINSTANCE
				.getAttributeConstraintExpression__Compare__Expression();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl <em>Attribute Constraint Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeConstraintVariable()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT_VARIABLE = eINSTANCE.getAttributeConstraintVariable();

		/**
		 * The meta object literal for the '<em><b>Story Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN = eINSTANCE
				.getAttributeConstraintVariable_StoryPattern();

		/**
		 * The meta object literal for the '<em><b>Attribute Value Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS = eINSTANCE
				.getAttributeConstraintVariable_AttributeValueConstraints();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE = eINSTANCE.getAttributeConstraintVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT_VARIABLE__NAME = eINSTANCE.getAttributeConstraintVariable_Name();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeLookupConstraintImpl <em>Attribute Lookup Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeLookupConstraintImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeLookupConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_LOOKUP_CONSTRAINT = eINSTANCE.getAttributeLookupConstraint();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeValueConstraintImpl <em>Attribute Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeValueConstraintImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getAttributeValueConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_CONSTRAINT = eINSTANCE.getAttributeValueConstraint();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER = eINSTANCE.getAttributeValueConstraint_Parameter();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE = eINSTANCE.getAttributeValueConstraint_ObjectVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CONSTRAINT__TYPE = eINSTANCE.getAttributeValueConstraint_Type();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintImpl <em>Csp Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getCspConstraint()
		 * @generated
		 */
		EClass CSP_CONSTRAINT = eINSTANCE.getCspConstraint();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSP_CONSTRAINT__PARAMETERS = eINSTANCE.getCspConstraint_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSP_CONSTRAINT__NAME = eINSTANCE.getCspConstraint_Name();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.LiteralVariableImpl <em>Literal Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.LiteralVariableImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getLiteralVariable()
		 * @generated
		 */
		EClass LITERAL_VARIABLE = eINSTANCE.getLiteralVariable();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.PrimitiveVariableImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getPrimitiveVariable()
		 * @generated
		 */
		EClass PRIMITIVE_VARIABLE = eINSTANCE.getPrimitiveVariable();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintVariableReferenceImpl <em>Csp Constraint Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintVariableReferenceImpl
		 * @see SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl#getCspConstraintVariableReference()
		 * @generated
		 */
		EClass CSP_CONSTRAINT_VARIABLE_REFERENCE = eINSTANCE.getCspConstraintVariableReference();

		/**
		 * The meta object literal for the '<em><b>Csp Constraint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT = eINSTANCE
				.getCspConstraintVariableReference_CspConstraint();

		/**
		 * The meta object literal for the '<em><b>Attribute Constraint Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE = eINSTANCE
				.getCspConstraintVariableReference_AttributeConstraintVariable();

	}

} //AttributeConstraintsPackage
