package org.moflon.tie.gt.ide.core.patterns;

import static org.emoflon.ibex.gt.editor.utils.GtPrettyPrinter.describe;
import static org.moflon.tie.gt.ide.core.patterns.util.TransformationExceptions.recordError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.gt.editor.gT.EditorApplicationCondition;
import org.emoflon.ibex.gt.editor.gT.EditorApplicationConditionType;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeExpression;
import org.emoflon.ibex.gt.editor.gT.EditorBindingExpression;
import org.emoflon.ibex.gt.editor.gT.EditorCondition;
import org.emoflon.ibex.gt.editor.gT.EditorConditionReference;
import org.emoflon.ibex.gt.editor.gT.EditorEnumExpression;
import org.emoflon.ibex.gt.editor.gT.EditorExpression;
import org.emoflon.ibex.gt.editor.gT.EditorGTFile;
import org.emoflon.ibex.gt.editor.gT.EditorLiteralExpression;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.emoflon.ibex.gt.editor.gT.EditorParameterExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeCondition;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraint;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintArgument;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintAttributeValueExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintPredicate;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintVariable;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintVariableReference;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorSimpleCondition;
import org.emoflon.ibex.gt.editor.gT.GTFactory;
import org.emoflon.ibex.gt.editor.utils.GTEditorAttributeUtils;
import org.emoflon.ibex.gt.editor.utils.GTEnumExpressionHelper;
import org.emoflon.ibex.gt.editor.utils.GTFlattener;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.moflon.tie.gt.compiler.democles.CodeConventions;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.constraints.democles.AttributeVariableConstraint;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintsLibraryRegistry;
import org.moflon.tie.gt.constraints.operationspecification.ConstraintSpecification;
import org.moflon.tie.gt.constraints.operationspecification.ParameterType;
import org.moflon.tie.gt.constraints.operationspecification.constraint.AttributeVariableConstraintType;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.ide.core.patterns.util.AttributeValueConstraints;
import org.moflon.tie.gt.ide.core.patterns.util.Attributes;
import org.moflon.tie.gt.ide.core.patterns.util.Constants;
import org.moflon.tie.gt.ide.core.patterns.util.ConstraintParameters;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationActions;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationConstraints;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;
import org.moflon.tie.gt.ide.core.patterns.util.References;
import org.moflon.tie.gt.ide.core.patterns.util.RelationalConstraints;
import org.moflon.tie.gt.ide.core.patterns.util.TieGtEcoreUtil;
import org.moflon.tie.gt.ide.core.patterns.util.TransformationExceptions;
import org.moflon.tie.gt.ide.core.patterns.util.TypeLookup;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.LiteralExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatementParameter;

public class PatternBuilderVisitor {
	private final PatternLookup patterns;
	private final VariableLookup variables;
	private final TypeLookup types;
	private final MultiStatus transformationStatus;

	public PatternBuilderVisitor(final TypeLookup types, final MultiStatus transformationStatus) {
		this.transformationStatus = transformationStatus;
		this.types = types;

		patterns = new PatternLookup();
		variables = new VariableLookup(patterns, types);
	}

	public PatternLookup visit(final EditorPattern pattern) {

		configureAttributeConstraintsLibrary(pattern);

		if (hasErrors())
			return null;

		visitEditorNodes(pattern);

		visitComplexAttributeConstraints(pattern);

		visitConditions(pattern);

		if (patterns.hasBlack())
			addUnequalConstraints(patterns.getBlackPattern());

		return patterns;
	}

	/**
	 * Adds Unequal constraints for every pair of EMF variables that are above each
	 * other in the inheritance chain
	 * 
	 * @param gtPattern
	 * @param democlesPattern
	 */
	private static void addUnequalConstraints(final Pattern democlesPattern) {
		final PatternBody body = Patterns.getBody(democlesPattern);
		final List<Variable> variables = Patterns.collectVariables(democlesPattern);
		for (final Variable variable1 : variables) {
			for (final Variable variable2 : variables) {
				if (variable1 != variable2 && variable1 instanceof EMFVariable && variable2 instanceof EMFVariable
						&& variable1.getName().compareTo(variable2.getName()) < 0) {
					createUnequalConstraintIfNecessary((EMFVariable) variable1, (EMFVariable) variable2, body);
				}
			}
		}
	}

	private void visitEditorNodes(final EditorPattern pattern) {
		pattern.getNodes().forEach(editorNode -> visit(editorNode, pattern));
	}

	private void visitComplexAttributeConstraints(final EditorPattern pattern) {
		pattern.getComplexAttributeConstraints()
				.forEach(complexAttributeConstraint -> visit(complexAttributeConstraint, pattern));
	}

