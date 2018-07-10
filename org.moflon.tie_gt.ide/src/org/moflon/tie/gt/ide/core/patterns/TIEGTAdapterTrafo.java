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
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorPatternType;
import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.EClassDef;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodDec;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodParameter;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Statement;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowFactory;
import org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.tie.gt.ide.core.codegeneration.CodeadapterTrafo;
import org.moflon.tie.gt.ide.core.codegeneration.TransformationConfiguration;

public class TIEGTAdapterTrafo implements CodeadapterTrafo {

	@Override
	public EPackage transform(EPackage contextEPackage, GraphTransformationControlFlowFile mCF,
			ResourceSet resourceSet,Map<EditorPattern, Pattern> editorToDemoclesPatterns) {
		Map<EditorPattern,List<EClass>> patternToClassesLookup=new HashMap<EditorPattern, List<EClass>>();
		// TODO Auto-generated method stub
		//PatternReferenceCollector
		for(EClassDef clazz: mCF.getEClasses()) {
			for(MethodDec eOp:clazz.getOperations()) {
				if(eOp.getStartStatement()!=null) {
					Statement startStatement=eOp.getStartStatement();
					//TODO: take care for return statements
					while(startStatement instanceof NextStatement) {
						NextStatement currentStatement=(NextStatement)startStatement;
						if(currentStatement instanceof PatternStatement) {
							PatternStatement patternStmt = (PatternStatement)startStatement;
							EditorPattern pattern=patternStmt.getPatternReference().getPattern();
							List<EClass> referencedEClasses;
							if(patternToClassesLookup.containsKey(pattern)) {
								referencedEClasses=patternToClassesLookup.get(pattern);
							}
							else {
								referencedEClasses= new ArrayList<EClass>();
								patternToClassesLookup.put(pattern, referencedEClasses);
							}
							referencedEClasses.add(clazz.getName());
						}
						startStatement=currentStatement.getNext();
						
					}
				}
			}
		}
		
		//End of collection
		List<EditorPattern> blackPatterns=patternToClassesLookup.keySet().stream().filter( p -> p.getType()==EditorPatternType.PATTERN).collect(Collectors.toList());
		List<EditorPattern> redAndGreen=patternToClassesLookup.keySet().stream().filter(p->p.getType()!=EditorPatternType.PATTERN).collect(Collectors.toList());
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
		democlesPatterns.forEach((pattern, classes) ->classes.stream().forEach(clazz -> attachToEClass(clazz,pattern)));
		return contextEPackage;
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
	      eOperation.getEParameters().addAll(createEParameters(methodSpecification.getEParameters(), transformationConfiguration));
	      eOperation.setEType(getEType(methodSpecification, changeableContext));
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
	   
	   private EClassifier getEType(MethodDec methodSpecification, EClass changeableContext){
	      Collection<EClassifier> allClassifier = getAllClassifiers(changeableContext.getEPackage());
	      Optional<EClassifier> typeMonad = allClassifier.stream().filter(eClassifier -> methodSpecification.getEType() != null && eClassifier.getName().equals(methodSpecification.getEType().getName())).findFirst();
	      if(typeMonad.isPresent())
	         return typeMonad.get();
	      else
	         return methodSpecification.getEType();
	   }
	   
	   private Collection<? extends EParameter> createEParameters(final EList<EParameter> eList, final TransformationConfiguration transformationConfiguration)
	   {
	      final List<EParameter> paramLst = new ArrayList<>();
	      for (EParameter methodParameterSpecification : eList)
	      {
	         EParameter eParam = EcoreFactory.eINSTANCE.createEParameter();
	         eParam.setName(methodParameterSpecification.getName());
	         eParam.setEType(transformationConfiguration.getContextController().getTypeContext(methodParameterSpecification.getEType()));
	         eParam.setLowerBound(0);
	         eParam.setUpperBound(1);
	         eParam.setUnique(true);
	         eParam.setOrdered(true);
	         paramLst.add(eParam);
	      }
	      return paramLst;
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

}
