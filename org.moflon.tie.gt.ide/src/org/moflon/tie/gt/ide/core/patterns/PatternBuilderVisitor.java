package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
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
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeCondition;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraint;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintArgument;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintAttributeValueExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintPredicate;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorSimpleCondition;
import org.emoflon.ibex.gt.editor.utils.GTEditorAttributeUtils;
import org.emoflon.ibex.gt.editor.utils.GtPrettyPrinter;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.sdm.constraints.democles.AttributeVariableConstraint;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.sdm.constraints.operationspecification.ConstraintSpecification;
import org.moflon.sdm.constraints.operationspecification.ParameterType;
import org.moflon.sdm.constraints.operationspecification.constraint.AttributeVariableConstraintType;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.tie.gt.ide.core.patterns.util.AttributeValueConstraints;
import org.moflon.tie.gt.ide.core.patterns.util.Attributes;
import org.moflon.tie.gt.ide.core.patterns.util.Constants;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationActions;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationConstraints;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;
import org.moflon.tie.gt.ide.core.patterns.util.RelationalConstraints;
import org.moflon.tie.gt.ide.core.patterns.util.TieGtEcoreUtil;
import org.moflon.tie.gt.ide.core.patterns.util.TransformationExceptions;
import org.moflon.tie.gt.ide.core.runtime.utilities.TypeLookup;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.LiteralExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatementParameter;

public class PatternBuilderVisitor {
	private PatternLookup patterns;
	private VariableLookupTable variables;
	private final TypeLookup types;
	private final MultiStatus transformationStatus;

	public PatternBuilderVisitor(final List<EPackage> ePackages, final ResourceSet resourceSet,
			final MultiStatus transformationStatus) {
		this.transformationStatus = transformationStatus;

		patterns = new PatternLookup();
		types = new TypeLookup(ePackages);
		variables = new VariableLookupTable(patterns, types);
	}

	public PatternLookup visit(final EditorPattern pattern) {

		// TODO@rkluge: If pattern is contained in EditorGtFile, then select this file
		// as main attribute library provider
//		AttributeVariableConstraintType.getModule().setMainConstraintLibrary

		if (hasErrors())
			return null;

		pattern.getNodes().forEach(n -> visit(n, pattern));

		pattern.getComplexAttributeConstraints().forEach(cac -> visit(cac, pattern));

		pattern.getConditions().forEach(condition -> visit(condition, pattern));

		return patterns;
	}

	Pattern createExpressionPatternForObjectVariables(final CFVariable returnVariable) {
		final Pattern pattern = patterns.createAndRegisterExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final EMFVariable target = getReturnVariable(returnVariable, pattern);

		final EMFVariable source = variables.getSymbolicParameter(returnVariable,
				DemoclesPatternType.EXPRESSION_PATTERN);

		RelationalConstraints.createAndRegisterEqualConstraint(source, target, body);

		return pattern;
	}

	Pattern createExpressionPatternForObjectVariableAttribute(final CFVariable returnVariable,
			final EAttribute attribute) {
		final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
		final Pattern pattern = patterns.createAndRegisterExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final EClassifier returnVariableType = returnVariable.getType();
		if (!(returnVariableType instanceof EClass)) {
			TransformationExceptions.recordTransformationErrorMessage(getStatus(),
					"Type of %s should be an EClass, but was %s", returnVariable, returnVariableType.getName());
			return null;
		}

		final EClass returnValueClass = (EClass) returnVariableType;
		if (!returnValueClass.getEAllAttributes().contains(attribute)) {
			TransformationExceptions.recordTransformationErrorMessage(getStatus(), "%s has no EAttribute %s",
					returnValueClass.getName(), attribute.getName());
			return null;
		}

		final EMFVariable emfReturnVariable = getReturnVariable(attribute, pattern);

		final EMFVariable emfObjectVariable = variables.getSymbolicParameter(returnVariable, patternType);

		final EMFVariable attributeVariable = variables.getLocalVariable(attribute, returnVariable.getName(),
				patternType);

		Attributes.createAndRegister(attribute, emfObjectVariable, attributeVariable, body);

		RelationalConstraints.createAndRegisterEqualConstraint(attributeVariable, emfReturnVariable, body);

		return pattern;
	}

