package org.moflon.tie.gt.ide.core.patterns;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
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
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameter;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameterName;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Condition;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.ConditionStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.EClassDef;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodDec;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodParameter;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.TypedElement;
import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
import org.moflon.sdm.runtime.democles.ReturnStatement;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.VariableReference;
import org.moflon.tie.gt.ide.core.pattern.searchplan.PatternMatcherConfiguration;
import org.moflon.tie.gt.ide.core.patterns.PatternBuilderVisitor.PatternType;

public class EditorToControlFlowTransformation {

	private static final DemoclesFactory DEMOCLES_CF_FACTORY = DemoclesFactory.eINSTANCE;
	private static final String THIS_VARIABLE_NAME = "this";
	private static final Action THIS_VARIABLE_DUMMY_ACTION = DEMOCLES_CF_FACTORY.createAction();
	private final PatternMatcherConfiguration patternMatcherConfiguration;
	private EPackage ecorePackage;
	private int cfNodeIDcounter;

	public EditorToControlFlowTransformation(PatternMatcherConfiguration patternMatcherConfiguration,
			final EMoflonPreferencesStorage preferencesStorage) {
		this.patternMatcherConfiguration = patternMatcherConfiguration;
	}

	public IStatus transform(final EPackage ePackage, final GraphTransformationControlFlowFile mCF,
			final ResourceSet resourceSet) {
		EcoreUtil.resolveAll(resourceSet);
		final MultiStatus tranformationStatus = new MultiStatus(WorkspaceHelper.getPluginId(getClass()), 0,
				"Control flow construction failed.", null);
		// TODO:is there a better way?
		Resource ecoreRes = (Resource) resourceSet.getResources().get(1);
		this.ecorePackage = (EPackage) ecoreRes.getContents().get(0);
		final PatternNameGenerator patternNameGenerator = new PatternNameGenerator();
		for (final EClassDef editorEClass : mCF.getEClasses()) {
			// TODO@rkluge: Could cause problems when we have to search in multiple
			// EPackages
			final String name = editorEClass.getName().getName();
			if (name == null) {
				throw new IllegalStateException("Cannot resolve proxy: " + editorEClass.getName());
			}
			final EClass correspondingEClass = (EClass) ePackage.getEClassifier(name);
			patternNameGenerator.setEClass(correspondingEClass);
			for (final MethodDec editorEOperation : editorEClass.getOperations()) {
				if (editorEOperation.getStartStatement() != null) {
					final EOperation eOperation = findEOperation(correspondingEClass, editorEOperation);
					if (eOperation == null)
						throw new IllegalStateException(
								String.format("Cannot find EOperation for %s (from editor) in EClass %s ",
										editorEOperation, correspondingEClass));
					patternNameGenerator.setEOperation(eOperation);

					final Scope rootscope = createRootScopeForEOperation(eOperation, editorEOperation);
					Statement currentStatement = editorEOperation.getStartStatement();
					this.cfNodeIDcounter = 1;
					visitStatement(currentStatement,patternNameGenerator,rootscope,resourceSet,ePackage,correspondingEClass,tranformationStatus,null);
					rootscope.getVariables().stream()
							.filter(variable -> THIS_VARIABLE_DUMMY_ACTION.equals(variable.getConstructor()))
							.forEach(thisVariable -> thisVariable.setConstructor(null));

					final AdapterResource adapterResource = attachInRegisteredAdapter(rootscope, eOperation,
							resourceSet, DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);

					saveResourceQuiely(adapterResource);
				}
			}
		}
		return tranformationStatus;
	}

