package org.moflon.tie.gt.ide.core.patterns;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Statement;
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

	public EditorToControlFlowTransformation(PatternMatcherConfiguration patternMatcherConfiguration,
			final EMoflonPreferencesStorage preferencesStorage) {
		this.patternMatcherConfiguration = patternMatcherConfiguration;
	}

	public IStatus transform(final EPackage ePackage, final GraphTransformationControlFlowFile mCF,
			final ResourceSet resourceSet) {
		final MultiStatus tranformationStatus = new MultiStatus(WorkspaceHelper.getPluginId(getClass()), 0,
				"Control flow construction failed.", null);
		final PatternBuilderVisitor patternBuilderVisitor = new PatternBuilderVisitor(ePackage, resourceSet);
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

					final Scope rootscope = createRootScopeForEOperation(eOperation);

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
								saveResourceQuiely(adapterResource);

								PatternInvocation patternInvocation = createPatternInvocation(rootscope, cfNode,
										editorPattern, democlesPattern);
								patternStmt.getParameters().forEach(param -> {
									bindConstructedVariablesFromParameter(rootscope, democlesPattern, patternInvocation,
											param);
								});

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
					rootscope.getVariables().stream().filter(variable -> THIS_VARIABLE_NAME.equals(variable.getName()))
							.forEach(thisVariable -> thisVariable.setConstructor(null));

					final AdapterResource adapterResource = attachInRegisteredAdapter(rootscope, eOperation,
							resourceSet, DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);

					saveResourceQuiely(adapterResource);
				}
			}
		}
		return tranformationStatus;
	}

	private Scope createRootScopeForEOperation(final EOperation eOperation) {
		final Scope rootscope = DEMOCLES_CF_FACTORY.createScope();
		createParameterVariables(eOperation, rootscope);
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
		// final ValidationReport report =
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
		final AdapterResource controlFlowResource = (AdapterResource) EcoreUtil.getRegisteredAdapter(container,
				fileExtension);
		if (controlFlowResource.getResourceSet() == null) {
			resourceSet.getResources().add(controlFlowResource);
		}
		controlFlowResource.getContents().add(attachedObject);
		return controlFlowResource;
	}

	private void createParameterVariables(EOperation eOperation, Scope rootscope) {
		for (final EParameter eParameter : eOperation.getEParameters()) {
			final CFVariable parameter = DEMOCLES_CF_FACTORY.createCFVariable();
			rootscope.getVariables().add(parameter);
			parameter.setName(eParameter.getName());
			parameter.setType(eParameter.getEType());
			parameter.setLocal(false);
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
			PatternInvocation invocation, CalledPatternParameter controlFlowParameter) {
		final ObjectVariableStatement ovStatement = (ObjectVariableStatement) controlFlowParameter.getObject();
		final CFVariable from = findCfVariableByName(currentScope, ovStatement);
		final VariableReference varRef = DEMOCLES_CF_FACTORY.createVariableReference();
		varRef.setFrom(from);
		final Variable to = findPatternVariableByName(democlesPattern, controlFlowParameter);
		varRef.setTo(to);
		varRef.setInvocation(invocation);
		if (from.getConstructor() == null)
			from.setConstructor(invocation);
	}

	private Variable findPatternVariableByName(Pattern democlesPattern, CalledPatternParameter param) {
		return democlesPattern.getSymbolicParameters().stream()
				.filter(emfVar -> param.getParameter().getName().equals(emfVar.getName())).findFirst().get();
	}

	private CFVariable findCfVariableByName(Scope currentScope, ObjectVariableStatement ovStatement) {
		return currentScope.getVariables().stream().filter(cfVar -> cfVar.getName().equals(ovStatement.getName()))
				.findFirst().get();
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

	private void createCFVariableFromObjectVariable(final Scope rootscope, final ObjectVariableStatement stmt,
			EPackage ePackage) {
		final EClassifier editorObjectVariableType = stmt.getEType();
		final EClassifier properCfVariableType = lookupTypeInEcoreFile(editorObjectVariableType, ePackage);
		if (properCfVariableType == null)
			throw new IllegalArgumentException(
					String.format("Cannot translate the type %s (from the editor) to an EClassifier in %s",
							editorObjectVariableType, ePackage));

		final CFVariable cfVariable = DEMOCLES_CF_FACTORY.createCFVariable();
		cfVariable.setScope(rootscope);
		cfVariable.setName(stmt.getName());
		cfVariable.setType(properCfVariableType);
		cfVariable.setLocal(false);
		rootscope.getVariables().add(cfVariable);

		if (THIS_VARIABLE_NAME.equals(cfVariable.getName())) {
			cfVariable.setConstructor(THIS_VARIABLE_DUMMY_ACTION);
		}
	}

	private EClassifier lookupTypeInEcoreFile(EClassifier eType, EPackage ePackage) {
		// TODO@rkluge: This is a dumb strategy that only looks up classifiers in the
		// top-level package
		return ePackage.getEClassifier(eType.getName());
	}
}
