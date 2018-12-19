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
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
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
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
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
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.SingleResultPatternInvocation;
import org.moflon.sdm.runtime.democles.TailControlledLoop;
import org.moflon.sdm.runtime.democles.VariableReference;
import org.moflon.tie.gt.ide.core.pattern.searchplan.PatternMatcherConfiguration;
import org.moflon.tie.gt.ide.core.patterns.util.PatternUtil;
import org.moflon.tie.gt.ide.core.patterns.util.TransformationExceptionUtil;
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
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnObject;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnStatement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.TypedElement;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.TypedNamedObject;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.WhileLoopStatement;

public class EditorToControlFlowTransformation {

	private static final DemoclesFactory DEMOCLES_CF_FACTORY = DemoclesFactory.eINSTANCE;
	private static final String THIS_VARIABLE_NAME = "this";
	private static final Action THIS_VARIABLE_DUMMY_ACTION = DEMOCLES_CF_FACTORY.createAction();
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
		EcoreUtil.resolveAll(resourceSet);
		this.transformationStatus = new MultiStatus(WorkspaceHelper.getPluginId(getClass()), 0,
				"Creation of control flow model failed.", null);
		this.ePackage = ePackage;
		this.ecorePackage = ecorePackage;
		this.resourceSet = resourceSet;

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
				if (eOperation == null)
					throw new IllegalStateException(
							String.format("Cannot find EOperation for %s (from editor) in EClass %s ", editorEOperation,
									correspondingEClass));
				patternNameGenerator.setEOperation(eOperation);

				final Scope rootscope = createRootScopeForEOperation(eOperation, editorEOperation);
				final Statement currentStatement = editorEOperation.getStartStatement();
				this.cfNodeIdCounter = 1;
				this.recentControlFlowNode = null;
				visitStatement(currentStatement, rootscope, correspondingEClass, eOperation);
				rootscope.getVariables().stream()
						.filter(variable -> THIS_VARIABLE_DUMMY_ACTION.equals(variable.getConstructor()))
						.forEach(thisVariable -> thisVariable.setConstructor(null));

				final AdapterResource adapterResource = attachInRegisteredAdapter(rootscope, eOperation, resourceSet,
						DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);

