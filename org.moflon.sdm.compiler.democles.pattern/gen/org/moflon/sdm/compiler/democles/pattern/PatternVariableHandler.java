/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.patterns.ObjectVariable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getPatternVariableHandler()
 * @model
 * @generated
 */
public interface PatternVariableHandler extends EObject
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   String concat(String first, String second);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Variable getAttributeVariable(ObjectVariable attributeOwner, EAttribute eAttribute, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Variable lookupVariableInPattern(Pattern pattern, String variableName, EClassifier variableType);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // PatternVariableHandler
