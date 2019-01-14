package org.moflon.compiler.sdm.democles.config;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;

@Deprecated
public class AttributeConstraintCodeGeneratorConfig extends DefaultCodeGeneratorConfig {

	public AttributeConstraintCodeGeneratorConfig(final ResourceSet resourceSet, final IProject project,
			final EMoflonPreferencesStorage preferencesStorage,
			final Collection<AttributeConstraintLibrary> attributeConstraintLibraries) {
		super(resourceSet, preferencesStorage, attributeConstraintLibraries);
	}
}
