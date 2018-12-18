/**
 */
package MocaTree.impl;

import MocaTree.Link;
import MocaTree.TreeElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
import MocaTree.Attribute;
import MocaTree.MocaTreePackage;
import MocaTree.Node;
import MocaTree.Text;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MocaTree.impl.TreeElementImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link MocaTree.impl.TreeElementImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link MocaTree.impl.TreeElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TreeElementImpl extends EObjectImpl implements TreeElement {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MocaTreePackage.Literals.TREE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, MocaTreePackage.TREE_ELEMENT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.TREE_ELEMENT__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.TREE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MocaTreePackage.TREE_ELEMENT__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
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
		case MocaTreePackage.TREE_ELEMENT__LINKS:
			return getLinks();
		case MocaTreePackage.TREE_ELEMENT__INDEX:
			return getIndex();
		case MocaTreePackage.TREE_ELEMENT__NAME:
			return getName();
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
		case MocaTreePackage.TREE_ELEMENT__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case MocaTreePackage.TREE_ELEMENT__INDEX:
			setIndex((Integer) newValue);
			return;
		case MocaTreePackage.TREE_ELEMENT__NAME:
			setName((String) newValue);
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
		case MocaTreePackage.TREE_ELEMENT__LINKS:
			getLinks().clear();
			return;
		case MocaTreePackage.TREE_ELEMENT__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case MocaTreePackage.TREE_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
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
		case MocaTreePackage.TREE_ELEMENT__LINKS:
			return links != null && !links.isEmpty();
		case MocaTreePackage.TREE_ELEMENT__INDEX:
			return index != INDEX_EDEFAULT;
		case MocaTreePackage.TREE_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	public int compareTo(final TreeElement treeElement) {
		int orderUsingIndices = compareWithIndices(treeElement);
		if (orderUsingIndices != 0)
			return orderUsingIndices;

		int orderUsingNames = compareWithNames(treeElement);
		if (orderUsingNames != 0)
			return orderUsingNames;

		int orderUsingSpecialAttributes = compareWithSpecialAttributes(treeElement);
		if (orderUsingSpecialAttributes != 0)
			return orderUsingSpecialAttributes;

		return compareWithChildren(treeElement);
	}

	private int compareWithChildren(final TreeElement treeElement) {
		if (this instanceof Node && treeElement instanceof Node) {
			Node thisNode = (Node) this;
			Node treeElementNode = (Node) treeElement;
			return computeChildrenHash(thisNode).compareTo(computeChildrenHash(treeElementNode));
		} else
			return 0;
	}

	private int compareWithSpecialAttributes(TreeElement treeElement) {
		final String[] attributeHeuristics = { "name", "id", "ID", "value" };

		if (this instanceof Node && treeElement instanceof Node) {
			// apply attribute heuristics
			for (final String heuristic : attributeHeuristics) {
				// assuming that there is one name or id, iterating therefore arbitrarily
				for (final Attribute thisAttr : ((Node) this).getAttribute(heuristic)) {
					for (final Attribute treeElementAttr : ((Node) treeElement).getAttribute(heuristic)) {
						final int result = thisAttr.getValue().compareTo(treeElementAttr.getValue());
						if (result != 0)
							return result;
					}
				}
			}
		} else if (this instanceof Attribute && treeElement instanceof Attribute) {
			return ((Attribute) this).getValue().compareTo(((Attribute) treeElement).getValue());
		}

		return 0;
	}

	private int compareWithNames(final TreeElement treeElement) {
		if (name != null && treeElement.getName() != null)
			return name.compareTo(treeElement.getName());
		else
			return 0;
	}

	private int compareWithIndices(final TreeElement treeElement) {
		return new Integer(index).compareTo(treeElement.getIndex());
	}

	private Integer computeChildrenHash(final Node node) {
		int result = 0;

		if (node.getName() != null)
			result = node.getName().hashCode();

		for (final Text child : node.getChildren()) {
			if (child instanceof Node)
				result += computeChildrenHash((Node) child);
			else if (child.getName() != null)
				result += child.getName().hashCode();
		}

		for (final Attribute attr : node.getAttribute()) {
			result += attr.getName().hashCode() + attr.getValue().hashCode();
		}

		return result;
	}

	// [user code injected with eMoflon] -->
} //TreeElementImpl
