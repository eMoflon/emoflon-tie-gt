package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.utils.GTFlattener;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.tie.gt.compiler.democles.CodeConventions;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcher;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcherConfiguration;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.controlflow.democles.DemoclesFactory;
import org.moflon.tie.gt.controlflow.democles.ForEach;
import org.moflon.tie.gt.controlflow.democles.HeadControlledLoop;
import org.moflon.tie.gt.controlflow.democles.IfStatement;
import org.moflon.tie.gt.controlflow.democles.Loop;
import org.moflon.tie.gt.controlflow.democles.NodeDeletion;
import org.moflon.tie.gt.controlflow.democles.PatternInvocation;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.SingleResultPatternInvocation;
import org.moflon.tie.gt.controlflow.democles.TailControlledLoop;
import org.moflon.tie.gt.controlflow.democles.VariableReference;
import org.moflon.tie.gt.ide.core.codegeneration.StatusUtil;
import org.moflon.tie.gt.ide.core.patterns.util.Actions;
import org.moflon.tie.gt.ide.core.patterns.util.AdapterResources;
import org.moflon.tie.gt.ide.core.patterns.util.Constants;
import org.moflon.tie.gt.ide.core.patterns.util.ControlFlowUtil;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationActions;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationConstraints;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;
import org.moflon.tie.gt.ide.core.patterns.util.TieGtEcoreUtil;
import org.moflon.tie.gt.ide.core.patterns.util.TransformationExceptions;
import org.moflon.tie.gt.ide.core.patterns.util.TypeLookup;
import org.moflon.tie.gt.ide.core.patterns.util.Variables;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameter;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameterName;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Condition;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ConditionStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.DoLoopStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.EClassDef;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.EnumExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ForLoopStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.LiteralExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodDec;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodParameter;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MoslControlFlowFactory;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableAttributeExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatementParameter;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnObject;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.TypedElement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.WhileLoopStatement;

public class EditorToControlFlowTransformation {

	private static final String THIS_VARIABLE_NAME = "this";
	/**
	 * Variables having this action as constructor shall be assumed to be bound
	 * during the search plan generation
	 */
	private static final Action DUMMY_ACTION = DemoclesFactory.eINSTANCE.createAction();
	private final List<CFVariable> variablesWithDummyAction = new ArrayList<>();

	private final PatternMatcherConfiguration patternMatchers;
	private int cfNodeIdCounter;
	private CFNode recentControlFlowNode;

	/**
	 * The {@link EPackage} of the metamodel to be built
	 */
	private PatternNameGenerator patternNameGenerator;
	private MultiStatus transformationStatus;
	private AdapterResources adapterResourceManager;
	private final TypeLookup types;

	public EditorToControlFlowTransformation(final PatternMatcherConfiguration patternMatcherConfiguration,
			final TypeLookup types, final EMoflonPreferencesStorage preferencesStorage) {
		this.patternMatchers = patternMatcherConfiguration;
		this.types = types;
	}

	public IStatus transform(final GraphTransformationControlFlowFile controlFlowFile, final ResourceSet resourceSet) {
		setTransformationParameters(resourceSet);

		EcoreUtil.resolveAll(resourceSet);
		for (final EClassDef editorEClass : controlFlowFile.getEClasses()) {
			transformClassDefinition(editorEClass);
		}

		final IStatus result = this.transformationStatus;
		unsetTransformationParameters();
		return result;
	}

	private void transformClassDefinition(final EClassDef editorEClass) {
		final EClass correspondingEClass = resolveEClass(editorEClass);

		if (hasErrors())
			return;

		if (correspondingEClass == null)
			return;

		patternNameGenerator.setEClass(correspondingEClass);
		for (final MethodDec editorEOperation : editorEClass.getOperations()) {
			transformOperationDefinition(correspondingEClass, editorEOperation);
		}
	}

	private void transformOperationDefinition(final EClass eClass, final MethodDec editorEOperation) {
		if (editorEOperation.getStatements().isEmpty()) {
			editorEOperation.getStatements().add(MoslControlFlowFactory.eINSTANCE.createReturnStatement());
		}

		final EOperation eOperation = resolveEOperation(eClass, editorEOperation);

		if (hasErrors())
			return;

		patternNameGenerator.setEOperation(eOperation);
		cfNodeIdCounter = 1;
		recentControlFlowNode = null;

		final Scope rootScope = createRootScopeForEOperation(eOperation, editorEOperation);
		final List<Statement> statements = editorEOperation.getStatements();

		visitStatements(statements, eClass, eOperation, rootScope);

		resetDummyConstructors(rootScope);

		adapterResourceManager.addControlFlowModel(rootScope, eOperation);
	}

	private void visitStatements(final List<Statement> statements, final EClass eClass, final EOperation eOperation,
			final Scope rootScope) {
		for (final Statement statement : statements) {
			visitStatement(statement, rootScope, eClass, eOperation);
			if (hasErrors())
				return;
		}
	}

