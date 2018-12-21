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
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.codegen.eclipse.ValidationStatus;
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.compiler.sdm.democles.eclipse.AdapterResource;
import org.moflon.compiler.sdm.democles.eclipse.DemoclesValidationUtils;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.ForEach;
import org.moflon.sdm.runtime.democles.HeadControlledLoop;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.Loop;
import org.moflon.sdm.runtime.democles.NodeDeletion;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.SingleResultPatternInvocation;
import org.moflon.sdm.runtime.democles.TailControlledLoop;
import org.moflon.sdm.runtime.democles.VariableReference;
import org.moflon.tie.gt.ide.core.pattern.searchplan.PatternMatcherConfiguration;
import org.moflon.tie.gt.ide.core.patterns.util.ControlFlowUtil;
import org.moflon.tie.gt.ide.core.patterns.util.PatternInvocationUtil;
import org.moflon.tie.gt.ide.core.patterns.util.PatternUtil;
import org.moflon.tie.gt.ide.core.patterns.util.TransformationExceptionUtil;
import org.moflon.tie.gt.ide.core.patterns.util.ValidationUtil;
import org.moflon.tie.gt.ide.core.runtime.utilities.TypeLookup;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledMethodParameter;
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
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableAttributeExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableExpression;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnObject;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.TypedElement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.WhileLoopStatement;

public class EditorToControlFlowTransformation {

	private static final String GENERATED_VARIABLE_NAME_PREFIX = "temp_";
	private static final String THIS_VARIABLE_NAME = "this";
	private static final Action THIS_VARIABLE_DUMMY_ACTION = DemoclesFactory.eINSTANCE.createAction();
	private final PatternMatcherConfiguration patternMatcherConfiguration;
	private int cfNodeIdCounter;
	private CFNode recentControlFlowNode;

	/**
	 * The {@link EPackage} containing the Ecore metamodel
	 */
	private EPackage ecorePackage;

	/**
	 * The {@link EPackage} of the metamodel to be built
	 */
	private EPackage ePackage;
	private PatternNameGenerator patternNameGenerator;
	private ResourceSet resourceSet;
	private MultiStatus transformationStatus;

	public EditorToControlFlowTransformation(final PatternMatcherConfiguration patternMatcherConfiguration,
			final EMoflonPreferencesStorage preferencesStorage) {
		this.patternMatcherConfiguration = patternMatcherConfiguration;
	}

	public IStatus transform(final EPackage ePackage, final GraphTransformationControlFlowFile controlFlowFile,
			final ResourceSet resourceSet, final EPackage ecorePackage) {
		this.transformationStatus = new MultiStatus(WorkspaceHelper.getPluginId(getClass()), 0,
				"Creation of control flow model failed.", null);
		this.ePackage = ePackage;
		this.ecorePackage = ecorePackage;
		this.resourceSet = resourceSet;

		EcoreUtil.resolveAll(resourceSet);
		patternNameGenerator = new PatternNameGenerator();
		for (final EClassDef editorEClass : controlFlowFile.getEClasses()) {
			transformClassDefinition(editorEClass);
		}

		this.ePackage = null;
		this.resourceSet = null;
		this.ecorePackage = null;

		final IStatus result = this.transformationStatus;
		this.transformationStatus = null;
		return result;
	}

	private void transformClassDefinition(final EClassDef editorEClass) {
		final String name = editorEClass.getName().getName();
		if (name == null) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Cannot resolve proxy: " + editorEClass.getName());
			return;
		}

