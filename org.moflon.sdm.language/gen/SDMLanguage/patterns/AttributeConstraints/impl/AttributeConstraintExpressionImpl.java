/**
 */
package SDMLanguage.patterns.AttributeConstraints.impl;

import SDMLanguage.expressions.impl.ExpressionImpl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintExpressionImpl#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintExpressionImpl#getContainedVariables <em>Contained Variables</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintExpressionImpl#getContainedConstraints <em>Contained Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintExpressionImpl extends ExpressionImpl implements AttributeConstraintExpression {
	/**
	 * The cached value of the '{@link #getTargetVariable() <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected AttributeConstraintVariable targetVariable;

	/**
	 * The cached value of the '{@link #getContainedVariables() <em>Contained Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeConstraintVariable> containedVariables;

	/**
	 * The cached value of the '{@link #getContainedConstraints() <em>Contained Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeConstraint> containedConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConstraintExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeConstraintsPackage.Literals.ATTRIBUTE_CONSTRAINT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintVariable getTargetVariable() {
		if (targetVariable != null && targetVariable.eIsProxy()) {
			InternalEObject oldTargetVariable = (InternalEObject) targetVariable;
			targetVariable = (AttributeConstraintVariable) eResolveProxy(oldTargetVariable);
			if (targetVariable != oldTargetVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE,
							oldTargetVariable, targetVariable));
			}
		}
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintVariable basicGetTargetVariable() {
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariable(AttributeConstraintVariable newTargetVariable) {
		AttributeConstraintVariable oldTargetVariable = targetVariable;
		targetVariable = newTargetVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE, oldTargetVariable,
					targetVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeConstraintVariable> getContainedVariables() {
		if (containedVariables == null) {
			containedVariables = new EObjectContainmentEList<AttributeConstraintVariable>(
					AttributeConstraintVariable.class, this,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES);
		}
		return containedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeConstraint> getContainedConstraints() {
		if (containedConstraints == null) {
			containedConstraints = new EObjectContainmentEList<AttributeConstraint>(AttributeConstraint.class, this,
					AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS);
		}
		return containedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES:
			return ((InternalEList<?>) getContainedVariables()).basicRemove(otherEnd, msgs);
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS:
			return ((InternalEList<?>) getContainedConstraints()).basicRemove(otherEnd, msgs);
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE:
			if (resolve)
				return getTargetVariable();
			return basicGetTargetVariable();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES:
			return getContainedVariables();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS:
			return getContainedConstraints();
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE:
			setTargetVariable((AttributeConstraintVariable) newValue);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES:
			getContainedVariables().clear();
			getContainedVariables().addAll((Collection<? extends AttributeConstraintVariable>) newValue);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS:
			getContainedConstraints().clear();
			getContainedConstraints().addAll((Collection<? extends AttributeConstraint>) newValue);
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE:
			setTargetVariable((AttributeConstraintVariable) null);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES:
			getContainedVariables().clear();
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS:
			getContainedConstraints().clear();
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
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE:
			return targetVariable != null;
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES:
			return containedVariables != null && !containedVariables.isEmpty();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS:
			return containedConstraints != null && !containedConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AttributeConstraintExpressionImpl
