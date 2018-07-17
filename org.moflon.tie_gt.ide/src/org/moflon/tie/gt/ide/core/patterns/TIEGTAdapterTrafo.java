package org.moflon.tie.gt.ide.core.patterns;

import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.compiler.sdm.democles.eclipse.AdapterResource;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameter;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.EClassDef;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodDec;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeFactory;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;
import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
import org.moflon.sdm.runtime.democles.ReturnStatement;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.VariableReference;
import org.moflon.tie.gt.ide.core.patterns.PatternBuilderVisitor.PatternType;

public class TIEGTAdapterTrafo implements CodeadapterTrafo {

	DemoclesFactory democlesHelper = DemoclesFactory.eINSTANCE;
	ECoreAdapterController adapterController;


	public TIEGTAdapterTrafo() {
		this.adapterController= new ECoreAdapterController();
	}

	@Override
	public EPackage transform(EPackage contextEPackage, GraphTransformationControlFlowFile mCF,
			ResourceSet resourceSet) {
		//TODO:still necessary?
		//Map<EditorPattern,List<EClass>> patternToClassesLookup=new HashMap<EditorPattern, List<EClass>>();
		//PatternReferenceCollector
		PatternBuilderVisitor visitor= new PatternBuilderVisitor(contextEPackage,resourceSet);
		for(EClassDef clazz: mCF.getEClasses()) {
			EClass correspondingEClass=(EClass)contextEPackage.getEClassifiers().stream().filter(eClazz -> eClazz.getName().equals(clazz.getName().getName())).findFirst().get();
			//transformMethodsToEOperations(contextEClass, clazz, changeableContext, this.transformationConfiguration);
			for(MethodDec eOp:clazz.getOperations()) {
				if(eOp.getStartStatement()!=null) {
					Scope rootscope = democlesHelper.createScope();
					//Create this Variable TODO: check if this process is ok, creating a CF Variable for every node in the pattern
					createThisVariable(correspondingEClass, rootscope);
					EOperation correspondingEop = createCFVariableForParameters(correspondingEClass, eOp, rootscope);
					Statement startStatement=eOp.getStartStatement();
					//TODO: take care for return statements
					int cfId=0;
					CFNode currentCFNode=null;
					while(startStatement instanceof NextStatement) {
						NextStatement currentStatement=(NextStatement)startStatement;
						if(currentStatement instanceof PatternStatement) {
							PatternStatement patternStmt = (PatternStatement)startStatement;
							CFNode cfNode = democlesHelper.createCFNode();
							cfNode.setId(cfId++);
							cfNode.setScope(rootscope);
							cfNode.setPrev(currentCFNode);
							if(cfNode.getPrev()!=null)
								cfNode.getPrev().setNext(cfNode);
							EditorPattern pattern=patternStmt.getPatternReference().getPattern();
							Map<PatternType,Pattern> patterns=visitor.visit(pattern);
							for(PatternType patternType : PatternType.values()) {
								Pattern democlesPattern=patterns.get(patternType);
								if(democlesPattern==null)
									continue;
								PatternNameGenerator.setPatternName(correspondingEClass, correspondingEop, cfNode, pattern,
										patternType,democlesPattern);
								//register pattern
								this.adapterController.saveAsRegisteredAdapter(democlesPattern,
							            correspondingEClass, patternType.getSuffix(),
							            resourceSet);
								PatternInvocation invocation=createPatternInvocation(rootscope, cfNode, pattern, democlesPattern);
								patternStmt.getParameters().forEach(param ->{
									bindConstructedVariablesFromParameter(rootscope, democlesPattern, invocation,
											param);

								});
							}
							//TODO: still necessary?
							/*List<EClass> referencedEClasses;
							if(patternToClassesLookup.containsKey(pattern)) {
								referencedEClasses=patternToClassesLookup.get(pattern);
							}
							else {
								referencedEClasses= new ArrayList<EClass>();
								patternToClassesLookup.put(pattern, referencedEClasses);
							}
							referencedEClasses.add(correspondingEClass);*/
							currentCFNode=cfNode;
						}
						else if(currentStatement instanceof ObjectVariableStatement) {
							ObjectVariableStatement stmt=(ObjectVariableStatement)currentStatement;
							//TODO:include binding
							createCFVariableFromObjectVariable(rootscope, stmt);
						}
						startStatement=currentStatement.getNext();
					}
					//Create Return Statement
					createReturnStatement(rootscope, currentCFNode,cfId);
					//Register CF
					this.adapterController.saveAsRegisteredAdapter(rootscope, correspondingEop, DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION, resourceSet);
					performScopeValidation(null, correspondingEop, rootscope, resourceSet);
				}
			}
		}
		return contextEPackage;
	}