	private MultiStatus visitStatement(Statement currentStatement, PatternNameGenerator patternNameGenerator, Scope scope, ResourceSet resourceSet, EPackage ePackage, EClass correspondingEClass, MultiStatus transformationStatus,CFNode previousCFNode) {
		while (currentStatement instanceof NextStatement) {
			final NextStatement aNextStatement = (NextStatement) currentStatement;
			if(aNextStatement instanceof ObjectVariableStatement) {
				MultiStatus returnStatus=visitStatement((ObjectVariableStatement)currentStatement,scope,  ePackage,transformationStatus);
				if (returnStatus.matches(IStatus.ERROR)) {
					return returnStatus;
				}
				}
			else if(aNextStatement instanceof ConditionStatement) {
				MultiStatus returnStatus=visitStatement((ConditionStatement)currentStatement,patternNameGenerator, scope,   resourceSet, ePackage, correspondingEClass, transformationStatus,previousCFNode);
				if (returnStatus.matches(IStatus.ERROR)) {
					return returnStatus;
				}
			}
			else if(aNextStatement instanceof PatternStatement) {
				MultiStatus returnStatus=visitStatement((PatternStatement)currentStatement,patternNameGenerator, scope,   resourceSet, ePackage, correspondingEClass, transformationStatus,previousCFNode);
				if (returnStatus.matches(IStatus.ERROR)) {
					return returnStatus;
				}
			}
			currentStatement=aNextStatement.getNext();
		}
		if(currentStatement instanceof ReturnStatement) {
			createReturnStatement(scope, previousCFNode);
		}
		return transformationStatus;
	}

	
	private MultiStatus visitStatement(ObjectVariableStatement oVarStatement,Scope scope, EPackage ePackage, MultiStatus transformationStatus) {
		createCFVariableFromObjectVariable(scope, oVarStatement, ePackage);
		return transformationStatus;
	}
	
	private MultiStatus visitStatement(ConditionStatement ifStatement, PatternNameGenerator patternNameGenerator, Scope scope, ResourceSet resourceSet, EPackage ePackage, EClass correspondingEClass, MultiStatus transformationStatus,CFNode previousCFNode) {
		MultiStatus result=transformationStatus;
		IfStatement ifStmtDemocles=DemoclesFactory.eINSTANCE.createIfStatement();
		ifStmtDemocles.setPrev(previousCFNode);
		ifStmtDemocles.setScope(scope);
		ifStmtDemocles.setId(this.cfNodeIDcounter++);
		Condition cond=ifStatement.getCond();
		invokePattern(cond.getPatternReference().getPattern(), patternNameGenerator, scope,  resourceSet, ePackage, correspondingEClass, transformationStatus, cond.getParameters(), ifStmtDemocles);
		//Transform if and else branch
		List<Statement> statements= Arrays.asList(ifStatement.getThenStartStatement(),ifStatement.getElseStartStatement());
		for(Statement stmt: statements) {
			//TODO: test variable binding in then clause
			Scope nextScope=DemoclesFactory.eINSTANCE.createScope();
			nextScope.setParent(ifStmtDemocles);
			result = visitStatement(stmt, patternNameGenerator, nextScope,  resourceSet, ePackage, correspondingEClass, result, null);
			if (result.matches(IStatus.ERROR)) {
				return result;
			}
		}
		//Continue with next statement after if
		result = visitStatement(ifStatement.getNext(), patternNameGenerator, scope,  resourceSet, ePackage, correspondingEClass, result, ifStmtDemocles);
		return result;
	}
	
	private MultiStatus visitStatement(PatternStatement patternStatement, PatternNameGenerator patternNameGenerator, Scope rootscope, ResourceSet resourceSet, EPackage ePackage, EClass correspondingEClass, MultiStatus transformationStatus,CFNode previousCFNode) {
		final CFNode cfNode = createCFNode(rootscope,  previousCFNode);
		patternNameGenerator.setCFNode(cfNode);
		final EditorPattern editorPattern = patternStatement.getPatternReference().getPattern();
		return invokePattern(editorPattern, patternNameGenerator, rootscope,  resourceSet, ePackage,
				correspondingEClass, transformationStatus, patternStatement.getParameters(),cfNode);
	}

