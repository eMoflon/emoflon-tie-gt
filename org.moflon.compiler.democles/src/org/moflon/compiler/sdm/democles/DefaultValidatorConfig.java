package org.moflon.compiler.sdm.democles;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.SimpleCombiner;
import org.gervarro.democles.codegen.emf.BasicEMFOperationBuilder;
import org.gervarro.democles.codegen.emf.EMFOperationBuilder;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.compiler.CompilerPatternMatcherModule;
import org.gervarro.democles.compiler.CompilerSearchPlanAlgorithm;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.CombinedSearchPlanOperationBuilder;
import org.gervarro.democles.plan.common.DefaultAlgorithm;
import org.gervarro.democles.plan.common.RelationalSearchPlanOperationBuilder;
import org.gervarro.democles.plan.common.RelationalWeightedOperationBuilder;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;
import org.gervarro.democles.plan.emf.EMFSearchPlanOperationBuilder;
import org.gervarro.democles.plan.emf.EMFWeightedOperationBuilder;
import org.gervarro.democles.relational.RelationalOperationBuilder;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.constraint.EMFTypeModule;
import org.gervarro.democles.specification.emf.constraint.PatternInvocationTypeModule;
import org.gervarro.democles.specification.emf.constraint.RelationalTypeModule;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;
import org.gervarro.democles.specification.impl.DefaultPatternFactory;
import org.gervarro.democles.specification.impl.PatternInvocationConstraintModule;
import org.moflon.codegen.PatternMatcher;
import org.moflon.compiler.sdm.democles.codegen.template.DefaultTemplateConfiguration;
import org.moflon.compiler.sdm.democles.codegen.template.TemplateConfigurationProvider;
import org.moflon.compiler.sdm.democles.pattern.DemoclesPatternType;
import org.moflon.compiler.sdm.democles.searchplan.AssignmentOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.AssignmentSearchPlanOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.AssignmentWeightedOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.BindingAndBlackPatternMatcherCompiler;
import org.moflon.compiler.sdm.democles.searchplan.BindingAssignmentOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.EMFGreenOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.EMFRedOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.PatternMatcherCompiler;
import org.moflon.compiler.sdm.democles.searchplan.PatternMatcherConfiguration;
import org.moflon.core.preferences.EMoflonPreferencesStorage;

//TODO@rkluge: The separation of DefaultValidatorConfig and DefaultCodeGeneratorConfig is no longer necessary
public class DefaultValidatorConfig implements CodeGenerationConfiguration {
	protected final ResourceSet resourceSet;

	// Constraint modules
	final EMFConstraintModule emfTypeModule;
	final EMFTypeModule internalEMFTypeModule;
	final RelationalTypeModule internalRelationalTypeModule = new RelationalTypeModule(CoreConstraintModule.INSTANCE);
	protected final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternBuilder = new EMFPatternBuilder<>(
			new DefaultPatternFactory());
	final PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternInvocationTypeModule = new PatternInvocationConstraintModule<>(
			bindingAndBlackPatternBuilder);
	final PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody> internalPatternInvocationTypeModule = new PatternInvocationTypeModule<>(
			bindingAndBlackPatternInvocationTypeModule);

	// Operation modules (constraint to operation (constraint + adornment) mappings)
	protected final RelationalOperationBuilder relationalOperationBuilder = new RelationalOperationBuilder();
	private final AssignmentOperationBuilder assignmentOperationBuilder = new AssignmentOperationBuilder();
	private final BindingAssignmentOperationBuilder bindingAssignmentOperationBuilder = new BindingAssignmentOperationBuilder();
	private final BasicEMFOperationBuilder basicOperationBuilder = new BasicEMFOperationBuilder();
	protected final EMFOperationBuilder emfBlackOperationBuilder = new EMFOperationBuilder();
	private final EMFRedOperationBuilder emfRedOperationBuilder = new EMFRedOperationBuilder();
	private final EMFGreenOperationBuilder emfGreenOperationBuilder = new EMFGreenOperationBuilder();

	private PatternMatcher bindingAndBlackPatternMatcher;

	private PatternMatcher bindingPatternMatcher;

	private PatternMatcher blackPatternMatcher;

	private PatternMatcher redPatternMatcher;

	private PatternMatcher greenPatternMatcher;

	private PatternMatcher expressionPatternMatcher;

	private final EMoflonPreferencesStorage preferencesStorage;

	public DefaultValidatorConfig(final ResourceSet resourceSet, final EMoflonPreferencesStorage preferencesStorage) {
		this.resourceSet = resourceSet;
		this.preferencesStorage = preferencesStorage;

		emfTypeModule = new EMFConstraintModule(this.resourceSet);
		internalEMFTypeModule = new EMFTypeModule(emfTypeModule);

		bindingAndBlackPatternBuilder
				.addConstraintTypeSwitch(internalPatternInvocationTypeModule.getConstraintTypeSwitch());
		bindingAndBlackPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		bindingAndBlackPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		bindingAndBlackPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

	}

