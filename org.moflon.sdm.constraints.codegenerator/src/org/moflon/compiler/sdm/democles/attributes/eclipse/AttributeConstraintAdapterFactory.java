package org.moflon.compiler.sdm.democles.attributes.eclipse;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdapterFactory;
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.compiler.sdm.democles.attributes.AttributeConstraintCodeGeneratorConfig;
import org.moflon.emf.build.MoflonEmfCodeGenerator;

public class AttributeConstraintAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(final Object adaptableObject, @SuppressWarnings("rawtypes") final Class adapterType) {
		if (adaptableObject instanceof MoflonEmfCodeGenerator
				&& AttributeConstraintCodeGeneratorConfig.class == adapterType) {
			final MoflonEmfCodeGenerator process = (MoflonEmfCodeGenerator) adaptableObject;
			final IProject project = process.getEcoreFile().getProject();
			final AttributeConstraintCodeGeneratorConfig defaultCodeGeneratorConfig = new AttributeConstraintCodeGeneratorConfig(
					process.getResourceSet(), project, process.getPreferencesStorage());
			return new DemoclesMethodBodyHandler(process.getResourceSet(), defaultCodeGeneratorConfig);
		}
		return null;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] { AttributeConstraintCodeGeneratorConfig.class };
	}
}
