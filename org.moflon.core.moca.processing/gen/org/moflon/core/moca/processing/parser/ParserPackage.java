/**
 */
package org.moflon.core.moca.processing.parser;

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
 * @see org.moflon.core.moca.processing.parser.ParserFactory
 * @model kind="package"
 * @generated
 */
public interface ParserPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parser";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.core.moca.processing/model/Processing.ecore#//parser";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parser";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParserPackage eINSTANCE = org.moflon.core.moca.processing.parser.impl.ParserPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.parser.impl.ParserImpl <em>Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.parser.impl.ParserImpl
	 * @see org.moflon.core.moca.processing.parser.impl.ParserPackageImpl#getParser()
	 * @generated
	 */
	int PARSER = 0;

	/**
	 * The feature id for the '<em><b>Code Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER__CODE_ADAPTER = 0;

	/**
	 * The number of structural features of the '<em>Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Can Parse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER___CAN_PARSE_FILE__STRING = 0;

	/**
	 * The operation id for the '<em>Parse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER___PARSE__READER = 1;

	/**
	 * The operation id for the '<em>Parse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER___PARSE__FILE_READER = 2;

	/**
	 * The number of operations of the '<em>Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.parser.impl.XMLParserImpl <em>XML Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.parser.impl.XMLParserImpl
	 * @see org.moflon.core.moca.processing.parser.impl.ParserPackageImpl#getXMLParser()
	 * @generated
	 */
	int XML_PARSER = 1;

	/**
	 * The feature id for the '<em><b>Code Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PARSER__CODE_ADAPTER = PARSER__CODE_ADAPTER;

	/**
	 * The feature id for the '<em><b>Ignore Whitespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PARSER__IGNORE_WHITESPACES = PARSER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PARSER_FEATURE_COUNT = PARSER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Parse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PARSER___PARSE__FILE_READER = PARSER___PARSE__FILE_READER;

	/**
	 * The operation id for the '<em>Can Parse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PARSER___CAN_PARSE_FILE__STRING = PARSER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PARSER___PARSE__READER = PARSER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>XML Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PARSER_OPERATION_COUNT = PARSER_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.parser.Parser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser</em>'.
	 * @see org.moflon.core.moca.processing.parser.Parser
	 * @generated
	 */
	EClass getParser();

	/**
	 * Returns the meta object for the container reference '{@link org.moflon.core.moca.processing.parser.Parser#getCodeAdapter <em>Code Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Code Adapter</em>'.
	 * @see org.moflon.core.moca.processing.parser.Parser#getCodeAdapter()
	 * @see #getParser()
	 * @generated
	 */
	EReference getParser_CodeAdapter();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.parser.Parser#canParseFile(java.lang.String) <em>Can Parse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Parse File</em>' operation.
	 * @see org.moflon.core.moca.processing.parser.Parser#canParseFile(java.lang.String)
	 * @generated
	 */
	EOperation getParser__CanParseFile__String();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.parser.Parser#parse(java.io.Reader) <em>Parse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse</em>' operation.
	 * @see org.moflon.core.moca.processing.parser.Parser#parse(java.io.Reader)
	 * @generated
	 */
	EOperation getParser__Parse__Reader();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.parser.Parser#parse(java.io.File, java.io.Reader) <em>Parse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse</em>' operation.
	 * @see org.moflon.core.moca.processing.parser.Parser#parse(java.io.File, java.io.Reader)
	 * @generated
	 */
	EOperation getParser__Parse__File_Reader();

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.parser.XMLParser <em>XML Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Parser</em>'.
	 * @see org.moflon.core.moca.processing.parser.XMLParser
	 * @generated
	 */
	EClass getXMLParser();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.core.moca.processing.parser.XMLParser#isIgnoreWhitespaces <em>Ignore Whitespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Whitespaces</em>'.
	 * @see org.moflon.core.moca.processing.parser.XMLParser#isIgnoreWhitespaces()
	 * @see #getXMLParser()
	 * @generated
	 */
	EAttribute getXMLParser_IgnoreWhitespaces();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.parser.XMLParser#canParseFile(java.lang.String) <em>Can Parse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Parse File</em>' operation.
	 * @see org.moflon.core.moca.processing.parser.XMLParser#canParseFile(java.lang.String)
	 * @generated
	 */
	EOperation getXMLParser__CanParseFile__String();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.parser.XMLParser#parse(java.io.Reader) <em>Parse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse</em>' operation.
	 * @see org.moflon.core.moca.processing.parser.XMLParser#parse(java.io.Reader)
	 * @generated
	 */
	EOperation getXMLParser__Parse__Reader();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParserFactory getParserFactory();

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
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.parser.impl.ParserImpl <em>Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.parser.impl.ParserImpl
		 * @see org.moflon.core.moca.processing.parser.impl.ParserPackageImpl#getParser()
		 * @generated
		 */
		EClass PARSER = eINSTANCE.getParser();

		/**
		 * The meta object literal for the '<em><b>Code Adapter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER__CODE_ADAPTER = eINSTANCE.getParser_CodeAdapter();

		/**
		 * The meta object literal for the '<em><b>Can Parse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARSER___CAN_PARSE_FILE__STRING = eINSTANCE.getParser__CanParseFile__String();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARSER___PARSE__READER = eINSTANCE.getParser__Parse__Reader();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARSER___PARSE__FILE_READER = eINSTANCE.getParser__Parse__File_Reader();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.parser.impl.XMLParserImpl <em>XML Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.parser.impl.XMLParserImpl
		 * @see org.moflon.core.moca.processing.parser.impl.ParserPackageImpl#getXMLParser()
		 * @generated
		 */
		EClass XML_PARSER = eINSTANCE.getXMLParser();

		/**
		 * The meta object literal for the '<em><b>Ignore Whitespaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_PARSER__IGNORE_WHITESPACES = eINSTANCE.getXMLParser_IgnoreWhitespaces();

		/**
		 * The meta object literal for the '<em><b>Can Parse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PARSER___CAN_PARSE_FILE__STRING = eINSTANCE.getXMLParser__CanParseFile__String();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_PARSER___PARSE__READER = eINSTANCE.getXMLParser__Parse__Reader();

	}

} //ParserPackage