	private MultiStatus invokePattern(EditorPattern editorPattern, PatternNameGenerator patternNameGenerator,
			Scope rootscope, ResourceSet resourceSet, EPackage ePackage, EClass correspondingEClass,
			MultiStatus transformationStatus, EList<CalledPatternParameter> calledParameters,CFNode invokingCFNode) {
		final PatternBuilderVisitor patternBuilderVisitor = new PatternBuilderVisitor(ePackage,
				resourceSet);
		patternNameGenerator.setPatternDefinition(editorPattern);
		final Map<PatternType, Pattern> patterns = patternBuilderVisitor.visit(editorPattern);
		Map<PatternType,PatternInvocation> invocations=new HashMap<PatternBuilderVisitor.PatternType, PatternInvocation>();
		for (final PatternType patternType : PatternType.values()) {
			final Pattern democlesPattern = patterns.get(patternType);
			if (democlesPattern == null)
				continue;
			patternNameGenerator.setPatternType(patternType);
			democlesPattern.setName(patternNameGenerator.generateName());

			democlesPattern.getBodies().get(0).getConstraints().stream().filter(constr -> constr instanceof PatternInvocationConstraint).forEach(constr -> {
				Pattern invokedPattern=((PatternInvocationConstraint)constr).getInvokedPattern();
				invokedPattern.setName(patternNameGenerator.generateName(true,((PatternInvocationConstraint)constr).isPositive()));
				createAndSaveSearchPlanForApplicationConditions(resourceSet, transformationStatus,
						correspondingEClass, patternType, constr, invokedPattern,democlesPattern);
				});
			final AdapterResource adapterResource = attachInRegisteredAdapter(democlesPattern,
					correspondingEClass, resourceSet, patternType.getSuffix());

			// TODO@rkluge: Just for debugging
			try {
				saveResourceQuiely(adapterResource);
			} catch (RuntimeException exception) {
				System.out.println("CaughtRuntimeException: " + exception);
			}

			PatternInvocation patternInvocation = createPatternInvocation(rootscope, invokingCFNode,
					editorPattern, democlesPattern);
			bindConstructedVariablesFromParameter(rootscope, democlesPattern, patternInvocation,
					calledParameters,ePackage);

			createAndSaveSearchPlan(patternInvocation, democlesPattern, patternType,
					transformationStatus);
			if (transformationStatus.matches(IStatus.ERROR)) {
				return transformationStatus;
			}
			invocations.put(patternType, patternInvocation);
		}
		chainPatternInvocations(invocations,invokingCFNode);
		return transformationStatus;
	}
	
	private void createAndSaveSearchPlanForApplicationConditions(final ResourceSet resourceSet,
			final MultiStatus tranformationStatus, final EClass correspondingEClass, final PatternType patternType,
			Constraint constr, Pattern invokedPattern,Pattern invokatingPattern) {
		final AdapterResource adapterResource = attachInRegisteredAdapter(invokedPattern,
			correspondingEClass, resourceSet, PatternType.BLACK_PATTERN.getSuffix());
		try {
			saveResourceQuiely(adapterResource);
		} catch (RuntimeException exception) {
			System.out.println("CaughtRuntimeException: " + exception);
		}
		final PatternMatcher patternMatcher = this.patternMatcherConfiguration.getPatternMatcher(patternType);
		final Adornment adornment=calculateAdornmentForApplicationCondition(((PatternInvocationConstraint)constr).getParameters(),invokatingPattern.getSymbolicParameters());
		// TODO@rkluge: multi-match is only relevant for foreach, as far as I know
		final boolean isMultipleMatch = false;

		final ValidationReport report = patternMatcher.generateSearchPlan(invokedPattern, adornment, isMultipleMatch);
		for (final ErrorMessage message : report.getErrorMessages()) {
			tranformationStatus.add(ValidationStatus.createValidationStatus(message));
		}
	}

