package org.moflon.compiler.sdm.democles.config;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.moflon.codegen.PatternMatcher;
import org.moflon.compiler.sdm.democles.codegen.template.TemplateConfigurationProvider;
import org.moflon.compiler.sdm.democles.searchplan.PatternMatcherConfiguration;

public interface CodeGenerationConfiguration {
	void initializePatternMatchers();

	/**
	 * Returns the configured operation-to-template mapping
	 * 
	 * @param genModel the {@link GenModel} to consult
	 * @return the operation-to-template mapping
	 */
	TemplateConfigurationProvider createTemplateConfiguration(GenModel genModel);

	/**
	 * Provides a mapping from pattern type to an appropriate {@link PatternMatcher}
	 */
	PatternMatcherConfiguration getSearchPlanGenerators();
}
