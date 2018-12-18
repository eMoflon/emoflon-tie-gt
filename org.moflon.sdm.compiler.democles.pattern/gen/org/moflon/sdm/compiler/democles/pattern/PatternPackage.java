/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.moflon.sdm.compiler.democles.pattern.PatternFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.sdm.compiler.democles'"
 * @generated
 */
public interface PatternPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "pattern";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "platform:/plugin/org.moflon.sdm.compiler.democles.pattern/model/Pattern.ecore";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "org.moflon.sdm.compiler.democles.pattern";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   PatternPackage eINSTANCE = org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl.init();

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.PatternVariableHandlerImpl <em>Variable Handler</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternVariableHandlerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getPatternVariableHandler()
    * @generated
    */
   int PATTERN_VARIABLE_HANDLER = 1;

   /**
    * The number of structural features of the '<em>Variable Handler</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_VARIABLE_HANDLER_FEATURE_COUNT = 0;

   /**
    * The operation id for the '<em>Concat</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_VARIABLE_HANDLER___CONCAT__STRING_STRING = 0;

   /**
    * The operation id for the '<em>Get Attribute Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_VARIABLE_HANDLER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = 1;

   /**
    * The operation id for the '<em>Lookup Variable In Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_VARIABLE_HANDLER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = 2;

   /**
    * The number of operations of the '<em>Variable Handler</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_VARIABLE_HANDLER_OPERATION_COUNT = 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.PatternTransformerImpl <em>Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getPatternTransformer()
    * @generated
    */
   int PATTERN_TRANSFORMER = 6;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER__VALIDATION_REPORT = PATTERN_VARIABLE_HANDLER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER = PATTERN_VARIABLE_HANDLER_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER_FEATURE_COUNT = PATTERN_VARIABLE_HANDLER_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Concat</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___CONCAT__STRING_STRING = PATTERN_VARIABLE_HANDLER___CONCAT__STRING_STRING;

   /**
    * The operation id for the '<em>Get Attribute Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = PATTERN_VARIABLE_HANDLER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN;

   /**
    * The operation id for the '<em>Lookup Variable In Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = PATTERN_VARIABLE_HANDLER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Add Link To Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Get EReference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Has Symbolic Parameter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Is Link To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 3;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 4;

   /**
    * The operation id for the '<em>Postprocess</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 5;

   /**
    * The operation id for the '<em>Process Link Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 6;

   /**
    * The operation id for the '<em>Transform</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 7;

   /**
    * The number of operations of the '<em>Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_TRANSFORMER_OPERATION_COUNT = PATTERN_VARIABLE_HANDLER_OPERATION_COUNT + 8;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.GreenPatternTransformerImpl <em>Green Pattern Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.GreenPatternTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getGreenPatternTransformer()
    * @generated
    */
   int GREEN_PATTERN_TRANSFORMER = 0;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER__VALIDATION_REPORT = PATTERN_TRANSFORMER__VALIDATION_REPORT;

   /**
    * The feature id for the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER = PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER;

   /**
    * The number of structural features of the '<em>Green Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER_FEATURE_COUNT = PATTERN_TRANSFORMER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Concat</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___CONCAT__STRING_STRING = PATTERN_TRANSFORMER___CONCAT__STRING_STRING;

   /**
    * The operation id for the '<em>Get Attribute Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN;

   /**
    * The operation id for the '<em>Lookup Variable In Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Add Link To Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get EReference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE = PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE;

   /**
    * The operation id for the '<em>Has Symbolic Parameter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING = PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING;

   /**
    * The operation id for the '<em>Process Link Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Transform</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Is Link To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = PATTERN_TRANSFORMER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Postprocess</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Transform Assignment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER___TRANSFORM_ASSIGNMENT__ATTRIBUTEASSIGNMENT_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 3;

   /**
    * The number of operations of the '<em>Green Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GREEN_PATTERN_TRANSFORMER_OPERATION_COUNT = PATTERN_TRANSFORMER_OPERATION_COUNT + 4;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.BlackAndNacPatternTransformerImpl <em>Black And Nac Pattern Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.BlackAndNacPatternTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getBlackAndNacPatternTransformer()
    * @generated
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER = 2;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER__VALIDATION_REPORT = PATTERN_TRANSFORMER__VALIDATION_REPORT;

   /**
    * The feature id for the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER = PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER;

   /**
    * The number of structural features of the '<em>Black And Nac Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER_FEATURE_COUNT = PATTERN_TRANSFORMER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Concat</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___CONCAT__STRING_STRING = PATTERN_TRANSFORMER___CONCAT__STRING_STRING;

   /**
    * The operation id for the '<em>Get Attribute Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN;

   /**
    * The operation id for the '<em>Lookup Variable In Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Add Link To Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get EReference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE = PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE;

   /**
    * The operation id for the '<em>Has Symbolic Parameter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING = PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING;

   /**
    * The operation id for the '<em>Process Link Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Transform</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Analyze Injectivity</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___ANALYZE_INJECTIVITY__PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Are Compatible Types</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___ARE_COMPATIBLE_TYPES__ECLASSIFIER_ECLASSIFIER = PATTERN_TRANSFORMER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Create Injectivity Constraint</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_INJECTIVITY_CONSTRAINT__PATTERN_VARIABLE_VARIABLE = PATTERN_TRANSFORMER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Create Relational Constraint</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_RELATIONAL_CONSTRAINT__COMPARISONEXPRESSION = PATTERN_TRANSFORMER_OPERATION_COUNT + 3;

   /**
    * The operation id for the '<em>Injective Mapping Required</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___INJECTIVE_MAPPING_REQUIRED__VARIABLE_VARIABLE = PATTERN_TRANSFORMER_OPERATION_COUNT + 4;

   /**
    * The operation id for the '<em>Is Link To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 5;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = PATTERN_TRANSFORMER_OPERATION_COUNT + 6;

   /**
    * The operation id for the '<em>Postprocess</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 7;

   /**
    * The operation id for the '<em>Transform Attribute Constraint</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER___TRANSFORM_ATTRIBUTE_CONSTRAINT__CONSTRAINT_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 8;

   /**
    * The number of operations of the '<em>Black And Nac Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BLACK_AND_NAC_PATTERN_TRANSFORMER_OPERATION_COUNT = PATTERN_TRANSFORMER_OPERATION_COUNT + 9;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.NacPatternTransformerImpl <em>Nac Pattern Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.NacPatternTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getNacPatternTransformer()
    * @generated
    */
   int NAC_PATTERN_TRANSFORMER = 3;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER__VALIDATION_REPORT = BLACK_AND_NAC_PATTERN_TRANSFORMER__VALIDATION_REPORT;

   /**
    * The feature id for the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER = BLACK_AND_NAC_PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER;

   /**
    * The number of structural features of the '<em>Nac Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER_FEATURE_COUNT = BLACK_AND_NAC_PATTERN_TRANSFORMER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Concat</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___CONCAT__STRING_STRING = BLACK_AND_NAC_PATTERN_TRANSFORMER___CONCAT__STRING_STRING;

   /**
    * The operation id for the '<em>Get Attribute Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN;

   /**
    * The operation id for the '<em>Lookup Variable In Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = BLACK_AND_NAC_PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Get EReference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE = BLACK_AND_NAC_PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE;

   /**
    * The operation id for the '<em>Has Symbolic Parameter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING = BLACK_AND_NAC_PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING;

   /**
    * The operation id for the '<em>Process Link Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Transform</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Analyze Injectivity</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___ANALYZE_INJECTIVITY__PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER___ANALYZE_INJECTIVITY__PATTERN;

   /**
    * The operation id for the '<em>Are Compatible Types</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___ARE_COMPATIBLE_TYPES__ECLASSIFIER_ECLASSIFIER = BLACK_AND_NAC_PATTERN_TRANSFORMER___ARE_COMPATIBLE_TYPES__ECLASSIFIER_ECLASSIFIER;

   /**
    * The operation id for the '<em>Create Injectivity Constraint</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___CREATE_INJECTIVITY_CONSTRAINT__PATTERN_VARIABLE_VARIABLE = BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_INJECTIVITY_CONSTRAINT__PATTERN_VARIABLE_VARIABLE;

   /**
    * The operation id for the '<em>Create Relational Constraint</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___CREATE_RELATIONAL_CONSTRAINT__COMPARISONEXPRESSION = BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_RELATIONAL_CONSTRAINT__COMPARISONEXPRESSION;

   /**
    * The operation id for the '<em>Injective Mapping Required</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___INJECTIVE_MAPPING_REQUIRED__VARIABLE_VARIABLE = BLACK_AND_NAC_PATTERN_TRANSFORMER___INJECTIVE_MAPPING_REQUIRED__VARIABLE_VARIABLE;

   /**
    * The operation id for the '<em>Transform Attribute Constraint</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___TRANSFORM_ATTRIBUTE_CONSTRAINT__CONSTRAINT_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER___TRANSFORM_ATTRIBUTE_CONSTRAINT__CONSTRAINT_PATTERN;

   /**
    * The operation id for the '<em>Add Link To Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Is Link To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = BLACK_AND_NAC_PATTERN_TRANSFORMER_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Postprocess</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER_OPERATION_COUNT + 3;

   /**
    * The operation id for the '<em>Transform Nac Constraints</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER___TRANSFORM_NAC_CONSTRAINTS__OBJECTVARIABLE_PATTERN = BLACK_AND_NAC_PATTERN_TRANSFORMER_OPERATION_COUNT + 4;

   /**
    * The number of operations of the '<em>Nac Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAC_PATTERN_TRANSFORMER_OPERATION_COUNT = BLACK_AND_NAC_PATTERN_TRANSFORMER_OPERATION_COUNT + 5;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.BindingPatternTransformerImpl <em>Binding Pattern Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.BindingPatternTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getBindingPatternTransformer()
    * @generated
    */
   int BINDING_PATTERN_TRANSFORMER = 4;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER__VALIDATION_REPORT = PATTERN_TRANSFORMER__VALIDATION_REPORT;

   /**
    * The feature id for the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER = PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER;

   /**
    * The number of structural features of the '<em>Binding Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER_FEATURE_COUNT = PATTERN_TRANSFORMER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Concat</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___CONCAT__STRING_STRING = PATTERN_TRANSFORMER___CONCAT__STRING_STRING;

   /**
    * The operation id for the '<em>Get Attribute Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN;

   /**
    * The operation id for the '<em>Lookup Variable In Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Add Link To Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get EReference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE = PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE;

   /**
    * The operation id for the '<em>Has Symbolic Parameter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING = PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING;

   /**
    * The operation id for the '<em>Is Link To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Process Link Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Transform</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = PATTERN_TRANSFORMER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Postprocess</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Process Object Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER___PROCESS_OBJECT_VARIABLES__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 2;

   /**
    * The number of operations of the '<em>Binding Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_TRANSFORMER_OPERATION_COUNT = PATTERN_TRANSFORMER_OPERATION_COUNT + 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.ExpressionTransformerImpl <em>Expression Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.ExpressionTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getExpressionTransformer()
    * @generated
    */
   int EXPRESSION_TRANSFORMER = 7;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_TRANSFORMER__DELEGATE = 0;

   /**
    * The number of structural features of the '<em>Expression Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_TRANSFORMER_FEATURE_COUNT = 1;

   /**
    * The operation id for the '<em>Lookup Error Message</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS = 0;

   /**
    * The operation id for the '<em>Transform And Assign Expression</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER = 1;

   /**
    * The operation id for the '<em>Transform Expression</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER = 2;

   /**
    * The number of operations of the '<em>Expression Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_TRANSFORMER_OPERATION_COUNT = 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.DefaultExpressionTransformerImpl <em>Default Expression Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.DefaultExpressionTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getDefaultExpressionTransformer()
    * @generated
    */
   int DEFAULT_EXPRESSION_TRANSFORMER = 5;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER__DELEGATE = EXPRESSION_TRANSFORMER__DELEGATE;

   /**
    * The feature id for the '<em><b>Callee EType Name Counter</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER = EXPRESSION_TRANSFORMER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Default Expression Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER_FEATURE_COUNT = EXPRESSION_TRANSFORMER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Lookup Error Message</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS = EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS;

   /**
    * The operation id for the '<em>Transform And Assign Expression</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER = EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Create Local Variable Name And Increment Counter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER___CREATE_LOCAL_VARIABLE_NAME_AND_INCREMENT_COUNTER = EXPRESSION_TRANSFORMER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Transform Expression</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER = EXPRESSION_TRANSFORMER_OPERATION_COUNT
         + 1;

   /**
    * The operation id for the '<em>Transform Method Invocation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_METHOD_INVOCATION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_METHODCALLEXPRESSION_PATTERN_CONSTRAINT = EXPRESSION_TRANSFORMER_OPERATION_COUNT
         + 2;

   /**
    * The operation id for the '<em>Check Type Compatibility</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER___CHECK_TYPE_COMPATIBILITY__VALIDATIONREPORT_EXPRESSION_ECLASSIFIER_ECLASSIFIER = EXPRESSION_TRANSFORMER_OPERATION_COUNT
         + 3;

   /**
    * The operation id for the '<em>Are Equal</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER___ARE_EQUAL__ECLASSIFIER_ECLASSIFIER = EXPRESSION_TRANSFORMER_OPERATION_COUNT + 4;

   /**
    * The number of operations of the '<em>Default Expression Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_EXPRESSION_TRANSFORMER_OPERATION_COUNT = EXPRESSION_TRANSFORMER_OPERATION_COUNT + 5;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.RedPatternTransformerImpl <em>Red Pattern Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.RedPatternTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getRedPatternTransformer()
    * @generated
    */
   int RED_PATTERN_TRANSFORMER = 8;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER__VALIDATION_REPORT = PATTERN_TRANSFORMER__VALIDATION_REPORT;

   /**
    * The feature id for the '<em><b>Expression Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER = PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER;

   /**
    * The number of structural features of the '<em>Red Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER_FEATURE_COUNT = PATTERN_TRANSFORMER_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Concat</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___CONCAT__STRING_STRING = PATTERN_TRANSFORMER___CONCAT__STRING_STRING;

   /**
    * The operation id for the '<em>Get Attribute Variable</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = PATTERN_TRANSFORMER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN;

   /**
    * The operation id for the '<em>Lookup Variable In Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = PATTERN_TRANSFORMER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER;

   /**
    * The operation id for the '<em>Add Link To Pattern</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN;

   /**
    * The operation id for the '<em>Get EReference</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE = PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE;

   /**
    * The operation id for the '<em>Has Symbolic Parameter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING = PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING;

   /**
    * The operation id for the '<em>Postprocess</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Process Link Variables</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Transform</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN = PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN;

   /**
    * The operation id for the '<em>Is Link To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = PATTERN_TRANSFORMER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Is Variable To Add</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = PATTERN_TRANSFORMER_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Red Pattern Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RED_PATTERN_TRANSFORMER_OPERATION_COUNT = PATTERN_TRANSFORMER_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.LiteralExpressionTransformerImpl <em>Literal Expression Transformer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.impl.LiteralExpressionTransformerImpl
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getLiteralExpressionTransformer()
    * @generated
    */
   int LITERAL_EXPRESSION_TRANSFORMER = 9;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_TRANSFORMER__DELEGATE = EXPRESSION_TRANSFORMER__DELEGATE;

   /**
    * The feature id for the '<em><b>Constant Transformer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER = EXPRESSION_TRANSFORMER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Literal Expression Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_TRANSFORMER_FEATURE_COUNT = EXPRESSION_TRANSFORMER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Lookup Error Message</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS = EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS;

   /**
    * The operation id for the '<em>Transform And Assign Expression</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER = EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER;

   /**
    * The operation id for the '<em>Transform Expression</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER = EXPRESSION_TRANSFORMER_OPERATION_COUNT
         + 0;

   /**
    * The number of operations of the '<em>Literal Expression Transformer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_TRANSFORMER_OPERATION_COUNT = EXPRESSION_TRANSFORMER_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.pattern.Errors <em>Errors</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.pattern.Errors
    * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getErrors()
    * @generated
    */
   int ERRORS = 10;

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer <em>Green Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Green Pattern Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer
    * @generated
    */
   EClass getGreenPatternTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern) <em>Is Link To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Link To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getGreenPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getGreenPatternTransformer__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Postprocess</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Postprocess</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getGreenPatternTransformer__Postprocess__StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#transformAssignment(SDMLanguage.patterns.AttributeAssignment, org.gervarro.democles.specification.emf.Pattern) <em>Transform Assignment</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Assignment</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.GreenPatternTransformer#transformAssignment(SDMLanguage.patterns.AttributeAssignment, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getGreenPatternTransformer__TransformAssignment__AttributeAssignment_Pattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler <em>Variable Handler</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Variable Handler</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler
    * @generated
    */
   EClass getPatternVariableHandler();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler#concat(java.lang.String, java.lang.String) <em>Concat</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Concat</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler#concat(java.lang.String, java.lang.String)
    * @generated
    */
   EOperation getPatternVariableHandler__Concat__String_String();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler#getAttributeVariable(SDMLanguage.patterns.ObjectVariable, org.eclipse.emf.ecore.EAttribute, org.gervarro.democles.specification.emf.Pattern) <em>Get Attribute Variable</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Attribute Variable</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler#getAttributeVariable(SDMLanguage.patterns.ObjectVariable, org.eclipse.emf.ecore.EAttribute, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getPatternVariableHandler__GetAttributeVariable__ObjectVariable_EAttribute_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler#lookupVariableInPattern(org.gervarro.democles.specification.emf.Pattern, java.lang.String, org.eclipse.emf.ecore.EClassifier) <em>Lookup Variable In Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Variable In Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler#lookupVariableInPattern(org.gervarro.democles.specification.emf.Pattern, java.lang.String, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getPatternVariableHandler__LookupVariableInPattern__Pattern_String_EClassifier();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer <em>Black And Nac Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Black And Nac Pattern Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer
    * @generated
    */
   EClass getBlackAndNacPatternTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#analyzeInjectivity(org.gervarro.democles.specification.emf.Pattern) <em>Analyze Injectivity</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Analyze Injectivity</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#analyzeInjectivity(org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__AnalyzeInjectivity__Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#areCompatibleTypes(org.eclipse.emf.ecore.EClassifier, org.eclipse.emf.ecore.EClassifier) <em>Are Compatible Types</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Are Compatible Types</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#areCompatibleTypes(org.eclipse.emf.ecore.EClassifier, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__AreCompatibleTypes__EClassifier_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#createInjectivityConstraint(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Variable, org.gervarro.democles.specification.emf.Variable) <em>Create Injectivity Constraint</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Injectivity Constraint</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#createInjectivityConstraint(org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Variable, org.gervarro.democles.specification.emf.Variable)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__CreateInjectivityConstraint__Pattern_Variable_Variable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#createRelationalConstraint(SDMLanguage.expressions.ComparisonExpression) <em>Create Relational Constraint</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Relational Constraint</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#createRelationalConstraint(SDMLanguage.expressions.ComparisonExpression)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__CreateRelationalConstraint__ComparisonExpression();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#injectiveMappingRequired(org.gervarro.democles.specification.emf.Variable, org.gervarro.democles.specification.emf.Variable) <em>Injective Mapping Required</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Injective Mapping Required</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#injectiveMappingRequired(org.gervarro.democles.specification.emf.Variable, org.gervarro.democles.specification.emf.Variable)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__InjectiveMappingRequired__Variable_Variable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern) <em>Is Link To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Link To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Postprocess</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Postprocess</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__Postprocess__StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#transformAttributeConstraint(SDMLanguage.patterns.Constraint, org.gervarro.democles.specification.emf.Pattern) <em>Transform Attribute Constraint</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Attribute Constraint</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer#transformAttributeConstraint(SDMLanguage.patterns.Constraint, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBlackAndNacPatternTransformer__TransformAttributeConstraint__Constraint_Pattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer <em>Nac Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Nac Pattern Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer
    * @generated
    */
   EClass getNacPatternTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#addLinkToPattern(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern) <em>Add Link To Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Add Link To Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#addLinkToPattern(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternTransformer__AddLinkToPattern__LinkVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern) <em>Is Link To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Link To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getNacPatternTransformer__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Postprocess</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Postprocess</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternTransformer__Postprocess__StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#transformNacConstraints(SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern) <em>Transform Nac Constraints</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Nac Constraints</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer#transformNacConstraints(SDMLanguage.patterns.ObjectVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getNacPatternTransformer__TransformNacConstraints__ObjectVariable_Pattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer <em>Binding Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Binding Pattern Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer
    * @generated
    */
   EClass getBindingPatternTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getBindingPatternTransformer__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Postprocess</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Postprocess</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBindingPatternTransformer__Postprocess__StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer#processObjectVariables(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Process Object Variables</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Object Variables</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.BindingPatternTransformer#processObjectVariables(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getBindingPatternTransformer__ProcessObjectVariables__StoryPattern_Pattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer <em>Default Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Default Expression Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer
    * @generated
    */
   EClass getDefaultExpressionTransformer();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#getCalleeETypeNameCounter <em>Callee EType Name Counter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Callee EType Name Counter</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#getCalleeETypeNameCounter()
    * @see #getDefaultExpressionTransformer()
    * @generated
    */
   EAttribute getDefaultExpressionTransformer_CalleeETypeNameCounter();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#createLocalVariableNameAndIncrementCounter() <em>Create Local Variable Name And Increment Counter</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Create Local Variable Name And Increment Counter</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#createLocalVariableNameAndIncrementCounter()
    * @generated
    */
   EOperation getDefaultExpressionTransformer__CreateLocalVariableNameAndIncrementCounter();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#transformExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.eclipse.emf.ecore.EClassifier) <em>Transform Expression</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Expression</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#transformExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getDefaultExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#transformMethodInvocation(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.calls.callExpressions.MethodCallExpression, org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Constraint) <em>Transform Method Invocation</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Method Invocation</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#transformMethodInvocation(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.calls.callExpressions.MethodCallExpression, org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Constraint)
    * @generated
    */
   EOperation getDefaultExpressionTransformer__TransformMethodInvocation__ValidationReport_PatternVariableHandler_MethodCallExpression_Pattern_Constraint();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#checkTypeCompatibility(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, SDMLanguage.expressions.Expression, org.eclipse.emf.ecore.EClassifier, org.eclipse.emf.ecore.EClassifier) <em>Check Type Compatibility</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Check Type Compatibility</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#checkTypeCompatibility(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, SDMLanguage.expressions.Expression, org.eclipse.emf.ecore.EClassifier, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getDefaultExpressionTransformer__CheckTypeCompatibility__ValidationReport_Expression_EClassifier_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#areEqual(org.eclipse.emf.ecore.EClassifier, org.eclipse.emf.ecore.EClassifier) <em>Are Equal</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Are Equal</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer#areEqual(org.eclipse.emf.ecore.EClassifier, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getDefaultExpressionTransformer__AreEqual__EClassifier_EClassifier();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer <em>Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer
    * @generated
    */
   EClass getPatternTransformer();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getValidationReport <em>Validation Report</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Validation Report</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getValidationReport()
    * @see #getPatternTransformer()
    * @generated
    */
   EReference getPatternTransformer_ValidationReport();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getExpressionTransformer <em>Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Expression Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getExpressionTransformer()
    * @see #getPatternTransformer()
    * @generated
    */
   EReference getPatternTransformer_ExpressionTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#addLinkToPattern(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern) <em>Add Link To Pattern</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Add Link To Pattern</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#addLinkToPattern(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getPatternTransformer__AddLinkToPattern__LinkVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getEReference(SDMLanguage.patterns.LinkVariable) <em>Get EReference</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get EReference</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#getEReference(SDMLanguage.patterns.LinkVariable)
    * @generated
    */
   EOperation getPatternTransformer__GetEReference__LinkVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#hasSymbolicParameter(org.gervarro.democles.specification.emf.Pattern, java.lang.String) <em>Has Symbolic Parameter</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Has Symbolic Parameter</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#hasSymbolicParameter(org.gervarro.democles.specification.emf.Pattern, java.lang.String)
    * @generated
    */
   EOperation getPatternTransformer__HasSymbolicParameter__Pattern_String();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern) <em>Is Link To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Link To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getPatternTransformer__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Postprocess</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Postprocess</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#postprocess(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getPatternTransformer__Postprocess__StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#processLinkVariables(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Process Link Variables</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Link Variables</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#processLinkVariables(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getPatternTransformer__ProcessLinkVariables__StoryPattern_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.PatternTransformer#transform(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern) <em>Transform</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.PatternTransformer#transform(SDMLanguage.patterns.StoryPattern, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getPatternTransformer__Transform__StoryPattern_Pattern();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer <em>Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Expression Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer
    * @generated
    */
   EClass getExpressionTransformer();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#getDelegate <em>Delegate</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Delegate</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#getDelegate()
    * @see #getExpressionTransformer()
    * @generated
    */
   EReference getExpressionTransformer_Delegate();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#lookupErrorMessage(org.moflon.sdm.compiler.democles.pattern.Errors) <em>Lookup Error Message</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Error Message</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#lookupErrorMessage(org.moflon.sdm.compiler.democles.pattern.Errors)
    * @generated
    */
   EOperation getExpressionTransformer__LookupErrorMessage__Errors();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#transformAndAssignExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier) <em>Transform And Assign Expression</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform And Assign Expression</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#transformAndAssignExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.gervarro.democles.specification.emf.Variable, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getExpressionTransformer__TransformAndAssignExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_Variable_EClassifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#transformExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.eclipse.emf.ecore.EClassifier) <em>Transform Expression</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Expression</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer#transformExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer <em>Red Pattern Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Red Pattern Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer
    * @generated
    */
   EClass getRedPatternTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern) <em>Is Link To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Link To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer#isLinkToAdd(SDMLanguage.patterns.LinkVariable, org.gervarro.democles.specification.emf.Pattern)
    * @generated
    */
   EOperation getRedPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable) <em>Is Variable To Add</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Variable To Add</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer#isVariableToAdd(SDMLanguage.patterns.ObjectVariable)
    * @generated
    */
   EOperation getRedPatternTransformer__IsVariableToAdd__ObjectVariable();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer <em>Literal Expression Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Literal Expression Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer
    * @generated
    */
   EClass getLiteralExpressionTransformer();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer#getConstantTransformer <em>Constant Transformer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Constant Transformer</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer#getConstantTransformer()
    * @see #getLiteralExpressionTransformer()
    * @generated
    */
   EReference getLiteralExpressionTransformer_ConstantTransformer();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer#transformExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.eclipse.emf.ecore.EClassifier) <em>Transform Expression</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transform Expression</em>' operation.
    * @see org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer#transformExpression(org.moflon.sdm.compiler.democles.validation.result.ValidationReport, org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler, SDMLanguage.expressions.Expression, org.gervarro.democles.specification.emf.Pattern, org.eclipse.emf.ecore.EClassifier)
    * @generated
    */
   EOperation getLiteralExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier();

   /**
    * Returns the meta object for enum '{@link org.moflon.sdm.compiler.democles.pattern.Errors <em>Errors</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Errors</em>'.
    * @see org.moflon.sdm.compiler.democles.pattern.Errors
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
   PatternFactory getPatternFactory();

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
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.GreenPatternTransformerImpl <em>Green Pattern Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.GreenPatternTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getGreenPatternTransformer()
       * @generated
       */
      EClass GREEN_PATTERN_TRANSFORMER = eINSTANCE.getGreenPatternTransformer();

      /**
       * The meta object literal for the '<em><b>Is Link To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation GREEN_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = eINSTANCE.getGreenPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation GREEN_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE.getGreenPatternTransformer__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Postprocess</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation GREEN_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = eINSTANCE.getGreenPatternTransformer__Postprocess__StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Transform Assignment</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation GREEN_PATTERN_TRANSFORMER___TRANSFORM_ASSIGNMENT__ATTRIBUTEASSIGNMENT_PATTERN = eINSTANCE
            .getGreenPatternTransformer__TransformAssignment__AttributeAssignment_Pattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.PatternVariableHandlerImpl <em>Variable Handler</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternVariableHandlerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getPatternVariableHandler()
       * @generated
       */
      EClass PATTERN_VARIABLE_HANDLER = eINSTANCE.getPatternVariableHandler();

      /**
       * The meta object literal for the '<em><b>Concat</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_VARIABLE_HANDLER___CONCAT__STRING_STRING = eINSTANCE.getPatternVariableHandler__Concat__String_String();

      /**
       * The meta object literal for the '<em><b>Get Attribute Variable</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_VARIABLE_HANDLER___GET_ATTRIBUTE_VARIABLE__OBJECTVARIABLE_EATTRIBUTE_PATTERN = eINSTANCE
            .getPatternVariableHandler__GetAttributeVariable__ObjectVariable_EAttribute_Pattern();

      /**
       * The meta object literal for the '<em><b>Lookup Variable In Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_VARIABLE_HANDLER___LOOKUP_VARIABLE_IN_PATTERN__PATTERN_STRING_ECLASSIFIER = eINSTANCE
            .getPatternVariableHandler__LookupVariableInPattern__Pattern_String_EClassifier();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.BlackAndNacPatternTransformerImpl <em>Black And Nac Pattern Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.BlackAndNacPatternTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getBlackAndNacPatternTransformer()
       * @generated
       */
      EClass BLACK_AND_NAC_PATTERN_TRANSFORMER = eINSTANCE.getBlackAndNacPatternTransformer();

      /**
       * The meta object literal for the '<em><b>Analyze Injectivity</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___ANALYZE_INJECTIVITY__PATTERN = eINSTANCE.getBlackAndNacPatternTransformer__AnalyzeInjectivity__Pattern();

      /**
       * The meta object literal for the '<em><b>Are Compatible Types</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___ARE_COMPATIBLE_TYPES__ECLASSIFIER_ECLASSIFIER = eINSTANCE
            .getBlackAndNacPatternTransformer__AreCompatibleTypes__EClassifier_EClassifier();

      /**
       * The meta object literal for the '<em><b>Create Injectivity Constraint</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_INJECTIVITY_CONSTRAINT__PATTERN_VARIABLE_VARIABLE = eINSTANCE
            .getBlackAndNacPatternTransformer__CreateInjectivityConstraint__Pattern_Variable_Variable();

      /**
       * The meta object literal for the '<em><b>Create Relational Constraint</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___CREATE_RELATIONAL_CONSTRAINT__COMPARISONEXPRESSION = eINSTANCE
            .getBlackAndNacPatternTransformer__CreateRelationalConstraint__ComparisonExpression();

      /**
       * The meta object literal for the '<em><b>Injective Mapping Required</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___INJECTIVE_MAPPING_REQUIRED__VARIABLE_VARIABLE = eINSTANCE
            .getBlackAndNacPatternTransformer__InjectiveMappingRequired__Variable_Variable();

      /**
       * The meta object literal for the '<em><b>Is Link To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = eINSTANCE
            .getBlackAndNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE
            .getBlackAndNacPatternTransformer__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Postprocess</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = eINSTANCE
            .getBlackAndNacPatternTransformer__Postprocess__StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Transform Attribute Constraint</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BLACK_AND_NAC_PATTERN_TRANSFORMER___TRANSFORM_ATTRIBUTE_CONSTRAINT__CONSTRAINT_PATTERN = eINSTANCE
            .getBlackAndNacPatternTransformer__TransformAttributeConstraint__Constraint_Pattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.NacPatternTransformerImpl <em>Nac Pattern Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.NacPatternTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getNacPatternTransformer()
       * @generated
       */
      EClass NAC_PATTERN_TRANSFORMER = eINSTANCE.getNacPatternTransformer();

      /**
       * The meta object literal for the '<em><b>Add Link To Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = eINSTANCE
            .getNacPatternTransformer__AddLinkToPattern__LinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Is Link To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = eINSTANCE.getNacPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE.getNacPatternTransformer__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Postprocess</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = eINSTANCE.getNacPatternTransformer__Postprocess__StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Transform Nac Constraints</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation NAC_PATTERN_TRANSFORMER___TRANSFORM_NAC_CONSTRAINTS__OBJECTVARIABLE_PATTERN = eINSTANCE
            .getNacPatternTransformer__TransformNacConstraints__ObjectVariable_Pattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.BindingPatternTransformerImpl <em>Binding Pattern Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.BindingPatternTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getBindingPatternTransformer()
       * @generated
       */
      EClass BINDING_PATTERN_TRANSFORMER = eINSTANCE.getBindingPatternTransformer();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE.getBindingPatternTransformer__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Postprocess</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = eINSTANCE.getBindingPatternTransformer__Postprocess__StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Process Object Variables</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation BINDING_PATTERN_TRANSFORMER___PROCESS_OBJECT_VARIABLES__STORYPATTERN_PATTERN = eINSTANCE
            .getBindingPatternTransformer__ProcessObjectVariables__StoryPattern_Pattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.DefaultExpressionTransformerImpl <em>Default Expression Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.DefaultExpressionTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getDefaultExpressionTransformer()
       * @generated
       */
      EClass DEFAULT_EXPRESSION_TRANSFORMER = eINSTANCE.getDefaultExpressionTransformer();

      /**
       * The meta object literal for the '<em><b>Callee EType Name Counter</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER = eINSTANCE.getDefaultExpressionTransformer_CalleeETypeNameCounter();

      /**
       * The meta object literal for the '<em><b>Create Local Variable Name And Increment Counter</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEFAULT_EXPRESSION_TRANSFORMER___CREATE_LOCAL_VARIABLE_NAME_AND_INCREMENT_COUNTER = eINSTANCE
            .getDefaultExpressionTransformer__CreateLocalVariableNameAndIncrementCounter();

      /**
       * The meta object literal for the '<em><b>Transform Expression</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER = eINSTANCE
            .getDefaultExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier();

      /**
       * The meta object literal for the '<em><b>Transform Method Invocation</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_METHOD_INVOCATION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_METHODCALLEXPRESSION_PATTERN_CONSTRAINT = eINSTANCE
            .getDefaultExpressionTransformer__TransformMethodInvocation__ValidationReport_PatternVariableHandler_MethodCallExpression_Pattern_Constraint();

      /**
       * The meta object literal for the '<em><b>Check Type Compatibility</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEFAULT_EXPRESSION_TRANSFORMER___CHECK_TYPE_COMPATIBILITY__VALIDATIONREPORT_EXPRESSION_ECLASSIFIER_ECLASSIFIER = eINSTANCE
            .getDefaultExpressionTransformer__CheckTypeCompatibility__ValidationReport_Expression_EClassifier_EClassifier();

      /**
       * The meta object literal for the '<em><b>Are Equal</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEFAULT_EXPRESSION_TRANSFORMER___ARE_EQUAL__ECLASSIFIER_ECLASSIFIER = eINSTANCE
            .getDefaultExpressionTransformer__AreEqual__EClassifier_EClassifier();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.PatternTransformerImpl <em>Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getPatternTransformer()
       * @generated
       */
      EClass PATTERN_TRANSFORMER = eINSTANCE.getPatternTransformer();

      /**
       * The meta object literal for the '<em><b>Validation Report</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATTERN_TRANSFORMER__VALIDATION_REPORT = eINSTANCE.getPatternTransformer_ValidationReport();

      /**
       * The meta object literal for the '<em><b>Expression Transformer</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATTERN_TRANSFORMER__EXPRESSION_TRANSFORMER = eINSTANCE.getPatternTransformer_ExpressionTransformer();

      /**
       * The meta object literal for the '<em><b>Add Link To Pattern</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___ADD_LINK_TO_PATTERN__LINKVARIABLE_PATTERN = eINSTANCE.getPatternTransformer__AddLinkToPattern__LinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Get EReference</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___GET_EREFERENCE__LINKVARIABLE = eINSTANCE.getPatternTransformer__GetEReference__LinkVariable();

      /**
       * The meta object literal for the '<em><b>Has Symbolic Parameter</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___HAS_SYMBOLIC_PARAMETER__PATTERN_STRING = eINSTANCE.getPatternTransformer__HasSymbolicParameter__Pattern_String();

      /**
       * The meta object literal for the '<em><b>Is Link To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = eINSTANCE.getPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE.getPatternTransformer__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Postprocess</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___POSTPROCESS__STORYPATTERN_PATTERN = eINSTANCE.getPatternTransformer__Postprocess__StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Process Link Variables</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___PROCESS_LINK_VARIABLES__STORYPATTERN_PATTERN = eINSTANCE
            .getPatternTransformer__ProcessLinkVariables__StoryPattern_Pattern();

      /**
       * The meta object literal for the '<em><b>Transform</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_TRANSFORMER___TRANSFORM__STORYPATTERN_PATTERN = eINSTANCE.getPatternTransformer__Transform__StoryPattern_Pattern();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.ExpressionTransformerImpl <em>Expression Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.ExpressionTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getExpressionTransformer()
       * @generated
       */
      EClass EXPRESSION_TRANSFORMER = eINSTANCE.getExpressionTransformer();

      /**
       * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXPRESSION_TRANSFORMER__DELEGATE = eINSTANCE.getExpressionTransformer_Delegate();

      /**
       * The meta object literal for the '<em><b>Lookup Error Message</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS = eINSTANCE.getExpressionTransformer__LookupErrorMessage__Errors();

      /**
       * The meta object literal for the '<em><b>Transform And Assign Expression</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER = eINSTANCE
            .getExpressionTransformer__TransformAndAssignExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_Variable_EClassifier();

      /**
       * The meta object literal for the '<em><b>Transform Expression</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER = eINSTANCE
            .getExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.RedPatternTransformerImpl <em>Red Pattern Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.RedPatternTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getRedPatternTransformer()
       * @generated
       */
      EClass RED_PATTERN_TRANSFORMER = eINSTANCE.getRedPatternTransformer();

      /**
       * The meta object literal for the '<em><b>Is Link To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation RED_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN = eINSTANCE.getRedPatternTransformer__IsLinkToAdd__LinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Is Variable To Add</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation RED_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE = eINSTANCE.getRedPatternTransformer__IsVariableToAdd__ObjectVariable();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.impl.LiteralExpressionTransformerImpl <em>Literal Expression Transformer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.impl.LiteralExpressionTransformerImpl
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getLiteralExpressionTransformer()
       * @generated
       */
      EClass LITERAL_EXPRESSION_TRANSFORMER = eINSTANCE.getLiteralExpressionTransformer();

      /**
       * The meta object literal for the '<em><b>Constant Transformer</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER = eINSTANCE.getLiteralExpressionTransformer_ConstantTransformer();

      /**
       * The meta object literal for the '<em><b>Transform Expression</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation LITERAL_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER = eINSTANCE
            .getLiteralExpressionTransformer__TransformExpression__ValidationReport_PatternVariableHandler_Expression_Pattern_EClassifier();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.pattern.Errors <em>Errors</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.pattern.Errors
       * @see org.moflon.sdm.compiler.democles.pattern.impl.PatternPackageImpl#getErrors()
       * @generated
       */
      EEnum ERRORS = eINSTANCE.getErrors();

   }

} //PatternPackage
