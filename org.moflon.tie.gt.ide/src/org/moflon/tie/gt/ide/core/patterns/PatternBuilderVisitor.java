package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.tie.gt.ide.core.patterns.util.AttributeUtil;
import org.moflon.tie.gt.ide.core.patterns.util.ConstantUtil;
import org.moflon.tie.gt.ide.core.patterns.util.PatternUtil;
import org.moflon.tie.gt.ide.core.patterns.util.RelationalConstraintUtil;
import org.moflon.tie.gt.ide.core.runtime.utilities.ContextController;

public class PatternBuilderVisitor {
	private final RelationalConstraintFactory relationalConstraintsHelper = RelationalConstraintFactory.eINSTANCE;
	private final EMFTypeFactory emfHelper = EMFTypeFactory.eINSTANCE;
	private final SpecificationFactory patternFactoty = SpecificationFactory.eINSTANCE;
	private Map<PatternType, Pattern> generatedDemoclesPatterns;
	private VariableLookupTable variableLookup;
	private final ContextController contextController;

	public PatternBuilderVisitor(final EPackage contextEPackage, final ResourceSet resourceSet) {
		this(Arrays.asList(contextEPackage), resourceSet);
	}

	public PatternBuilderVisitor(final List<EPackage> contextEPackages, final ResourceSet resourceSet) {
		this.generatedDemoclesPatterns = new HashMap<>();
		this.variableLookup = new VariableLookupTable();
		this.contextController = new ContextController();
		this.contextController.setEPackages(contextEPackages);
		this.contextController.setResourceSet(resourceSet);
	}

	public Map<PatternType, Pattern> visit(final EditorPattern pattern, final MultiStatus transformationStatus) {
		pattern.getNodes().forEach(n -> visit(n, pattern, transformationStatus));
		pattern.getConditions().forEach(condition -> visit(condition, pattern, transformationStatus));
		return generatedDemoclesPatterns;
	}

	private void visit(final EditorNode node, final EditorPattern editorPattern,
			final MultiStatus transformationStatus) {
		final List<PatternType> patternTypes = PatternUtil.mapOperatorToPatternTypes(node, transformationStatus);
		if (patternTypes == null) {
			return;
		}

		for (final PatternType type : patternTypes) {
			if (!this.generatedDemoclesPatterns.containsKey(type)) {
				createPattern(editorPattern, type);
			}

			registerEmfVariableAndSymbolicParameter(node, type);
		}
		node.getAttributes().forEach(attribute -> visit(attribute, node, editorPattern, transformationStatus));
		node.getReferences().forEach(reference -> visit(reference, node, editorPattern, transformationStatus));
		if (node.getBinding() != null) {
			final EditorBindingExpression binding = node.getBinding();
			final EditorNode source = binding.getNode();
			createBindingPattern(node, source);
			createBindingAndBlackPattern(node, source);
		}
	}

	private void visit(final EditorCondition condition, final EditorPattern pattern,
			final MultiStatus transformationStatus) {
		final EList<EditorSimpleCondition> conditions = condition.getConditions();
		for (final EditorSimpleCondition partialCondition : conditions) {
			if (partialCondition instanceof EditorConditionReference) {
				final EditorConditionReference simpleCond = (EditorConditionReference) partialCondition;
				visit(simpleCond.getCondition(), pattern, transformationStatus);
			} else {
				final EditorApplicationCondition simpleCond = (EditorApplicationCondition) partialCondition;
				final EditorPattern applicationCondition = simpleCond.getPattern();
				final EditorApplicationConditionType type = simpleCond.getType();
				final Pattern invokedPattern = buildApplicationConditionPattern(applicationCondition,
						transformationStatus);
				createPatternInvocation(type, invokedPattern);
			}
		}
	}

