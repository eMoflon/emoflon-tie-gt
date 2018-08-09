package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
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
import org.gervarro.democles.specification.emf.Variable;
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
	Map<PatternType,Map<EObject,EMFVariable> > emfVariableLUT;
	Map<PatternType,Map<EditorAttribute,Attribute>> attributeLUT;
	PatternNameGenerator patternNameGenerator;
	ContextController contextController;

	public PatternBuilderVisitor(EPackage contextEPackage, ResourceSet resourceSet) {
		this.generatedDemoclesPatterns = new HashMap<PatternBuilderVisitor.PatternType, Pattern>();
		this.emfVariableLUT=new HashMap<PatternType,Map<EObject, EMFVariable>>();
		this.attributeLUT=new HashMap<PatternType,Map<EditorAttribute, Attribute>>();
		this.contextController = new ContextController();
		this.contextController.setEPackage(contextEPackage);
		this.contextController.setResourceSet(resourceSet);
	}

	public Map<PatternType, Pattern> visit(EditorPattern pattern) {
		// TODO: make this dynamic
		//TODO: reset map for each pattern kind(or try without?)
		pattern.getNodes().forEach(n -> visit(n,pattern));
		return generatedDemoclesPatterns;
	}

	private void createPattern(EditorPattern pattern, PatternType patternType) {
		Pattern democlesPattern = patternHelper.createPattern();
		this.generatedDemoclesPatterns.put(patternType, democlesPattern);
		this.emfVariableLUT.put(patternType, new HashMap<EObject, EMFVariable>());
		this.attributeLUT.put(patternType, new HashMap<EditorAttribute, Attribute>());
		PatternBody body = patternHelper.createPatternBody();
		body.setHeader(democlesPattern);
		pattern.getParameters().forEach(param ->{
			createEMFVariableFromEditorParameter(patternType, param);
		});
	}

	private void createEMFVariableFromEditorParameter(PatternType type, EditorParameter param) {
		//TODO:checkBack
		if(this.emfVariableLUT.get(type).containsKey(param)) {
			return;
		}
		else {
			EMFVariable emfParam= getOrCreateEMFVariableCached(param, null,type);
			emfParam.setEClassifier(contextController.getTypeContext(param.getType()));
			this.emfVariableLUT.get(type).put(param, emfParam);
			this.generatedDemoclesPatterns.get(type).getSymbolicParameters().add(emfParam);
		}
	}

	void visit(EditorNode node,EditorPattern editorPattern) {
		List<PatternType> patternTypes=new ArrayList<PatternBuilderVisitor.PatternType>();
		if (node.getOperator() == EditorOperator.CONTEXT) {
			patternTypes=Arrays.asList(PatternType.BLACK_PATTERN);
		} 
		if(node.getOperator()==EditorOperator.DELETE) {
				patternTypes=Arrays.asList(PatternType.BLACK_PATTERN,PatternType.RED_PATTERN);
		}
		if(node.getOperator()==EditorOperator.CREATE) {
				patternTypes=Arrays.asList(PatternType.GREEN_PATTERN);
		}
		for(PatternType type:patternTypes ) {
			if(!this.generatedDemoclesPatterns.containsKey(type)) {
				createPattern(editorPattern, type);
			}
			if(!this.emfVariableLUT.get(type).containsKey(node)) {
				EMFVariable var = getOrCreateEMFVariableCached(node, null,type);
				generatedDemoclesPatterns.get(type).getSymbolicParameters().add(var);
				var.setEClassifier(contextController.getTypeContext(node.getType()));	
			}
		}
		node.getAttributes().forEach(attribute -> visit(attribute,node,editorPattern));
		node.getReferences().forEach(reference -> visit(reference, node,editorPattern));
	}

	void visit(EditorAttribute editorAttribute,EditorNode source,EditorPattern pattern) {
		PatternType type;
		if (editorAttribute.getRelation() != EditorRelation.ASSIGNMENT) {
			type=PatternType.BLACK_PATTERN;
		}
		else {
			type=PatternType.GREEN_PATTERN;
		} 
			if(!this.generatedDemoclesPatterns.containsKey(type)) {
				createPattern(pattern, type);
			}
			PatternBody patternBody=this.generatedDemoclesPatterns.get(type).getBodies().get(0);
			if(!this.emfVariableLUT.get(type).containsKey(editorAttribute)) {
				
			}
			Attribute emfAttribute=lookupOrCreateAttribute(patternBody, this.contextController.getEAttributeContext(editorAttribute.getAttribute(), source.getType()));
			if(emfAttribute.getParameters().isEmpty()) {
				ConstraintParameter from = patternHelper.createConstraintParameter();
				if(!this.emfVariableLUT.get(type).containsKey(source)) {
					EMFVariable newNodeVariable= getOrCreateEMFVariableCached(source, null,type);
					newNodeVariable.setEClassifier(contextController.getTypeContext(source.getType()));
					this.generatedDemoclesPatterns.get(type).getSymbolicParameters().add(newNodeVariable);
				}
				from.setReference(this.emfVariableLUT.get(type).get(source));
				emfAttribute.getParameters().add(from);
				patternBody.getConstraints().add(emfAttribute);
			}
			RelationalConstraint relConstraint = createRelationalConstraint(editorAttribute);
			if(relConstraint==null)
				return;
			ConstraintParameter to=patternHelper.createConstraintParameter();
			EditorExpression expr=editorAttribute.getValue();
			if(expr instanceof EditorAttributeExpression) {
				EditorAttributeExpression attributeExpr = (EditorAttributeExpression) expr;
				Attribute attributeReference=lookupOrCreateAttribute(patternBody,contextController.getEAttributeContext(attributeExpr.getAttribute(), contextController.getTypeContext(attributeExpr.getNode().getType())));
				if(attributeReference.getParameters().isEmpty()) {
					if(!this.emfVariableLUT.get(type).containsKey(attributeExpr.getAttribute())){
						EMFVariable newAttribute= getOrCreateEMFVariableCached(attributeExpr.getAttribute(), attributeExpr.getNode(),type);
						newAttribute.setEClassifier(contextController.getTypeContext(attributeExpr.getAttribute().getEType()));
						patternBody.getLocalVariables().add(newAttribute);
					}
					EMFVariable attribute = (EMFVariable) this.emfVariableLUT.get(type).get((attributeExpr.getAttribute()));
					patternBody.getConstraints().add(attributeReference);
					ConstraintParameter fromNode = patternHelper.createConstraintParameter();
					if(!this.emfVariableLUT.get(type).containsKey(attributeExpr.getNode())) {
						EMFVariable newEmfVar= getOrCreateEMFVariableCached(attributeExpr.getNode(), null,type);
						newEmfVar.setEClassifier(contextController.getTypeContext(attributeExpr.getNode().getType()));
						this.generatedDemoclesPatterns.get(type).getSymbolicParameters().add(newEmfVar);
					}
					fromNode.setReference(this.emfVariableLUT.get(type).get(attributeExpr.getNode()));
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
				to.setReference(this.emfVariableLUT.get(type).get(eParamExpression.getParameter()));
			}
			ConstraintParameter tmpAttrVal = patternHelper.createConstraintParameter();
			if(!this.emfVariableLUT.get(type).containsKey(editorAttribute.getAttribute())) {
				EMFVariable tmpAttrVar= getOrCreateEMFVariableCached(editorAttribute.getAttribute(), source,type);
				patternBody.getLocalVariables().add(tmpAttrVar);
				tmpAttrVar.setEClassifier(contextController.getTypeContext(emfAttribute.getEModelElement().getEType()));
			}
			tmpAttrVal.setReference(this.emfVariableLUT.get(type).get(editorAttribute.getAttribute()));
			if(emfAttribute.getParameters().size()<2)
				emfAttribute.getParameters().add(tmpAttrVal);
			ConstraintParameter tmpAttrValCopy= patternHelper.createConstraintParameter();
			tmpAttrValCopy.setReference(this.emfVariableLUT.get(type).get(editorAttribute.getAttribute()));
			relConstraint.getParameters().add(tmpAttrValCopy);
			relConstraint.getParameters().add(to);
			patternBody.getConstraints().add(relConstraint);
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

	void visit(EditorReference editorReference, EditorNode source,EditorPattern editorPattern) {
		List<PatternType> patternTypes=new ArrayList<PatternBuilderVisitor.PatternType>();
		if (editorReference.getOperator() == EditorOperator.CONTEXT) {
			patternTypes=Arrays.asList(PatternType.BLACK_PATTERN);
		} 
		if(editorReference.getOperator()==EditorOperator.DELETE) {
				patternTypes=Arrays.asList(PatternType.BLACK_PATTERN,PatternType.RED_PATTERN);
		}
		if(editorReference.getOperator()==EditorOperator.CREATE) {
				patternTypes=Arrays.asList(PatternType.GREEN_PATTERN);
		}
		for(PatternType type:patternTypes ) {
			if(!this.generatedDemoclesPatterns.containsKey(type)) {
				createPattern(editorPattern, type);
			}
			PatternBody patternBody=this.generatedDemoclesPatterns.get(type).getBodies().get(0);
			Reference ref = emfHelper.createReference();
			ref.setEModelElement(
					this.contextController.getEReferenceContext(editorReference.getType(), source.getType()));
			ConstraintParameter from = patternHelper.createConstraintParameter();
			if(this.emfVariableLUT.get(type).containsKey(source))
				from.setReference(this.emfVariableLUT.get(type).get(source));
			else {
				//TODO: this should currently not occur, but keep an eye on local Variables for Nodes
				EMFVariable newVariable=getOrCreateEMFVariableCached(source, null, type);
				newVariable.setEClassifier(contextController.getTypeContext(source.getType()));
				patternBody.getHeader().getSymbolicParameters().add(newVariable);
				from.setReference(newVariable);
			}
			ConstraintParameter to = patternHelper.createConstraintParameter();
			if(this.emfVariableLUT.get(type).containsKey(editorReference.getTarget()))
				to.setReference(this.emfVariableLUT.get(type).get(editorReference.getTarget()));
			else {
				//TODO: this should currently not occur, but keep an eye on local Variables for Nodes
				EMFVariable newVariable=getOrCreateEMFVariableCached(editorReference.getTarget(), null, type);
				newVariable.setEClassifier(contextController.getTypeContext(editorReference.getTarget().getType()));
				patternBody.getHeader().getSymbolicParameters().add(newVariable);
				to.setReference(newVariable);
			}
			ref.getParameters().add(from);
			ref.getParameters().add(to);
			patternBody.getConstraints().add(ref);
		}
	}
	
	EMFVariable getOrCreateEMFVariableCached(EObject obj,EditorNode parent,PatternType patternType){
		String name=null;
		if(obj instanceof EditorNode) {
			name=((EditorNode) obj).getName();
		}
		if(obj instanceof EditorParameter) {
			name=((EditorParameter)obj).getName();
		}
		if(obj instanceof EAttribute) {
			name=((EAttribute)obj).getName();
		}
		if(name==null) {
			throw new RuntimeException("Type "+obj.getClass()+" is not supported for this operation");
		}
		String nameInLut=parent==null?name:parent.getName()+"_"+name;
		if(this.emfVariableLUT.get(patternType).containsKey(obj))
			return this.emfVariableLUT.get(patternType).get(obj);
		else {
			EMFVariable newVariable = emfHelper.createEMFVariable();
			newVariable.setName(nameInLut);
			this.emfVariableLUT.get(patternType).put(obj, newVariable);
			return newVariable;
		}
	}

}
