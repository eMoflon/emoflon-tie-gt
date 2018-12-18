/**
 */
package SDMLanguage.activities.impl;

import SDMLanguage.activities.ActivitiesPackage;
import SDMLanguage.activities.StoryNode;

import SDMLanguage.patterns.PatternsPackage;
import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.activities.impl.StoryNodeImpl#getStoryPattern <em>Story Pattern</em>}</li>
 *   <li>{@link SDMLanguage.activities.impl.StoryNodeImpl#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryNodeImpl extends ActivityNodeImpl implements StoryNode {
	/**
	 * The cached value of the '{@link #getStoryPattern() <em>Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected StoryPattern storyPattern;

	/**
	 * The default value of the '{@link #isForEach() <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForEach()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_EACH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForEach() <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForEach()
	 * @generated
	 * @ordered
	 */
	protected boolean forEach = FOR_EACH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.STORY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getStoryPattern() {
		return storyPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoryPattern(StoryPattern newStoryPattern, NotificationChain msgs) {
		StoryPattern oldStoryPattern = storyPattern;
		storyPattern = newStoryPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivitiesPackage.STORY_NODE__STORY_PATTERN, oldStoryPattern, newStoryPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoryPattern(StoryPattern newStoryPattern) {
		if (newStoryPattern != storyPattern) {
			NotificationChain msgs = null;
			if (storyPattern != null)
				msgs = ((InternalEObject) storyPattern).eInverseRemove(this, PatternsPackage.STORY_PATTERN__STORY_NODE,
						StoryPattern.class, msgs);
			if (newStoryPattern != null)
				msgs = ((InternalEObject) newStoryPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__STORY_NODE,
						StoryPattern.class, msgs);
			msgs = basicSetStoryPattern(newStoryPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.STORY_NODE__STORY_PATTERN,
					newStoryPattern, newStoryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForEach() {
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEach(boolean newForEach) {
		boolean oldForEach = forEach;
		forEach = newForEach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.STORY_NODE__FOR_EACH, oldForEach,
					forEach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
			if (storyPattern != null)
				msgs = ((InternalEObject) storyPattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivitiesPackage.STORY_NODE__STORY_PATTERN, null, msgs);
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
		case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
			return getStoryPattern();
		case ActivitiesPackage.STORY_NODE__FOR_EACH:
			return isForEach();
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
		case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
			setStoryPattern((StoryPattern) newValue);
			return;
		case ActivitiesPackage.STORY_NODE__FOR_EACH:
			setForEach((Boolean) newValue);
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
		case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
			setStoryPattern((StoryPattern) null);
			return;
		case ActivitiesPackage.STORY_NODE__FOR_EACH:
			setForEach(FOR_EACH_EDEFAULT);
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
		case ActivitiesPackage.STORY_NODE__STORY_PATTERN:
			return storyPattern != null;
		case ActivitiesPackage.STORY_NODE__FOR_EACH:
			return forEach != FOR_EACH_EDEFAULT;
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
		result.append(" (forEach: ");
		result.append(forEach);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //StoryNodeImpl