	private void visit(final EditorAttribute editorAttribute, final EditorNode source, final EditorPattern pattern,
			final MultiStatus transformationStatus) {
		final PatternType type = getPatternTypeForOperator(editorAttribute);

		if (!this.generatedDemoclesPatterns.containsKey(type)) {
			createPattern(pattern, type);
		}
		final PatternBody body = PatternUtil.getBody(getPatternByType(type));

		final ConstraintParameter rhs = patternFactoty.createConstraintParameter();
		final EditorExpression expr = editorAttribute.getValue();
		if (expr instanceof EditorAttributeExpression) {
			bindConstraintParameterForAttributeExpression(type, body, rhs, (EditorAttributeExpression) expr);
		} else if (expr instanceof EditorLiteralExpression) {
			bindConstraintParameterForLiteralConstant(editorAttribute, body, source, rhs,
					(EditorLiteralExpression) expr);
		} else if (expr instanceof EditorEnumExpression) {
			bindConstraintParameterForEnumConstant(body, rhs, (EditorEnumExpression) expr);
		} else if (expr instanceof EditorParameterExpression) {
			bindConstraintParameterForParameterExpression(type, rhs, (EditorParameterExpression) expr);
		}

		final Attribute emfAttribute = AttributeUtil.createAttribute();
		final EAttribute editorAttributeEAttribute = editorAttribute.getAttribute();
		emfAttribute.setEModelElement(editorAttributeEAttribute);

		final ConstraintParameter from = patternFactoty.createConstraintParameter();
		registerEmfVariableAndSymbolicParameter(source, type);
		from.setReference(variableLookup.lookup(source, type));
		emfAttribute.getParameters().add(from);

		final ConstraintParameter tmpAttrVal = patternFactoty.createConstraintParameter();
		if (!variableLookup.containsKey(editorAttributeEAttribute, source, type)) {
			final EMFVariable tmpAttrVar = variableLookup.getOrCreateEMFVariable(editorAttributeEAttribute, source,
					type);
			body.getLocalVariables().add(tmpAttrVar);
			tmpAttrVar.setEClassifier(
					contextController.getEClassifier(editorAttributeEAttribute.getEType()));
		}

		tmpAttrVal.setReference(variableLookup.get(editorAttributeEAttribute, source, type));

		emfAttribute.getParameters().add(tmpAttrVal);

		final Optional<Attribute> existingConstraint = AttributeUtil.findAttributeConstraintInPatternBody(emfAttribute,
				body);
		if (!existingConstraint.isPresent()) {
			body.getConstraints().add(emfAttribute);
		}

		final ConstraintParameter leftOperatorArgumentParameter = patternFactoty.createConstraintParameter();
		leftOperatorArgumentParameter.setReference(variableLookup.get(editorAttributeEAttribute, source, type));

		final RelationalConstraint relationalConstraint = RelationalConstraintUtil
				.createRelationalConstraint(editorAttribute, transformationStatus);
		if (relationalConstraint == null)
			return;

		relationalConstraint.getParameters().add(leftOperatorArgumentParameter);
		relationalConstraint.getParameters().add(rhs);
		body.getConstraints().add(relationalConstraint);
	}

	private PatternType getPatternTypeForOperator(final EditorAttribute editorAttribute) {
		switch (editorAttribute.getRelation()) {
		case ASSIGNMENT:
			return PatternType.GREEN_PATTERN;
		default:
			return PatternType.BLACK_PATTERN;
		}
	}

