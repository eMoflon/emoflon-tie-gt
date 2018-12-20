/**
 */
package SDMLanguage.patterns.AttributeConstraints.impl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;
import SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint;

import SDMLanguage.patterns.PatternsPackage;
import SDMLanguage.patterns.StoryPattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl#getStoryPattern <em>Story Pattern</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl#getAttributeValueConstraints <em>Attribute Value Constraints</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintVariableImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintVariableImpl extends EObjectImpl implements AttributeConstraintVariable {
	/**
	 * The cached value of the '{@link #getAttributeValueConstraints() <em>Attribute Value Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValueConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValueConstraint> attributeValueConstraints;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDataType type;

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
	protected AttributeConstraintVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeConstraintsPackage.Literals.ATTRIBUTE_CONSTRAINT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getStoryPattern() {
		if (eContainerFeatureID() != AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN)
			return null;
		return (StoryPattern) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoryPattern(StoryPattern newStoryPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStoryPattern,
				AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoryPattern(StoryPattern newStoryPattern) {
		if (newStoryPattern != eInternalContainer()
				|| (eContainerFeatureID() != AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN
						&& newStoryPattern != null)) {
			if (EcoreUtil.isAncestor(this, newStoryPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStoryPattern != null)
				msgs = ((InternalEObject) newStoryPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__VARIABLES,
						StoryPattern.class, msgs);
			msgs = basicSetStoryPattern(newStoryPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN, newStoryPattern,
					newStoryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueConstraint> getAttributeValueConstraints() {
		if (attributeValueConstraints == null) {
			attributeValueConstraints = new EObjectWithInverseResolvingEList<AttributeValueConstraint>(
					AttributeValueConstraint.class, this,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS,
					AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER);
		}
		return attributeValueConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EDataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EDataType newType) {
		EDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStoryPattern((StoryPattern) otherEnd, msgs);
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributeValueConstraints())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN:
			return basicSetStoryPattern(null, msgs);
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS:
			return ((InternalEList<?>) getAttributeValueConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN:
			return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__VARIABLES,
					StoryPattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN:
			return getStoryPattern();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS:
			return getAttributeValueConstraints();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__NAME:
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN:
			setStoryPattern((StoryPattern) newValue);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS:
			getAttributeValueConstraints().clear();
			getAttributeValueConstraints().addAll((Collection<? extends AttributeValueConstraint>) newValue);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE:
			setType((EDataType) newValue);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__NAME:
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN:
			setStoryPattern((StoryPattern) null);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS:
			getAttributeValueConstraints().clear();
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE:
			setType((EDataType) null);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__NAME:
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN:
			return getStoryPattern() != null;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS:
			return attributeValueConstraints != null && !attributeValueConstraints.isEmpty();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE:
			return type != null;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AttributeConstraintVariableImpl
