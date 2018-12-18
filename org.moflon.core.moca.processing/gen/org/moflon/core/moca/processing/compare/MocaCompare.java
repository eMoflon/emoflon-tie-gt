/**
 */
package org.moflon.core.moca.processing.compare;

import MocaTree.File;
import MocaTree.Folder;
import MocaTree.Node;
import MocaTree.TreeElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moca Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.compare.MocaCompare#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.compare.MocaCompare#getDeletion <em>Deletion</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.compare.MocaCompare#getFoundRightRlements <em>Found Right Rlements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.moca.processing.compare.ComparePackage#getMocaCompare()
 * @model
 * @generated
 */
public interface MocaCompare extends EObject {
	/**
	 * Returns the value of the '<em><b>Addition</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.core.moca.processing.compare.Addition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition</em>' containment reference list.
	 * @see org.moflon.core.moca.processing.compare.ComparePackage#getMocaCompare_Addition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Addition> getAddition();

	/**
	 * Returns the value of the '<em><b>Deletion</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.core.moca.processing.compare.Deletion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion</em>' containment reference list.
	 * @see org.moflon.core.moca.processing.compare.ComparePackage#getMocaCompare_Deletion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deletion> getDeletion();

	/**
	 * Returns the value of the '<em><b>Found Right Rlements</b></em>' reference list.
	 * The list contents are of type {@link MocaTree.TreeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Found Right Rlements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Found Right Rlements</em>' reference list.
	 * @see org.moflon.core.moca.processing.compare.ComparePackage#getMocaCompare_FoundRightRlements()
	 * @model
	 * @generated
	 */
	EList<TreeElement> getFoundRightRlements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cacheRightFolder(Folder right);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void collectAddition(TreeElement element, TreeElement leftParent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void collectDeletion(TreeElement element, TreeElement leftParent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compare(Folder left, Folder right);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compareFile(File left, File right);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compareFolder(Folder left, Folder right);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compareNode(Node left, Node right);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TreeElement getTreeElement(TreeElement parent, String name, int index);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MocaCompare
