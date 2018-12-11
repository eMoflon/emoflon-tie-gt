package org.moflon.tie.gt.ide.core.runtime.utilities;

import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ContextController {

	private EPackage contextEPackage;

	private ResourceSet resourceSet;

	public void setEPackage(EPackage contextEPackage) {
		this.contextEPackage = contextEPackage;
	}

	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public <EC extends EClassifier> EC getTypeContext(EC eClassifier) {
		if (eClassifier == null)
			return eClassifier;

		@SuppressWarnings("unchecked")
		final Optional<EC> contextEClassMonad = contextEPackage.getEClassifiers().stream()
				.filter(classifier -> classifier.getName().equals(eClassifier.getName()))
				.map(classifier -> (EC) classifier).findFirst();
		if (contextEClassMonad.isPresent())
			return contextEClassMonad.get();
		else
			return eClassifier;
	}

	public EReference getEReferenceContext(EReference ref, EClass contextEclass) {
		Optional<EReference> contextEReferenceMonad = contextEclass.getEAllReferences().stream()
				.filter(reference -> reference.getName().equals(ref.getName())).findFirst();
		if (contextEReferenceMonad.isPresent())
			return contextEReferenceMonad.get();
		else
			return ref;
	}

	public EAttribute getEAttributeContext(EAttribute attr, EClass contextEclass) {
		Optional<EAttribute> contextEAttributeMonad = contextEclass.getEAllAttributes().stream()
				.filter(attribute -> attribute.getName().equals(attr.getName())).findFirst();
		if (contextEAttributeMonad.isPresent())
			return contextEAttributeMonad.get();
		else
			return attr;
	}

	public ResourceSet getResourceSet() {
		return this.resourceSet;
	}

}
