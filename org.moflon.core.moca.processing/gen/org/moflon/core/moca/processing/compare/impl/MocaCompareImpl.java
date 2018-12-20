/**
 */
package org.moflon.core.moca.processing.compare.impl;

import MocaTree.File;
import MocaTree.Folder;
import MocaTree.MocaTreeFactory;
import MocaTree.Node;
import MocaTree.Text;
import MocaTree.TreeElement;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.core.moca.processing.compare.Addition;
import org.moflon.core.moca.processing.compare.CompareFactory;
import org.moflon.core.moca.processing.compare.ComparePackage;
import org.moflon.core.moca.processing.compare.Deletion;
import org.moflon.core.moca.processing.compare.MocaCompare;
// <-- [user defined imports]
import org.eclipse.emf.ecore.EObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moca Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.compare.impl.MocaCompareImpl#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.compare.impl.MocaCompareImpl#getDeletion <em>Deletion</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.compare.impl.MocaCompareImpl#getFoundRightRlements <em>Found Right Rlements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MocaCompareImpl extends EObjectImpl implements MocaCompare {
	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected EList<Addition> addition;

	/**
	 * The cached value of the '{@link #getDeletion() <em>Deletion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletion()
	 * @generated
	 * @ordered
	 */
	protected EList<Deletion> deletion;

	/**
	 * The cached value of the '{@link #getFoundRightRlements() <em>Found Right Rlements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundRightRlements()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeElement> foundRightRlements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MocaCompareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparePackage.Literals.MOCA_COMPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Addition> getAddition() {
		if (addition == null) {
			addition = new EObjectContainmentEList<Addition>(Addition.class, this,
					ComparePackage.MOCA_COMPARE__ADDITION);
		}
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deletion> getDeletion() {
		if (deletion == null) {
			deletion = new EObjectContainmentEList<Deletion>(Deletion.class, this,
					ComparePackage.MOCA_COMPARE__DELETION);
		}
		return deletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreeElement> getFoundRightRlements() {
		if (foundRightRlements == null) {
			foundRightRlements = new EObjectResolvingEList<TreeElement>(TreeElement.class, this,
					ComparePackage.MOCA_COMPARE__FOUND_RIGHT_RLEMENTS);
		}
		return foundRightRlements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cacheRightFolder(Folder right) {
		// [user code injected with eMoflon]

		Iterator<EObject> it = right.eAllContents();
		while (it.hasNext()) {
			TreeElement element = (TreeElement) it.next();
			String computedId = computeId(element.getName(), element.getIndex());
			HashSet<TreeElement> setOfElementsWithId = null;
			if (cachedTreeElements.containsKey(computedId))
				setOfElementsWithId = cachedTreeElements.get(computedId);
			else {
				setOfElementsWithId = new HashSet<TreeElement>();
				cachedTreeElements.put(computedId, setOfElementsWithId);
			}
			setOfElementsWithId.add(element);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void collectAddition(TreeElement element, TreeElement leftParent) {

		Object[] result1_black = MocaCompareImpl.pattern_MocaCompare_1_1_collectaddition_blackBBB(element, leftParent,
				this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[element] = " + element + ", "
					+ "[leftParent] = " + leftParent + ", " + "[this] = " + this + ".");
		}
		MocaCompareImpl.pattern_MocaCompare_1_1_collectaddition_greenFBBB(element, leftParent, this);
		//nothing Addition addition = (Addition) result1_green[0];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void collectDeletion(TreeElement element, TreeElement leftParent) {

		Object[] result1_black = MocaCompareImpl.pattern_MocaCompare_2_1_collectdeletion_blackBBB(element, leftParent,
				this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[element] = " + element + ", "
					+ "[leftParent] = " + leftParent + ", " + "[this] = " + this + ".");
		}
		MocaCompareImpl.pattern_MocaCompare_2_1_collectdeletion_greenFBBB(element, leftParent, this);
		//nothing Deletion deletion = (Deletion) result1_green[0];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compare(Folder left, Folder right) {

		Object[] result1_black = MocaCompareImpl.pattern_MocaCompare_3_1_matchthis_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		// 
		MocaCompareImpl.pattern_MocaCompare_3_2_cacheright_expressionBB(this, right);
		// 
		MocaCompareImpl.pattern_MocaCompare_3_3_compareleftandright_expressionBBB(this, left, right);
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compareFile(File left, File right) {

		Object[] result1_black = MocaCompareImpl.pattern_MocaCompare_4_1_matchrootnode_blackBFB(left, this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[left] = " + left + ", " + "[this] = " + this + ".");
		}
		Node leftRoot = (Node) result1_black[1];
		// 
		Object[] result2_bindingAndBlack = MocaCompareImpl
				.pattern_MocaCompare_4_2_comparetorightrootnode_bindingAndBlackBFBB(right, this, leftRoot);
		if (result2_bindingAndBlack != null) {
			Node rightRoot = (Node) result2_bindingAndBlack[1];
			MocaCompareImpl.pattern_MocaCompare_4_2_comparetorightrootnode_greenBB(rightRoot, this);

			// 
			MocaCompareImpl.pattern_MocaCompare_4_3_CompareRootNodes_expressionBBB(this, leftRoot, rightRoot);
			return;
		} else {
			// 
			MocaCompareImpl.pattern_MocaCompare_4_5_collectdeletion_expressionBBB(this, leftRoot, left);

			Object[] result6_green = MocaCompareImpl.pattern_MocaCompare_4_6_CreateDummyRightTreeNode_greenFB(leftRoot);
			if (result6_green == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[leftRoot] = " + leftRoot + ".");
			}
			Node rightDummyRoot = (Node) result6_green[0];
			// 
			MocaCompareImpl.pattern_MocaCompare_4_7_collectaddition_expressionBBB(this, rightDummyRoot, left);
			return;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compareFolder(Folder left, Folder right) {// ForEach 
		for (Object[] result1_black : MocaCompareImpl.pattern_MocaCompare_5_1_iterateoversubfolders_blackBF(left)) {
			Folder subLeft = (Folder) result1_black[1];
			// 
			Object[] result2_bindingAndBlack = MocaCompareImpl
					.pattern_MocaCompare_5_2_findacorrespondingfolderonright_bindingAndBlackBFBB(right, this, subLeft);
			if (result2_bindingAndBlack != null) {
				Folder subRight = (Folder) result2_bindingAndBlack[1];
				MocaCompareImpl.pattern_MocaCompare_5_2_findacorrespondingfolderonright_greenBB(subRight, this);

				// 
				MocaCompareImpl.pattern_MocaCompare_5_3_recursivecallforsubfolders_expressionBBB(this, subLeft,
						subRight);

			} else {
				// 
				MocaCompareImpl.pattern_MocaCompare_5_4_collectdeletion_expressionBBB(this, subLeft, left);

			}

		}
		// ForEach 
		for (Object[] result5_black : MocaCompareImpl.pattern_MocaCompare_5_5_iterateoverfiles_blackBF(left)) {
			File leftFile = (File) result5_black[1];
			// 
			Object[] result6_bindingAndBlack = MocaCompareImpl
					.pattern_MocaCompare_5_6_findacorrespondingfileonright_bindingAndBlackBBFB(leftFile, right, this);
			if (result6_bindingAndBlack != null) {
				File rightFile = (File) result6_bindingAndBlack[2];
				MocaCompareImpl.pattern_MocaCompare_5_6_findacorrespondingfileonright_greenBB(rightFile, this);

				// 
				MocaCompareImpl.pattern_MocaCompare_5_7_callforfile_expressionBBB(this, leftFile, rightFile);

			} else {
				// 
				MocaCompareImpl.pattern_MocaCompare_5_8_collectdeletion_expressionBBB(this, leftFile, left);

			}

		}
		// ForEach 
		for (Object[] result9_black : MocaCompareImpl.pattern_MocaCompare_5_9_collectaddedsubfodlers_blackFBB(right,
				this)) {
			Folder addedSub = (Folder) result9_black[0];
			// 
			MocaCompareImpl.pattern_MocaCompare_5_10_collectaddition_expressionBBB(this, addedSub, left);

		}
		// ForEach 
		for (Object[] result11_black : MocaCompareImpl.pattern_MocaCompare_5_11_collectaddedfile_blackFBB(right,
				this)) {
			File addedFile = (File) result11_black[0];
			// 
			MocaCompareImpl.pattern_MocaCompare_5_12_collectaddition_expressionBBB(this, addedFile, left);

		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compareNode(Node left, Node right) {// ForEach 
		for (Object[] result1_black : MocaCompareImpl.pattern_MocaCompare_6_1_iterateoverchildren_blackBF(left)) {
			Node leftChild = (Node) result1_black[1];
			// 
			Object[] result2_bindingAndBlack = MocaCompareImpl
					.pattern_MocaCompare_6_2_findacorrespondingchildontheright_bindingAndBlackBFBB(right, this,
							leftChild);
			if (result2_bindingAndBlack != null) {
				Node rightChild = (Node) result2_bindingAndBlack[1];
				MocaCompareImpl.pattern_MocaCompare_6_2_findacorrespondingchildontheright_greenBB(rightChild, this);

				// 
				MocaCompareImpl.pattern_MocaCompare_6_3_comparechildrenrecursively_expressionBBB(this, leftChild,
						rightChild);

			} else {
				// 
				MocaCompareImpl.pattern_MocaCompare_6_4_collectdeletion_expressionBBB(this, leftChild, left);

			}

		}
		// ForEach 
		for (Object[] result5_black : MocaCompareImpl.pattern_MocaCompare_6_5_iterateoveraddedchildren_blackFBB(right,
				this)) {
			Node addedChild = (Node) result5_black[0];
			// 
			MocaCompareImpl.pattern_MocaCompare_6_6_collectaddition_expressionBBB(this, addedChild, left);

		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeElement getTreeElement(TreeElement parent, String name, int index) {
		// [user code injected with eMoflon]

		if (null == parent)
			return null;

		String computedId = computeId(name, index);
		if (cachedTreeElements.containsKey(computedId)) {
			Collection<TreeElement> elementsWithId = cachedTreeElements.get(computedId);
			for (TreeElement temp : elementsWithId) {
				if (temp.eContainer() == parent)
					return temp;
			}
		}
		return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComparePackage.MOCA_COMPARE__ADDITION:
			return ((InternalEList<?>) getAddition()).basicRemove(otherEnd, msgs);
		case ComparePackage.MOCA_COMPARE__DELETION:
			return ((InternalEList<?>) getDeletion()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComparePackage.MOCA_COMPARE__ADDITION:
			return getAddition();
		case ComparePackage.MOCA_COMPARE__DELETION:
			return getDeletion();
		case ComparePackage.MOCA_COMPARE__FOUND_RIGHT_RLEMENTS:
			return getFoundRightRlements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComparePackage.MOCA_COMPARE__ADDITION:
			getAddition().clear();
			getAddition().addAll((Collection<? extends Addition>) newValue);
			return;
		case ComparePackage.MOCA_COMPARE__DELETION:
			getDeletion().clear();
			getDeletion().addAll((Collection<? extends Deletion>) newValue);
			return;
		case ComparePackage.MOCA_COMPARE__FOUND_RIGHT_RLEMENTS:
			getFoundRightRlements().clear();
			getFoundRightRlements().addAll((Collection<? extends TreeElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComparePackage.MOCA_COMPARE__ADDITION:
			getAddition().clear();
			return;
		case ComparePackage.MOCA_COMPARE__DELETION:
			getDeletion().clear();
			return;
		case ComparePackage.MOCA_COMPARE__FOUND_RIGHT_RLEMENTS:
			getFoundRightRlements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComparePackage.MOCA_COMPARE__ADDITION:
			return addition != null && !addition.isEmpty();
		case ComparePackage.MOCA_COMPARE__DELETION:
			return deletion != null && !deletion.isEmpty();
		case ComparePackage.MOCA_COMPARE__FOUND_RIGHT_RLEMENTS:
			return foundRightRlements != null && !foundRightRlements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ComparePackage.MOCA_COMPARE___CACHE_RIGHT_FOLDER__FOLDER:
			cacheRightFolder((Folder) arguments.get(0));
			return null;
		case ComparePackage.MOCA_COMPARE___COLLECT_ADDITION__TREEELEMENT_TREEELEMENT:
			collectAddition((TreeElement) arguments.get(0), (TreeElement) arguments.get(1));
			return null;
		case ComparePackage.MOCA_COMPARE___COLLECT_DELETION__TREEELEMENT_TREEELEMENT:
			collectDeletion((TreeElement) arguments.get(0), (TreeElement) arguments.get(1));
			return null;
		case ComparePackage.MOCA_COMPARE___COMPARE__FOLDER_FOLDER:
			compare((Folder) arguments.get(0), (Folder) arguments.get(1));
			return null;
		case ComparePackage.MOCA_COMPARE___COMPARE_FILE__FILE_FILE:
			compareFile((File) arguments.get(0), (File) arguments.get(1));
			return null;
		case ComparePackage.MOCA_COMPARE___COMPARE_FOLDER__FOLDER_FOLDER:
			compareFolder((Folder) arguments.get(0), (Folder) arguments.get(1));
			return null;
		case ComparePackage.MOCA_COMPARE___COMPARE_NODE__NODE_NODE:
			compareNode((Node) arguments.get(0), (Node) arguments.get(1));
			return null;
		case ComparePackage.MOCA_COMPARE___GET_TREE_ELEMENT__TREEELEMENT_STRING_INT:
			return getTreeElement((TreeElement) arguments.get(0), (String) arguments.get(1),
					(Integer) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MocaCompare_1_1_collectaddition_blackBBB(TreeElement element,
			TreeElement leftParent, MocaCompare _this) {
		if (!element.equals(leftParent)) {
			return new Object[] { element, leftParent, _this };
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_1_1_collectaddition_greenFBBB(TreeElement element,
			TreeElement leftParent, MocaCompare _this) {
		Addition addition = CompareFactory.eINSTANCE.createAddition();
		addition.setElement(element);
		addition.setLeftParent(leftParent);
		_this.getAddition().add(addition);
		return new Object[] { addition, element, leftParent, _this };
	}

	public static final Object[] pattern_MocaCompare_2_1_collectdeletion_blackBBB(TreeElement element,
			TreeElement leftParent, MocaCompare _this) {
		if (!element.equals(leftParent)) {
			return new Object[] { element, leftParent, _this };
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_2_1_collectdeletion_greenFBBB(TreeElement element,
			TreeElement leftParent, MocaCompare _this) {
		Deletion deletion = CompareFactory.eINSTANCE.createDeletion();
		deletion.setLeftParent(leftParent);
		deletion.setElement(element);
		_this.getDeletion().add(deletion);
		return new Object[] { deletion, element, leftParent, _this };
	}

	public static final Object[] pattern_MocaCompare_3_1_matchthis_blackB(MocaCompare _this) {
		return new Object[] { _this };
	}

	public static final void pattern_MocaCompare_3_2_cacheright_expressionBB(MocaCompare _this, Folder right) {
		_this.cacheRightFolder(right);

	}

	public static final void pattern_MocaCompare_3_3_compareleftandright_expressionBBB(MocaCompare _this, Folder left,
			Folder right) {
		_this.compareFolder(left, right);

	}

	public static final Object[] pattern_MocaCompare_4_1_matchrootnode_blackBFB(File left, MocaCompare _this) {
		Node leftRoot = left.getRootNode();
		if (leftRoot != null) {
			return new Object[] { left, leftRoot, _this };
		}

		return null;
	}

	public static final Object[] pattern_MocaCompare_4_2_comparetorightrootnode_bindingFBBB(MocaCompare _this,
			File right, Node leftRoot) {
		String leftRoot_name = leftRoot.getName();
		int leftRoot_index = leftRoot.getIndex();
		TreeElement _localVariable_0 = _this.getTreeElement(right, leftRoot_name, Integer.valueOf(leftRoot_index));
		TreeElement tmpRightRoot = _localVariable_0;
		if (tmpRightRoot instanceof Node) {
			Node rightRoot = (Node) tmpRightRoot;
			return new Object[] { rightRoot, _this, right, leftRoot };
		}

		return null;
	}

	public static final Object[] pattern_MocaCompare_4_2_comparetorightrootnode_blackBBB(File right, Node rightRoot,
			MocaCompare _this) {
		if (right.equals(rightRoot.getFile())) {
			return new Object[] { right, rightRoot, _this };
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_4_2_comparetorightrootnode_bindingAndBlackBFBB(File right,
			MocaCompare _this, Node leftRoot) {
		Object[] result_pattern_MocaCompare_4_2_comparetorightrootnode_binding = pattern_MocaCompare_4_2_comparetorightrootnode_bindingFBBB(
				_this, right, leftRoot);
		if (result_pattern_MocaCompare_4_2_comparetorightrootnode_binding != null) {
			Node rightRoot = (Node) result_pattern_MocaCompare_4_2_comparetorightrootnode_binding[0];

			Object[] result_pattern_MocaCompare_4_2_comparetorightrootnode_black = pattern_MocaCompare_4_2_comparetorightrootnode_blackBBB(
					right, rightRoot, _this);
			if (result_pattern_MocaCompare_4_2_comparetorightrootnode_black != null) {

				return new Object[] { right, rightRoot, _this, leftRoot };
			}
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_4_2_comparetorightrootnode_greenBB(Node rightRoot,
			MocaCompare _this) {
		_this.getFoundRightRlements().add(rightRoot);
		return new Object[] { rightRoot, _this };
	}

	public static final void pattern_MocaCompare_4_3_CompareRootNodes_expressionBBB(MocaCompare _this, Node leftRoot,
			Node rightRoot) {
		_this.compareNode(leftRoot, rightRoot);

	}

	public static final void pattern_MocaCompare_4_5_collectdeletion_expressionBBB(MocaCompare _this, Node leftRoot,
			File left) {
		_this.collectDeletion(leftRoot, left);

	}

	public static final Object[] pattern_MocaCompare_4_6_CreateDummyRightTreeNode_greenFB(Node leftRoot) {
		Node rightDummyRoot = MocaTreeFactory.eINSTANCE.createNode();
		String leftRoot_name = leftRoot.getName();
		String rightDummyRoot_name_prime = leftRoot_name;
		rightDummyRoot.setName(rightDummyRoot_name_prime);
		int leftRoot_index = leftRoot.getIndex();
		int rightDummyRoot_index_prime = Integer.valueOf(leftRoot_index);
		rightDummyRoot.setIndex(Integer.valueOf(rightDummyRoot_index_prime));
		return new Object[] { rightDummyRoot, leftRoot };

	}

	public static final void pattern_MocaCompare_4_7_collectaddition_expressionBBB(MocaCompare _this,
			Node rightDummyRoot, File left) {
		_this.collectAddition(rightDummyRoot, left);

	}

	public static final Iterable<Object[]> pattern_MocaCompare_5_1_iterateoversubfolders_blackBF(Folder left) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Folder subLeft : left.getSubFolder()) {
			if (!left.equals(subLeft)) {
				_result.add(new Object[] { left, subLeft });
			}
		}
		return _result;
	}

	public static final Object[] pattern_MocaCompare_5_2_findacorrespondingfolderonright_bindingFBBB(MocaCompare _this,
			Folder right, Folder subLeft) {
		String subLeft_name = subLeft.getName();
		int subLeft_index = subLeft.getIndex();
		TreeElement _localVariable_0 = _this.getTreeElement(right, subLeft_name, Integer.valueOf(subLeft_index));
		TreeElement tmpSubRight = _localVariable_0;
		if (tmpSubRight instanceof Folder) {
			Folder subRight = (Folder) tmpSubRight;
			return new Object[] { subRight, _this, right, subLeft };
		}

		return null;
	}

	public static final Object[] pattern_MocaCompare_5_2_findacorrespondingfolderonright_blackBBB(Folder right,
			Folder subRight, MocaCompare _this) {
		if (!right.equals(subRight)) {
			if (right.getSubFolder().contains(subRight)) {
				return new Object[] { right, subRight, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_5_2_findacorrespondingfolderonright_bindingAndBlackBFBB(
			Folder right, MocaCompare _this, Folder subLeft) {
		Object[] result_pattern_MocaCompare_5_2_findacorrespondingfolderonright_binding = pattern_MocaCompare_5_2_findacorrespondingfolderonright_bindingFBBB(
				_this, right, subLeft);
		if (result_pattern_MocaCompare_5_2_findacorrespondingfolderonright_binding != null) {
			Folder subRight = (Folder) result_pattern_MocaCompare_5_2_findacorrespondingfolderonright_binding[0];

			Object[] result_pattern_MocaCompare_5_2_findacorrespondingfolderonright_black = pattern_MocaCompare_5_2_findacorrespondingfolderonright_blackBBB(
					right, subRight, _this);
			if (result_pattern_MocaCompare_5_2_findacorrespondingfolderonright_black != null) {

				return new Object[] { right, subRight, _this, subLeft };
			}
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_5_2_findacorrespondingfolderonright_greenBB(Folder subRight,
			MocaCompare _this) {
		_this.getFoundRightRlements().add(subRight);
		return new Object[] { subRight, _this };
	}

	public static final void pattern_MocaCompare_5_3_recursivecallforsubfolders_expressionBBB(MocaCompare _this,
			Folder subLeft, Folder subRight) {
		_this.compareFolder(subLeft, subRight);

	}

	public static final void pattern_MocaCompare_5_4_collectdeletion_expressionBBB(MocaCompare _this, Folder subLeft,
			Folder left) {
		_this.collectDeletion(subLeft, left);

	}

	public static final Iterable<Object[]> pattern_MocaCompare_5_5_iterateoverfiles_blackBF(Folder left) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (File leftFile : left.getFile()) {
			_result.add(new Object[] { left, leftFile });
		}
		return _result;
	}

	public static final Object[] pattern_MocaCompare_5_6_findacorrespondingfileonright_bindingFBBB(MocaCompare _this,
			Folder right, File leftFile) {
		String leftFile_name = leftFile.getName();
		int leftFile_index = leftFile.getIndex();
		TreeElement _localVariable_0 = _this.getTreeElement(right, leftFile_name, Integer.valueOf(leftFile_index));
		TreeElement tmpRightFile = _localVariable_0;
		if (tmpRightFile instanceof File) {
			File rightFile = (File) tmpRightFile;
			return new Object[] { rightFile, _this, right, leftFile };
		}

		return null;
	}

	public static final Object[] pattern_MocaCompare_5_6_findacorrespondingfileonright_blackBBBB(File leftFile,
			Folder right, File rightFile, MocaCompare _this) {
		if (!leftFile.equals(rightFile)) {
			if (right.getFile().contains(rightFile)) {
				return new Object[] { leftFile, right, rightFile, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_5_6_findacorrespondingfileonright_bindingAndBlackBBFB(
			File leftFile, Folder right, MocaCompare _this) {
		Object[] result_pattern_MocaCompare_5_6_findacorrespondingfileonright_binding = pattern_MocaCompare_5_6_findacorrespondingfileonright_bindingFBBB(
				_this, right, leftFile);
		if (result_pattern_MocaCompare_5_6_findacorrespondingfileonright_binding != null) {
			File rightFile = (File) result_pattern_MocaCompare_5_6_findacorrespondingfileonright_binding[0];

			Object[] result_pattern_MocaCompare_5_6_findacorrespondingfileonright_black = pattern_MocaCompare_5_6_findacorrespondingfileonright_blackBBBB(
					leftFile, right, rightFile, _this);
			if (result_pattern_MocaCompare_5_6_findacorrespondingfileonright_black != null) {

				return new Object[] { leftFile, right, rightFile, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_5_6_findacorrespondingfileonright_greenBB(File rightFile,
			MocaCompare _this) {
		_this.getFoundRightRlements().add(rightFile);
		return new Object[] { rightFile, _this };
	}

	public static final void pattern_MocaCompare_5_7_callforfile_expressionBBB(MocaCompare _this, File leftFile,
			File rightFile) {
		_this.compareFile(leftFile, rightFile);

	}

	public static final void pattern_MocaCompare_5_8_collectdeletion_expressionBBB(MocaCompare _this, File leftFile,
			Folder left) {
		_this.collectDeletion(leftFile, left);

	}

	public static final Object[] pattern_MocaCompare_5_9_collectaddedsubfodlers_black_nac_0BB(MocaCompare _this,
			Folder addedSub) {
		if (_this.getFoundRightRlements().contains(addedSub)) {
			return new Object[] { _this, addedSub };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MocaCompare_5_9_collectaddedsubfodlers_blackFBB(Folder right,
			MocaCompare _this) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Folder addedSub : right.getSubFolder()) {
			if (!addedSub.equals(right)) {
				if (pattern_MocaCompare_5_9_collectaddedsubfodlers_black_nac_0BB(_this, addedSub) == null) {
					_result.add(new Object[] { addedSub, right, _this });
				}
			}
		}
		return _result;
	}

	public static final void pattern_MocaCompare_5_10_collectaddition_expressionBBB(MocaCompare _this, Folder addedSub,
			Folder left) {
		_this.collectAddition(addedSub, left);

	}

	public static final Object[] pattern_MocaCompare_5_11_collectaddedfile_black_nac_0BB(MocaCompare _this,
			File addedFile) {
		if (_this.getFoundRightRlements().contains(addedFile)) {
			return new Object[] { _this, addedFile };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MocaCompare_5_11_collectaddedfile_blackFBB(Folder right,
			MocaCompare _this) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (File addedFile : right.getFile()) {
			if (pattern_MocaCompare_5_11_collectaddedfile_black_nac_0BB(_this, addedFile) == null) {
				_result.add(new Object[] { addedFile, right, _this });
			}
		}
		return _result;
	}

	public static final void pattern_MocaCompare_5_12_collectaddition_expressionBBB(MocaCompare _this, File addedFile,
			Folder left) {
		_this.collectAddition(addedFile, left);

	}

	public static final Iterable<Object[]> pattern_MocaCompare_6_1_iterateoverchildren_blackBF(Node left) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Text tmpLeftChild : left.getChildren()) {
			if (tmpLeftChild instanceof Node) {
				Node leftChild = (Node) tmpLeftChild;
				if (!left.equals(leftChild)) {
					_result.add(new Object[] { left, leftChild });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MocaCompare_6_2_findacorrespondingchildontheright_bindingFBBB(
			MocaCompare _this, Node right, Node leftChild) {
		String leftChild_name = leftChild.getName();
		int leftChild_index = leftChild.getIndex();
		TreeElement _localVariable_0 = _this.getTreeElement(right, leftChild_name, Integer.valueOf(leftChild_index));
		TreeElement tmpRightChild = _localVariable_0;
		if (tmpRightChild instanceof Node) {
			Node rightChild = (Node) tmpRightChild;
			return new Object[] { rightChild, _this, right, leftChild };
		}

		return null;
	}

	public static final Object[] pattern_MocaCompare_6_2_findacorrespondingchildontheright_blackBBB(Node right,
			Node rightChild, MocaCompare _this) {
		if (!right.equals(rightChild)) {
			if (right.equals(rightChild.getParentNode())) {
				return new Object[] { right, rightChild, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_6_2_findacorrespondingchildontheright_bindingAndBlackBFBB(
			Node right, MocaCompare _this, Node leftChild) {
		Object[] result_pattern_MocaCompare_6_2_findacorrespondingchildontheright_binding = pattern_MocaCompare_6_2_findacorrespondingchildontheright_bindingFBBB(
				_this, right, leftChild);
		if (result_pattern_MocaCompare_6_2_findacorrespondingchildontheright_binding != null) {
			Node rightChild = (Node) result_pattern_MocaCompare_6_2_findacorrespondingchildontheright_binding[0];

			Object[] result_pattern_MocaCompare_6_2_findacorrespondingchildontheright_black = pattern_MocaCompare_6_2_findacorrespondingchildontheright_blackBBB(
					right, rightChild, _this);
			if (result_pattern_MocaCompare_6_2_findacorrespondingchildontheright_black != null) {

				return new Object[] { right, rightChild, _this, leftChild };
			}
		}
		return null;
	}

	public static final Object[] pattern_MocaCompare_6_2_findacorrespondingchildontheright_greenBB(Node rightChild,
			MocaCompare _this) {
		_this.getFoundRightRlements().add(rightChild);
		return new Object[] { rightChild, _this };
	}

	public static final void pattern_MocaCompare_6_3_comparechildrenrecursively_expressionBBB(MocaCompare _this,
			Node leftChild, Node rightChild) {
		_this.compareNode(leftChild, rightChild);

	}

	public static final void pattern_MocaCompare_6_4_collectdeletion_expressionBBB(MocaCompare _this, Node leftChild,
			Node left) {
		_this.collectDeletion(leftChild, left);

	}

	public static final Object[] pattern_MocaCompare_6_5_iterateoveraddedchildren_black_nac_0BB(MocaCompare _this,
			Node addedChild) {
		if (_this.getFoundRightRlements().contains(addedChild)) {
			return new Object[] { _this, addedChild };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MocaCompare_6_5_iterateoveraddedchildren_blackFBB(Node right,
			MocaCompare _this) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Text tmpAddedChild : right.getChildren()) {
			if (tmpAddedChild instanceof Node) {
				Node addedChild = (Node) tmpAddedChild;
				if (!addedChild.equals(right)) {
					if (pattern_MocaCompare_6_5_iterateoveraddedchildren_black_nac_0BB(_this, addedChild) == null) {
						_result.add(new Object[] { addedChild, right, _this });
					}
				}
			}
		}
		return _result;
	}

	public static final void pattern_MocaCompare_6_6_collectaddition_expressionBBB(MocaCompare _this, Node addedChild,
			Node left) {
		_this.collectAddition(addedChild, left);

	}

	// <-- [user code injected with eMoflon]

	private String computeId(String name, int index) {
		return name + "__" + index;
	}

	private HashMap<String, HashSet<TreeElement>> cachedTreeElements = new HashMap<String, HashSet<TreeElement>>();

	// [user code injected with eMoflon] -->
} //MocaCompareImpl
