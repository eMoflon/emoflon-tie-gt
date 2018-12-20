package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;

class VariableLookupTable {
	private final EMFTypeFactory emfHelper = EMFTypeFactory.eINSTANCE;
	private final Map<PatternType, Map<Object, EMFVariable>> data = new HashMap<>();

	public boolean containsKey(final EObject object, final EditorNode parent, final PatternType type) {
		final String key = calculateLookupKey(object, parent);
		return this.getVariableLookupForPatternType(type).containsKey(key);
	}

	public boolean containsKey(final EObject object, final PatternType type) {
		return containsKey(object, null, type);
	}

	public EMFVariable get(final EObject object, final EditorNode parent, final PatternType type) {
		final String key = calculateLookupKey(object, parent);
		return this.getVariableLookupForPatternType(type).get(key);
	}

	public EMFVariable get(final EObject object, final PatternType type) {
		final String key = calculateLookupKey(object, null);
		return this.getVariableLookupForPatternType(type).get(key);
	}

	public EMFVariable getOrCreateEMFVariable(final EObject node, final PatternType type) {
		return getOrCreateEMFVariable(node, null, type);
	}

	public EMFVariable lookup(final EObject object, final PatternType type) {
		return get(object, null, type);
	}

	EMFVariable getOrCreateEMFVariable(final EObject obj, final EditorNode parent, final PatternType type) {
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

	private String calculateLookupKey(final EObject obj, final EObject parent) {
		final String name;

		if (obj.eClass() == null) {
			throw new IllegalArgumentException("Object" + obj + " has no type.");
		}

		if (obj instanceof EditorNode) {
			name = ((EditorNode) obj).getName();
		} else if (obj instanceof EditorParameter) {
			name = ((EditorParameter) obj).getName();
		} else if (obj instanceof EAttribute) {
			name = ((EAttribute) obj).getName();
		} else {
			throw new RuntimeException("Type " + obj.getClass() + " is not supported for this operation");
		}

		final String parentName = parent != null && parent instanceof EditorNode
				? EditorNode.class.cast(parent).getName() + "_"
				: "";
		final String keyForLookup = parentName + name;
		return keyForLookup;
	}

	private Map<Object, EMFVariable> getVariableLookupForPatternType(final PatternType patternType) {
		if (!this.data.containsKey(patternType)) {
			this.data.put(patternType, new HashMap<>());
		}
		return this.data.get(patternType);
	}

}
