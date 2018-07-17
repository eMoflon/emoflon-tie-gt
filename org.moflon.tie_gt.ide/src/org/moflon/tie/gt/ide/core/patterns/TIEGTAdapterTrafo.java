package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorPatternType;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.compiler.sdm.democles.eclipse.AdapterResource;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.EClassDef;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodDec;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodParameter;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.TypedElement;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowFactory;
import org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation;
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
import org.moflon.tie.gt.ide.core.codegeneration.CodeadapterTrafo;
import org.moflon.tie.gt.ide.core.codegeneration.ECoreAdapterController;
import org.moflon.tie.gt.ide.core.codegeneration.PatternBuilderVisitor;
import org.moflon.tie.gt.ide.core.codegeneration.PatternBuilderVisitor.PatternType;
import org.moflon.tie.gt.ide.core.codegeneration.TransformationConfiguration;

public class TIEGTAdapterTrafo implements CodeadapterTrafo {
	
	private TransformationConfiguration transformationConfiguration;
	DemoclesFactory democlesHelper = DemoclesFactory.eINSTANCE;
	ECoreAdapterController adapterController;

	
	public TIEGTAdapterTrafo() {
		this.adapterController= new ECoreAdapterController();
	}

	//TODO:remove map possibly
	@Override
	public EPackage transform(EPackage contextEPackage, GraphTransformationControlFlowFile mCF,
			ResourceSet resourceSet,Map<EditorPattern, Pattern> editorToDemoclesPatterns) {
		Map<EditorPattern,List<EClass>> patternToClassesLookup=new HashMap<EditorPattern, List<EClass>>();
		//PatternReferenceCollector
		PatternBuilderVisitor visitor= new PatternBuilderVisitor(contextEPackage,resourceSet);
		for(EClassDef clazz: mCF.getEClasses()) {
			EClass correspondingEClass=(EClass)contextEPackage.getEClassifiers().stream().filter(eClazz -> eClazz.getName().equals(clazz.getName().getName())).findFirst().get();
			//transformMethodsToEOperations(contextEClass, clazz, changeableContext, this.transformationConfiguration);
			for(MethodDec eOp:clazz.getOperations()) {
				if(eOp.getStartStatement()!=null) {
					Scope rootscope = democlesHelper.createScope();
					//Create this Variable TODO: check if this process is ok, creating a CF Variable for every node in the pattern
					CFVariable thisVariable=democlesHelper.createCFVariable();
					thisVariable.setName("this");
					thisVariable.setScope(rootscope);
					thisVariable.setType(correspondingEClass);
					thisVariable.setLocal(false);
					rootscope.getVariables().add(thisVariable);
					EOperation correspondingEop=correspondingEClass.getEOperations().stream().filter( clazzEop-> {return clazzEop.getName().equals(eOp.getName());}).findAny().get();
					correspondingEop.getEParameters().forEach(param -> {
						CFVariable cfVariable=democlesHelper.createCFVariable();
						cfVariable.setName(param.getName());
						cfVariable.setScope(rootscope);
						cfVariable.setType(param.getEType());
						cfVariable.setLocal(false);
						rootscope.getVariables().add(cfVariable);
					});
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
								PatternNameGenerator patternNameGenerator=new PatternNameGenerator();
								patternNameGenerator.setSuffix(patternType.getSuffix());
								patternNameGenerator.setCFNode(cfNode);
								patternNameGenerator.setEClass(correspondingEClass);
								patternNameGenerator.setEOperation(correspondingEop);
								patternNameGenerator.setPatternDefinition(pattern);
								democlesPattern.setName(patternNameGenerator.generateName());
								//register pattern
								this.adapterController.saveAsRegisteredAdapter(democlesPattern,
							            correspondingEClass, patternType.getSuffix(),
							            resourceSet);
								PatternInvocation invocation=createPatternInvocation(rootscope, cfNode, pattern, democlesPattern);
								patternStmt.getParameters().forEach(param ->{
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
									
								});
							}
							List<EClass> referencedEClasses;
							if(patternToClassesLookup.containsKey(pattern)) {
								referencedEClasses=patternToClassesLookup.get(pattern);
							}
							else {
								referencedEClasses= new ArrayList<EClass>();
								patternToClassesLookup.put(pattern, referencedEClasses);
							}
							referencedEClasses.add(correspondingEClass);
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
		
		//End of collection
		List<EditorPattern> blackPatterns=patternToClassesLookup.keySet().stream().filter( p -> p.getType()==EditorPatternType.PATTERN).collect(Collectors.toList());
		List<EditorPattern> redAndGreen=patternToClassesLookup.keySet().stream().filter(p->p.getType()==EditorPatternType.RULE).collect(Collectors.toList());
		List<EditorPattern> redPatterns=redAndGreen.stream().filter( p -> EditorPatternClassifier.isRedPattern(p)).collect(Collectors.toList());
		List<EditorPattern> greenPatterns=redAndGreen.stream().filter( p -> EditorPatternClassifier.isGreenPattern(p)).collect(Collectors.toList());
		List<EditorPattern> expressionPatterns=redAndGreen.stream().filter( p -> EditorPatternClassifier.isExpressionPattern(p)).collect(Collectors.toList());
		//TODO: Transform Patterns
		Map<Pattern,List<EClass> > democlesPatterns=new HashMap<Pattern, List<EClass> >();
		blackPatterns.forEach(gtPattern ->{democlesPatterns.put(transformBlackPattern(gtPattern), patternToClassesLookup.get(gtPattern));} );
		redPatterns.forEach(gtPattern ->{democlesPatterns.put(transformRedPattern(gtPattern), patternToClassesLookup.get(gtPattern));} );
		greenPatterns.forEach(gtPattern ->{democlesPatterns.put(transformGreenPattern(gtPattern), patternToClassesLookup.get(gtPattern));} );
		expressionPatterns.forEach(gtPattern ->{democlesPatterns.put(transformExpressionPattern(gtPattern), patternToClassesLookup.get(gtPattern));} );
		//add Patterns to EClasses
		//democlesPatterns.forEach((pattern, classes) ->classes.stream().forEach(clazz -> attachToEClass(clazz,pattern)));
		return contextEPackage;
	}

	private PatternInvocation createPatternInvocation(Scope rootscope, CFNode cfNode, EditorPattern pattern,
			Pattern blackPattern) {
		RegularPatternInvocation patternInvocation=democlesHelper.createRegularPatternInvocation();
		patternInvocation.setCfNode(cfNode);
		patternInvocation.setPattern(blackPattern);
		//TODO: Foreach CFVar that is free and passed to the pattern create a ConstructedVariable reference
		/*blackPattern.getSymbolicParameters().forEach( symbolicParam ->{
			if(rootscope.getVariables().stream().noneMatch( cfVariable -> {return symbolicParam.getName().equals(cfVariable.getName());})) {
				CFVariable newCFVariable =democlesHelper.createCFVariable();
				newCFVariable.setScope(rootscope);
				newCFVariable.setName(symbolicParam.getName());
				//TODO: newCFVariable.setType();
				newCFVariable.setLocal(false);
				newCFVariable.setType(pattern.getNodes().stream().filter(node -> {
					return node.getName().equals(newCFVariable.getName());
				}).findAny().get().getType());
				patternInvocation.getConstructedVariables().add(newCFVariable);
				rootscope.getVariables().add(newCFVariable);
			}
				
		});*/
		/*pattern.getParameters().forEach( editorParam -> {
			if(editorParam.getName().equals("this"))
				return;
			else 
				patternInvocation
			}));
		});
		patternInvocation.getConstructedVariables().addAll(rootscope.getVariables().stream().filter(cfVar -> {
			if(blackPattern!=null) {
				return pattern.getParameters().stream().anyMatch(var -> var.getName().equals(cfVar.getName()));
						}
			else
				return true;
			}).collect(Collectors.toList()));*/
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
	}

	private void createCFVariableFromObjectVariable(Scope rootscope, ObjectVariableStatement stmt) {
		CFVariable cfVariable =democlesHelper.createCFVariable();
		cfVariable.setScope(rootscope);
		cfVariable.setName(stmt.getName());
		cfVariable.setType(stmt.getEType());
		cfVariable.setLocal(true);
		rootscope.getVariables().add(cfVariable);
	}

	private void attachToEClass(EClass clazz, Pattern pattern) {
		// TODO implement or do inline
		return ;
	}

	private Pattern transformExpressionPattern(EditorPattern gtPattern) {
		// TODO Auto-generated method stub
		return null;
	}

	private Pattern transformGreenPattern(EditorPattern gtPattern) {
		// TODO Auto-generated method stub
		return null;
	}

	private Pattern transformRedPattern(EditorPattern gtPattern) {
		// TODO Auto-generated method stub
		return null;
	}

	private Pattern transformBlackPattern(EditorPattern gtPattern) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void transformMethodsToEOperations(final EClass contextEClass, final EClassDef eclassDef, final EClass changeableContext, final TransformationConfiguration transformationConfiguration)
	   {
	      final PatternNameGenerator patternNameGenerator = transformationConfiguration.getPatternCreationController().getPatternNameGenerator();
	      patternNameGenerator.setEClass(changeableContext);
	      
	      for (final MethodDec methodDec : eclassDef.getOperations())
	      {
	         // this is a closure which will test if an EOperation with its EParameters already exist
	         Predicate<? super EOperation> eOpTest = (eo -> eo.getName().equals(methodDec.getName()) && methodDec.getEParameters().stream()
	               .allMatch(param -> eo.getEParameters().stream().anyMatch(eParam -> eParam.getEType().getName().equals(param.getEType().getName()))));
	         Optional<EOperation> opt = changeableContext.getEOperations().stream().filter(eOpTest).findFirst();

	         if (opt.isPresent())
	         {
	            changeableContext.getEOperations().remove(opt.get());
	         }

	         final MoflonOperation eOperation = createAndAddMoflonOperation(changeableContext, methodDec, transformationConfiguration);

	         patternNameGenerator.setEOperation(eOperation);
	         transformFirstStatement(methodDec, eOperation, transformationConfiguration);
	      }
	      
	   }

	   private MoflonOperation createAndAddMoflonOperation(final EClass changeableContext, final MethodDec methodSpecification, final TransformationConfiguration transformationConfiguration)
	   {
	      final MoflonOperation eOperation = ControlflowFactory.eINSTANCE.createMoflonOperation();
	      eOperation.setName(methodSpecification.getName());
	      eOperation.getEParameters().addAll(methodSpecification.getEParameters());
	      eOperation.setEType(methodSpecification.getEType());
	      changeableContext.getEOperations().add(eOperation);
	      return eOperation;
	   }

	   private EPackage getRootPackage(EPackage ePackage){
	      EPackage rootPackage = ePackage;
	      while(rootPackage.getESuperPackage() != null)
	         rootPackage = rootPackage.getESuperPackage();
	      return rootPackage;
	   }
	   
	   private Collection<EClassifier> getAllClassifiers(EPackage anyPackage){
	      LinkedList<EPackage> packageStack = new LinkedList<>(); 
	      Set<EPackage> labeled = new HashSet<>();
	      Set<EClassifier> allClassifier = new HashSet<>();
	      packageStack.addLast(getRootPackage(anyPackage));
	      while(!packageStack.isEmpty()){
	         EPackage ePackage = packageStack.removeLast();
	         if(!labeled.contains(ePackage)){
	            labeled.add(ePackage);
	            allClassifier.addAll(ePackage.getEClassifiers());
	            ePackage.getESubpackages().forEach(subPackage -> packageStack.addLast(subPackage));
	         }
	      }
	      
	      return allClassifier;
	   }
	   


	   private void transformFirstStatement(final MethodDec methodDec, final MoflonOperation eOperation, final TransformationConfiguration transformationConfiguration)
	   {
	      final Statement startStatement = methodDec.getStartStatement();
	      final Scope rootScope = DemoclesFactory.eINSTANCE.createScope();
	      eOperation.setRootScope(rootScope);
	      
	      if (startStatement != null)
	      {
	         transformationConfiguration.getStatementCreationController().loadCurrentMethod(methodDec);
	         transformationConfiguration.getStatementCreationController().transformStatement(startStatement, rootScope, null);
	      }
	      
	      transformationConfiguration.getECoreAdapterController().saveAsRegisteredAdapter(rootScope, eOperation, DemoclesMethodBodyHandler.CONTROL_FLOW_FILE_EXTENSION, transformationConfiguration.getContextController().getResourceSet());
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
	      //TODO: own trafo
	      //scope.accept(scopeValidator);
	   }
}
