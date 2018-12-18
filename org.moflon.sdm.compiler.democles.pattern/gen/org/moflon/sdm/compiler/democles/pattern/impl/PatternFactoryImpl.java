/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.sdm.compiler.democles.pattern.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static PatternFactory init()
   {
      try
      {
         PatternFactory thePatternFactory = (PatternFactory) EPackage.Registry.INSTANCE.getEFactory(PatternPackage.eNS_URI);
         if (thePatternFactory != null)
         {
            return thePatternFactory;
         }
      } catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new PatternFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
      case PatternPackage.GREEN_PATTERN_TRANSFORMER:
         return createGreenPatternTransformer();
      case PatternPackage.PATTERN_VARIABLE_HANDLER:
         return createPatternVariableHandler();
      case PatternPackage.BLACK_AND_NAC_PATTERN_TRANSFORMER:
         return createBlackAndNacPatternTransformer();
      case PatternPackage.NAC_PATTERN_TRANSFORMER:
         return createNacPatternTransformer();
      case PatternPackage.BINDING_PATTERN_TRANSFORMER:
         return createBindingPatternTransformer();
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER:
         return createDefaultExpressionTransformer();
      case PatternPackage.PATTERN_TRANSFORMER:
         return createPatternTransformer();
      case PatternPackage.RED_PATTERN_TRANSFORMER:
         return createRedPatternTransformer();
      case PatternPackage.LITERAL_EXPRESSION_TRANSFORMER:
         return createLiteralExpressionTransformer();
      default:
         throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
      case PatternPackage.ERRORS:
         return createErrorsFromString(eDataType, initialValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
      case PatternPackage.ERRORS:
         return convertErrorsToString(eDataType, instanceValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GreenPatternTransformer createGreenPatternTransformer()
   {
      GreenPatternTransformerImpl greenPatternTransformer = new GreenPatternTransformerImpl();
      return greenPatternTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternVariableHandler createPatternVariableHandler()
   {
      PatternVariableHandlerImpl patternVariableHandler = new PatternVariableHandlerImpl();
      return patternVariableHandler;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BlackAndNacPatternTransformer createBlackAndNacPatternTransformer()
   {
      BlackAndNacPatternTransformerImpl blackAndNacPatternTransformer = new BlackAndNacPatternTransformerImpl();
      return blackAndNacPatternTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NacPatternTransformer createNacPatternTransformer()
   {
      NacPatternTransformerImpl nacPatternTransformer = new NacPatternTransformerImpl();
      return nacPatternTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingPatternTransformer createBindingPatternTransformer()
   {
      BindingPatternTransformerImpl bindingPatternTransformer = new BindingPatternTransformerImpl();
      return bindingPatternTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DefaultExpressionTransformer createDefaultExpressionTransformer()
   {
      DefaultExpressionTransformerImpl defaultExpressionTransformer = new DefaultExpressionTransformerImpl();
      return defaultExpressionTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternTransformer createPatternTransformer()
   {
      PatternTransformerImpl patternTransformer = new PatternTransformerImpl();
      return patternTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RedPatternTransformer createRedPatternTransformer()
   {
      RedPatternTransformerImpl redPatternTransformer = new RedPatternTransformerImpl();
      return redPatternTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public LiteralExpressionTransformer createLiteralExpressionTransformer()
   {
      LiteralExpressionTransformerImpl literalExpressionTransformer = new LiteralExpressionTransformerImpl();
      return literalExpressionTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Errors createErrorsFromString(EDataType eDataType, String initialValue)
   {
      Errors result = Errors.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertErrorsToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternPackage getPatternPackage()
   {
      return (PatternPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static PatternPackage getPackage()
   {
      return PatternPackage.eINSTANCE;
   }

} //PatternFactoryImpl
