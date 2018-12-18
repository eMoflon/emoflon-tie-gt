/**
 */
package org.moflon.core.moca.processing.compare;

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
 * @see org.moflon.core.moca.processing.compare.CompareFactory
 * @model kind="package"
 * @generated
 */
public interface ComparePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compare";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.core.moca.processing/model/Processing.ecore#//compare";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compare";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComparePackage eINSTANCE = org.moflon.core.moca.processing.compare.impl.ComparePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.compare.impl.MocaDiffImpl <em>Moca Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.compare.impl.MocaDiffImpl
	 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getMocaDiff()
	 * @generated
	 */
	int MOCA_DIFF = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_DIFF__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Left Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_DIFF__LEFT_PARENT = 1;

	/**
	 * The number of structural features of the '<em>Moca Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_DIFF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Moca Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.compare.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.compare.impl.AdditionImpl
	 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ELEMENT = MOCA_DIFF__ELEMENT;

	/**
	 * The feature id for the '<em><b>Left Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LEFT_PARENT = MOCA_DIFF__LEFT_PARENT;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = MOCA_DIFF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = MOCA_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.compare.impl.DeletionImpl <em>Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.compare.impl.DeletionImpl
	 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getDeletion()
	 * @generated
	 */
	int DELETION = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__ELEMENT = MOCA_DIFF__ELEMENT;

	/**
	 * The feature id for the '<em><b>Left Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__LEFT_PARENT = MOCA_DIFF__LEFT_PARENT;

	/**
	 * The number of structural features of the '<em>Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FEATURE_COUNT = MOCA_DIFF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_OPERATION_COUNT = MOCA_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.core.moca.processing.compare.impl.MocaCompareImpl <em>Moca Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.core.moca.processing.compare.impl.MocaCompareImpl
	 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getMocaCompare()
	 * @generated
	 */
	int MOCA_COMPARE = 2;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE__ADDITION = 0;

	/**
	 * The feature id for the '<em><b>Deletion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE__DELETION = 1;

	/**
	 * The feature id for the '<em><b>Found Right Rlements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE__FOUND_RIGHT_RLEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Moca Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Cache Right Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___CACHE_RIGHT_FOLDER__FOLDER = 0;

	/**
	 * The operation id for the '<em>Collect Addition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___COLLECT_ADDITION__TREEELEMENT_TREEELEMENT = 1;

	/**
	 * The operation id for the '<em>Collect Deletion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___COLLECT_DELETION__TREEELEMENT_TREEELEMENT = 2;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___COMPARE__FOLDER_FOLDER = 3;

	/**
	 * The operation id for the '<em>Compare File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___COMPARE_FILE__FILE_FILE = 4;

	/**
	 * The operation id for the '<em>Compare Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___COMPARE_FOLDER__FOLDER_FOLDER = 5;

	/**
	 * The operation id for the '<em>Compare Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___COMPARE_NODE__NODE_NODE = 6;

	/**
	 * The operation id for the '<em>Get Tree Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE___GET_TREE_ELEMENT__TREEELEMENT_STRING_INT = 7;

	/**
	 * The number of operations of the '<em>Moca Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCA_COMPARE_OPERATION_COUNT = 8;

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.compare.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see org.moflon.core.moca.processing.compare.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.compare.Deletion <em>Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion</em>'.
	 * @see org.moflon.core.moca.processing.compare.Deletion
	 * @generated
	 */
	EClass getDeletion();

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.compare.MocaCompare <em>Moca Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moca Compare</em>'.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare
	 * @generated
	 */
	EClass getMocaCompare();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.core.moca.processing.compare.MocaCompare#getAddition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addition</em>'.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#getAddition()
	 * @see #getMocaCompare()
	 * @generated
	 */
	EReference getMocaCompare_Addition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.core.moca.processing.compare.MocaCompare#getDeletion <em>Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deletion</em>'.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#getDeletion()
	 * @see #getMocaCompare()
	 * @generated
	 */
	EReference getMocaCompare_Deletion();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.core.moca.processing.compare.MocaCompare#getFoundRightRlements <em>Found Right Rlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Found Right Rlements</em>'.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#getFoundRightRlements()
	 * @see #getMocaCompare()
	 * @generated
	 */
	EReference getMocaCompare_FoundRightRlements();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#cacheRightFolder(MocaTree.Folder) <em>Cache Right Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cache Right Folder</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#cacheRightFolder(MocaTree.Folder)
	 * @generated
	 */
	EOperation getMocaCompare__CacheRightFolder__Folder();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#collectAddition(MocaTree.TreeElement, MocaTree.TreeElement) <em>Collect Addition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Addition</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#collectAddition(MocaTree.TreeElement, MocaTree.TreeElement)
	 * @generated
	 */
	EOperation getMocaCompare__CollectAddition__TreeElement_TreeElement();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#collectDeletion(MocaTree.TreeElement, MocaTree.TreeElement) <em>Collect Deletion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Deletion</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#collectDeletion(MocaTree.TreeElement, MocaTree.TreeElement)
	 * @generated
	 */
	EOperation getMocaCompare__CollectDeletion__TreeElement_TreeElement();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#compare(MocaTree.Folder, MocaTree.Folder) <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#compare(MocaTree.Folder, MocaTree.Folder)
	 * @generated
	 */
	EOperation getMocaCompare__Compare__Folder_Folder();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#compareFile(MocaTree.File, MocaTree.File) <em>Compare File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare File</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#compareFile(MocaTree.File, MocaTree.File)
	 * @generated
	 */
	EOperation getMocaCompare__CompareFile__File_File();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#compareFolder(MocaTree.Folder, MocaTree.Folder) <em>Compare Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Folder</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#compareFolder(MocaTree.Folder, MocaTree.Folder)
	 * @generated
	 */
	EOperation getMocaCompare__CompareFolder__Folder_Folder();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#compareNode(MocaTree.Node, MocaTree.Node) <em>Compare Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Node</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#compareNode(MocaTree.Node, MocaTree.Node)
	 * @generated
	 */
	EOperation getMocaCompare__CompareNode__Node_Node();

	/**
	 * Returns the meta object for the '{@link org.moflon.core.moca.processing.compare.MocaCompare#getTreeElement(MocaTree.TreeElement, java.lang.String, int) <em>Get Tree Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tree Element</em>' operation.
	 * @see org.moflon.core.moca.processing.compare.MocaCompare#getTreeElement(MocaTree.TreeElement, java.lang.String, int)
	 * @generated
	 */
	EOperation getMocaCompare__GetTreeElement__TreeElement_String_int();

	/**
	 * Returns the meta object for class '{@link org.moflon.core.moca.processing.compare.MocaDiff <em>Moca Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moca Diff</em>'.
	 * @see org.moflon.core.moca.processing.compare.MocaDiff
	 * @generated
	 */
	EClass getMocaDiff();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.core.moca.processing.compare.MocaDiff#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.moflon.core.moca.processing.compare.MocaDiff#getElement()
	 * @see #getMocaDiff()
	 * @generated
	 */
	EReference getMocaDiff_Element();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.core.moca.processing.compare.MocaDiff#getLeftParent <em>Left Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Parent</em>'.
	 * @see org.moflon.core.moca.processing.compare.MocaDiff#getLeftParent()
	 * @see #getMocaDiff()
	 * @generated
	 */
	EReference getMocaDiff_LeftParent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompareFactory getCompareFactory();

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
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.compare.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.compare.impl.AdditionImpl
		 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.compare.impl.DeletionImpl <em>Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.compare.impl.DeletionImpl
		 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getDeletion()
		 * @generated
		 */
		EClass DELETION = eINSTANCE.getDeletion();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.compare.impl.MocaCompareImpl <em>Moca Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.compare.impl.MocaCompareImpl
		 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getMocaCompare()
		 * @generated
		 */
		EClass MOCA_COMPARE = eINSTANCE.getMocaCompare();

		/**
		 * The meta object literal for the '<em><b>Addition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOCA_COMPARE__ADDITION = eINSTANCE.getMocaCompare_Addition();

		/**
		 * The meta object literal for the '<em><b>Deletion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOCA_COMPARE__DELETION = eINSTANCE.getMocaCompare_Deletion();

		/**
		 * The meta object literal for the '<em><b>Found Right Rlements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOCA_COMPARE__FOUND_RIGHT_RLEMENTS = eINSTANCE.getMocaCompare_FoundRightRlements();

		/**
		 * The meta object literal for the '<em><b>Cache Right Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___CACHE_RIGHT_FOLDER__FOLDER = eINSTANCE.getMocaCompare__CacheRightFolder__Folder();

		/**
		 * The meta object literal for the '<em><b>Collect Addition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___COLLECT_ADDITION__TREEELEMENT_TREEELEMENT = eINSTANCE
				.getMocaCompare__CollectAddition__TreeElement_TreeElement();

		/**
		 * The meta object literal for the '<em><b>Collect Deletion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___COLLECT_DELETION__TREEELEMENT_TREEELEMENT = eINSTANCE
				.getMocaCompare__CollectDeletion__TreeElement_TreeElement();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___COMPARE__FOLDER_FOLDER = eINSTANCE.getMocaCompare__Compare__Folder_Folder();

		/**
		 * The meta object literal for the '<em><b>Compare File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___COMPARE_FILE__FILE_FILE = eINSTANCE.getMocaCompare__CompareFile__File_File();

		/**
		 * The meta object literal for the '<em><b>Compare Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___COMPARE_FOLDER__FOLDER_FOLDER = eINSTANCE
				.getMocaCompare__CompareFolder__Folder_Folder();

		/**
		 * The meta object literal for the '<em><b>Compare Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___COMPARE_NODE__NODE_NODE = eINSTANCE.getMocaCompare__CompareNode__Node_Node();

		/**
		 * The meta object literal for the '<em><b>Get Tree Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOCA_COMPARE___GET_TREE_ELEMENT__TREEELEMENT_STRING_INT = eINSTANCE
				.getMocaCompare__GetTreeElement__TreeElement_String_int();

		/**
		 * The meta object literal for the '{@link org.moflon.core.moca.processing.compare.impl.MocaDiffImpl <em>Moca Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.core.moca.processing.compare.impl.MocaDiffImpl
		 * @see org.moflon.core.moca.processing.compare.impl.ComparePackageImpl#getMocaDiff()
		 * @generated
		 */
		EClass MOCA_DIFF = eINSTANCE.getMocaDiff();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOCA_DIFF__ELEMENT = eINSTANCE.getMocaDiff_Element();

		/**
		 * The meta object literal for the '<em><b>Left Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOCA_DIFF__LEFT_PARENT = eINSTANCE.getMocaDiff_LeftParent();

	}

} //ComparePackage
