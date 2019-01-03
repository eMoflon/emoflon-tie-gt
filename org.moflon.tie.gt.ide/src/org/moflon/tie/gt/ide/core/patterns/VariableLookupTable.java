package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.sdm.runtime.democles.CFVariable;

class VariableLookupTable {
	private final EMFTypeFactory emfHelper = EMFTypeFactory.eINSTANCE;
	private final Map<DemoclesPatternType, Map<Object, EMFVariable>> data = new HashMap<>();

	public boolean containsKey(final Object object, final Object parent, final DemoclesPatternType type) {
		final String key = calculateLookupKey(object, parent);
		return this.getVariableLookupForPatternType(type).containsKey(key);
	}

	public boolean containsKey(final Object object, final DemoclesPatternType type) {
		return containsKey(object, null, type);
	}

	public EMFVariable get(final Object object, final Object parent, final DemoclesPatternType type) {
		final String key = calculateLookupKey(object, parent);
		return this.getVariableLookupForPatternType(type).get(key);
	}

	public EMFVariable get(final Object object, final DemoclesPatternType type) {
		final String key = calculateLookupKey(object, null);
		return this.getVariableLookupForPatternType(type).get(key);
	}

	public EMFVariable getOrCreateEMFVariable(final Object node, final DemoclesPatternType type) {
		return getOrCreateEMFVariable(node, null, type);
	}

	public EMFVariable lookup(final Object object, final DemoclesPatternType type) {
		return get(object, null, type);
	}

	EMFVariable getOrCreateEMFVariable(final Object obj, final Object parent, final DemoclesPatternType type) {
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
