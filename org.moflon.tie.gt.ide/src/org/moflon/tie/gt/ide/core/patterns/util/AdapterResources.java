package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.compiler.democles.eclipse.AdapterResource;
import org.moflon.tie.gt.compiler.democles.eclipse.DemoclesValidationUtils;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.controlflow.democles.Scope;

public final class AdapterResources {
	private AdapterResources() {
		throw new UtilityClassNotInstantiableException();
	}

	public static AdapterResource add(final EObject attachedObject, final EObject container,
			final DemoclesPatternType patternType, final ResourceSet resourceSet) {
		return add(attachedObject, container, patternType.getSuffix(), resourceSet);
	}

	public static AdapterResource addAndSave(final Pattern pattern, final EClass eClass,
			final DemoclesPatternType patternType, final ResourceSet resourceSet) {
		final AdapterResource adapterResource = add(pattern, eClass, patternType, resourceSet);
		saveResource(adapterResource);
		return adapterResource;
	}

	public static AdapterResource attachControlFlowModelToRegisteredAdapter(final Scope rootScope,
			final EOperation eOperation, final ResourceSet resourceSet) {
		return add(rootScope, eOperation, DemoclesPatternType.CONTROL_FLOW_FILE_EXTENSION, resourceSet);
	}

	private static AdapterResource add(final EObject attachedObject, final EObject container,
			final String fileExtension, final ResourceSet resourceSet) {
		final AdapterResource adapterResource = (AdapterResource) EcoreUtil.getRegisteredAdapter(container,
				fileExtension);
		if (adapterResource.getResourceSet() == null) {
			resourceSet.getResources().add(adapterResource);
		}
		adapterResource.getContents().add(attachedObject);
		return adapterResource;
	}

	public static void saveResource(final AdapterResource adapterResource) {
		DemoclesValidationUtils.saveResource(adapterResource);
	}

}
