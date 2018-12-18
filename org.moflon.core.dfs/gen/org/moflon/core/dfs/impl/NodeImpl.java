/**
 */
package org.moflon.core.dfs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsPackage;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.impl.NodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.NodeImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.NodeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.NodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.NodeImpl#getPostTraversal <em>Post Traversal</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.NodeImpl#getPreTraversal <em>Pre Traversal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node
{
   /**
    * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIncoming()
    * @generated
    * @ordered
    */
   protected EList<Edge> incoming;

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
    * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOutgoing()
    * @generated
    * @ordered
    */
   protected EList<Edge> outgoing;

   /**
    * The default value of the '{@link #getPostTraversal() <em>Post Traversal</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPostTraversal()
    * @generated
    * @ordered
    */
   protected static final int POST_TRAVERSAL_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getPostTraversal() <em>Post Traversal</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPostTraversal()
    * @generated
    * @ordered
    */
   protected int postTraversal = POST_TRAVERSAL_EDEFAULT;

   /**
    * The default value of the '{@link #getPreTraversal() <em>Pre Traversal</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPreTraversal()
    * @generated
    * @ordered
    */
   protected static final int PRE_TRAVERSAL_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getPreTraversal() <em>Pre Traversal</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPreTraversal()
    * @generated
    * @ordered
    */
   protected int preTraversal = PRE_TRAVERSAL_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NodeImpl()
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
      return DfsPackage.Literals.NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Edge> getIncoming()
   {
      if (incoming == null)
      {
         incoming = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, DfsPackage.NODE__INCOMING, DfsPackage.EDGE__TARGET);
      }
      return incoming;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DFSGraph getGraph()
   {
      if (eContainerFeatureID() != DfsPackage.NODE__GRAPH)
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
      msgs = eBasicSetContainer((InternalEObject) newGraph, DfsPackage.NODE__GRAPH, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGraph(DFSGraph newGraph)
   {
      if (newGraph != eInternalContainer() || (eContainerFeatureID() != DfsPackage.NODE__GRAPH && newGraph != null))
      {
         if (EcoreUtil.isAncestor(this, newGraph))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newGraph != null)
            msgs = ((InternalEObject) newGraph).eInverseAdd(this, DfsPackage.DFS_GRAPH__NODES, DFSGraph.class, msgs);
         msgs = basicSetGraph(newGraph, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.NODE__GRAPH, newGraph, newGraph));
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
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DfsPackage.NODE__ORIGIN, oldOrigin, origin));
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
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.NODE__ORIGIN, oldOrigin, origin));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Edge> getOutgoing()
   {
      if (outgoing == null)
      {
         outgoing = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, DfsPackage.NODE__OUTGOING, DfsPackage.EDGE__SOURCE);
      }
      return outgoing;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getPostTraversal()
   {
      return postTraversal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPostTraversal(int newPostTraversal)
   {
      int oldPostTraversal = postTraversal;
      postTraversal = newPostTraversal;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.NODE__POST_TRAVERSAL, oldPostTraversal, postTraversal));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getPreTraversal()
   {
      return preTraversal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPreTraversal(int newPreTraversal)
   {
      int oldPreTraversal = preTraversal;
      preTraversal = newPreTraversal;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.NODE__PRE_TRAVERSAL, oldPreTraversal, preTraversal));
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
      case DfsPackage.NODE__INCOMING:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(otherEnd, msgs);
      case DfsPackage.NODE__GRAPH:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetGraph((DFSGraph) otherEnd, msgs);
      case DfsPackage.NODE__OUTGOING:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
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
      case DfsPackage.NODE__INCOMING:
         return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
      case DfsPackage.NODE__GRAPH:
         return basicSetGraph(null, msgs);
      case DfsPackage.NODE__OUTGOING:
         return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
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
      case DfsPackage.NODE__GRAPH:
         return eInternalContainer().eInverseRemove(this, DfsPackage.DFS_GRAPH__NODES, DFSGraph.class, msgs);
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
      case DfsPackage.NODE__INCOMING:
         return getIncoming();
      case DfsPackage.NODE__GRAPH:
         return getGraph();
      case DfsPackage.NODE__ORIGIN:
         if (resolve)
            return getOrigin();
         return basicGetOrigin();
      case DfsPackage.NODE__OUTGOING:
         return getOutgoing();
      case DfsPackage.NODE__POST_TRAVERSAL:
         return getPostTraversal();
      case DfsPackage.NODE__PRE_TRAVERSAL:
         return getPreTraversal();
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
      case DfsPackage.NODE__INCOMING:
         getIncoming().clear();
         getIncoming().addAll((Collection<? extends Edge>) newValue);
         return;
      case DfsPackage.NODE__GRAPH:
         setGraph((DFSGraph) newValue);
         return;
      case DfsPackage.NODE__ORIGIN:
         setOrigin((EObject) newValue);
         return;
      case DfsPackage.NODE__OUTGOING:
         getOutgoing().clear();
         getOutgoing().addAll((Collection<? extends Edge>) newValue);
         return;
      case DfsPackage.NODE__POST_TRAVERSAL:
         setPostTraversal((Integer) newValue);
         return;
      case DfsPackage.NODE__PRE_TRAVERSAL:
         setPreTraversal((Integer) newValue);
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
      case DfsPackage.NODE__INCOMING:
         getIncoming().clear();
         return;
      case DfsPackage.NODE__GRAPH:
         setGraph((DFSGraph) null);
         return;
      case DfsPackage.NODE__ORIGIN:
         setOrigin((EObject) null);
         return;
      case DfsPackage.NODE__OUTGOING:
         getOutgoing().clear();
         return;
      case DfsPackage.NODE__POST_TRAVERSAL:
         setPostTraversal(POST_TRAVERSAL_EDEFAULT);
         return;
      case DfsPackage.NODE__PRE_TRAVERSAL:
         setPreTraversal(PRE_TRAVERSAL_EDEFAULT);
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
      case DfsPackage.NODE__INCOMING:
         return incoming != null && !incoming.isEmpty();
      case DfsPackage.NODE__GRAPH:
         return getGraph() != null;
      case DfsPackage.NODE__ORIGIN:
         return origin != null;
      case DfsPackage.NODE__OUTGOING:
         return outgoing != null && !outgoing.isEmpty();
      case DfsPackage.NODE__POST_TRAVERSAL:
         return postTraversal != POST_TRAVERSAL_EDEFAULT;
      case DfsPackage.NODE__PRE_TRAVERSAL:
         return preTraversal != PRE_TRAVERSAL_EDEFAULT;
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
      result.append(" (postTraversal: ");
      result.append(postTraversal);
      result.append(", preTraversal: ");
      result.append(preTraversal);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //NodeImpl
