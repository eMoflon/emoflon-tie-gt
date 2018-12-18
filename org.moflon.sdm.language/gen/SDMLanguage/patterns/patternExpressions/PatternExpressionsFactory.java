/**
 */
package SDMLanguage.patterns.patternExpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage
 * @generated
 */
public interface PatternExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternExpressionsFactory eINSTANCE = SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Attribute Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Expression</em>'.
	 * @generated
	 */
	AttributeValueExpression createAttributeValueExpression();

	/**
	 * Returns a new object of class '<em>Object Variable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Variable Expression</em>'.
	 * @generated
	 */
	ObjectVariableExpression createObjectVariableExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternExpressionsPackage getPatternExpressionsPackage();

} //PatternExpressionsFactory
