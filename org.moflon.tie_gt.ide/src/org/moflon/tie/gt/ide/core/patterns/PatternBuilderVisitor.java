package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeExpression;
import org.emoflon.ibex.gt.editor.gT.EditorEnumExpression;
import org.emoflon.ibex.gt.editor.gT.EditorExpression;
import org.emoflon.ibex.gt.editor.gT.EditorLiteralExpression;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.emoflon.ibex.gt.editor.gT.EditorParameterExpression;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorRelation;
import org.emoflon.ibex.gt.editor.utils.GTEditorAttributeUtils;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
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
	Map<EditorParameter,EMFVariable> paramToVariableLUT;
	Map<String,EMFVariable> emfVariableLUT;
	PatternNameGenerator patternNameGenerator;
	ContextController contextController;

	public PatternBuilderVisitor(EPackage contextEPackage, ResourceSet resourceSet) {
		this.generatedDemoclesPatterns = new HashMap<PatternBuilderVisitor.PatternType, Pattern>();
		this.paramToVariableLUT= new HashMap<EditorParameter, EMFVariable>();
		this.emfVariableLUT=new HashMap<String, EMFVariable>();
		this.contextController = new ContextController();
		this.contextController.setEPackage(contextEPackage);
		this.contextController.setResourceSet(resourceSet);
	}

	public Map<PatternType, Pattern> visit(EditorPattern pattern) {
		// TODO: make this dynamic
		//TODO: reset map for each pattern kind(or try without?)
		this.emfVariableLUT=new HashMap<String, EMFVariable>();
		Pattern blackPattern = patternHelper.createPattern();
		this.generatedDemoclesPatterns.put(PatternType.BLACK_PATTERN, blackPattern);
		PatternBody body = patternHelper.createPatternBody();
		body.setHeader(blackPattern);
		pattern.getParameters().forEach(param ->{
			createEMFVariableFromEditorParameter(blackPattern, param);
		});
		pattern.getNodes().forEach(n -> visit(n));
		return generatedDemoclesPatterns;
	}

	private void createEMFVariableFromEditorParameter(Pattern blackPattern, EditorParameter param) {
		EMFVariable emfParam=getOrCreateEMFVariableCached(param.getName(), null);
		emfParam.setEClassifier(contextController.getTypeContext(param.getType()));
		blackPattern.getSymbolicParameters().add(emfParam);
		this.paramToVariableLUT.put(param,emfParam);
	}

	void visit(EditorNode node) {
		if (node.getOperator() == EditorOperator.CONTEXT || node.getOperator() == EditorOperator.DELETE) {
			EMFVariable var = getOrCreateEMFVariableCached(node.getName(), null);
			generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getSymbolicParameters().add(var);
			var.setEClassifier(contextController.getTypeContext(node.getType()));

			// TODO: do black stuff
		} else {
			// TODO: do green stuff?
		}

		node.getAttributes().forEach(attribute -> visit(attribute,generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getBodies().get(0),node));
		node.getReferences().forEach(reference -> visit(reference,
				generatedDemoclesPatterns.get(PatternType.BLACK_PATTERN).getBodies().get(0), node));
	}

	void visit(EditorAttribute editorAttribute,PatternBody patternBody,EditorNode source) {
		Attribute emfAttribute=lookupOrCreateAttribute(patternBody, this.contextController.getEAttributeContext(editorAttribute.getAttribute(), source.getType()));
		if(emfAttribute.getParameters().isEmpty()) {
			ConstraintParameter from = patternHelper.createConstraintParameter();
			from.setReference(getOrCreateEMFVariableCached(source.getName(), null));
			emfAttribute.getParameters().add(from);
			patternBody.getConstraints().add(emfAttribute);
		}
		if (editorAttribute.getRelation() != EditorRelation.ASSIGNMENT) {
			RelationalConstraint relConstraint = createRelationalConstraint(editorAttribute);
			if(relConstraint==null)
				return;
			ConstraintParameter to=patternHelper.createConstraintParameter();
			EditorExpression expr=editorAttribute.getValue();
			if(expr instanceof EditorAttributeExpression) {
				EditorAttributeExpression attributeExpr = (EditorAttributeExpression) expr;
				Attribute attributeReference=lookupOrCreateAttribute(patternBody,contextController.getEAttributeContext(attributeExpr.getAttribute(), contextController.getTypeContext(attributeExpr.getNode().getType())));
				if(attributeReference.getParameters().isEmpty()) {
					EMFVariable attribute = getOrCreateEMFVariableCached(attributeExpr.getAttribute().getName(), attributeExpr.getNode());
					if(attribute.getEClassifier()==null) {
						attribute.setEClassifier(contextController.getTypeContext(attributeExpr.getAttribute().getEType()));
						patternBody.getLocalVariables().add(attribute);
					}
					patternBody.getConstraints().add(attributeReference);
					ConstraintParameter fromNode = patternHelper.createConstraintParameter();
					fromNode.setReference(getOrCreateEMFVariableCached(attributeExpr.getNode().getName(), null));
					attributeReference.getParameters().add(fromNode);
					ConstraintParameter toAttribute= patternHelper.createConstraintParameter();
					toAttribute.setReference(attribute);
					attributeReference.getParameters().add(toAttribute);
					to.setReference(attribute);
				}
			}
			if(expr instanceof EditorLiteralExpression) {
				createAndBindConstant(editorAttribute, patternBody, source, to, (EditorLiteralExpression)expr);
			}
			if(expr instanceof EditorEnumExpression) {
				createAndBindConstantForEnum(patternBody, to, (EditorEnumExpression)expr);
			}
			if(expr instanceof EditorParameterExpression) {
				EditorParameterExpression eParamExpression =(EditorParameterExpression) expr;
				to.setReference(this.paramToVariableLUT.get(eParamExpression.getParameter()));
			}
			ConstraintParameter tmpAttrVal = patternHelper.createConstraintParameter();
			EMFVariable tmpAttrVar=getOrCreateEMFVariableCached(editorAttribute.getAttribute().getName(), source);
			patternBody.getLocalVariables().add(tmpAttrVar);
			tmpAttrVar.setEClassifier(contextController.getTypeContext(emfAttribute.getEModelElement().getEType()));
			tmpAttrVal.setReference(tmpAttrVar);
			emfAttribute.getParameters().add(tmpAttrVal);
			ConstraintParameter tmpAttrValCopy= patternHelper.createConstraintParameter();
			tmpAttrValCopy.setReference(tmpAttrVar);
			relConstraint.getParameters().add(tmpAttrValCopy);
			relConstraint.getParameters().add(to);
			patternBody.getConstraints().add(relConstraint);
			}
		else {
			// TODO: do green stuff
		}
	}

	private Attribute lookupOrCreateAttribute(PatternBody patternBody, EAttribute eAttribute) {
		
		Optional<Constraint> existingAttribute=patternBody.getConstraints().stream().filter(constraint -> {
			if(constraint instanceof Attribute) {
				Attribute attribute = (Attribute) constraint;
				return attribute.getEModelElement().equals(eAttribute);
			}
			else return false;
				}).findAny();
		if(existingAttribute.isPresent())
			return (Attribute)existingAttribute.get();
		else{
			Attribute newAttribute=emfHelper.createAttribute();
			newAttribute.setEModelElement(eAttribute);
			return newAttribute;
		}
	}

	private void createAndBindConstant(EditorAttribute editorAttribute, PatternBody patternBody, EditorNode source,
			ConstraintParameter to, EditorLiteralExpression literalExpr) {
		Constant constant=patternHelper.createConstant();
		//TODO: lookup for existing constants?
		Optional<Object> value=GTEditorAttributeUtils.convertLiteralValueToObject(contextController.getEAttributeContext(editorAttribute.getAttribute(), contextController.getTypeContext(source.getType())).getEAttributeType(), literalExpr);
		if(value.isPresent()) {
			Object valueObject=value.get();
			setConstantValueWithAdjustedType(constant, valueObject);
		}
			else {
				constant.setValue(literalExpr.getValue());
			}
			
		patternBody.getConstants().add(constant);
		to.setReference(constant);
	}

	private void createAndBindConstantForEnum(PatternBody patternBody, ConstraintParameter to, EditorEnumExpression eEnumExpression) {
		//TODO: lookup for EEnumConstant
		EEnumLiteral literal=eEnumExpression.getLiteral();
		Constant enumLiteralConstant=patternHelper.createConstant();
		enumLiteralConstant.setValue(literal);
		patternBody.getConstants().add(enumLiteralConstant);
		to.setReference(enumLiteralConstant);
	}

	private void setConstantValueWithAdjustedType(Constant constant, Object valueObject) {
		if(valueObject instanceof Integer) {
			Integer integerValue=(Integer)valueObject;
			constant.setValue(integerValue);
		}
		if(valueObject instanceof String) {
			String stringValue=(String)valueObject;
			constant.setValue(stringValue);
		}
		if(valueObject instanceof Boolean) {
			Boolean boolValue=(Boolean)valueObject;
			constant.setValue(boolValue.booleanValue());
		}
		if(valueObject instanceof Double) {
			Double doubleValue=(Double)valueObject;
			constant.setValue(doubleValue.doubleValue());
		}
		if(valueObject instanceof Float) {
			Float floatValue=(Float)valueObject;
			constant.setValue(floatValue.floatValue());
		}
	}

	private String getNameForTemporaryAttributeVariable(EditorAttribute editorAttribute, EditorNode source) {
		return source.getName()+"_"+editorAttribute.getAttribute().getName();
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
			from.setReference(getOrCreateEMFVariableCached(source.getName(), null));
			ConstraintParameter to = patternHelper.createConstraintParameter();
			to.setReference(this.getOrCreateEMFVariableCached(editorReference.getTarget().getName(), null));
			ref.getParameters().add(from);
			ref.getParameters().add(to);
			patternBody.getConstraints().add(ref);
		} else {
			// TODO: do green stuff?
		}
	}
	
	EMFVariable getOrCreateEMFVariableCached(String name,EditorNode parent){
		String nameInLut=parent==null?name:parent.getName()+"_"+name;
		if(this.emfVariableLUT.containsKey(nameInLut))
			return this.emfVariableLUT.get(nameInLut);
		else {
			EMFVariable newVariable = emfHelper.createEMFVariable();
			newVariable.setName(nameInLut);
			this.emfVariableLUT.put(nameInLut, newVariable);
			return newVariable;
		}
	}

}
