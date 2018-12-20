/**
 */
package SDMLanguage.patterns.AttributeConstraints.impl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;
import SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint;

import SDMLanguage.patterns.ObjectVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeValueConstraintImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeValueConstraintImpl#getObjectVariable <em>Object Variable</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.impl.AttributeValueConstraintImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueConstraintImpl extends AttributeConstraintImpl implements AttributeValueConstraint {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected AttributeConstraintVariable parameter;

	/**
	 * The cached value of the '{@link #getObjectVariable() <em>Object Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectVariable()
	 * @generated
	 * @ordered
	 */
	protected ObjectVariable objectVariable;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EAttribute type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeConstraintsPackage.Literals.ATTRIBUTE_VALUE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintVariable getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (AttributeConstraintVariable) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER, oldParameter,
							parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintVariable basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(AttributeConstraintVariable newParameter, NotificationChain msgs) {
		AttributeConstraintVariable oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER, oldParameter, newParameter);
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
	public void setParameter(AttributeConstraintVariable newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject) parameter).eInverseRemove(this,
						AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS,
						AttributeConstraintVariable.class, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject) newParameter).eInverseAdd(this,
						AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS,
						AttributeConstraintVariable.class, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable getObjectVariable() {
		if (objectVariable != null && objectVariable.eIsProxy()) {
			InternalEObject oldObjectVariable = (InternalEObject) objectVariable;
			objectVariable = (ObjectVariable) eResolveProxy(oldObjectVariable);
			if (objectVariable != oldObjectVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE, oldObjectVariable,
							objectVariable));
			}
		}
		return objectVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable basicGetObjectVariable() {
		return objectVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectVariable(ObjectVariable newObjectVariable) {
		ObjectVariable oldObjectVariable = objectVariable;
		objectVariable = newObjectVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE, oldObjectVariable,
					objectVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EAttribute) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EAttribute newType) {
		EAttribute oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER:
			if (parameter != null)
				msgs = ((InternalEObject) parameter).eInverseRemove(this,
						AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS,
						AttributeConstraintVariable.class, msgs);
			return basicSetParameter((AttributeConstraintVariable) otherEnd, msgs);
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
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER:
			return basicSetParameter(null, msgs);
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
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE:
			if (resolve)
				return getObjectVariable();
			return basicGetObjectVariable();
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER:
			setParameter((AttributeConstraintVariable) newValue);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE:
			setObjectVariable((ObjectVariable) newValue);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__TYPE:
			setType((EAttribute) newValue);
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
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER:
			setParameter((AttributeConstraintVariable) null);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE:
			setObjectVariable((ObjectVariable) null);
			return;
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__TYPE:
			setType((EAttribute) null);
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
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER:
			return parameter != null;
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE:
			return objectVariable != null;
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT__TYPE:
			return type != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AttributeValueConstraintImpl
