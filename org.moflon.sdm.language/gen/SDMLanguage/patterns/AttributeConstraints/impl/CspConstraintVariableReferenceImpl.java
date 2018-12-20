/**
 */
package SDMLanguage.patterns.AttributeConstraints.impl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;
import SDMLanguage.patterns.AttributeConstraints.CspConstraint;
import SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference;

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
 * An implementation of the model object '<em><b>Csp Constraint Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintVariableReferenceImpl#getCspConstraint <em>Csp Constraint</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.CspConstraintVariableReferenceImpl#getAttributeConstraintVariable <em>Attribute Constraint Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CspConstraintVariableReferenceImpl extends EObjectImpl implements CspConstraintVariableReference {
	/**
	 * The cached value of the '{@link #getAttributeConstraintVariable() <em>Attribute Constraint Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeConstraintVariable()
	 * @generated
	 * @ordered
	 */
	protected AttributeConstraintVariable attributeConstraintVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CspConstraintVariableReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeConstraintsPackage.Literals.CSP_CONSTRAINT_VARIABLE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CspConstraint getCspConstraint() {
		if (eContainerFeatureID() != AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT)
			return null;
		return (CspConstraint) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCspConstraint(CspConstraint newCspConstraint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCspConstraint,
				AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCspConstraint(CspConstraint newCspConstraint) {
		if (newCspConstraint != eInternalContainer()
				|| (eContainerFeatureID() != AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT
						&& newCspConstraint != null)) {
			if (EcoreUtil.isAncestor(this, newCspConstraint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCspConstraint != null)
				msgs = ((InternalEObject) newCspConstraint).eInverseAdd(this,
						AttributeConstraintsPackage.CSP_CONSTRAINT__PARAMETERS, CspConstraint.class, msgs);
			msgs = basicSetCspConstraint(newCspConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT, newCspConstraint,
					newCspConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintVariable getAttributeConstraintVariable() {
		if (attributeConstraintVariable != null && attributeConstraintVariable.eIsProxy()) {
			InternalEObject oldAttributeConstraintVariable = (InternalEObject) attributeConstraintVariable;
			attributeConstraintVariable = (AttributeConstraintVariable) eResolveProxy(oldAttributeConstraintVariable);
			if (attributeConstraintVariable != oldAttributeConstraintVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE,
							oldAttributeConstraintVariable, attributeConstraintVariable));
			}
		}
		return attributeConstraintVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintVariable basicGetAttributeConstraintVariable() {
		return attributeConstraintVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeConstraintVariable(AttributeConstraintVariable newAttributeConstraintVariable) {
		AttributeConstraintVariable oldAttributeConstraintVariable = attributeConstraintVariable;
		attributeConstraintVariable = newAttributeConstraintVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE,
					oldAttributeConstraintVariable, attributeConstraintVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCspConstraint((CspConstraint) otherEnd, msgs);
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
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT:
			return basicSetCspConstraint(null, msgs);
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
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT:
			return eInternalContainer().eInverseRemove(this, AttributeConstraintsPackage.CSP_CONSTRAINT__PARAMETERS,
					CspConstraint.class, msgs);
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
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT:
			return getCspConstraint();
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE:
			if (resolve)
				return getAttributeConstraintVariable();
			return basicGetAttributeConstraintVariable();
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
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT:
			setCspConstraint((CspConstraint) newValue);
			return;
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE:
			setAttributeConstraintVariable((AttributeConstraintVariable) newValue);
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
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT:
			setCspConstraint((CspConstraint) null);
			return;
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE:
			setAttributeConstraintVariable((AttributeConstraintVariable) null);
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
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT:
			return getCspConstraint() != null;
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE:
			return attributeConstraintVariable != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CspConstraintVariableReferenceImpl