	private void bindConstraintParameterForAttributeExpression(final PatternType type, final PatternBody patternBody,
			final ConstraintParameter rightOperatorArgumentParameter, final EditorAttributeExpression attributeExpr) {
		final EAttribute eAttribute = attributeExpr.getAttribute();
		final EditorNode editorNode = attributeExpr.getNode();

		// Create LHS variable ('from')
		final ConstraintParameter fromNodeOfAttributeExpression = patternFactoty.createConstraintParameter();
		registerEmfVariableAndSymbolicParameter(editorNode, type);
		fromNodeOfAttributeExpression.setReference(variableLookup.get(editorNode, type));

		final Attribute attributeReference = AttributeUtil.createAttribute();
		attributeReference.setEModelElement(eAttribute);
		registerEmfVariableAndAddToLocalVariable(eAttribute, editorNode, type);
		final EMFVariable attribute = variableLookup.get(eAttribute, editorNode, type);

		final ConstraintParameter toAttribute = patternFactoty.createConstraintParameter();
		toAttribute.setReference(attribute);

		attributeReference.getParameters().add(fromNodeOfAttributeExpression);
		attributeReference.getParameters().add(toAttribute);

		final Optional<Attribute> existingConstraint = AttributeUtil
				.findAttributeConstraintInPatternBody(attributeReference, patternBody);
		if (!existingConstraint.isPresent()) {
			patternBody.getConstraints().add(attributeReference);
		}

		rightOperatorArgumentParameter.setReference(attribute);
	}

	private void bindConstraintParameterForParameterExpression(final PatternType type,
			final ConstraintParameter constraintParameter, final EditorParameterExpression eParamExpression) {
		final EditorParameter parameter = eParamExpression.getParameter();
		final EMFVariable newReference = variableLookup.get(parameter, type);
		constraintParameter.setReference(newReference);
	}

	private void visit(final EditorReference editorReference, final EditorNode source,
			final EditorPattern editorPattern, final MultiStatus transformationStatus) {
		final List<PatternType> patternTypes = PatternUtil.mapOperatorToPatternTypes(editorReference,
				transformationStatus);
		if (patternTypes == null)
			return;

		for (final PatternType type : patternTypes) {
			if (!this.generatedDemoclesPatterns.containsKey(type)) {
				createPattern(editorPattern, type);
			}
			final PatternBody patternBody = getPatternByType(type).getBodies().get(0);

			final ConstraintParameter from = patternFactoty.createConstraintParameter();
			registerEmfVariableAndSymbolicParameter(source, type);

			from.setReference(variableLookup.get(source, type));

			final ConstraintParameter to = patternFactoty.createConstraintParameter();
			final EditorNode editorReferenceTarget = editorReference.getTarget();
			registerEmfVariableAndSymbolicParameter(editorReferenceTarget, type);
			to.setReference(variableLookup.get(editorReferenceTarget, type));

			final Reference referenceConstraint = emfHelper.createReference();
			referenceConstraint.setEModelElement(
					this.contextController.getEReference(editorReference.getType(), source.getType()));
			referenceConstraint.getParameters().add(from);
			referenceConstraint.getParameters().add(to);
			patternBody.getConstraints().add(referenceConstraint);
		}
	}

	private Pattern buildApplicationConditionPattern(final EditorPattern applicationCondition,
			final MultiStatus transformationStatus) {

		// Store the current state to restore it after constraint has been processed
		final Map<PatternType, Pattern> patternCache = this.generatedDemoclesPatterns;
		this.generatedDemoclesPatterns = new HashMap<PatternType, Pattern>();

		final VariableLookupTable variableCache = this.variableLookup;
		this.variableLookup = new VariableLookupTable();

		visit(applicationCondition, transformationStatus);
		final Pattern newInvokedPattern = getBlackPattern();

		// Restore lookup tables
		this.generatedDemoclesPatterns = patternCache;
		this.variableLookup = variableCache;
		return newInvokedPattern;
	}

	private void createPatternInvocation(final EditorApplicationConditionType type, final Pattern newInvokedPattern) {
		final PatternInvocationConstraint invocationConstraint = patternFactoty.createPatternInvocationConstraint();
		final EList<Variable> symbolicParamsInvoker = getBlackPattern().getSymbolicParameters();
		invocationConstraint.setPositive(type == EditorApplicationConditionType.POSITIVE ? true : false);
		invocationConstraint.setInvokedPattern(newInvokedPattern);
		createConstraintParameters(newInvokedPattern, invocationConstraint, symbolicParamsInvoker);
		getBlackPattern().getBodies().get(0).getConstraints().add(invocationConstraint);
	}

