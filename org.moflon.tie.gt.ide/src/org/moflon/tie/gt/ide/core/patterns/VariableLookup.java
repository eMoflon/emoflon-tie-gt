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
import org.moflon.tie.gt.compiler.democles.CodeConventions;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;
import org.moflon.tie.gt.ide.core.patterns.util.TypeLookup;

class VariableLookup {
	private final Map<DemoclesPatternType, Map<Object, EMFVariable>> data = new HashMap<>();
	private final PatternLookup patterns;
	private final TypeLookup types;

	private enum VariableLocality {
		PARAMETER, LOCAL;
	}

	public VariableLookup(final PatternLookup patternLookup, final TypeLookup typeLookup) {
		this.patterns = patternLookup;
		this.types = typeLookup;
	}

	public EMFVariable getSymbolicParameter(final EObject object, final DemoclesPatternType patternType) {
		final EClassifier type = types.determineType(object);
		return getSymbolicParameter(object, type, patternType);
	}

	public EMFVariable getSymbolicParameter(final EObject child, final EObject parent,
			final DemoclesPatternType patternType) {
		return getSymbolicParameter(child, parent, patternType, null);
	}

	public EMFVariable getSymbolicParameter(final EObject child, final EObject parent,
			final DemoclesPatternType patternType, final String suffix) {
		final EClassifier type = types.determineType(child);
		return getSymbolicParameter(child, parent, type, patternType, suffix);
	}

	private EMFVariable getSymbolicParameter(final EObject object, final EClassifier type,
			final DemoclesPatternType patternType) {
		return getSymbolicParameter(object, null, type, patternType, null);
	}

	private EMFVariable getSymbolicParameter(final Object child, final Object parent, final EClassifier type,
			final DemoclesPatternType patternType, final String suffix) {
		return getVariable(child, parent, type, patternType, VariableLocality.PARAMETER, suffix);
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
		final EClassifier type = types.determineType(child);
		return getLocalVariable(child, parent, type, patternType);
	}

	private EMFVariable getLocalVariable(final Object child, final Object parent, final EClassifier type,
			final DemoclesPatternType patternType) {
		return getLocalVariable(child, parent, type, patternType, null);
	}

	private EMFVariable getLocalVariable(final Object child, final Object parent, final EClassifier type,
			final DemoclesPatternType patternType, final String suffix) {
		return getVariable(child, parent, type, patternType, VariableLocality.LOCAL, suffix);
	}

	private EMFVariable getVariable(final Object child, final Object parent, final EClassifier type,
			final DemoclesPatternType patternType, final VariableLocality locality, final String suffix) {
		if (!containsKey(child, parent, patternType, suffix)) {
			final EMFVariable variable = getOrCreateVariable(child, parent, patternType, suffix);

			variable.setEClassifier(types.getEClassifier(type));
			final Pattern pattern = patterns.get(patternType);
			addVariable(variable, pattern, locality);
			return variable;
		} else
			return get(child, parent, patternType, suffix);
	}

	private void addVariable(final EMFVariable variable, final Pattern pattern, final VariableLocality locality) {
		switch (locality) {
		case PARAMETER:
			Patterns.addSymbolicParameter(variable, pattern);
			break;
		case LOCAL:
			Patterns.addLocalVariable(variable, pattern);
			break;
		}
	}

	public EMFVariable getReturnVariable(final EObject returnObject, final Pattern pattern) {
		final EMFVariable returnEmfVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
		returnEmfVariable.setName(CodeConventions.RESULT_VARIABLE_NAME);
		returnEmfVariable.setEClassifier(types.getEClassifier(types.determineType(returnObject)));
		pattern.getSymbolicParameters().add(0, returnEmfVariable);

		return returnEmfVariable;
	}

	private boolean containsKey(final Object object, final Object parent, final DemoclesPatternType type,
			final String suffix) {
		final String key = calculateLookupKey(object, parent, suffix);
		return this.getVariableLookupForPatternType(type).containsKey(key);
	}

	private EMFVariable get(final Object object, final Object parent, final DemoclesPatternType type,
			final String suffix) {
		final String key = calculateLookupKey(object, parent, suffix);
		return this.getVariableLookupForPatternType(type).get(key);
	}

	private EMFVariable getOrCreateVariable(final Object obj, final Object parent, final DemoclesPatternType type,
			final String suffix) {
		final String keyForLookup = calculateLookupKey(obj, parent, suffix);
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

	private String calculateLookupKey(final Object childObject, final Object parentObject, final String suffix) {

		final String childName = getName(childObject);

		final String parentName = getName(parentObject);

		final String keyForLookup = combineChildParentAndSuffix(childName, parentName, suffix);
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

	private String combineChildParentAndSuffix(final String childName, final String parentName, final String suffix) {
		final StringBuilder sb = new StringBuilder();
		if (parentName != null && !parentName.isEmpty())
			sb.append(parentName).append("_");
		sb.append(childName);
		if (suffix != null && !suffix.isEmpty())
			sb.append("_").append(suffix);

		return sb.toString();
	}

	private Map<Object, EMFVariable> getVariableLookupForPatternType(final DemoclesPatternType patternType) {
		if (!this.data.containsKey(patternType)) {
			this.data.put(patternType, new HashMap<>());
		}
		return this.data.get(patternType);
	}

}
