package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;
import org.moflon.tie.gt.ide.core.runtime.utilities.TypeLookup;

class VariableLookupTable {
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
		final EClassifier type = typeLookup.determineType(object);

		return getSymbolicParameter(object, type, patternType);
	}

	public EMFVariable getSymbolicParameter(final EObject object, final EClassifier type,
			final DemoclesPatternType patternType) {
		if (!containsKey(object, patternType)) {
			final EMFVariable variable = getOrCreateEMFVariable(object, patternType);

			variable.setEClassifier(typeLookup.getEClassifier(type));
			final Pattern pattern = patternLookup.get(patternType);
			Patterns.addSymbolicParameter(variable, pattern);
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

		final EClassifier type = typeLookup.determineType(child);

		return getLocalVariable(child, parent, type, patternType);
	}

	public EMFVariable getLocalVariable(final Object child, final Object parent, final EClassifier type,
			final DemoclesPatternType patternType) {
		if (!containsKey(child, parent, patternType)) {
			final EMFVariable variable = getOrCreateVariable(child, parent, patternType);

			variable.setEClassifier(typeLookup.getEClassifier(type));
			final Pattern pattern = patternLookup.get(patternType);
			Patterns.addLocalVariable(variable, pattern);
			return variable;
		} else {
			return get(child, parent, patternType);
		}
	}

	public EMFVariable getReturnVariable(final EObject returnObject, final Pattern pattern) {
		final EMFVariable returnEmfVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
		returnEmfVariable.setName(CodeConventions.RESULT_VARIABLE_NAME);
		returnEmfVariable.setEClassifier(typeLookup.getEClassifier(typeLookup.determineType(returnObject)));
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
			final EMFVariable newVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
			newVariable.setName(keyForLookup);
			variableLookupForPatternType.put(keyForLookup, newVariable);
			return newVariable;
		}
	}

	private String calculateLookupKey(final Object childObject, final Object parentObject) {

		final String childName = getName(childObject);

		final String parentName = getName(parentObject);

		final String keyForLookup = combineChildAndParentName(childName, parentName);
		return keyForLookup;
	}

	private String getName(final Object object) {
		if (object == null) {
			return "";
		} else if (object instanceof EditorNode) {
			final EditorNode editorNode = (EditorNode) object;
			return editorNode.getName();
		} else if (object instanceof EditorParameter) {
			final EditorParameter parameter = (EditorParameter) object;
			return parameter.getName();
		} else if (object instanceof EAttribute) {
			final EAttribute attribute = (EAttribute) object;
			return attribute.getName();
		} else if (object instanceof CFVariable) {
			final CFVariable variable = (CFVariable) object;
			return variable.getName();
		} else if (object instanceof String) {
			return (String) object;
		} else if (object instanceof EditorPatternAttributeConstraintVariable) {
			final EditorPatternAttributeConstraintVariable variable = (EditorPatternAttributeConstraintVariable) object;
			return variable.getName();
		} else {
			throw new RuntimeException(
					String.format("Name for object %s of type %s cannot be determined.", object, object.getClass()));
		}
	}

	public String combineChildAndParentName(final String childName, final String parentName) {
		if (parentName.isEmpty())
			return childName;
		else if (childName.isEmpty())
			return parentName;
		else
			return parentName + "_" + childName;
	}

	private Map<Object, EMFVariable> getVariableLookupForPatternType(final DemoclesPatternType patternType) {
		if (!this.data.containsKey(patternType)) {
			this.data.put(patternType, new HashMap<>());
		}
		return this.data.get(patternType);
	}

}