	private void visitConditions(final EditorPattern pattern) {
		switch (pattern.getConditions().size()) {
		case 0:
			// Do nothing
			break;
		case 1: {
			final EditorCondition condition = getFirstCondition(pattern);
			visit(condition, pattern);
			break;
		}
		default: {
			final EditorCondition condition = getFirstCondition(pattern);
			visit(condition, pattern);
			TransformationExceptions.recordWarning(transformationStatus,
					"Ignoring all but the first condition of pattern %s", pattern.getName());
			break;
		}
		}
	}

	private EditorCondition getFirstCondition(final EditorPattern pattern) {
		return pattern.getConditions().get(0);
	}

	private void configureAttributeConstraintsLibrary(final EditorPattern pattern) {
		final Resource resource = pattern.eResource();
		final URI priorityUri = resource != null ? resource.getURI() : null;
		AttributeVariableConstraintType.getModule().setPriorityUri(priorityUri);
	}

	Pattern createExpressionPatternForObjectVariables(final CFVariable returnVariable) {
		final Pattern pattern = patterns.getExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final EMFVariable target = getReturnVariable(returnVariable, pattern);

		final EMFVariable source = variables.getSymbolicParameter(returnVariable,
				DemoclesPatternType.EXPRESSION_PATTERN);

		RelationalConstraints.addEqual(source, target, body);

		return pattern;
	}

	Pattern createExpressionPatternForObjectVariableAttribute(final CFVariable returnVariable,
			final EAttribute attribute) {
		final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
		final Pattern pattern = patterns.getExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);
		final EClassifier returnVariableType = returnVariable.getType();
		if (!(returnVariableType instanceof EClass)) {
			recordError(getStatus(), "Type of %s should be an EClass, but was %s", returnVariable,
					returnVariableType.getName());
			return null;
		}

		final EClass returnValueClass = (EClass) returnVariableType;
		if (!returnValueClass.getEAllAttributes().contains(attribute)) {
			recordError(getStatus(), "%s has no EAttribute %s", returnValueClass.getName(), attribute.getName());
			return null;
		}

		final EMFVariable emfReturnVariable = getReturnVariable(attribute, pattern);

		final EMFVariable emfObjectVariable = variables.getSymbolicParameter(returnVariable, patternType);

		final EMFVariable attributeVariable = variables.getLocalVariable(attribute, returnVariable.getName(),
				patternType);

		Attributes.add(attribute, emfObjectVariable, attributeVariable, body);
		RelationalConstraints.addEqual(attributeVariable, emfReturnVariable, body);

