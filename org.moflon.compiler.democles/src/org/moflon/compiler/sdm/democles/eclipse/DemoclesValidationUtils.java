package org.moflon.compiler.sdm.democles.eclipse;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gervarro.democles.specification.emf.Constant;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.core.utilities.WorkspaceHelper;

/**
 * Useful utilities for the democles validation process
 *
 * @author Roland Kluge - Original implementation
 */
public final class DemoclesValidationUtils {
	private static final Logger logger = Logger.getLogger(DemoclesValidationUtils.class);

	private DemoclesValidationUtils() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Persists the given resource using its URL plus the suffix .xmi.
	 *
	 * The resource will is not changed during this method.
	 *
	 * @param adapterResource the resource to save
	 */
	public static void saveResource(final AdapterResource adapterResource) {
		if (adapterResource != null) {
			final URI oldUri = adapterResource.getURI();
			final URI inWorkspaceUri;
			if (oldUri.isPlatformPlugin()) {
				final URI deresolve = oldUri.deresolve(URI.createPlatformPluginURI("", false));
				inWorkspaceUri = deresolve.resolve(URI.createPlatformResourceURI("", false));
			} else {
				inWorkspaceUri = oldUri;
			}
			// Save with old URI to allow for navigation between models
			adapterResource.setURI(inWorkspaceUri);

			try {

				final Map<Constant, Object> temporarilyClearedConstants = removeAndSaveAllNonSerializeableValues(
						adapterResource);

				final HashMap<Object, Object> saveOptions = new HashMap<>();
				saveOptions.put(Resource.OPTION_LINE_DELIMITER, WorkspaceHelper.DEFAULT_RESOURCE_LINE_DELIMITER);
				adapterResource.save(saveOptions);
				URIConverter.URI_MAP.put(oldUri, inWorkspaceUri);

				restoreNonSerializeableValues(temporarilyClearedConstants);
			} catch (final IOException e) {
				LogUtils.error(logger, e);
			} finally {
				adapterResource.setURI(oldUri);
				URIConverter.URI_MAP.remove(oldUri);
			}
		}
	}

	/**
	 * Prepares the given resource for serialization via {@link Resource#save(Map)}
	 *
	 * Iterates through the given resource and sets the value of all
	 * {@link Constant} objects to <code>null</code> if the value is not
	 * {@link Serializable}.
	 *
	 * The returned map saves the original value assignments of the modified
	 * {@link Constant} objects
	 *
	 * @param adapterResource the resource to update
	 * @return the lookup table of all {@link Constant} objects whose value was set
	 *         to <code>null</code>
	 */
	private static Map<Constant, Object> removeAndSaveAllNonSerializeableValues(final AdapterResource adapterResource) {
		final Map<Constant, Object> temporarilyClearedConstants = new HashMap<>();
		final TreeIterator<Object> allContentsIterator = EcoreUtil.getAllContents(adapterResource.getContents());
		while (allContentsIterator.hasNext()) {
			final Object next = allContentsIterator.next();
			if (next instanceof Constant) {
				final Constant constant = (Constant) next;
				if (!(constant.getValue() instanceof Serializable)) {
					temporarilyClearedConstants.put(constant, constant.getValue());
					constant.setValue(null);
				}
			}
		}
		return temporarilyClearedConstants;
	}

	/**
	 * For each stored {@link Constant}-Object mapping, this method sets the value
	 * of the constant to be the respective value.
	 * 
	 * @param temporarilyClearedConstants the lookup from {@link Constant} to
	 *                                    objects
	 */
	private static void restoreNonSerializeableValues(final Map<Constant, Object> temporarilyClearedConstants) {
		temporarilyClearedConstants.forEach((constant, value) -> constant.setValue(value));
	}

}
