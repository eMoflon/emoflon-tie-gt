package org.moflon.compiler.sdm.democles.attributes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;
import org.moflon.compiler.sdm.democles.codegen.template.TemplateConfigurationProvider;
import org.moflon.compiler.sdm.democles.config.DefaultCodeGeneratorConfig;
import org.moflon.compiler.sdm.democles.pattern.DemoclesPatternType;
import org.moflon.compiler.sdm.democles.searchplan.PatternMatcherCompiler;
import org.moflon.compiler.sdm.democles.searchplan.TieGtCompilerPatternMatcherModule;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.sdm.constraints.operationspecification.constraint.AttributeVariableConstraintsTypeModule;
import org.moflon.sdm.constraints.operationspecification.constraint.util.AttributeVariableConstraintsModule;

public class AttributeConstraintCodeGeneratorConfig extends DefaultCodeGeneratorConfig {

	/**
	 * Maps operations to code fragments
	 */
	private final List<AttributeConstraintLibrary> attributeConstraintLibraries;

	public AttributeConstraintCodeGeneratorConfig(final ResourceSet resourceSet, final IProject project,
			final EMoflonPreferencesStorage preferencesStorage,
			final Collection<AttributeConstraintLibrary> attributeConstraintLibraries) {
		super(resourceSet, preferencesStorage);

		this.attributeConstraintLibraries = new ArrayList<>(attributeConstraintLibraries);

		// create attribute variable constraints type module using constraint libraries
		final AttributeVariableConstraintsTypeModule attributeVariableConstraintsTypeModule = new AttributeVariableConstraintsTypeModule(
				attributeConstraintLibraries, resourceSet);

		final AttributeVariableConstraintsModule attributeVariableConstraintsModule = new AttributeVariableConstraintsModule(
				attributeVariableConstraintsTypeModule);
		this.bindingAndBlackPatternBuilder
				.addConstraintTypeSwitch(attributeVariableConstraintsModule.getConstraintTypeSwitch());

		initializePatternMatchers();
	}

	@Override
	protected PatternMatcherCompiler configureBlackPatternMatcherCompiler() {
		final TieGtCompilerPatternMatcherModule blackCompilerPatternMatcherModule = new TieGtCompilerPatternMatcherModule();
		blackCompilerPatternMatcherModule.addOperationBuilder(emfBlackOperationBuilder);
		blackCompilerPatternMatcherModule.addOperationBuilder(relationalOperationBuilder);
		blackCompilerPatternMatcherModule.addOperationBuilder(new AttributeConstraintsOperationBuilder());
		blackCompilerPatternMatcherModule.setAlgorithm(createAlgorithm(DemoclesPatternType.BLACK_PATTERN));

		final PatternMatcherCompiler blackPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, blackCompilerPatternMatcherModule);
		return blackPatternMatcherCompiler;
	}

	@Override
	public TemplateConfigurationProvider createTemplateConfiguration(final GenModel genModel) {
		return new AttributeConstraintTemplateConfig(genModel, attributeConstraintLibraries);
	}

	@Override
	protected LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> createSearchPlanOperationBuilders(
			final DemoclesPatternType patternType) {
		// TODO@rkluge: Need to integrate AttributeEnabledWeightedOperationBuilder and
		final LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> builders = super.createSearchPlanOperationBuilders(
				patternType);
		if (patternType.isBlack()) {
			// builders.add(createAssignmentOperationBuilder());
		}

		return builders;
	}
}