	protected CompilerSearchPlanAlgorithm createAlgorithm(final DemoclesPatternType patternType) {
		final LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> builders = createSearchPlanOperatoinBuilders(
				patternType);
		// TODO@rkluge Operation builders for pattern invocation constraints are missing

		final DefaultAlgorithm<SimpleCombiner, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> defaultAlgorithm = new DefaultAlgorithm<>(
				builders);
		final CompilerSearchPlanAlgorithm createdAlgorithm = new CompilerSearchPlanAlgorithm(defaultAlgorithm);
		return createdAlgorithm;
	}

	protected LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> createSearchPlanOperatoinBuilders(
			final DemoclesPatternType patternType) {
		final LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> builders = new LinkedList<>();
		builders.add(createOperationBuilderForEmf());
		builders.add(createOperationBuilderForRelationalConstraints());

		switch (patternType) {
		case EXPRESSION_PATTERN:
		case GREEN_PATTERN:
			builders.add(createOperationBuilderForAssignment());
			break;
		default:
			// Nothing to do
			break;
		}
		return builders;
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createOperationBuilderForAssignment() {
		return new CombinedSearchPlanOperationBuilder<>(new AssignmentSearchPlanOperationBuilder(),
				new AssignmentWeightedOperationBuilder());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createOperationBuilderForRelationalConstraints() {
		return new CombinedSearchPlanOperationBuilder<>(new RelationalSearchPlanOperationBuilder<>(),
				new RelationalWeightedOperationBuilder<>());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createOperationBuilderForEmf() {
		return new CombinedSearchPlanOperationBuilder<>(new EMFSearchPlanOperationBuilder<>(),
				new EMFWeightedOperationBuilder<>());
	}

	@Override
	public PatternMatcherConfiguration getSearchPlanGenerators() {
		final Map<DemoclesPatternType, PatternMatcher> searchPlanGenerators = new HashMap<>();
		searchPlanGenerators.put(DemoclesPatternType.GREEN_PATTERN, getGreenPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.RED_PATTERN, getRedPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.BLACK_PATTERN, getBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.BINDING_PATTERN, getBindingPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.BINDING_AND_BLACK_PATTERN,
				getBindingAndBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.EXPRESSION_PATTERN, getExpressionPatternSearchPlanGenerator());
		return new PatternMatcherConfiguration(searchPlanGenerators);
	}

	@Override
	public void initializePatternMatchers() {
		try {
			this.setBindingAndBlackPatternMatcher(configureBindingAndBlackPatternMatcher());
			this.setBindingPatternMatcher(configureBindingPatternMatcher());
			this.setBlackPatternMatcher(configureBlackPatternMatcher());
			this.setRedPatternMatcher(configureRedPatternMatcher());
			this.setGreenPatternMatcher(configureGreenPatternMatcher());
			this.setExpressionPatternMatcher(configureExpressionPatternMatcher());
		} catch (final IOException e) {
			// Do nothing
		}
	}

	public EMoflonPreferencesStorage getPreferencesStorage() {
		return this.preferencesStorage;
	}

	protected PatternMatcher getBindingAndBlackPatternSearchPlanGenerator() {
		return bindingAndBlackPatternMatcher;
	}

	protected PatternMatcher getBindingPatternSearchPlanGenerator() {
		return bindingPatternMatcher;
	}

	protected PatternMatcher getBlackPatternSearchPlanGenerator() {
		return blackPatternMatcher;
	}

	protected PatternMatcher getRedPatternSearchPlanGenerator() {
		return redPatternMatcher;
	}

	protected PatternMatcher getGreenPatternSearchPlanGenerator() {
		return greenPatternMatcher;
	}

	protected PatternMatcher getExpressionPatternSearchPlanGenerator() {
		return expressionPatternMatcher;
	}

	protected void setBindingAndBlackPatternMatcher(final PatternMatcher bindingAndBlackPatternMatcher) {
		this.bindingAndBlackPatternMatcher = bindingAndBlackPatternMatcher;
	}

	protected void setBindingPatternMatcher(final PatternMatcher bindingPatternMatcher) {
		this.bindingPatternMatcher = bindingPatternMatcher;
	}

	protected void setBlackPatternMatcher(final PatternMatcher blackPatternMatcher) {
		this.blackPatternMatcher = blackPatternMatcher;
	}

	protected void setRedPatternMatcher(final PatternMatcher redPatternMatcher) {
		this.redPatternMatcher = redPatternMatcher;
	}

	protected void setGreenPatternMatcher(final PatternMatcher greenPatternMatcher) {
		this.greenPatternMatcher = greenPatternMatcher;
	}

	protected void setExpressionPatternMatcher(final PatternMatcher expressionPatternMatcher) {
		this.expressionPatternMatcher = expressionPatternMatcher;
	}

	protected PatternMatcher configureBindingAndBlackPatternMatcher() throws IOException {
		return configureBindingAndBlackPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBindingAndBlackPatternMatcherCompiler() {

		// TODO@rkluge: Create factory for CompilerPatternMatcherModule
		// Configuring binding & black pattern matcher
		final CompilerPatternMatcherModule bindingAndBlackCompilerPatternMatcherModule = new CompilerPatternMatcherModule();
		bindingAndBlackCompilerPatternMatcherModule.addOperationBuilder(basicOperationBuilder);
		bindingAndBlackCompilerPatternMatcherModule
				.setSearchPlanAlgorithm(createAlgorithm(DemoclesPatternType.BINDING_AND_BLACK_PATTERN));

		final PatternMatcherCompiler bindingAndBlackPatternMatcherCompiler = new BindingAndBlackPatternMatcherCompiler(
				bindingAndBlackPatternBuilder, bindingAndBlackCompilerPatternMatcherModule);
		return bindingAndBlackPatternMatcherCompiler;
	}

	protected PatternMatcher configureBindingPatternMatcher() throws IOException {
		return configureBindingPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBindingPatternMatcherCompiler() {
		final CompilerPatternMatcherModule bindingCompilerPatternMatcherModule = new CompilerPatternMatcherModule();
		bindingCompilerPatternMatcherModule.addOperationBuilder(basicOperationBuilder);
		bindingCompilerPatternMatcherModule.addOperationBuilder(bindingAssignmentOperationBuilder);
		bindingCompilerPatternMatcherModule
				.setSearchPlanAlgorithm(createAlgorithm(DemoclesPatternType.BINDING_PATTERN));

		final PatternMatcherCompiler bindingPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, bindingCompilerPatternMatcherModule);
		return bindingPatternMatcherCompiler;
	}

	protected PatternMatcher configureBlackPatternMatcher() throws IOException {
		return configureBlackPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBlackPatternMatcherCompiler() {
		final CompilerPatternMatcherModule blackCompilerPatternMatcherModule = new CompilerPatternMatcherModule();
		blackCompilerPatternMatcherModule.addOperationBuilder(emfBlackOperationBuilder);
		blackCompilerPatternMatcherModule.addOperationBuilder(relationalOperationBuilder);
		blackCompilerPatternMatcherModule.setSearchPlanAlgorithm(createAlgorithm(DemoclesPatternType.BLACK_PATTERN));

		final PatternMatcherCompiler blackPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, blackCompilerPatternMatcherModule);
		return blackPatternMatcherCompiler;
	}

	protected PatternMatcher configureRedPatternMatcher() throws IOException {
		return configureRedPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureRedPatternMatcherCompiler() {
		// Configuring red pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> redPatternBuilder = new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(
				new DefaultPatternFactory());
		redPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		redPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final CompilerPatternMatcherModule redCompilerPatternMatcherModule = new CompilerPatternMatcherModule();
		redCompilerPatternMatcherModule.addOperationBuilder(emfRedOperationBuilder);
		redCompilerPatternMatcherModule.setSearchPlanAlgorithm(createAlgorithm(DemoclesPatternType.RED_PATTERN));

		final PatternMatcherCompiler redPatternMatcherCompiler = new PatternMatcherCompiler(redPatternBuilder,
				redCompilerPatternMatcherModule);
		return redPatternMatcherCompiler;
	}

	protected PatternMatcher configureGreenPatternMatcher() throws IOException {
		return configureGreenPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureGreenPatternMatcherCompiler() {
		// Configuring green pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> greenPatternBuilder = new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(
				new DefaultPatternFactory());
		greenPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final CompilerPatternMatcherModule greenCompilerPatternMatcherModule = new CompilerPatternMatcherModule();
		greenCompilerPatternMatcherModule.addOperationBuilder(assignmentOperationBuilder);
		greenCompilerPatternMatcherModule.addOperationBuilder(emfGreenOperationBuilder);
		greenCompilerPatternMatcherModule.setSearchPlanAlgorithm(createAlgorithm(DemoclesPatternType.GREEN_PATTERN));

		final PatternMatcherCompiler greenPatternMatcherCompiler = new PatternMatcherCompiler(greenPatternBuilder,
				greenCompilerPatternMatcherModule);
		return greenPatternMatcherCompiler;
	}

	protected PatternMatcher configureExpressionPatternMatcher() throws IOException {
		return configureExpressionPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureExpressionPatternMatcherCompiler() {
		// Configuring expression pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> expressionPatternBuilder = new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(
				new DefaultPatternFactory());
		expressionPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		expressionPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());
		expressionPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());

		final CompilerPatternMatcherModule expressionCompilerPatternMatcherModule = new CompilerPatternMatcherModule();
		expressionCompilerPatternMatcherModule.addOperationBuilder(assignmentOperationBuilder);
		expressionCompilerPatternMatcherModule.addOperationBuilder(basicOperationBuilder);
		expressionCompilerPatternMatcherModule
				.setSearchPlanAlgorithm(createAlgorithm(DemoclesPatternType.EXPRESSION_PATTERN));

		final PatternMatcherCompiler expressionPatternMatcherCompiler = new PatternMatcherCompiler(
				expressionPatternBuilder, expressionCompilerPatternMatcherModule);
		return expressionPatternMatcherCompiler;
	}

	@Override
	public TemplateConfigurationProvider createTemplateConfiguration(final GenModel genModel) {
		return new DefaultTemplateConfiguration(genModel);
	}
}
