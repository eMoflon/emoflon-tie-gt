/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Errors</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getErrors()
 * @model
 * @generated
 */
public enum Errors implements Enumerator {
   /**
    * The '<em><b>GREEN BOUND VAR FOUND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #GREEN_BOUND_VAR_FOUND_VALUE
    * @generated
    * @ordered
    */
   GREEN_BOUND_VAR_FOUND(0, "GREEN_BOUND_VAR_FOUND", "GREEN_BOUND_VAR_FOUND"),

   /**
    * The '<em><b>BOUND IS UNBOUND IN SPEC</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BOUND_IS_UNBOUND_IN_SPEC_VALUE
    * @generated
    * @ordered
    */
   BOUND_IS_UNBOUND_IN_SPEC(1, "BOUND_IS_UNBOUND_IN_SPEC", "BOUND_IS_UNBOUND_IN_SPEC"),

   /**
    * The '<em><b>UNBOUND IS BOUND IN SPEC</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #UNBOUND_IS_BOUND_IN_SPEC_VALUE
    * @generated
    * @ordered
    */
   UNBOUND_IS_BOUND_IN_SPEC(2, "UNBOUND_IS_BOUND_IN_SPEC", "UNBOUND_IS_BOUND_IN_SPEC"),

   /**
    * The '<em><b>BOUND VARIABLE ALREADY DELETED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BOUND_VARIABLE_ALREADY_DELETED_VALUE
    * @generated
    * @ordered
    */
   BOUND_VARIABLE_ALREADY_DELETED(3, "BOUND_VARIABLE_ALREADY_DELETED", "BOUND_VARIABLE_ALREADY_DELETED"),

   /**
    * The '<em><b>RED BOUND VAR IN LOOP</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #RED_BOUND_VAR_IN_LOOP_VALUE
    * @generated
    * @ordered
    */
   RED_BOUND_VAR_IN_LOOP(4, "RED_BOUND_VAR_IN_LOOP", "RED_BOUND_VAR_IN_LOOP"),

   /**
    * The '<em><b>FREE VAR IS RED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FREE_VAR_IS_RED_VALUE
    * @generated
    * @ordered
    */
   FREE_VAR_IS_RED(5, "FREE_VAR_IS_RED", "FREE_VAR_IS_RED"),

   /**
    * The '<em><b>GREEN VAR IS NOT NEW</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #GREEN_VAR_IS_NOT_NEW_VALUE
    * @generated
    * @ordered
    */
   GREEN_VAR_IS_NOT_NEW(6, "GREEN_VAR_IS_NOT_NEW", "GREEN_VAR_IS_NOT_NEW"),

   /**
    * The '<em><b>BINDING VAR NOT FREE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BINDING_VAR_NOT_FREE_VALUE
    * @generated
    * @ordered
    */
   BINDING_VAR_NOT_FREE(7, "BINDING_VAR_NOT_FREE", "BINDING_VAR_NOT_FREE"),

   /**
    * The '<em><b>OPTIONAL VAR FOUND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #OPTIONAL_VAR_FOUND_VALUE
    * @generated
    * @ordered
    */
   OPTIONAL_VAR_FOUND(8, "OPTIONAL_VAR_FOUND", "OPTIONAL_VAR_FOUND"),

   /**
    * The '<em><b>REASSIGNED METHOD PARAMETER</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #REASSIGNED_METHOD_PARAMETER_VALUE
    * @generated
    * @ordered
    */
   REASSIGNED_METHOD_PARAMETER(9, "REASSIGNED_METHOD_PARAMETER", "REASSIGNED_METHOD_PARAMETER"),

   /**
    * The '<em><b>MULTIPLE ATTRIBUTE ASSIGNMENT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #MULTIPLE_ATTRIBUTE_ASSIGNMENT_VALUE
    * @generated
    * @ordered
    */
   MULTIPLE_ATTRIBUTE_ASSIGNMENT(10, "MULTIPLE_ATTRIBUTE_ASSIGNMENT", "MULTIPLE_ATTRIBUTE_ASSIGNMENT"),

   /**
    * The '<em><b>EMPTY COMPOUND NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EMPTY_COMPOUND_NODE_VALUE
    * @generated
    * @ordered
    */
   EMPTY_COMPOUND_NODE(11, "EMPTY_COMPOUND_NODE", "EMPTY_COMPOUND_NODE"),

   /**
    * The '<em><b>INFINITE LOOP</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #INFINITE_LOOP_VALUE
    * @generated
    * @ordered
    */
   INFINITE_LOOP(12, "INFINITE_LOOP", "INFINITE_LOOP"),

