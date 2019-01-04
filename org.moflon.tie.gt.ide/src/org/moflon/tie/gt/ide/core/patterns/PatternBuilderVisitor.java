package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorApplicationCondition;
import org.emoflon.ibex.gt.editor.gT.EditorApplicationConditionType;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeExpression;
import org.emoflon.ibex.gt.editor.gT.EditorBindingExpression;
import org.emoflon.ibex.gt.editor.gT.EditorCondition;
import org.emoflon.ibex.gt.editor.gT.EditorConditionReference;
import org.emoflon.ibex.gt.editor.gT.EditorEnumExpression;
import org.emoflon.ibex.gt.editor.gT.EditorExpression;
import org.emoflon.ibex.gt.editor.gT.EditorLiteralExpression;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.emoflon.ibex.gt.editor.gT.EditorParameterExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorSimpleCondition;
import org.emoflon.ibex.gt.editor.utils.GTEditorAttributeUtils;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.tie.gt.ide.core.patterns.util.AttributeUtil;
import org.moflon.tie.gt.ide.core.patterns.util.ConstantUtil;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationUtil;
import org.moflon.tie.gt.ide.core.patterns.util.PatternUtil;
import org.moflon.tie.gt.ide.core.patterns.util.RelationalConstraintUtil;
import org.moflon.tie.gt.ide.core.patterns.util.TransformationExceptionUtil;
import org.moflon.tie.gt.ide.core.runtime.utilities.TypeLookup;

public class PatternBuilderVisitor {
	public static final String RESULT_VARIABLE_NAME = "_result";
	private PatternLookup generatedDemoclesPatterns;
	private VariableLookupTable variableLookup;
	private final TypeLookup typeLookup;
	private final MultiStatus transformationStatus;

	public PatternBuilderVisitor(final List<EPackage> ePackages, final ResourceSet resourceSet,
			final MultiStatus transformationStatus) {
		this.transformationStatus = transformationStatus;

		generatedDemoclesPatterns = new PatternLookup();
		variableLookup = new VariableLookupTable();
		typeLookup = new TypeLookup(ePackages);
	}

	public PatternLookup visit(final EditorPattern pattern) {

		pattern.getNodes().forEach(n -> visit(n, pattern));

		pattern.getConditions().forEach(condition -> visit(condition, pattern));

		return generatedDemoclesPatterns;
	}

	Pattern createExpressionPatternForObjectVariables(final CFVariable returnVariable) {
		final Pattern pattern = createAndRegisterPattern(DemoclesPatternType.EXPRESSION_PATTERN);
		final PatternBody body = PatternUtil.getBody(pattern);

		final EMFVariable target = createAndRegisterReturnEmfVariable(returnVariable, pattern);

		final EMFVariable source = registerEmfVariableAndSymbolicParameter(returnVariable,
				DemoclesPatternType.EXPRESSION_PATTERN);

		final Equal equal = RelationalConstraintUtil.createEqualConstraint(source, target);

		body.getConstraints().add(equal);

		return pattern;
	}

	Pattern createExpressionPatternForObjectVariableAttribute(final CFVariable returnVariable,
			final EAttribute attribute) {
		final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
		final Pattern pattern = createAndRegisterPattern(patternType);
		final PatternBody body = PatternUtil.getBody(pattern);

		final EClassifier returnVariableType = returnVariable.getType();
		if (!(returnVariableType instanceof EClass)) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Type of %s should be an EClass, but was %s", returnVariable, returnVariableType.getName());
			return null;
		}

