package org.moflon.tie.gt.ide.core.patterns;

import java.io.IOException;
import java.util.Collections;
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
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.compiler.sdm.democles.eclipse.AdapterResource;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameter;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.EClassDef;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodDec;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodParameter;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.TypedElement;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
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

	public EditorToControlFlowTransformation(PatternMatcherConfiguration patternMatcherConfiguration,
			final EMoflonPreferencesStorage preferencesStorage) {
		this.patternMatcherConfiguration = patternMatcherConfiguration;
	}

	public IStatus transform(final EPackage ePackage, final GraphTransformationControlFlowFile mCF,
			final ResourceSet resourceSet) {
		final MultiStatus tranformationStatus = new MultiStatus(WorkspaceHelper.getPluginId(getClass()), 0,
				"Control flow construction failed.", null);
		//TODO:is there a better way?
		Resource ecoreRes=(Resource)resourceSet.getResources().get(1);
		this.ecorePackage=(EPackage)ecoreRes.getContents().get(0);
		final PatternNameGenerator patternNameGenerator = new PatternNameGenerator();
		for (final EClassDef editorEClass : mCF.getEClasses()) {
			// TODO@rkluge: Could cause problems when we have to search in multiple
			// EPackages
			final EClass correspondingEClass = (EClass) ePackage.getEClassifier(editorEClass.getName().getName());
			patternNameGenerator.setEClass(correspondingEClass);
			for (final MethodDec editorEOperation : editorEClass.getOperations()) {
				if (editorEOperation.getStartStatement() != null) {
					final EOperation eOperation = findEOperation(correspondingEClass, editorEOperation);
					if (eOperation == null)
						throw new IllegalStateException(
								String.format("Cannot find EOperation for %s (from editor) in EClass %s ",
										editorEOperation, correspondingEClass));
					patternNameGenerator.setEOperation(eOperation);

					final Scope rootscope = createRootScopeForEOperation(eOperation,editorEOperation);
					/*editorEOperation.getEParameters().forEach( methodparam -> {
						createCFVariableFromMethodParameter(ePackage, rootscope, methodparam);
					});*/
					Statement currentStatement = editorEOperation.getStartStatement();
					int cfNodeId = 0;
					CFNode previousCFNode = null;
					while (currentStatement instanceof NextStatement) {
						final NextStatement aNextStatement = (NextStatement) currentStatement;
						if (aNextStatement instanceof PatternStatement) {
							final PatternStatement patternStmt = (PatternStatement) currentStatement;
							final CFNode cfNode = createCFNode(rootscope, cfNodeId, previousCFNode);
							patternNameGenerator.setCFNode(cfNode);

							final EditorPattern editorPattern = patternStmt.getPatternReference().getPattern();
							final PatternBuilderVisitor patternBuilderVisitor = new PatternBuilderVisitor(ePackage, resourceSet);
							patternNameGenerator.setPatternDefinition(editorPattern);
							final Map<PatternType, Pattern> patterns = patternBuilderVisitor.visit(editorPattern);
							for (final PatternType patternType : PatternType.values()) {
								final Pattern democlesPattern = patterns.get(patternType);
								if (democlesPattern == null)
									continue;
								patternNameGenerator.setPatternType(patternType);
								democlesPattern.setName(patternNameGenerator.generateName());

								final AdapterResource adapterResource = attachInRegisteredAdapter(democlesPattern,
										correspondingEClass, resourceSet, patternType.getSuffix());

								// TODO@rkluge: Just for debugging
								try{
									saveResourceQuiely(adapterResource);
								}
								catch(RuntimeException exception){
									System.out.println("CaughtRuntimeException: "+exception);
								}

								PatternInvocation patternInvocation = createPatternInvocation(rootscope, cfNode,
										editorPattern, democlesPattern);
								bindConstructedVariablesFromParameter(rootscope, democlesPattern, patternInvocation,
											patternStmt.getParameters());

								createAndSaveSearchPlan(patternInvocation, democlesPattern, patternType,
										tranformationStatus);
								if (tranformationStatus.matches(IStatus.ERROR)) {
									return tranformationStatus;
								}
							}
							previousCFNode = cfNode;
							++cfNodeId;
						} else if (aNextStatement instanceof ObjectVariableStatement) {
							final ObjectVariableStatement stmt = (ObjectVariableStatement) aNextStatement;
							createCFVariableFromObjectVariable(rootscope, stmt, ePackage);
						}
						currentStatement = aNextStatement.getNext();
					}

					createReturnStatement(rootscope, previousCFNode, cfNodeId);
					rootscope.getVariables().stream().filter(variable -> THIS_VARIABLE_DUMMY_ACTION.equals(variable.getConstructor()))
							.forEach(thisVariable -> thisVariable.setConstructor(null));

					final AdapterResource adapterResource = attachInRegisteredAdapter(rootscope, eOperation,
							resourceSet, DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);

					saveResourceQuiely(adapterResource);
				}
			}
		}
		return tranformationStatus;
	}

	private Scope createRootScopeForEOperation(final EOperation eOperation,final MethodDec editorEOp) {
		final Scope rootscope = DEMOCLES_CF_FACTORY.createScope();
		createAndCheckParameterVariables(eOperation,editorEOp, rootscope);
		return rootscope;
	}

	private CFNode createCFNode(final Scope scope, final int cfNodeId, final CFNode previousCFNode) {
		final CFNode cfNode = DEMOCLES_CF_FACTORY.createCFNode();
		cfNode.setId(cfNodeId);
		cfNode.setScope(scope);
		cfNode.setPrev(previousCFNode);
		if (cfNode.getPrev() != null)
			cfNode.getPrev().setNext(cfNode);
		return cfNode;
	}

	private void createAndSaveSearchPlan(final PatternInvocation patternInvocation, final Pattern democlesPattern,
			final PatternType patternType, final MultiStatus tranformationStatus) {
		final PatternMatcher patternMatcher = this.patternMatcherConfiguration.getPatternMatcher(patternType);
		final Adornment adornment = calculateAdornment(patternInvocation);
		// TODO@rkluge: multi-match is only relevant for foreach, as far as I know
		final boolean isMultipleMatch = false;

		// TODO@rkluge: Comment in to display error markers in Eclipse.
		 final ValidationReport report =
		patternMatcher.generateSearchPlan(democlesPattern, adornment, isMultipleMatch);
		// for (final ErrorMessage message : report.getErrorMessages()) {
		// tranformationStatus.add(ValidationStatus.createValidationStatus(message));
		// }
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
		if(eOperation.getEParameters().size()!=editorEOp.getEParameters().size()) {
			throw new IllegalArgumentException(
					String.format("Number of parameters given in Controlflow does not match that of Method declaration in .ecore for method %s",
							eOperation));
		}
		for(int i=0; i<editorEOp.getEParameters().size();i++) {
			EParameter editorEParam = editorEOp.getEParameters().get(i);
			EParameter ecoreEParam = eOperation.getEParameters().get(i);
			if(!(editorEParam.getName().equals(ecoreEParam.getName()))) {
				throw new IllegalArgumentException(
						String.format("Parameter name or position given in Controlflow does not match that of Method declaration in .ecore for method %s",
								eOperation));
			}
		}
		//After everything is matched accordingly we can create a new controlflow Variable
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
			PatternInvocation invocation, EList<CalledPatternParameter> calledPatternParameters) {
		democlesPattern.getSymbolicParameters().forEach(var -> {
			final CFVariable from = findCfVariableByName(currentScope, var, calledPatternParameters);
			final VariableReference varRef = DEMOCLES_CF_FACTORY.createVariableReference();
			varRef.setFrom(from);
			varRef.setTo(var);
			varRef.setInvocation(invocation);
			if (from.getConstructor() == null)
				from.setConstructor(invocation);
		});
	}

	private TypedElement findPatternCallVariableByParameterName(Variable symbolicParameter, EList<CalledPatternParameter> patternParameter) {
		Optional<CalledPatternParameter> objVariable =patternParameter.stream().filter(patternParam -> {
			EObject paramType=patternParam.getParameter();
			if(paramType instanceof EditorNode) {
				EditorNode edNode=(EditorNode)paramType;
				return edNode.getName().contentEquals(symbolicParameter.getName());
			}
			else{
				EditorParameter edParam=(EditorParameter)paramType;
				return edParam.getName().contentEquals(symbolicParameter.getName());
			}
		}).findAny();
		if(objVariable.isPresent()) {
			TypedElement resultObject= objVariable.get().getObject();
			return resultObject;
			}
		else return null;
	}

	private CFVariable findCfVariableByName(Scope currentScope, Variable symbolicParam,EList<CalledPatternParameter> patternParameters) {
		final TypedElement typedElement = findPatternCallVariableByParameterName(symbolicParam,patternParameters);
		if(typedElement instanceof MethodParameter) {
			MethodParameter methodParameter = (MethodParameter)typedElement;
			return currentScope.getVariables().stream().filter(cfVar -> cfVar.getName().equals(methodParameter.getName()))
					.findFirst().get();
		}
		if(typedElement instanceof ObjectVariableStatement) {
			ObjectVariableStatement ovstmt=(ObjectVariableStatement)typedElement;
			return currentScope.getVariables().stream().filter(cfVar -> cfVar.getName().equals(ovstmt.getName()))
					.findFirst().get();
		}
		//In any other case (most probably typedElement==null)
		return null;
		
	}

	private PatternInvocation createPatternInvocation(Scope rootscope, CFNode cfNode, EditorPattern pattern,
			Pattern blackPattern) {
		RegularPatternInvocation patternInvocation = DEMOCLES_CF_FACTORY.createRegularPatternInvocation();
		patternInvocation.setCfNode(cfNode);
		patternInvocation.setPattern(blackPattern);
		// TODO@rkluge: Appears not to have any effect currently
		// Create Variable References
		// rootscope.getVariables().forEach(cfVar -> {
		// Optional<Variable> target = blackPattern.getSymbolicParameters().stream()
		// .filter(emfVar -> emfVar.getName().equals(cfVar.getName())).findFirst();
		// if (!target.isPresent())
		// return;
		// VariableReference reference = democlesHelper.createVariableReference();
		// reference.setTo(target.get());
		// reference.setFrom(cfVar);
		// reference.setInvocation(patternInvocation);
		// });
		cfNode.setMainAction(patternInvocation);
		return patternInvocation;
	}

	private void createReturnStatement(Scope rootscope, CFNode currentCFNode, int cfID) {
		ReturnStatement returnstmt = DEMOCLES_CF_FACTORY.createReturnStatement();
		returnstmt.setId(cfID);
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
		EClassifier properEClassifierFromEPackage=ePackage.getEClassifier(statementEType.getName());
		if(properEClassifierFromEPackage!=null)
			return properEClassifierFromEPackage;
		else 
			return this.ecorePackage.getEClassifier(statementEType.getName());
	}
}
