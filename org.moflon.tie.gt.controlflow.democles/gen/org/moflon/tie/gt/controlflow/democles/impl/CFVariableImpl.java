/**
 */
package org.moflon.tie.gt.controlflow.democles.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;
import org.moflon.tie.gt.controlflow.democles.NodeDeletion;
import org.moflon.tie.gt.controlflow.democles.PatternInvocation;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.VariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CF Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#getReassignments <em>Reassignments</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#getDestructors <em>Destructors</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFVariableImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CFVariableImpl extends EObjectImpl implements CFVariable
{
   /**
    * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReferences()
    * @generated
    * @ordered
    */
   protected EList<VariableReference> references;

   /**
    * The cached value of the '{@link #getReassignments() <em>Reassignments</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReassignments()
    * @generated
    * @ordered
    */
   protected EList<Action> reassignments;

   /**
    * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstructor()
    * @generated
    * @ordered
    */
   protected Action constructor;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected EClassifier type;

   /**
    * The cached value of the '{@link #getDestructors() <em>Destructors</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDestructors()
    * @generated
    * @ordered
    */
   protected EList<NodeDeletion> destructors;

   /**
    * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isLocal()
    * @generated
    * @ordered
    */
   protected static final boolean LOCAL_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isLocal() <em>Local</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isLocal()
    * @generated
    * @ordered
    */
   protected boolean local = LOCAL_EDEFAULT;

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
   protected CFVariableImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return DemoclesPackage.Literals.CF_VARIABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<VariableReference> getReferences()
   {
      if (references == null)
      {
         references = new EObjectWithInverseResolvingEList<VariableReference>(VariableReference.class, this, DemoclesPackage.CF_VARIABLE__REFERENCES,
               DemoclesPackage.VARIABLE_REFERENCE__FROM);
      }
      return references;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope getScope()
   {
      if (eContainerFeatureID() != DemoclesPackage.CF_VARIABLE__SCOPE)
         return null;
      return (Scope) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newScope, DemoclesPackage.CF_VARIABLE__SCOPE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setScope(Scope newScope)
   {
      if (newScope != eInternalContainer() || (eContainerFeatureID() != DemoclesPackage.CF_VARIABLE__SCOPE && newScope != null))
      {
         if (EcoreUtil.isAncestor(this, newScope))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newScope != null)
            msgs = ((InternalEObject) newScope).eInverseAdd(this, DemoclesPackage.SCOPE__VARIABLES, Scope.class, msgs);
         msgs = basicSetScope(newScope, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_VARIABLE__SCOPE, newScope, newScope));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Action> getReassignments()
   {
      if (reassignments == null)
      {
         reassignments = new EObjectWithInverseResolvingEList.ManyInverse<Action>(Action.class, this, DemoclesPackage.CF_VARIABLE__REASSIGNMENTS,
               DemoclesPackage.ACTION__REASSIGNED_VARIABLES);
      }
      return reassignments;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action getConstructor()
   {
      if (constructor != null && constructor.eIsProxy())
      {
         InternalEObject oldConstructor = (InternalEObject) constructor;
         constructor = (Action) eResolveProxy(oldConstructor);
         if (constructor != oldConstructor)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.CF_VARIABLE__CONSTRUCTOR, oldConstructor, constructor));
         }
      }
      return constructor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action basicGetConstructor()
   {
      return constructor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetConstructor(Action newConstructor, NotificationChain msgs)
   {
      Action oldConstructor = constructor;
      constructor = newConstructor;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_VARIABLE__CONSTRUCTOR, oldConstructor,
               newConstructor);
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
   public void setConstructor(Action newConstructor)
   {
      if (newConstructor != constructor)
      {
         NotificationChain msgs = null;
         if (constructor != null)
            msgs = ((InternalEObject) constructor).eInverseRemove(this, DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES, Action.class, msgs);
         if (newConstructor != null)
            msgs = ((InternalEObject) newConstructor).eInverseAdd(this, DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES, Action.class, msgs);
         msgs = basicSetConstructor(newConstructor, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_VARIABLE__CONSTRUCTOR, newConstructor, newConstructor));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier getType()
   {
      if (type != null && type.eIsProxy())
      {
         InternalEObject oldType = (InternalEObject) type;
         type = (EClassifier) eResolveProxy(oldType);
         if (type != oldType)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.CF_VARIABLE__TYPE, oldType, type));
         }
      }
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier basicGetType()
   {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setType(EClassifier newType)
   {
      EClassifier oldType = type;
      type = newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_VARIABLE__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<NodeDeletion> getDestructors()
   {
      if (destructors == null)
      {
         destructors = new EObjectWithInverseResolvingEList.ManyInverse<NodeDeletion>(NodeDeletion.class, this, DemoclesPackage.CF_VARIABLE__DESTRUCTORS,
               DemoclesPackage.NODE_DELETION__DESTRUCTED_VARIABLES);
      }
      return destructors;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLocal()
   {
      return local;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLocal(boolean newLocal)
   {
      boolean oldLocal = local;
      local = newLocal;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_VARIABLE__LOCAL, oldLocal, local));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setName(String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_VARIABLE__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isOnlyDefined()
   {// 
      Object[] result1_black = CFVariableImpl.pattern_CFVariable_0_1_HasAdditionalReference_blackFFBF(this);
      if (result1_black != null)
      {
         //nothing VariableReference reference = (VariableReference) result1_black[0];
         //nothing PatternInvocation referencingAction = (PatternInvocation) result1_black[1];
         //nothing Action definingAction = (Action) result1_black[3];
         return CFVariableImpl.pattern_CFVariable_0_2_expressionF();
      } else
      {
         return CFVariableImpl.pattern_CFVariable_0_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DemoclesPackage.CF_VARIABLE__REFERENCES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferences()).basicAdd(otherEnd, msgs);
      case DemoclesPackage.CF_VARIABLE__SCOPE:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetScope((Scope) otherEnd, msgs);
      case DemoclesPackage.CF_VARIABLE__REASSIGNMENTS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getReassignments()).basicAdd(otherEnd, msgs);
      case DemoclesPackage.CF_VARIABLE__CONSTRUCTOR:
         if (constructor != null)
            msgs = ((InternalEObject) constructor).eInverseRemove(this, DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES, Action.class, msgs);
         return basicSetConstructor((Action) otherEnd, msgs);
      case DemoclesPackage.CF_VARIABLE__DESTRUCTORS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getDestructors()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DemoclesPackage.CF_VARIABLE__REFERENCES:
         return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
      case DemoclesPackage.CF_VARIABLE__SCOPE:
         return basicSetScope(null, msgs);
      case DemoclesPackage.CF_VARIABLE__REASSIGNMENTS:
         return ((InternalEList<?>) getReassignments()).basicRemove(otherEnd, msgs);
      case DemoclesPackage.CF_VARIABLE__CONSTRUCTOR:
         return basicSetConstructor(null, msgs);
      case DemoclesPackage.CF_VARIABLE__DESTRUCTORS:
         return ((InternalEList<?>) getDestructors()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
      case DemoclesPackage.CF_VARIABLE__SCOPE:
         return eInternalContainer().eInverseRemove(this, DemoclesPackage.SCOPE__VARIABLES, Scope.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case DemoclesPackage.CF_VARIABLE__REFERENCES:
         return getReferences();
      case DemoclesPackage.CF_VARIABLE__SCOPE:
         return getScope();
      case DemoclesPackage.CF_VARIABLE__REASSIGNMENTS:
         return getReassignments();
      case DemoclesPackage.CF_VARIABLE__CONSTRUCTOR:
         if (resolve)
            return getConstructor();
         return basicGetConstructor();
      case DemoclesPackage.CF_VARIABLE__TYPE:
         if (resolve)
            return getType();
         return basicGetType();
      case DemoclesPackage.CF_VARIABLE__DESTRUCTORS:
         return getDestructors();
      case DemoclesPackage.CF_VARIABLE__LOCAL:
         return isLocal();
      case DemoclesPackage.CF_VARIABLE__NAME:
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
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case DemoclesPackage.CF_VARIABLE__REFERENCES:
         getReferences().clear();
         getReferences().addAll((Collection<? extends VariableReference>) newValue);
         return;
      case DemoclesPackage.CF_VARIABLE__SCOPE:
         setScope((Scope) newValue);
         return;
      case DemoclesPackage.CF_VARIABLE__REASSIGNMENTS:
         getReassignments().clear();
         getReassignments().addAll((Collection<? extends Action>) newValue);
         return;
      case DemoclesPackage.CF_VARIABLE__CONSTRUCTOR:
         setConstructor((Action) newValue);
         return;
      case DemoclesPackage.CF_VARIABLE__TYPE:
         setType((EClassifier) newValue);
         return;
      case DemoclesPackage.CF_VARIABLE__DESTRUCTORS:
         getDestructors().clear();
         getDestructors().addAll((Collection<? extends NodeDeletion>) newValue);
         return;
      case DemoclesPackage.CF_VARIABLE__LOCAL:
         setLocal((Boolean) newValue);
         return;
      case DemoclesPackage.CF_VARIABLE__NAME:
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
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case DemoclesPackage.CF_VARIABLE__REFERENCES:
         getReferences().clear();
         return;
      case DemoclesPackage.CF_VARIABLE__SCOPE:
         setScope((Scope) null);
         return;
      case DemoclesPackage.CF_VARIABLE__REASSIGNMENTS:
         getReassignments().clear();
         return;
      case DemoclesPackage.CF_VARIABLE__CONSTRUCTOR:
         setConstructor((Action) null);
         return;
      case DemoclesPackage.CF_VARIABLE__TYPE:
         setType((EClassifier) null);
         return;
      case DemoclesPackage.CF_VARIABLE__DESTRUCTORS:
         getDestructors().clear();
         return;
      case DemoclesPackage.CF_VARIABLE__LOCAL:
         setLocal(LOCAL_EDEFAULT);
         return;
      case DemoclesPackage.CF_VARIABLE__NAME:
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
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case DemoclesPackage.CF_VARIABLE__REFERENCES:
         return references != null && !references.isEmpty();
      case DemoclesPackage.CF_VARIABLE__SCOPE:
         return getScope() != null;
      case DemoclesPackage.CF_VARIABLE__REASSIGNMENTS:
         return reassignments != null && !reassignments.isEmpty();
      case DemoclesPackage.CF_VARIABLE__CONSTRUCTOR:
         return constructor != null;
      case DemoclesPackage.CF_VARIABLE__TYPE:
         return type != null;
      case DemoclesPackage.CF_VARIABLE__DESTRUCTORS:
         return destructors != null && !destructors.isEmpty();
      case DemoclesPackage.CF_VARIABLE__LOCAL:
         return local != LOCAL_EDEFAULT;
      case DemoclesPackage.CF_VARIABLE__NAME:
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
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case DemoclesPackage.CF_VARIABLE___IS_ONLY_DEFINED:
         return isOnlyDefined();
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (local: ");
      result.append(local);
      result.append(", name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_CFVariable_0_1_HasAdditionalReference_blackFFBF(CFVariable _this)
   {
      Action definingAction = _this.getConstructor();
      if (definingAction != null)
      {
         for (VariableReference reference : _this.getReferences())
         {
            PatternInvocation referencingAction = reference.getInvocation();
            if (referencingAction != null)
            {
               if (!definingAction.equals(referencingAction))
               {
                  return new Object[] { reference, referencingAction, _this, definingAction };
               }
            }

         }
      }

      return null;
   }

   public static final boolean pattern_CFVariable_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_CFVariable_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //CFVariableImpl
