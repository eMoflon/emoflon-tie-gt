package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
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
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.emoflon.ibex.gt.editor.gT.EditorParameterExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorRelation;
import org.emoflon.ibex.gt.editor.gT.EditorSimpleCondition;
import org.emoflon.ibex.gt.editor.utils.GTEditorAttributeUtils;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.Constraint;
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
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.tie.gt.ide.core.runtime.utilities.ContextController;

public class PatternBuilderVisitor {
	public enum PatternType {
		BLACK_PATTERN, RED_PATTERN, GREEN_PATTERN, EXPRESSION_PATTERN, BINDING_PATTERN, BINDING_AND_BLACK_PATTERN;

		public String getSuffix() {
			switch (this) {
			case BLACK_PATTERN:
				return DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION;
			case EXPRESSION_PATTERN:
				return DemoclesMethodBodyHandler.EXPRESSION_FILE_EXTENSION;
			case GREEN_PATTERN:
				return DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION;
			case RED_PATTERN:
				return DemoclesMethodBodyHandler.RED_FILE_EXTENSION;
			case BINDING_PATTERN:
				return DemoclesMethodBodyHandler.BINDING_FILE_EXTENSION;
			case BINDING_AND_BLACK_PATTERN:
				return DemoclesMethodBodyHandler.BINDING_AND_BLACK_FILE_EXTENSION;
			default:
				return null;
			}
		}
	};

	private final RelationalConstraintFactory relationalConstraintsHelper = RelationalConstraintFactory.eINSTANCE;
	private final EMFTypeFactory emfHelper = EMFTypeFactory.eINSTANCE;
	private final SpecificationFactory patternHelper = SpecificationFactory.eINSTANCE;
	private Map<PatternType, Pattern> generatedDemoclesPatterns;
	private VariableLookupTable variableLookup;
	private final ContextController contextController;

	public PatternBuilderVisitor(final EPackage contextEPackage, final ResourceSet resourceSet) {
		this.generatedDemoclesPatterns = new HashMap<>();
		this.variableLookup = new VariableLookupTable();
		this.contextController = new ContextController();
		this.contextController.setEPackage(contextEPackage);
		this.contextController.setResourceSet(resourceSet);
	}

	public Map<PatternType, Pattern> visit(final EditorPattern pattern) {
		// TODO: make this dynamic
		// TODO: reset map for each pattern kind(or try without?)
		pattern.getNodes().forEach(n -> visit(n, pattern));
		pattern.getConditions().forEach(condition -> visit(condition, pattern));
		return generatedDemoclesPatterns;
	}

	private void visit(final EditorNode node, final EditorPattern editorPattern) {
		List<PatternType> patternTypes = new ArrayList<PatternBuilderVisitor.PatternType>();
		if (node.getOperator() == EditorOperator.CONTEXT) {
			patternTypes = Arrays.asList(PatternType.BLACK_PATTERN);
		}
		if (node.getOperator() == EditorOperator.DELETE) {
			patternTypes = Arrays.asList(PatternType.BLACK_PATTERN, PatternType.RED_PATTERN);
		}
		if (node.getOperator() == EditorOperator.CREATE) {
			patternTypes = Arrays.asList(PatternType.GREEN_PATTERN);
		}
		for (final PatternType type : patternTypes) {
			if (!this.generatedDemoclesPatterns.containsKey(type)) {
				createPattern(editorPattern, type);
			}

			if (!variableLookup.containsKey(node, type)) {
				final EMFVariable var = variableLookup.getOrCreateEMFVariable(node, type);
				generatedDemoclesPatterns.get(type).getSymbolicParameters().add(var);
				var.setEClassifier(contextController.getTypeContext(node.getType()));
			}
		}
		node.getAttributes().forEach(attribute -> visit(attribute, node, editorPattern));
		node.getReferences().forEach(reference -> visit(reference, node, editorPattern));
		if (node.getBinding() != null) {
			final EditorBindingExpression binding = node.getBinding();
			final EditorNode source = binding.getNode();
			// TODO: need to perform type checking of some sort?
			createBindingPattern(node, source);
			createBindingAndBlackPattern(node, source);
			// TODO:save and create searchplan
			// TODO:create bindingPattern,blackPattern,bindingAndBlackPattern, put all into
			// .bindingAndBlack

		}
	}

