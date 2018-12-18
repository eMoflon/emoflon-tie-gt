package org.moflon.tie.gt.ide.core.runtime.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ContextController {

	private Collection<EPackage> contextEPackages;

	private ResourceSet resourceSet;

	public void setEPackages(final Collection<EPackage> contextEPackage) {
		this.contextEPackages = new ArrayList<EPackage>(contextEPackage);
	}

	public void setResourceSet(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public <EC extends EClassifier> EC getClassifierFromConfiguredEPackage(final EC eClassifier) {
		if (eClassifier == null)
			throw new IllegalArgumentException("Expect non-null EClassifier");

		@SuppressWarnings("unchecked")
		final Optional<EC> contextEClassMonad = contextEPackages.stream()
				.flatMap(ePackage -> ePackage.getEClassifiers().stream()) //
				.filter(classifier -> classifier.getName().equals(eClassifier.getName())) //
				.filter(classifier -> eClassifier.getClass().isAssignableFrom(classifier.getClass())) //
				.map(classifier -> (EC) classifier)//
				.findFirst();
		if (contextEClassMonad.isPresent())
			return contextEClassMonad.get();
		else
			throw new IllegalArgumentException(
					String.format("Cannot find EClassifier with name '%s' in EPackages %s	", eClassifier.getName(),
							contextEPackages));
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
	public EReference getEReferenceContext(final EReference eReference, final EClass eClass) {
		final Optional<EReference> contextEReferenceMonad = eClass.getEAllReferences().stream()
				.filter(reference -> reference.getName().equals(eReference.getName())).findFirst();
		if (contextEReferenceMonad.isPresent())
			return contextEReferenceMonad.get();
		else
			throw new IllegalArgumentException(String.format("Cannot find EReference with name '%s' in EClass '%s'",
					eReference.getName(), eClass));
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
	public EAttribute getEAttributeContext(final EAttribute eAttribute, final EClass eClass) {
		final Optional<EAttribute> contextEAttributeMonad = eClass.getEAllAttributes().stream()
				.filter(attribute -> attribute.getName().equals(eAttribute.getName())).findFirst();
		if (contextEAttributeMonad.isPresent())
			return contextEAttributeMonad.get();
		else
			throw new IllegalArgumentException(String.format("Cannot find EAttribute with name '%s' in EClass '%s'",
					eAttribute.getName(), eClass));
	}

	/**
	 * Returns the configured {@link ResourceSet}
	 * 
	 * @return the resource set
	 * @see ContextController#setResourceSet(ResourceSet)
	 */
	public ResourceSet getResourceSet() {
		return this.resourceSet;
	}

}
