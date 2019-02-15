package org.moflon.tie.gt.mosl.controlflow.language.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;

public class ControlFlowEditorModelUtil {

	/**
	 * The set of meta-model resources loaded.
	 */
	private static Map<URI, Resource> metaModelResources = new HashMap<>();

	/**
	 * The resource set used for loading the meta-model resources.
	 */
	private static final ResourceSet resourceSet = createNewXtextEnabledResourceSet();

	/**
	 * Returns all EClasses imported into the given file.
	 * 
	 * @param file the GT file
	 */
	public static ArrayList<EClass> getClasses(final GraphTransformationControlFlowFile file) {
		final ArrayList<EClass> classes = new ArrayList<>();
		file.getImports().forEach(i -> {
			loadEcoreModel(i.getName()).ifPresent(m -> classes.addAll(getElements(m, EClass.class)));
		});
		return classes;
	}

	/**
	 * Returns all EDataTypes imported into the given file.
	 * 
	 * @param file the GT file
	 */
	public static ArrayList<EDataType> getDatatypes(final GraphTransformationControlFlowFile file) {
		final ArrayList<EDataType> types = new ArrayList<EDataType>();
		file.getImports().forEach(i -> {
			loadEcoreModel(i.getName()).ifPresent(m -> types.addAll(getElements(m, EDataType.class)));
		});
		return types;
	}

	/**
	 * Returns all objects from the given resource.
	 * 
	 * @param resource the resource
	 * @param type     the type
	 * @return the elements with the given type in the resource
	 */
	public static <T extends EObject> List<T> getElements(final Resource resource, final Class<T> type) {
		return EcoreUtil2.getAllContentsOfType(resource.getContents().get(0), type);
	}

	/**
	 * Returns an Optional for the Ecore model resource with the given URI.
	 * 
	 * @param uriString the URI of the resource to load
	 */
	public static Optional<Resource> loadEcoreModel(final String uriString) {
		final URI uri = URI.createURI(uriString);
		try {
			eMoflonEMFUtil.createPluginToResourceMapping(resourceSet);
			final long timestamp = calculateTimestamp(uri, resourceSet);

			// Add/update resource if necessary.
			if (!metaModelResources.containsKey(uri) || metaModelResources.get(uri).getTimeStamp() < timestamp) {
				updateResource(uri);
			}
			return Optional.of(metaModelResources.get(uri));
		} catch (final Exception e) {
			removeResource(uri);
			return Optional.empty();
		}
	}

	public static Optional<Resource> loadGTResource(final String gtUriString) {
		final URI uri = URI.createURI(gtUriString);
		try {
			eMoflonEMFUtil.createPluginToResourceMapping(resourceSet);
			final long timestamp = calculateTimestamp(uri, resourceSet);

			// Add/update resource if necessary.
			if (!metaModelResources.containsKey(uri) || metaModelResources.get(uri).getTimeStamp() < timestamp) {
				updateResource(uri);
			}
			return Optional.of(metaModelResources.get(uri));
		} catch (final Exception e) {
			removeResource(uri);
			return Optional.empty();
		}
	}

	/**
	 * Removes the resource for the given URI from the resource set and the mapping
	 * between URIs and resources.
	 * 
	 * @param uri the URI to remove
	 * @return an empty optional
	 */
	private static void removeResource(final URI uri) {
		if (metaModelResources.containsKey(uri)) {
			final Resource resource = metaModelResources.get(uri);
			resource.unload();
			resourceSet.getResources().remove(resource);
			metaModelResources.remove(uri);
		}
	}

	/**
	 * Updates the resource for the given URI in the resource set and the mapping
	 * between URIs and resources.
	 * 
	 * @param uri the URI to update
	 * @throws IOException if the resource cannot be loaded
	 */
	private static void updateResource(final URI uri) throws IOException {
		// Remove resource if it was loaded before -> force reload.
		removeResource(uri);

		final Resource resource = resourceSet.getResource(uri, true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);

		if (!resource.getContents().isEmpty()) {
			metaModelResources.put(uri, resource);
		} else {
			removeResource(uri);
		}

	}

	private static ResourceSet createNewXtextEnabledResourceSet() {
		final ResourceSet resourceSet = eMoflonEMFUtil.createDefaultResourceSet();
		resourceSet.getPackageRegistry().put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		return resourceSet;
	}

	/**
	 * Calculates the timestamp of the file associated with the given {@link URI} If
	 * no such file can be found, a negative value is returned
	 * 
	 * @param uri         the {@link URI} to check
	 * @param resourceSet the {@link ResourceSet} to consult
	 * @return the last-modification timestamp or a negative value if the check is
	 *         not possible
	 */
	private static long calculateTimestamp(final URI uri, final ResourceSet resourceSet) {
		final URI normalizedUri = resourceSet.getURIConverter().normalize(uri);
		final String fileString = CommonPlugin.resolve(normalizedUri).toFileString();
		if (fileString != null) {
			final File file = new File(fileString);
			return file.lastModified();
		} else
			return -1;

	}
}
