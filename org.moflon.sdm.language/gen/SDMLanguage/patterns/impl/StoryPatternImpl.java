/**
 */
package SDMLanguage.patterns.impl;

import SDMLanguage.activities.ActivitiesPackage;
import SDMLanguage.activities.StoryNode;

import SDMLanguage.impl.CommentableElementImpl;

import SDMLanguage.patterns.ApplicationConditionStoryPattern;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;

import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.PatternsPackage;
import SDMLanguage.patterns.StoryPattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.impl.StoryPatternImpl#getObjectVariable <em>Object Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.StoryPatternImpl#getLinkVariable <em>Link Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.StoryPatternImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.StoryPatternImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.StoryPatternImpl#getApplicationConditions <em>Application Conditions</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.StoryPatternImpl#getStoryNode <em>Story Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryPatternImpl extends CommentableElementImpl implements StoryPattern {
	/**
	 * The cached value of the '{@link #getObjectVariable() <em>Object Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectVariable> objectVariable;

	/**
	 * The cached value of the '{@link #getLinkVariable() <em>Link Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkVariable> linkVariable;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeConstraint> constraints;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeConstraintVariable> variables;

	/**
	 * The cached value of the '{@link #getApplicationConditions() <em>Application Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationConditionStoryPattern> applicationConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.STORY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectVariable> getObjectVariable() {
		if (objectVariable == null) {
			objectVariable = new EObjectContainmentWithInverseEList<ObjectVariable>(ObjectVariable.class, this,
					PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE, PatternsPackage.OBJECT_VARIABLE__PATTERN);
		}
		return objectVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkVariable> getLinkVariable() {
		if (linkVariable == null) {
			linkVariable = new EObjectContainmentWithInverseEList<LinkVariable>(LinkVariable.class, this,
					PatternsPackage.STORY_PATTERN__LINK_VARIABLE, PatternsPackage.LINK_VARIABLE__PATTERN);
		}
		return linkVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<AttributeConstraint>(AttributeConstraint.class, this,
					PatternsPackage.STORY_PATTERN__CONSTRAINTS,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT__STORY_PATTERN);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeConstraintVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<AttributeConstraintVariable>(
					AttributeConstraintVariable.class, this, PatternsPackage.STORY_PATTERN__VARIABLES,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationConditionStoryPattern> getApplicationConditions() {
		if (applicationConditions == null) {
			applicationConditions = new EObjectContainmentWithInverseEList<ApplicationConditionStoryPattern>(
					ApplicationConditionStoryPattern.class, this, PatternsPackage.STORY_PATTERN__APPLICATION_CONDITIONS,
					PatternsPackage.APPLICATION_CONDITION_STORY_PATTERN__STORY_PATTERN);
		}
		return applicationConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryNode getStoryNode() {
		if (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__STORY_NODE)
			return null;
		return (StoryNode) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoryNode(StoryNode newStoryNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStoryNode, PatternsPackage.STORY_PATTERN__STORY_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoryNode(StoryNode newStoryNode) {
		if (newStoryNode != eInternalContainer()
				|| (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__STORY_NODE && newStoryNode != null)) {
			if (EcoreUtil.isAncestor(this, newStoryNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStoryNode != null)
				msgs = ((InternalEObject) newStoryNode).eInverseAdd(this, ActivitiesPackage.STORY_NODE__STORY_PATTERN,
						StoryNode.class, msgs);
			msgs = basicSetStoryNode(newStoryNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__STORY_NODE,
					newStoryNode, newStoryNode));
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
		case PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getObjectVariable()).basicAdd(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkVariable()).basicAdd(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraints()).basicAdd(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__VARIABLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables()).basicAdd(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__APPLICATION_CONDITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getApplicationConditions()).basicAdd(otherEnd,
					msgs);
		case PatternsPackage.STORY_PATTERN__STORY_NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStoryNode((StoryNode) otherEnd, msgs);
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
		case PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE:
			return ((InternalEList<?>) getObjectVariable()).basicRemove(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
			return ((InternalEList<?>) getLinkVariable()).basicRemove(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__APPLICATION_CONDITIONS:
			return ((InternalEList<?>) getApplicationConditions()).basicRemove(otherEnd, msgs);
		case PatternsPackage.STORY_PATTERN__STORY_NODE:
			return basicSetStoryNode(null, msgs);
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
		case PatternsPackage.STORY_PATTERN__STORY_NODE:
			return eInternalContainer().eInverseRemove(this, ActivitiesPackage.STORY_NODE__STORY_PATTERN,
					StoryNode.class, msgs);
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
		case PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE:
			return getObjectVariable();
		case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
			return getLinkVariable();
		case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
			return getConstraints();
		case PatternsPackage.STORY_PATTERN__VARIABLES:
			return getVariables();
		case PatternsPackage.STORY_PATTERN__APPLICATION_CONDITIONS:
			return getApplicationConditions();
		case PatternsPackage.STORY_PATTERN__STORY_NODE:
			return getStoryNode();
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
		case PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE:
			getObjectVariable().clear();
			getObjectVariable().addAll((Collection<? extends ObjectVariable>) newValue);
			return;
		case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
			getLinkVariable().clear();
			getLinkVariable().addAll((Collection<? extends LinkVariable>) newValue);
			return;
		case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends AttributeConstraint>) newValue);
			return;
		case PatternsPackage.STORY_PATTERN__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends AttributeConstraintVariable>) newValue);
			return;
		case PatternsPackage.STORY_PATTERN__APPLICATION_CONDITIONS:
			getApplicationConditions().clear();
			getApplicationConditions().addAll((Collection<? extends ApplicationConditionStoryPattern>) newValue);
			return;
		case PatternsPackage.STORY_PATTERN__STORY_NODE:
			setStoryNode((StoryNode) newValue);
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
		case PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE:
			getObjectVariable().clear();
			return;
		case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
			getLinkVariable().clear();
			return;
		case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
			getConstraints().clear();
			return;
		case PatternsPackage.STORY_PATTERN__VARIABLES:
			getVariables().clear();
			return;
		case PatternsPackage.STORY_PATTERN__APPLICATION_CONDITIONS:
			getApplicationConditions().clear();
			return;
		case PatternsPackage.STORY_PATTERN__STORY_NODE:
			setStoryNode((StoryNode) null);
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
		case PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE:
			return objectVariable != null && !objectVariable.isEmpty();
		case PatternsPackage.STORY_PATTERN__LINK_VARIABLE:
			return linkVariable != null && !linkVariable.isEmpty();
		case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		case PatternsPackage.STORY_PATTERN__VARIABLES:
			return variables != null && !variables.isEmpty();
		case PatternsPackage.STORY_PATTERN__APPLICATION_CONDITIONS:
			return applicationConditions != null && !applicationConditions.isEmpty();
		case PatternsPackage.STORY_PATTERN__STORY_NODE:
			return getStoryNode() != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //StoryPatternImpl
