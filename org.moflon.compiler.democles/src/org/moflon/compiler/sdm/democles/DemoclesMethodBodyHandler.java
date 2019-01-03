/*
 * Copyright (c) 2010-2012 Gergely Varro
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gergely Varro - Initial API and implementation
 */
package org.moflon.compiler.sdm.democles;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.codegen.MethodBodyHandler;
import org.moflon.codegen.PatternMatcher;
import org.moflon.compiler.sdm.democles.eclipse.MethodBodyResourceFactory;
import org.moflon.compiler.sdm.democles.eclipse.PatternResourceFactory;
import org.moflon.emf.build.MoflonEmfCodeGenerator;

public class DemoclesMethodBodyHandler implements MethodBodyHandler {

	public static final String CONTROL_FLOW_FILE_EXTENSION = "cf";

	public static final String BINDING_AND_BLACK_FILE_EXTENSION = "bindingAndBlack";

	public static final String BLACK_FILE_EXTENSION = "black";

	public static final String RED_FILE_EXTENSION = "red";

	public static final String GREEN_FILE_EXTENSION = "green";

	public static final String BINDING_FILE_EXTENSION = "binding";

	public static final String EXPRESSION_FILE_EXTENSION = "expression";

	private final ResourceSet resourceSet;

	private final CodeGenerationConfiguration scopeValidatorConfiguration;

	public DemoclesMethodBodyHandler(final ResourceSet resourceSet,
			final CodeGenerationConfiguration scopeValidatorConfiguration) {
		this.resourceSet = resourceSet;
		this.scopeValidatorConfiguration = scopeValidatorConfiguration;
		initResourceSetForDemocles(this.resourceSet);
	}

	public static final void initResourceSetForDemocles(final ResourceSet resourceSet) {
		final EList<AdapterFactory> adapterFactories = resourceSet.getAdapterFactories();
		final Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap();

		createAndRegisterMethodBodyFactory(adapterFactories, extensionToFactoryMap, CONTROL_FLOW_FILE_EXTENSION);

		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap, BINDING_AND_BLACK_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap, BLACK_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap, RED_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap, GREEN_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap, BINDING_FILE_EXTENSION);
		createAndRegisterPatternFactory(adapterFactories, extensionToFactoryMap, EXPRESSION_FILE_EXTENSION);
	}

	@Override
	public void initializePatternMatchers() {
		scopeValidatorConfiguration.initializePatternMatchers();
	}

	@Override
	public Map<String, PatternMatcher> getPatternMatcherConfiguration() {
		return scopeValidatorConfiguration.getSearchPlanGenerators();
	}

	/**
	 * Creates, configures and returns a {@link DemoclesGeneratorAdapterFactory}
	 */
	@Override
	public Descriptor createCodeGenerationEngine(final MoflonEmfCodeGenerator codeGenerator, final Resource resource) {
		final TemplateConfigurationProvider templateConfig = scopeValidatorConfiguration
				.createTemplateConfiguration(codeGenerator.getGenModel());
		return new DemoclesGeneratorAdapterFactory(templateConfig, codeGenerator.getInjectorManager());
	}

	private static void createAndRegisterMethodBodyFactory(final EList<AdapterFactory> adapterFactories,
			final Map<String, Object> extensionToFactoryMap, final String extension) {
		final MethodBodyResourceFactory sdmFactory = new MethodBodyResourceFactory(extension);
		adapterFactories.add(sdmFactory);
		extensionToFactoryMap.put(extension, sdmFactory);
	}

	private static void createAndRegisterPatternFactory(final EList<AdapterFactory> adapterFactories,
			final Map<String, Object> extensionToFactoryMap, final String extension) {
		final PatternResourceFactory bindingAndBlackFactory = new PatternResourceFactory(extension);
		adapterFactories.add(bindingAndBlackFactory);
		extensionToFactoryMap.put(extension, bindingAndBlackFactory);
	}

}