		final EClass returnValueClass = (EClass) returnVariableType;
		if (!returnValueClass.getEAllAttributes().contains(attribute)) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"%s has no EAttribute %s", returnValueClass.getName(), attribute.getName());
			return null;
		}

		final EMFVariable emfReturnVariable = createAndRegisterReturnEmfVariable(attribute, pattern);

		final EMFVariable emfObjectVariable = registerEmfVariableAndSymbolicParameter(returnVariable, patternType);

		final EMFVariable attributeVariable = registerEmfVariableAndAddToLocalVariable(attribute,
				returnVariable.getName(), patternType);

		final Attribute attributeConstraint = AttributeUtil.createAttribute(attribute, emfObjectVariable,
				attributeVariable);
		body.getConstraints().add(attributeConstraint);

		final Equal equal = RelationalConstraintUtil.createEqualConstraint(attributeVariable, emfReturnVariable);
		body.getConstraints().add(equal);

		return pattern;
	}

	Pattern createExpressionPatternForLiteralValues(final CFVariable returnVariable, final String val) {
		final Pattern pattern = createAndRegisterPattern(DemoclesPatternType.EXPRESSION_PATTERN);
		final PatternBody body = PatternUtil.getBody(pattern);

		final Constant source = SpecificationFactory.eINSTANCE.createConstant();
		ConstantUtil.setConstantValueWithAdjustedType(source,
				ConstantUtil.getValueForType(returnVariable.getType(), val));
		body.getConstants().add(source);

		final EMFVariable resultEmfVariable = createAndRegisterReturnEmfVariable(returnVariable, pattern);

		final Equal equal = RelationalConstraintUtil.createEqualConstraint(source, resultEmfVariable);
		body.getConstraints().add(equal);

		return body.getHeader();
	}

	Pattern createExpressionPatternForEnumValues(final CFVariable returnVariable, final EEnumLiteral enumLiteral) {

		final Pattern pattern = createAndRegisterPattern(DemoclesPatternType.EXPRESSION_PATTERN);
		final PatternBody body = PatternUtil.getBody(pattern);

		final EMFVariable resultEmfVariable = createAndRegisterReturnEmfVariable(returnVariable, pattern);

		final Constant source = SpecificationFactory.eINSTANCE.createConstant();
		ConstantUtil.setConstantValueWithAdjustedType(source, enumLiteral);
		body.getConstants().add(source);

		final Equal equal = RelationalConstraintUtil.createEqualConstraint(source, resultEmfVariable);
		body.getConstraints().add(equal);

		return pattern;
	}

	Pattern createExpressionPatternForOperationInvocation(final CFVariable calleeVariable,
			final CFVariable resultCFVariable, final List<CFVariable> parameterCFVariables,
			final EOperation eOperation) {

		final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
		final Pattern pattern = createAndRegisterPattern(patternType);
		final PatternBody body = PatternUtil.getBody(pattern);

		final EMFVariable calleeEmfVariable = registerEmfVariableAndSymbolicParameter(calleeVariable, patternType);

		final Operation operationConstraint = PatternInvocationUtil.createOperationConstraint(eOperation);
		operationConstraint.getParameters().add(PatternUtil.createConstraintParameter(calleeEmfVariable));
//		TODO@rkluge: add mappings for operation invocation parameters
		body.getConstraints().add(operationConstraint);

		final EClassifier returnType = eOperation.getEType();
		if (returnType != null) {
			// Local variable for storing the EOperation result
			final EMFVariable operationResultVariable = variableLookup.getOrCreateEMFVariable("_localVariable0",
					patternType);
			operationResultVariable.setEClassifier(typeLookup.getEClassifier(returnType));
			PatternUtil.getBody(generatedDemoclesPatterns.getPatternForType(patternType)).getLocalVariables()
					.add(operationResultVariable);

			// IMPORTANT: The first constraint parameter is interpreted as return variable
			// (for non-void EOperations)
			operationConstraint.getParameters().add(0, PatternUtil.createConstraintParameter(operationResultVariable));

			final EMFVariable resultEmfVariable = createAndRegisterReturnEmfVariable(resultCFVariable, pattern);

			final Equal equal = RelationalConstraintUtil.createEqualConstraint(operationResultVariable,
					resultEmfVariable);
			body.getConstraints().add(equal);
		}

		return pattern;
	}

	private void visit(final EditorNode node, final EditorPattern editorPattern) {
		final List<DemoclesPatternType> patternTypes = PatternUtil.mapOperatorToPatternTypes(node,
				transformationStatus);
		if (patternTypes == null) {
			return;
		}

		for (final DemoclesPatternType type : patternTypes) {
			if (!generatedDemoclesPatterns.hasPatternForType(type)) {
				createPattern(editorPattern, type);
			}

			registerEmfVariableAndSymbolicParameter(node, type);
		}
		node.getAttributes().forEach(attribute -> visit(attribute, node, editorPattern));
		node.getReferences().forEach(reference -> visit(reference, node, editorPattern));

		if (node.getBinding() != null) {
			final EditorBindingExpression binding = node.getBinding();
			final EditorNode source = binding.getNode();
			createBindingPattern(node, source);
			createBindingAndBlackPattern(node, source);
		}
	}

	private void visit(final EditorCondition condition, final EditorPattern pattern) {
		final EList<EditorSimpleCondition> conditions = condition.getConditions();
		for (final EditorSimpleCondition partialCondition : conditions) {
			if (partialCondition instanceof EditorConditionReference) {
				final EditorConditionReference simpleCond = (EditorConditionReference) partialCondition;
				visit(simpleCond.getCondition(), pattern);
			} else {
				final EditorApplicationCondition simpleCond = (EditorApplicationCondition) partialCondition;
				final EditorPattern applicationCondition = simpleCond.getPattern();
				final EditorApplicationConditionType type = simpleCond.getType();
				final Pattern invokedPattern = buildApplicationConditionPattern(applicationCondition);
				createPatternInvocation(type, invokedPattern);
			}
		}
	}

	private void visit(final EditorAttribute editorAttribute, final EditorNode source, final EditorPattern pattern) {
		final DemoclesPatternType type = PatternUtil.getPatternTypeForOperator(editorAttribute);

		if (!generatedDemoclesPatterns.hasPatternForType(type)) {
			createPattern(pattern, type);
		}
		final PatternBody body = PatternUtil.getBody(generatedDemoclesPatterns.getPatternForType(type));

		final EditorExpression expr = editorAttribute.getValue();
		final ConstraintVariable rhsVariable;
		if (expr instanceof EditorAttributeExpression) {
			rhsVariable = createConstraintParameterForAttributeExpression(type, body, (EditorAttributeExpression) expr);
		} else if (expr instanceof EditorLiteralExpression) {
			rhsVariable = createConstraintParameterForLiteralConstant(editorAttribute, body, source,
					(EditorLiteralExpression) expr);
		} else if (expr instanceof EditorEnumExpression) {
			rhsVariable = createConstraintParameterForEnumConstant(body, (EditorEnumExpression) expr);
		} else if (expr instanceof EditorParameterExpression) {
			rhsVariable = createConstraintParameterForParameterExpression(type, (EditorParameterExpression) expr);
		} else {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus, "Cannot handle %s",
					expr);
			return;
		}
		final ConstraintParameter rhs = PatternUtil.createConstraintParameter(rhsVariable);

		final EAttribute editorAttributeEAttribute = editorAttribute.getAttribute();

		final EMFVariable fromVariable = registerEmfVariableAndSymbolicParameter(source, type);
		final ConstraintParameter from = PatternUtil.createConstraintParameter(fromVariable);

		final EMFVariable tmpAttValVariable = registerEmfVariableAndAddToLocalVariable(editorAttributeEAttribute,
				source, type);
		final ConstraintParameter tmpAttrVal = PatternUtil.createConstraintParameter(tmpAttValVariable);

		final Attribute emfAttribute = AttributeUtil.createAttribute(editorAttributeEAttribute, from, tmpAttrVal);

		final Optional<Attribute> existingConstraint = AttributeUtil.findAttributeConstraintInPatternBody(emfAttribute,
				body);
		if (!existingConstraint.isPresent()) {
			body.getConstraints().add(emfAttribute);
		}

		final ConstraintParameter leftOperatorArgumentParameter = PatternUtil.createConstraintParameter(
				registerEmfVariableAndAddToLocalVariable(editorAttributeEAttribute, source, type));

		final RelationalConstraint relationalConstraint = RelationalConstraintUtil
				.createRelationalConstraint(editorAttribute, transformationStatus);
		if (relationalConstraint == null)
			return;

		relationalConstraint.getParameters().add(leftOperatorArgumentParameter);
		relationalConstraint.getParameters().add(rhs);
		body.getConstraints().add(relationalConstraint);
	}

	private void visit(final EditorReference editorReference, final EditorNode source,
			final EditorPattern editorPattern) {
		final List<DemoclesPatternType> patternTypes = PatternUtil.mapOperatorToPatternTypes(editorReference,
				transformationStatus);
		if (patternTypes == null)
			return;

		for (final DemoclesPatternType type : patternTypes) {
			if (!generatedDemoclesPatterns.hasPatternForType(type)) {
				createPattern(editorPattern, type);
			}
			final PatternBody patternBody = generatedDemoclesPatterns.getPatternForType(type).getBodies().get(0);

			final EMFVariable fromVariable = registerEmfVariableAndSymbolicParameter(source, type);

			final ConstraintParameter from = PatternUtil.createConstraintParameter(fromVariable);

			final EditorNode editorReferenceTarget = editorReference.getTarget();
			final EMFVariable toVariable = registerEmfVariableAndSymbolicParameter(editorReferenceTarget, type);
			final ConstraintParameter to = PatternUtil.createConstraintParameter(toVariable);

			final Reference referenceConstraint = EMFTypeFactory.eINSTANCE.createReference();
			final EReference referenceType = typeLookup.getEReference(editorReference.getType(), source.getType());
			referenceConstraint.setEModelElement(referenceType);
			referenceConstraint.getParameters().add(from);
			referenceConstraint.getParameters().add(to);
			patternBody.getConstraints().add(referenceConstraint);
		}
	}

	private Pattern buildApplicationConditionPattern(final EditorPattern applicationCondition) {

		// Store the current state to restore it after constraint has been processed
		final PatternLookup patternCache = generatedDemoclesPatterns;
		generatedDemoclesPatterns = new PatternLookup();

		final VariableLookupTable variableCache = variableLookup;
		variableLookup = new VariableLookupTable();

		visit(applicationCondition);
		final Pattern newInvokedPattern = getBlackPattern();

		// Restore lookup tables
		generatedDemoclesPatterns = patternCache;
		variableLookup = variableCache;
		return newInvokedPattern;
	}

	private void createPatternInvocation(final EditorApplicationConditionType type, final Pattern newInvokedPattern) {
		final PatternInvocationConstraint invocationConstraint = SpecificationFactory.eINSTANCE
				.createPatternInvocationConstraint();
		final EList<Variable> symbolicParamsInvoker = getBlackPattern().getSymbolicParameters();
		invocationConstraint.setPositive(type == EditorApplicationConditionType.POSITIVE ? true : false);
		invocationConstraint.setInvokedPattern(newInvokedPattern);
		createConstraintParameters(newInvokedPattern, invocationConstraint, symbolicParamsInvoker);
		getBlackPattern().getBodies().get(0).getConstraints().add(invocationConstraint);
	}

	private void createConstraintParameters(final Pattern invokedPattern,
			final PatternInvocationConstraint invocationConstraintNegative,
			final EList<Variable> symbolicParamsInvoker) {
		final List<Variable> symbolicParametersToMove = new ArrayList<Variable>();
		invokedPattern.getSymbolicParameters().forEach(symbolicParam -> {
			final Optional<Variable> match = symbolicParamsInvoker.stream().filter(candidate -> {
				return candidate.getName().equals(symbolicParam.getName());
			}).findAny();
			ConstraintParameter constraintParameter = null;
			if (match.isPresent()) {
				// TODO:insert casting here
				if (symbolicParam instanceof EMFVariable) {
					final EMFVariable symParamEMF = (EMFVariable) symbolicParam;
					if (match.get() instanceof EMFVariable) {
						final EMFVariable varOnInvokerSide = (EMFVariable) match.get();
						if (varOnInvokerSide.getEClassifier() instanceof EClass
								&& symParamEMF.getEClassifier() instanceof EClass) {
							final EClass invokerSideEClass = (EClass) varOnInvokerSide.getEClassifier();
							final EClass invokeSideEClass = (EClass) symParamEMF.getEClassifier();
							if (invokeSideEClass.getEAllSuperTypes().contains(invokerSideEClass)) {
								// Create temporary EMFVariable for casting
								final EMFVariable superTypeVariable = variableLookup.getOrCreateEMFVariable(
										"casted" + symParamEMF.getName(), DemoclesPatternType.BLACK_PATTERN);
								superTypeVariable.setEClassifier(invokerSideEClass);
								final PatternBody patternBody = PatternUtil.getBody(invokedPattern);

								invokedPattern.getSymbolicParameters().remove(symParamEMF);
								patternBody.getLocalVariables().add(symParamEMF);
								invokedPattern.getSymbolicParameters().add(superTypeVariable);

								final Equal equalConstraint = RelationalConstraintUtil
										.createEqualConstraint(superTypeVariable, symbolicParam);
								patternBody.getConstraints().add(equalConstraint);
								constraintParameter = PatternUtil.createConstraintParameter(superTypeVariable);
							}
						}
					}
				}
				if (constraintParameter == null) {
					constraintParameter = PatternUtil.createConstraintParameter(match.get());
				}
				invocationConstraintNegative.getParameters().add(constraintParameter);
			} else {
				symbolicParametersToMove.add(symbolicParam);
			}

		});
		symbolicParametersToMove.forEach(
				symbolicParam -> PatternUtil.moveSymbolicParameterToLocalVariable(symbolicParam, invokedPattern));
	}

	private void createPattern(final EditorPattern pattern, final DemoclesPatternType patternType) {
		final Pattern democlesPattern = SpecificationFactory.eINSTANCE.createPattern();
		generatedDemoclesPatterns.registerPattern(patternType, democlesPattern);
		final PatternBody body = SpecificationFactory.eINSTANCE.createPatternBody();
		body.setHeader(democlesPattern);
		pattern.getParameters().forEach(param -> createEMFVariableFromEditorParameter(param, patternType));
	}

	private void createEMFVariableFromEditorParameter(final EditorParameter param, final DemoclesPatternType type) {
		switch (type) {
		case RED_PATTERN:
			return;
		default:
			registerEmfVariableAndSymbolicParameter(param, type);
		}
	}

	private void createBindingAndBlackPattern(final EditorNode node, final EditorNode source) {

		final DemoclesPatternType patternType = DemoclesPatternType.BINDING_AND_BLACK_PATTERN;
		final Pattern bindingAndBlack = createAndRegisterPattern(patternType);
		final PatternBody body = PatternUtil.getBody(bindingAndBlack);

		final EMFVariable emfVarTarget = variableLookup.getOrCreateEMFVariable(node, patternType);
		emfVarTarget.setEClassifier(node.getType());

		final EMFVariable emfVarSource = variableLookup.getOrCreateEMFVariable(source, patternType);
		emfVarSource.setEClassifier(source.getType());
		bindingAndBlack.getSymbolicParameters().add(emfVarSource);

		final EMFVariable toBeRemoved = variableLookup.getOrCreateEMFVariable(source,
				DemoclesPatternType.BLACK_PATTERN);
		getBlackPattern().getSymbolicParameters().remove(toBeRemoved);
		generatedDemoclesPatterns.registerPattern(patternType, bindingAndBlack);
		body.setHeader(bindingAndBlack);
		body.getLocalVariables().add(emfVarTarget);

		final ConstraintParameter sourceConstr = PatternUtil.createConstraintParameter(emfVarSource);

		final ConstraintParameter targetConstr = PatternUtil.createConstraintParameter(emfVarTarget);

		final PatternInvocationConstraint bindingConstraint = SpecificationFactory.eINSTANCE
				.createPatternInvocationConstraint();
		bindingConstraint.setPositive(true);
		bindingConstraint.setInvokedPattern(getBindingPattern());
		bindingConstraint.getParameters().add(targetConstr);
		bindingConstraint.getParameters().add(sourceConstr);

		final ConstraintParameter singleTargetConstr = PatternUtil.createConstraintParameter(emfVarTarget);

		final PatternInvocationConstraint singleConstraint = SpecificationFactory.eINSTANCE
				.createPatternInvocationConstraint();
		singleConstraint.setPositive(true);
		singleConstraint.setInvokedPattern(getBlackPattern());
		singleConstraint.getParameters().add(singleTargetConstr);

		body.getConstraints().add(bindingConstraint);
		body.getConstraints().add(singleConstraint);
	}

	private void createBindingPattern(final EditorNode node, final EditorNode source) {
		final Pattern binding = createAndRegisterPattern(DemoclesPatternType.BINDING_PATTERN);
		final PatternBody body = PatternUtil.getBody(binding);

		final EMFVariable emfVarTarget = variableLookup.getOrCreateEMFVariable(node,
				DemoclesPatternType.BINDING_PATTERN);
		emfVarTarget.setEClassifier(node.getType());

		final EMFVariable emfVarSource = variableLookup.getOrCreateEMFVariable(source,
				DemoclesPatternType.BINDING_PATTERN);
		emfVarSource.setEClassifier(source.getType());

		binding.getSymbolicParameters().add(emfVarTarget);
		binding.getSymbolicParameters().add(emfVarSource);
		body.setHeader(binding);

		final Equal equalConstr = RelationalConstraintUtil.createEqualConstraint(emfVarSource, emfVarTarget);

		body.getConstraints().add(equalConstr);
	}

	private EMFVariable createConstraintParameterForAttributeExpression(final DemoclesPatternType type,
			final PatternBody patternBody, final EditorAttributeExpression attributeExpr) {
		final EAttribute eAttribute = attributeExpr.getAttribute();
		final EditorNode editorNode = attributeExpr.getNode();

		final EMFVariable fromVarAttributeExpression = registerEmfVariableAndSymbolicParameter(editorNode, type);
		final EMFVariable attribute = registerEmfVariableAndAddToLocalVariable(eAttribute, editorNode, type);

		final Attribute attributeReference = AttributeUtil.createAttribute(eAttribute, fromVarAttributeExpression,
				attribute);

		final Optional<Attribute> existingConstraint = AttributeUtil
				.findAttributeConstraintInPatternBody(attributeReference, patternBody);
		if (!existingConstraint.isPresent()) {
			patternBody.getConstraints().add(attributeReference);
		}

		return attribute;
	}

	private EMFVariable createConstraintParameterForParameterExpression(final DemoclesPatternType type,
			final EditorParameterExpression eParamExpression) {
		final EditorParameter parameter = eParamExpression.getParameter();
		final EMFVariable newReference = variableLookup.get(parameter, type);
		return newReference;
	}

	private Constant createConstraintParameterForLiteralConstant(final EditorAttribute editorAttribute,
			final PatternBody patternBody, final EditorNode source, final EditorLiteralExpression literalExpression) {
		final Constant constant = SpecificationFactory.eINSTANCE.createConstant();
		final EClass eClass = typeLookup.getEClassifier(source.getType());
		final EAttribute eAttribute = typeLookup.getEAttribute(editorAttribute.getAttribute(), eClass);
		final Optional<Object> value = GTEditorAttributeUtils
				.convertLiteralValueToObject(eAttribute.getEAttributeType(), literalExpression);
		if (value.isPresent()) {
			final Object valueObject = value.get();
			ConstantUtil.setConstantValueWithAdjustedType(constant, valueObject);
		} else {
			constant.setValue(literalExpression.getValue());
		}

		patternBody.getConstants().add(constant);
		return constant;
	}

	private Constant createConstraintParameterForEnumConstant(final PatternBody patternBody,
			final EditorEnumExpression eEnumExpression) {
		final EEnumLiteral literal = eEnumExpression.getLiteral();
		final Constant enumLiteralConstant = SpecificationFactory.eINSTANCE.createConstant();
		enumLiteralConstant.setValue(literal);
		patternBody.getConstants().add(enumLiteralConstant);
		return enumLiteralConstant;
	}

	private EMFVariable registerEmfVariableAndSymbolicParameter(final EObject object,
			final DemoclesPatternType patternType) {
		if (!variableLookup.containsKey(object, patternType)) {
			final EMFVariable variable = variableLookup.getOrCreateEMFVariable(object, patternType);

			final EClassifier type = determineTypeOfEditorElement(object);

			variable.setEClassifier(typeLookup.getEClassifier(type));
			generatedDemoclesPatterns.getPatternForType(patternType).getSymbolicParameters().add(variable);
			return variable;
		} else {
			return variableLookup.get(object, patternType);
		}
	}

	private EMFVariable registerEmfVariableAndAddToLocalVariable(final EAttribute eAttribute, final Object parent,
			final DemoclesPatternType patternType) {
		if (!variableLookup.containsKey(eAttribute, parent, patternType)) {
			final EMFVariable newAttribute = variableLookup.getOrCreateEMFVariable(eAttribute, parent, patternType);
			newAttribute.setEClassifier(typeLookup.getEClassifier(eAttribute.getEType()));
			PatternUtil.getBody(generatedDemoclesPatterns.getPatternForType(patternType)).getLocalVariables()
					.add(newAttribute);
			return newAttribute;
		} else {
			return variableLookup.get(eAttribute, parent, patternType);
		}
	}

	private EClassifier determineTypeOfEditorElement(final EObject editorElement) {
		if (editorElement instanceof EditorParameter) {
			final EditorParameter editorParameter = (EditorParameter) editorElement;
			return editorParameter.getType();
		} else if (editorElement instanceof EditorNode) {
			final EditorNode node = (EditorNode) editorElement;
			return node.getType();
		} else if (editorElement instanceof CFVariable) {
			final CFVariable variable = (CFVariable) editorElement;
			return variable.getType();
		} else if (editorElement instanceof EAttribute) {
			final EAttribute attribute = (EAttribute) editorElement;
			return attribute.getEType();
		}

		throw new IllegalArgumentException(String.format("Object has unsupported type: '%s'", editorElement));
	}

	private EMFVariable createAndRegisterReturnEmfVariable(final EObject returnVariable, final Pattern pattern) {
		final EMFVariable returnEmfVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
		returnEmfVariable.setName(RESULT_VARIABLE_NAME);
		returnEmfVariable.setEClassifier(typeLookup.getEClassifier(determineTypeOfEditorElement(returnVariable)));
		pattern.getSymbolicParameters().add(0, returnEmfVariable);

		return returnEmfVariable;
	}

	private Pattern getBlackPattern() {
		return generatedDemoclesPatterns.getBlackPattern();
	}

	private Pattern getBindingPattern() {
		return generatedDemoclesPatterns.getBindingPattern();
	}

	private Pattern createAndRegisterPattern(final DemoclesPatternType patternType) {
		final Pattern pattern = PatternUtil.createEmptyPattern();
		generatedDemoclesPatterns.registerPattern(patternType, pattern);
		return pattern;
	}
}