	private void visit(final EditorCondition condition, final EditorPattern pattern) {

		switch (condition.getConditions().size()) {
		case 0:
			return;
		case 1:
			// We only take the first one here as we do not accept AND connections
			final EditorSimpleCondition partialCondition = condition.getConditions().get(0);
			if (partialCondition instanceof EditorConditionReference) {
				final EditorConditionReference simpleCond = (EditorConditionReference) partialCondition;
				visit(simpleCond.getCondition(), pattern);
			} else {
				final EditorApplicationCondition simpleCond = (EditorApplicationCondition) partialCondition;
				final EditorPattern applicationCondition = simpleCond.getPattern();
				final EditorApplicationConditionType type = simpleCond.getType();
				// TODO:obtain pattern
				final Pattern newInvokedPattern = buildApplicationConditionPattern(applicationCondition);
				createPatternInvocation(type, newInvokedPattern);
			}
		default:
			// TODO: create problem marker if condition.getConditions()>1
			// TODO@rkluge you are possibly a lot quicker than me here. Just insert after
			// the if statment
			return;
		}
	}

	private void visit(final EditorAttribute editorAttribute, final EditorNode source, final EditorPattern pattern) {
		PatternType type;
		if (editorAttribute.getRelation() != EditorRelation.ASSIGNMENT) {
			type = PatternType.BLACK_PATTERN;
		} else {
			type = PatternType.GREEN_PATTERN;
		}
		if (!this.generatedDemoclesPatterns.containsKey(type)) {
			createPattern(pattern, type);
		}
		final PatternBody patternBody = this.generatedDemoclesPatterns.get(type).getBodies().get(0);
		final EAttribute editorAttributeEAttribute = editorAttribute.getAttribute();
		final Attribute emfAttribute = lookupOrCreateAttribute(patternBody,
				this.contextController.getEAttributeContext(editorAttributeEAttribute, source.getType()));
		if (emfAttribute.getParameters().isEmpty()) {
			final ConstraintParameter from = patternHelper.createConstraintParameter();
			if (!variableLookup.containsKey(source, type)) {
				final EMFVariable newNodeVariable = variableLookup.getOrCreateEMFVariable(source, type);
				newNodeVariable.setEClassifier(contextController.getTypeContext(source.getType()));
				this.generatedDemoclesPatterns.get(type).getSymbolicParameters().add(newNodeVariable);
			}
			from.setReference(variableLookup.lookup(source, type));
			emfAttribute.getParameters().add(from);
			patternBody.getConstraints().add(emfAttribute);
		}
		final RelationalConstraint relConstraint = createRelationalConstraint(editorAttribute);
		if (relConstraint == null)
			return;
		final ConstraintParameter to = patternHelper.createConstraintParameter();
		final EditorExpression expr = editorAttribute.getValue();
		if (expr instanceof EditorAttributeExpression) {
			final EditorAttributeExpression attributeExpr = (EditorAttributeExpression) expr;
			final EAttribute eAttribute = attributeExpr.getAttribute();
			final EditorNode editorNode = attributeExpr.getNode();

			// Create LHS variable ('from')
			final ConstraintParameter fromNode = patternHelper.createConstraintParameter();
			if (!variableLookup.containsKey(editorNode, type)) {
				final EMFVariable newEmfVar = variableLookup.getOrCreateEMFVariable(editorNode, type);
				newEmfVar.setEClassifier(contextController.getTypeContext(editorNode.getType()));
				this.generatedDemoclesPatterns.get(type).getSymbolicParameters().add(newEmfVar);
			}
			fromNode.setReference(variableLookup.get(editorNode, type));

			final Attribute attributeReference = emfHelper.createAttribute();
			attributeReference.setEModelElement(eAttribute);
			if (!variableLookup.containsKey(eAttribute, editorNode, type)) {
				final EMFVariable newAttribute = variableLookup.getOrCreateEMFVariable(eAttribute, editorNode, type);
				newAttribute.setEClassifier(contextController.getTypeContext(eAttribute.getEType()));
				patternBody.getLocalVariables().add(newAttribute);
			}
			final EMFVariable attribute = variableLookup.get(eAttribute, editorNode, type);

			final ConstraintParameter toAttribute = patternHelper.createConstraintParameter();
			toAttribute.setReference(attribute);

			attributeReference.getParameters().add(fromNode);
			attributeReference.getParameters().add(toAttribute);

			final Optional<Attribute> existingConstraint = findAttributeConstraintInPatternBody(attributeReference,
					patternBody);
			if (!existingConstraint.isPresent()) {
				patternBody.getConstraints().add(attributeReference);
			}

			to.setReference(attribute);

		}
		if (expr instanceof EditorLiteralExpression) {
			createAndBindConstant(editorAttribute, patternBody, source, to, (EditorLiteralExpression) expr);
		}
		if (expr instanceof EditorEnumExpression) {
			createAndBindConstantForEnum(patternBody, to, (EditorEnumExpression) expr);
		}
		if (expr instanceof EditorParameterExpression) {
			final EditorParameterExpression eParamExpression = (EditorParameterExpression) expr;
			to.setReference(variableLookup.get(eParamExpression.getParameter(), type));
		}
		final ConstraintParameter tmpAttrVal = patternHelper.createConstraintParameter();
		if (!variableLookup.containsKey(editorAttributeEAttribute, source, type)) {
			final EMFVariable tmpAttrVar = variableLookup.getOrCreateEMFVariable(editorAttributeEAttribute, source,
					type);
			patternBody.getLocalVariables().add(tmpAttrVar);
			tmpAttrVar.setEClassifier(contextController.getTypeContext(emfAttribute.getEModelElement().getEType()));
		}
		tmpAttrVal.setReference(variableLookup.get(editorAttributeEAttribute, source, type));
		if (emfAttribute.getParameters().size() < 2)
			emfAttribute.getParameters().add(tmpAttrVal);
		final ConstraintParameter tmpAttrValCopy = patternHelper.createConstraintParameter();
		tmpAttrValCopy.setReference(variableLookup.get(editorAttributeEAttribute, source, type));
		relConstraint.getParameters().add(tmpAttrValCopy);
		relConstraint.getParameters().add(to);
		patternBody.getConstraints().add(relConstraint);
	}

