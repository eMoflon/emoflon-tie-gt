/**
 */
package org.moflon.core.dfs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsPackage;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeType;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.impl.EdgeImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.EdgeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.EdgeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends EObjectImpl implements Edge
{
   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected Node source;

   /**
    * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOrigin()
    * @generated
    * @ordered
    */
   protected EObject origin;

   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected Node target;

   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final EdgeType TYPE_EDEFAULT = EdgeType.TREE_EDGE;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected EdgeType type = TYPE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EdgeImpl()
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
      return DfsPackage.Literals.EDGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DFSGraph getGraph()
   {
      if (eContainerFeatureID() != DfsPackage.EDGE__GRAPH)
         return null;
      return (DFSGraph) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetGraph(DFSGraph newGraph, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newGraph, DfsPackage.EDGE__GRAPH, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGraph(DFSGraph newGraph)
   {
      if (newGraph != eInternalContainer() || (eContainerFeatureID() != DfsPackage.EDGE__GRAPH && newGraph != null))
      {
         if (EcoreUtil.isAncestor(this, newGraph))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newGraph != null)
            msgs = ((InternalEObject) newGraph).eInverseAdd(this, DfsPackage.DFS_GRAPH__EDGES, DFSGraph.class, msgs);
         msgs = basicSetGraph(newGraph, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE__GRAPH, newGraph, newGraph));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getSource()
   {
      if (source != null && source.eIsProxy())
      {
         InternalEObject oldSource = (InternalEObject) source;
         source = (Node) eResolveProxy(oldSource);
         if (source != oldSource)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DfsPackage.EDGE__SOURCE, oldSource, source));
         }
      }
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetSource()
   {
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSource(Node newSource, NotificationChain msgs)
   {
      Node oldSource = source;
      source = newSource;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE__SOURCE, oldSource, newSource);
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
   public void setSource(Node newSource)
   {
      if (newSource != source)
      {
         NotificationChain msgs = null;
         if (source != null)
            msgs = ((InternalEObject) source).eInverseRemove(this, DfsPackage.NODE__OUTGOING, Node.class, msgs);
         if (newSource != null)
            msgs = ((InternalEObject) newSource).eInverseAdd(this, DfsPackage.NODE__OUTGOING, Node.class, msgs);
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE__SOURCE, newSource, newSource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject getOrigin()
   {
      if (origin != null && origin.eIsProxy())
      {
         InternalEObject oldOrigin = (InternalEObject) origin;
         origin = eResolveProxy(oldOrigin);
         if (origin != oldOrigin)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DfsPackage.EDGE__ORIGIN, oldOrigin, origin));
         }
      }
      return origin;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject basicGetOrigin()
   {
      return origin;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOrigin(EObject newOrigin)
   {
      EObject oldOrigin = origin;
      origin = newOrigin;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE__ORIGIN, oldOrigin, origin));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getTarget()
   {
      if (target != null && target.eIsProxy())
      {
         InternalEObject oldTarget = (InternalEObject) target;
         target = (Node) eResolveProxy(oldTarget);
         if (target != oldTarget)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DfsPackage.EDGE__TARGET, oldTarget, target));
         }
      }
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetTarget()
   {
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs)
   {
      Node oldTarget = target;
      target = newTarget;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE__TARGET, oldTarget, newTarget);
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
   public void setTarget(Node newTarget)
   {
      if (newTarget != target)
      {
         NotificationChain msgs = null;
         if (target != null)
            msgs = ((InternalEObject) target).eInverseRemove(this, DfsPackage.NODE__INCOMING, Node.class, msgs);
         if (newTarget != null)
            msgs = ((InternalEObject) newTarget).eInverseAdd(this, DfsPackage.NODE__INCOMING, Node.class, msgs);
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE__TARGET, newTarget, newTarget));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EdgeType getType()
   {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setType(EdgeType newType)
   {
      EdgeType oldType = type;
      type = newType == null ? TYPE_EDEFAULT : newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.EDGE__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DfsPackage.EDGE__GRAPH:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetGraph((DFSGraph) otherEnd, msgs);
      case DfsPackage.EDGE__SOURCE:
         if (source != null)
            msgs = ((InternalEObject) source).eInverseRemove(this, DfsPackage.NODE__OUTGOING, Node.class, msgs);
         return basicSetSource((Node) otherEnd, msgs);
      case DfsPackage.EDGE__TARGET:
         if (target != null)
            msgs = ((InternalEObject) target).eInverseRemove(this, DfsPackage.NODE__INCOMING, Node.class, msgs);
         return basicSetTarget((Node) otherEnd, msgs);
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
      case DfsPackage.EDGE__GRAPH:
         return basicSetGraph(null, msgs);
      case DfsPackage.EDGE__SOURCE:
         return basicSetSource(null, msgs);
      case DfsPackage.EDGE__TARGET:
         return basicSetTarget(null, msgs);
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
      case DfsPackage.EDGE__GRAPH:
         return eInternalContainer().eInverseRemove(this, DfsPackage.DFS_GRAPH__EDGES, DFSGraph.class, msgs);
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
      case DfsPackage.EDGE__GRAPH:
         return getGraph();
      case DfsPackage.EDGE__SOURCE:
         if (resolve)
            return getSource();
         return basicGetSource();
      case DfsPackage.EDGE__ORIGIN:
         if (resolve)
            return getOrigin();
         return basicGetOrigin();
      case DfsPackage.EDGE__TARGET:
         if (resolve)
            return getTarget();
         return basicGetTarget();
      case DfsPackage.EDGE__TYPE:
         return getType();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case DfsPackage.EDGE__GRAPH:
         setGraph((DFSGraph) newValue);
         return;
      case DfsPackage.EDGE__SOURCE:
         setSource((Node) newValue);
         return;
      case DfsPackage.EDGE__ORIGIN:
         setOrigin((EObject) newValue);
         return;
      case DfsPackage.EDGE__TARGET:
         setTarget((Node) newValue);
         return;
      case DfsPackage.EDGE__TYPE:
         setType((EdgeType) newValue);
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
      case DfsPackage.EDGE__GRAPH:
         setGraph((DFSGraph) null);
         return;
      case DfsPackage.EDGE__SOURCE:
         setSource((Node) null);
         return;
      case DfsPackage.EDGE__ORIGIN:
         setOrigin((EObject) null);
         return;
      case DfsPackage.EDGE__TARGET:
         setTarget((Node) null);
         return;
      case DfsPackage.EDGE__TYPE:
         setType(TYPE_EDEFAULT);
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
      case DfsPackage.EDGE__GRAPH:
         return getGraph() != null;
      case DfsPackage.EDGE__SOURCE:
         return source != null;
      case DfsPackage.EDGE__ORIGIN:
         return origin != null;
      case DfsPackage.EDGE__TARGET:
         return target != null;
      case DfsPackage.EDGE__TYPE:
         return type != TYPE_EDEFAULT;
      }
      return super.eIsSet(featureID);
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
      result.append(" (type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //EdgeImpl