	private void createConstraintParameters(final Pattern newInvokedPattern,
			final PatternInvocationConstraint invocationConstraintNegative,
			final EList<Variable> symbolicParamsInvoker) {
		final List<Variable> symbolicParametersToMove = new ArrayList<Variable>();
		newInvokedPattern.getSymbolicParameters().forEach(symbolicParam -> {
			final Optional<Variable> match = symbolicParamsInvoker.stream().filter(candidate -> {
				return candidate.getName().equals(symbolicParam.getName());
			}).findAny();
			if (match.isPresent()) {
				final ConstraintParameter constraintParameter = patternFactoty.createConstraintParameter();
				constraintParameter.setReference(match.get());
				invocationConstraintNegative.getParameters().add(constraintParameter);
			} else {
				symbolicParametersToMove.add(symbolicParam);
			}

		});
		symbolicParametersToMove
				.forEach(symbolicParam -> moveSymbolicParameterToLocalVariable(symbolicParam, newInvokedPattern));
	}

	private void moveSymbolicParameterToLocalVariable(final Variable symbolicParam, final Pattern newInvokedPattern) {
		newInvokedPattern.getSymbolicParameters().remove(symbolicParam);
		newInvokedPattern.getBodies().get(0).getLocalVariables().add(symbolicParam);
	}

	private void createPattern(final EditorPattern pattern, final PatternType patternType) {
		final Pattern democlesPattern = patternFactoty.createPattern();
		registerPattern(democlesPattern, patternType);
		final PatternBody body = patternFactoty.createPatternBody();
		body.setHeader(democlesPattern);
		pattern.getParameters().forEach(param -> createEMFVariableFromEditorParameter(param, patternType));
	}

	private void createEMFVariableFromEditorParameter(final EditorParameter param, final PatternType type) {
		switch (type) {
		case RED_PATTERN:
			return;
		default:
			registerEmfVariableAndSymbolicParameter(param, type);
		}
	}

	private void createBindingAndBlackPattern(final EditorNode node, final EditorNode source) {

		final Pattern bindingAndBlack = PatternUtil.createEmptyPattern();
		final PatternBody body = PatternUtil.getBody(bindingAndBlack);

		this.generatedDemoclesPatterns.put(PatternType.BINDING_AND_BLACK_PATTERN, bindingAndBlack);

		final EMFVariable emfVarTarget = variableLookup.getOrCreateEMFVariable(node,
				PatternType.BINDING_AND_BLACK_PATTERN);
		emfVarTarget.setEClassifier(node.getType());

		final EMFVariable emfVarSource = variableLookup.getOrCreateEMFVariable(source,
				PatternType.BINDING_AND_BLACK_PATTERN);
		emfVarSource.setEClassifier(source.getType());
		bindingAndBlack.getSymbolicParameters().add(emfVarSource);

		final EMFVariable toBeRemoved = variableLookup.getOrCreateEMFVariable(source, PatternType.BLACK_PATTERN);
		getBlackPattern().getSymbolicParameters().remove(toBeRemoved);
		this.generatedDemoclesPatterns.put(PatternType.BINDING_AND_BLACK_PATTERN, bindingAndBlack);
		body.setHeader(bindingAndBlack);
		body.getLocalVariables().add(emfVarTarget);

		final ConstraintParameter sourceConstr = patternFactoty.createConstraintParameter();
		sourceConstr.setReference(emfVarSource);

		final ConstraintParameter targetConstr = patternFactoty.createConstraintParameter();
		targetConstr.setReference(emfVarTarget);

		final PatternInvocationConstraint bindingConstraint = patternFactoty.createPatternInvocationConstraint();
		bindingConstraint.setPositive(true);
		bindingConstraint.setInvokedPattern(getBindingPattern());
		bindingConstraint.getParameters().add(targetConstr);
		bindingConstraint.getParameters().add(sourceConstr);

		final ConstraintParameter singleTargetConstr = patternFactoty.createConstraintParameter();
		singleTargetConstr.setReference(emfVarTarget);

		final PatternInvocationConstraint singleConstraint = patternFactoty.createPatternInvocationConstraint();
		singleConstraint.setPositive(true);
		singleConstraint.setInvokedPattern(getBlackPattern());
		singleConstraint.getParameters().add(singleTargetConstr);

		body.getConstraints().add(bindingConstraint);
		body.getConstraints().add(singleConstraint);
	}