	private Optional<Attribute> findAttributeConstraintInPatternBody(final Attribute attributeReference,
			final PatternBody patternBody) {
		final Optional<Attribute> existingAttributeConstraint = patternBody.getConstraints().stream()
				.filter(constraint -> constraint instanceof Attribute).map(Attribute.class::cast)
				.filter(attribute -> attribute.getEModelElement().equals(attributeReference.getEModelElement()))
				.findAny();
		return existingAttributeConstraint;
	}

	private void visit(final EditorReference editorReference, final EditorNode source,
			final EditorPattern editorPattern) {
		final List<PatternType> patternTypes;
		switch (editorReference.getOperator()) {
		case CONTEXT:
			patternTypes = Arrays.asList(PatternType.BLACK_PATTERN);
			break;
		case DELETE:
			patternTypes = Arrays.asList(PatternType.BLACK_PATTERN, PatternType.RED_PATTERN);
			break;
		case CREATE:
			patternTypes = Arrays.asList(PatternType.GREEN_PATTERN);
			break;
		default:
			patternTypes = new ArrayList<>();
			break;
		}
		for (final PatternType type : patternTypes) {
			if (!this.generatedDemoclesPatterns.containsKey(type)) {
				createPattern(editorPattern, type);
			}
			final PatternBody patternBody = this.generatedDemoclesPatterns.get(type).getBodies().get(0);
			final Reference ref = emfHelper.createReference();
			ref.setEModelElement(
					this.contextController.getEReferenceContext(editorReference.getType(), source.getType()));
			final ConstraintParameter from = patternHelper.createConstraintParameter();
			if (variableLookup.containsKey(source, type))
				from.setReference(variableLookup.get(source, type));
			else {
				// TODO: this should currently not occur, but keep an eye on local Variables for
				// Nodes
				final EMFVariable newVariable = variableLookup.getOrCreateEMFVariable(source, type);
				newVariable.setEClassifier(contextController.getTypeContext(source.getType()));
				patternBody.getHeader().getSymbolicParameters().add(newVariable);
				from.setReference(newVariable);
			}
			final ConstraintParameter to = patternHelper.createConstraintParameter();
			final EditorNode editorReferenceTarget = editorReference.getTarget();
			if (variableLookup.containsKey(editorReferenceTarget, type))
				to.setReference(variableLookup.get(editorReferenceTarget, type));
			else {
				// TODO: this should currently not occur, but keep an eye on local Variables for
				// Nodes
				final EMFVariable newVariable = variableLookup.getOrCreateEMFVariable(editorReferenceTarget, type);
				newVariable.setEClassifier(contextController.getTypeContext(editorReferenceTarget.getType()));
				patternBody.getHeader().getSymbolicParameters().add(newVariable);
				to.setReference(newVariable);
			}
			ref.getParameters().add(from);
			ref.getParameters().add(to);
			patternBody.getConstraints().add(ref);
		}
	}