		final EClass correspondingEClass = (EClass) ePackage.getEClassifier(name);
		patternNameGenerator.setEClass(correspondingEClass);
		for (final MethodDec editorEOperation : editorEClass.getOperations()) {
			if (editorEOperation.getStartStatement() != null) {
				final EOperation eOperation = findEOperation(correspondingEClass, editorEOperation);
				if (eOperation == null) {
					TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
							"Cannot find EOperation for %s (from editor) in EClass %s ", editorEOperation,
							correspondingEClass);
					return;
				}
				patternNameGenerator.setEOperation(eOperation);

				final Scope rootScope = createrootScopeForEOperation(eOperation, editorEOperation);
				final Statement statement = editorEOperation.getStartStatement();
				cfNodeIdCounter = 1;
				recentControlFlowNode = null;
				visitStatement(statement, rootScope, correspondingEClass, eOperation);
				rootScope.getVariables().stream()
						.filter(variable -> THIS_VARIABLE_DUMMY_ACTION.equals(variable.getConstructor()))
						.forEach(thisVariable -> thisVariable.setConstructor(null));

				final AdapterResource adapterResource = attachToRegisteredAdapter(rootScope, eOperation,
						DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);

				DemoclesValidationUtils.saveResource(adapterResource);
			}
		}
	}

	private void visitStatement(Statement statement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {
		while (statement instanceof NextStatement) {
			final NextStatement nextStatement = (NextStatement) statement;
			if (nextStatement instanceof ObjectVariableStatement) {
				visitStatement((ObjectVariableStatement) statement, scope, eOperation);
			} else if (nextStatement instanceof ConditionStatement) {
				visitStatement((ConditionStatement) statement, scope, eClass, eOperation);
			} else if (nextStatement instanceof WhileLoopStatement) {
				visitStatement((WhileLoopStatement) statement, scope, eClass, eOperation);
			} else if (nextStatement instanceof ForLoopStatement) {
				visitStatement((ForLoopStatement) statement, scope, eClass, eOperation);
			} else if (nextStatement instanceof DoLoopStatement) {
				visitStatement((DoLoopStatement) statement, scope, eClass, eOperation);
			} else if (nextStatement instanceof ReturnStatement) {
				visitStatement((ReturnStatement) statement, scope, eClass, eOperation);
			} else if (nextStatement instanceof PatternStatement) {
				visitStatement((PatternStatement) statement, scope, eClass, eOperation);
			} else if (nextStatement instanceof OperationCallStatement) {
				visitStatement((OperationCallStatement) statement, scope, eClass, eOperation);
			}

			if (hasErrors()) {
				return;
			}

			statement = nextStatement.getNext();
		}

		if (statement instanceof ReturnStatement) {
			visitStatement((ReturnStatement) statement, scope, eClass, eOperation);
		}
	}

	private void visitStatement(final ObjectVariableStatement oVarStatement, final Scope scope,
			final EOperation eOperation) {
		createCFVariableFromObjectVariable(scope, oVarStatement);
	}

	private void visitStatement(final ReturnStatement returnStmt, final Scope scope, final EClass eClass,
			final EOperation eOperation) {
		final org.moflon.sdm.runtime.democles.ReturnStatement returnStmtDemocles = ControlFlowUtil
				.createReturnStatement(getAndIncrementalControlFlowNodeIdCounter(), scope, recentControlFlowNode);

		final ReturnObject returnObject = returnStmt.getObj();
		if (returnObject == null) {
			PatternInvocationUtil.createSingleResultPatternInvocation(returnStmtDemocles);
		} else {

			final SingleResultPatternInvocation resultPatternInvocation = PatternInvocationUtil
					.createSingleResultPatternInvocation(returnStmtDemocles);

			final Pattern pattern;
			final EClassifier returnType;
			if (returnObject instanceof LiteralExpression) {
				final LiteralExpression val = (LiteralExpression) returnObject;
				final EClassifier returnVariableType = lookupTypeInEcoreFile(eOperation.getEType());
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
				returnType = lookupTypeInEcoreFile(oVarStmt.getEType());

				final String nameOfRequiredControlFlowVariable = oVarStmt.getName();
				final Optional<CFVariable> returnVariableCandidate = ControlFlowUtil
						.findControlFlowVariableByName(scope, nameOfRequiredControlFlowVariable);

				if (returnVariableCandidate.isPresent()) {
					final CFVariable cfReturnVariable = returnVariableCandidate.get();

					final CFVariable tempCFReturnVariable = ControlFlowUtil.createLocalControlFlowVariable(
							"ret_" + cfReturnVariable.getName(), cfReturnVariable.getType(), resultPatternInvocation,
							scope);

					final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
					pattern = patternBuilderVisitor.createExpressionPatternForObjectVariables(cfReturnVariable);

					final Variable source = pattern.getSymbolicParameters().get(1);
					final Variable target = pattern.getSymbolicParameters().get(0);

					ControlFlowUtil.createVariableReference(tempCFReturnVariable, target, resultPatternInvocation);
					ControlFlowUtil.createVariableReference(cfReturnVariable, source, resultPatternInvocation);

				} else {
					TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
							"Cannot resolve variable to be returned: %s", nameOfRequiredControlFlowVariable);
					return;
				}
			} else if (returnObject instanceof ObjectVariableAttributeExpression) {
				final ObjectVariableAttributeExpression attributeExpression = (ObjectVariableAttributeExpression) returnObject;
				final ObjectVariableStatement editorVariable = attributeExpression.getVariable();
				final EAttribute attribute = attributeExpression.getAttribute();
				returnType = attribute.getEType();
				final String nameOfRequiredControlFlowVariable = editorVariable.getName();
				final Optional<CFVariable> returnVariableCandidate = ControlFlowUtil
						.findControlFlowVariableByName(scope, nameOfRequiredControlFlowVariable);

				if (returnVariableCandidate.isPresent()) {
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
				} else {
					TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
							"Cannot resolve variable to be returned: %s", nameOfRequiredControlFlowVariable);
					return;
				}
			} else if (returnObject instanceof EnumExpression) {
				final EnumExpression enumExpression = (EnumExpression) returnObject;
				final EClassifier returnVariableType = lookupTypeInEcoreFile(eOperation.getEType());
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
				TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
						"Cannot handle the following expresion in a return statement '%s'", returnObject);
				return;
			}

			if (hasErrors()) {
				return;
			}

			resultPatternInvocation.setReturnType(returnType);
			resultPatternInvocation.setPattern(pattern);

			patternNameGenerator.setCFNode(returnStmtDemocles);
			patternNameGenerator.setPatternType(PatternType.EXPRESSION_PATTERN);
			patternNameGenerator.setPatternDefinition(null);
			pattern.setName(patternNameGenerator.generateName());

			final AdapterResource adapterResource = attachToRegisteredAdapter(pattern, eClass,
					PatternType.EXPRESSION_PATTERN.getSuffix());

			DemoclesValidationUtils.saveResource(adapterResource);

			createAndSaveSearchPlan(resultPatternInvocation, pattern, PatternType.EXPRESSION_PATTERN);
		}

		this.recentControlFlowNode = returnStmtDemocles;

	}

	private void visitStatement(final ConditionStatement ifStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {

		final IfStatement ifStmtDemocles = ControlFlowUtil
				.createIfStatement(getAndIncrementalControlFlowNodeIdCounter(), scope, recentControlFlowNode);

		patternNameGenerator.setCFNode(ifStmtDemocles);

		final Condition cond = ifStatement.getCond();
		final List<CFVariable> createdVariables = new ArrayList<>();
		final EditorPattern pattern = cond.getPatternReference().getPattern();
		final EList<CalledPatternParameter> parameters = cond.getParameters();
		invokePattern(pattern, scope, eClass, parameters, ifStmtDemocles, createdVariables, eOperation);
		if (hasErrors()) {
			return;
		}

		for (final Statement stmt : getThenAndElseStatements(ifStatement)) {

			final Scope nextScope = DemoclesFactory.eINSTANCE.createScope();
			ControlFlowUtil.moveVariablesToScope(createdVariables, scope, nextScope);

			// ensure there are no variables in the list to be added afterwards in the else
			// clause
			createdVariables.clear();
			nextScope.setParent(ifStmtDemocles);

			recentControlFlowNode = null;

			visitStatement(stmt, nextScope, eClass, eOperation);
			if (hasErrors()) {
				return;
			}
		}
		// Continue with next statement after if
		this.recentControlFlowNode = ifStmtDemocles;
	}

	private void visitStatement(final WhileLoopStatement whileLoopStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {

		final int id = getAndIncrementalControlFlowNodeIdCounter();
		final HeadControlledLoop whileLoopDemocles = ControlFlowUtil.createHeadControlledLoop(id, scope,
				recentControlFlowNode);

		patternNameGenerator.setCFNode(whileLoopDemocles);

		final Condition cond = whileLoopStatement.getCond();
		final List<CFVariable> createdVariables = new ArrayList<>();
		final EditorPattern pattern = cond.getPatternReference().getPattern();
		invokePattern(pattern, scope, eClass, cond.getParameters(), whileLoopDemocles, createdVariables, eOperation);

		// Transform loop body
		final Scope nextScope = ControlFlowUtil.createScope(whileLoopDemocles);
		ControlFlowUtil.moveVariablesToScope(createdVariables, scope, nextScope);
		createdVariables.clear();

		this.recentControlFlowNode = null;

		visitStatement(whileLoopStatement.getLoopStartStatement(), nextScope, eClass, eOperation);
		if (hasErrors()) {
			return;
		}

		// Continue with next statement after if
		this.recentControlFlowNode = whileLoopDemocles;

	}

	private void visitStatement(final ForLoopStatement forLoopStatement, final Scope scope,
			final EClass correspondingEClass, final EOperation eOperation) {
		final int id = getAndIncrementalControlFlowNodeIdCounter();
		final ForEach forLoopDemocles = ControlFlowUtil.createForEachStatement(id, scope, recentControlFlowNode);

		patternNameGenerator.setCFNode(forLoopDemocles);

		final Condition cond = forLoopStatement.getCond();
		final List<CFVariable> createdVariables = new ArrayList<>();
		invokePattern(cond.getPatternReference().getPattern(), scope, correspondingEClass, cond.getParameters(),
				forLoopDemocles, createdVariables, eOperation);

		// Transform loop body
		final Scope nextScope = ControlFlowUtil.createScope(forLoopDemocles);
		ControlFlowUtil.moveVariablesToScope(createdVariables, scope, nextScope);
		createdVariables.clear();

		this.recentControlFlowNode = null;

		visitStatement(forLoopStatement.getLoopStartStatement(), nextScope, correspondingEClass, eOperation);

		if (hasErrors()) {
			return;
		}

		this.recentControlFlowNode = forLoopDemocles;

	}

	private void visitStatement(final DoLoopStatement doLoopStatement, final Scope scope, final EClass eClass,
			final EOperation eOperation) {

		final int id = getAndIncrementalControlFlowNodeIdCounter();
		final TailControlledLoop doLoopDemocles = ControlFlowUtil.createTailControlledLoop(id, scope,
				recentControlFlowNode);

		final Condition cond = doLoopStatement.getCond();
		patternNameGenerator.setCFNode(doLoopDemocles);
		final List<CFVariable> createdVariables = new ArrayList<>();
		final Scope nextScope = ControlFlowUtil.createScope(doLoopDemocles);

		this.recentControlFlowNode = null;

		visitStatement(doLoopStatement.getLoopStartStatement(), nextScope, eClass, eOperation);

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

		patternNameGenerator.setCFNode(cfNode);
		recentControlFlowNode = cfNode;

		final EditorPattern editorPattern = patternStatement.getPatternReference().getPattern();
		invokePattern(editorPattern, rootScope, eClass, patternStatement.getParameters(), cfNode, new ArrayList<>(),
				eOperation);
	}

	private void visitStatement(final OperationCallStatement operationStatement, final Scope rootScope,
			final EClass eClass, final EOperation eOperation) {

		final CFNode cfNode = createCFNode(rootScope);
		cfNode.setPrev(this.recentControlFlowNode);

		patternNameGenerator.setCFNode(cfNode);
		recentControlFlowNode = cfNode;

		final EOperation calledOperation = operationStatement.getCall();
		final EList<CalledMethodParameter> parameters = operationStatement.getParameters();
		invokeOperation(calledOperation, parameters, cfNode, eClass, rootScope);

	}

	private void invokeOperation(final EOperation calledOperation, final EList<CalledMethodParameter> parameters,
			final CFNode cfNode, final EClass eClass, final Scope rootScope) {

		/**
		 * <pre>
		 * Create SingleResult... 
		 * * callee (e.g., this)
		 * * _result 
		 * * EOperation parameter list 
		 * * Return type from EOperation
		 * 
		 * Expression pattern
		 * InvokeOperation
		 * Body
		 * 1x Operation constraint
		 * 	Constraint Parameter 1: Return value _localVariable_0 (of type = return type of EOperation)
		 * 	Constraint Parameter 2: callee (of type = return type of EOperation)
		 *  Constraint Parameter 3...: further EParameters?
		 * 2x Equal
		 * 	_result
		 *  _localVariable
		 * </pre>
		 */
		final SingleResultPatternInvocation resultPatternInvocation = PatternInvocationUtil
				.createSingleResultPatternInvocation(cfNode);
		final PatternBuilderVisitor patternBuilderVisitor = createPatternBuilderVisitor();
		patternBuilderVisitor.createExpressionPatternForOperationInvocation(null, null, null, calledOperation);
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
		final Map<PatternType, PatternInvocation> invocations = new HashMap<>();

		final Collection<CFVariable> destructedVariables = new ArrayList<>();

		for (final PatternType patternType : getOrderedPatternTypes()) {

			final Pattern democlesPattern = patterns.getPatternForType(patternType);

			if (patternType.isBlack() && patterns.hasPatternForType(PatternType.BINDING_AND_BLACK_PATTERN))
				continue;

			if (democlesPattern == null)
				continue;

			patternNameGenerator.setPatternType(patternType);
			democlesPattern.setName(patternNameGenerator.generateName());

			final List<Constraint> constraints = democlesPattern.getBodies().get(0).getConstraints();
			switch (patternType) {
			case BINDING_AND_BLACK_PATTERN: {
				final PatternInvocationConstraint bindingConstr = (PatternInvocationConstraint) constraints.get(0);
				final PatternInvocationConstraint blackConstr = (PatternInvocationConstraint) constraints.get(1);
				final Pattern invokedBindingPattern = bindingConstr.getInvokedPattern();
				final Pattern invokedBlackPattern = blackConstr.getInvokedPattern();

				// Set pattern names
				patternNameGenerator.setPatternType(PatternType.BINDING_PATTERN);
				invokedBindingPattern.setName(patternNameGenerator.generateName());

				patternNameGenerator.setPatternType(PatternType.BLACK_PATTERN);
				invokedBlackPattern.setName(patternNameGenerator.generateName());

				createAndSaveSearchPlanForApplicationConditions(eClass, patternType, bindingConstr,
						invokedBindingPattern, democlesPattern, PatternType.BINDING_PATTERN);

				createAndSaveSearchPlanForApplicationConditions(eClass, patternType, blackConstr, invokedBlackPattern,
						democlesPattern, PatternType.BLACK_PATTERN);

				for (int applicationConditionCounter = 0, i = 2; i < constraints.size(); i++) {
					if (constraints.get(i) instanceof PatternInvocationConstraint) {
						final Constraint constr = constraints.get(i);
						final PatternInvocationConstraint invocation = (PatternInvocationConstraint) constr;
						final Pattern invokedPattern = invocation.getInvokedPattern();
						invokedPattern.setName(patternNameGenerator.generateApplicationConditionName(
								invocation.isPositive(), applicationConditionCounter++));
						createAndSaveSearchPlanForApplicationConditions(eClass, patternType, constr, invokedPattern,
								democlesPattern, null);
					}
				}
				break;
			}
			default: {
				final AtomicInteger applicationConditionCounter = new AtomicInteger();
				constraints.stream().filter(c -> c instanceof PatternInvocationConstraint).forEach(c -> {
					final PatternInvocationConstraint invocation = (PatternInvocationConstraint) c;
					final Pattern invokedPattern = invocation.getInvokedPattern();
					final int idx = applicationConditionCounter.getAndIncrement();
					final String name = patternNameGenerator.generateApplicationConditionName(invocation.isPositive(),
							idx);
					invokedPattern.setName(name);
					createAndSaveSearchPlanForApplicationConditions(eClass, patternType, c, invokedPattern,
							democlesPattern, null);
				});
				break;
			}
			}
			final AdapterResource adapterResource = attachToRegisteredAdapter(democlesPattern, eClass,
					patternType.getSuffix());

			DemoclesValidationUtils.saveResource(adapterResource);

			final PatternInvocation patternInvocation = PatternInvocationUtil.createPatternInvocation(scope,
					invokingCFNode, editorPattern, democlesPattern);
			bindConstructedVariablesFromParameter(scope, democlesPattern, patternInvocation, calledParameters,
					createdVariables, patternType);

			createAndSaveSearchPlan(patternInvocation, democlesPattern, patternType);
			if (hasErrors()) {
				return;
			}

			invocations.put(patternType, patternInvocation);

			if (patternType.isRed()) {
				destructedVariables.addAll(collectDestrucedVariables(scope, patternInvocation, editorPattern));
			}
		}

		chainPatternInvocations(invocations, destructedVariables, invokingCFNode);

	}

	private List<Statement> getThenAndElseStatements(final ConditionStatement ifStatement) {
		return Arrays.asList(ifStatement.getThenStartStatement(), ifStatement.getElseStartStatement());
	}

	private EditorPattern flattenPattern(final EditorPattern editorPattern) {
		final GTFlattener flattener = new GTFlattener(editorPattern);
		final List<String> flatteningErrors = flattener.getErrors();
		for (final String errorMessage : flatteningErrors) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Flattening of %s failed: %s", editorPattern.getName(), errorMessage);
		}
		final EditorPattern flattenedPattern = flattener.getFlattenedPattern();
		return flattenedPattern;
	}

	/**
	 * Returns the {@link PatternType} in the order that they shall be evaluated in
	 * the code
	 */
	private ArrayList<PatternType> getOrderedPatternTypes() {
		final ArrayList<PatternType> patternTypesFIFO = new ArrayList<>();
		patternTypesFIFO.add(PatternType.BINDING_AND_BLACK_PATTERN);
		patternTypesFIFO.add(PatternType.BLACK_PATTERN);
		patternTypesFIFO.add(PatternType.RED_PATTERN);
		patternTypesFIFO.add(PatternType.GREEN_PATTERN);
		return patternTypesFIFO;
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

	private void createAndSaveSearchPlanForApplicationConditions(final EClass eClass, final PatternType patternType,
			final Constraint constraint, final Pattern invokedPattern, final Pattern invokingPattern,
			final PatternType constraintType) {
		final String suffix;
		if (constraintType == null) {
			suffix = PatternType.BLACK_PATTERN.getSuffix();
		} else {
			suffix = PatternType.BINDING_AND_BLACK_PATTERN.getSuffix();
		}
		final AdapterResource adapterResource = attachToRegisteredAdapter(invokedPattern, eClass, suffix);

		DemoclesValidationUtils.saveResource(adapterResource);

		final PatternMatcher patternMatcher;
		if (constraintType == null) {
			patternMatcher = getPatternMatcher(patternType);
		} else {
			patternMatcher = getPatternMatcher(constraintType);
		}

		final PatternInvocationConstraint invocationConstraint = (PatternInvocationConstraint) constraint;
		final boolean isBinding = constraintType != null && constraintType.isBinding();
		final Adornment adornment = calculateAdornmentForApplicationCondition(invocationConstraint.getParameters(),
				invokingPattern.getSymbolicParameters(), invokingPattern.getBodies().get(0).getLocalVariables(),
				isBinding);

		final boolean isMultipleMatch = false;

		final ValidationReport report = patternMatcher.generateSearchPlan(invokedPattern, adornment, isMultipleMatch);
		for (final ErrorMessage message : report.getErrorMessages()) {
			this.transformationStatus.add(ValidationStatus.createValidationStatus(message));
		}
	}

	private Adornment calculateAdornmentForApplicationCondition(final EList<ConstraintParameter> constraintParams,
			final EList<Variable> symbolicParametersInvokatingPattern,
			final EList<Variable> localVariablesInvokingPattern, final boolean isBinding) {
		final Adornment adornment = new Adornment(constraintParams.size());
		int i = 0;
		for (final ConstraintParameter param : constraintParams) {
			if (symbolicParametersInvokatingPattern.stream()
					.noneMatch(symbolicparam -> getReferencedVariableName(param).equals(symbolicparam.getName())))
				adornment.set(i, Adornment.FREE);
			else
				adornment.set(i, Adornment.BOUND);
			if (!isBinding && localVariablesInvokingPattern.stream()
					.anyMatch(symbolicparam -> getReferencedVariableName(param).equals(symbolicparam.getName()))) {
				adornment.set(i, Adornment.BOUND);
			}
			i++;
		}
		return adornment;

	}

	public String getReferencedVariableName(final ConstraintParameter param) {
		return ((EMFVariable) param.getReference()).getName();
	}

	private Scope createrootScopeForEOperation(final EOperation eOperation, final MethodDec editorEOperation) {
		final Scope rootScope = ControlFlowUtil.createScope(null);
		createAndCheckParameterVariables(eOperation, editorEOperation, rootScope);
		return rootScope;
	}

	private CFNode createCFNode(final Scope scope) {
		final int id = getAndIncrementalControlFlowNodeIdCounter();
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
			final PatternType type) {
		final PatternMatcher patternMatcher = getPatternMatcher(type);
		final Adornment adornment = ControlFlowUtil.calculateAdornment(invocation, type);

		if (type.isRed() && !PatternUtil.isOnlyBound(adornment)) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Red patterns should only have bound adornments. Pattern: %s. Adornment: %s", pattern.getName(),
					adornment);
			return;
		}

		final boolean isMultipleMatch = invocation.getCfNode() instanceof ForEach;
		final ValidationReport report = patternMatcher.generateSearchPlan(pattern, adornment, isMultipleMatch);
		for (final ErrorMessage message : report.getErrorMessages()) {
			transformationStatus.add(ValidationStatus.createValidationStatus(message));
		}
	}

	private EOperation findEOperation(final EClass eClass, final MethodDec methodDeclaration) {
		return eClass.getEOperations().stream().filter(clazzEop -> {
			return clazzEop.getName().equals(methodDeclaration.getName());
		}).findAny().orElse(null);
	}

	private AdapterResource attachToRegisteredAdapter(final EObject attachedObject, final EObject container,
			final String fileExtension) {
		final AdapterResource adapterResource = (AdapterResource) EcoreUtil.getRegisteredAdapter(container,
				fileExtension);
		if (adapterResource.getResourceSet() == null) {
			resourceSet.getResources().add(adapterResource);
		}
		adapterResource.getContents().add(attachedObject);
		return adapterResource;
	}

	private void createAndCheckParameterVariables(final EOperation eOperation, final MethodDec editorEOperation,
			final Scope rootScope) {
		ValidationUtil.validateEqualParameterCount(eOperation, editorEOperation, transformationStatus);
		if (hasErrors())
			return;

		ValidationUtil.validateSameParameterNames(eOperation, editorEOperation, transformationStatus);
		if (hasErrors())
			return;

		for (final EParameter eParameter : eOperation.getEParameters()) {
			final CFVariable parameter = ControlFlowUtil.createControlFlowVariable(eParameter.getName(),
					eParameter.getEType(), THIS_VARIABLE_DUMMY_ACTION, null);
			rootScope.getVariables().add(parameter);
		}
	}

	private void bindConstructedVariablesFromParameter(final Scope scope, final Pattern democlesPattern,
			final PatternInvocation invocation, final EList<CalledPatternParameter> calledPatternParameters,
			final List<CFVariable> createdVariables, final PatternType patternType) {
		democlesPattern.getSymbolicParameters().forEach(var -> {
			CFVariable from = findCfVariableByName(scope, var, calledPatternParameters);
			if (from == null) {
				from = createTemporaryCFVariable(scope, var);
				if (hasErrors())
					return;

				if (!patternType.isRed()) {
					createdVariables.add(from);
				}
			}
			if (from.getConstructor() == null && !patternType.isRed())
				from.setConstructor(invocation);

			ControlFlowUtil.createVariableReference(from, var, invocation);

		});
	}

	private CFVariable createTemporaryCFVariable(final Scope scope, final Variable var) {
		final EClassifier editorObjectVariableType = ValidationUtil.validateTypeExists(var, transformationStatus);
		if (hasErrors())
			return null;

		ValidationUtil.validateTypeExistsInMetamodel(var, ePackage, ecorePackage, transformationStatus);
		if (hasErrors())
			return null;

		final String name = GENERATED_VARIABLE_NAME_PREFIX + var.getName();
		final CFVariable temp = ControlFlowUtil.createControlFlowVariableWithoutConstructor(name,
				editorObjectVariableType, scope);
		scope.getVariables().add(temp);
		return temp;
	}

	private TypedElement findPatternCallVariableByParameterName(final Variable symbolicParameter,
			final EList<CalledPatternParameter> patternParameter) {
		final Optional<CalledPatternParameter> objVariable = patternParameter.stream().filter(patternParam -> {
			final CalledPatternParameterName parameterName = patternParam.getParameter();
			return parameterName.getName().contentEquals(symbolicParameter.getName());
		}).findAny();
		if (objVariable.isPresent()) {
			final TypedElement resultObject = objVariable.get().getObject();
			return resultObject;
		} else
			return null;
	}

	private CFVariable findCfVariableByName(final Scope scope, final Variable symbolicParameter,
			final EList<CalledPatternParameter> patternParameters) {
		final TypedElement typedElement = findPatternCallVariableByParameterName(symbolicParameter, patternParameters);
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

			final List<String> names = Arrays.asList(GENERATED_VARIABLE_NAME_PREFIX + symbolicParameter.getName(),
					symbolicParameter.getName());
			final Optional<CFVariable> candidate = ControlFlowUtil.findControlFlowVariableByNames(searchedScope, names);
			return candidate.orElse(null);
		} else {
			return null;
		}
	}

	private void chainPatternInvocations(final Map<PatternType, PatternInvocation> invocationsByPatternType,
			final Collection<CFVariable> destructedVariables, final CFNode cfNode) {
		Action previous = null;
		final boolean skipBlack = invocationsByPatternType.get(PatternType.BINDING_AND_BLACK_PATTERN) != null;
		for (final PatternType patternType : getOrderedPatternTypes()) {

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
		final EClassifier editorObjectVariableType = statement.getEType();
		final EClassifier properCfVariableType = TypeLookup.lookupTypeInEcoreFile(editorObjectVariableType, ePackage,
				ecorePackage);
		if (properCfVariableType == null) {
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Cannot translate the type %s (from the editor) to an EClassifier in %s", editorObjectVariableType,
					ePackage);
		}

		if (hasErrors())
			return;

		final CFVariable cfVariable = ControlFlowUtil.createControlFlowVariableWithoutConstructor(statement.getName(),
				properCfVariableType, rootScope);

		rootScope.getVariables().add(cfVariable);

		if (THIS_VARIABLE_NAME.equals(cfVariable.getName())) {
			cfVariable.setConstructor(THIS_VARIABLE_DUMMY_ACTION);
		}
	}

	private EClassifier lookupTypeInEcoreFile(final EClassifier statementEType) {
		return TypeLookup.lookupTypeInEcoreFile(statementEType, ePackage, ecorePackage);
	}

	private PatternMatcher getPatternMatcher(final PatternType patternType) {
		return patternMatcherConfiguration.getPatternMatcher(patternType);
	}

	private int getAndIncrementalControlFlowNodeIdCounter() {
		return cfNodeIdCounter++;
	}

	private PatternBuilderVisitor createPatternBuilderVisitor() {
		return new PatternBuilderVisitor(Arrays.asList(ecorePackage, ePackage), resourceSet, transformationStatus);
	}

	private boolean hasErrors() {
		return transformationStatus.matches(IStatus.ERROR);
	}
}