		return pattern;
	}

	Pattern createExpressionPatternForLiteralValues(final CFVariable returnVariable, final String value) {
		final Pattern pattern = patterns.getExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final Constant source = SpecificationFactory.eINSTANCE.createConstant();
		Constants.setConstantValueWithAdjustedType(source, Constants.getValueForType(returnVariable.getType(), value));
		Patterns.addConstant(body, source);

		final EMFVariable resultEmfVariable = getReturnVariable(returnVariable, pattern);

		RelationalConstraints.addEqual(source, resultEmfVariable, body);

		return body.getHeader();
	}

	Pattern createExpressionPatternForEnumValues(final CFVariable returnVariable, final EEnumLiteral enumLiteral) {

		final Pattern pattern = patterns.getExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final EMFVariable resultEmfVariable = getReturnVariable(returnVariable, pattern);

		final Constant source = SpecificationFactory.eINSTANCE.createConstant();
		Constants.setConstantValueWithAdjustedType(source, enumLiteral);
		Patterns.addConstant(body, source);

		final Equal equal = RelationalConstraints.addEqual(source, resultEmfVariable, body);
		Patterns.addConstraint(equal, body);

		return pattern;
	}

	Pattern createExpressionPatternForOperationInvocation(final CFVariable calleeVariable,
			final CFVariable resultCFVariable, final List<CFVariable> parameterCFVariables, final EOperation eOperation,
			final EList<OperationCallStatementParameter> operationParameters) {

		final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
		final Pattern pattern = patterns.getExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final Operation operationConstraint = PatternInvocationActions.createOperationConstraint(eOperation);

		// Handle callee
		final EMFVariable calleeEmfVariable = variables.getSymbolicParameter(calleeVariable, patternType);
		operationConstraint.getParameters().add(ConstraintParameters.create(calleeEmfVariable));

		// Handle operation call parameters
		int counter = 0;
		for (final OperationCallStatementParameter operationParameter : operationParameters) {
			final ConstraintParameter constraintParameter;
			if (operationParameter.getObject() != null) {
				final CFVariable parameterCFVariable = parameterCFVariables.stream()
						.filter(cfVariable -> cfVariable.getName().equals(operationParameter.getObject().getName()))
						.findAny().get();
				final EMFVariable parameterEmfVariable = variables.getSymbolicParameter(parameterCFVariable,
						patternType);
				constraintParameter = ConstraintParameters.create(parameterEmfVariable);
			} else {
				final LiteralExpression literalExpression = operationParameter.getLiteral();
				final Constant constant = Constants.createConstant(literalExpression,
						eOperation.getEParameters().get(counter), body, getStatus());
				constraintParameter = ConstraintParameters.create(constant);
			}
			operationConstraint.getParameters().add(constraintParameter);
			++counter;
		}

		Patterns.addConstraint(operationConstraint, body);

		if (!TieGtEcoreUtil.isVoidOperation(eOperation)) {
			// Local variable for storing the EOperation result
			final EMFVariable operationResultVariable = variables.getLocalVariable("_localVariable0",
					eOperation.getEType(), patternType);

			// IMPORTANT: The first constraint parameter is interpreted as return variable
			// (for non-void EOperations)
			operationConstraint.getParameters().add(0, ConstraintParameters.create(operationResultVariable));

			final EMFVariable resultEmfVariable = getReturnVariable(resultCFVariable, pattern);

			RelationalConstraints.addEqual(operationResultVariable, resultEmfVariable, body);
		}

		return pattern;
	}

	private void visit(final EditorNode node, final EditorPattern editorPattern) {
		final List<DemoclesPatternType> patternTypes = Patterns.mapOperatorToPatternTypes(node, getStatus());

		if (hasErrors())
			return;

		patternTypes.forEach(type -> {
			initializeVariablesForParameters(editorPattern, type);
			variables.getSymbolicParameter(node, type);
		});

		node.getAttributes().forEach(attribute -> visit(attribute, node, editorPattern));
		node.getReferences().forEach(reference -> visit(reference, node, editorPattern));

		if (hasBinding(node)) {
			createBindingConstraint(node);
			createBindingAndBlackPattern(node);
		}
	}

	private boolean hasBinding(final EditorNode node) {
		return node.getBinding() != null;
	}

	private void visit(final EditorPatternAttributeCondition cac, final EditorPattern pattern) {

		for (final EditorPatternAttributeConstraint attributeConstraint : cac.getConstraints()) {
			if (attributeConstraint instanceof EditorPatternAttributeConstraintPredicate) {
				final EditorPatternAttributeConstraintPredicate predicate = (EditorPatternAttributeConstraintPredicate) attributeConstraint;

				// 1. Ensure that the library contains a suitable constraint specification for
				// the
				// given predicate symbol
				final String predicateSymbol = predicate.getName().getName();
				final List<ConstraintSpecification> possibleConstraintSpecifications = getConstraintSpecificationsWithSymbol(
						predicateSymbol);
				if (!possibleConstraintSpecifications.isEmpty()) {

					// 2. Check whether parameter
					final List<EClassifier> predicateArgumentTypes = getPredicateArgumentTypes(predicate);

					final Optional<ConstraintSpecification> selectedConstraintSpecification = possibleConstraintSpecifications
							.stream().filter(possibleConstraintSpecification -> haveSameParameterTypes(
									possibleConstraintSpecification, predicateArgumentTypes))
							.findFirst();

					// 3. We have found a constraint specification matching the predicate!
					if (selectedConstraintSpecification.isPresent()) {
						final AttributeVariableConstraint attributeVariableConstraint = createAttributeVariableConstraint(
								predicateSymbol);
						predicate.getArgs().forEach(predicateArgument -> {
							final ConstraintVariable variable = getConstraintVariable(predicateArgument);
							final ConstraintParameter constraintParameter = ConstraintParameters.create(variable);
							attributeVariableConstraint.getParameters().add(constraintParameter);
						});

						final PatternBody blackBody = Patterns.getBody(patterns.getBlackPattern());
						Patterns.addConstraint(attributeVariableConstraint, blackBody);
					} else
						recordError(getStatus(),
								"No constraint specification with symbol %s matches the type signature %s of predicate %s",
								predicateSymbol, formatTypeList(predicateArgumentTypes), describe(predicate));

				} else
					recordError(getStatus(), "Predicate symbol of %s missing from constraints library.",
							describe(predicate));
			}

		}
	}

	private AttributeVariableConstraint createAttributeVariableConstraint(final String predicateSymbol) {
		final org.moflon.tie.gt.constraints.democles.DemoclesFactory constraintsFactory = org.moflon.tie.gt.constraints.democles.DemoclesFactory.eINSTANCE;
		final AttributeVariableConstraint constraint = constraintsFactory.createAttributeVariableConstraint();
		constraint.setPredicateSymbol(predicateSymbol);
		return constraint;
	}

	private ConstraintVariable getConstraintVariable(final EditorPatternAttributeConstraintArgument predicateArgument) {
		if (predicateArgument instanceof EditorPatternAttributeConstraintAttributeValueExpression)
			return createVariable((EditorPatternAttributeConstraintAttributeValueExpression) predicateArgument);
		else if (predicateArgument instanceof EditorLiteralExpression)
			return createVariable((EditorLiteralExpression) predicateArgument);
		else if (predicateArgument instanceof EditorEnumExpression)
			return createVariable((EditorEnumExpression) predicateArgument);
		else if (predicateArgument instanceof EditorPatternAttributeConstraintVariableReference)
			return createVariable((EditorPatternAttributeConstraintVariableReference) predicateArgument);
		else if (predicateArgument instanceof EditorParameterExpression)
			return createVariable((EditorParameterExpression) predicateArgument, DemoclesPatternType.BLACK_PATTERN);
		else
			return null;
	}

	private Constant createVariable(final EditorEnumExpression expression) {
		final PatternBody body = Patterns.getBody(patterns.getBlackPattern());
		final EDataType enumDataType = types.getEClassifier(GTEnumExpressionHelper.getEnumDataType(expression));
		return Constants.createAndRegisterTypedConstant(expression, enumDataType, body);
	}

	/**
	 * Handle a reference to a local variable (only declared in the context of this
	 * constraint)
	 * 
	 * @param variableReference the reference
	 * @return the created variable
	 */
	private ConstraintVariable createVariable(
			final EditorPatternAttributeConstraintVariableReference variableReference) {
		final EditorPatternAttributeConstraintVariable editorVariable = variableReference.getName();
		return variables.getLocalVariable(editorVariable, DemoclesPatternType.BLACK_PATTERN);
	}

	private ConstraintVariable createVariable(final EditorLiteralExpression expression) {
		final PatternBody blackBody = Patterns.getBody(patterns.getBlackPattern());
		final EDataType eDataType = GTEditorAttributeUtils.guessEDataType(expression).orElse(null);
		return Constants.createAndRegisterTypedConstant(expression, eDataType, blackBody);
	}

	private ConstraintVariable createVariable(
			final EditorPatternAttributeConstraintAttributeValueExpression expression) {
		final PatternBody blackBody = Patterns.getBody(patterns.getBlackPattern());
		final EAttribute eAttribute = expression.getAttribute();
		final EditorNode editorNode = expression.getEditorNode();
		final EMFVariable emfObjectVariable = variables.getSymbolicParameter(editorNode,
				DemoclesPatternType.BLACK_PATTERN);
		final ConstraintVariable blackAttributeVariable;
		if (expression.isFree()) {
			blackAttributeVariable = variables.getSymbolicParameter(eAttribute, editorNode,
					DemoclesPatternType.BLACK_PATTERN, CodeConventions.FREE_VARIABLE_SUFFIX);

			final EMFVariable greenObjectVariable = variables.getSymbolicParameter(editorNode,
					DemoclesPatternType.GREEN_PATTERN);
			final ConstraintVariable greenAttributeVariable = variables.getSymbolicParameter(eAttribute, editorNode,
					DemoclesPatternType.GREEN_PATTERN, CodeConventions.FREE_VARIABLE_SUFFIX);
			final PatternBody greenBody = Patterns.getBody(patterns.getGreenPattern());
			AttributeValueConstraints.add(eAttribute, greenObjectVariable, greenAttributeVariable, greenBody);
		} else {
			blackAttributeVariable = variables.getLocalVariable(eAttribute, editorNode,
					DemoclesPatternType.BLACK_PATTERN);
			AttributeValueConstraints.add(eAttribute, emfObjectVariable, blackAttributeVariable, blackBody);
		}
		return blackAttributeVariable;
	}

	private String formatTypeList(final List<EClassifier> predicateArgumentTypes) {
		final String typeNames = predicateArgumentTypes.stream().map(TieGtEcoreUtil::formatEClassifier)
				.collect(Collectors.joining(","));
		return String.format("(%s)", typeNames);
	}

	/**
	 * Collects each {@link ConstraintSpecification} whose symbol is equal to the
	 * given symbol All libraries accessible via
	 * {@link #getAttributeConstraintsLibraries()} are consulted in order.
	 * 
	 * @param predicateSymbol the symbol to search for
	 * @return the list of {@link ConstraintSpecification} objects
	 */
	private List<ConstraintSpecification> getConstraintSpecificationsWithSymbol(final String predicateSymbol) {
		final AttributeConstraintsLibraryRegistry libraryRegistry = getAttributeConstraintsLibraries();
		return libraryRegistry.getUris().stream().map(uri -> libraryRegistry.getLibrary(uri))
				.flatMap(library -> library.getConstraintSpecifications().stream())
				.filter(constraintSpecification -> predicateSymbol.equals(constraintSpecification.getSymbol()))
				.collect(Collectors.toList());
	}

	/**
	 * @return the list of used {@link AttributeConstraintLibrary} objects
	 */
	private AttributeConstraintsLibraryRegistry getAttributeConstraintsLibraries() {
		return AttributeVariableConstraintType.getModule().getAttributeConstraintsLibraries();
	}

	private List<EClassifier> getPredicateArgumentTypes(final EditorPatternAttributeConstraintPredicate predicate) {
		final List<EClassifier> predicateArgumentTypes = new ArrayList<>();
		for (final EditorPatternAttributeConstraintArgument prediateArgument : predicate.getArgs()) {
			final EClassifier predicateArgumentType = getPredicateArgumentType(predicate, prediateArgument);

			if (hasErrors())
				break;

			predicateArgumentTypes.add(predicateArgumentType);
		}
		return predicateArgumentTypes;
	}

	private EClassifier getPredicateArgumentType(final EditorPatternAttributeConstraintPredicate predicate,
			final EditorPatternAttributeConstraintArgument prediateArgument) {
		if (prediateArgument instanceof EditorPatternAttributeConstraintAttributeValueExpression) {
			final EditorPatternAttributeConstraintAttributeValueExpression attributeValueExpression = (EditorPatternAttributeConstraintAttributeValueExpression) prediateArgument;
			return attributeValueExpression.getAttribute().getEType();
		} else if (prediateArgument instanceof EditorLiteralExpression) {
			final EditorLiteralExpression literalExpresion = (EditorLiteralExpression) prediateArgument;
			return GTEditorAttributeUtils.guessEDataType(literalExpresion).orElse(null);
		} else if (prediateArgument instanceof EditorEnumExpression) {
			final EditorEnumExpression enumExpression = (EditorEnumExpression) prediateArgument;
			return types.getEClassifier(enumExpression.getLiteral().getEEnum());
		} else if (prediateArgument instanceof EditorPatternAttributeConstraintVariableReference) {
			final EditorPatternAttributeConstraintVariableReference variableReference = (EditorPatternAttributeConstraintVariableReference) prediateArgument;
			return variableReference.getName().getType();
		} else if (prediateArgument instanceof EditorParameterExpression) {
			final EditorParameterExpression expression = (EditorParameterExpression) prediateArgument;
			return expression.getParameter().getType();
		} else {
			recordError(getStatus(), "Unsupported type of argument %s of predicate %s: %s", describe(prediateArgument),
					describe(predicate), prediateArgument);
			return null;
		}
	}

	private boolean haveSameParameterTypes(final ConstraintSpecification possibleConstraintSpecification,
			final List<EClassifier> predicateArgumentTypes) {
		final EList<ParameterType> constraintParameters = possibleConstraintSpecification.getParameterTypes();
		final int constraintParameterCount = constraintParameters.size();

		if (constraintParameterCount != predicateArgumentTypes.size())
			return false;

		for (int i = 0; i < constraintParameterCount; ++i) {
			final EClassifier constraintParameterType = types.getEClassifier(constraintParameters.get(i).getType());
			final EClassifier predicateArgumentType = types.getEClassifier(predicateArgumentTypes.get(i));
			if (!constraintParameterType.equals(predicateArgumentType))
				return false;
		}

		return true;
	}

	private EditorPattern flattenPattern(final EditorPattern editorPattern) {
		final GTFlattener flattener = new GTFlattener(editorPattern);
		final List<String> flatteningErrors = flattener.getErrors();
		for (final String errorMessage : flatteningErrors) {
			TransformationExceptions.recordError(transformationStatus, "Flattening of %s failed: %s",
					editorPattern.getName(), errorMessage);
		}
		final EditorPattern flattenedPattern = flattener.getFlattenedPattern();
		return flattenedPattern;
	}

	private void visit(final EditorCondition condition, final EditorPattern pattern) {
		final EList<EditorSimpleCondition> conditions = condition.getConditions();
		for (final EditorSimpleCondition partialCondition : conditions) {
			if (partialCondition instanceof EditorConditionReference) {
				final EditorConditionReference simpleCond = (EditorConditionReference) partialCondition;
				visit(simpleCond.getCondition(), pattern);
			} else {
				final EditorApplicationCondition simpleCond = (EditorApplicationCondition) partialCondition;
				final EditorGTFile gtFile = (EditorGTFile) simpleCond.getPattern().eContainer();
				final EditorPattern applicationCondition = flattenPattern(simpleCond.getPattern());
				gtFile.getPatterns().add(applicationCondition);
				final EditorApplicationConditionType type = simpleCond.getType();
				final Pattern invokedPattern = buildInvokedPattern(pattern, applicationCondition);
				createPatternInvocation(type, invokedPattern);
			}
		}
	}

	private void visit(final EditorAttribute editorAttribute, final EditorNode source, final EditorPattern pattern) {
		final DemoclesPatternType type = Patterns.getPatternTypeForOperator(editorAttribute);

		initializeVariablesForParameters(pattern, type);
		final PatternBody body = Patterns.getBody(patterns.get(type));

		final EditorExpression expr = editorAttribute.getValue();
		final ConstraintParameter rhs = getConstraintParameter(editorAttribute, source, type, body, expr);// TODO@rkluge:Add
																											// prefix
																											// param__
																											// to
																											// EMFVariables
																											// originating
																											// from
																											// paramters

		if (hasErrors())
			return;

		final EAttribute editorAttributeEAttribute = editorAttribute.getAttribute();

		final EMFVariable fromVariable = variables.getSymbolicParameter(source, type);
		final EMFVariable tmpAttributeValueVariable = variables.getLocalVariable(editorAttributeEAttribute, source,
				type);

		Attributes.add(editorAttributeEAttribute, fromVariable, tmpAttributeValueVariable, body);

		final ConstraintParameter leftOperatorArgumentParameter = ConstraintParameters
				.create(tmpAttributeValueVariable);

		final RelationalConstraint relationalConstraint = RelationalConstraints
				.createRelationalConstraint(editorAttribute, getStatus());
		if (relationalConstraint == null)
			return;

		relationalConstraint.getParameters().add(leftOperatorArgumentParameter);
		relationalConstraint.getParameters().add(rhs);
		body.getConstraints().add(relationalConstraint);
	}

	private ConstraintParameter getConstraintParameter(final EditorAttribute editorAttribute, final EditorNode source,
			final DemoclesPatternType type, final PatternBody body, final EditorExpression expr) {
		final ConstraintVariable rhsVariable;
		if (expr instanceof EditorAttributeExpression)
			rhsVariable = createVariable((EditorAttributeExpression) expr, type, body);
		else if (expr instanceof EditorLiteralExpression)
			rhsVariable = createAndRegisterConstant((EditorLiteralExpression) expr, editorAttribute, source, body);
		else if (expr instanceof EditorEnumExpression)
			rhsVariable = Constants.createAndRegister((EditorEnumExpression) expr, body);
		else if (expr instanceof EditorParameterExpression)
			rhsVariable = createVariable((EditorParameterExpression) expr, type);
		else {
			recordError(getStatus(), "Cannot handle %s", expr);
			rhsVariable = null;
		}
		final ConstraintParameter rhs = ConstraintParameters.create(rhsVariable);
		return rhs;
	}

	private void visit(final EditorReference editorReference, final EditorNode source,
			final EditorPattern editorPattern) {
		final List<DemoclesPatternType> patternTypes = Patterns.mapOperatorToPatternTypes(editorReference, getStatus());
		if (patternTypes == null)
			return;

		for (final DemoclesPatternType type : patternTypes) {

			initializeVariablesForParameters(editorPattern, type);
			final PatternBody patternBody = Patterns.getBody(patterns.get(type));

			final EMFVariable fromVariable = variables.getSymbolicParameter(source, type);

			final ConstraintParameter from = ConstraintParameters.create(fromVariable);

			final EditorNode editorReferenceTarget = editorReference.getTarget();
			final EMFVariable toVariable = variables.getSymbolicParameter(editorReferenceTarget, type);
			final ConstraintParameter to = ConstraintParameters.create(toVariable);

			final EReference referenceType = types.getEReference(editorReference.getType(), source.getType());
			References.add(from, to, referenceType, patternBody);
		}
	}

	private Pattern buildInvokedPattern(final EditorPattern invoker, final EditorPattern invokee) {

		final PatternBuilderVisitor invokeeVisitor = new PatternBuilderVisitor(types, transformationStatus);

		final EditorPattern copiedInvokee = createPatternWithCastingSourceNodes(invoker, invokee);

		final PatternLookup nacLookup = invokeeVisitor.visit(copiedInvokee);

		if (hasErrors())
			return null;

		final Pattern invokeeDemoclesPattern;
		if (nacLookup.hasBindingAndBlack()) {
			invokeeDemoclesPattern = nacLookup.getBindingAndBlackPattern();
			invokeeDemoclesPattern.setName(DemoclesPatternType.BINDING_AND_BLACK_PATTERN.getSuffix());
		} else {
			invokeeDemoclesPattern = nacLookup.getBlackPattern();
			invokeeDemoclesPattern.setName(DemoclesPatternType.BLACK_PATTERN.getSuffix());
		}
		return invokeeDemoclesPattern;
	}

	/**
	 * For each nodes that is present in both the invoker pattern and the invoked
	 * pattern, an additional
	 * 
	 * @param invokerPattern
	 * @param invokedPattern
	 * @return
	 */
	private EditorPattern createPatternWithCastingSourceNodes(final EditorPattern invokerPattern,
			final EditorPattern invokedPattern) {
		final EditorPattern copiedInvokedPattern = EcoreUtil.copy(invokedPattern);
		final EditorGTFile gtFile = (EditorGTFile) invokedPattern.eContainer();
		gtFile.getPatterns().add(copiedInvokedPattern);

		final List<EditorNode> commonInvokedNodes = collectCommonNodes(invokerPattern, copiedInvokedPattern);

		for (final EditorNode invokedNode : commonInvokedNodes) {
			final EditorNode invokerNode = findNodeWithName(invokerPattern, invokedNode.getName()).get();
			if (!invokedNode.getType().equals(invokerNode.getType())) {
				if (hasBinding(invokedNode)) {
					recordError(transformationStatus,
							"Node %s in invoked pattern %s has a binding and cannot be used in a condition with type cast due to editor nodes with same names but different types (invoker pattern: %s).",
							describe(invokedNode), describe(invokerPattern), describe(invokerPattern));
				} else if (TieGtEcoreUtil.haveSuperTypeSubtypeRelation(invokedNode, invokerNode)) {
					addCastingSourceNode(copiedInvokedPattern, invokedNode, invokerNode);
				} else if (!TieGtEcoreUtil.haveSuperTypeSubtypeRelation(invokerNode, invokedNode)) {
					recordError(transformationStatus,
							"Node %s in invoking pattern %s is neither a super nor sub-type of node %s in invoked pattern %s",
							describe(invokerNode), describe(invokerPattern), describe(invokedNode),
							describe(invokerPattern));
				}
			}
		}
		return copiedInvokedPattern;
	}

	/**
	 * Collects all {@link EditorNode} objects in the invoked {@link EditorPattern}
	 * for which an {@link EditorNode} with the same name exists in the invoker
	 * pattern
	 * 
	 * @param invokerPattern the invoked pattern
	 * @param invokedPattern the invoker pattern
	 * @return
	 */
	private static List<EditorNode> collectCommonNodes(final EditorPattern invokerPattern,
			final EditorPattern invokedPattern) {
		final List<EditorNode> invokedNodes = invokedPattern.getNodes().stream()
				.filter(invokedNode -> findNodeWithName(invokerPattern, invokedNode.getName()).isPresent())
				.collect(Collectors.toList());
		return invokedNodes;
	}

	/**
	 * We add an {@link EditorNode} to the invoked pattern that has the same type as
	 * the invoker {@link EditorNode} and bind.
	 * 
	 * @param invokedPattern
	 * @param invokedNode
	 * @param invokerNode
	 */
	private void addCastingSourceNode(final EditorPattern invokedPattern, final EditorNode invokedNode,
			final EditorNode invokerNode) {
		final EditorNode castingSourceNode = GTFactory.eINSTANCE.createEditorNode();
		castingSourceNode.setName(CodeConventions.deriveCastingSourceNodeName(invokedNode));
		castingSourceNode.setType(invokerNode.getType());
		invokedPattern.getNodes().add(castingSourceNode);

		final EditorBindingExpression binding = GTFactory.eINSTANCE.createEditorBindingExpression();
		binding.setNode(castingSourceNode);
		invokedNode.setBinding(binding);
	}

	private static Optional<EditorNode> findNodeWithName(final EditorPattern pattern, final String name) {
		final Optional<EditorNode> invokerNodeNameMatch = pattern.getNodes().stream().filter(invokingNode -> {
			return invokingNode.getName().equals(name);
		}).findAny();
		return invokerNodeNameMatch;
	}

	private void createPatternInvocation(final EditorApplicationConditionType type, final Pattern invokedPattern) {
		final PatternInvocationConstraint invocationConstraint = SpecificationFactory.eINSTANCE
				.createPatternInvocationConstraint();
		final Pattern pattern = patterns.getBlackPattern();
		final List<Variable> invokerParameters = pattern.getSymbolicParameters();
		final boolean isPositive = isPositive(type);
		invocationConstraint.setPositive(isPositive);
		invocationConstraint.setInvokedPattern(invokedPattern);
		createConstraintParameters(invokedPattern, invocationConstraint, invokerParameters);
		Patterns.addConstraint(invocationConstraint, Patterns.getBody(pattern));
	}

	private static boolean isPositive(final EditorApplicationConditionType conditionType) {
		return conditionType == EditorApplicationConditionType.POSITIVE ? true : false;
	}

	private void createConstraintParameters(final Pattern invokee,
			final PatternInvocationConstraint invocationConstraint, final List<Variable> invokerParameters) {
		final List<Variable> symbolicParametersToMove = new ArrayList<>();
		invokee.getSymbolicParameters().forEach(invokeeParameters -> {
			final String variableName = invokeeParameters.getName();
			final String variableNameWithoutCastinPrefix = variableName.replace(CodeConventions.CASTING_SOURCE_PREFIX,
					"");
			final Optional<Variable> candidateVariable = Patterns.findVariableByName(invokerParameters,
					variableNameWithoutCastinPrefix);
			if (candidateVariable.isPresent()) {

				final ConstraintParameter constraintParameter = ConstraintParameters.create(candidateVariable.get());
				invocationConstraint.getParameters().add(constraintParameter);

			} else {
				symbolicParametersToMove.add(invokeeParameters);
			}

		});
		symbolicParametersToMove
				.forEach(symbolicParam -> Patterns.moveSymbolicParameterToLocalVariable(symbolicParam, invokee));
	}

	private void initializeVariablesForParameters(final EditorPattern pattern, final DemoclesPatternType patternType) {
		pattern.getParameters().forEach(param -> createVariable(param, patternType));
	}

	private void createVariable(final EditorParameter param, final DemoclesPatternType type) {
		switch (type) {
		case RED_PATTERN:
			return;
		default:
			variables.getSymbolicParameter(param, type);
		}
	}

	private void createBindingAndBlackPattern(final EditorNode node) {

		final EditorBindingExpression bindingExpression = node.getBinding();
		final EditorNode source = bindingExpression.getNode();

		final Pattern bindingAndBlack = patterns.getBindingAndBlackPattern();
		final PatternBody body = Patterns.getBody(bindingAndBlack);

		final DemoclesPatternType patternType = DemoclesPatternType.BINDING_AND_BLACK_PATTERN;
		final EMFVariable emfVarSource = variables.getSymbolicParameter(source, patternType);

		final Pattern blackPattern = patterns.getBlackPattern();

		final EMFVariable toBeRemoved = variables.getSymbolicParameter(source, DemoclesPatternType.BLACK_PATTERN);
		Patterns.removeSymbolicParameter(toBeRemoved, blackPattern);

		final EMFVariable emfVarTarget = variables.getLocalVariable(node, patternType);

		final Pattern bindingPattern = patterns.getBindingPattern();
		final List<Variable> bindingParameters = Arrays.asList(emfVarTarget, emfVarSource);
		PatternInvocationConstraints.add(bindingPattern, true, bindingParameters, body);

		final List<Variable> blackParameters = Arrays.asList(emfVarTarget);
		PatternInvocationConstraints.add(blackPattern, true, blackParameters, body);
	}

	private void createBindingConstraint(final EditorNode node) {

		final Pattern bindingPattern = patterns.getBindingPattern();
		final PatternBody body = Patterns.getBody(bindingPattern);

		final DemoclesPatternType patternType = DemoclesPatternType.BINDING_PATTERN;
		final EMFVariable emfVarTarget = variables.getSymbolicParameter(node, patternType);
		final EditorBindingExpression bindingExpression = node.getBinding();

		final EditorNode source = bindingExpression.getNode();
		final EMFVariable emfVarSource = variables.getSymbolicParameter(source, patternType);

		RelationalConstraints.addEqual(emfVarSource, emfVarTarget, body);
	}

	/**
	 * Creates an inequalConstraint and adds it to another body if both supplied
	 * nodes are above each other in the inheritance chain
	 */
	private static void createUnequalConstraintIfNecessary(final EMFVariable variable1, final EMFVariable variable2,
			final PatternBody body) {
		if (TieGtEcoreUtil.haveSuperTypeSubtypeRelationEMF(variable1, variable2)) {
			RelationalConstraints.addUnequal(variable1, variable2, body);
		}
	}

	private EMFVariable createVariable(final EditorAttributeExpression attributeExpression,
			final DemoclesPatternType type, final PatternBody patternBody) {
		final EAttribute eAttribute = attributeExpression.getAttribute();
		final EditorNode editorNode = attributeExpression.getNode();

		final EMFVariable fromVarAttributeExpression = variables.getSymbolicParameter(editorNode, type);
		final EMFVariable attribute = variables.getLocalVariable(eAttribute, editorNode, type);

		Attributes.add(eAttribute, fromVarAttributeExpression, attribute, patternBody);

		return attribute;
	}

	private EMFVariable createVariable(final EditorParameterExpression editorParamExpression,
			final DemoclesPatternType type) {
		final EditorParameter parameter = editorParamExpression.getParameter();
		final EMFVariable variable = variables.getSymbolicParameter(parameter, type);
		variable.setName(CodeConventions.getPatternParameterName(variable.getName()));
		return variable;
	}

	private Constant createAndRegisterConstant(final EditorLiteralExpression literalExpression,
			final EditorAttribute editorAttribute, final EditorNode source, final PatternBody patternBody) {
		final EClass eClass = types.getEClassifier(source.getType());
		final EAttribute eAttribute = types.getEAttribute(editorAttribute.getAttribute(), eClass);
		final EDataType type = eAttribute.getEAttributeType();
		final Constant constant = Constants.add(literalExpression, type, patternBody);
		return constant;
	}

	private EMFVariable getReturnVariable(final EObject returnObject, final Pattern pattern) {
		return variables.getReturnVariable(returnObject, pattern);
	}

	private boolean hasErrors() {
		return getStatus().matches(IStatus.ERROR);
	}

	private MultiStatus getStatus() {
		return transformationStatus;
	}
}
