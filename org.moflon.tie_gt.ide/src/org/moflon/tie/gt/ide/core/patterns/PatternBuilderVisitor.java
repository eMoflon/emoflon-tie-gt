package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeExpression;
import org.emoflon.ibex.gt.editor.gT.EditorEnumExpression;
import org.emoflon.ibex.gt.editor.gT.EditorExpression;
import org.emoflon.ibex.gt.editor.gT.EditorLiteralExpression;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorParameterExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorRelation;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.tie.gt.ide.core.runtime.utilities.ContextController;

public class PatternBuilderVisitor {
	public enum PatternType {
		BLACK_PATTERN, RED_PATTERN, GREEN_PATTERN, EXPRESSION_PATTERN, BINDING_PATTERN, BINDING_AND_BLACK_PATTERN;

		public String getSuffix() {
			switch (this) {
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
			case BINDING_AND_BLACK_PATTERN:
				return DemoclesMethodBodyHandler.BINDING_AND_BLACK_FILE_EXTENSION;
			default:
				return null;
			}
		}
	};
	RelationalConstraintFactory relationalConstraintsHelper= RelationalConstraintFactory.eINSTANCE;
	DemoclesFactory democlesHelper = DemoclesFactory.eINSTANCE;
	EMFTypeFactory emfHelper = EMFTypeFactory.eINSTANCE;
	SpecificationFactory patternHelper = SpecificationFactory.eINSTANCE;
	Map<PatternType, Pattern> generatedDemoclesPatterns;
	Map<EditorNode, EMFVariable> nodeToVariableLUT;
	PatternNameGenerator patternNameGenerator;
	ContextController contextController;

	public PatternBuilderVisitor(EPackage contextEPackage, ResourceSet resourceSet) {
		this.generatedDemoclesPatterns = new HashMap<PatternBuilderVisitor.PatternType, Pattern>();
		this.nodeToVariableLUT = new HashMap<EditorNode, EMFVariable>();
		this.contextController = new ContextController();
		this.contextController.setEPackage(contextEPackage);
		this.contextController.setResourceSet(resourceSet);
	}

	public Map<PatternType, Pattern> visit(EditorPattern pattern) {
		// TODO: make this dynamic
		Pattern blackPattern = patternHelper.createPattern();
		this.generatedDemoclesPatterns.put(PatternType.BLACK_PATTERN, blackPattern);
		PatternBody body = patternHelper.createPatternBody();
		body.setHeader(blackPattern);
		pattern.getNodes().forEach(n -> visit(n));
		return generatedDemoclesPatterns;
	}

	void visit(EditorNode node) {
		if (node.getOperator() == EditorOperator.CONTEXT || node.getOperator() == EditorOperator.DELETE) {
			EMFVariable var = emfHelper.createEMFVariable();
			var.setName(node.getName());
			this.nodeToVariableLUT.put(node, var);
			generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getSymbolicParameters().add(var);
			var.setEClassifier(node.getType());

			// TODO: do black stuff
		} else {
			// TODO: do green stuff?
		}

		node.getAttributes().forEach(attribute -> visit(attribute,generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getBodies().get(0),node));
		node.getReferences().forEach(reference -> visit(reference,
				generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getBodies().get(0), node));
	}

	void visit(EditorAttribute editorAttribute,PatternBody patternBody,EditorNode source) {
		Attribute emfAttribute= emfHelper.createAttribute();
		emfAttribute.setEModelElement(this.contextController.getEAttributeContext(editorAttribute.getAttribute(), source.getType()));
		ConstraintParameter from = patternHelper.createConstraintParameter();
		from.setReference(nodeToVariableLUT.get(source));
		ConstraintParameter tmpAttrVal = patternHelper.createConstraintParameter();
		//TODO:Create temporary EMFVariable (which cases?)
		//tmpAttrVal.setReference();
		emfAttribute.getParameters().add(from);
		emfAttribute.getParameters().add(tmpAttrVal);
		patternBody.getConstraints().add(emfAttribute);
		if (editorAttribute.getRelation() != EditorRelation.ASSIGNMENT) {
			RelationalConstraint relConstraint = createRelationalConstraint(editorAttribute);
			if(relConstraint==null)
				return;
			//TODO: add Constraint parameters
			EditorExpression expr=editorAttribute.getValue();
			if(expr instanceof EditorAttributeExpression) {
				//TODO:implement
			}
			if(expr instanceof EditorLiteralExpression) {
				//TODO:implement
			}
			if(expr instanceof EditorEnumExpression) {
				//TODO:implement
			}
			if(expr instanceof EditorParameterExpression) {
				//TODO:implement
			}
			relConstraint.getParameters().add(tmpAttrVal);
			ConstraintParameter to=patternHelper.createConstraintParameter();
			//TODO:Create temporary Variable for Constant value?
			//to.setReference();
			relConstraint.getParameters().add(to);
			patternBody.getConstraints().add(relConstraint);
			}
		else {
			// TODO: do green stuff
		}
	}

	private RelationalConstraint createRelationalConstraint(EditorAttribute attribute) {
		RelationalConstraint relConstraint;
		switch(attribute.getRelation()) {
		case EQUAL:
			relConstraint=relationalConstraintsHelper.createEqual();
			break;
		case GREATER:
			relConstraint=relationalConstraintsHelper.createLarger();
			break;
		case SMALLER:
			relConstraint=relationalConstraintsHelper.createSmaller();
			break;
		case GREATER_OR_EQUAL:
			relConstraint=relationalConstraintsHelper.createLargerOrEqual();
			break;
		case SMALLER_OR_EQUAL:
			relConstraint=relationalConstraintsHelper.createSmallerOrEqual();
			break;
		case UNEQUAL:
			relConstraint=relationalConstraintsHelper.createUnequal();
			break;
		default:
			System.out.println("Unsupported EditorRelation: "+ attribute.getRelation());
			return null;
		}
		return relConstraint;
	}

	void visit(EditorReference editorReference, PatternBody patternBody, EditorNode source) {
		if (editorReference.getOperator() == EditorOperator.CONTEXT || editorReference.getOperator()==EditorOperator.DELETE) {
			// TODO: do black stuff
			Reference ref = emfHelper.createReference();
			ref.setEModelElement(
					this.contextController.getEReferenceContext(editorReference.getType(), source.getType()));
			ConstraintParameter from = patternHelper.createConstraintParameter();
			from.setReference(this.nodeToVariableLUT.get(source));
			ConstraintParameter to = patternHelper.createConstraintParameter();
			to.setReference(this.nodeToVariableLUT.get(editorReference.getTarget()));
			ref.getParameters().add(from);
			ref.getParameters().add(to);
			patternBody.getConstraints().add(ref);
		} else {
			// TODO: do green stuff?
		}
	}

}
