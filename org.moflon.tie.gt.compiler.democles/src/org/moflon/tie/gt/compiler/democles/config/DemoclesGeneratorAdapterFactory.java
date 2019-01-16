package org.moflon.tie.gt.compiler.democles.config;

import org.eclipse.emf.common.notify.Adapter;
import org.moflon.emf.codegen.GeneratorAdapterFactory;
import org.moflon.emf.injection.ide.InjectionManager;
import org.moflon.tie.gt.compiler.democles.codegen.DemoclesClassGeneratorAdapter;
import org.moflon.tie.gt.compiler.democles.codegen.template.TemplateConfigurationProvider;

public class DemoclesGeneratorAdapterFactory extends GeneratorAdapterFactory
		implements org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor {
	final TemplateConfigurationProvider config;

	public DemoclesGeneratorAdapterFactory(final TemplateConfigurationProvider templateConfigurationProvider,
			final InjectionManager injectionManager) {
		this.config = templateConfigurationProvider;
		this.injectionManager = injectionManager;
	}

	public Adapter createGenClassAdapter() {
		if (genClassGeneratorAdapter == null) {
			genClassGeneratorAdapter = DemoclesClassGeneratorAdapter.createDemoclesClassGeneratorAdapter(this);
		}
		return genClassGeneratorAdapter;
	}

	public final TemplateConfigurationProvider getTemplateConfigurationProvider() {
		return config;
	}

	@Override
	public DemoclesGeneratorAdapterFactory createAdapterFactory() {
		return this;
	}
}
