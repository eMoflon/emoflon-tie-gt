/**
 */
package org.moflon.core.moca.processing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.moflon.core.moca.processing.ProcessingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.core.moca'"
 * @generated
 */
public interface ProcessingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.core.moca.processing/model/Processing.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.core.moca.processing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessingPackage eINSTANCE = org.moflon.core.moca.processing.impl.ProcessingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.impl.CodeAdapterImpl <em>Code Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.impl.CodeAdapterImpl
	 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getCodeAdapter()
	 * @generated
	 */
	int CODE_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Unparser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER__UNPARSER = 0;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER__PROBLEMS = 1;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER__PARSER = 2;

	/**
	 * The number of structural features of the '<em>Code Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Parse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER___PARSE__FILE = 0;

	/**
	 * The operation id for the '<em>Unparse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER___UNPARSE__STRING_FOLDER = 1;

	/**
	 * The operation id for the '<em>Parse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER___PARSE_FILE__FILE_FOLDER = 2;

	/**
	 * The operation id for the '<em>Unparse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER___UNPARSE_FILE__FILE_FILE = 3;

	/**
	 * The number of operations of the '<em>Code Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ADAPTER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.impl.ProblemImpl
	 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Code Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__CODE_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Character Position End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__CHARACTER_POSITION_END = 1;

	/**
	 * The feature id for the '<em><b>Character Position Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__CHARACTER_POSITION_START = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__LINE = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.ProblemType <em>Problem Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.ProblemType
	 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getProblemType()
	 * @generated
	 */
	int PROBLEM_TYPE = 2;

	/**
	 * The meta object id for the '<em>Directory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 3;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 4;

	/**
	 * The meta object id for the '<em>Reader</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Reader
	 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getReader()
	 * @generated
	 */
	int READER = 5;

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.CodeAdapter <em>Code Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Adapter</em>'.
	 * @see org.moflon.core.moca.processing.CodeAdapter
	 * @generated
	 */
	EClass getCodeAdapter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.core.moca.processing.CodeAdapter#getUnparser <em>Unparser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unparser</em>'.
	 * @see org.moflon.core.moca.processing.CodeAdapter#getUnparser()
	 * @see #getCodeAdapter()
	 * @generated
	 */
	EReference getCodeAdapter_Unparser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.core.moca.processing.CodeAdapter#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see org.moflon.core.moca.processing.CodeAdapter#getProblems()
	 * @see #getCodeAdapter()
	 * @generated
	 */
	EReference getCodeAdapter_Problems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.core.moca.processing.CodeAdapter#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parser</em>'.
	 * @see org.moflon.core.moca.processing.CodeAdapter#getParser()
	 * @see #getCodeAdapter()
	 * @generated
	 */
	EReference getCodeAdapter_Parser();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.CodeAdapter#parse(java.io.File) <em>Parse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse</em>' operation.
	 * @see org.moflon.core.moca.processing.CodeAdapter#parse(java.io.File)
	 * @generated
	 */
	EOperation getCodeAdapter__Parse__File();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.CodeAdapter#unparse(java.lang.String, MocaTree.Folder) <em>Unparse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unparse</em>' operation.
	 * @see org.moflon.core.moca.processing.CodeAdapter#unparse(java.lang.String, MocaTree.Folder)
	 * @generated
	 */
	EOperation getCodeAdapter__Unparse__String_Folder();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.CodeAdapter#parseFile(java.io.File, MocaTree.Folder) <em>Parse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse File</em>' operation.
	 * @see org.moflon.core.moca.processing.CodeAdapter#parseFile(java.io.File, MocaTree.Folder)
	 * @generated
	 */
	EOperation getCodeAdapter__ParseFile__File_Folder();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.CodeAdapter#unparseFile(MocaTree.File, java.io.File) <em>Unparse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unparse File</em>' operation.
	 * @see org.moflon.core.moca.processing.CodeAdapter#unparseFile(MocaTree.File, java.io.File)
	 * @generated
	 */
	EOperation getCodeAdapter__UnparseFile__File_File();

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see org.moflon.core.moca.processing.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the container reference '{@link org.moflon.core.moca.processing.Problem#getCodeAdapter <em>Code Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Code Adapter</em>'.
	 * @see org.moflon.core.moca.processing.Problem#getCodeAdapter()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_CodeAdapter();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.core.moca.processing.Problem#getCharacterPositionEnd <em>Character Position End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Position End</em>'.
	 * @see org.moflon.core.moca.processing.Problem#getCharacterPositionEnd()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_CharacterPositionEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.core.moca.processing.Problem#getCharacterPositionStart <em>Character Position Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Position Start</em>'.
	 * @see org.moflon.core.moca.processing.Problem#getCharacterPositionStart()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_CharacterPositionStart();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.core.moca.processing.Problem#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.moflon.core.moca.processing.Problem#getLine()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.core.moca.processing.Problem#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.moflon.core.moca.processing.Problem#getMessage()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.core.moca.processing.Problem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.moflon.core.moca.processing.Problem#getSource()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.core.moca.processing.Problem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.moflon.core.moca.processing.Problem#getType()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Type();

	/**
	 * Returns the meta object for enum '{@link org.moflon.core.moca.processing.ProblemType <em>Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Problem Type</em>'.
	 * @see org.moflon.core.moca.processing.ProblemType
	 * @generated
	 */
	EEnum getProblemType();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Directory</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getDirectory();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the meta object for data type '{@link java.io.Reader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reader</em>'.
	 * @see java.io.Reader
	 * @model instanceClass="java.io.Reader"
	 * @generated
	 */
	EDataType getReader();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessingFactory getProcessingFactory();

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
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.impl.CodeAdapterImpl <em>Code Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.impl.CodeAdapterImpl
		 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getCodeAdapter()
		 * @generated
		 */
		EClass CODE_ADAPTER = eINSTANCE.getCodeAdapter();

		/**
		 * The meta object literal for the '<em><b>Unparser</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ADAPTER__UNPARSER = eINSTANCE.getCodeAdapter_Unparser();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ADAPTER__PROBLEMS = eINSTANCE.getCodeAdapter_Problems();

		/**
		 * The meta object literal for the '<em><b>Parser</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ADAPTER__PARSER = eINSTANCE.getCodeAdapter_Parser();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_ADAPTER___PARSE__FILE = eINSTANCE.getCodeAdapter__Parse__File();

		/**
		 * The meta object literal for the '<em><b>Unparse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_ADAPTER___UNPARSE__STRING_FOLDER = eINSTANCE.getCodeAdapter__Unparse__String_Folder();

		/**
		 * The meta object literal for the '<em><b>Parse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_ADAPTER___PARSE_FILE__FILE_FOLDER = eINSTANCE.getCodeAdapter__ParseFile__File_Folder();

		/**
		 * The meta object literal for the '<em><b>Unparse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_ADAPTER___UNPARSE_FILE__FILE_FILE = eINSTANCE.getCodeAdapter__UnparseFile__File_File();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.impl.ProblemImpl
		 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Code Adapter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__CODE_ADAPTER = eINSTANCE.getProblem_CodeAdapter();

		/**
		 * The meta object literal for the '<em><b>Character Position End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__CHARACTER_POSITION_END = eINSTANCE.getProblem_CharacterPositionEnd();

		/**
		 * The meta object literal for the '<em><b>Character Position Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__CHARACTER_POSITION_START = eINSTANCE.getProblem_CharacterPositionStart();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__LINE = eINSTANCE.getProblem_Line();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__MESSAGE = eINSTANCE.getProblem_Message();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__SOURCE = eINSTANCE.getProblem_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__TYPE = eINSTANCE.getProblem_Type();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.ProblemType <em>Problem Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.ProblemType
		 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getProblemType()
		 * @generated
		 */
		EEnum PROBLEM_TYPE = eINSTANCE.getProblemType();

		/**
		 * The meta object literal for the '<em>Directory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getDirectory()
		 * @generated
		 */
		EDataType DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>Reader</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Reader
		 * @see org.moflon.core.moca.processing.impl.ProcessingPackageImpl#getReader()
		 * @generated
		 */
		EDataType READER = eINSTANCE.getReader();

	}

} //ProcessingPackage
