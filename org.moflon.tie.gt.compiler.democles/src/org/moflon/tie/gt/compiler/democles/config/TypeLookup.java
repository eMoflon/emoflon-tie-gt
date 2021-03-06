package org.moflon.tie.gt.compiler.democles.config;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorParameter;
import org.emoflon.ibex.gt.editor.gT.EditorPatternAttributeConstraintVariable;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.tie.gt.compiler.democles.util.ExceptionUtil;
import org.moflon.tie.gt.compiler.democles.util.StatusUtil;
import org.moflon.tie.gt.controlflow.democles.CFVariable;

public class TypeLookup {

	private final Collection<EPackage> ePackages;

	public TypeLookup(final List<EPackage> ePackages) {
		this.ePackages = ePackages;
	}

	/**
	 * Returns a classifier from the set of configured {@link EPackage}s having the
	 * same name as the given {@link EClassifier}
	 * 
	 * @param eClassifier the {@link EClassifier}
	 * @return an eClassifier having the same name in #getEPackage
	 */
	public <EC extends EClassifier> EC getEClassifier(final EC eClassifier) {
		if (eClassifier == null)
			throw new IllegalArgumentException("Expect non-null EClassifier");

		@SuppressWarnings("unchecked")
		final Optional<EC> contextEClassMonad = ePackages.stream()
				.flatMap(ePackage -> ePackage.getEClassifiers().stream()) //
				.filter(classifier -> classifier.getName().equals(eClassifier.getName())) //
				.filter(classifier -> eClassifier.getClass().isAssignableFrom(classifier.getClass())) //
				.map(classifier -> (EC) classifier)//
				.findFirst();
		if (contextEClassMonad.isPresent())
			return contextEClassMonad.get();

		throw ExceptionUtil.createIllegalArgumentException("Cannot find EClassifier with name '%s' in EPackages %s	",
				eClassifier.getName(), ePackages);
	}

	/**
	 * Returns the EReference of the given EClass having the same name as the given
	 * EReference.
	 * 
	 * @param eReference the {@link EReference}
	 * @param eClass     the {@link EClass} to query
	 * @return the {@link EReference} from the {@link EClass}
	 * @throws Exception if not such {@link EReference} exists
	 */
	public EReference getEReference(final EReference eReference, final EClass eClass) {
		final Optional<EReference> contextEReferenceMonad = eClass.getEAllReferences().stream()
				.filter(reference -> reference.getName().equals(eReference.getName())).findFirst();
		if (contextEReferenceMonad.isPresent())
			return contextEReferenceMonad.get();

		throw ExceptionUtil.createIllegalArgumentException("Cannot find EReference with name '%s' in EClass '%s'",
				eReference.getName(), eClass);
	}

	/**
	 * Returns the EAttribute of the given EClass having the same name as the given
	 * EAttribute.
	 * 
	 * @param eAttribute the {@link EAttribute}
	 * @param eClass     the {@link EClass} to query
	 * @return the {@link EAttribute} from the {@link EClass}
	 * @throws Exception if not such {@link EAttribute} exists
	 */
	public EAttribute getEAttribute(final EAttribute eAttribute, final EClass eClass) {
		final Optional<EAttribute> foundEAttribute = eClass.getEAllAttributes().stream()
				.filter(attribute -> attribute.getName().equals(eAttribute.getName())).findFirst();
		if (foundEAttribute.isPresent())
			return foundEAttribute.get();

		throw ExceptionUtil.createIllegalArgumentException("Cannot find EAttribute with name '%s' in EClass '%s'",
				eAttribute.getName(), eClass);
	}

	public EClassifier determineType(final EObject object) {
		if (object instanceof EditorParameter) {
			final EditorParameter editorParameter = (EditorParameter) object;
			return editorParameter.getType();
		} else if (object instanceof EditorNode) {
			final EditorNode node = (EditorNode) object;
			return node.getType();
		} else if (object instanceof CFVariable) {
			final CFVariable variable = (CFVariable) object;
			return variable.getType();
		} else if (object instanceof EAttribute) {
			final EAttribute attribute = (EAttribute) object;
			return attribute.getEType();
		} else if (object instanceof EditorPatternAttributeConstraintVariable) {
			final EditorPatternAttributeConstraintVariable editorVariable = (EditorPatternAttributeConstraintVariable) object;
			return editorVariable.getType();
		}

		throw ExceptionUtil.createIllegalArgumentException("Object has unsupported type: '%s'", object);
	}

	public IStatus validateTypeExistsInMetamodel(final Variable var) {
		final EMFVariable emfVariable = (EMFVariable) var;
		final EClassifier editorObjectVariableType = emfVariable.getEClassifier();
		final EClassifier properCfVariableType = lookupType(editorObjectVariableType);
		if (properCfVariableType == null)
			return StatusUtil.createErrorStatus(WorkspaceHelper.getPluginId(getClass()), "Dummy");
//					"Cannot translate the type %s (from the editor) to an EClassifier in %s", var, this);
		else
			return Status.OK_STATUS;
	}

	public EClassifier lookupType(final EClassifier statementEType) {
		return statementEType == null ? null : lookupType(statementEType.getName());
	}

	public EClassifier lookupType(final String name) {
		final Optional<EClassifier> match = this.ePackages.stream().map(ePackage -> ePackage.getEClassifier(name))
				.filter(eClassifier -> eClassifier != null).findFirst();
		return match.orElse(null);
	}

	@Override
	public String toString() {
		final List<String> packageNames = ePackages.stream().map(EPackage::getName).collect(Collectors.toList());
		return String.format("TypeLookup %s", packageNames);
	}

}