   /**
    * The '<em><b>FREE GREEN VARIABLE MARKED AS BOUND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FREE_GREEN_VARIABLE_MARKED_AS_BOUND_VALUE
    * @generated
    * @ordered
    */
   FREE_GREEN_VARIABLE_MARKED_AS_BOUND(13, "FREE_GREEN_VARIABLE_MARKED_AS_BOUND", "FREE_GREEN_VARIABLE_MARKED_AS_BOUND"),

   /**
    * The '<em><b>GREEN VARIABLE WITH BINDING</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #GREEN_VARIABLE_WITH_BINDING_VALUE
    * @generated
    * @ordered
    */
   GREEN_VARIABLE_WITH_BINDING(14, "GREEN_VARIABLE_WITH_BINDING", "GREEN_VARIABLE_WITH_BINDING"),

   /**
    * The '<em><b>THIS OBJECT DELETED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #THIS_OBJECT_DELETED_VALUE
    * @generated
    * @ordered
    */
   THIS_OBJECT_DELETED(15, "THIS_OBJECT_DELETED", "THIS_OBJECT_DELETED"),

   /**
    * The '<em><b>EMPTY FOREACH NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EMPTY_FOREACH_NODE_VALUE
    * @generated
    * @ordered
    */
   EMPTY_FOREACH_NODE(16, "EMPTY_FOREACH_NODE", "EMPTY_FOREACH_NODE");

   /**
    * The '<em><b>GREEN BOUND VAR FOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>GREEN BOUND VAR FOUND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREEN_BOUND_VAR_FOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int GREEN_BOUND_VAR_FOUND_VALUE = 0;

   /**
    * The '<em><b>BOUND IS UNBOUND IN SPEC</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BOUND IS UNBOUND IN SPEC</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BOUND_IS_UNBOUND_IN_SPEC
    * @model
    * @generated
    * @ordered
    */
   public static final int BOUND_IS_UNBOUND_IN_SPEC_VALUE = 1;

   /**
    * The '<em><b>UNBOUND IS BOUND IN SPEC</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>UNBOUND IS BOUND IN SPEC</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #UNBOUND_IS_BOUND_IN_SPEC
    * @model
    * @generated
    * @ordered
    */
   public static final int UNBOUND_IS_BOUND_IN_SPEC_VALUE = 2;

   /**
    * The '<em><b>BOUND VARIABLE ALREADY DELETED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BOUND VARIABLE ALREADY DELETED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BOUND_VARIABLE_ALREADY_DELETED
    * @model
    * @generated
    * @ordered
    */
   public static final int BOUND_VARIABLE_ALREADY_DELETED_VALUE = 3;

   /**
    * The '<em><b>RED BOUND VAR IN LOOP</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>RED BOUND VAR IN LOOP</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #RED_BOUND_VAR_IN_LOOP
    * @model
    * @generated
    * @ordered
    */
   public static final int RED_BOUND_VAR_IN_LOOP_VALUE = 4;

   /**
    * The '<em><b>FREE VAR IS RED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FREE VAR IS RED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FREE_VAR_IS_RED
    * @model
    * @generated
    * @ordered
    */
   public static final int FREE_VAR_IS_RED_VALUE = 5;

   /**
    * The '<em><b>GREEN VAR IS NOT NEW</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>GREEN VAR IS NOT NEW</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREEN_VAR_IS_NOT_NEW
    * @model
    * @generated
    * @ordered
    */
   public static final int GREEN_VAR_IS_NOT_NEW_VALUE = 6;

   /**
    * The '<em><b>BINDING VAR NOT FREE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BINDING VAR NOT FREE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BINDING_VAR_NOT_FREE
    * @model
    * @generated
    * @ordered
    */
   public static final int BINDING_VAR_NOT_FREE_VALUE = 7;

   /**
    * The '<em><b>OPTIONAL VAR FOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>OPTIONAL VAR FOUND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #OPTIONAL_VAR_FOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int OPTIONAL_VAR_FOUND_VALUE = 8;

   /**
    * The '<em><b>REASSIGNED METHOD PARAMETER</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>REASSIGNED METHOD PARAMETER</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #REASSIGNED_METHOD_PARAMETER
    * @model
    * @generated
    * @ordered
    */
   public static final int REASSIGNED_METHOD_PARAMETER_VALUE = 9;

   /**
    * The '<em><b>MULTIPLE ATTRIBUTE ASSIGNMENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MULTIPLE ATTRIBUTE ASSIGNMENT</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #MULTIPLE_ATTRIBUTE_ASSIGNMENT
    * @model
    * @generated
    * @ordered
    */
   public static final int MULTIPLE_ATTRIBUTE_ASSIGNMENT_VALUE = 10;

   /**
    * The '<em><b>EMPTY COMPOUND NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EMPTY COMPOUND NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EMPTY_COMPOUND_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int EMPTY_COMPOUND_NODE_VALUE = 11;

   /**
    * The '<em><b>INFINITE LOOP</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>INFINITE LOOP</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #INFINITE_LOOP
    * @model
    * @generated
    * @ordered
    */
   public static final int INFINITE_LOOP_VALUE = 12;

   /**
    * The '<em><b>FREE GREEN VARIABLE MARKED AS BOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FREE GREEN VARIABLE MARKED AS BOUND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FREE_GREEN_VARIABLE_MARKED_AS_BOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int FREE_GREEN_VARIABLE_MARKED_AS_BOUND_VALUE = 13;

   /**
    * The '<em><b>GREEN VARIABLE WITH BINDING</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>GREEN VARIABLE WITH BINDING</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREEN_VARIABLE_WITH_BINDING
    * @model
    * @generated
    * @ordered
    */
   public static final int GREEN_VARIABLE_WITH_BINDING_VALUE = 14;

   /**
    * The '<em><b>THIS OBJECT DELETED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>THIS OBJECT DELETED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #THIS_OBJECT_DELETED
    * @model
    * @generated
    * @ordered
    */
   public static final int THIS_OBJECT_DELETED_VALUE = 15;

   /**
    * The '<em><b>EMPTY FOREACH NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EMPTY FOREACH NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EMPTY_FOREACH_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int EMPTY_FOREACH_NODE_VALUE = 16;

   /**
    * An array of all the '<em><b>Errors</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final Errors[] VALUES_ARRAY = new Errors[] { GREEN_BOUND_VAR_FOUND, BOUND_IS_UNBOUND_IN_SPEC, UNBOUND_IS_BOUND_IN_SPEC,
         BOUND_VARIABLE_ALREADY_DELETED, RED_BOUND_VAR_IN_LOOP, FREE_VAR_IS_RED, GREEN_VAR_IS_NOT_NEW, BINDING_VAR_NOT_FREE, OPTIONAL_VAR_FOUND,
         REASSIGNED_METHOD_PARAMETER, MULTIPLE_ATTRIBUTE_ASSIGNMENT, EMPTY_COMPOUND_NODE, INFINITE_LOOP, FREE_GREEN_VARIABLE_MARKED_AS_BOUND,
         GREEN_VARIABLE_WITH_BINDING, THIS_OBJECT_DELETED, EMPTY_FOREACH_NODE, };

   /**
    * A public read-only list of all the '<em><b>Errors</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<Errors> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Errors</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param literal the literal.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static Errors get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Errors result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Errors</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param name the name.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static Errors getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Errors result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Errors</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the integer value.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static Errors get(int value)
   {
      switch (value)
      {
      case GREEN_BOUND_VAR_FOUND_VALUE:
         return GREEN_BOUND_VAR_FOUND;
      case BOUND_IS_UNBOUND_IN_SPEC_VALUE:
         return BOUND_IS_UNBOUND_IN_SPEC;
      case UNBOUND_IS_BOUND_IN_SPEC_VALUE:
         return UNBOUND_IS_BOUND_IN_SPEC;
      case BOUND_VARIABLE_ALREADY_DELETED_VALUE:
         return BOUND_VARIABLE_ALREADY_DELETED;
      case RED_BOUND_VAR_IN_LOOP_VALUE:
         return RED_BOUND_VAR_IN_LOOP;
      case FREE_VAR_IS_RED_VALUE:
         return FREE_VAR_IS_RED;
      case GREEN_VAR_IS_NOT_NEW_VALUE:
         return GREEN_VAR_IS_NOT_NEW;
      case BINDING_VAR_NOT_FREE_VALUE:
         return BINDING_VAR_NOT_FREE;
      case OPTIONAL_VAR_FOUND_VALUE:
         return OPTIONAL_VAR_FOUND;
      case REASSIGNED_METHOD_PARAMETER_VALUE:
         return REASSIGNED_METHOD_PARAMETER;
      case MULTIPLE_ATTRIBUTE_ASSIGNMENT_VALUE:
         return MULTIPLE_ATTRIBUTE_ASSIGNMENT;
      case EMPTY_COMPOUND_NODE_VALUE:
         return EMPTY_COMPOUND_NODE;
      case INFINITE_LOOP_VALUE:
         return INFINITE_LOOP;
      case FREE_GREEN_VARIABLE_MARKED_AS_BOUND_VALUE:
         return FREE_GREEN_VARIABLE_MARKED_AS_BOUND;
      case GREEN_VARIABLE_WITH_BINDING_VALUE:
         return GREEN_VARIABLE_WITH_BINDING;
      case THIS_OBJECT_DELETED_VALUE:
         return THIS_OBJECT_DELETED;
      case EMPTY_FOREACH_NODE_VALUE:
         return EMPTY_FOREACH_NODE;
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
   private Errors(int value, String name, String literal)
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

} //Errors