	private void createBindingPattern(final EditorNode node, final EditorNode source) {
		final Pattern binding = PatternUtil.createEmptyPattern();
		final PatternBody body = PatternUtil.getBody(binding);

		registerPattern(binding, PatternType.BINDING_PATTERN);

		final EMFVariable emfVarTarget = variableLookup.getOrCreateEMFVariable(node, PatternType.BINDING_PATTERN);
		emfVarTarget.setEClassifier(node.getType());

		final EMFVariable emfVarSource = variableLookup.getOrCreateEMFVariable(source, PatternType.BINDING_PATTERN);
		emfVarSource.setEClassifier(source.getType());

		binding.getSymbolicParameters().add(emfVarTarget);
		binding.getSymbolicParameters().add(emfVarSource);
		body.setHeader(binding);

		final Equal equalConstr = RelationalConstraintUtil.createEqualConstraint(emfVarSource, emfVarTarget);

		body.getConstraints().add(equalConstr);
	}

	private Pattern registerPattern(final Pattern pattern, final PatternType patternType) {
		return this.generatedDemoclesPatterns.put(patternType, pattern);
	}

	private void bindConstraintParameterForLiteralConstant(final EditorAttribute editorAttribute,
			final PatternBody patternBody, final EditorNode source, final ConstraintParameter to,
			final EditorLiteralExpression literalExpression) {
		final Constant constant = patternFactoty.createConstant();
		final EClass eClass = contextController.getEClassifier(source.getType());
		final EAttribute eAttribute = contextController.getEAttribute(editorAttribute.getAttribute(), eClass);
		final Optional<Object> value = GTEditorAttributeUtils
				.convertLiteralValueToObject(eAttribute.getEAttributeType(), literalExpression);
		if (value.isPresent()) {
			final Object valueObject = value.get();
			ConstantUtil.setConstantValueWithAdjustedType(constant, valueObject);
		} else {
			constant.setValue(literalExpression.getValue());
		}

		patternBody.getConstants().add(constant);
		to.setReference(constant);
	}

	private void bindConstraintParameterForEnumConstant(final PatternBody patternBody,
			final ConstraintParameter constraintParameter, final EditorEnumExpression eEnumExpression) {
		final EEnumLiteral literal = eEnumExpression.getLiteral();
		final Constant enumLiteralConstant = patternFactoty.createConstant();
		enumLiteralConstant.setValue(literal);
		patternBody.getConstants().add(enumLiteralConstant);
		constraintParameter.setReference(enumLiteralConstant);
	}

	Pattern createExpressionPatternForObjectVariables(final CFVariable returnVariable) {
		final Pattern exprPattern = PatternUtil.createEmptyPattern();
		final PatternBody body = PatternUtil.getBody(exprPattern);

		final EMFVariable target = emfHelper.createEMFVariable();
		target.setName("_result");
		target.setEClassifier(contextController.getEClassifier(returnVariable.getType()));
		final EMFVariable source = emfHelper.createEMFVariable();
		source.setName(returnVariable.getName());
		source.setEClassifier(contextController.getEClassifier(returnVariable.getType()));
		exprPattern.getSymbolicParameters().add(target);
		exprPattern.getSymbolicParameters().add(source);

		final Equal equal = relationalConstraintsHelper.createEqual();
		final ConstraintParameter sourceConstr = patternFactoty.createConstraintParameter();
		sourceConstr.setReference(source);
		final ConstraintParameter targetConstr = patternFactoty.createConstraintParameter();
		targetConstr.setReference(target);
		equal.getParameters().add(targetConstr);
		equal.getParameters().add(sourceConstr);

		body.getConstraints().add(equal);

		return exprPattern;
	}

