package org.moflon.compiler.sdm.democles.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.emf.BasicEMFOperationBuilder;
import org.gervarro.democles.codegen.emf.EMFOperationBuilder;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.compiler.CompilerSearchPlanAlgorithm;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.CombinedSearchPlanOperationBuilder;
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
import org.moflon.compiler.sdm.democles.searchplan.EmfGreenSearchPlanOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.EmfGreenWeightedOperationBuilder;
import org.moflon.compiler.sdm.democles.searchplan.PatternMatcherCompiler;
import org.moflon.compiler.sdm.democles.searchplan.PatternMatcherConfiguration;
import org.moflon.compiler.sdm.democles.searchplan.TieGtCompilerPatternMatcherModule;
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

		final PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternInvocationTypeModule = new PatternInvocationConstraintModule<>(
				bindingAndBlackPatternBuilder);
		final PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody> internalPatternInvocationTypeModule = new PatternInvocationTypeModule<>(
				bindingAndBlackPatternInvocationTypeModule);
		bindingAndBlackPatternBuilder
				.addConstraintTypeSwitch(internalPatternInvocationTypeModule.getConstraintTypeSwitch());
		bindingAndBlackPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		bindingAndBlackPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		bindingAndBlackPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

	}

	protected CompilerSearchPlanAlgorithm createAlgorithm(final DemoclesPatternType patternType) {
		final LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> builders = createSearchPlanOperationBuilders(
				patternType);

		final TieGtSearchPlanAlgorithm defaultAlgorithm = new TieGtSearchPlanAlgorithm(builders);
		final TieGtCompilerSearchPlanAlgorithm createdAlgorithm = new TieGtCompilerSearchPlanAlgorithm(
				defaultAlgorithm);
		return createdAlgorithm;
	}

	protected LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> createSearchPlanOperationBuilders(
			final DemoclesPatternType patternType) {

		// TODO@rkluge Operation builders for pattern invocation constraints are missing

		final LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> builders = new LinkedList<>();
		builders.add(createEmfSearchPlanOperationBuilder());
		builders.add(createRelationalConstraintsSearchPlanOperationBuilder());
		builders.add(createPatternInvocationSearchPlanOperationBuilder());

		switch (patternType) {
		case BINDING_PATTERN:
			builders.add(createAssignmentSearchPlanOperationBuilder());
			break;
		case EXPRESSION_PATTERN:
			builders.add(createAssignmentSearchPlanOperationBuilder());
			break;
		case GREEN_PATTERN:
			builders.add(createObjectCreatingSearchPlanOperationBuilder());
			builders.add(createAssignmentSearchPlanOperationBuilder());
			break;
		default:
			// Nothing to do
			break;
		}
		return builders;
	}

	private SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation> createPatternInvocationSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new PatternInvocationSearchPlanOperationBuilder(), new PatternInvocationWeightedOperationBuilder());
	}

	private SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation> createObjectCreatingSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new EmfGreenSearchPlanOperationBuilder(), new EmfGreenWeightedOperationBuilder());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createAssignmentSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new AssignmentSearchPlanOperationBuilder(), new AssignmentWeightedOperationBuilder());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createRelationalConstraintsSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new RelationalSearchPlanOperationBuilder<>(), new RelationalWeightedOperationBuilder<>());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createEmfSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new EMFSearchPlanOperationBuilder<>(), new EMFWeightedOperationBuilder<>());
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

		// TODO@rkluge: Create factory for TieGtCompilerPatternMatcherModule
		// Configuring binding & black pattern matcher
		final TieGtCompilerPatternMatcherModule bindingAndBlackCompilerPatternMatcherModule = new TieGtCompilerPatternMatcherModule();
		bindingAndBlackCompilerPatternMatcherModule.addOperationBuilder(basicOperationBuilder);
		bindingAndBlackCompilerPatternMatcherModule
				.setAlgorithm(createAlgorithm(DemoclesPatternType.BINDING_AND_BLACK_PATTERN));

		final PatternMatcherCompiler bindingAndBlackPatternMatcherCompiler = new BindingAndBlackPatternMatcherCompiler(
				bindingAndBlackPatternBuilder, bindingAndBlackCompilerPatternMatcherModule);
		return bindingAndBlackPatternMatcherCompiler;
	}

	protected PatternMatcher configureBindingPatternMatcher() throws IOException {
		return configureBindingPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBindingPatternMatcherCompiler() {
		final TieGtCompilerPatternMatcherModule bindingCompilerPatternMatcherModule = new TieGtCompilerPatternMatcherModule();
		bindingCompilerPatternMatcherModule.addOperationBuilder(basicOperationBuilder);
		bindingCompilerPatternMatcherModule.addOperationBuilder(bindingAssignmentOperationBuilder);
		bindingCompilerPatternMatcherModule.setAlgorithm(createAlgorithm(DemoclesPatternType.BINDING_PATTERN));

		final PatternMatcherCompiler bindingPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, bindingCompilerPatternMatcherModule);
		return bindingPatternMatcherCompiler;
	}

	protected PatternMatcher configureBlackPatternMatcher() throws IOException {
		return configureBlackPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBlackPatternMatcherCompiler() {
		final TieGtCompilerPatternMatcherModule blackCompilerPatternMatcherModule = new TieGtCompilerPatternMatcherModule();
		blackCompilerPatternMatcherModule.addOperationBuilder(emfBlackOperationBuilder);
		blackCompilerPatternMatcherModule.addOperationBuilder(relationalOperationBuilder);
		blackCompilerPatternMatcherModule.setAlgorithm(createAlgorithm(DemoclesPatternType.BLACK_PATTERN));

		final PatternMatcherCompiler blackPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, blackCompilerPatternMatcherModule);
		return blackPatternMatcherCompiler;
	}

	protected PatternMatcher configureRedPatternMatcher() throws IOException {
		return configureRedPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureRedPatternMatcherCompiler() {
		// Configuring red pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> redPatternBuilder = new EMFPatternBuilder<>(
				new DefaultPatternFactory());
		redPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		redPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final TieGtCompilerPatternMatcherModule redCompilerPatternMatcherModule = new TieGtCompilerPatternMatcherModule();
		redCompilerPatternMatcherModule.addOperationBuilder(emfRedOperationBuilder);
		redCompilerPatternMatcherModule.setAlgorithm(createAlgorithm(DemoclesPatternType.RED_PATTERN));

		final PatternMatcherCompiler redPatternMatcherCompiler = new PatternMatcherCompiler(redPatternBuilder,
				redCompilerPatternMatcherModule);
		return redPatternMatcherCompiler;
	}

	protected PatternMatcher configureGreenPatternMatcher() throws IOException {
		return configureGreenPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureGreenPatternMatcherCompiler() {
		// Configuring green pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> greenPatternBuilder = new EMFPatternBuilder<>(
				new DefaultPatternFactory());
		greenPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final TieGtCompilerPatternMatcherModule greenCompilerPatternMatcherModule = new TieGtCompilerPatternMatcherModule();
		greenCompilerPatternMatcherModule.addOperationBuilder(assignmentOperationBuilder);
		greenCompilerPatternMatcherModule.addOperationBuilder(emfGreenOperationBuilder);
		greenCompilerPatternMatcherModule.setAlgorithm(createAlgorithm(DemoclesPatternType.GREEN_PATTERN));

		final PatternMatcherCompiler greenPatternMatcherCompiler = new PatternMatcherCompiler(greenPatternBuilder,
				greenCompilerPatternMatcherModule);
		return greenPatternMatcherCompiler;
	}

	protected PatternMatcher configureExpressionPatternMatcher() throws IOException {
		return configureExpressionPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureExpressionPatternMatcherCompiler() {
		// Configuring expression pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> expressionPatternBuilder = new EMFPatternBuilder<>(
				new DefaultPatternFactory());
		expressionPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		expressionPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());
		expressionPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());

		final TieGtCompilerPatternMatcherModule expressionCompilerPatternMatcherModule = new TieGtCompilerPatternMatcherModule();
		expressionCompilerPatternMatcherModule.addOperationBuilder(assignmentOperationBuilder);
		expressionCompilerPatternMatcherModule.addOperationBuilder(basicOperationBuilder);
		expressionCompilerPatternMatcherModule.setAlgorithm(createAlgorithm(DemoclesPatternType.EXPRESSION_PATTERN));

		final PatternMatcherCompiler expressionPatternMatcherCompiler = new PatternMatcherCompiler(
				expressionPatternBuilder, expressionCompilerPatternMatcherModule);
		return expressionPatternMatcherCompiler;
	}

	@Override
	public TemplateConfigurationProvider createTemplateConfiguration(final GenModel genModel) {
		return new DefaultTemplateConfiguration(genModel);
	}
}
