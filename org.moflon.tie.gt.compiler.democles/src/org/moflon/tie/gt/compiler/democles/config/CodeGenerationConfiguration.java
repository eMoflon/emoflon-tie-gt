package org.moflon.tie.gt.compiler.democles.config;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.moflon.tie.gt.compiler.democles.codegen.template.TemplateConfigurationProvider;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcher;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcherConfiguration;

public interface CodeGenerationConfiguration {
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