	private Pattern buildApplicationConditionPattern(final EditorPattern applicationCondition) {
		// Store the current state to restore it after constraint has been processed
		final Map<PatternType, Pattern> patternCache = this.generatedDemoclesPatterns;
		this.generatedDemoclesPatterns = new HashMap<PatternType, Pattern>();
		final VariableLookupTable variableCache = this.variableLookup;
		this.variableLookup = new VariableLookupTable();
		visit(applicationCondition);
		final Pattern newInvokedPattern = this.generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN);
		// Restore lookup tables
		this.generatedDemoclesPatterns = patternCache;
		this.variableLookup = variableCache;
		return newInvokedPattern;
	}

	private void createPatternInvocation(final EditorApplicationConditionType type, final Pattern newInvokedPattern) {
		final PatternInvocationConstraint invocationConstraint = patternHelper.createPatternInvocationConstraint();
		final EList<Variable> symbolicParamsInvoker = this.generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN)
				.getSymbolicParameters();
		invocationConstraint.setPositive(type == EditorApplicationConditionType.POSITIVE ? true : false);
		invocationConstraint.setInvokedPattern(newInvokedPattern);
		createConstraintParameters(newInvokedPattern, invocationConstraint, symbolicParamsInvoker);
		this.generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getBodies().get(0).getConstraints()
				.add(invocationConstraint);
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
				final ConstraintParameter constraintParameter = patternHelper.createConstraintParameter();
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
		final Pattern democlesPattern = patternHelper.createPattern();
		this.generatedDemoclesPatterns.put(patternType, democlesPattern);
		final PatternBody body = patternHelper.createPatternBody();
		body.setHeader(democlesPattern);
		pattern.getParameters().forEach(param -> createEMFVariableFromEditorParameter(patternType, param));
	}

	private void createEMFVariableFromEditorParameter(final PatternType type, final EditorParameter param) {
		switch (type) {
		case RED_PATTERN:
			return;
		default:
			if (!variableLookup.containsKey(param, type)) {
				final EMFVariable emfParam = variableLookup.getOrCreateEMFVariable(param, type);
				emfParam.setEClassifier(contextController.getTypeContext(param.getType()));
				this.generatedDemoclesPatterns.get(type).getSymbolicParameters().add(emfParam);
			}
		}
	}

	private void createBindingAndBlackPattern(final EditorNode node, final EditorNode source) {
		final Pattern bindingAndBlack = patternHelper.createPattern();
		this.generatedDemoclesPatterns.put(PatternType.BINDING_AND_BLACK_PATTERN, bindingAndBlack);
		final EMFVariable emfVarTarget = variableLookup.getOrCreateEMFVariable(node,
				PatternType.BINDING_AND_BLACK_PATTERN);
		emfVarTarget.setEClassifier(node.getType());
		final EMFVariable emfVarSource = variableLookup.getOrCreateEMFVariable(source,
				PatternType.BINDING_AND_BLACK_PATTERN);
		emfVarSource.setEClassifier(source.getType());
		// bindingAndBlack.getSymbolicParameters().add(emfVarTarget);
		bindingAndBlack.getSymbolicParameters().add(emfVarSource);
		// TODO: create a more sophisticated solution
		final EMFVariable toBeRemoved = variableLookup.getOrCreateEMFVariable(source, PatternType.BLACK_PATTERN);
		this.generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getSymbolicParameters().remove(toBeRemoved);
		this.generatedDemoclesPatterns.put(PatternType.BINDING_AND_BLACK_PATTERN, bindingAndBlack);
		final PatternBody body = patternHelper.createPatternBody();
		body.setHeader(bindingAndBlack);
		body.getLocalVariables().add(emfVarTarget);
		final PatternInvocationConstraint bindingConstraint = patternHelper.createPatternInvocationConstraint();
		bindingConstraint.setPositive(true);
		bindingConstraint.setInvokedPattern(this.generatedDemoclesPatterns.get(PatternType.BINDING_PATTERN));
		final ConstraintParameter sourceConstr = patternHelper.createConstraintParameter();
		sourceConstr.setReference(emfVarSource);
		final ConstraintParameter targetConstr = patternHelper.createConstraintParameter();
		targetConstr.setReference(emfVarTarget);
		bindingConstraint.getParameters().add(targetConstr);
		bindingConstraint.getParameters().add(sourceConstr);
		final PatternInvocationConstraint singleConstraint = patternHelper.createPatternInvocationConstraint();
		singleConstraint.setPositive(true);
		singleConstraint.setInvokedPattern(this.generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN));
		final ConstraintParameter singleTargetConstr = patternHelper.createConstraintParameter();
		singleTargetConstr.setReference(emfVarTarget);
		singleConstraint.getParameters().add(singleTargetConstr);
		body.getConstraints().add(bindingConstraint);
		body.getConstraints().add(singleConstraint);
	}

	private void createBindingPattern(final EditorNode node, final EditorNode source) {
		final Pattern binding = patternHelper.createPattern();
		this.generatedDemoclesPatterns.put(PatternType.BINDING_PATTERN, binding);
		final EMFVariable emfVarTarget = variableLookup.getOrCreateEMFVariable(node, PatternType.BINDING_PATTERN);
		emfVarTarget.setEClassifier(node.getType());
		final EMFVariable emfVarSource = variableLookup.getOrCreateEMFVariable(source, PatternType.BINDING_PATTERN);
		emfVarSource.setEClassifier(source.getType());
		binding.getSymbolicParameters().add(emfVarTarget);
		binding.getSymbolicParameters().add(emfVarSource);
		final PatternBody body = patternHelper.createPatternBody();
		body.setHeader(binding);
		final Equal equalConstr = relationalConstraintsHelper.createEqual();
		body.getConstraints().add(equalConstr);
		final ConstraintParameter targetConstr = patternHelper.createConstraintParameter();
		targetConstr.setReference(emfVarTarget);
		equalConstr.getParameters().add(targetConstr);
		final ConstraintParameter sourceConstr = patternHelper.createConstraintParameter();
		sourceConstr.setReference(emfVarSource);
		equalConstr.getParameters().add(sourceConstr);
	}

	private Attribute lookupOrCreateAttribute(final PatternBody patternBody, final EAttribute eAttribute) {

		final Optional<Constraint> existingAttribute = patternBody.getConstraints().stream().filter(constraint -> {
			if (constraint instanceof Attribute) {
				final Attribute attribute = (Attribute) constraint;
				return attribute.getEModelElement().equals(eAttribute);
			} else
				return false;
		}).findAny();
		if (existingAttribute.isPresent())
			return (Attribute) existingAttribute.get();
		else {
			final Attribute newAttribute = emfHelper.createAttribute();
			newAttribute.setEModelElement(eAttribute);
			return newAttribute;
		}
	}

	private void createAndBindConstant(final EditorAttribute editorAttribute, final PatternBody patternBody,
			final EditorNode source, final ConstraintParameter to, final EditorLiteralExpression literalExpr) {
		final Constant constant = patternHelper.createConstant();
		// TODO: lookup for existing constants?
		final Optional<Object> value = GTEditorAttributeUtils
				.convertLiteralValueToObject(contextController.getEAttributeContext(editorAttribute.getAttribute(),
						contextController.getTypeContext(source.getType())).getEAttributeType(), literalExpr);
		if (value.isPresent()) {
			final Object valueObject = value.get();
			setConstantValueWithAdjustedType(constant, valueObject);
		} else {
			constant.setValue(literalExpr.getValue());
		}

		patternBody.getConstants().add(constant);
		to.setReference(constant);
	}

	private void createAndBindConstantForEnum(final PatternBody patternBody, final ConstraintParameter to,
			final EditorEnumExpression eEnumExpression) {
		// TODO: lookup for EEnumConstant
		final EEnumLiteral literal = eEnumExpression.getLiteral();
		final Constant enumLiteralConstant = patternHelper.createConstant();
		enumLiteralConstant.setValue(literal);
		patternBody.getConstants().add(enumLiteralConstant);
		to.setReference(enumLiteralConstant);
	}

	private static void setConstantValueWithAdjustedType(final Constant constant, final Object valueObject) {
		if (valueObject instanceof Integer) {
			final Integer value = (Integer) valueObject;
			constant.setValue(value);
		} else if (valueObject instanceof String) {
			final String value = (String) valueObject;
			constant.setValue(value);
		} else if (valueObject instanceof Boolean) {
			final Boolean value = (Boolean) valueObject;
			constant.setValue(value.booleanValue());
		} else if (valueObject instanceof Double) {
			final Double value = (Double) valueObject;
			constant.setValue(value.doubleValue());
		} else if (valueObject instanceof Float) {
			final Float value = (Float) valueObject;
			constant.setValue(value.floatValue());
		} else if (valueObject instanceof Long) {
			final Long value = (Long) valueObject;
			constant.setValue(value.longValue());
		} else if (valueObject instanceof EEnumLiteral) {
			final EEnumLiteral literal = (EEnumLiteral) valueObject;
			constant.setValue(literal);
		} else {
			throw new IllegalArgumentException("Unsupported value type: " + valueObject);
		}
	}

	private RelationalConstraint createRelationalConstraint(final EditorAttribute attribute) {
		RelationalConstraint relConstraint;
		switch (attribute.getRelation()) {
		case EQUAL:
			relConstraint = relationalConstraintsHelper.createEqual();
			break;
		case GREATER:
			relConstraint = relationalConstraintsHelper.createLarger();
			break;
		case SMALLER:
			relConstraint = relationalConstraintsHelper.createSmaller();
			break;
		case GREATER_OR_EQUAL:
			relConstraint = relationalConstraintsHelper.createLargerOrEqual();
			break;
		case SMALLER_OR_EQUAL:
			relConstraint = relationalConstraintsHelper.createSmallerOrEqual();
			break;
		case UNEQUAL:
			relConstraint = relationalConstraintsHelper.createUnequal();
			break;
		case ASSIGNMENT:
			relConstraint = relationalConstraintsHelper.createEqual();
			break;
		default:
			System.out.println("Unsupported EditorRelation: " + attribute.getRelation());// TODO@rkluge Create error
			return null;
		}
		return relConstraint;
	}

	Pattern createExpressionPatternForObjectVariables(final CFVariable returnVariable) {
		// createPattern
		final Pattern exprPattern = patternHelper.createPattern();
		final PatternBody body = patternHelper.createPatternBody();
		exprPattern.getBodies().add(body);
		// create EMFVariables
		final EMFVariable target = emfHelper.createEMFVariable();
		target.setName("_result");
		target.setEClassifier(contextController.getTypeContext(returnVariable.getType()));
		final EMFVariable source = emfHelper.createEMFVariable();
		source.setName(returnVariable.getName());
		source.setEClassifier(contextController.getTypeContext(returnVariable.getType()));
		exprPattern.getSymbolicParameters().add(target);
		exprPattern.getSymbolicParameters().add(source);
		// create EqualConstraint
		final Equal equal = relationalConstraintsHelper.createEqual();
		final ConstraintParameter sourceConstr = patternHelper.createConstraintParameter();
		sourceConstr.setReference(source);
		final ConstraintParameter targetConstr = patternHelper.createConstraintParameter();
		targetConstr.setReference(target);
		equal.getParameters().add(targetConstr);
		equal.getParameters().add(sourceConstr);
		body.getConstraints().add(equal);
		return exprPattern;
	}

	public Pattern createExpressionPatternForLiteralValues(final CFVariable returnVariable, final String val) {
		final Pattern exprPattern = patternHelper.createPattern();
		final PatternBody body = patternHelper.createPatternBody();
		exprPattern.getBodies().add(body);
		final EMFVariable target = emfHelper.createEMFVariable();
		target.setName("_result");
		target.setEClassifier(contextController.getTypeContext(returnVariable.getType()));
		final Constant source = patternHelper.createConstant();
		setConstantValueWithAdjustedType(source, getValueForType(returnVariable.getType(), val));
		exprPattern.getSymbolicParameters().add(target);
		body.getConstants().add(source);
		// create EqualConstraint
		final Equal equal = relationalConstraintsHelper.createEqual();
		final ConstraintParameter sourceConstr = patternHelper.createConstraintParameter();
		sourceConstr.setReference(source);
		final ConstraintParameter targetConstr = patternHelper.createConstraintParameter();
		targetConstr.setReference(target);
		equal.getParameters().add(targetConstr);
		equal.getParameters().add(sourceConstr);
		body.getConstraints().add(equal);
		return exprPattern;
	}

	public Pattern createExpressionPatternForEnumValues(final CFVariable returnVariable,
			final EEnumLiteral enumLiteral) {
		final Pattern exprPattern = patternHelper.createPattern();
		final PatternBody body = patternHelper.createPatternBody();
		exprPattern.getBodies().add(body);
		final EMFVariable target = emfHelper.createEMFVariable();
		target.setName("_result");
		target.setEClassifier(contextController.getTypeContext(returnVariable.getType()));
		final Constant source = patternHelper.createConstant();
		setConstantValueWithAdjustedType(source, enumLiteral);
		exprPattern.getSymbolicParameters().add(target);
		body.getConstants().add(source);
		// create EqualConstraint
		final Equal equal = relationalConstraintsHelper.createEqual();
		final ConstraintParameter sourceConstr = patternHelper.createConstraintParameter();
		sourceConstr.setReference(source);
		final ConstraintParameter targetConstr = patternHelper.createConstraintParameter();
		targetConstr.setReference(target);
		equal.getParameters().add(targetConstr);
		equal.getParameters().add(sourceConstr);
		body.getConstraints().add(equal);
		return exprPattern;
	}

	private static Object getValueForType(final EClassifier type, final String val) {
		if (type instanceof EDataType) {
			final EDataType dataType = (EDataType) type;
			return dataType.getEPackage().getEFactoryInstance().createFromString(dataType, val);
		} else
			return val;

	}

}
