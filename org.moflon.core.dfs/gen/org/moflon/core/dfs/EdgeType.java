/**
 */
package org.moflon.core.dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edge Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.core.dfs.DfsPackage#getEdgeType()
 * @model
 * @generated
 */
public enum EdgeType implements Enumerator {
   /**
    * The '<em><b>TREE EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #TREE_EDGE_VALUE
    * @generated
    * @ordered
    */
   TREE_EDGE(1, "TREE_EDGE", "TREE_EDGE"),

   /**
    * The '<em><b>BACKWARD EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BACKWARD_EDGE_VALUE
    * @generated
    * @ordered
    */
   BACKWARD_EDGE(2, "BACKWARD_EDGE", "BACKWARD_EDGE"),

   /**
    * The '<em><b>FORWARD EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FORWARD_EDGE_VALUE
    * @generated
    * @ordered
    */
   FORWARD_EDGE(3, "FORWARD_EDGE", "FORWARD_EDGE"),

   /**
    * The '<em><b>CROSS EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #CROSS_EDGE_VALUE
    * @generated
    * @ordered
    */
   CROSS_EDGE(4, "CROSS_EDGE", "CROSS_EDGE");

   /**
    * The '<em><b>TREE EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>TREE EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #TREE_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int TREE_EDGE_VALUE = 1;

   /**
    * The '<em><b>BACKWARD EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BACKWARD EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BACKWARD_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int BACKWARD_EDGE_VALUE = 2;

   /**
    * The '<em><b>FORWARD EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FORWARD EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FORWARD_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int FORWARD_EDGE_VALUE = 3;

   /**
    * The '<em><b>CROSS EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>CROSS EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #CROSS_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int CROSS_EDGE_VALUE = 4;

   /**
    * An array of all the '<em><b>Edge Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final EdgeType[] VALUES_ARRAY = new EdgeType[] { TREE_EDGE, BACKWARD_EDGE, FORWARD_EDGE, CROSS_EDGE, };

   /**
    * A public read-only list of all the '<em><b>Edge Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<EdgeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Edge Type</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param literal the literal.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static EdgeType get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         EdgeType result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Edge Type</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param name the name.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static EdgeType getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         EdgeType result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Edge Type</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the integer value.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static EdgeType get(int value)
   {
      switch (value)
      {
      case TREE_EDGE_VALUE:
         return TREE_EDGE;
      case BACKWARD_EDGE_VALUE:
         return BACKWARD_EDGE;
      case FORWARD_EDGE_VALUE:
         return FORWARD_EDGE;
      case CROSS_EDGE_VALUE:
         return CROSS_EDGE;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EdgeType(int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue()
   {
      return value;
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
   public String getLiteral()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      return literal;
   }

} //EdgeType