				DemoclesValidationUtils.saveResource(adapterResource);
			}
		}
	}

	private void visitStatement(Statement currentStatement, final Scope scope, final EClass currentEClass,
			final EOperation currentEOperation) {
		while (currentStatement instanceof NextStatement) {
			final NextStatement aNextStatement = (NextStatement) currentStatement;
			if (aNextStatement instanceof ObjectVariableStatement) {
				visitStatement((ObjectVariableStatement) currentStatement, scope, currentEOperation);
				if (transformationStatus.matches(IStatus.ERROR)) {
					return;
				}
			} else if (aNextStatement instanceof ConditionStatement) {
				visitStatement((ConditionStatement) currentStatement, scope, currentEClass, currentEOperation);
				if (transformationStatus.matches(IStatus.ERROR)) {
					return;
				}
			} else if (aNextStatement instanceof WhileLoopStatement) {
				visitStatement((WhileLoopStatement) currentStatement, scope, currentEClass, currentEOperation);
				if (transformationStatus.matches(IStatus.ERROR)) {
					return;
				}
			} else if (aNextStatement instanceof ForLoopStatement) {
				visitStatement((ForLoopStatement) currentStatement, scope, currentEClass, currentEOperation);
				if (transformationStatus.matches(IStatus.ERROR)) {
					return;
				}
			} else if (aNextStatement instanceof DoLoopStatement) {
				visitStatement((DoLoopStatement) currentStatement, scope, currentEClass, currentEOperation);
				if (transformationStatus.matches(IStatus.ERROR)) {
					return;
				}
			} else if (aNextStatement instanceof ReturnStatement) {
				visitStatement((ReturnStatement) currentStatement, scope, currentEClass, currentEOperation);
				if (transformationStatus.matches(IStatus.ERROR)) {
					return;
				}
			} else if (aNextStatement instanceof PatternStatement) {
				visitStatement((PatternStatement) currentStatement, scope, currentEClass, currentEOperation);
				if (transformationStatus.matches(IStatus.ERROR)) {
					return;
				}
			}
			currentStatement = aNextStatement.getNext();
		}
		if (currentStatement instanceof ReturnStatement) {
			visitStatement((ReturnStatement) currentStatement, scope, currentEClass, currentEOperation);
			if (transformationStatus.matches(IStatus.ERROR)) {
				return;
			}
		}
	}

	private void visitStatement(final ObjectVariableStatement oVarStatement, final Scope scope,
			final EOperation currentEOP) {
		createCFVariableFromObjectVariable(scope, oVarStatement);
	}

	private void visitStatement(final ReturnStatement returnStmt, final Scope scope, final EClass currentEClass,
			final EOperation currentEOperation) {
		final org.moflon.sdm.runtime.democles.ReturnStatement returnStmtDemocles = DEMOCLES_CF_FACTORY
				.createReturnStatement();
		returnStmtDemocles.setId(this.cfNodeIdCounter++);
		returnStmtDemocles.setPrev(this.recentControlFlowNode);
		returnStmtDemocles.setScope(scope);
		final ReturnObject returnObject = returnStmt.getObj();
		if (returnObject == null) {
			final Action emptyReturnAction = DEMOCLES_CF_FACTORY.createAction();
			emptyReturnAction.setCfNode(returnStmtDemocles);
			returnStmtDemocles.setMainAction(emptyReturnAction);
		} else {
			final SingleResultPatternInvocation resultPatternInvocation = DEMOCLES_CF_FACTORY
					.createSingleResultPatternInvocation();
			resultPatternInvocation.setCfNode(returnStmtDemocles);
			final Pattern pattern;
			returnStmtDemocles.setMainAction(resultPatternInvocation);
			final PatternInvocationConstraint constraint = SpecificationFactory.eINSTANCE
					.createPatternInvocationConstraint();
			if (returnObject instanceof LiteralExpression) {
				final LiteralExpression val = (LiteralExpression) returnObject;
				final EClassifier returnVariableType = lookupTypeInEcoreFile(currentEOperation.getEType(), ePackage);
				resultPatternInvocation.setReturnType(returnVariableType);
				final String returnVariableName = returnVariableType.getName() + "_0";
				final CFVariable returnVariable = DEMOCLES_CF_FACTORY.createCFVariable();
				returnVariable.setType(returnVariableType);
				returnVariable.setName(returnVariableName);
				returnVariable.setScope(scope);
				returnVariable.setLocal(true);
				returnVariable.setConstructor(resultPatternInvocation);
				final PatternBuilderVisitor patternBuilderVisitor = new PatternBuilderVisitor(
						Arrays.asList(this.ecorePackage, ePackage), resourceSet);
				pattern = patternBuilderVisitor.createExpressionPatternForLiteralValues(returnVariable, val.getVal());
				final Variable emfReturnVariable = pattern.getSymbolicParameters().get(0);
				final VariableReference ref = DEMOCLES_CF_FACTORY.createVariableReference();
				ref.setFrom(returnVariable);
				ref.setTo(emfReturnVariable);
				ref.setInvocation(resultPatternInvocation);
			} else if (returnObject instanceof TypedNamedObject) {
				final TypedNamedObject namedObject = (TypedNamedObject) returnObject;
				final ObjectVariableStatement oVarStmt = namedObject.getObj();
				resultPatternInvocation.setReturnType(lookupTypeInEcoreFile(oVarStmt.getEType(), ePackage));
				final Optional<CFVariable> returnVariableCandidate = scope.getVariables().stream()
						.filter(cfVar -> cfVar.getName().contentEquals(oVarStmt.getName())).findFirst();
				if (returnVariableCandidate.isPresent()) {
					final CFVariable cfReturnVariable = returnVariableCandidate.get();
					final CFVariable tempCFReturnVariable = DEMOCLES_CF_FACTORY.createCFVariable();
					tempCFReturnVariable.setConstructor(resultPatternInvocation);
					tempCFReturnVariable.setName("ret_" + cfReturnVariable.getName());
					tempCFReturnVariable.setScope(scope);
					tempCFReturnVariable.setLocal(true);
					tempCFReturnVariable.setType(cfReturnVariable.getType());
					final PatternBuilderVisitor patternBuilderVisitor = new PatternBuilderVisitor(ePackage,
							resourceSet);
					pattern = patternBuilderVisitor.createExpressionPatternForObjectVariables(cfReturnVariable);
					final Variable source = pattern.getSymbolicParameters().get(1);
					final Variable target = pattern.getSymbolicParameters().get(0);
					final VariableReference varRefSource = DEMOCLES_CF_FACTORY.createVariableReference();
					varRefSource.setFrom(cfReturnVariable);
					varRefSource.setTo(source);
					final VariableReference varRefTarget = DEMOCLES_CF_FACTORY.createVariableReference();
					varRefTarget.setFrom(tempCFReturnVariable);
					varRefTarget.setTo(target);
					varRefTarget.setInvocation(resultPatternInvocation);
					varRefSource.setInvocation(resultPatternInvocation);
				} else {
					transformationStatus.add(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
							"Cannot resolve variable to be returned: " + namedObject));
					return;
				}
			} else if (returnObject instanceof EnumExpression) {
				final EnumExpression enumExpression = (EnumExpression) returnObject;
				final EClassifier returnVariableType = lookupTypeInEcoreFile(currentEOperation.getEType(), ePackage);
				resultPatternInvocation.setReturnType(returnVariableType);
				final String returnVariableName = returnVariableType.getName() + "_0";
				final CFVariable returnVariable = DEMOCLES_CF_FACTORY.createCFVariable();
				returnVariable.setType(returnVariableType);
				returnVariable.setName(returnVariableName);
				returnVariable.setScope(scope);
				returnVariable.setLocal(true);
				returnVariable.setConstructor(resultPatternInvocation);
				final PatternBuilderVisitor patternBuilderVisitor = new PatternBuilderVisitor(
						Arrays.asList(ePackage, this.ecorePackage), resourceSet);
				pattern = patternBuilderVisitor.createExpressionPatternForEnumValues(returnVariable,
						enumExpression.getLiteral());
				final Variable emfReturnVariable = pattern.getSymbolicParameters().get(0);
				final VariableReference ref = DEMOCLES_CF_FACTORY.createVariableReference();
				ref.setFrom(returnVariable);
				ref.setTo(emfReturnVariable);
				ref.setInvocation(resultPatternInvocation);
			} else {
				TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus, "Cannot handle '%s'",
						returnObject);
				return;
			}
			constraint.setInvokedPattern(pattern);
			resultPatternInvocation.setPattern(pattern);
			patternNameGenerator.setCFNode(returnStmtDemocles);
			patternNameGenerator.setPatternType(PatternType.EXPRESSION_PATTERN);
			patternNameGenerator.setPatternDefinition(null);
			pattern.setName(patternNameGenerator.generateName());
			final AdapterResource adapterResource = attachInRegisteredAdapter(pattern, currentEClass, resourceSet,
					PatternType.EXPRESSION_PATTERN.getSuffix());

			DemoclesValidationUtils.saveResource(adapterResource);
			createAndSaveSearchPlan(resultPatternInvocation, pattern, PatternType.EXPRESSION_PATTERN);
		}
		this.recentControlFlowNode = returnStmtDemocles;

	}

	private void visitStatement(final ConditionStatement ifStatement, final Scope scope, final EClass currentEClass,
			final EOperation currentEOperation) {
		final IfStatement ifStmtDemocles = DemoclesFactory.eINSTANCE.createIfStatement();
		ifStmtDemocles.setPrev(this.recentControlFlowNode);
		ifStmtDemocles.setScope(scope);
		ifStmtDemocles.setId(this.cfNodeIdCounter++);
		patternNameGenerator.setCFNode(ifStmtDemocles);
		final Condition cond = ifStatement.getCond();
		final List<CFVariable> createdVariables = new ArrayList<>();
		invokePattern(cond.getPatternReference().getPattern(), scope, currentEClass, cond.getParameters(),
				ifStmtDemocles, createdVariables, currentEOperation);
		if (transformationStatus.matches(IStatus.ERROR)) {
			return;
		}

		for (final Statement stmt : getThenAndElseStatements(ifStatement)) {

			final Scope nextScope = DemoclesFactory.eINSTANCE.createScope();
			createdVariables.forEach(cfVar -> {
				scope.getVariables().remove(cfVar);
				nextScope.getVariables().add(cfVar);
			});

			// ensure there are no variables in the list to be added afterwards in the else
			// clause
			createdVariables.clear();
			nextScope.setParent(ifStmtDemocles);
			this.recentControlFlowNode = null;
			visitStatement(stmt, nextScope, currentEClass, currentEOperation);
			if (transformationStatus.matches(IStatus.ERROR)) {
				return;
			}
		}
		// Continue with next statement after if
		this.recentControlFlowNode = ifStmtDemocles;
	}

	private List<Statement> getThenAndElseStatements(final ConditionStatement ifStatement) {
		return Arrays.asList(ifStatement.getThenStartStatement(), ifStatement.getElseStartStatement());
	}

	private void visitStatement(final WhileLoopStatement whileLoopStatement, final Scope scope,
			final EClass currentEClass, final EOperation currentEOperation) {
		final HeadControlledLoop whileLoopDemocles = DemoclesFactory.eINSTANCE.createHeadControlledLoop();
		whileLoopDemocles.setPrev(this.recentControlFlowNode);
		whileLoopDemocles.setScope(scope);
		whileLoopDemocles.setLoopAlongTrue(true);
		whileLoopDemocles.setId(this.cfNodeIdCounter++);
		final Condition cond = whileLoopStatement.getCond();
		patternNameGenerator.setCFNode(whileLoopDemocles);
		final List<CFVariable> createdVariables = new ArrayList<CFVariable>();
		invokePattern(cond.getPatternReference().getPattern(), scope, currentEClass, cond.getParameters(),
				whileLoopDemocles, createdVariables, currentEOperation);

		// Transform loop body
		final Scope nextScope = DemoclesFactory.eINSTANCE.createScope();
		moveVariablesToScope(createdVariables, scope, nextScope);
		createdVariables.clear();
		nextScope.setParent(whileLoopDemocles);
		this.recentControlFlowNode = null;
		visitStatement(whileLoopStatement.getLoopStartStatement(), nextScope, currentEClass, currentEOperation);
		if (transformationStatus.matches(IStatus.ERROR)) {

		}

		// Continue with next statement after if
		this.recentControlFlowNode = whileLoopDemocles;

	}

	private void moveVariablesToScope(final List<CFVariable> controlFlowVariables, final Scope currentScope,
			final Scope nextScope) {
		controlFlowVariables.forEach(controlFlowVariable -> {
			currentScope.getVariables().remove(controlFlowVariable);
			nextScope.getVariables().add(controlFlowVariable);
		});
	}

	private void visitStatement(final ForLoopStatement forLoopStatement, final Scope scope,
			final EClass correspondingEClass, final EOperation currentEOP) {
		final ForEach forLoopDemocles = DemoclesFactory.eINSTANCE.createForEach();
		forLoopDemocles.setPrev(this.recentControlFlowNode);
		forLoopDemocles.setScope(scope);
		forLoopDemocles.setId(this.cfNodeIdCounter++);
		final Condition cond = forLoopStatement.getCond();
		patternNameGenerator.setCFNode(forLoopDemocles);
		final List<CFVariable> createdVariables = new ArrayList<CFVariable>();
		invokePattern(cond.getPatternReference().getPattern(), scope, correspondingEClass, cond.getParameters(),
				forLoopDemocles, createdVariables, currentEOP);
		// Transform loop body
		final Scope nextScope = DemoclesFactory.eINSTANCE.createScope();
		createdVariables.forEach(cfVar -> {
			scope.getVariables().remove(cfVar);
			nextScope.getVariables().add(cfVar);
		});
		createdVariables.clear();
		nextScope.setParent(forLoopDemocles);
		this.recentControlFlowNode = null;
		visitStatement(forLoopStatement.getLoopStartStatement(), nextScope, correspondingEClass, currentEOP);
		if (transformationStatus.matches(IStatus.ERROR)) {
			return;
		}
		this.recentControlFlowNode = forLoopDemocles;

	}

	private void visitStatement(final DoLoopStatement doLoopStatement, final Scope scope, final EClass currentEClass,
			final EOperation currentEOperation) {
		final TailControlledLoop doLoopDemocles = DemoclesFactory.eINSTANCE.createTailControlledLoop();
		doLoopDemocles.setPrev(this.recentControlFlowNode);
		doLoopDemocles.setScope(scope);
		doLoopDemocles.setLoopAlongTrue(true);
		doLoopDemocles.setId(this.cfNodeIdCounter++);
		final Condition cond = doLoopStatement.getCond();
		patternNameGenerator.setCFNode(doLoopDemocles);
		final List<CFVariable> createdVariables = new ArrayList<CFVariable>();
		final Scope nextScope = DemoclesFactory.eINSTANCE.createScope();
		nextScope.setParent(doLoopDemocles);
		this.recentControlFlowNode = null;
		visitStatement(doLoopStatement.getLoopStartStatement(), nextScope, currentEClass, currentEOperation);
		if (transformationStatus.matches(IStatus.ERROR)) {
			return;
		}

		final EditorPattern conditionPattern = cond.getPatternReference().getPattern();
		invokePattern(conditionPattern, scope, currentEClass, cond.getParameters(), doLoopDemocles, createdVariables,
				currentEOperation);

		// Continue with next statement after if
		this.recentControlFlowNode = doLoopDemocles;

	}

	private void visitStatement(final PatternStatement patternStatement, final Scope rootscope,
			final EClass currentEClass, final EOperation currentEOperation) {
		final CFNode cfNode = createCFNode(rootscope, this.recentControlFlowNode);
		cfNode.setPrev(this.recentControlFlowNode);
		patternNameGenerator.setCFNode(cfNode);
		final EditorPattern editorPattern = patternStatement.getPatternReference().getPattern();
		this.recentControlFlowNode = cfNode;
		invokePattern(editorPattern, rootscope, currentEClass, patternStatement.getParameters(), cfNode,
				new ArrayList<>(), currentEOperation);
	}

	private void invokePattern(final EditorPattern editorPattern, final Scope scope, final EClass currentEClass,
			final EList<CalledPatternParameter> calledParameters, final CFNode invokingCFNode,
			final List<CFVariable> createdVariables, final EOperation currentEOP) {

		patternNameGenerator.setPatternDefinition(editorPattern);

		final PatternBuilderVisitor patternBuilderVisitor = new PatternBuilderVisitor(
				Arrays.asList(ePackage, ecorePackage), resourceSet);
		final Map<PatternType, Pattern> patterns = patternBuilderVisitor.visit(editorPattern, transformationStatus);
		final Map<PatternType, PatternInvocation> invocations = new HashMap<>();

		final Collection<CFVariable> destructedVariables = new ArrayList<>();

		for (final PatternType patternType : getOrderedPatternTypes()) {

			final Pattern democlesPattern = patterns.get(patternType);

			if (patternType == PatternType.BLACK_PATTERN && patterns.get(PatternType.BINDING_AND_BLACK_PATTERN) != null)
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

				createAndSaveSearchPlanForApplicationConditions(currentEClass, patternType, bindingConstr,
						invokedBindingPattern, democlesPattern, PatternType.BINDING_PATTERN);
				createAndSaveSearchPlanForApplicationConditions(currentEClass, patternType, blackConstr,
						invokedBlackPattern, democlesPattern, PatternType.BLACK_PATTERN);
				if (constraints.size() > 2) {
					final int applicationConditionCounter = 0;
					for (int i = 2; i < constraints.size(); i++) {
						if (constraints.get(i) instanceof PatternInvocationConstraint) {
							final Constraint constr = constraints.get(i);
							final PatternInvocationConstraint invocation = (PatternInvocationConstraint) constr;
							final Pattern invokedPattern = invocation.getInvokedPattern();
							invokedPattern.setName(patternNameGenerator.generateApplicationConditionName(
									invocation.isPositive(), applicationConditionCounter));
							createAndSaveSearchPlanForApplicationConditions(currentEClass, patternType, constr,
									invokedPattern, democlesPattern, null);
						}
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
					createAndSaveSearchPlanForApplicationConditions(currentEClass, patternType, c, invokedPattern,
							democlesPattern, null);
				});
				break;
			}
			}
			final AdapterResource adapterResource = attachInRegisteredAdapter(democlesPattern, currentEClass,
					resourceSet, patternType.getSuffix());

			DemoclesValidationUtils.saveResource(adapterResource);
			final PatternInvocation patternInvocation = createPatternInvocation(scope, invokingCFNode, editorPattern,
					democlesPattern);
			bindConstructedVariablesFromParameter(scope, democlesPattern, patternInvocation, calledParameters,
					createdVariables, patternType);

			createAndSaveSearchPlan(patternInvocation, democlesPattern, patternType);
			if (transformationStatus.matches(IStatus.ERROR)) {
				return;
			}

			invocations.put(patternType, patternInvocation);

			if (patternType == PatternType.RED_PATTERN) {
				destructedVariables.addAll(collectDestrucedVariables(scope, patternInvocation, editorPattern));
			}
		}

		chainPatternInvocations(invocations, destructedVariables, invokingCFNode);

	}

	/**
	 * Returns the {@link PatternType} in the order that they shall be evaluated in
	 * the code
	 *
	 * @return
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

	private void createAndSaveSearchPlanForApplicationConditions(final EClass currentEClass,
			final PatternType patternType, final Constraint constraint, final Pattern invokedPattern,
			final Pattern invokingPattern, final PatternType constraintType) {
		final AdapterResource adapterResource;
		if (constraintType == null) {
			adapterResource = attachInRegisteredAdapter(invokedPattern, currentEClass, resourceSet,
					PatternType.BLACK_PATTERN.getSuffix());
		} else {
			adapterResource = attachInRegisteredAdapter(invokedPattern, currentEClass, resourceSet,
					PatternType.BINDING_AND_BLACK_PATTERN.getSuffix());
		}
		DemoclesValidationUtils.saveResource(adapterResource);
		final PatternMatcher patternMatcher;
		if (constraintType == null) {
			patternMatcher = this.patternMatcherConfiguration.getPatternMatcher(patternType);
		} else {
			patternMatcher = this.patternMatcherConfiguration.getPatternMatcher(constraintType);
		}
		final Adornment adornment = calculateAdornmentForApplicationCondition(
				((PatternInvocationConstraint) constraint).getParameters(), invokingPattern.getSymbolicParameters(),
				invokingPattern.getBodies().get(0).getLocalVariables(), constraintType == PatternType.BINDING_PATTERN);

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
			if (symbolicParametersInvokatingPattern.stream().noneMatch(
					symbolicparam -> ((EMFVariable) param.getReference()).getName().equals(symbolicparam.getName())))
				adornment.set(i, Adornment.FREE);
			else
				adornment.set(i, Adornment.BOUND);
			if (!isBinding && localVariablesInvokingPattern.stream().anyMatch(
					symbolicparam -> ((EMFVariable) param.getReference()).getName().equals(symbolicparam.getName()))) {
				adornment.set(i, Adornment.BOUND);
			}
			i++;
		}
		return adornment;

	}

	private Scope createRootScopeForEOperation(final EOperation eOperation, final MethodDec editorEOp) {
		final Scope rootscope = DEMOCLES_CF_FACTORY.createScope();
		createAndCheckParameterVariables(eOperation, editorEOp, rootscope);
		return rootscope;
	}

	private CFNode createCFNode(final Scope scope, final CFNode previousCFNode) {
		final CFNode cfNode = DEMOCLES_CF_FACTORY.createCFNode();
		cfNode.setId(this.cfNodeIdCounter++);
		cfNode.setScope(scope);
		cfNode.setPrev(previousCFNode);
		if (scope.getParent() instanceof Loop) {
			final Loop loopHead = (Loop) scope.getParent();
			if (previousCFNode != null)
				loopHead.getLastNodes().remove(previousCFNode);
			loopHead.getLastNodes().add(cfNode);
		}
		return cfNode;
	}

	private void createAndSaveSearchPlan(final PatternInvocation patternInvocation, final Pattern democlesPattern,
			final PatternType patternType) {
		final PatternMatcher patternMatcher = this.patternMatcherConfiguration.getPatternMatcher(patternType);
		final Adornment adornment = calculateAdornment(patternInvocation, patternType);

		if (patternType == PatternType.RED_PATTERN && !PatternUtil.isOnlyBound(adornment))
			TransformationExceptionUtil.recordTransformationErrorMessage(transformationStatus,
					"Red patterns should only have bound adornments. Pattern: %s. Adornment: %s",
					democlesPattern.getName(), adornment);

		final boolean isMultipleMatch = patternInvocation.getCfNode() instanceof ForEach;
		final ValidationReport report = patternMatcher.generateSearchPlan(democlesPattern, adornment, isMultipleMatch);
		for (final ErrorMessage message : report.getErrorMessages()) {
			transformationStatus.add(ValidationStatus.createValidationStatus(message));
		}
	}

	private EOperation findEOperation(final EClass correspondingEClass, final MethodDec methodDeclaration) {
		return correspondingEClass.getEOperations().stream().filter(clazzEop -> {
			return clazzEop.getName().equals(methodDeclaration.getName());
		}).findAny().orElse(null);
	}

	private AdapterResource attachInRegisteredAdapter(final EObject attachedObject, final EObject container,
			final ResourceSet resourceSet, final String fileExtension) {
		final AdapterResource adapterResource = (AdapterResource) EcoreUtil.getRegisteredAdapter(container,
				fileExtension);
		if (adapterResource.getResourceSet() == null) {
			resourceSet.getResources().add(adapterResource);
		}
		adapterResource.getContents().add(attachedObject);
		return adapterResource;
	}

	private void createAndCheckParameterVariables(final EOperation eOperation, final MethodDec editorEOp,
			final Scope rootscope) {
		if (eOperation.getEParameters().size() != editorEOp.getEParameters().size()) {
			throw new IllegalArgumentException(String.format(
					"Number of parameters given in Controlflow does not match that of Method declaration in .ecore for method %s",
					eOperation));
		}
		for (int i = 0; i < editorEOp.getEParameters().size(); i++) {
			final EParameter editorEParam = editorEOp.getEParameters().get(i);
			final EParameter ecoreEParam = eOperation.getEParameters().get(i);
			if (!(editorEParam.getName().equals(ecoreEParam.getName()))) {
				throw new IllegalArgumentException(String.format(
						"Parameter name or position given in Controlflow does not match that of Method declaration in .ecore for method %s",
						eOperation));
			}
		}
		// After everything is matched accordingly we can create a new control flow
		// Variable
		for (final EParameter eParameter : eOperation.getEParameters()) {
			final CFVariable parameter = DEMOCLES_CF_FACTORY.createCFVariable();
			rootscope.getVariables().add(parameter);
			parameter.setName(eParameter.getName());
			parameter.setType(eParameter.getEType());
			parameter.setLocal(false);
			parameter.setConstructor(THIS_VARIABLE_DUMMY_ACTION);
		}
	}

	private Adornment calculateAdornment(final PatternInvocation invocation, final PatternType patternType) {
		final EList<VariableReference> parameters = invocation.getParameters();
		final Adornment adornment = new Adornment(parameters.size());
		int i = 0;
		for (final VariableReference variableRef : parameters) {
			final int value = variableRef.isFree() ? Adornment.FREE : Adornment.BOUND;
			adornment.set(i, value);
			i++;
		}
		return adornment;
	}

	private void bindConstructedVariablesFromParameter(final Scope currentScope, final Pattern democlesPattern,
			final PatternInvocation invocation, final EList<CalledPatternParameter> calledPatternParameters,
			final List<CFVariable> createdVariables, final PatternType patternType) {
		democlesPattern.getSymbolicParameters().forEach(var -> {
			CFVariable from = findCfVariableByName(currentScope, var, calledPatternParameters);
			if (from == null) {
				from = createTemporaryCFVariable(currentScope, var, this.ePackage);
				if (patternType != PatternType.RED_PATTERN) {
					createdVariables.add(from);
				}
			}
			final VariableReference varRef = DEMOCLES_CF_FACTORY.createVariableReference();
			varRef.setFrom(from);
			varRef.setTo(var);
			varRef.setInvocation(invocation);
			if (from.getConstructor() == null && patternType != PatternType.RED_PATTERN)
				from.setConstructor(invocation);
		});
	}

	private CFVariable createTemporaryCFVariable(final Scope currentScope, final Variable var,
			final EPackage epackage) {
		final CFVariable temp = DEMOCLES_CF_FACTORY.createCFVariable();
		temp.setName("temp_" + var.getName());
		final EClassifier editorObjectVariableType = ((EMFVariable) var).getEClassifier();
		if (editorObjectVariableType == null)
			throw new IllegalArgumentException(String.format("Variable %s has no type.", var));
		final EClassifier properCfVariableType = lookupTypeInEcoreFile(editorObjectVariableType, epackage);
		if (properCfVariableType == null)
			throw new IllegalArgumentException(
					String.format("Cannot translate the type %s (from the editor) to an EClassifier in %s",
							editorObjectVariableType, epackage));

		temp.setType(editorObjectVariableType);
		temp.setScope(currentScope);
		temp.setLocal(false);
		currentScope.getVariables().add(temp);
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

	private CFVariable findCfVariableByName(final Scope currentScope, final Variable symbolicParam,
			final EList<CalledPatternParameter> patternParameters) {
		final TypedElement typedElement = findPatternCallVariableByParameterName(symbolicParam, patternParameters);
		if (typedElement instanceof MethodParameter) {
			final MethodParameter methodParameter = (MethodParameter) typedElement;
			Scope searchedScope = currentScope;
			while (searchedScope != null) {
				final Optional<CFVariable> candidate = searchedScope.getVariables().stream()
						.filter(cfVar -> cfVar.getName().equals(methodParameter.getName())).findFirst();
				if (candidate.isPresent())
					return candidate.get();
				if (searchedScope.getParent() != null)
					searchedScope = searchedScope.getParent().getScope();
				else
					break;
			}
		}
		if (typedElement instanceof ObjectVariableStatement) {
			final ObjectVariableStatement ovstmt = (ObjectVariableStatement) typedElement;
			Scope searchedScope = currentScope;
			final Optional<CFNode> tclCandidate = currentScope.getContents().stream()
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
					// If we did an upwars traversal and are in the scope of a tailcontrolled loop
					// and the variable in question is not the this variable, downgrade it
					if ((!searchedScope.equals(currentScope))
							&& (searchedScope.getContents().get(0) instanceof TailControlledLoop)
							&& (!ovstmt.getName().contentEquals(THIS_VARIABLE_NAME))) {
						searchedScope.getVariables().remove(candidate.get());
						currentScope.getVariables().add(candidate.get());
					}
					return candidate.get();
				}
				if (searchedScope.getParent() != null)
					searchedScope = searchedScope.getParent().getScope();
				else
					break;
			}
		}
		if (typedElement == null) {
			// Check for existing temporary CFVariables
			Scope searchedScope = currentScope;
			// If we are in a Tail Controlled Loop check contents of body
			if (currentScope.getParent() instanceof TailControlledLoop) {
				searchedScope = currentScope.getContents().get(0).getScope();
			}
			while (searchedScope != null) {
				final Optional<CFVariable> candidate = searchedScope.getVariables().stream()
						.filter(cfVar -> cfVar.getName().equals("temp_" + symbolicParam.getName())
								|| cfVar.getName().equals(symbolicParam.getName()))
						.findFirst();
				if (candidate.isPresent()) {
					return candidate.get();
				}
				if (searchedScope.getParent() != null)
					searchedScope = searchedScope.getParent().getScope();
				else
					break;
			}
		}
		// In any other case (most probably typedElement==null)
		return null;

	}

	private void chainPatternInvocations(final Map<PatternType, PatternInvocation> invocationsByPatternType,
			final Collection<CFVariable> destructedVariables, final CFNode cfNode) {
		Action previous = null;
		final boolean skipblack = invocationsByPatternType.get(PatternType.BINDING_AND_BLACK_PATTERN) != null;
		for (final PatternType patternType : getOrderedPatternTypes()) {

			final PatternInvocation current = invocationsByPatternType.get(patternType);

			if (current == null)
				continue;

			if (patternType == PatternType.BLACK_PATTERN && skipblack)
				continue;

			// The first action becomes the main action = head of the list of actions
			if (previous == null)
				cfNode.setMainAction(current);
			else {
				previous.setNext(current);
				current.setPrev(previous);
			}
			previous = current;

			if (patternType == PatternType.RED_PATTERN) {
				final NodeDeletion nodeDeletion = DemoclesFactory.eINSTANCE.createNodeDeletion();
				nodeDeletion.setCfNode(cfNode);
				nodeDeletion.getDestructedVariables().addAll(destructedVariables);
				previous.setNext(nodeDeletion);
				nodeDeletion.setPrev(previous);

				previous = nodeDeletion;
			}

		}
	}

	private PatternInvocation createPatternInvocation(final Scope rootscope, final CFNode cfNode,
			final EditorPattern pattern, final Pattern blackPattern) {
		final RegularPatternInvocation patternInvocation = DEMOCLES_CF_FACTORY.createRegularPatternInvocation();
		patternInvocation.setCfNode(cfNode);
		patternInvocation.setPattern(blackPattern);
		return patternInvocation;
	}

	private void createCFVariableFromObjectVariable(final Scope rootscope, final ObjectVariableStatement statement) {
		final EClassifier editorObjectVariableType = statement.getEType();
		final EClassifier properCfVariableType = lookupTypeInEcoreFile(editorObjectVariableType, ePackage);
		if (properCfVariableType == null)
			throw new IllegalArgumentException(
					String.format("Cannot translate the type %s (from the editor) to an EClassifier in %s",
							editorObjectVariableType, ePackage));

		final CFVariable cfVariable = DEMOCLES_CF_FACTORY.createCFVariable();
		cfVariable.setScope(rootscope);
		cfVariable.setName(statement.getName());
		cfVariable.setType(properCfVariableType);
		cfVariable.setLocal(false);
		rootscope.getVariables().add(cfVariable);

		if (THIS_VARIABLE_NAME.equals(cfVariable.getName())) {
			cfVariable.setConstructor(THIS_VARIABLE_DUMMY_ACTION);
		}
	}

	private EClassifier lookupTypeInEcoreFile(final EClassifier statementEType, final EPackage ePackage) {
		if (statementEType == null)
			return null;

		final EClassifier properEClassifierFromEPackage = ePackage.getEClassifier(statementEType.getName());
		if (properEClassifierFromEPackage != null)
			return properEClassifierFromEPackage;
		else
			return this.ecorePackage.getEClassifier(statementEType.getName());
	}
}