	private void visitStatement(final Statement statement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {
		if (statement instanceof ObjectVariableStatement) {
			visitStatement((ObjectVariableStatement) statement, scope, eOperation);
		} else if (statement instanceof ConditionStatement) {
			visitStatement((ConditionStatement) statement, scope, eClass, eOperation);
		} else if (statement instanceof WhileLoopStatement) {
			visitStatement((WhileLoopStatement) statement, scope, eClass, eOperation);
		} else if (statement instanceof ForLoopStatement) {
			visitStatement((ForLoopStatement) statement, scope, eClass, eOperation);
		} else if (statement instanceof DoLoopStatement) {
			visitStatement((DoLoopStatement) statement, scope, eClass, eOperation);
		} else if (statement instanceof ReturnStatement) {
			visitStatement((ReturnStatement) statement, scope, eClass, eOperation);
		} else if (statement instanceof PatternStatement) {
			visitStatement((PatternStatement) statement, scope, eClass, eOperation);
		} else if (statement instanceof OperationCallStatement) {
			visitStatement((OperationCallStatement) statement, scope, eClass, eOperation);
		} else if (statement instanceof ReturnStatement) {
			visitStatement((ReturnStatement) statement, scope, eClass, eOperation);
		}
	}

	private void visitStatement(final ObjectVariableStatement oVarStatement, final Scope scope,
			final EOperation eOperation) {
		createCFVariableFromObjectVariable(scope, oVarStatement);
	}

	private void visitStatement(final ReturnStatement returnStmt, final Scope scope, final EClass eClass,
			final EOperation eOperation) {
		final org.moflon.tie.gt.controlflow.democles.ReturnStatement returnStmtDemocles = ControlFlowUtil
				.createReturnStatement(cfNodeIdCounter++, scope, recentControlFlowNode);

		final ReturnObject returnObject = returnStmt.getObj();
		if (returnObject == null) {
			Actions.attachEmptyAction(returnStmtDemocles);
		} else {

			final SingleResultPatternInvocation resultPatternInvocation = PatternInvocationActions
					.createSingleResultPatternInvocation(returnStmtDemocles);

			final Pattern pattern;
			final EClassifier returnType;
			if (returnObject instanceof LiteralExpression) {
				final LiteralExpression val = (LiteralExpression) returnObject;
				final EClassifier returnVariableType = types.lookupType(eOperation.getEType());
				returnType = returnVariableType;
				final String returnVariableName = returnVariableType.getName() + "_0";

				final CFVariable returnVariable = ControlFlowUtil.createLocalControlFlowVariable(returnVariableName,
						returnVariableType, resultPatternInvocation, scope);

				final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
				pattern = patternBuilderVisitor.createExpressionPatternForLiteralValues(returnVariable, val.getVal());

				final Variable emfReturnVariable = pattern.getSymbolicParameters().get(0);
				ControlFlowUtil.createVariableReference(returnVariable, emfReturnVariable, resultPatternInvocation);

			} else if (returnObject instanceof ObjectVariableExpression) {
				final ObjectVariableExpression namedObject = (ObjectVariableExpression) returnObject;
				final ObjectVariableStatement oVarStmt = namedObject.getObj();
				returnType = types.lookupType(oVarStmt.getEType());

				final String nameOfRequiredControlFlowVariable = oVarStmt.getName();
				final Optional<CFVariable> returnVariableCandidate = ControlFlowUtil
						.findControlFlowVariableByName(scope, nameOfRequiredControlFlowVariable);

				if (!returnVariableCandidate.isPresent()) {
					TransformationExceptions.recordError(transformationStatus,
							"Cannot resolve variable to be returned: %s", nameOfRequiredControlFlowVariable);
					return;
				}
				final CFVariable cfReturnVariable = returnVariableCandidate.get();

				final CFVariable tempCFReturnVariable = ControlFlowUtil.createLocalControlFlowVariable(
						"ret_" + cfReturnVariable.getName(), cfReturnVariable.getType(), resultPatternInvocation,
						scope);

				final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
				pattern = patternBuilderVisitor.createExpressionPatternForObjectVariables(cfReturnVariable);

				final Variable source = pattern.getSymbolicParameters().get(1);
				final Variable returnEmfVariable = pattern.getSymbolicParameters().get(0);

				ControlFlowUtil.createVariableReference(tempCFReturnVariable, returnEmfVariable,
						resultPatternInvocation);
				ControlFlowUtil.createVariableReference(cfReturnVariable, source, resultPatternInvocation);
			} else if (returnObject instanceof ObjectVariableAttributeExpression) {
				final ObjectVariableAttributeExpression attributeExpression = (ObjectVariableAttributeExpression) returnObject;
				final ObjectVariableStatement editorVariable = attributeExpression.getVariable();
				final EAttribute attribute = attributeExpression.getAttribute();
				returnType = attribute.getEType();
				final String nameOfRequiredControlFlowVariable = editorVariable.getName();
				final Optional<CFVariable> returnVariableCandidate = ControlFlowUtil
						.findControlFlowVariableByName(scope, nameOfRequiredControlFlowVariable);

				if (!returnVariableCandidate.isPresent()) {
					TransformationExceptions.recordError(transformationStatus,
							"Cannot resolve variable to be returned: %s", nameOfRequiredControlFlowVariable);
					return;
				}
				final CFVariable cfReturnVariable = returnVariableCandidate.get();

				final CFVariable tempCFReturnVariable = ControlFlowUtil.createLocalControlFlowVariable(
						"ret_" + cfReturnVariable.getName(), cfReturnVariable.getType(), resultPatternInvocation,
						scope);

				final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
				pattern = patternBuilderVisitor.createExpressionPatternForObjectVariableAttribute(cfReturnVariable,
						attribute);
				if (hasErrors())
					return;

				final Variable source = pattern.getSymbolicParameters().get(1);
				final Variable target = pattern.getSymbolicParameters().get(0);

				ControlFlowUtil.createVariableReference(tempCFReturnVariable, target, resultPatternInvocation);
				ControlFlowUtil.createVariableReference(cfReturnVariable, source, resultPatternInvocation);
			} else if (returnObject instanceof EnumExpression) {
				final EnumExpression enumExpression = (EnumExpression) returnObject;
				final EClassifier returnVariableType = types.lookupType(eOperation.getEType());
				returnType = returnVariableType;
				final String returnVariableName = returnVariableType.getName() + "_0";

				final CFVariable returnVariable = ControlFlowUtil.createLocalControlFlowVariable(returnVariableName,
						returnVariableType, resultPatternInvocation, scope);

				final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
				pattern = patternBuilderVisitor.createExpressionPatternForEnumValues(returnVariable,
						enumExpression.getLiteral());
				final Variable emfReturnVariable = pattern.getSymbolicParameters().get(0);

				ControlFlowUtil.createVariableReference(returnVariable, emfReturnVariable, resultPatternInvocation);
			} else {
				TransformationExceptions.recordError(transformationStatus,
						"Cannot handle the following expresion in a return statement '%s'", returnObject);
				return;
			}

			if (hasErrors()) {
				return;
			}

			resultPatternInvocation.setReturnType(returnType);
			resultPatternInvocation.setPattern(pattern);

			final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
			patternNameGenerator.setControlFlowNode(returnStmtDemocles);
			patternNameGenerator.setPatternType(patternType);
			patternNameGenerator.setPatternDefinition(null);
			pattern.setName(patternNameGenerator.generateName());

			adapterResourceManager.addPatternModel(pattern, eClass, patternType);

			createAndSaveSearchPlan(resultPatternInvocation, pattern, patternType);
		}

		this.recentControlFlowNode = returnStmtDemocles;

	}

	private void visitStatement(final ConditionStatement ifStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {

		final IfStatement ifStmtDemocles = ControlFlowUtil.createIfStatement(cfNodeIdCounter++, scope,
				recentControlFlowNode);

		patternNameGenerator.setControlFlowNode(ifStmtDemocles);

		final Condition cond = ifStatement.getCond();
		final List<CFVariable> createdVariables = new ArrayList<>();
		final EditorPattern pattern = cond.getPatternReference().getPattern();
		final EList<CalledPatternParameter> parameters = cond.getParameters();
		invokePattern(pattern, scope, eClass, parameters, ifStmtDemocles, createdVariables, eOperation);
		if (hasErrors())
			return;

		for (final List<Statement> statements : getThenAndElseStatements(ifStatement)) {

			final Scope nextScope = DemoclesFactory.eINSTANCE.createScope();
			ControlFlowUtil.moveVariablesToScope(createdVariables, scope, nextScope);

			// ensure there are no variables in the list to be added afterwards in the else
			// clause
			createdVariables.clear();
			nextScope.setParent(ifStmtDemocles);

			recentControlFlowNode = null;

			visitStatements(statements, eClass, eOperation, nextScope);
			if (hasErrors())
				return;

		}

		this.recentControlFlowNode = ifStmtDemocles;
	}

	private void visitStatement(final WhileLoopStatement whileLoopStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {

		final int id = cfNodeIdCounter++;
		final HeadControlledLoop whileLoopDemocles = ControlFlowUtil.createHeadControlledLoop(id, scope,
				recentControlFlowNode);

		patternNameGenerator.setControlFlowNode(whileLoopDemocles);

		final Condition cond = whileLoopStatement.getCond();
		final List<CFVariable> createdVariables = new ArrayList<>();
		final EditorPattern pattern = cond.getPatternReference().getPattern();
		invokePattern(pattern, scope, eClass, cond.getParameters(), whileLoopDemocles, createdVariables, eOperation);

		// Transform loop body
		final Scope nextScope = ControlFlowUtil.createScope(whileLoopDemocles);
		ControlFlowUtil.moveVariablesToScope(createdVariables, scope, nextScope);
		createdVariables.clear();

		this.recentControlFlowNode = null;

		visitStatements(whileLoopStatement.getLoopStatements(), eClass, eOperation, nextScope);
		if (hasErrors()) {
			return;
		}

		// Continue with next statement after if
		this.recentControlFlowNode = whileLoopDemocles;

	}

	private void visitStatement(final ForLoopStatement forLoopStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {
		final int id = cfNodeIdCounter++;
		final ForEach forLoopDemocles = ControlFlowUtil.createForEachStatement(id, scope, recentControlFlowNode);

		patternNameGenerator.setControlFlowNode(forLoopDemocles);

		final Condition cond = forLoopStatement.getCond();
		final List<CFVariable> createdVariables = new ArrayList<>();
		invokePattern(cond.getPatternReference().getPattern(), scope, eClass, cond.getParameters(), forLoopDemocles,
				createdVariables, eOperation);

		// Transform loop body
		final Scope nextScope = ControlFlowUtil.createScope(forLoopDemocles);
		ControlFlowUtil.moveVariablesToScope(createdVariables, scope, nextScope);
		createdVariables.clear();

		this.recentControlFlowNode = null;

		visitStatements(forLoopStatement.getLoopStatements(), eClass, eOperation, nextScope);

		if (hasErrors()) {
			return;
		}

		this.recentControlFlowNode = forLoopDemocles;

	}

	private void visitStatement(final DoLoopStatement doLoopStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {

		final int id = cfNodeIdCounter++;
		final TailControlledLoop doLoopDemocles = ControlFlowUtil.createTailControlledLoop(id, scope,
				recentControlFlowNode);

		final Condition cond = doLoopStatement.getCond();
		patternNameGenerator.setControlFlowNode(doLoopDemocles);
		final List<CFVariable> createdVariables = new ArrayList<>();
		final Scope nextScope = ControlFlowUtil.createScope(doLoopDemocles);

		this.recentControlFlowNode = null;

		visitStatements(doLoopStatement.getLoopStatements(), eClass, eOperation, nextScope);

		if (hasErrors()) {
			return;
		}

		final EditorPattern conditionPattern = cond.getPatternReference().getPattern();
		invokePattern(conditionPattern, scope, eClass, cond.getParameters(), doLoopDemocles, createdVariables,
				eOperation);

		// Continue with next statement after if
		this.recentControlFlowNode = doLoopDemocles;

	}

	private void visitStatement(final PatternStatement patternStatement, final Scope rootScope, final EClass eClass,
			final EOperation eOperation) {

		final CFNode cfNode = createCFNode(rootScope);
		cfNode.setPrev(this.recentControlFlowNode);

		patternNameGenerator.setControlFlowNode(cfNode);
		recentControlFlowNode = cfNode;

		final EditorPattern editorPattern = patternStatement.getPatternReference().getPattern();
		invokePattern(editorPattern, rootScope, eClass, patternStatement.getParameters(), cfNode, new ArrayList<>(),
				eOperation);
	}

	private void visitStatement(final OperationCallStatement operationStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {

		final DemoclesPatternType patternType = DemoclesPatternType.EXPRESSION_PATTERN;
		final CFNode cfNode = createCFNode(scope);
		cfNode.setPrev(this.recentControlFlowNode);

		patternNameGenerator.setControlFlowNode(cfNode);
		recentControlFlowNode = cfNode;

		final ObjectVariableStatement callee = operationStatement.getObject();
		final EOperation calledOperation = operationStatement.getCall();

		final SingleResultPatternInvocation resultPatternInvocation = PatternInvocationActions
				.createSingleResultPatternInvocation(cfNode);
		final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
		final Optional<CFVariable> calleeVariableCandidate = ControlFlowUtil
				.findControlFlowVariableByName(cfNode.getScope(), callee.getName());
		if (!calleeVariableCandidate.isPresent()) {
			TransformationExceptions.recordError(transformationStatus, "No variable with name %s exists.", callee);
			return;
		}

		final CFVariable calleeVariable = calleeVariableCandidate.get();

		final CFVariable returnCFVariable = ControlFlowUtil.createLocalControlFlowVariable(
				"ret_" + calleeVariable.getName(), eOperation.getEType(), resultPatternInvocation, scope);

		final ArrayList<CFVariable> parameterCFVariables = new ArrayList<>();

		final EList<OperationCallStatementParameter> operationParameters = operationStatement.getParameters();
		operationParameters.forEach(parameter -> {
			final ObjectVariableStatement object = parameter.getObject();
			if (object != null) {
				final String name = object.getName();
				final Optional<CFVariable> parameterCfVariableCandidate = ControlFlowUtil
						.findControlFlowVariableByName(cfNode.getScope(), name);
				if (!parameterCfVariableCandidate.isPresent()) {
					TransformationExceptions.recordError(transformationStatus, "No variable with name %s exists.",
							callee);
				} else {
					parameterCFVariables.add(parameterCfVariableCandidate.get());
				}
			}
		});
		final Pattern pattern = patternBuilderVisitor.createExpressionPatternForOperationInvocation(calleeVariable,
				returnCFVariable, parameterCFVariables, calledOperation, operationParameters);
		resultPatternInvocation.setPattern(pattern);
		patternNameGenerator.setControlFlowNode(cfNode);
		patternNameGenerator.setPatternType(patternType);
		patternNameGenerator.setPatternDefinition(null);
		pattern.setName(patternNameGenerator.generateName());

		if (!TieGtEcoreUtil.isVoidOperation(calledOperation)) {
			final Variable emfReturnVariable = Patterns.getSymbolicParameterByName(pattern,
					CodeConventions.RESULT_VARIABLE_NAME);
			ControlFlowUtil.createVariableReference(returnCFVariable, emfReturnVariable, resultPatternInvocation);
		}

		final Variable calleeEmfVariable = Patterns.getSymbolicParameterByName(pattern, calleeVariable.getName());
		ControlFlowUtil.createVariableReference(calleeVariable, calleeEmfVariable, resultPatternInvocation);
		for (final CFVariable parameterCFVariable : parameterCFVariables) {
			final Variable parameterEmfVariable = Patterns.getSymbolicParameterByName(pattern,
					parameterCFVariable.getName());
			ControlFlowUtil.createVariableReference(parameterCFVariable, parameterEmfVariable, resultPatternInvocation);
		}

		adapterResourceManager.addPatternModel(pattern, eClass, patternType);

		createAndSaveSearchPlan(resultPatternInvocation, pattern, patternType);

	}

	private void invokePattern(final EditorPattern editorPattern, final Scope scope, final EClass eClass,
			final EList<CalledPatternParameter> calledParameters, final CFNode invokingCFNode,
			final List<CFVariable> createdVariables, final EOperation eOperation) {

		patternNameGenerator.setPatternDefinition(editorPattern);

		final EditorPattern flattenedPattern = flattenPattern(editorPattern);
		if (hasErrors())
			return;

		final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
		final PatternLookup patterns = patternBuilderVisitor.visit(flattenedPattern);

		if (hasErrors())
			return;

		insertInControlFlowModel(editorPattern, scope, eClass, calledParameters, invokingCFNode, createdVariables,
				patterns);

	}

	private void insertInControlFlowModel(final EditorPattern editorPattern, final Scope scope, final EClass eClass,
			final EList<CalledPatternParameter> calledParameters, final CFNode invokingCFNode,
			final List<CFVariable> createdVariables, final PatternLookup patterns) {
		final Map<DemoclesPatternType, PatternInvocation> invocations = new HashMap<>();

		final Collection<CFVariable> destructedVariables = new ArrayList<>();

		for (final DemoclesPatternType patternType : getOrderedPatternTypes()) {

			if (!patterns.contains(patternType))
				continue;

			final Pattern pattern = patterns.get(patternType);

			if (patternType.isBlack() && patterns.hasBindingAndBlack())
				continue;

			generateSearchPlansForApplicationConditions(pattern, patternType, eClass);
			adapterResourceManager.addPatternModel(pattern, eClass, patternType);

			if (hasErrors())
				return;

			final PatternInvocation controlFlowPatternInvocation = PatternInvocationActions
					.createPatternInvocation(scope, invokingCFNode, pattern);
			bindConstructedVariables(scope, controlFlowPatternInvocation, calledParameters, createdVariables,
					patternType);

			createAndSaveSearchPlan(controlFlowPatternInvocation, pattern, patternType);

			if (hasErrors()) {
				return;
			}

			invocations.put(patternType, controlFlowPatternInvocation);

			if (patternType.isRed()) {
				destructedVariables
						.addAll(collectDestrucedVariables(scope, controlFlowPatternInvocation, editorPattern));
			}
		}

		chainPatternInvocations(invocations, destructedVariables, invokingCFNode);
	}

	private void generateSearchPlansForApplicationConditions(final Pattern pattern,
			final DemoclesPatternType patternType, final EClass eClass) {
		patternNameGenerator.setPatternType(patternType);
		pattern.setName(patternNameGenerator.generateName());

		switch (patternType) {
		case BINDING_AND_BLACK_PATTERN:
			generateApplicationConditionsForBindingAndBlackPattern(pattern, eClass);
			break;
		default:
			generatePatternInvocationsForRegularPattern(pattern, patternType, eClass);
			break;

		}
	}

	private void generateApplicationConditionsForBindingAndBlackPattern(final Pattern pattern, final EClass eClass) {
		final AtomicInteger applicationConditionCounter = new AtomicInteger();
		PatternInvocationConstraints.streamPatternInvocationConstraints(pattern).forEach(constraint -> {
			final int idx = applicationConditionCounter.getAndIncrement();
			final DemoclesPatternType invokerType = DemoclesPatternType.BINDING_AND_BLACK_PATTERN;
			final DemoclesPatternType providedInvokeeType;
			switch (idx) {
			case 0:
				providedInvokeeType = DemoclesPatternType.BINDING_PATTERN;
				break;
			case 1:
				providedInvokeeType = DemoclesPatternType.BLACK_PATTERN;
				break;
			default:
				providedInvokeeType = null;
			}
			generateSearchPlanForPatternInvocation(pattern, invokerType, constraint, idx, eClass, providedInvokeeType);
		});
	}

	private void generatePatternInvocationsForRegularPattern(final Pattern pattern,
			final DemoclesPatternType patternType, final EClass eClass) {
		final AtomicInteger applicationConditionCounter = new AtomicInteger();
		PatternInvocationConstraints.streamPatternInvocationConstraints(pattern).forEach(constraint -> {
			final PatternInvocationConstraint invocation = (PatternInvocationConstraint) constraint;
			final int idx = applicationConditionCounter.getAndIncrement();
			generateSearchPlanForPatternInvocation(pattern, patternType, invocation, idx, eClass, null);
		});
	}

	private void generateSearchPlanForPatternInvocation(final Pattern invoker, final DemoclesPatternType invokerType,
			final PatternInvocationConstraint invocation, final int index, final EClass eClass,
			final DemoclesPatternType providedInvokeeType) {

		final Pattern invokee = invocation.getInvokedPattern();
		final DemoclesPatternType invokeeType = providedInvokeeType != null ? providedInvokeeType
				: guessPatternType(invokee);

		final PatternMatcher patternMatcher;
		final DemoclesPatternType typeForSaving;
		if (invokerType == DemoclesPatternType.BINDING_AND_BLACK_PATTERN) {
			patternMatcher = patternMatchers.getPatternMatcher(providedInvokeeType);
			typeForSaving = DemoclesPatternType.BINDING_AND_BLACK_PATTERN;
		} else {
			patternMatcher = patternMatchers.getPatternMatcher(invokeeType);
			typeForSaving = invokeeType;
		}

		final ApplicationConditionType applicationConditionType = ApplicationConditionType.getType(invocation);
		patternNameGenerator.setPatternType(invokeeType);
		patternNameGenerator.setApplicationConditionType(applicationConditionType, index);
		invokee.setName(patternNameGenerator.generateName());

		generateSearchPlansForApplicationConditions(invokee, invokeeType, eClass);

		adapterResourceManager.addPatternModel(invokee, eClass, typeForSaving);

		final boolean isBinding = invokeeType != null && invokeeType.isBinding();
		final List<Variable> invokerVariables = Patterns.getBody(invoker).getLocalVariables();
		final List<Variable> invokerParameters = invoker.getSymbolicParameters();
		final Adornment adornment = getAdornment(invocation, invokerParameters, invokerVariables, isBinding);

		final IStatus status = patternMatcher.generateSearchPlan(invokee, adornment);
		this.transformationStatus.add(status);

		patternNameGenerator.unsetApplicationConditionType();
	}

	/**
	 * If the condition statement contains a negation ('!'), we exchange the else
	 * and then statements
	 * 
	 * @param statement the condition statement
	 * @return a pair of statement lists. The first list contains the sequence of
	 *         statements to execute if the pattern matching is successful, the
	 *         second list contains the sequence of statements to execute if the
	 *         pattern matching fails.
	 */
	private List<List<Statement>> getThenAndElseStatements(final ConditionStatement statement) {
		if (statement.isIsNegated()) {
			return Arrays.asList(statement.getElseStatements(), statement.getThenStatements());
		} else {
			return Arrays.asList(statement.getThenStatements(), statement.getElseStatements());
		}
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

	/**
	 * Returns the {@link DemoclesPatternType} in the order that they shall be
	 * evaluated in the code
	 */
	private ArrayList<DemoclesPatternType> getOrderedPatternTypes() {
		final ArrayList<DemoclesPatternType> patternOrder = new ArrayList<>();
		patternOrder.add(DemoclesPatternType.BINDING_AND_BLACK_PATTERN);
		patternOrder.add(DemoclesPatternType.BLACK_PATTERN);
		patternOrder.add(DemoclesPatternType.RED_PATTERN);
		patternOrder.add(DemoclesPatternType.GREEN_PATTERN);
		return patternOrder;
	}

	private Collection<CFVariable> collectDestrucedVariables(final Scope scope,
			final PatternInvocation patternInvocation, final EditorPattern editorPattern) {
		final List<String> deletedEditorNodeNames = editorPattern.getNodes().stream()
				.filter(node -> node.getOperator() == EditorOperator.DELETE).map(EditorNode::getName)
				.collect(Collectors.toList());

		final Collection<CFVariable> destructedVariables = new ArrayList<>();

		final EList<EObject> contents = patternInvocation.eContents();
		for (final EObject content : contents) {
			if (content instanceof VariableReference) {
				final VariableReference varRef = (VariableReference) content;
				final CFVariable fromVariable = varRef.getFrom();
				final Variable toVariable = varRef.getTo();
				if (deletedEditorNodeNames.contains(toVariable.getName())) {
					destructedVariables.add(fromVariable);
				}
			}
		}

		return destructedVariables;
	}

	private Adornment getAdornment(final PatternInvocationConstraint constraint, final List<Variable> invokerParameters,
			final List<Variable> invokerLocalVariables, final boolean isBinding) {
		final EList<ConstraintParameter> constraintParameters = constraint.getParameters();
		final Adornment adornment = new Adornment(constraintParameters.size());
		int i = 0;
		for (final ConstraintParameter constraintParameter : constraintParameters) {
			final String constraintParameterName = getReferencedVariableName(constraintParameter);
			final int adornmentValue;
			if (invokerParameters.stream().map(Variable::getName)
					.anyMatch(variable -> constraintParameterName.equals(variable)))
				adornmentValue = Adornment.BOUND;
			else if (!isBinding && invokerLocalVariables.stream().map(Variable::getName)
					.anyMatch(variable -> constraintParameterName.equals(variable)))
				adornmentValue = Adornment.BOUND;
			else
				adornmentValue = Adornment.FREE;
			adornment.set(i, adornmentValue);
			i++;
		}
		return adornment;

	}

	private String getReferencedVariableName(final ConstraintParameter param) {
		return ((EMFVariable) param.getReference()).getName();
	}

	private Scope createRootScopeForEOperation(final EOperation eOperation, final MethodDec editorEOperation) {
		final Scope rootScope = ControlFlowUtil.createScope(null);
		createAndCheckParameterVariables(eOperation, editorEOperation, rootScope);
		return rootScope;
	}

	private CFNode createCFNode(final Scope scope) {
		final int id = cfNodeIdCounter++;
		final CFNode cfNode = ControlFlowUtil.createControlFlowNode(id, scope, recentControlFlowNode);

		if (scope.getParent() instanceof Loop) {

			final Loop loopHead = (Loop) scope.getParent();

			if (this.recentControlFlowNode != null)
				loopHead.getLastNodes().remove(recentControlFlowNode);

			loopHead.getLastNodes().add(cfNode);
		}

		return cfNode;
	}

	private void createAndSaveSearchPlan(final PatternInvocation invocation, final Pattern pattern,
			final DemoclesPatternType type) {
		final Adornment adornment = ControlFlowUtil.calculateAdornment(invocation, type);
		final boolean isMultipleMatch = invocation.getCfNode() instanceof ForEach;
		generateSearchPlanForPattern(pattern, type, adornment, isMultipleMatch);
	}

	private void generateSearchPlanForPattern(final Pattern pattern, final DemoclesPatternType type,
			final Adornment adornment, final boolean isMultipleMatch) {

		final DemoclesPatternType correctedType = adjustPatternTypeBasedOnConstraints(pattern, type);
		final PatternMatcher patternMatcher = patternMatchers.getPatternMatcher(correctedType);

		validateAdornment(adornment, pattern, correctedType);
		if (hasErrors())
			return;

		final IStatus status = patternMatcher.generateSearchPlan(pattern, adornment, isMultipleMatch);
		transformationStatus.add(status);
	}

	private DemoclesPatternType adjustPatternTypeBasedOnConstraints(final Pattern pattern,
			final DemoclesPatternType type) {
		if (Patterns.getConstraints(pattern).stream()//
				.filter(constraint -> constraint instanceof PatternInvocationConstraint)//
				.map(constraint -> (PatternInvocationConstraint) constraint)//
				.map(PatternInvocationConstraint::getInvokedPattern).map(Pattern::getName)//
				.anyMatch(name -> name.contains(DemoclesPatternType.BINDING_AND_BLACK_FILE_EXTENSION))) {
			return DemoclesPatternType.BINDING_AND_BLACK_PATTERN;
		} else {
			return type;
		}
	}

	private EClass resolveEClass(final EClassDef editorEClass) {
		final String name = editorEClass.getName().getName();
		if (name == null) {
			TransformationExceptions.recordError(transformationStatus, "Cannot resolve proxy: %s",
					editorEClass.getName());
			return null;
		}

		final EClass correspondingEClass = (EClass) types.lookupType(name);

		return correspondingEClass;
	}

	private EOperation resolveEOperation(final EClass eClass, final MethodDec methodDeclaration) {
		final EOperation eOperation = eClass.getEOperations().stream().filter(clazzEop -> {
			return clazzEop.getName().equals(methodDeclaration.getName());
		}).findAny().orElse(null);

		if (eOperation == null) {
			TransformationExceptions.recordError(transformationStatus,
					"Cannot find EOperation for %s (from editor) in EClass %s ", methodDeclaration, eClass);
		}

		return eOperation;
	}

	private void createAndCheckParameterVariables(final EOperation eOperation, final MethodDec editorEOperation,
			final Scope rootScope) {
		TieGtEcoreUtil.validateEqualParameterCount(eOperation, editorEOperation, transformationStatus);
		if (hasErrors())
			return;

		TieGtEcoreUtil.validateSameParameterNames(eOperation, editorEOperation, transformationStatus);
		if (hasErrors())
			return;

		for (final EParameter eParameter : eOperation.getEParameters()) {
			final CFVariable parameter = ControlFlowUtil
					.createControlFlowVariableWithoutConstructor(eParameter.getName(), eParameter.getEType(), null);
			setDummyConstructor(parameter);
			rootScope.getVariables().add(parameter);
		}
	}

	private void bindConstructedVariables(final Scope scope, final PatternInvocation invocation,
			final EList<CalledPatternParameter> invokerParameters, final List<CFVariable> createdVariables,
			final DemoclesPatternType type) {

		final List<Variable> invokeeParameters = new ArrayList<>(invocation.getPattern().getSymbolicParameters());
		invokeeParameters.forEach(invokeeParameter -> {
			bindConstructedVariable(scope, invocation, invokerParameters, createdVariables, type, invokeeParameter);
		});
	}

	public void bindConstructedVariable(final Scope scope, final PatternInvocation invocation,
			final EList<CalledPatternParameter> calledPatternParameters, final List<CFVariable> createdVariables,
			final DemoclesPatternType patternType, final Variable var) {
		final Pattern democlesPattern = invocation.getPattern();
		final Constant constant = findConstant(democlesPattern, var, calledPatternParameters);
		if (constant != null) {
			// Replace symbolic parameter with constant throughout the pattern
			Patterns.getBody(democlesPattern).getConstraints().stream().flatMap(c -> c.getParameters().stream())
					.filter(constraintParameter -> constraintParameter.getReference().equals(var))
					.forEach(constraintParameter -> constraintParameter.setReference(constant));
			Patterns.removeSymbolicParameter(var, democlesPattern);
		} else {
			CFVariable from;
			from = findControlFlowVariableByName(scope, var, calledPatternParameters);
			if (from == null) {
				from = initializeTemporaryControlFlowVariable(scope, createdVariables, patternType, var);
			}
			if (hasErrors())
				return;
			if (from.getConstructor() == null && !patternType.isRed())
				from.setConstructor(invocation);
			ControlFlowUtil.createVariableReference(from, var, invocation);
		}
	}

	public CFVariable initializeTemporaryControlFlowVariable(final Scope scope, final List<CFVariable> createdVariables,
			final DemoclesPatternType patternType, final Variable var) {
		final CFVariable from = createTemporaryControlFlowVariable(scope, var);
		if (hasErrors())
			return null;

		if (!patternType.isRed())
			createdVariables.add(from);
		return from;
	}

	private Constant findConstant(final Pattern pattern, final Variable var,
			final EList<CalledPatternParameter> patternParameters) {
		final CalledPatternParameter calledPatternParameter = findPatternCallVariableByParameterName(var,
				patternParameters);
		if (calledPatternParameter != null && calledPatternParameter.getLiteral() != null) {
			return Constants.createConstant(calledPatternParameter, var, pattern, transformationStatus);
		} else
			return null;
	}

	private CFVariable createTemporaryControlFlowVariable(final Scope scope, final Variable var) {
		final Optional<EClassifier> editorObjectVariableType = Variables.getType(var, transformationStatus);
		if (!editorObjectVariableType.isPresent()) {
			TransformationExceptions.recordError(transformationStatus, "Variable %s has no type.", var);
			return null;
		}

		final IStatus checkStatus = types.validateTypeExistsInMetamodel(var);
		if (StatusUtil.addAndCheckForErrors(checkStatus, transformationStatus))
			return null;

		final String name = CodeConventions.GENERATED_VARIABLE_NAME_PREFIX + var.getName();
		final CFVariable temp = ControlFlowUtil.createControlFlowVariableWithoutConstructor(name,
				editorObjectVariableType.get(), scope);
		scope.getVariables().add(temp);
		return temp;
	}

	private CalledPatternParameter findPatternCallVariableByParameterName(final Variable symbolicParameter,
			final EList<CalledPatternParameter> patternParameters) {
		final Optional<CalledPatternParameter> objectVariable = patternParameters.stream().filter(patternParameter -> {
			final CalledPatternParameterName invokerParameterName = patternParameter.getParameter();
			final String invokeeName = symbolicParameter.getName();
			return invokerParameterName.getName().equals(invokeeName)
					|| CodeConventions.getPatternParameterName(invokerParameterName.getName()).equals(invokeeName);
		}).findAny();
		if (objectVariable.isPresent())
			return objectVariable.get();
		else
			return null;
	}

	private CFVariable findControlFlowVariableByName(final Scope scope, final Variable symbolicParameter,
			final EList<CalledPatternParameter> patternParameters) {
		final CalledPatternParameter calledPatternParameter = findPatternCallVariableByParameterName(symbolicParameter,
				patternParameters);
		final TypedElement typedElement = calledPatternParameter != null ? calledPatternParameter.getObject() : null;
		if (typedElement instanceof MethodParameter) {
			final MethodParameter methodParameter = (MethodParameter) typedElement;
			final String methodParameterName = methodParameter.getName();
			final Optional<CFVariable> candidate = ControlFlowUtil.findControlFlowVariableByName(scope,
					methodParameterName);
			return candidate.orElse(null);
		} else if (typedElement instanceof ObjectVariableStatement) {
			final ObjectVariableStatement ovstmt = (ObjectVariableStatement) typedElement;
			Scope searchedScope = scope;
			final Optional<CFNode> tclCandidate = scope.getContents().stream()
					.filter(node -> node instanceof TailControlledLoop).findFirst();
			if (tclCandidate.isPresent()) {
				final TailControlledLoop tcl = (TailControlledLoop) tclCandidate.get();
				// If we are in a tail controlled loop
				searchedScope = tcl.getScopes().get(0);
			}
			while (searchedScope != null) {
				final Optional<CFVariable> candidate = searchedScope.getVariables().stream()
						.filter(cfVar -> cfVar.getName().equals(ovstmt.getName())).findFirst();
				if (candidate.isPresent()) {
					// If we did an upwards traversal and are in the scope of a tailcontrolled loop
					// and the variable in question is not the this variable, downgrade it
					if ((!searchedScope.equals(scope))
							&& (searchedScope.getContents().get(0) instanceof TailControlledLoop)
							&& (!ovstmt.getName().contentEquals(THIS_VARIABLE_NAME))) {
						searchedScope.getVariables().remove(candidate.get());
						scope.getVariables().add(candidate.get());
					}
					return candidate.get();
				}
				searchedScope = ControlFlowUtil.getNextHigherScope(searchedScope);
			}
			return null;
		} else if (typedElement == null) {
			// Check for existing temporary CFVariables
			Scope searchedScope = scope;

			// If we are in a tail-controlled Loop check contents of body
			if (scope.getParent() instanceof TailControlledLoop) {
				searchedScope = scope.getContents().get(0).getScope();
			}

			final List<String> names = Arrays.asList(
					CodeConventions.GENERATED_VARIABLE_NAME_PREFIX + symbolicParameter.getName(),
					symbolicParameter.getName());
			final Optional<CFVariable> candidate = ControlFlowUtil.findControlFlowVariableByNames(searchedScope, names);
			return candidate.orElse(null);
		} else {
			return null;
		}
	}

	private void chainPatternInvocations(final Map<DemoclesPatternType, PatternInvocation> invocationsByPatternType,
			final Collection<CFVariable> destructedVariables, final CFNode cfNode) {
		Action previous = null;
		final boolean skipBlack = invocationsByPatternType.get(DemoclesPatternType.BINDING_AND_BLACK_PATTERN) != null;
		for (final DemoclesPatternType patternType : getOrderedPatternTypes()) {

			final PatternInvocation patternInvocation = invocationsByPatternType.get(patternType);

			if (patternInvocation == null)
				continue;

			if (patternType.isBlack() && skipBlack)
				continue;

			// The first action becomes the main action = head of the list of actions
			if (previous == null)
				cfNode.setMainAction(patternInvocation);
			else {
				previous.setNext(patternInvocation);
				patternInvocation.setPrev(previous);
			}
			previous = patternInvocation;

			if (patternType.isRed()) {
				final NodeDeletion nodeDeletion = DemoclesFactory.eINSTANCE.createNodeDeletion();
				nodeDeletion.setCfNode(cfNode);
				nodeDeletion.getDestructedVariables().addAll(destructedVariables);
				previous.setNext(nodeDeletion);
				nodeDeletion.setPrev(previous);

				previous = nodeDeletion;
			}

		}
	}

	private void createCFVariableFromObjectVariable(final Scope rootScope, final ObjectVariableStatement statement) {
		final EClassifier editorType = statement.getEType();
		final EClassifier variableType = types.lookupType(editorType);
		if (variableType == null)
			TransformationExceptions.recordError(transformationStatus,
					"Cannot translate the type %s (from the editor) to an EClassifier in %s", editorType, types);

		if (hasErrors())
			return;

		final CFVariable cfVariable = ControlFlowUtil.createControlFlowVariableWithoutConstructor(statement.getName(),
				variableType, rootScope);

		rootScope.getVariables().add(cfVariable);

		setDummyConstructorOfThisVariable(cfVariable);
	}

	private void setDummyConstructorOfThisVariable(final CFVariable cfVariable) {
		if (THIS_VARIABLE_NAME.equals(cfVariable.getName())) {
			setDummyConstructor(cfVariable);
		}
	}

	public void setDummyConstructor(final CFVariable cfVariable) {
		cfVariable.setConstructor(DUMMY_ACTION);
		variablesWithDummyAction.add(cfVariable);
	}

	private void resetDummyConstructors(final Scope rootScope) {
		variablesWithDummyAction.forEach(thisVariable -> thisVariable.setConstructor(null));
		variablesWithDummyAction.clear();
	}

	private PatternBuilderVisitor createPatternBuilderVisitor() {
		return new PatternBuilderVisitor(types, transformationStatus);
	}

	private void setTransformationParameters(final ResourceSet resourceSet) {
		this.adapterResourceManager = new AdapterResources(resourceSet, false);
		this.patternNameGenerator = new PatternNameGenerator();

		this.transformationStatus = new MultiStatus(getPluginId(), 0, "Creation of control flow model failed.", null);
	}

	public String getPluginId() {
		return WorkspaceHelper.getPluginId(getClass());
	}

	private void unsetTransformationParameters() {
		this.adapterResourceManager = null;
		this.transformationStatus = null;
		this.patternNameGenerator = null;
	}

	private boolean hasErrors() {
		return transformationStatus.matches(IStatus.ERROR);
	}

	private void validateAdornment(final Adornment adornment, final Pattern pattern, final DemoclesPatternType type) {
		if (type.isRed() && !Adornments.isOnlyBound(adornment)) {
			TransformationExceptions.recordError(transformationStatus,
					"Red patterns should only have bound adornments. Pattern: %s. Adornment: %s", pattern.getName(),
					adornment);
		}
	}

	/**
	 * Determines the {@link DemoclesPatternType} of the given {@link Pattern} based
	 * on its name, which must be equal to one of the suffix in
	 * {@link DemoclesPatternType} (e.g., {@link #BLACK_FILE_EXTENSION})
	 * 
	 * @param pattern the pattern
	 * @return the pattern type
	 * @throws RuntimeException if the name does not match any file extension
	 */
	private static DemoclesPatternType guessPatternType(final Pattern pattern) {
		final String patterName = pattern.getName();
		switch (patterName) {
		case DemoclesPatternType.BINDING_AND_BLACK_FILE_EXTENSION:
			return DemoclesPatternType.BINDING_AND_BLACK_PATTERN;
		case DemoclesPatternType.BLACK_FILE_EXTENSION:
			return DemoclesPatternType.BLACK_PATTERN;
		case DemoclesPatternType.RED_FILE_EXTENSION:
			return DemoclesPatternType.RED_PATTERN;
		case DemoclesPatternType.GREEN_FILE_EXTENSION:
			return DemoclesPatternType.GREEN_PATTERN;
		case DemoclesPatternType.EXPRESSION_FILE_EXTENSION:
			return DemoclesPatternType.EXPRESSION_PATTERN;
		default:
			return null;
		}
	}
}