	public Pattern createExpressionPatternForLiteralValues(final CFVariable returnVariable, final String val) {
		final Pattern expressionPattern = PatternUtil.createEmptyPattern();
		final PatternBody body = PatternUtil.getBody(expressionPattern);

		final Constant source = patternFactoty.createConstant();
		ConstantUtil.setConstantValueWithAdjustedType(source,
				ConstantUtil.getValueForType(returnVariable.getType(), val));
		body.getConstants().add(source);

		final EMFVariable target = emfHelper.createEMFVariable();
		target.setName("_result");
		target.setEClassifier(contextController.getEClassifier(returnVariable.getType()));
		expressionPattern.getSymbolicParameters().add(target);

		final Equal equal = RelationalConstraintUtil.createEqualConstraint(source, target);
		body.getConstraints().add(equal);

		return body.getHeader();
	}

	public Pattern createExpressionPatternForEnumValues(final CFVariable returnVariable,
			final EEnumLiteral enumLiteral) {

		final Pattern expressionPattern = PatternUtil.createEmptyPattern();
		final PatternBody body = PatternUtil.getBody(expressionPattern);

		final EClassifier returnType = returnVariable.getType();
		final EMFVariable target = emfHelper.createEMFVariable();
		target.setName("_result");
		target.setEClassifier(contextController.getEClassifier(returnType));

		final Constant source = patternFactoty.createConstant();
		ConstantUtil.setConstantValueWithAdjustedType(source, enumLiteral);
		expressionPattern.getSymbolicParameters().add(target);
		body.getConstants().add(source);

		final Equal equal = RelationalConstraintUtil.createEqualConstraint(source, target);
		body.getConstraints().add(equal);

		return expressionPattern;
	}

	private void registerEmfVariableAndSymbolicParameter(final EObject editorElement, final PatternType patternType) {
		if (!variableLookup.containsKey(editorElement, patternType)) {
			final EMFVariable variable = variableLookup.getOrCreateEMFVariable(editorElement, patternType);

			final EClassifier type = determineTypeOfEditorElement(editorElement);

			variable.setEClassifier(contextController.getEClassifier(type));
			getPatternByType(patternType).getSymbolicParameters().add(variable);
		}
	}

	private void registerEmfVariableAndAddToLocalVariable(final EAttribute eAttribute, final EditorNode editorNode,
			final PatternType type) {
		if (!variableLookup.containsKey(eAttribute, editorNode, type)) {
			final EMFVariable newAttribute = variableLookup.getOrCreateEMFVariable(eAttribute, editorNode, type);
			newAttribute.setEClassifier(contextController.getEClassifier(eAttribute.getEType()));
			PatternUtil.getBody(getPatternByType(type)).getLocalVariables().add(newAttribute);
		}
	}

	private EClassifier determineTypeOfEditorElement(final EObject editorElement) {
		if (editorElement instanceof EditorParameter) {
			final EditorParameter editorParameter = (EditorParameter) editorElement;
			return editorParameter.getType();
		} else if (editorElement instanceof EditorNode) {
			final EditorNode node = (EditorNode) editorElement;
			return node.getType();
		}

		throw new IllegalArgumentException(String.format("Object has unsupported type: '%s'", editorElement));
	}

	private Pattern getBlackPattern() {
		return getPatternByType(PatternType.BLACK_PATTERN);
	}

	private Pattern getBindingPattern() {
		return getPatternByType(PatternType.BINDING_PATTERN);
	}

	private Pattern getPatternByType(final PatternType patternType) {
		return this.generatedDemoclesPatterns.get(patternType);
	}
}
