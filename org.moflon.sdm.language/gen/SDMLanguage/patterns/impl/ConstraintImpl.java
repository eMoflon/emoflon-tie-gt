/**
 */
package SDMLanguage.patterns.impl;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.Constraint;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.PatternsPackage;

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
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.impl.ConstraintImpl#getConstraintExpression <em>Constraint Expression</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ConstraintImpl#getObjectVariable <em>Object Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends EObjectImpl implements Constraint {
	/**
	 * The cached value of the '{@link #getConstraintExpression() <em>Constraint Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression constraintExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConstraintExpression() {
		return constraintExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintExpression(Expression newConstraintExpression, NotificationChain msgs) {
		Expression oldConstraintExpression = constraintExpression;
		constraintExpression = newConstraintExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION, oldConstraintExpression,
					newConstraintExpression);
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
	public void setConstraintExpression(Expression newConstraintExpression) {
		if (newConstraintExpression != constraintExpression) {
			NotificationChain msgs = null;
			if (constraintExpression != null)
				msgs = ((InternalEObject) constraintExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION, null, msgs);
			if (newConstraintExpression != null)
				msgs = ((InternalEObject) newConstraintExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION, null, msgs);
			msgs = basicSetConstraintExpression(newConstraintExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION,
					newConstraintExpression, newConstraintExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable getObjectVariable() {
		if (eContainerFeatureID() != PatternsPackage.CONSTRAINT__OBJECT_VARIABLE)
			return null;
		return (ObjectVariable) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectVariable(ObjectVariable newObjectVariable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newObjectVariable, PatternsPackage.CONSTRAINT__OBJECT_VARIABLE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectVariable(ObjectVariable newObjectVariable) {
		if (newObjectVariable != eInternalContainer()
				|| (eContainerFeatureID() != PatternsPackage.CONSTRAINT__OBJECT_VARIABLE
						&& newObjectVariable != null)) {
			if (EcoreUtil.isAncestor(this, newObjectVariable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObjectVariable != null)
				msgs = ((InternalEObject) newObjectVariable).eInverseAdd(this,
						PatternsPackage.OBJECT_VARIABLE__CONSTRAINT, ObjectVariable.class, msgs);
			msgs = basicSetObjectVariable(newObjectVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.CONSTRAINT__OBJECT_VARIABLE,
					newObjectVariable, newObjectVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PatternsPackage.CONSTRAINT__OBJECT_VARIABLE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetObjectVariable((ObjectVariable) otherEnd, msgs);
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
		case PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION:
			return basicSetConstraintExpression(null, msgs);
		case PatternsPackage.CONSTRAINT__OBJECT_VARIABLE:
			return basicSetObjectVariable(null, msgs);
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
		case PatternsPackage.CONSTRAINT__OBJECT_VARIABLE:
			return eInternalContainer().eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__CONSTRAINT,
					ObjectVariable.class, msgs);
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
		case PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION:
			return getConstraintExpression();
		case PatternsPackage.CONSTRAINT__OBJECT_VARIABLE:
			return getObjectVariable();
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
		case PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION:
			setConstraintExpression((Expression) newValue);
			return;
		case PatternsPackage.CONSTRAINT__OBJECT_VARIABLE:
			setObjectVariable((ObjectVariable) newValue);
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
		case PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION:
			setConstraintExpression((Expression) null);
			return;
		case PatternsPackage.CONSTRAINT__OBJECT_VARIABLE:
			setObjectVariable((ObjectVariable) null);
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
		case PatternsPackage.CONSTRAINT__CONSTRAINT_EXPRESSION:
			return constraintExpression != null;
		case PatternsPackage.CONSTRAINT__OBJECT_VARIABLE:
			return getObjectVariable() != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstraintImpl
