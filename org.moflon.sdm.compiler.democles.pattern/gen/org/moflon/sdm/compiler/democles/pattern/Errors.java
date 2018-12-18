/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Errors</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getErrors()
 * @model
 * @generated
 */
public enum Errors implements Enumerator {
   /**
    * The '<em><b>MISSING DELEGATE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #MISSING_DELEGATE_VALUE
    * @generated
    * @ordered
    */
   MISSING_DELEGATE(0, "MISSING_DELEGATE", "MISSING_DELEGATE"),

   /**
    * The '<em><b>UNHANDLED EXPRESSION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #UNHANDLED_EXPRESSION_VALUE
    * @generated
    * @ordered
    */
   UNHANDLED_EXPRESSION(1, "UNHANDLED_EXPRESSION", "UNHANDLED_EXPRESSION"),

   /**
    * The '<em><b>MISSING PARAMETER BINDING</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #MISSING_PARAMETER_BINDING_VALUE
    * @generated
    * @ordered
    */
   MISSING_PARAMETER_BINDING(2, "MISSING_PARAMETER_BINDING", "MISSING_PARAMETER_BINDING"),

   /**
    * The '<em><b>INCOMPATIBLE TYPE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #INCOMPATIBLE_TYPE_VALUE
    * @generated
    * @ordered
    */
   INCOMPATIBLE_TYPE(3, "INCOMPATIBLE_TYPE", "INCOMPATIBLE_TYPE");

   /**
    * The '<em><b>MISSING DELEGATE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MISSING DELEGATE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #MISSING_DELEGATE
    * @model
    * @generated
    * @ordered
    */
   public static final int MISSING_DELEGATE_VALUE = 0;

   /**
    * The '<em><b>UNHANDLED EXPRESSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>UNHANDLED EXPRESSION</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #UNHANDLED_EXPRESSION
    * @model
    * @generated
    * @ordered
    */
   public static final int UNHANDLED_EXPRESSION_VALUE = 1;

   /**
    * The '<em><b>MISSING PARAMETER BINDING</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MISSING PARAMETER BINDING</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #MISSING_PARAMETER_BINDING
    * @model
    * @generated
    * @ordered
    */
   public static final int MISSING_PARAMETER_BINDING_VALUE = 2;

   /**
    * The '<em><b>INCOMPATIBLE TYPE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>INCOMPATIBLE TYPE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #INCOMPATIBLE_TYPE
    * @model
    * @generated
    * @ordered
    */
   public static final int INCOMPATIBLE_TYPE_VALUE = 3;

   /**
    * An array of all the '<em><b>Errors</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final Errors[] VALUES_ARRAY = new Errors[] { MISSING_DELEGATE, UNHANDLED_EXPRESSION, MISSING_PARAMETER_BINDING, INCOMPATIBLE_TYPE, };

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
      case MISSING_DELEGATE_VALUE:
         return MISSING_DELEGATE;
      case UNHANDLED_EXPRESSION_VALUE:
         return UNHANDLED_EXPRESSION;
      case MISSING_PARAMETER_BINDING_VALUE:
         return MISSING_PARAMETER_BINDING;
      case INCOMPATIBLE_TYPE_VALUE:
         return INCOMPATIBLE_TYPE;
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
