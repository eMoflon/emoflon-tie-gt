/**
 */
package org.moflon.core.moca.processing.unparser;

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
 * @see org.moflon.core.moca.processing.unparser.UnparserFactory
 * @model kind="package"
 * @generated
 */
public interface UnparserPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unparser";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.core.moca.processing/model/Processing.ecore#//unparser";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unparser";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnparserPackage eINSTANCE = org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.unparser.impl.UnparserImpl <em>Unparser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.unparser.impl.UnparserImpl
	 * @see org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl#getUnparser()
	 * @generated
	 */
	int UNPARSER = 1;

	/**
	 * The feature id for the '<em><b>Code Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSER__CODE_ADAPTER = 0;

	/**
	 * The number of structural features of the '<em>Unparser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Unparse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSER___UNPARSE__NODE = 0;

	/**
	 * The operation id for the '<em>Can Unparse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSER___CAN_UNPARSE_FILE__STRING = 1;

	/**
	 * The number of operations of the '<em>Unparser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.unparser.impl.TemplateUnparserImpl <em>Template Unparser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.unparser.impl.TemplateUnparserImpl
	 * @see org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl#getTemplateUnparser()
	 * @generated
	 */
	int TEMPLATE_UNPARSER = 0;

	/**
	 * The feature id for the '<em><b>Code Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNPARSER__CODE_ADAPTER = UNPARSER__CODE_ADAPTER;

	/**
	 * The number of structural features of the '<em>Template Unparser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNPARSER_FEATURE_COUNT = UNPARSER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unparse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNPARSER___UNPARSE__NODE = UNPARSER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Unparse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNPARSER___CAN_UNPARSE_FILE__STRING = UNPARSER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Unparser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNPARSER_OPERATION_COUNT = UNPARSER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.unparser.impl.XMLUnparserImpl <em>XML Unparser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.unparser.impl.XMLUnparserImpl
	 * @see org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl#getXMLUnparser()
	 * @generated
	 */
	int XML_UNPARSER = 2;

	/**
	 * The feature id for the '<em><b>Code Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_UNPARSER__CODE_ADAPTER = TEMPLATE_UNPARSER__CODE_ADAPTER;

	/**
	 * The number of structural features of the '<em>XML Unparser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_UNPARSER_FEATURE_COUNT = TEMPLATE_UNPARSER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unparse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_UNPARSER___UNPARSE__NODE = TEMPLATE_UNPARSER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Unparse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_UNPARSER___CAN_UNPARSE_FILE__STRING = TEMPLATE_UNPARSER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>XML Unparser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_UNPARSER_OPERATION_COUNT = TEMPLATE_UNPARSER_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.unparser.TemplateUnparser <em>Template Unparser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Unparser</em>'.
	 * @see org.moflon.core.moca.processing.unparser.TemplateUnparser
	 * @generated
	 */
	EClass getTemplateUnparser();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.unparser.TemplateUnparser#unparse(MocaTree.Node) <em>Unparse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unparse</em>' operation.
	 * @see org.moflon.core.moca.processing.unparser.TemplateUnparser#unparse(MocaTree.Node)
	 * @generated
	 */
	EOperation getTemplateUnparser__Unparse__Node();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.unparser.TemplateUnparser#canUnparseFile(java.lang.String) <em>Can Unparse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Unparse File</em>' operation.
	 * @see org.moflon.core.moca.processing.unparser.TemplateUnparser#canUnparseFile(java.lang.String)
	 * @generated
	 */
	EOperation getTemplateUnparser__CanUnparseFile__String();

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.unparser.Unparser <em>Unparser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unparser</em>'.
	 * @see org.moflon.core.moca.processing.unparser.Unparser
	 * @generated
	 */
	EClass getUnparser();

	/**
	 * Returns the meta object for the container reference '{@link org.moflon.core.moca.processing.unparser.Unparser#getCodeAdapter <em>Code Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Code Adapter</em>'.
	 * @see org.moflon.core.moca.processing.unparser.Unparser#getCodeAdapter()
	 * @see #getUnparser()
	 * @generated
	 */
	EReference getUnparser_CodeAdapter();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.unparser.Unparser#unparse(MocaTree.Node) <em>Unparse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unparse</em>' operation.
	 * @see org.moflon.core.moca.processing.unparser.Unparser#unparse(MocaTree.Node)
	 * @generated
	 */
	EOperation getUnparser__Unparse__Node();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.unparser.Unparser#canUnparseFile(java.lang.String) <em>Can Unparse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Unparse File</em>' operation.
	 * @see org.moflon.core.moca.processing.unparser.Unparser#canUnparseFile(java.lang.String)
	 * @generated
	 */
	EOperation getUnparser__CanUnparseFile__String();

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.unparser.XMLUnparser <em>XML Unparser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Unparser</em>'.
	 * @see org.moflon.core.moca.processing.unparser.XMLUnparser
	 * @generated
	 */
	EClass getXMLUnparser();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.unparser.XMLUnparser#unparse(MocaTree.Node) <em>Unparse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unparse</em>' operation.
	 * @see org.moflon.core.moca.processing.unparser.XMLUnparser#unparse(MocaTree.Node)
	 * @generated
	 */
	EOperation getXMLUnparser__Unparse__Node();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.unparser.XMLUnparser#canUnparseFile(java.lang.String) <em>Can Unparse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Unparse File</em>' operation.
	 * @see org.moflon.core.moca.processing.unparser.XMLUnparser#canUnparseFile(java.lang.String)
	 * @generated
	 */
	EOperation getXMLUnparser__CanUnparseFile__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnparserFactory getUnparserFactory();

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
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.unparser.impl.TemplateUnparserImpl <em>Template Unparser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.unparser.impl.TemplateUnparserImpl
		 * @see org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl#getTemplateUnparser()
		 * @generated
		 */
		EClass TEMPLATE_UNPARSER = eINSTANCE.getTemplateUnparser();

		/**
		 * The meta object literal for the '<em><b>Unparse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_UNPARSER___UNPARSE__NODE = eINSTANCE.getTemplateUnparser__Unparse__Node();

		/**
		 * The meta object literal for the '<em><b>Can Unparse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_UNPARSER___CAN_UNPARSE_FILE__STRING = eINSTANCE
				.getTemplateUnparser__CanUnparseFile__String();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.unparser.impl.UnparserImpl <em>Unparser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.unparser.impl.UnparserImpl
		 * @see org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl#getUnparser()
		 * @generated
		 */
		EClass UNPARSER = eINSTANCE.getUnparser();

		/**
		 * The meta object literal for the '<em><b>Code Adapter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPARSER__CODE_ADAPTER = eINSTANCE.getUnparser_CodeAdapter();

		/**
		 * The meta object literal for the '<em><b>Unparse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNPARSER___UNPARSE__NODE = eINSTANCE.getUnparser__Unparse__Node();

		/**
		 * The meta object literal for the '<em><b>Can Unparse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNPARSER___CAN_UNPARSE_FILE__STRING = eINSTANCE.getUnparser__CanUnparseFile__String();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.unparser.impl.XMLUnparserImpl <em>XML Unparser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.unparser.impl.XMLUnparserImpl
		 * @see org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl#getXMLUnparser()
		 * @generated
		 */
		EClass XML_UNPARSER = eINSTANCE.getXMLUnparser();

		/**
		 * The meta object literal for the '<em><b>Unparse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_UNPARSER___UNPARSE__NODE = eINSTANCE.getXMLUnparser__Unparse__Node();

		/**
		 * The meta object literal for the '<em><b>Can Unparse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_UNPARSER___CAN_UNPARSE_FILE__STRING = eINSTANCE.getXMLUnparser__CanUnparseFile__String();

	}

} //UnparserPackage
