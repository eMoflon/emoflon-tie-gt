package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.tie.gt.compiler.democles.eclipse.AdapterResource;
import org.moflon.tie.gt.compiler.democles.eclipse.DemoclesValidationUtils;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.controlflow.democles.Scope;

public final class AdapterResources {
	private final ResourceSet resourceSet;
	private final boolean shallPersistAdapterResources;

	public AdapterResources(final ResourceSet resourceSet, final boolean shallPersistAdapterResources) {
		this.resourceSet = resourceSet;
		this.shallPersistAdapterResources = shallPersistAdapterResources;
	}

	public AdapterResource addPatternModel(final Pattern pattern, final EClass eClass,
			final DemoclesPatternType patternType) {
		final AdapterResource adapterResource = add(pattern, eClass, patternType.getSuffix());
		saveResource(adapterResource);
		return adapterResource;
	}

	public AdapterResource addControlFlowModel(final Scope rootScope, final EOperation eOperation) {
		final AdapterResource resource = add(rootScope, eOperation, DemoclesPatternType.CONTROL_FLOW_FILE_EXTENSION);
		saveResource(resource);
		return resource;
	}

	private AdapterResource add(final EObject attachedObject, final EObject container, final String fileExtension) {
		final AdapterResource adapterResource = (AdapterResource) EcoreUtil.getRegisteredAdapter(container,
				fileExtension);
		if (adapterResource.getResourceSet() == null) {
			resourceSet.getResources().add(adapterResource);
		}
		adapterResource.getContents().add(attachedObject);
		return adapterResource;
	}

	private void saveResource(final AdapterResource adapterResource) {
		if (shallPersistAdapterResources)
			DemoclesValidationUtils.saveResource(adapterResource);
	}

}
