package org.moflon.compiler.sdm.democles;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.moflon.codegen.PatternMatcher;

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
