package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.compiler.sdm.democles.pattern.DemoclesPatternType;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;
import org.moflon.tie.gt.ide.core.runtime.utilities.TypeLookup;

class VariableLookupTable {
	private final EMFTypeFactory emfHelper = EMFTypeFactory.eINSTANCE;
	private final Map<DemoclesPatternType, Map<Object, EMFVariable>> data = new HashMap<>();
	private final PatternLookup patternLookup;
	private final TypeLookup typeLookup;

	public VariableLookupTable(final PatternLookup patternLookup, final TypeLookup typeLookup) {
		this.patternLookup = patternLookup;
		this.typeLookup = typeLookup;
	}

	public EMFVariable getSymbolicParameter(final Object object, final EClassifier type,
			final DemoclesPatternType patternType) {
		return getSymbolicParameter(object, type, patternType);
	}

	public EMFVariable getSymbolicParameter(final EObject object, final DemoclesPatternType patternType) {
		final EClassifier type = typeLookup.determineTypeOfEditorElement(object);
	
		return getSymbolicParameter(object, type, patternType);
	}

	public EMFVariable getSymbolicParameter(final EObject object, final EClassifier type,
			final DemoclesPatternType patternType) {
		if (!containsKey(object, patternType)) {
			final EMFVariable variable = getOrCreateEMFVariable(object, patternType);
	
			variable.setEClassifier(typeLookup.getEClassifier(type));
			final Pattern pattern = patternLookup.getPattern(patternType);
			Patterns.registerSymbolicParameter(variable, pattern);
			return variable;
		} else {
			return get(object, patternType);
		}
	}

	public EMFVariable getLocalVariable(final EObject object, final DemoclesPatternType patternType) {
		return getLocalVariable(object, (Object) null, patternType);
	}

	public EMFVariable getLocalVariable(final Object object, final EClassifier type,
			final DemoclesPatternType patternType) {
		return getLocalVariable(object, null, type, patternType);
	}

	public EMFVariable getLocalVariable(final EObject child, final Object parent,
			final DemoclesPatternType patternType) {
	
		final EClassifier type = typeLookup.determineTypeOfEditorElement(child);
	
		return getLocalVariable(child, parent, type, patternType);
	}

	public EMFVariable getLocalVariable(final Object child, final Object parent, final EClassifier type,
			final DemoclesPatternType patternType) {
		if (!containsKey(child, parent, patternType)) {
			final EMFVariable newAttribute = getOrCreateVariable(child, parent, patternType);
	
			newAttribute.setEClassifier(typeLookup.getEClassifier(type));
			final Pattern pattern = patternLookup.getPattern(patternType);
			Patterns.registerLocalVariable(newAttribute, pattern);
			return newAttribute;
		} else {
			return get(child, parent, patternType);
		}
	}

	public EMFVariable getReturnVariable(final EObject returnObject, final Pattern pattern) {
		final EMFVariable returnEmfVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
		returnEmfVariable.setName(CodeConventions.RESULT_VARIABLE_NAME);
		returnEmfVariable
				.setEClassifier(typeLookup.getEClassifier(typeLookup.determineTypeOfEditorElement(returnObject)));
		pattern.getSymbolicParameters().add(0, returnEmfVariable);
	
		return returnEmfVariable;
	}

	public EMFVariable get(final Object object, final DemoclesPatternType type) {
		final String key = calculateLookupKey(object, null);
		return this.getVariableLookupForPatternType(type).get(key);
	}

	private boolean containsKey(final Object object, final Object parent, final DemoclesPatternType type) {
		final String key = calculateLookupKey(object, parent);
		return this.getVariableLookupForPatternType(type).containsKey(key);
	}

	private boolean containsKey(final Object object, final DemoclesPatternType type) {
		return containsKey(object, null, type);
	}

	private EMFVariable get(final Object object, final Object parent, final DemoclesPatternType type) {
		final String key = calculateLookupKey(object, parent);
		return this.getVariableLookupForPatternType(type).get(key);
	}

	private EMFVariable getOrCreateEMFVariable(final Object node, final DemoclesPatternType type) {
		return getOrCreateVariable(node, null, type);
	}

	private EMFVariable getOrCreateVariable(final Object obj, final Object parent, final DemoclesPatternType type) {
		final String keyForLookup = calculateLookupKey(obj, parent);
		final Map<Object, EMFVariable> variableLookupForPatternType = getVariableLookupForPatternType(type);
		if (variableLookupForPatternType.containsKey(keyForLookup))
			return variableLookupForPatternType.get(keyForLookup);
		else {
			final EMFVariable newVariable = emfHelper.createEMFVariable();
			newVariable.setName(keyForLookup);
			variableLookupForPatternType.put(keyForLookup, newVariable);
			return newVariable;
		}
	}

	private String calculateLookupKey(final Object object, final Object parent) {
		final String name;

		if (object instanceof EditorNode) {
			name = ((EditorNode) object).getName();
		} else if (object instanceof EditorParameter) {
			name = ((EditorParameter) object).getName();
		} else if (object instanceof EAttribute) {
			name = ((EAttribute) object).getName();
		} else if (object instanceof CFVariable) {
			name = ((CFVariable) object).getName();
		} else if (object instanceof String) {
			name = (String) object;
		} else {
			throw new RuntimeException("Type " + object.getClass() + " is not supported for this operation");
		}

		final String parentName;
		if (parent == null) {
			parentName = "";
		} else if (parent instanceof EditorNode) {
			parentName = EditorNode.class.cast(parent).getName() + "_";
		} else if (parent instanceof String) {
			parentName = String.class.cast(parent);
		} else {
			throw new RuntimeException("Unsupported type of parent object " + object.getClass());
		}

		final String keyForLookup = parentName + name;
		return keyForLookup;
	}

	private Map<Object, EMFVariable> getVariableLookupForPatternType(final DemoclesPatternType patternType) {
		if (!this.data.containsKey(patternType)) {
			this.data.put(patternType, new HashMap<>());
		}
		return this.data.get(patternType);
	}

}