	Pattern createExpressionPatternForLiteralValues(final CFVariable returnVariable, final String value) {
		final Pattern pattern = patterns.createAndRegisterExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final Constant source = SpecificationFactory.eINSTANCE.createConstant();
		Constants.setConstantValueWithAdjustedType(source, Constants.getValueForType(returnVariable.getType(), value));
		Patterns.registerConstant(body, source);

		final EMFVariable resultEmfVariable = getReturnVariable(returnVariable, pattern);

		RelationalConstraints.createAndRegisterEqualConstraint(source, resultEmfVariable, body);

		return body.getHeader();
	}

	Pattern createExpressionPatternForEnumValues(final CFVariable returnVariable, final EEnumLiteral enumLiteral) {

		final Pattern pattern = patterns.createAndRegisterExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final EMFVariable resultEmfVariable = getReturnVariable(returnVariable, pattern);

		final Constant source = SpecificationFactory.eINSTANCE.createConstant();
		Constants.setConstantValueWithAdjustedType(source, enumLiteral);
		Patterns.registerConstant(body, source);

		final Equal equal = RelationalConstraints.createAndRegisterEqualConstraint(source, resultEmfVariable, body);
		Patterns.registerConstraint(equal, body);

		return pattern;
	}

	Pattern createExpressionPatternForOperationInvocation(final CFVariable calleeVariable,
			final CFVariable resultCFVariable, final List<CFVariable> parameterCFVariables, final EOperation eOperation,
			final EList<OperationCallStatementParameter> operationParameters) {

		final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
		final Pattern pattern = patterns.createAndRegisterExpressionPattern();
		final PatternBody body = Patterns.getBody(pattern);

		final Operation operationConstraint = PatternInvocationActions.createOperationConstraint(eOperation);

		// Handle callee
		final EMFVariable calleeEmfVariable = variables.getSymbolicParameter(calleeVariable, patternType);
		operationConstraint.getParameters().add(Patterns.createConstraintParameter(calleeEmfVariable));

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
				constraintParameter = Patterns.createConstraintParameter(parameterEmfVariable);
			} else {
				final LiteralExpression literalExpression = operationParameter.getLiteral();
				final Constant constant = Constants.createConstant(literalExpression,
						eOperation.getEParameters().get(counter), body, getStatus());
				constraintParameter = Patterns.createConstraintParameter(constant);
			}
			operationConstraint.getParameters().add(constraintParameter);
			++counter;
		}

		Patterns.registerConstraint(operationConstraint, body);

		if (!TieGtEcoreUtil.isVoidOperation(eOperation)) {
			// Local variable for storing the EOperation result
			final EMFVariable operationResultVariable = variables.getLocalVariable("_localVariable0",
					eOperation.getEType(), patternType);

			// IMPORTANT: The first constraint parameter is interpreted as return variable
			// (for non-void EOperations)
			operationConstraint.getParameters().add(0, Patterns.createConstraintParameter(operationResultVariable));

			final EMFVariable resultEmfVariable = getReturnVariable(resultCFVariable, pattern);

			RelationalConstraints.createAndRegisterEqualConstraint(operationResultVariable, resultEmfVariable, body);
		}

		return pattern;
	}

	private void visit(final EditorNode node, final EditorPattern editorPattern) {
		final List<DemoclesPatternType> patternTypes = Patterns.mapOperatorToPatternTypes(node, getStatus());
		if (patternTypes == null) {
			return;
		}

		for (final DemoclesPatternType type : patternTypes) {
			if (!patterns.hasPatternForType(type)) {
				createPattern(editorPattern, type);
			}

			variables.getSymbolicParameter(node, type);
		}
		node.getAttributes().forEach(attribute -> visit(attribute, node, editorPattern));
		node.getReferences().forEach(reference -> visit(reference, node, editorPattern));

		if (node.getBinding() != null) {
			createBindingPattern(node);
			createBindingAndBlackPattern(node);
		}
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
						final Pattern blackPattern = this.patterns.getBlackPattern();
						final PatternBody body = Patterns.getBody(blackPattern);

						final org.moflon.sdm.constraints.democles.DemoclesFactory constraintsFactory = org.moflon.sdm.constraints.democles.DemoclesFactory.eINSTANCE;
						final AttributeVariableConstraint attributeVariableConstraint = constraintsFactory
								.createAttributeVariableConstraint();
						attributeVariableConstraint.setPredicateSymbol(predicateSymbol);
						for (final EditorPatternAttributeConstraintArgument predicateArgument : predicate.getArgs()) {
							final ConstraintVariable variable;
							if (predicateArgument instanceof EditorPatternAttributeConstraintAttributeValueExpression) {
								final EditorPatternAttributeConstraintAttributeValueExpression attributeValueExpression = EditorPatternAttributeConstraintAttributeValueExpression.class
										.cast(predicateArgument);
								final EAttribute eAttribute = attributeValueExpression.getAttribute();
								final EditorNode editorNode = attributeValueExpression.getEditorNode();
								variable = variables.getLocalVariable(eAttribute, editorNode,
										DemoclesPatternType.BLACK_PATTERN);

								final EMFVariable emfObjectVariable = variables.getSymbolicParameter(editorNode,
										DemoclesPatternType.BLACK_PATTERN);

								AttributeValueConstraints.createAndRegister(eAttribute, emfObjectVariable, variable,
										body);
							} else if (predicateArgument instanceof EditorLiteralExpression) {
								final EditorLiteralExpression literalExpression = EditorLiteralExpression.class
										.cast(predicateArgument);
								final EDataType eDataType = GTEditorAttributeUtils.guessEDataType(literalExpression)
										.orElse(null);
								variable = Constants.createAndRegisterTypedConstant(literalExpression, eDataType, body);
							} else if (predicateArgument instanceof EditorEnumExpression) {
								final EditorEnumExpression enumExpression = EditorEnumExpression.class
										.cast(predicateArgument);
								variable = Constants.createAndRegister(enumExpression, body);
							} else {
								// Never happens due to preceding checks
								variable = null;
							}
							final ConstraintParameter constraintParameter = Patterns
									.createConstraintParameter(variable);
							attributeVariableConstraint.getParameters().add(constraintParameter);
						}

						body.getConstraints().add(attributeVariableConstraint);
					} else {
						TransformationExceptions.recordTransformationErrorMessage(getStatus(),
								"No constraint specification with symbol %s matches the type signature %s of predicate %s",
								predicateSymbol, formatTypeList(predicateArgumentTypes), GtPrettyPrinter.format(predicate));
					}

				} else {
					TransformationExceptions.recordTransformationErrorMessage(getStatus(),
							"Predicate symbol of %s not in constraints library.", GtPrettyPrinter.format(predicate));
				}
			}

		}
	}

	private String formatTypeList(final List<EClassifier> predicateArgumentTypes) {
		return predicateArgumentTypes.stream().map(TieGtEcoreUtil::formatEClassifier).collect(Collectors.joining(","));
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
		return getAttributeConstraintsLibraries().stream()
				.flatMap(library -> library.getConstraintSpecifications().stream())
				.filter(constraintSpecification -> predicateSymbol.equals(constraintSpecification.getSymbol()))
				.collect(Collectors.toList());
	}

	/**
	 * @return the list of used {@link AttributeConstraintLibrary} objects
	 */
	private Collection<AttributeConstraintLibrary> getAttributeConstraintsLibraries() {
		return AttributeVariableConstraintType.getModule().getAttributeConstraintsLibraries();
	}

	private List<EClassifier> getPredicateArgumentTypes(final EditorPatternAttributeConstraintPredicate predicate) {
		final List<EClassifier> predicateArgumentTypes = new ArrayList<>();
		for (final EditorPatternAttributeConstraintArgument prediateArgument : predicate.getArgs()) {
			final EClassifier predicateArgumentType;
			if (prediateArgument instanceof EditorPatternAttributeConstraintAttributeValueExpression) {
				final EditorPatternAttributeConstraintAttributeValueExpression attributeValueExpression = (EditorPatternAttributeConstraintAttributeValueExpression) prediateArgument;
				predicateArgumentType = attributeValueExpression.getAttribute().getEType();
			} else if (prediateArgument instanceof EditorLiteralExpression) {
				final EditorLiteralExpression literalExpresion = (EditorLiteralExpression) prediateArgument;
				predicateArgumentType = GTEditorAttributeUtils.guessEDataType(literalExpresion).orElse(null);
			} else if (prediateArgument instanceof EditorEnumExpression) {
				final EditorEnumExpression enumExpression = (EditorEnumExpression) prediateArgument;
				predicateArgumentType = enumExpression.getLiteral().getEEnum();
			} else {
				TransformationExceptions.recordTransformationErrorMessage(getStatus(),
						"Unsupported type of argument %s of predicate %s", prediateArgument, predicate);
				break;
			}

			predicateArgumentTypes.add(predicateArgumentType);
		}
		return predicateArgumentTypes;
	}

	private boolean haveSameParameterTypes(final ConstraintSpecification possibleConstraintSpecification,
			final List<EClassifier> predicateArgumentTypes) {
		final EList<ParameterType> constraintParameters = possibleConstraintSpecification.getParameterTypes();
		final int constraintParameterCount = constraintParameters.size();

		if (constraintParameterCount != predicateArgumentTypes.size())
			return false;

		for (int i = 0; i < constraintParameterCount; ++i) {
			final EClassifier constraintParameterType = constraintParameters.get(i).getType();
			final EClassifier predicateArgumentType = predicateArgumentTypes.get(i);
			if (!constraintParameterType.equals(predicateArgumentType))
				return false;
		}

		return true;
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
		final DemoclesPatternType type = Patterns.getPatternTypeForOperator(editorAttribute);

		if (!patterns.hasPatternForType(type)) {
			createPattern(pattern, type);
		}
		final PatternBody body = Patterns.getBody(patterns.getPattern(type));

		final EditorExpression expr = editorAttribute.getValue();
		final ConstraintVariable rhsVariable;
		if (expr instanceof EditorAttributeExpression) {
			rhsVariable = createVariable((EditorAttributeExpression) expr, type, body);
		} else if (expr instanceof EditorLiteralExpression) {
			rhsVariable = createAndRegisterConstant((EditorLiteralExpression) expr, editorAttribute, source, body);
		} else if (expr instanceof EditorEnumExpression) {
			rhsVariable = Constants.createAndRegister((EditorEnumExpression) expr, body);
		} else if (expr instanceof EditorParameterExpression) {
			rhsVariable = createVariable((EditorParameterExpression) expr, type);
		} else {
			TransformationExceptions.recordTransformationErrorMessage(getStatus(), "Cannot handle %s", expr);
			return;
		}
		final ConstraintParameter rhs = Patterns.createConstraintParameter(rhsVariable);

		final EAttribute editorAttributeEAttribute = editorAttribute.getAttribute();

		final EMFVariable fromVariable = variables.getSymbolicParameter(source, type);
		final EMFVariable tmpAttributeValueVariable = variables.getLocalVariable(editorAttributeEAttribute, source,
				type);

		Attributes.createAndRegister(editorAttributeEAttribute, fromVariable, tmpAttributeValueVariable, body);

		final ConstraintParameter leftOperatorArgumentParameter = Patterns
				.createConstraintParameter(variables.getLocalVariable(editorAttributeEAttribute, source, type));

		final RelationalConstraint relationalConstraint = RelationalConstraints
				.createRelationalConstraint(editorAttribute, getStatus());
		if (relationalConstraint == null)
			return;

		relationalConstraint.getParameters().add(leftOperatorArgumentParameter);
		relationalConstraint.getParameters().add(rhs);
		body.getConstraints().add(relationalConstraint);
	}

	private void visit(final EditorReference editorReference, final EditorNode source,
			final EditorPattern editorPattern) {
		final List<DemoclesPatternType> patternTypes = Patterns.mapOperatorToPatternTypes(editorReference, getStatus());
		if (patternTypes == null)
			return;

		for (final DemoclesPatternType type : patternTypes) {
			if (!patterns.hasPatternForType(type)) {
				createPattern(editorPattern, type);
			}
			final PatternBody patternBody = patterns.getPattern(type).getBodies().get(0);

			final EMFVariable fromVariable = variables.getSymbolicParameter(source, type);

			final ConstraintParameter from = Patterns.createConstraintParameter(fromVariable);

			final EditorNode editorReferenceTarget = editorReference.getTarget();
			final EMFVariable toVariable = variables.getSymbolicParameter(editorReferenceTarget, type);
			final ConstraintParameter to = Patterns.createConstraintParameter(toVariable);

			final Reference referenceConstraint = EMFTypeFactory.eINSTANCE.createReference();
			final EReference referenceType = types.getEReference(editorReference.getType(), source.getType());
			referenceConstraint.setEModelElement(referenceType);
			referenceConstraint.getParameters().add(from);
			referenceConstraint.getParameters().add(to);
			patternBody.getConstraints().add(referenceConstraint);
		}
	}

	private Pattern buildApplicationConditionPattern(final EditorPattern applicationCondition) {

		// Store the current state to restore it after constraint has been processed
		final PatternLookup patternCache = patterns;
		patterns = new PatternLookup();

		final VariableLookupTable variableCache = variables;
		variables = new VariableLookupTable(patterns, types);

		visit(applicationCondition);

		if (hasErrors())
			return null;

		final Pattern newInvokedPattern = patterns.getBlackPattern();

		// Restore lookup tables
		patterns = patternCache;
		variables = variableCache;
		return newInvokedPattern;
	}

	private void createPatternInvocation(final EditorApplicationConditionType type, final Pattern newInvokedPattern) {
		final PatternInvocationConstraint invocationConstraint = SpecificationFactory.eINSTANCE
				.createPatternInvocationConstraint();
		final Pattern pattern = patterns.getBlackPattern();
		final EList<Variable> symbolicParamsInvoker = pattern.getSymbolicParameters();
		final boolean isPositive = type == EditorApplicationConditionType.POSITIVE ? true : false;
		invocationConstraint.setPositive(isPositive);
		invocationConstraint.setInvokedPattern(newInvokedPattern);
		createConstraintParameters(newInvokedPattern, invocationConstraint, symbolicParamsInvoker);
		Patterns.registerConstraint(invocationConstraint, Patterns.getBody(pattern));
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
				if (symbolicParam instanceof EMFVariable) {
					final EMFVariable symParamEMF = (EMFVariable) symbolicParam;
					if (match.get() instanceof EMFVariable) {
						final EMFVariable varOnInvokerSide = (EMFVariable) match.get();
						if (varOnInvokerSide.getEClassifier() instanceof EClass
								&& symParamEMF.getEClassifier() instanceof EClass) {
							final EClass invokerSideEClass = (EClass) varOnInvokerSide.getEClassifier();
							final EClass invokeSideEClass = (EClass) symParamEMF.getEClassifier();
							if (invokeSideEClass.getEAllSuperTypes().contains(invokerSideEClass)) {
								final PatternBody patternBody = Patterns.getBody(invokedPattern);

								// Create temporary EMFVariable for casting
								final String variableName = "casted" + symParamEMF.getName();
								final EMFVariable superTypeVariable = variables.getSymbolicParameter(variableName,
										invokerSideEClass, DemoclesPatternType.BLACK_PATTERN);

								Patterns.removeSymbolicParameter(invokedPattern, symParamEMF);
								patternBody.getLocalVariables().add(symParamEMF);

								RelationalConstraints.createAndRegisterEqualConstraint(superTypeVariable, symbolicParam,
										patternBody);
								constraintParameter = Patterns.createConstraintParameter(superTypeVariable);
							}
						}
					}
				}
				if (constraintParameter == null) {
					constraintParameter = Patterns.createConstraintParameter(match.get());
				}
				invocationConstraintNegative.getParameters().add(constraintParameter);
			} else {
				symbolicParametersToMove.add(symbolicParam);
			}

		});
		symbolicParametersToMove
				.forEach(symbolicParam -> Patterns.moveSymbolicParameterToLocalVariable(symbolicParam, invokedPattern));
	}

	private void createPattern(final EditorPattern pattern, final DemoclesPatternType patternType) {
		final Pattern democlesPattern = SpecificationFactory.eINSTANCE.createPattern();
		patterns.registerPattern(patternType, democlesPattern);
		final PatternBody body = SpecificationFactory.eINSTANCE.createPatternBody();
		body.setHeader(democlesPattern);
		pattern.getParameters().forEach(param -> createEMFVariableFromEditorParameter(param, patternType));
	}

	private void createEMFVariableFromEditorParameter(final EditorParameter param, final DemoclesPatternType type) {
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

		final DemoclesPatternType patternType = DemoclesPatternType.BINDING_AND_BLACK_PATTERN;
		final Pattern bindingAndBlack = patterns.createAndRegisterPattern(patternType);
		final PatternBody body = Patterns.getBody(bindingAndBlack);

		final EMFVariable emfVarSource = variables.getSymbolicParameter(source, patternType);

		final Pattern blackPattern = patterns.getBlackPattern();

		final EMFVariable toBeRemoved = variables.getSymbolicParameter(source, DemoclesPatternType.BLACK_PATTERN);
		Patterns.removeSymbolicParameter(blackPattern, toBeRemoved);

		final EMFVariable emfVarTarget = variables.getLocalVariable(node, patternType);

		final Pattern bindingPattern = patterns.getBindingPattern();
		final List<Variable> bindingParameters = Arrays.asList(emfVarTarget, emfVarSource);
		PatternInvocationConstraints.createAndRegister(bindingPattern, true, bindingParameters, body);

		final List<Variable> blackParameters = Arrays.asList(emfVarTarget);
		PatternInvocationConstraints.createAndRegister(blackPattern, true, blackParameters, body);
	}

	private void createBindingPattern(final EditorNode node) {

		final DemoclesPatternType patternType = DemoclesPatternType.BINDING_PATTERN;
		final Pattern bindingPattern = patterns.createAndRegisterPattern(patternType);
		final PatternBody body = Patterns.getBody(bindingPattern);

		final EMFVariable emfVarTarget = variables.getSymbolicParameter(node, patternType);
		final EditorBindingExpression bindingExpression = node.getBinding();

		final EditorNode source = bindingExpression.getNode();
		final EMFVariable emfVarSource = variables.getSymbolicParameter(source, patternType);

		body.setHeader(bindingPattern);

		RelationalConstraints.createAndRegisterEqualConstraint(emfVarSource, emfVarTarget, body);
	}

	private EMFVariable createVariable(final EditorAttributeExpression attributeExpression,
			final DemoclesPatternType type, final PatternBody patternBody) {
		final EAttribute eAttribute = attributeExpression.getAttribute();
		final EditorNode editorNode = attributeExpression.getNode();

		final EMFVariable fromVarAttributeExpression = variables.getSymbolicParameter(editorNode, type);
		final EMFVariable attribute = variables.getLocalVariable(eAttribute, editorNode, type);

		Attributes.createAndRegister(eAttribute, fromVarAttributeExpression, attribute, patternBody);

		return attribute;
	}

	private EMFVariable createVariable(final EditorParameterExpression editorParamExpression,
			final DemoclesPatternType type) {
		final EditorParameter parameter = editorParamExpression.getParameter();
		final EMFVariable newReference = variables.get(parameter, type);
		return newReference;
	}

	private Constant createAndRegisterConstant(final EditorLiteralExpression literalExpression,
			final EditorAttribute editorAttribute, final EditorNode source, final PatternBody patternBody) {
		final EClass eClass = types.getEClassifier(source.getType());
		final EAttribute eAttribute = types.getEAttribute(editorAttribute.getAttribute(), eClass);
		final EDataType eDataType = eAttribute.getEAttributeType();
		final Constant constant = Constants.createAndRegister(literalExpression, eDataType, patternBody);
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
