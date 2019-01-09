package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.compiler.sdm.democles.eclipse.AdapterResource;
import org.moflon.compiler.sdm.democles.eclipse.DemoclesValidationUtils;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.sdm.runtime.democles.Scope;

public final class AdapterResourceUtil {
	private AdapterResourceUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static AdapterResource attachToRegisteredAdapter(final EObject attachedObject, final EObject container,
			final DemoclesPatternType patternType, final ResourceSet resourceSet) {
		return attachToRegisteredAdapter(attachedObject, container, patternType.getSuffix(), resourceSet);
	}

	public static AdapterResource attachControlFlowModelToRegisteredAdapter(final Scope rootScope,
			final EOperation eOperation, final ResourceSet resourceSet) {
		return attachToRegisteredAdapter(rootScope, eOperation, DemoclesPatternType.CONTROL_FLOW_FILE_EXTENSION,
				resourceSet);
	}

	private static AdapterResource attachToRegisteredAdapter(final EObject attachedObject, final EObject container,
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
