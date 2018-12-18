/**
 */
package SDMLanguage.patterns;

import SDMLanguage.SDMLanguagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see SDMLanguage.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SDMLanguage/model/SDMLanguage.ecore#//patterns";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = SDMLanguage.patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.impl.StoryPatternImpl
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getStoryPattern()
	 * @generated
	 */
	int STORY_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__COMMENT = SDMLanguagePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__OBJECT_VARIABLE = SDMLanguagePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__LINK_VARIABLE = SDMLanguagePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__CONSTRAINTS = SDMLanguagePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__VARIABLES = SDMLanguagePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Application Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__APPLICATION_CONDITIONS = SDMLanguagePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Story Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN__STORY_NODE = SDMLanguagePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_FEATURE_COUNT = SDMLanguagePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OPERATION_COUNT = SDMLanguagePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.impl.ApplicationConditionStoryPatternImpl <em>Application Condition Story Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.impl.ApplicationConditionStoryPatternImpl
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getApplicationConditionStoryPattern()
	 * @generated
	 */
	int APPLICATION_CONDITION_STORY_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__COMMENT = STORY_PATTERN__COMMENT;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__OBJECT_VARIABLE = STORY_PATTERN__OBJECT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Link Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__LINK_VARIABLE = STORY_PATTERN__LINK_VARIABLE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__CONSTRAINTS = STORY_PATTERN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__VARIABLES = STORY_PATTERN__VARIABLES;

	/**
	 * The feature id for the '<em><b>Application Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__APPLICATION_CONDITIONS = STORY_PATTERN__APPLICATION_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Story Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__STORY_NODE = STORY_PATTERN__STORY_NODE;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN__STORY_PATTERN = STORY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Condition Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN_FEATURE_COUNT = STORY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application Condition Story Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONDITION_STORY_PATTERN_OPERATION_COUNT = STORY_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.impl.AttributeAssignmentImpl
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.impl.ConstraintImpl
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Constraint Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Object Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OBJECT_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.impl.LinkVariableImpl
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getLinkVariable()
	 * @generated
	 */
	int LINK_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__NAME = SDMLanguagePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__TARGET = SDMLanguagePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__SOURCE = SDMLanguagePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__PATTERN = SDMLanguagePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__TYPE = SDMLanguagePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__BINDING_OPERATOR = SDMLanguagePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE__BINDING_SEMANTICS = SDMLanguagePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE_FEATURE_COUNT = SDMLanguagePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Link Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VARIABLE_OPERATION_COUNT = SDMLanguagePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.impl.ObjectVariableImpl
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getObjectVariable()
	 * @generated
	 */
	int OBJECT_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__TYPE = SDMLanguagePackage.TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__NAME = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__CONSTRAINT = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_EXPRESSION = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__PATTERN = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__INCOMING_LINK = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__OUTGOING_LINK = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_OPERATOR = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_SEMANTICS = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Binding State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE__BINDING_STATE = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Object Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_FEATURE_COUNT = SDMLanguagePackage.TYPED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Object Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_OPERATION_COUNT = SDMLanguagePackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.BindingOperator <em>Binding Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.BindingOperator
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getBindingOperator()
	 * @generated
	 */
	int BINDING_OPERATOR = 6;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.BindingSemantics
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getBindingSemantics()
	 * @generated
	 */
	int BINDING_SEMANTICS = 7;

	/**
	 * The meta object id for the '{@link SDMLanguage.patterns.BindingState <em>Binding State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.patterns.BindingState
	 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getBindingState()
	 * @generated
	 */
	int BINDING_STATE = 8;

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.ApplicationConditionStoryPattern <em>Application Condition Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Condition Story Pattern</em>'.
	 * @see SDMLanguage.patterns.ApplicationConditionStoryPattern
	 * @generated
	 */
	EClass getApplicationConditionStoryPattern();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.ApplicationConditionStoryPattern#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Story Pattern</em>'.
	 * @see SDMLanguage.patterns.ApplicationConditionStoryPattern#getStoryPattern()
	 * @see #getApplicationConditionStoryPattern()
	 * @generated
	 */
	EReference getApplicationConditionStoryPattern_StoryPattern();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment</em>'.
	 * @see SDMLanguage.patterns.AttributeAssignment
	 * @generated
	 */
	EClass getAttributeAssignment();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Variable</em>'.
	 * @see SDMLanguage.patterns.AttributeAssignment#getObjectVariable()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_ObjectVariable();

	/**
	 * Returns the meta object for the containment reference '{@link SDMLanguage.patterns.AttributeAssignment#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see SDMLanguage.patterns.AttributeAssignment#getValueExpression()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_ValueExpression();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.AttributeAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see SDMLanguage.patterns.AttributeAssignment#getAttribute()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_Attribute();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see SDMLanguage.patterns.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link SDMLanguage.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Expression</em>'.
	 * @see SDMLanguage.patterns.Constraint#getConstraintExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstraintExpression();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Variable</em>'.
	 * @see SDMLanguage.patterns.Constraint#getObjectVariable()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ObjectVariable();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.LinkVariable <em>Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Variable</em>'.
	 * @see SDMLanguage.patterns.LinkVariable
	 * @generated
	 */
	EClass getLinkVariable();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.LinkVariable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see SDMLanguage.patterns.LinkVariable#getTarget()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_Target();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.LinkVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see SDMLanguage.patterns.LinkVariable#getSource()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_Source();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.LinkVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see SDMLanguage.patterns.LinkVariable#getPattern()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_Pattern();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.patterns.LinkVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SDMLanguage.patterns.LinkVariable#getType()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EReference getLinkVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.patterns.LinkVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see SDMLanguage.patterns.LinkVariable#getBindingOperator()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EAttribute getLinkVariable_BindingOperator();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.patterns.LinkVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see SDMLanguage.patterns.LinkVariable#getBindingSemantics()
	 * @see #getLinkVariable()
	 * @generated
	 */
	EAttribute getLinkVariable_BindingSemantics();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.ObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Variable</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable
	 * @generated
	 */
	EClass getObjectVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.ObjectVariable#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getConstraint()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link SDMLanguage.patterns.ObjectVariable#getBindingExpression <em>Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Expression</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getBindingExpression()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_BindingExpression();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.ObjectVariable#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getPattern()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_Pattern();

	/**
	 * Returns the meta object for the reference list '{@link SDMLanguage.patterns.ObjectVariable#getIncomingLink <em>Incoming Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Link</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getIncomingLink()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_IncomingLink();

	/**
	 * Returns the meta object for the reference list '{@link SDMLanguage.patterns.ObjectVariable#getOutgoingLink <em>Outgoing Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Link</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getOutgoingLink()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_OutgoingLink();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.ObjectVariable#getAttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Assignment</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getAttributeAssignment()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EReference getObjectVariable_AttributeAssignment();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Operator</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getBindingOperator()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EAttribute getObjectVariable_BindingOperator();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Semantics</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getBindingSemantics()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EAttribute getObjectVariable_BindingSemantics();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.patterns.ObjectVariable#getBindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding State</em>'.
	 * @see SDMLanguage.patterns.ObjectVariable#getBindingState()
	 * @see #getObjectVariable()
	 * @generated
	 */
	EAttribute getObjectVariable_BindingState();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.patterns.StoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern</em>'.
	 * @see SDMLanguage.patterns.StoryPattern
	 * @generated
	 */
	EClass getStoryPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.StoryPattern#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Variable</em>'.
	 * @see SDMLanguage.patterns.StoryPattern#getObjectVariable()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_ObjectVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.StoryPattern#getLinkVariable <em>Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Variable</em>'.
	 * @see SDMLanguage.patterns.StoryPattern#getLinkVariable()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_LinkVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.StoryPattern#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see SDMLanguage.patterns.StoryPattern#getConstraints()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.StoryPattern#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see SDMLanguage.patterns.StoryPattern#getVariables()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.patterns.StoryPattern#getApplicationConditions <em>Application Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Conditions</em>'.
	 * @see SDMLanguage.patterns.StoryPattern#getApplicationConditions()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_ApplicationConditions();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.patterns.StoryPattern#getStoryNode <em>Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Story Node</em>'.
	 * @see SDMLanguage.patterns.StoryPattern#getStoryNode()
	 * @see #getStoryPattern()
	 * @generated
	 */
	EReference getStoryPattern_StoryNode();

	/**
	 * Returns the meta object for enum '{@link SDMLanguage.patterns.BindingOperator <em>Binding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Operator</em>'.
	 * @see SDMLanguage.patterns.BindingOperator
	 * @generated
	 */
	EEnum getBindingOperator();

	/**
	 * Returns the meta object for enum '{@link SDMLanguage.patterns.BindingSemantics <em>Binding Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Semantics</em>'.
	 * @see SDMLanguage.patterns.BindingSemantics
	 * @generated
	 */
	EEnum getBindingSemantics();

	/**
	 * Returns the meta object for enum '{@link SDMLanguage.patterns.BindingState <em>Binding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding State</em>'.
	 * @see SDMLanguage.patterns.BindingState
	 * @generated
	 */
	EEnum getBindingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

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
		 * The meta object literal for the '{@link SDMLanguage.patterns.impl.ApplicationConditionStoryPatternImpl <em>Application Condition Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.impl.ApplicationConditionStoryPatternImpl
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getApplicationConditionStoryPattern()
		 * @generated
		 */
		EClass APPLICATION_CONDITION_STORY_PATTERN = eINSTANCE.getApplicationConditionStoryPattern();

		/**
		 * The meta object literal for the '<em><b>Story Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_CONDITION_STORY_PATTERN__STORY_PATTERN = eINSTANCE
				.getApplicationConditionStoryPattern_StoryPattern();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.impl.AttributeAssignmentImpl
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT = eINSTANCE.getAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = eINSTANCE.getAttributeAssignment_ObjectVariable();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = eINSTANCE.getAttributeAssignment_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAttributeAssignment_Attribute();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.impl.ConstraintImpl
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINT_EXPRESSION = eINSTANCE.getConstraint_ConstraintExpression();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__OBJECT_VARIABLE = eINSTANCE.getConstraint_ObjectVariable();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.impl.LinkVariableImpl
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getLinkVariable()
		 * @generated
		 */
		EClass LINK_VARIABLE = eINSTANCE.getLinkVariable();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__TARGET = eINSTANCE.getLinkVariable_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__SOURCE = eINSTANCE.getLinkVariable_Source();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__PATTERN = eINSTANCE.getLinkVariable_Pattern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VARIABLE__TYPE = eINSTANCE.getLinkVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_VARIABLE__BINDING_OPERATOR = eINSTANCE.getLinkVariable_BindingOperator();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getLinkVariable_BindingSemantics();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.impl.ObjectVariableImpl
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getObjectVariable()
		 * @generated
		 */
		EClass OBJECT_VARIABLE = eINSTANCE.getObjectVariable();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__CONSTRAINT = eINSTANCE.getObjectVariable_Constraint();

		/**
		 * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__BINDING_EXPRESSION = eINSTANCE.getObjectVariable_BindingExpression();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__PATTERN = eINSTANCE.getObjectVariable_Pattern();

		/**
		 * The meta object literal for the '<em><b>Incoming Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__INCOMING_LINK = eINSTANCE.getObjectVariable_IncomingLink();

		/**
		 * The meta object literal for the '<em><b>Outgoing Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__OUTGOING_LINK = eINSTANCE.getObjectVariable_OutgoingLink();

		/**
		 * The meta object literal for the '<em><b>Attribute Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT = eINSTANCE.getObjectVariable_AttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VARIABLE__BINDING_OPERATOR = eINSTANCE.getObjectVariable_BindingOperator();

		/**
		 * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getObjectVariable_BindingSemantics();

		/**
		 * The meta object literal for the '<em><b>Binding State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VARIABLE__BINDING_STATE = eINSTANCE.getObjectVariable_BindingState();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.impl.StoryPatternImpl
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getStoryPattern()
		 * @generated
		 */
		EClass STORY_PATTERN = eINSTANCE.getStoryPattern();

		/**
		 * The meta object literal for the '<em><b>Object Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__OBJECT_VARIABLE = eINSTANCE.getStoryPattern_ObjectVariable();

		/**
		 * The meta object literal for the '<em><b>Link Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__LINK_VARIABLE = eINSTANCE.getStoryPattern_LinkVariable();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__CONSTRAINTS = eINSTANCE.getStoryPattern_Constraints();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__VARIABLES = eINSTANCE.getStoryPattern_Variables();

		/**
		 * The meta object literal for the '<em><b>Application Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__APPLICATION_CONDITIONS = eINSTANCE.getStoryPattern_ApplicationConditions();

		/**
		 * The meta object literal for the '<em><b>Story Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN__STORY_NODE = eINSTANCE.getStoryPattern_StoryNode();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.BindingOperator <em>Binding Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.BindingOperator
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getBindingOperator()
		 * @generated
		 */
		EEnum BINDING_OPERATOR = eINSTANCE.getBindingOperator();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.BindingSemantics
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getBindingSemantics()
		 * @generated
		 */
		EEnum BINDING_SEMANTICS = eINSTANCE.getBindingSemantics();

		/**
		 * The meta object literal for the '{@link SDMLanguage.patterns.BindingState <em>Binding State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.patterns.BindingState
		 * @see SDMLanguage.patterns.impl.PatternsPackageImpl#getBindingState()
		 * @generated
		 */
		EEnum BINDING_STATE = eINSTANCE.getBindingState();

	}

} //PatternsPackage
