/**
 */
package SDMLanguage.patterns.AttributeConstraints.impl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;

import SDMLanguage.patterns.PatternsPackage;
import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintImpl#getStoryPattern <em>Story Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintImpl extends EObjectImpl implements AttributeConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeConstraintsPackage.Literals.ATTRIBUTE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getStoryPattern() {
		if (eContainerFeatureID() != AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN)
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
				AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoryPattern(StoryPattern newStoryPattern) {
		if (newStoryPattern != eInternalContainer()
				|| (eContainerFeatureID() != AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN
						&& newStoryPattern != null)) {
			if (EcoreUtil.isAncestor(this, newStoryPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStoryPattern != null)
				msgs = ((InternalEObject) newStoryPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__CONSTRAINTS,
						StoryPattern.class, msgs);
			msgs = basicSetStoryPattern(newStoryPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN, newStoryPattern, newStoryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStoryPattern((StoryPattern) otherEnd, msgs);
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN:
			return basicSetStoryPattern(null, msgs);
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN:
			return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__CONSTRAINTS,
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN:
			return getStoryPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN:
			setStoryPattern((StoryPattern) newValue);
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN:
			setStoryPattern((StoryPattern) null);
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN:
			return getStoryPattern() != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AttributeConstraintImpl