	private Adornment calculateAdornmentForApplicationCondition(EList<ConstraintParameter> constraintParams,
			EList<Variable> symbolicParametersInvokatingPattern) {
		final Adornment adornment = new Adornment(constraintParams.size());
		int i = 0;
		for (final ConstraintParameter param : constraintParams) {
			if(symbolicParametersInvokatingPattern.stream().noneMatch(symbolicparam -> ((EMFVariable)param.getReference()).getName().equals(symbolicparam.getName())))
				adornment.set(i, 2);
			else
				adornment.set(i, 0);
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
		cfNode.setId(this.cfNodeIDcounter++);
		cfNode.setScope(scope);
		cfNode.setPrev(previousCFNode);
		return cfNode;
	}

	private void createAndSaveSearchPlan(final PatternInvocation patternInvocation, final Pattern democlesPattern,
			final PatternType patternType, final MultiStatus tranformationStatus) {
		final PatternMatcher patternMatcher = this.patternMatcherConfiguration.getPatternMatcher(patternType);
		final Adornment adornment = calculateAdornment(patternInvocation);
		// TODO@rkluge: multi-match is only relevant for foreach, as far as I know
		final boolean isMultipleMatch = false;

		final ValidationReport report = patternMatcher.generateSearchPlan(democlesPattern, adornment, isMultipleMatch);
		for (final ErrorMessage message : report.getErrorMessages()) {
			tranformationStatus.add(ValidationStatus.createValidationStatus(message));
		}
	}

	private EOperation findEOperation(final EClass correspondingEClass, MethodDec methodDeclaration) {
		return correspondingEClass.getEOperations().stream().filter(clazzEop -> {
			return clazzEop.getName().equals(methodDeclaration.getName());
		}).findAny().orElse(null);
	}

	private void saveResourceQuiely(final AdapterResource adapterResource) {
		try {
			adapterResource.save(Collections.EMPTY_MAP);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private AdapterResource attachInRegisteredAdapter(final EObject attachedObject, final EObject container,
			ResourceSet resourceSet, String fileExtension) {
		final AdapterResource adapterResource = (AdapterResource) EcoreUtil.getRegisteredAdapter(container,
				fileExtension);
		if (adapterResource.getResourceSet() == null) {
			resourceSet.getResources().add(adapterResource);
		}
		adapterResource.getContents().add(attachedObject);
		return adapterResource;
	}

	private void createAndCheckParameterVariables(EOperation eOperation, MethodDec editorEOp, Scope rootscope) {
		if (eOperation.getEParameters().size() != editorEOp.getEParameters().size()) {
			throw new IllegalArgumentException(String.format(
					"Number of parameters given in Controlflow does not match that of Method declaration in .ecore for method %s",
					eOperation));
		}
		for (int i = 0; i < editorEOp.getEParameters().size(); i++) {
			EParameter editorEParam = editorEOp.getEParameters().get(i);
			EParameter ecoreEParam = eOperation.getEParameters().get(i);
			if (!(editorEParam.getName().equals(ecoreEParam.getName()))) {
				throw new IllegalArgumentException(String.format(
						"Parameter name or position given in Controlflow does not match that of Method declaration in .ecore for method %s",
						eOperation));
			}
		}
		// After everything is matched accordingly we can create a new controlflow
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

	private Adornment calculateAdornment(final PatternInvocation invocation) {
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

	private void bindConstructedVariablesFromParameter(Scope currentScope, Pattern democlesPattern,
			PatternInvocation invocation, EList<CalledPatternParameter> calledPatternParameters,EPackage epackage) {
		democlesPattern.getSymbolicParameters().forEach(var -> {
			CFVariable from = findCfVariableByName(currentScope, var, calledPatternParameters);
			if(from==null) {
				from = createTemporaryCFVariable(currentScope, var,epackage);
			}
			final VariableReference varRef = DEMOCLES_CF_FACTORY.createVariableReference();
			varRef.setFrom(from);
			varRef.setTo(var);
			varRef.setInvocation(invocation);
			if (from.getConstructor() == null)
				from.setConstructor(invocation);
		});
	}

	private CFVariable createTemporaryCFVariable(Scope currentScope, Variable var,EPackage epackage) {
		CFVariable temp= DEMOCLES_CF_FACTORY.createCFVariable();
		temp.setName("temp_"+var.getName());
		final EClassifier editorObjectVariableType = ((EMFVariable)var).getEClassifier();
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

	private TypedElement findPatternCallVariableByParameterName(Variable symbolicParameter,
			EList<CalledPatternParameter> patternParameter) {
		Optional<CalledPatternParameter> objVariable = patternParameter.stream().filter(patternParam -> {
			CalledPatternParameterName parameterName = patternParam.getParameter();
			return parameterName.getName().contentEquals(symbolicParameter.getName());
		}).findAny();
		if (objVariable.isPresent()) {
			TypedElement resultObject = objVariable.get().getObject();
			return resultObject;
		} else
			return null;
	}

	private CFVariable findCfVariableByName(Scope currentScope, Variable symbolicParam,
			EList<CalledPatternParameter> patternParameters) {
		final TypedElement typedElement = findPatternCallVariableByParameterName(symbolicParam, patternParameters);
		if (typedElement instanceof MethodParameter) {
			MethodParameter methodParameter = (MethodParameter) typedElement;
			Scope searchedScope=currentScope;
			while(searchedScope != null) {
				Optional<CFVariable> candidate=searchedScope.getVariables().stream().filter(cfVar -> cfVar.getName().equals(methodParameter.getName()))
				.findFirst();
				if(candidate.isPresent())
					return candidate.get();
				if(searchedScope.getParent()!=null)
					searchedScope=searchedScope.getParent().getScope();
				else break;
			}
		}
		if (typedElement instanceof ObjectVariableStatement) {
			ObjectVariableStatement ovstmt = (ObjectVariableStatement) typedElement;
			Scope searchedScope=currentScope;
			while(searchedScope != null) {
				Optional<CFVariable> candidate=currentScope.getVariables().stream().filter(cfVar -> cfVar.getName().equals(ovstmt.getName()))
				.findFirst();
				if(candidate.isPresent())
					return candidate.get();
				if(searchedScope.getParent()!=null)
					searchedScope=searchedScope.getParent().getScope();
				else break;
			}
		}
		if(typedElement==null) {
			//Check for existing temporary CFVariables
			Scope searchedScope=currentScope;
			while(searchedScope != null) {
				Optional<CFVariable> candidate=currentScope.getVariables().stream().filter(cfVar -> cfVar.getName().equals("temp_"+symbolicParam.getName()))
				.findFirst();
				if(candidate.isPresent())
					return candidate.get();
				if(searchedScope.getParent()!=null)
					searchedScope=searchedScope.getParent().getScope();
				else break;
			}
		}
		// In any other case (most probably typedElement==null)
		return null;

	}

	private void chainPatternInvocations(Map<PatternType,PatternInvocation> invocationsByPatternType,CFNode cfNode){
		final List<PatternType> invocationOrder= Arrays.asList(PatternType.BLACK_PATTERN,PatternType.RED_PATTERN,PatternType.GREEN_PATTERN);
		PatternInvocation previous=null;
		for(PatternType t:invocationOrder) {
			PatternInvocation current=invocationsByPatternType.get(t);
			if(current==null)
				continue;
			if(previous==null)
				cfNode.setMainAction(current);
			else {
				previous.setNext(current);
				current.setPrev(previous);
			}
			previous=current;
		}
	}

	private PatternInvocation createPatternInvocation(Scope rootscope, CFNode cfNode, EditorPattern pattern,
			Pattern blackPattern) {
		RegularPatternInvocation patternInvocation = DEMOCLES_CF_FACTORY.createRegularPatternInvocation();
		patternInvocation.setCfNode(cfNode);
		patternInvocation.setPattern(blackPattern);
		return patternInvocation;
	}

	private void createReturnStatement(Scope rootscope, CFNode currentCFNode) {
		ReturnStatement returnstmt = DEMOCLES_CF_FACTORY.createReturnStatement();
		returnstmt.setId(this.cfNodeIDcounter++);
		if(currentCFNode!=null)
			returnstmt.setPrev(currentCFNode);
		returnstmt.setScope(rootscope);
		Action emptyReturnAction = DEMOCLES_CF_FACTORY.createAction();
		emptyReturnAction.setCfNode(returnstmt);
		returnstmt.setMainAction(emptyReturnAction);
	}

	private void createCFVariableFromObjectVariable(final Scope rootscope, final ObjectVariableStatement statement,
			final EPackage ePackage) {
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
		EClassifier properEClassifierFromEPackage = ePackage.getEClassifier(statementEType.getName());
		if (properEClassifierFromEPackage != null)
			return properEClassifierFromEPackage;
		else
			return this.ecorePackage.getEClassifier(statementEType.getName());
	}
}