	private void bindConstructedVariablesFromParameter(Scope rootscope, Pattern democlesPattern,
			PatternInvocation invocation, CalledPatternParameter param) {
		//TODO: Do smth with called parameter
		ObjectVariableStatement elem=(ObjectVariableStatement) param.getObject();
		CFVariable from =rootscope.getVariables().stream().filter( cfVar -> cfVar.getName().equals(elem.getName())).findFirst().get();
		VariableReference varRef=democlesHelper.createVariableReference();
		varRef.setFrom(from);
		Variable to=democlesPattern.getSymbolicParameters().stream().filter(emfVar -> param.getParameter().getName().equals(emfVar.getName())).findFirst().get();
		varRef.setTo(to);
		varRef.setInvocation(invocation);
		if(from.getConstructor()==null)
			from.setConstructor(invocation);
	}

	private EOperation createCFVariableForParameters(EClass correspondingEClass, MethodDec eOp, Scope rootscope) {
		EOperation correspondingEop=correspondingEClass.getEOperations().stream().filter( clazzEop-> {return clazzEop.getName().equals(eOp.getName());}).findAny().get();
		correspondingEop.getEParameters().forEach(param -> {
			CFVariable cfVariable=democlesHelper.createCFVariable();
			cfVariable.setName(param.getName());
			cfVariable.setScope(rootscope);
			cfVariable.setType(param.getEType());
			cfVariable.setLocal(false);
			rootscope.getVariables().add(cfVariable);
		});
		return correspondingEop;
	}

	private void createThisVariable(EClass correspondingEClass, Scope rootscope) {
		CFVariable thisVariable=democlesHelper.createCFVariable();
		thisVariable.setName("this");
		thisVariable.setScope(rootscope);
		thisVariable.setType(correspondingEClass);
		thisVariable.setLocal(false);
		rootscope.getVariables().add(thisVariable);
	}

	private PatternInvocation createPatternInvocation(Scope rootscope, CFNode cfNode, EditorPattern pattern,
			Pattern blackPattern) {
		RegularPatternInvocation patternInvocation=democlesHelper.createRegularPatternInvocation();
		patternInvocation.setCfNode(cfNode);
		patternInvocation.setPattern(blackPattern);
		//Create Variable References
			rootscope.getVariables().forEach(cfVar ->{
			Optional<Variable> target= blackPattern.getSymbolicParameters().stream().filter( emfVar -> emfVar.getName().equals(cfVar.getName())).findFirst();
			if(!target.isPresent())
				return;
			cfVar.getName();
			VariableReference reference = democlesHelper.createVariableReference();
			reference.setTo(target.get());
			reference.setFrom(cfVar);
			reference.setInvocation(patternInvocation);
		});
		cfNode.setMainAction(patternInvocation);
		return patternInvocation;
	}

	private void createReturnStatement(Scope rootscope, CFNode currentCFNode,int cfID) {
		ReturnStatement returnstmt = democlesHelper.createReturnStatement();
		returnstmt.setId(cfID);
		returnstmt.setPrev(currentCFNode);
		returnstmt.setScope(rootscope);
		Action emptyReturnAction=democlesHelper.createAction();
		emptyReturnAction.setCfNode(returnstmt);
		returnstmt.setMainAction(emptyReturnAction);
	}

	private void createCFVariableFromObjectVariable(Scope rootscope, ObjectVariableStatement stmt) {
		CFVariable cfVariable =democlesHelper.createCFVariable();
		cfVariable.setScope(rootscope);
		cfVariable.setName(stmt.getName());
		cfVariable.setType(stmt.getEType());
		cfVariable.setLocal(true);
		rootscope.getVariables().add(cfVariable);
	}


	   public final void performScopeValidation(final ScopeValidator scopeValidator, final EOperation eOperation, final Scope scope,ResourceSet resourceSet)
	   {
		  boolean loadIntoResourceSet=true;
		  //TODO: check
	      final AdapterResource controlFlowResource = (AdapterResource) EcoreUtil.getRegisteredAdapter(eOperation,
	            DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION);
	      if (loadIntoResourceSet && controlFlowResource.getResourceSet() == null)
	      {
	         resourceSet.getResources().add(controlFlowResource);
	      }
	      controlFlowResource.getContents().add(scope);

	      // Add this object and method parameters to the (root) scope
	      final CFVariable thisObject = DemoclesFactory.eINSTANCE.createCFVariable();
	      scope.getVariables().add(thisObject);
	      thisObject.setName("this");
	      thisObject.setType(eOperation.getEContainingClass());
	      thisObject.setLocal(false);
	      for (final EParameter eParameter : eOperation.getEParameters())
	      {
	         final CFVariable parameter = DemoclesFactory.eINSTANCE.createCFVariable();
	         scope.getVariables().add(parameter);
	         parameter.setName(eParameter.getName());
	         parameter.setType(eParameter.getEType());
	         parameter.setLocal(false);
	      }

	      // Perform scope validation
	      scope.accept(ScopeFactory.eINSTANCE.createScopeValidator());
	   }
}
