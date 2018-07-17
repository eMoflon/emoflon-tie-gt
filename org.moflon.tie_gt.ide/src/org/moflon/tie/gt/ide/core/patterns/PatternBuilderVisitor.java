package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorRelation;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.tie.gt.ide.core.patterns.PatternBuilderVisitor.PatternType;
import org.moflon.tie.gt.ide.core.runtime.utilities.ContextController;

public class PatternBuilderVisitor {
	public enum PatternType{BLACK_PATTERN,RED_PATTERN,GREEN_PATTERN,EXPRESSION_PATTERN,BINDING_PATTERN;

	public String getSuffix() {
		switch (this)
	      {
	      case BLACK_PATTERN:
	         return DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION;
	      case EXPRESSION_PATTERN:
	         return DemoclesMethodBodyHandler.EXPRESSION_FILE_EXTENSION;
	      case GREEN_PATTERN:
	         return DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION;
	      case RED_PATTERN:
	         return DemoclesMethodBodyHandler.RED_FILE_EXTENSION;
	      case BINDING_PATTERN:
	         return DemoclesMethodBodyHandler.BINDING_FILE_EXTENSION;
	      default:
	         return null;
	      }
	}};
	
	DemoclesFactory democlesHelper = DemoclesFactory.eINSTANCE;
	EMFTypeFactory emfHelper = EMFTypeFactory.eINSTANCE;
	SpecificationFactory patternHelper = SpecificationFactory.eINSTANCE;
	Map<PatternType,Pattern> generatedDemoclesPatterns;
	Map<EditorNode,EMFVariable> nodeToVariableLUT;
	PatternNameGenerator patternNameGenerator;
	ContextController contextController;
	
	public PatternBuilderVisitor(EPackage contextEPackage, ResourceSet resourceSet) {
		this.generatedDemoclesPatterns=new HashMap<PatternBuilderVisitor.PatternType, Pattern>();
		this.nodeToVariableLUT=new HashMap<EditorNode, EMFVariable>();
		this.contextController=new ContextController();
		this.contextController.setEPackage(contextEPackage);
	    this.contextController.setResourceSet(resourceSet);
	}
	
	
	public Map<PatternType,Pattern> visit(EditorPattern pattern) {
		//TODO: make this dynamic
		Pattern blackPattern =patternHelper.createPattern();
		this.generatedDemoclesPatterns.put(PatternType.BLACK_PATTERN,blackPattern);
		PatternBody body=patternHelper.createPatternBody();
		body.setHeader(blackPattern);
		pattern.getNodes().forEach(n -> visit(n));
		return generatedDemoclesPatterns;
	}
	
	void visit(EditorNode node) {
		if(node.getOperator()==EditorOperator.CONTEXT||node.getOperator()==EditorOperator.DELETE) {
			EMFVariable var=emfHelper.createEMFVariable();
			var.setName(node.getName());
			this.nodeToVariableLUT.put(node,var);
			generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getSymbolicParameters().add(var);
			var.setEClassifier(node.getType());
			
			//TODO: do black stuff
		}else {
			//TODO: do green stuff?
		}
		
		node.getAttributes().forEach(attribute -> visit(attribute));
		node.getReferences().forEach(reference -> visit(reference,generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getBodies().get(0),node));
	}
	
	void visit(EditorAttribute attribute) {
		if(attribute.getRelation()!=EditorRelation.ASSIGNMENT) {
			//TODO: do black stuff
		}
		else {
			//TODO: do green stuff
		}
	}
	
	void visit(EditorReference editorReference,PatternBody patternBody,EditorNode source) {
		if(editorReference.getOperator()==EditorOperator.CONTEXT) {
			//TODO: do black stuff
			Reference ref= emfHelper.createReference();
			ref.setEModelElement(this.contextController.getEReferenceContext(editorReference.getType(), source.getType().eClass()));
			ConstraintParameter from=patternHelper.createConstraintParameter();
			from.setReference(this.nodeToVariableLUT.get(source));
			ConstraintParameter to=patternHelper.createConstraintParameter();
			to.setReference(this.nodeToVariableLUT.get(editorReference.getTarget()));
			ref.getParameters().add(to);
			ref.getParameters().add(from);
		}else {
			//TODO: do green stuff?
		}
	}

}
