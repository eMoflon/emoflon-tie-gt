package org.moflon.tie.gt.ide.core.codegeneration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.EClassDef;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.MethodDec;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.NextStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.PatternStatement;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.Statement;

public class TIEGTAdapterTrafo implements CodeadapterTrafo {
	

	@Override
	public EPackage transform(EPackage contextEPackage, GraphTransformationControlFlowFile mCF,
			ResourceSet resourceSet) {
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
		List<EditorPattern> blackPatterns=patternToClassesLookup.keySet().stream().filter( p -> EditorPatternClassifier.isBlackPattern(p)).collect(Collectors.toList());
		List<EditorPattern> redPatterns=patternToClassesLookup.keySet().stream().filter( p -> EditorPatternClassifier.isRedPattern(p)).collect(Collectors.toList());
		List<EditorPattern> greenPatterns=patternToClassesLookup.keySet().stream().filter( p -> EditorPatternClassifier.isGreenPattern(p)).collect(Collectors.toList());
		List<EditorPattern> expressionPatterns=patternToClassesLookup.keySet().stream().filter( p -> EditorPatternClassifier.isExpressionPattern(p)).collect(Collectors.toList());
		//TODO: Translate Patterns
		return contextEPackage;
	}

}
