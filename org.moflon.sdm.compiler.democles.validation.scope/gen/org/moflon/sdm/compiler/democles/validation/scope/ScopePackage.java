/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.sdm.runtime.democles.DemoclesPackage;

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
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.sdm.compiler.democles.validation'"
 * @generated
 */
public interface ScopePackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "scope";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "platform:/plugin/org.moflon.sdm.compiler.democles.validation.scope/model/Scope.ecore";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "org.moflon.sdm.compiler.democles.validation.scope";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ScopePackage eINSTANCE = org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl.init();

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ActionBuilderImpl <em>Action Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ActionBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getActionBuilder()
    * @generated
    */
   int ACTION_BUILDER = 6;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER__VALIDATOR = 0;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER__PARENT = 1;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER__RESULT = 2;

   /**
    * The number of structural features of the '<em>Action Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER_FEATURE_COUNT = 3;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION = 0;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER___BUILD_ACTION__CFNODE = 1;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER___LOOKUP_ACTION__CFNODE = 2;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = 3;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR = 4;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = 5;

   /**
    * The number of operations of the '<em>Action Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_BUILDER_OPERATION_COUNT = 6;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternInvocationBuilderImpl <em>Pattern Invocation Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.PatternInvocationBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getPatternInvocationBuilder()
    * @generated
    */
   int PATTERN_INVOCATION_BUILDER = 12;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER__VALIDATOR = ACTION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER__PARENT = ACTION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER__RESULT = ACTION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER = ACTION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER = ACTION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER__SUFFIX = ACTION_BUILDER_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER_FEATURE_COUNT = ACTION_BUILDER_FEATURE_COUNT + 3;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION = ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE = ACTION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR = ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = ACTION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = ACTION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = ACTION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___CREATE_ACTION = ACTION_BUILDER_OPERATION_COUNT + 3;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = ACTION_BUILDER_OPERATION_COUNT + 4;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = ACTION_BUILDER_OPERATION_COUNT + 5;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___HAS_ERRORS = ACTION_BUILDER_OPERATION_COUNT + 6;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE = ACTION_BUILDER_OPERATION_COUNT + 7;

   /**
    * The number of operations of the '<em>Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_BUILDER_OPERATION_COUNT = ACTION_BUILDER_OPERATION_COUNT + 8;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RegularPatternInvocationBuilderImpl <em>Regular Pattern Invocation Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.RegularPatternInvocationBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getRegularPatternInvocationBuilder()
    * @generated
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER = 9;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__VALIDATOR = PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__PARENT = PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__RESULT = PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER = PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER = PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__SUFFIX = PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER = PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER = PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER = PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Regular Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT = PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 3;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION = PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___HAS_ERRORS = PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE = PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 0;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 3;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 4;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 5;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 6;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 7;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 8;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 9;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 10;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 11;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 12;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 13;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 14;

   /**
    * The number of operations of the '<em>Regular Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 15;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.BindingExpressionBuilderImpl <em>Binding Expression Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.BindingExpressionBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getBindingExpressionBuilder()
    * @generated
    */
   int BINDING_EXPRESSION_BUILDER = 0;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__PARENT = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__RESULT = REGULAR_PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__EXPRESSION_EXPLORER = REGULAR_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__PATTERN_MATCHER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__SUFFIX = REGULAR_PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__PARENT_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__PATTERN_TRANSFORMER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER__MAIN_ACTION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER;

   /**
    * The number of structural features of the '<em>Binding Expression Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER_FEATURE_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___ADD_ACTION__CFNODE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___HAS_ERRORS = REGULAR_PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___LOOKUP_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___BUILD_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___GET_PATTERN_INVOCATION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___LOOKUP_SCOPE_VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 0;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___CREATE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The number of operations of the '<em>Binding Expression Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_EXPRESSION_BUILDER_OPERATION_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RedNodeDeletionBuilderImpl <em>Red Node Deletion Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.RedNodeDeletionBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getRedNodeDeletionBuilder()
    * @generated
    */
   int RED_NODE_DELETION_BUILDER = 1;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER__VALIDATOR = ACTION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER__PARENT = ACTION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER__RESULT = ACTION_BUILDER__RESULT;

   /**
    * The number of structural features of the '<em>Red Node Deletion Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER_FEATURE_COUNT = ACTION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER___ADD_ACTION__CFNODE_ACTION = ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER___LOOKUP_SCOPE_VALIDATOR = ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER___BUILD_ACTION__CFNODE = ACTION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER___LOOKUP_ACTION__CFNODE = ACTION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = ACTION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The number of operations of the '<em>Red Node Deletion Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_NODE_DELETION_BUILDER_OPERATION_COUNT = ACTION_BUILDER_OPERATION_COUNT + 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.NacPatternBuilderImpl <em>Nac Pattern Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.NacPatternBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getNacPatternBuilder()
    * @generated
    */
   int NAC_PATTERN_BUILDER = 2;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__PARENT = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__RESULT = REGULAR_PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__EXPRESSION_EXPLORER = REGULAR_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__PATTERN_MATCHER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__SUFFIX = REGULAR_PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__PARENT_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__PATTERN_TRANSFORMER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__MAIN_ACTION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER;

   /**
    * The feature id for the '<em><b>Nac Pattern Counter</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER = REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Nac Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER_FEATURE_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___ADD_ACTION__CFNODE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___HAS_ERRORS = REGULAR_PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___BUILD_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___CREATE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___GET_PATTERN_INVOCATION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___LOOKUP_SCOPE_VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___ATTACH_TO_RESOURCE__PATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Create All Bound Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___CREATE_ALL_BOUND_ADORNMENT__PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 3;

   /**
    * The operation id for the '<em>Create Nac Pattern Name And Increment Counter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___CREATE_NAC_PATTERN_NAME_AND_INCREMENT_COUNTER__PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 4;

   /**
    * The operation id for the '<em>Embed Nac Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___EMBED_NAC_PATTERN__PATTERN_PATTERNINVOCATIONCONSTRAINT_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 5;

   /**
    * The operation id for the '<em>Explore Nac Pattern Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___EXPLORE_NAC_PATTERN_VARIABLES__OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 6;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 7;

   /**
    * The operation id for the '<em>Handle Simple Nac Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___HANDLE_SIMPLE_NAC_PATTERN__STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 8;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 9;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 10;

   /**
    * The number of operations of the '<em>Nac Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_BUILDER_OPERATION_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 11;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RedPatternBuilderImpl <em>Red Pattern Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.RedPatternBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getRedPatternBuilder()
    * @generated
    */
   int RED_PATTERN_BUILDER = 3;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__PARENT = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__RESULT = REGULAR_PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__EXPRESSION_EXPLORER = REGULAR_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__PATTERN_MATCHER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__SUFFIX = REGULAR_PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__PARENT_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__PATTERN_TRANSFORMER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER__MAIN_ACTION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER;

   /**
    * The number of structural features of the '<em>Red Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER_FEATURE_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___ADD_ACTION__CFNODE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___HAS_ERRORS = REGULAR_PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___BUILD_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___CREATE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___GET_PATTERN_INVOCATION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___LOOKUP_SCOPE_VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Red Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_BUILDER_OPERATION_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundPatternInvocationBuilderImpl <em>Compound Pattern Invocation Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundPatternInvocationBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getCompoundPatternInvocationBuilder()
    * @generated
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER = 8;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__PARENT = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__RESULT = REGULAR_PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER = REGULAR_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__SUFFIX = REGULAR_PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER;

   /**
    * The feature id for the '<em><b>Child Builders</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS = REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Compound Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___HAS_ERRORS = REGULAR_PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___CREATE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN;

   /**
    * The number of operations of the '<em>Compound Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.BindingAndBlackPatternBuilderImpl <em>Binding And Black Pattern Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.BindingAndBlackPatternBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getBindingAndBlackPatternBuilder()
    * @generated
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER = 4;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__VALIDATOR = COMPOUND_PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__PARENT = COMPOUND_PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__RESULT = COMPOUND_PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__EXPRESSION_EXPLORER = COMPOUND_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__PATTERN_MATCHER = COMPOUND_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__SUFFIX = COMPOUND_PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__PARENT_BUILDER = COMPOUND_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__PATTERN_TRANSFORMER = COMPOUND_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__MAIN_ACTION_BUILDER = COMPOUND_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER;

   /**
    * The feature id for the '<em><b>Child Builders</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__CHILD_BUILDERS = COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS;

   /**
    * The feature id for the '<em><b>Black Pattern Builder</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER = COMPOUND_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Binding And Black Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER_FEATURE_COUNT = COMPOUND_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___ADD_ACTION__CFNODE_ACTION = COMPOUND_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = COMPOUND_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = COMPOUND_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___HAS_ERRORS = COMPOUND_PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE = COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___CREATE_ACTION = COMPOUND_PATTERN_INVOCATION_BUILDER___CREATE_ACTION;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___GET_PATTERN_INVOCATION_BUILDER = COMPOUND_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___LOOKUP_SCOPE_VALIDATOR = COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 0;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION__CFNODE = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Build Action In Super Class</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION_IN_SUPER_CLASS__CFNODE = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 3;

   /**
    * The operation id for the '<em>Calculate Next Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_NEXT_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 4;

   /**
    * The operation id for the '<em>Calculate Pattern Invocation Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_PATTERN_INVOCATION_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 5;

   /**
    * The operation id for the '<em>Construct Embedded Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___CONSTRUCT_EMBEDDED_PATTERN__REGULARPATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 6;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 7;

   /**
    * The operation id for the '<em>Process Child Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___PROCESS_CHILD_PATTERN__REGULARPATTERNINVOCATIONBUILDER_REGULARPATTERNINVOCATION_STORYPATTERN_ADORNMENT = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 8;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 9;

   /**
    * The number of operations of the '<em>Binding And Black Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_AND_BLACK_PATTERN_BUILDER_OPERATION_COUNT = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 10;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.BlackPatternBuilderImpl <em>Black Pattern Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.BlackPatternBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getBlackPatternBuilder()
    * @generated
    */
   int BLACK_PATTERN_BUILDER = 5;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__VALIDATOR = COMPOUND_PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__PARENT = COMPOUND_PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__RESULT = COMPOUND_PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__EXPRESSION_EXPLORER = COMPOUND_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__PATTERN_MATCHER = COMPOUND_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__SUFFIX = COMPOUND_PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__PARENT_BUILDER = COMPOUND_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__PATTERN_TRANSFORMER = COMPOUND_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__MAIN_ACTION_BUILDER = COMPOUND_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER;

   /**
    * The feature id for the '<em><b>Child Builders</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER__CHILD_BUILDERS = COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS;

   /**
    * The number of structural features of the '<em>Black Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER_FEATURE_COUNT = COMPOUND_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___ADD_ACTION__CFNODE_ACTION = COMPOUND_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = COMPOUND_PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = COMPOUND_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = COMPOUND_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___HAS_ERRORS = COMPOUND_PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE = COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___BUILD_ACTION__CFNODE = COMPOUND_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___CREATE_ACTION = COMPOUND_PATTERN_INVOCATION_BUILDER___CREATE_ACTION;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___GET_PATTERN_INVOCATION_BUILDER = COMPOUND_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = COMPOUND_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = COMPOUND_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___LOOKUP_SCOPE_VALIDATOR = COMPOUND_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Analyze Dependencies In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES_IN_SUPERCLASS__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 1;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Build Pattern Content In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT_IN_SUPERCLASS__REGULARPATTERNINVOCATION_STORYPATTERN = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT
         + 3;

   /**
    * The number of operations of the '<em>Black Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_PATTERN_BUILDER_OPERATION_COUNT = COMPOUND_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 4;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ScopeValidatorImpl <em>Validator</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopeValidatorImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getScopeValidator()
    * @generated
    */
   int SCOPE_VALIDATOR = 7;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR__VALIDATION_REPORT = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Action Builders</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR__ACTION_BUILDERS = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Validator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR_FEATURE_COUNT = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Visit For Each</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___VISIT_FOR_EACH__FOREACH = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_FOR_EACH__FOREACH;

   /**
    * The operation id for the '<em>Visit Head Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP;

   /**
    * The operation id for the '<em>Visit If Statement</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___VISIT_IF_STATEMENT__IFSTATEMENT = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT;

   /**
    * The operation id for the '<em>Visit Tail Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP;

   /**
    * The operation id for the '<em>Analyze Link Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___ANALYZE_LINK_VARIABLE__CFNODE_LINKVARIABLE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Analyze Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___ANALYZE_OBJECT_VARIABLE__CFNODE_OBJECTVARIABLE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Check Deletion Of Bound Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___CHECK_DELETION_OF_BOUND_VARIABLE__OBJECTVARIABLE_CFVARIABLE_CFNODE_CFNODE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT
         + 2;

   /**
    * The operation id for the '<em>Check Red Bound Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___CHECK_RED_BOUND_VARIABLE__CFVARIABLE_SCOPE_OBJECTVARIABLE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 3;

   /**
    * The operation id for the '<em>Follows In Same Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___FOLLOWS_IN_SAME_SCOPE__CFNODE_CFNODE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 4;

   /**
    * The operation id for the '<em>Is Null</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___IS_NULL__CFVARIABLE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 5;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___LOOKUP_CONTROL_FLOW_VARIABLE__CFNODE_STRING = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 6;

   /**
    * The operation id for the '<em>Lookup Error Message</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 7;

   /**
    * The operation id for the '<em>Visit Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___VISIT_NODE__CFNODE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 8;

   /**
    * The operation id for the '<em>Visit Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR___VISIT_SCOPE__SCOPE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 9;

   /**
    * The number of operations of the '<em>Validator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_VALIDATOR_OPERATION_COUNT = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 10;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternMatcherImpl <em>Pattern Matcher</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.PatternMatcherImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getPatternMatcher()
    * @generated
    */
   int PATTERN_MATCHER = 10;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_MATCHER__VALIDATION_REPORT = 0;

   /**
    * The number of structural features of the '<em>Pattern Matcher</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_MATCHER_FEATURE_COUNT = 1;

   /**
    * The operation id for the '<em>Generate Search Plan</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_MATCHER___GENERATE_SEARCH_PLAN__PATTERN_ADORNMENT_BOOLEAN = 0;

   /**
    * The number of operations of the '<em>Pattern Matcher</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_MATCHER_OPERATION_COUNT = 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.SingleResultPatternInvocationBuilderImpl <em>Single Result Pattern Invocation Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.SingleResultPatternInvocationBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getSingleResultPatternInvocationBuilder()
    * @generated
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER = 11;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__VALIDATOR = PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PARENT = PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__RESULT = PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER = PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER = PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__SUFFIX = PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Pattern Variable Handler</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER = PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Single Result Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT = PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION = PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR = PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___HAS_ERRORS = PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE = PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE_EXPRESSION_EOPERATION = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___CREATE_ACTION = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 2;

   /**
    * The number of operations of the '<em>Single Result Pattern Invocation Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT = PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundActionBuilderImpl <em>Compound Action Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundActionBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getCompoundActionBuilder()
    * @generated
    */
   int COMPOUND_ACTION_BUILDER = 14;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER__VALIDATOR = ACTION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER__PARENT = ACTION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER__RESULT = ACTION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER__CHILDREN = ACTION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Compound Action Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER_FEATURE_COUNT = ACTION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION = ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER___BUILD_ACTION__CFNODE = ACTION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER___LOOKUP_ACTION__CFNODE = ACTION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR = ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The number of operations of the '<em>Compound Action Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_ACTION_BUILDER_OPERATION_COUNT = ACTION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.StoryNodeActionBuilderImpl <em>Story Node Action Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.StoryNodeActionBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getStoryNodeActionBuilder()
    * @generated
    */
   int STORY_NODE_ACTION_BUILDER = 13;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER__VALIDATOR = COMPOUND_ACTION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER__PARENT = COMPOUND_ACTION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER__RESULT = COMPOUND_ACTION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER__CHILDREN = COMPOUND_ACTION_BUILDER__CHILDREN;

   /**
    * The feature id for the '<em><b>Requires For Each</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH = COMPOUND_ACTION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Story Node Action Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER_FEATURE_COUNT = COMPOUND_ACTION_BUILDER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION = COMPOUND_ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER___LOOKUP_ACTION__CFNODE = COMPOUND_ACTION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = COMPOUND_ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR = COMPOUND_ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = COMPOUND_ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER___BUILD_ACTION__CFNODE = COMPOUND_ACTION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Story Node Action Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_ACTION_BUILDER_OPERATION_COUNT = COMPOUND_ACTION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.GreenPatternBuilderImpl <em>Green Pattern Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.GreenPatternBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getGreenPatternBuilder()
    * @generated
    */
   int GREEN_PATTERN_BUILDER = 15;

   /**
    * The feature id for the '<em><b>Validator</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__PARENT = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT;

   /**
    * The feature id for the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__RESULT = REGULAR_PATTERN_INVOCATION_BUILDER__RESULT;

   /**
    * The feature id for the '<em><b>Expression Explorer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__EXPRESSION_EXPLORER = REGULAR_PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER;

   /**
    * The feature id for the '<em><b>Pattern Matcher</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__PATTERN_MATCHER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER;

   /**
    * The feature id for the '<em><b>Suffix</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__SUFFIX = REGULAR_PATTERN_INVOCATION_BUILDER__SUFFIX;

   /**
    * The feature id for the '<em><b>Parent Builder</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__PARENT_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER;

   /**
    * The feature id for the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__PATTERN_TRANSFORMER = REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER;

   /**
    * The feature id for the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER__MAIN_ACTION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER;

   /**
    * The number of structural features of the '<em>Green Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER_FEATURE_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Add Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___ADD_ACTION__CFNODE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___ADD_ACTION__CFNODE_ACTION;

   /**
    * The operation id for the '<em>Lookup Control Flow Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Attach To Resource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN;

   /**
    * The operation id for the '<em>Calculate Adornment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION;

   /**
    * The operation id for the '<em>Calculate Pattern Name</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE;

   /**
    * The operation id for the '<em>Handle Pattern Matcher Report</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT;

   /**
    * The operation id for the '<em>Has Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___HAS_ERRORS = REGULAR_PATTERN_INVOCATION_BUILDER___HAS_ERRORS;

   /**
    * The operation id for the '<em>Lookup Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Analyze Dependencies</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Build Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___BUILD_ACTION__CFNODE = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE;

   /**
    * The operation id for the '<em>Build Pattern Content</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN;

   /**
    * The operation id for the '<em>Build Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN;

   /**
    * The operation id for the '<em>Create Action</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___CREATE_ACTION = REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION;

   /**
    * The operation id for the '<em>Explore Attribute Assignments</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Explore Attribute Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get Pattern Invocation Builder</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___GET_PATTERN_INVOCATION_BUILDER = REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER;

   /**
    * The operation id for the '<em>Handle Relevant Object Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Handle Variable Reference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE;

   /**
    * The operation id for the '<em>Lookup Scope Validator</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___LOOKUP_SCOPE_VALIDATOR = REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR;

   /**
    * The operation id for the '<em>Postprocess Pattern Interface</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN;

   /**
    * The operation id for the '<em>Transform Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Validate Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Green Pattern Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_BUILDER_OPERATION_COUNT = REGULAR_PATTERN_INVOCATION_BUILDER_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ExpressionExplorerImpl <em>Expression Explorer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ExpressionExplorerImpl
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getExpressionExplorer()
    * @generated
    */
   int EXPRESSION_EXPLORER = 16;

   /**
    * The feature id for the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER = 0;

   /**
    * The number of structural features of the '<em>Expression Explorer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_EXPLORER_FEATURE_COUNT = 1;

   /**
    * The operation id for the '<em>Explore Expression</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_EXPLORER___EXPLORE_EXPRESSION__PATTERNINVOCATIONBUILDER_PATTERN_EXPRESSION = 0;

   /**
    * The operation id for the '<em>Handle Symbolic Parameter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_EXPLORER___HANDLE_SYMBOLIC_PARAMETER__PATTERNINVOCATIONBUILDER_PATTERN_STRING_ECLASSIFIER = 1;

   /**
    * The number of operations of the '<em>Expression Explorer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_EXPLORER_OPERATION_COUNT = 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.scope.Errors <em>Errors</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.scope.Errors
    * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getErrors()
    * @generated
    */
   int ERRORS = 17;

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder <em>Binding Expression Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Binding Expression Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder
    * @generated
    */
   EClass getBindingExpressionBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Analyze Dependencies</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Dependencies</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBindingExpressionBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder#createAction() <em>Create Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder#createAction()
    * @generated
    */
   EOperation getBindingExpressionBuilder__CreateAction();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable) <em>Validate Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getBindingExpressionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder <em>Red Node Deletion Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Red Node Deletion Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder
    * @generated
    */
   EClass getRedNodeDeletionBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode) <em>Build Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getRedNodeDeletionBuilder__BuildAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode) <em>Lookup Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getRedNodeDeletionBuilder__LookupAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable) <em>Validate Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getRedNodeDeletionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder <em>Nac Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Nac Pattern Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder
    * @generated
    */
   EClass getNacPatternBuilder();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#getNacPatternCounter <em>Nac Pattern Counter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Nac Pattern Counter</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#getNacPatternCounter()
    * @see #getNacPatternBuilder()
    * @generated
    */
   EAttribute getNacPatternBuilder_NacPatternCounter();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Analyze Dependencies</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Dependencies</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#attachToResource(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Pattern) <em>Attach To Resource</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Attach To Resource</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#attachToResource(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternBuilder__AttachToResource__Pattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern) <em>Build Pattern Content</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Pattern Content</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getNacPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#createAllBoundAdornment(org.gervarro.democles.specification.emf.Pattern) <em>Create All Bound Adornment</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create All Bound Adornment</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#createAllBoundAdornment(org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternBuilder__CreateAllBoundAdornment__Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#createNacPatternNameAndIncrementCounter(org.gervarro.democles.specification.emf.Pattern) <em>Create Nac Pattern Name And Increment Counter</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Nac Pattern Name And Increment Counter</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#createNacPatternNameAndIncrementCounter(org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternBuilder__CreateNacPatternNameAndIncrementCounter__Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#embedNacPattern(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.PatternInvocationConstraint, org.gervarro.democles.specification.emf.Pattern) <em>Embed Nac Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Embed Nac Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#embedNacPattern(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.PatternInvocationConstraint, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternBuilder__EmbedNacPattern__Pattern_PatternInvocationConstraint_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#exploreNacPatternVariables(SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern) <em>Explore Nac Pattern Variables</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Nac Pattern Variables</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#exploreNacPatternVariables(SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternBuilder__ExploreNacPatternVariables__ObjectVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#handleRelevantObjectVariable(org.moflon.sdm.runtime.democles.PatternInvocation, SDMLanguage.patterns.ObjectVariable) <em>Handle Relevant Object Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Relevant Object Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#handleRelevantObjectVariable(org.moflon.sdm.runtime.democles.PatternInvocation, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getNacPatternBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#handleSimpleNacPattern(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Handle Simple Nac Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Simple Nac Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#handleSimpleNacPattern(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternBuilder__HandleSimpleNacPattern__StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode) <em>Lookup Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getNacPatternBuilder__LookupAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#postprocessPatternInterface(SDMLanguage.patterns.StoryPattern) <em>Postprocess Pattern Interface</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Postprocess Pattern Interface</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#postprocessPatternInterface(SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getNacPatternBuilder__PostprocessPatternInterface__StoryPattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder <em>Red Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Red Pattern Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder
    * @generated
    */
   EClass getRedPatternBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable) <em>Validate Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getRedPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Analyze Dependencies</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Dependencies</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getRedPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder <em>Binding And Black Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Binding And Black Pattern Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder
    * @generated
    */
   EClass getBindingAndBlackPatternBuilder();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#getBlackPatternBuilder <em>Black Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Black Pattern Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#getBlackPatternBuilder()
    * @see #getBindingAndBlackPatternBuilder()
    * @generated
    */
   EReference getBindingAndBlackPatternBuilder_BlackPatternBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Analyze Dependencies</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Dependencies</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode) <em>Build Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__BuildAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#buildActionInSuperClass(org.moflon.sdm.runtime.democles.CFNode) <em>Build Action In Super Class</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action In Super Class</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#buildActionInSuperClass(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__BuildActionInSuperClass__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern) <em>Build Pattern Content</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Pattern Content</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#calculateNextAdornment(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.common.Adornment, org.gervarro.democles.specification.emf.PatternInvocationConstraint) <em>Calculate Next Adornment</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Calculate Next Adornment</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#calculateNextAdornment(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.common.Adornment, org.gervarro.democles.specification.emf.PatternInvocationConstraint)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__CalculateNextAdornment__Pattern_Adornment_PatternInvocationConstraint();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#calculatePatternInvocationAdornment(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.common.Adornment, org.gervarro.democles.specification.emf.PatternInvocationConstraint) <em>Calculate Pattern Invocation Adornment</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Calculate Pattern Invocation Adornment</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#calculatePatternInvocationAdornment(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.common.Adornment, org.gervarro.democles.specification.emf.PatternInvocationConstraint)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__CalculatePatternInvocationAdornment__Pattern_Adornment_PatternInvocationConstraint();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#constructEmbeddedPattern(org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Construct Embedded Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Construct Embedded Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#constructEmbeddedPattern(org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__ConstructEmbeddedPattern__RegularPatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#processChildPattern(org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder, org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.common.Adornment) <em>Process Child Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Child Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#processChildPattern(org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder, org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.common.Adornment)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__ProcessChildPattern__RegularPatternInvocationBuilder_RegularPatternInvocation_StoryPattern_Adornment();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable) <em>Validate Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getBindingAndBlackPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder <em>Black Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Black Pattern Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder
    * @generated
    */
   EClass getBlackPatternBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Analyze Dependencies</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Dependencies</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#analyzeDependenciesInSuperclass(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Analyze Dependencies In Superclass</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Dependencies In Superclass</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#analyzeDependenciesInSuperclass(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBlackPatternBuilder__AnalyzeDependenciesInSuperclass__PatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern) <em>Build Pattern Content</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Pattern Content</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#buildPatternContentInSuperclass(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern) <em>Build Pattern Content In Superclass</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Pattern Content In Superclass</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder#buildPatternContentInSuperclass(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getBlackPatternBuilder__BuildPatternContentInSuperclass__RegularPatternInvocation_StoryPattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder <em>Action Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Action Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder
    * @generated
    */
   EClass getActionBuilder();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Validator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getValidator()
    * @see #getActionBuilder()
    * @generated
    */
   EReference getActionBuilder_Validator();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parent</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getParent()
    * @see #getActionBuilder()
    * @generated
    */
   EReference getActionBuilder_Parent();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getResult <em>Result</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Result</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getResult()
    * @see #getActionBuilder()
    * @generated
    */
   EReference getActionBuilder_Result();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#addAction(org.moflon.sdm.runtime.democles.CFNode, org.moflon.sdm.runtime.democles.Action) <em>Add Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Add Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#addAction(org.moflon.sdm.runtime.democles.CFNode, org.moflon.sdm.runtime.democles.Action)
    * @generated
    */
   EOperation getActionBuilder__AddAction__CFNode_Action();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode) <em>Build Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getActionBuilder__BuildAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode) <em>Lookup Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getActionBuilder__LookupAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#lookupControlFlowVariable(org.moflon.sdm.runtime.democles.Action, java.lang.String, org.eclipse.emf.ecore.EClassifier) <em>Lookup Control Flow Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Control Flow Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#lookupControlFlowVariable(org.moflon.sdm.runtime.democles.Action, java.lang.String, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getActionBuilder__LookupControlFlowVariable__Action_String_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#lookupScopeValidator() <em>Lookup Scope Validator</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Scope Validator</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#lookupScopeValidator()
    * @generated
    */
   EOperation getActionBuilder__LookupScopeValidator();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable) <em>Validate Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getActionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Validator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator
    * @generated
    */
   EClass getScopeValidator();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getValidationReport <em>Validation Report</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Validation Report</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getValidationReport()
    * @see #getScopeValidator()
    * @generated
    */
   EReference getScopeValidator_ValidationReport();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getActionBuilders <em>Action Builders</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Action Builders</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getActionBuilders()
    * @see #getScopeValidator()
    * @generated
    */
   EReference getScopeValidator_ActionBuilders();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#analyzeLinkVariable(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.patterns.LinkVariable) <em>Analyze Link Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Link Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#analyzeLinkVariable(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.patterns.LinkVariable)
    * @generated
    */
   EOperation getScopeValidator__AnalyzeLinkVariable__CFNode_LinkVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#analyzeObjectVariable(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.patterns.ObjectVariable) <em>Analyze Object Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Object Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#analyzeObjectVariable(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getScopeValidator__AnalyzeObjectVariable__CFNode_ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#checkDeletionOfBoundVariable(SDMLanguage.patterns.ObjectVariable, org.moflon.sdm.runtime.democles.CFVariable, org.moflon.sdm.runtime.democles.CFNode, org.moflon.sdm.runtime.democles.CFNode) <em>Check Deletion Of Bound Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Check Deletion Of Bound Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#checkDeletionOfBoundVariable(SDMLanguage.patterns.ObjectVariable, org.moflon.sdm.runtime.democles.CFVariable, org.moflon.sdm.runtime.democles.CFNode, org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getScopeValidator__CheckDeletionOfBoundVariable__ObjectVariable_CFVariable_CFNode_CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#checkRedBoundVariable(org.moflon.sdm.runtime.democles.CFVariable, org.moflon.sdm.runtime.democles.Scope, SDMLanguage.patterns.ObjectVariable) <em>Check Red Bound Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Check Red Bound Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#checkRedBoundVariable(org.moflon.sdm.runtime.democles.CFVariable, org.moflon.sdm.runtime.democles.Scope, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getScopeValidator__CheckRedBoundVariable__CFVariable_Scope_ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#followsInSameScope(org.moflon.sdm.runtime.democles.CFNode, org.moflon.sdm.runtime.democles.CFNode) <em>Follows In Same Scope</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Follows In Same Scope</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#followsInSameScope(org.moflon.sdm.runtime.democles.CFNode, org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getScopeValidator__FollowsInSameScope__CFNode_CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#isNull(org.moflon.sdm.runtime.democles.CFVariable) <em>Is Null</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Null</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#isNull(org.moflon.sdm.runtime.democles.CFVariable)
    * @generated
    */
   EOperation getScopeValidator__IsNull__CFVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#lookupControlFlowVariable(org.moflon.sdm.runtime.democles.CFNode, java.lang.String) <em>Lookup Control Flow Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Control Flow Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#lookupControlFlowVariable(org.moflon.sdm.runtime.democles.CFNode, java.lang.String)
    * @generated
    */
   EOperation getScopeValidator__LookupControlFlowVariable__CFNode_String();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#lookupErrorMessage(org.moflon.sdm.compiler.democles.validation.scope.Errors) <em>Lookup Error Message</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Error Message</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#lookupErrorMessage(org.moflon.sdm.compiler.democles.validation.scope.Errors)
    * @generated
    */
   EOperation getScopeValidator__LookupErrorMessage__Errors();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#visitNode(org.moflon.sdm.runtime.democles.CFNode) <em>Visit Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#visitNode(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getScopeValidator__VisitNode__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#visitScope(org.moflon.sdm.runtime.democles.Scope) <em>Visit Scope</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Scope</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#visitScope(org.moflon.sdm.runtime.democles.Scope)
    * @generated
    */
   EOperation getScopeValidator__VisitScope__Scope();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder <em>Compound Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Compound Pattern Invocation Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder
    * @generated
    */
   EClass getCompoundPatternInvocationBuilder();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder#getChildBuilders <em>Child Builders</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Child Builders</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder#getChildBuilders()
    * @see #getCompoundPatternInvocationBuilder()
    * @generated
    */
   EReference getCompoundPatternInvocationBuilder_ChildBuilders();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder <em>Regular Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Regular Pattern Invocation Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder
    * @generated
    */
   EClass getRegularPatternInvocationBuilder();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getParentBuilder <em>Parent Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parent Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getParentBuilder()
    * @see #getRegularPatternInvocationBuilder()
    * @generated
    */
   EReference getRegularPatternInvocationBuilder_ParentBuilder();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getPatternTransformer <em>Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Pattern Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getPatternTransformer()
    * @see #getRegularPatternInvocationBuilder()
    * @generated
    */
   EReference getRegularPatternInvocationBuilder_PatternTransformer();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#isMainActionBuilder <em>Main Action Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Main Action Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#isMainActionBuilder()
    * @see #getRegularPatternInvocationBuilder()
    * @generated
    */
   EAttribute getRegularPatternInvocationBuilder_MainActionBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Analyze Dependencies</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Dependencies</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#analyzeDependencies(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode) <em>Build Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__BuildAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern) <em>Build Pattern Content</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Pattern Content</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#buildPatternContent(org.moflon.sdm.runtime.democles.RegularPatternInvocation, SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#buildPatternInterface(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.patterns.StoryPattern) <em>Build Pattern Interface</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Pattern Interface</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#buildPatternInterface(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__BuildPatternInterface__CFNode_StoryPattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#createAction() <em>Create Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#createAction()
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__CreateAction();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#exploreAttributeAssignments(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer, SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern) <em>Explore Attribute Assignments</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Attribute Assignments</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#exploreAttributeAssignments(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer, SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__ExploreAttributeAssignments__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#exploreAttributeConstraints(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer, SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern) <em>Explore Attribute Constraints</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Attribute Constraints</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#exploreAttributeConstraints(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer, SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__ExploreAttributeConstraints__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getPatternInvocationBuilder() <em>Get Pattern Invocation Builder</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Pattern Invocation Builder</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getPatternInvocationBuilder()
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__GetPatternInvocationBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#handleRelevantObjectVariable(org.moflon.sdm.runtime.democles.PatternInvocation, SDMLanguage.patterns.ObjectVariable) <em>Handle Relevant Object Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Relevant Object Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#handleRelevantObjectVariable(org.moflon.sdm.runtime.democles.PatternInvocation, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#handleVariableReference(org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier) <em>Handle Variable Reference</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Variable Reference</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#handleVariableReference(org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#handleVariableReferenceInSuperclass(org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier) <em>Handle Variable Reference In Superclass</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Variable Reference In Superclass</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#handleVariableReferenceInSuperclass(org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__HandleVariableReferenceInSuperclass__Variable_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#lookupScopeValidator() <em>Lookup Scope Validator</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Scope Validator</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#lookupScopeValidator()
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__LookupScopeValidator();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#postprocessPatternInterface(SDMLanguage.patterns.StoryPattern) <em>Postprocess Pattern Interface</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Postprocess Pattern Interface</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#postprocessPatternInterface(SDMLanguage.patterns.StoryPattern)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__PostprocessPatternInterface__StoryPattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#transformPattern(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Transform Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#transformPattern(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getRegularPatternInvocationBuilder__TransformPattern__StoryPattern_Pattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher <em>Pattern Matcher</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pattern Matcher</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher
    * @generated
    */
   EClass getPatternMatcher();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher#getValidationReport <em>Validation Report</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Validation Report</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher#getValidationReport()
    * @see #getPatternMatcher()
    * @generated
    */
   EReference getPatternMatcher_ValidationReport();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher#generateSearchPlan(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.common.Adornment, boolean) <em>Generate Search Plan</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Generate Search Plan</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher#generateSearchPlan(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.common.Adornment, boolean)
    * @generated
    */
   EOperation getPatternMatcher__GenerateSearchPlan__Pattern_Adornment_boolean();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder <em>Single Result Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Single Result Pattern Invocation Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder
    * @generated
    */
   EClass getSingleResultPatternInvocationBuilder();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#getPatternVariableHandler <em>Pattern Variable Handler</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Pattern Variable Handler</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#getPatternVariableHandler()
    * @see #getSingleResultPatternInvocationBuilder()
    * @generated
    */
   EReference getSingleResultPatternInvocationBuilder_PatternVariableHandler();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode) <em>Build Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getSingleResultPatternInvocationBuilder__BuildAction__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.expressions.Expression, org.eclipse.emf.ecore.EOperation) <em>Build Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode, SDMLanguage.expressions.Expression, org.eclipse.emf.ecore.EOperation)
    * @generated
    */
   EOperation getSingleResultPatternInvocationBuilder__BuildAction__CFNode_Expression_EOperation();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#createAction() <em>Create Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder#createAction()
    * @generated
    */
   EOperation getSingleResultPatternInvocationBuilder__CreateAction();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder <em>Pattern Invocation Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pattern Invocation Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder
    * @generated
    */
   EClass getPatternInvocationBuilder();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getExpressionExplorer <em>Expression Explorer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Expression Explorer</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getExpressionExplorer()
    * @see #getPatternInvocationBuilder()
    * @generated
    */
   EReference getPatternInvocationBuilder_ExpressionExplorer();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getPatternMatcher <em>Pattern Matcher</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Pattern Matcher</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getPatternMatcher()
    * @see #getPatternInvocationBuilder()
    * @generated
    */
   EReference getPatternInvocationBuilder_PatternMatcher();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getSuffix <em>Suffix</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Suffix</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#getSuffix()
    * @see #getPatternInvocationBuilder()
    * @generated
    */
   EAttribute getPatternInvocationBuilder_Suffix();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#attachToResource(org.moflon.sdm.runtime.democles.CFNode, org.gervarro.democles.specification.emf.Pattern) <em>Attach To Resource</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Attach To Resource</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#attachToResource(org.moflon.sdm.runtime.democles.CFNode, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getPatternInvocationBuilder__AttachToResource__CFNode_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#calculateAdornment(org.moflon.sdm.runtime.democles.PatternInvocation) <em>Calculate Adornment</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Calculate Adornment</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#calculateAdornment(org.moflon.sdm.runtime.democles.PatternInvocation)
    * @generated
    */
   EOperation getPatternInvocationBuilder__CalculateAdornment__PatternInvocation();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#calculatePatternName(org.moflon.sdm.runtime.democles.CFNode) <em>Calculate Pattern Name</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Calculate Pattern Name</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#calculatePatternName(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getPatternInvocationBuilder__CalculatePatternName__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#createAction() <em>Create Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#createAction()
    * @generated
    */
   EOperation getPatternInvocationBuilder__CreateAction();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#handlePatternMatcherReport(org.moflon.sdm.runtime.democles.PatternInvocation, org.moflon.sdm.compiler.democles.validation.result.ValidationReport) <em>Handle Pattern Matcher Report</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Pattern Matcher Report</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#handlePatternMatcherReport(org.moflon.sdm.runtime.democles.PatternInvocation, org.moflon.sdm.compiler.democles.validation.result.ValidationReport)
    * @generated
    */
   EOperation getPatternInvocationBuilder__HandlePatternMatcherReport__PatternInvocation_ValidationReport();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#handleVariableReference(org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier) <em>Handle Variable Reference</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Variable Reference</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#handleVariableReference(org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#hasErrors() <em>Has Errors</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Has Errors</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#hasErrors()
    * @generated
    */
   EOperation getPatternInvocationBuilder__HasErrors();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode) <em>Lookup Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder#lookupAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getPatternInvocationBuilder__LookupAction__CFNode();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder <em>Story Node Action Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Story Node Action Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder
    * @generated
    */
   EClass getStoryNodeActionBuilder();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder#isRequiresForEach <em>Requires For Each</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Requires For Each</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder#isRequiresForEach()
    * @see #getStoryNodeActionBuilder()
    * @generated
    */
   EAttribute getStoryNodeActionBuilder_RequiresForEach();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode) <em>Build Action</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Build Action</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder#buildAction(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getStoryNodeActionBuilder__BuildAction__CFNode();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder <em>Compound Action Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Compound Action Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder
    * @generated
    */
   EClass getCompoundActionBuilder();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder#getChildren()
    * @see #getCompoundActionBuilder()
    * @generated
    */
   EReference getCompoundActionBuilder_Children();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder <em>Green Pattern Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Green Pattern Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder
    * @generated
    */
   EClass getGreenPatternBuilder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable) <em>Validate Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder#validateVariable(org.moflon.sdm.runtime.democles.Action, org.moflon.sdm.runtime.democles.CFVariable, SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getGreenPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer <em>Expression Explorer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Expression Explorer</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer
    * @generated
    */
   EClass getExpressionExplorer();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#getExpressionTransformer <em>Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Expression Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#getExpressionTransformer()
    * @see #getExpressionExplorer()
    * @generated
    */
   EReference getExpressionExplorer_ExpressionTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#exploreExpression(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.gervarro.democles.specification.emf.Pattern, SDMLanguage.expressions.Expression) <em>Explore Expression</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Expression</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#exploreExpression(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.gervarro.democles.specification.emf.Pattern, SDMLanguage.expressions.Expression)
    * @generated
    */
   EOperation getExpressionExplorer__ExploreExpression__PatternInvocationBuilder_Pattern_Expression();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#handleSymbolicParameter(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.gervarro.democles.specification.emf.Pattern, java.lang.String, org.eclipse.emf.ecore.EClassifier) <em>Handle Symbolic Parameter</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Symbolic Parameter</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer#handleSymbolicParameter(org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder, org.gervarro.democles.specification.emf.Pattern, java.lang.String, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getExpressionExplorer__HandleSymbolicParameter__PatternInvocationBuilder_Pattern_String_EClassifier();

   /**
    * Returns the meta object for enum '{@link org.moflon.sdm.compiler.democles.validation.scope.Errors <em>Errors</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Errors</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.scope.Errors
    * @generated
    */
   EEnum getErrors();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ScopeFactory getScopeFactory();

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
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.BindingExpressionBuilderImpl <em>Binding Expression Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.BindingExpressionBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getBindingExpressionBuilder()
       * @generated
       */
      EClass BINDING_EXPRESSION_BUILDER = eINSTANCE.getBindingExpressionBuilder();

      /**
       * The meta object literal for the '<em><b>Analyze Dependencies</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_EXPRESSION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getBindingExpressionBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Create Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_EXPRESSION_BUILDER___CREATE_ACTION = eINSTANCE.getBindingExpressionBuilder__CreateAction();

      /**
       * The meta object literal for the '<em><b>Validate Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_EXPRESSION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = eINSTANCE
            .getBindingExpressionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RedNodeDeletionBuilderImpl <em>Red Node Deletion Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.RedNodeDeletionBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getRedNodeDeletionBuilder()
       * @generated
       */
      EClass RED_NODE_DELETION_BUILDER = eINSTANCE.getRedNodeDeletionBuilder();

      /**
       * The meta object literal for the '<em><b>Build Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation RED_NODE_DELETION_BUILDER___BUILD_ACTION__CFNODE = eINSTANCE.getRedNodeDeletionBuilder__BuildAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Lookup Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation RED_NODE_DELETION_BUILDER___LOOKUP_ACTION__CFNODE = eINSTANCE.getRedNodeDeletionBuilder__LookupAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Validate Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation RED_NODE_DELETION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = eINSTANCE
            .getRedNodeDeletionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.NacPatternBuilderImpl <em>Nac Pattern Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.NacPatternBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getNacPatternBuilder()
       * @generated
       */
      EClass NAC_PATTERN_BUILDER = eINSTANCE.getNacPatternBuilder();

      /**
       * The meta object literal for the '<em><b>Nac Pattern Counter</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER = eINSTANCE.getNacPatternBuilder_NacPatternCounter();

      /**
       * The meta object literal for the '<em><b>Analyze Dependencies</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getNacPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Attach To Resource</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___ATTACH_TO_RESOURCE__PATTERN_PATTERN = eINSTANCE.getNacPatternBuilder__AttachToResource__Pattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Build Pattern Content</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = eINSTANCE
            .getNacPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

      /**
       * The meta object literal for the '<em><b>Create All Bound Adornment</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___CREATE_ALL_BOUND_ADORNMENT__PATTERN = eINSTANCE.getNacPatternBuilder__CreateAllBoundAdornment__Pattern();

      /**
       * The meta object literal for the '<em><b>Create Nac Pattern Name And Increment Counter</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___CREATE_NAC_PATTERN_NAME_AND_INCREMENT_COUNTER__PATTERN = eINSTANCE
            .getNacPatternBuilder__CreateNacPatternNameAndIncrementCounter__Pattern();

      /**
       * The meta object literal for the '<em><b>Embed Nac Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___EMBED_NAC_PATTERN__PATTERN_PATTERNINVOCATIONCONSTRAINT_PATTERN = eINSTANCE
            .getNacPatternBuilder__EmbedNacPattern__Pattern_PatternInvocationConstraint_Pattern();

      /**
       * The meta object literal for the '<em><b>Explore Nac Pattern Variables</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___EXPLORE_NAC_PATTERN_VARIABLES__OBJECTVARIABLE_PATTERN = eINSTANCE
            .getNacPatternBuilder__ExploreNacPatternVariables__ObjectVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Handle Relevant Object Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = eINSTANCE
            .getNacPatternBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Handle Simple Nac Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___HANDLE_SIMPLE_NAC_PATTERN__STORYPATTERN_PATTERN = eINSTANCE
            .getNacPatternBuilder__HandleSimpleNacPattern__StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Lookup Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE = eINSTANCE.getNacPatternBuilder__LookupAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Postprocess Pattern Interface</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = eINSTANCE
            .getNacPatternBuilder__PostprocessPatternInterface__StoryPattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RedPatternBuilderImpl <em>Red Pattern Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.RedPatternBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getRedPatternBuilder()
       * @generated
       */
      EClass RED_PATTERN_BUILDER = eINSTANCE.getRedPatternBuilder();

      /**
       * The meta object literal for the '<em><b>Validate Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation RED_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = eINSTANCE
            .getRedPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Analyze Dependencies</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation RED_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getRedPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.BindingAndBlackPatternBuilderImpl <em>Binding And Black Pattern Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.BindingAndBlackPatternBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getBindingAndBlackPatternBuilder()
       * @generated
       */
      EClass BINDING_AND_BLACK_PATTERN_BUILDER = eINSTANCE.getBindingAndBlackPatternBuilder();

      /**
       * The meta object literal for the '<em><b>Black Pattern Builder</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER = eINSTANCE.getBindingAndBlackPatternBuilder_BlackPatternBuilder();

      /**
       * The meta object literal for the '<em><b>Analyze Dependencies</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getBindingAndBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Build Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION__CFNODE = eINSTANCE.getBindingAndBlackPatternBuilder__BuildAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Build Action In Super Class</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION_IN_SUPER_CLASS__CFNODE = eINSTANCE
            .getBindingAndBlackPatternBuilder__BuildActionInSuperClass__CFNode();

      /**
       * The meta object literal for the '<em><b>Build Pattern Content</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = eINSTANCE
            .getBindingAndBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

      /**
       * The meta object literal for the '<em><b>Calculate Next Adornment</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_NEXT_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT = eINSTANCE
            .getBindingAndBlackPatternBuilder__CalculateNextAdornment__Pattern_Adornment_PatternInvocationConstraint();

      /**
       * The meta object literal for the '<em><b>Calculate Pattern Invocation Adornment</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_PATTERN_INVOCATION_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT = eINSTANCE
            .getBindingAndBlackPatternBuilder__CalculatePatternInvocationAdornment__Pattern_Adornment_PatternInvocationConstraint();

      /**
       * The meta object literal for the '<em><b>Construct Embedded Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___CONSTRUCT_EMBEDDED_PATTERN__REGULARPATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getBindingAndBlackPatternBuilder__ConstructEmbeddedPattern__RegularPatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE
            .getBindingAndBlackPatternBuilder__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Process Child Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___PROCESS_CHILD_PATTERN__REGULARPATTERNINVOCATIONBUILDER_REGULARPATTERNINVOCATION_STORYPATTERN_ADORNMENT = eINSTANCE
            .getBindingAndBlackPatternBuilder__ProcessChildPattern__RegularPatternInvocationBuilder_RegularPatternInvocation_StoryPattern_Adornment();

      /**
       * The meta object literal for the '<em><b>Validate Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_AND_BLACK_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = eINSTANCE
            .getBindingAndBlackPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.BlackPatternBuilderImpl <em>Black Pattern Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.BlackPatternBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getBlackPatternBuilder()
       * @generated
       */
      EClass BLACK_PATTERN_BUILDER = eINSTANCE.getBlackPatternBuilder();

      /**
       * The meta object literal for the '<em><b>Analyze Dependencies</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getBlackPatternBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Analyze Dependencies In Superclass</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES_IN_SUPERCLASS__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getBlackPatternBuilder__AnalyzeDependenciesInSuperclass__PatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Build Pattern Content</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = eINSTANCE
            .getBlackPatternBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

      /**
       * The meta object literal for the '<em><b>Build Pattern Content In Superclass</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT_IN_SUPERCLASS__REGULARPATTERNINVOCATION_STORYPATTERN = eINSTANCE
            .getBlackPatternBuilder__BuildPatternContentInSuperclass__RegularPatternInvocation_StoryPattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ActionBuilderImpl <em>Action Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ActionBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getActionBuilder()
       * @generated
       */
      EClass ACTION_BUILDER = eINSTANCE.getActionBuilder();

      /**
       * The meta object literal for the '<em><b>Validator</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION_BUILDER__VALIDATOR = eINSTANCE.getActionBuilder_Validator();

      /**
       * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION_BUILDER__PARENT = eINSTANCE.getActionBuilder_Parent();

      /**
       * The meta object literal for the '<em><b>Result</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION_BUILDER__RESULT = eINSTANCE.getActionBuilder_Result();

      /**
       * The meta object literal for the '<em><b>Add Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION = eINSTANCE.getActionBuilder__AddAction__CFNode_Action();

      /**
       * The meta object literal for the '<em><b>Build Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ACTION_BUILDER___BUILD_ACTION__CFNODE = eINSTANCE.getActionBuilder__BuildAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Lookup Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ACTION_BUILDER___LOOKUP_ACTION__CFNODE = eINSTANCE.getActionBuilder__LookupAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Lookup Control Flow Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER = eINSTANCE
            .getActionBuilder__LookupControlFlowVariable__Action_String_EClassifier();

      /**
       * The meta object literal for the '<em><b>Lookup Scope Validator</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR = eINSTANCE.getActionBuilder__LookupScopeValidator();

      /**
       * The meta object literal for the '<em><b>Validate Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = eINSTANCE
            .getActionBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ScopeValidatorImpl <em>Validator</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopeValidatorImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getScopeValidator()
       * @generated
       */
      EClass SCOPE_VALIDATOR = eINSTANCE.getScopeValidator();

      /**
       * The meta object literal for the '<em><b>Validation Report</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE_VALIDATOR__VALIDATION_REPORT = eINSTANCE.getScopeValidator_ValidationReport();

      /**
       * The meta object literal for the '<em><b>Action Builders</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE_VALIDATOR__ACTION_BUILDERS = eINSTANCE.getScopeValidator_ActionBuilders();

      /**
       * The meta object literal for the '<em><b>Analyze Link Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___ANALYZE_LINK_VARIABLE__CFNODE_LINKVARIABLE = eINSTANCE.getScopeValidator__AnalyzeLinkVariable__CFNode_LinkVariable();

      /**
       * The meta object literal for the '<em><b>Analyze Object Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___ANALYZE_OBJECT_VARIABLE__CFNODE_OBJECTVARIABLE = eINSTANCE.getScopeValidator__AnalyzeObjectVariable__CFNode_ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Check Deletion Of Bound Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___CHECK_DELETION_OF_BOUND_VARIABLE__OBJECTVARIABLE_CFVARIABLE_CFNODE_CFNODE = eINSTANCE
            .getScopeValidator__CheckDeletionOfBoundVariable__ObjectVariable_CFVariable_CFNode_CFNode();

      /**
       * The meta object literal for the '<em><b>Check Red Bound Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___CHECK_RED_BOUND_VARIABLE__CFVARIABLE_SCOPE_OBJECTVARIABLE = eINSTANCE
            .getScopeValidator__CheckRedBoundVariable__CFVariable_Scope_ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Follows In Same Scope</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___FOLLOWS_IN_SAME_SCOPE__CFNODE_CFNODE = eINSTANCE.getScopeValidator__FollowsInSameScope__CFNode_CFNode();

      /**
       * The meta object literal for the '<em><b>Is Null</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___IS_NULL__CFVARIABLE = eINSTANCE.getScopeValidator__IsNull__CFVariable();

      /**
       * The meta object literal for the '<em><b>Lookup Control Flow Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___LOOKUP_CONTROL_FLOW_VARIABLE__CFNODE_STRING = eINSTANCE.getScopeValidator__LookupControlFlowVariable__CFNode_String();

      /**
       * The meta object literal for the '<em><b>Lookup Error Message</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS = eINSTANCE.getScopeValidator__LookupErrorMessage__Errors();

      /**
       * The meta object literal for the '<em><b>Visit Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___VISIT_NODE__CFNODE = eINSTANCE.getScopeValidator__VisitNode__CFNode();

      /**
       * The meta object literal for the '<em><b>Visit Scope</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE_VALIDATOR___VISIT_SCOPE__SCOPE = eINSTANCE.getScopeValidator__VisitScope__Scope();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundPatternInvocationBuilderImpl <em>Compound Pattern Invocation Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundPatternInvocationBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getCompoundPatternInvocationBuilder()
       * @generated
       */
      EClass COMPOUND_PATTERN_INVOCATION_BUILDER = eINSTANCE.getCompoundPatternInvocationBuilder();

      /**
       * The meta object literal for the '<em><b>Child Builders</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS = eINSTANCE.getCompoundPatternInvocationBuilder_ChildBuilders();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RegularPatternInvocationBuilderImpl <em>Regular Pattern Invocation Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.RegularPatternInvocationBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getRegularPatternInvocationBuilder()
       * @generated
       */
      EClass REGULAR_PATTERN_INVOCATION_BUILDER = eINSTANCE.getRegularPatternInvocationBuilder();

      /**
       * The meta object literal for the '<em><b>Parent Builder</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER = eINSTANCE.getRegularPatternInvocationBuilder_ParentBuilder();

      /**
       * The meta object literal for the '<em><b>Pattern Transformer</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER = eINSTANCE.getRegularPatternInvocationBuilder_PatternTransformer();

      /**
       * The meta object literal for the '<em><b>Main Action Builder</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER = eINSTANCE.getRegularPatternInvocationBuilder_MainActionBuilder();

      /**
       * The meta object literal for the '<em><b>Analyze Dependencies</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN = eINSTANCE
            .getRegularPatternInvocationBuilder__AnalyzeDependencies__PatternInvocationBuilder_StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Build Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE = eINSTANCE.getRegularPatternInvocationBuilder__BuildAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Build Pattern Content</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN = eINSTANCE
            .getRegularPatternInvocationBuilder__BuildPatternContent__RegularPatternInvocation_StoryPattern();

      /**
       * The meta object literal for the '<em><b>Build Pattern Interface</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN = eINSTANCE
            .getRegularPatternInvocationBuilder__BuildPatternInterface__CFNode_StoryPattern();

      /**
       * The meta object literal for the '<em><b>Create Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION = eINSTANCE.getRegularPatternInvocationBuilder__CreateAction();

      /**
       * The meta object literal for the '<em><b>Explore Attribute Assignments</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = eINSTANCE
            .getRegularPatternInvocationBuilder__ExploreAttributeAssignments__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Explore Attribute Constraints</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN = eINSTANCE
            .getRegularPatternInvocationBuilder__ExploreAttributeConstraints__PatternInvocationBuilder_ExpressionExplorer_ObjectVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Get Pattern Invocation Builder</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER = eINSTANCE
            .getRegularPatternInvocationBuilder__GetPatternInvocationBuilder();

      /**
       * The meta object literal for the '<em><b>Handle Relevant Object Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE = eINSTANCE
            .getRegularPatternInvocationBuilder__HandleRelevantObjectVariable__PatternInvocation_ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Handle Variable Reference</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = eINSTANCE
            .getRegularPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier();

      /**
       * The meta object literal for the '<em><b>Handle Variable Reference In Superclass</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER = eINSTANCE
            .getRegularPatternInvocationBuilder__HandleVariableReferenceInSuperclass__Variable_EClassifier();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE
            .getRegularPatternInvocationBuilder__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Lookup Scope Validator</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR = eINSTANCE.getRegularPatternInvocationBuilder__LookupScopeValidator();

      /**
       * The meta object literal for the '<em><b>Postprocess Pattern Interface</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN = eINSTANCE
            .getRegularPatternInvocationBuilder__PostprocessPatternInterface__StoryPattern();

      /**
       * The meta object literal for the '<em><b>Transform Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN = eINSTANCE
            .getRegularPatternInvocationBuilder__TransformPattern__StoryPattern_Pattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternMatcherImpl <em>Pattern Matcher</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.PatternMatcherImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getPatternMatcher()
       * @generated
       */
      EClass PATTERN_MATCHER = eINSTANCE.getPatternMatcher();

      /**
       * The meta object literal for the '<em><b>Validation Report</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATTERN_MATCHER__VALIDATION_REPORT = eINSTANCE.getPatternMatcher_ValidationReport();

      /**
       * The meta object literal for the '<em><b>Generate Search Plan</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_MATCHER___GENERATE_SEARCH_PLAN__PATTERN_ADORNMENT_BOOLEAN = eINSTANCE
            .getPatternMatcher__GenerateSearchPlan__Pattern_Adornment_boolean();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.SingleResultPatternInvocationBuilderImpl <em>Single Result Pattern Invocation Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.SingleResultPatternInvocationBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getSingleResultPatternInvocationBuilder()
       * @generated
       */
      EClass SINGLE_RESULT_PATTERN_INVOCATION_BUILDER = eINSTANCE.getSingleResultPatternInvocationBuilder();

      /**
       * The meta object literal for the '<em><b>Pattern Variable Handler</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER = eINSTANCE
            .getSingleResultPatternInvocationBuilder_PatternVariableHandler();

      /**
       * The meta object literal for the '<em><b>Build Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE = eINSTANCE.getSingleResultPatternInvocationBuilder__BuildAction__CFNode();

      /**
       * The meta object literal for the '<em><b>Build Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE_EXPRESSION_EOPERATION = eINSTANCE
            .getSingleResultPatternInvocationBuilder__BuildAction__CFNode_Expression_EOperation();

      /**
       * The meta object literal for the '<em><b>Create Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___CREATE_ACTION = eINSTANCE.getSingleResultPatternInvocationBuilder__CreateAction();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternInvocationBuilderImpl <em>Pattern Invocation Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.PatternInvocationBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getPatternInvocationBuilder()
       * @generated
       */
      EClass PATTERN_INVOCATION_BUILDER = eINSTANCE.getPatternInvocationBuilder();

      /**
       * The meta object literal for the '<em><b>Expression Explorer</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATTERN_INVOCATION_BUILDER__EXPRESSION_EXPLORER = eINSTANCE.getPatternInvocationBuilder_ExpressionExplorer();

      /**
       * The meta object literal for the '<em><b>Pattern Matcher</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATTERN_INVOCATION_BUILDER__PATTERN_MATCHER = eINSTANCE.getPatternInvocationBuilder_PatternMatcher();

      /**
       * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PATTERN_INVOCATION_BUILDER__SUFFIX = eINSTANCE.getPatternInvocationBuilder_Suffix();

      /**
       * The meta object literal for the '<em><b>Attach To Resource</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___ATTACH_TO_RESOURCE__CFNODE_PATTERN = eINSTANCE.getPatternInvocationBuilder__AttachToResource__CFNode_Pattern();

      /**
       * The meta object literal for the '<em><b>Calculate Adornment</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___CALCULATE_ADORNMENT__PATTERNINVOCATION = eINSTANCE
            .getPatternInvocationBuilder__CalculateAdornment__PatternInvocation();

      /**
       * The meta object literal for the '<em><b>Calculate Pattern Name</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___CALCULATE_PATTERN_NAME__CFNODE = eINSTANCE.getPatternInvocationBuilder__CalculatePatternName__CFNode();

      /**
       * The meta object literal for the '<em><b>Create Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___CREATE_ACTION = eINSTANCE.getPatternInvocationBuilder__CreateAction();

      /**
       * The meta object literal for the '<em><b>Handle Pattern Matcher Report</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___HANDLE_PATTERN_MATCHER_REPORT__PATTERNINVOCATION_VALIDATIONREPORT = eINSTANCE
            .getPatternInvocationBuilder__HandlePatternMatcherReport__PatternInvocation_ValidationReport();

      /**
       * The meta object literal for the '<em><b>Handle Variable Reference</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER = eINSTANCE
            .getPatternInvocationBuilder__HandleVariableReference__Variable_EClassifier();

      /**
       * The meta object literal for the '<em><b>Has Errors</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___HAS_ERRORS = eINSTANCE.getPatternInvocationBuilder__HasErrors();

      /**
       * The meta object literal for the '<em><b>Lookup Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE = eINSTANCE.getPatternInvocationBuilder__LookupAction__CFNode();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.StoryNodeActionBuilderImpl <em>Story Node Action Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.StoryNodeActionBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getStoryNodeActionBuilder()
       * @generated
       */
      EClass STORY_NODE_ACTION_BUILDER = eINSTANCE.getStoryNodeActionBuilder();

      /**
       * The meta object literal for the '<em><b>Requires For Each</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH = eINSTANCE.getStoryNodeActionBuilder_RequiresForEach();

      /**
       * The meta object literal for the '<em><b>Build Action</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation STORY_NODE_ACTION_BUILDER___BUILD_ACTION__CFNODE = eINSTANCE.getStoryNodeActionBuilder__BuildAction__CFNode();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundActionBuilderImpl <em>Compound Action Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.CompoundActionBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getCompoundActionBuilder()
       * @generated
       */
      EClass COMPOUND_ACTION_BUILDER = eINSTANCE.getCompoundActionBuilder();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPOUND_ACTION_BUILDER__CHILDREN = eINSTANCE.getCompoundActionBuilder_Children();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.GreenPatternBuilderImpl <em>Green Pattern Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.GreenPatternBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getGreenPatternBuilder()
       * @generated
       */
      EClass GREEN_PATTERN_BUILDER = eINSTANCE.getGreenPatternBuilder();

      /**
       * The meta object literal for the '<em><b>Validate Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation GREEN_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE = eINSTANCE
            .getGreenPatternBuilder__ValidateVariable__Action_CFVariable_ObjectVariable();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ExpressionExplorerImpl <em>Expression Explorer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ExpressionExplorerImpl
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getExpressionExplorer()
       * @generated
       */
      EClass EXPRESSION_EXPLORER = eINSTANCE.getExpressionExplorer();

      /**
       * The meta object literal for the '<em><b>Expression Transformer</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER = eINSTANCE.getExpressionExplorer_ExpressionTransformer();

      /**
       * The meta object literal for the '<em><b>Explore Expression</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXPRESSION_EXPLORER___EXPLORE_EXPRESSION__PATTERNINVOCATIONBUILDER_PATTERN_EXPRESSION = eINSTANCE
            .getExpressionExplorer__ExploreExpression__PatternInvocationBuilder_Pattern_Expression();

      /**
       * The meta object literal for the '<em><b>Handle Symbolic Parameter</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXPRESSION_EXPLORER___HANDLE_SYMBOLIC_PARAMETER__PATTERNINVOCATIONBUILDER_PATTERN_STRING_ECLASSIFIER = eINSTANCE
            .getExpressionExplorer__HandleSymbolicParameter__PatternInvocationBuilder_Pattern_String_EClassifier();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.scope.Errors <em>Errors</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.scope.Errors
       * @see org.moflon.sdm.compiler.democles.validation.scope.impl.ScopePackageImpl#getErrors()
       * @generated
       */
      EEnum ERRORS = eINSTANCE.getErrors();

   }

} //ScopePackage
