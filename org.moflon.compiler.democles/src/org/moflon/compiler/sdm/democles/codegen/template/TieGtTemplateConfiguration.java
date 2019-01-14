package org.moflon.compiler.sdm.democles.codegen.template;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.ImportManager;
import org.gervarro.democles.codegen.OperationSequenceCompiler;
import org.gervarro.democles.codegen.PatternInvocationConstraintTemplateProvider;
import org.gervarro.democles.codegen.emf.EMFTemplateProvider;
import org.gervarro.democles.codegen.emf.EcoreToGenModelConverter;
import org.gervarro.democles.codegen.stringtemplate.AdornmentHandler;
import org.gervarro.democles.codegen.stringtemplate.FullyQualifiedName;
import org.gervarro.democles.codegen.stringtemplate.ImportHandler;
import org.gervarro.democles.codegen.stringtemplate.StringRenderer;
import org.gervarro.democles.codegen.stringtemplate.emf.EcoreModelAdaptor;
import org.gervarro.democles.codegen.stringtemplate.emf.GenModelAdaptor;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.relational.RelationalConstraintTemplateProvider;
import org.gervarro.democles.specification.ConstraintVariable;
import org.moflon.compiler.sdm.democles.config.TieGtCodeGenerationConfiguration;
import org.moflon.compiler.sdm.democles.searchplan.AssignmentTemplateProvider;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintsOperationActivator;
import org.moflon.sdm.constraints.operationspecification.OperationSpecificationGroup;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupString;

public class TieGtTemplateConfiguration implements TemplateConfigurationProvider {
	private static final Logger logger = Logger.getLogger(TieGtTemplateConfiguration.class);

	public static final String CONTROL_FLOW_GENERATOR = "ControlFlowGenerator";

	protected final HashMap<String, STGroup> templates = new HashMap<String, STGroup>();

	protected final HashMap<String, OperationSequenceCompiler> operationSequenceCompilers = new HashMap<String, OperationSequenceCompiler>();

	public TieGtTemplateConfiguration(final GenModel genModel,
			final List<AttributeConstraintLibrary> attributeConstraintLibs) {
		final EcoreToGenModelConverter ecoreToGenModelConverter = new EcoreToGenModelConverter(genModel);
		final EcoreModelAdaptor ecoreModelAdaptor = new EcoreModelAdaptor(ecoreToGenModelConverter);

		final STGroup controlFlowTemplateGroup = createControlFlowTemplates();
		controlFlowTemplateGroup.registerModelAdaptor(EClassifier.class, ecoreModelAdaptor);
		controlFlowTemplateGroup.registerRenderer(EClassifier.class, ecoreModelAdaptor);
		templates.put(CONTROL_FLOW_GENERATOR, controlFlowTemplateGroup);

		final STGroup bindingAndBlackTemplateGroup = createBindingAndBlackTemplates();
		bindingAndBlackTemplateGroup.registerModelAdaptor(EModelElement.class, ecoreModelAdaptor);
		bindingAndBlackTemplateGroup.registerModelAdaptor(EMFVariable.class, ecoreModelAdaptor);
		bindingAndBlackTemplateGroup.registerRenderer(EMFVariable.class, ecoreModelAdaptor);
		bindingAndBlackTemplateGroup.registerRenderer(EClassifier.class, ecoreModelAdaptor);
		templates.put(TieGtCodeGenerationConfiguration.BINDING_AND_BLACK_PATTERN_MATCHER_GENERATOR,
				bindingAndBlackTemplateGroup);

		final STGroup bindingTemplateGroup = createBindingTemplates();
		bindingTemplateGroup.registerModelAdaptor(EModelElement.class, ecoreModelAdaptor);
		bindingTemplateGroup.registerModelAdaptor(EMFVariable.class, ecoreModelAdaptor);
		bindingTemplateGroup.registerRenderer(EMFVariable.class, ecoreModelAdaptor);
		bindingTemplateGroup.registerRenderer(EClassifier.class, ecoreModelAdaptor);
		templates.put(TieGtCodeGenerationConfiguration.BINDING_PATTERN_MATCHER_GENERATOR, bindingTemplateGroup);

		final STGroup blackTemplateGroup = createBlackTemplates();
		blackTemplateGroup.registerModelAdaptor(EModelElement.class, ecoreModelAdaptor);
		blackTemplateGroup.registerModelAdaptor(EMFVariable.class, ecoreModelAdaptor);
		blackTemplateGroup.registerRenderer(EMFVariable.class, ecoreModelAdaptor);
		blackTemplateGroup.registerRenderer(EClassifier.class, ecoreModelAdaptor);
		templates.put(TieGtCodeGenerationConfiguration.BLACK_PATTERN_MATCHER_GENERATOR, blackTemplateGroup);

		final STGroup redTemplateGroup = createRedTemplates();
		redTemplateGroup.registerModelAdaptor(EModelElement.class, ecoreModelAdaptor);
		redTemplateGroup.registerModelAdaptor(EMFVariable.class, ecoreModelAdaptor);
		redTemplateGroup.registerRenderer(EMFVariable.class, ecoreModelAdaptor);
		redTemplateGroup.registerRenderer(EClassifier.class, ecoreModelAdaptor);
		templates.put(TieGtCodeGenerationConfiguration.RED_PATTERN_MATCHER_GENERATOR, redTemplateGroup);

		final STGroup greenTemplateGroup = createGreenTemplates();
		greenTemplateGroup.registerModelAdaptor(EModelElement.class, ecoreModelAdaptor);
		greenTemplateGroup.registerModelAdaptor(EMFVariable.class, ecoreModelAdaptor);
		greenTemplateGroup.registerRenderer(EMFVariable.class, ecoreModelAdaptor);
		greenTemplateGroup.registerRenderer(EClassifier.class, ecoreModelAdaptor);
		templates.put(TieGtCodeGenerationConfiguration.GREEN_PATTERN_MATCHER_GENERATOR, greenTemplateGroup);

		final STGroup expressionTemplateGroup = createExpressionTemplates();
		expressionTemplateGroup.registerModelAdaptor(EModelElement.class, ecoreModelAdaptor);
		expressionTemplateGroup.registerModelAdaptor(EMFVariable.class, ecoreModelAdaptor);
		expressionTemplateGroup.registerRenderer(EMFVariable.class, ecoreModelAdaptor);
		expressionTemplateGroup.registerRenderer(EClassifier.class, ecoreModelAdaptor);
		templates.put(TieGtCodeGenerationConfiguration.EXPRESSION_PATTERN_MATCHER_GENERATOR, expressionTemplateGroup);

		operationSequenceCompilers.put(TieGtCodeGenerationConfiguration.BINDING_AND_BLACK_PATTERN_MATCHER_GENERATOR,
				createBindingAndBlackOperationSequenceCompiler());
		operationSequenceCompilers.put(TieGtCodeGenerationConfiguration.BINDING_PATTERN_MATCHER_GENERATOR,
				createBindingOperationSequenceCompiler());
		operationSequenceCompilers.put(TieGtCodeGenerationConfiguration.BLACK_PATTERN_MATCHER_GENERATOR,
				createBlackOperationSequenceCompiler());
		operationSequenceCompilers.put(TieGtCodeGenerationConfiguration.RED_PATTERN_MATCHER_GENERATOR,
				createRedOperationSequenceCompiler());
		operationSequenceCompilers.put(TieGtCodeGenerationConfiguration.GREEN_PATTERN_MATCHER_GENERATOR,
				createGreenOperationSequenceCompiler());
		operationSequenceCompilers.put(TieGtCodeGenerationConfiguration.EXPRESSION_PATTERN_MATCHER_GENERATOR,
				createExpressionOperationSequenceCompiler());

		addAttributeConstraintTemplatesToBlackTemplates(attributeConstraintLibs);
		operationSequenceCompilers.put(TieGtCodeGenerationConfiguration.BLACK_PATTERN_MATCHER_GENERATOR,
				createBlackOperationSequenceCompiler());
	}

	@Override
	public final STGroup getTemplateGroup(final String id) {
		return templates.get(id);
	}

	@Override
	public final OperationSequenceCompiler getOperationSequenceCompiler(final String id) {
		return operationSequenceCompilers.get(id);
	}

	public static final STGroup createControlFlowTemplates() {
		final STGroup group = new STGroup();
		group.setListener(new LoggingSTErrorListener(logger));
		group.loadGroupFile("/" + CONTROL_FLOW_GENERATOR + "/",
				getCompilerURI() + "templates/stringtemplate/ControlFlow.stg");

		final ControlFlowModelAdaptor adaptor = new ControlFlowModelAdaptor();
		group.registerModelAdaptor(PatternInvocation.class, adaptor);
		group.registerModelAdaptor(VariableReference.class, adaptor);
		group.registerModelAdaptor(CFNode.class, adaptor);
		group.registerModelAdaptor(CFVariable.class, adaptor);
		final ImportHandler importRenderer = new ImportHandler();
		group.registerModelAdaptor(ImportManager.class, importRenderer);
		group.registerModelAdaptor(FullyQualifiedName.class, importRenderer);
		return group;
	}

	@SuppressWarnings("unchecked")
	public static final OperationSequenceCompiler createBindingAndBlackOperationSequenceCompiler() {
		return new OperationSequenceCompiler(new BindingAndBlackTemplateProvider());
	}

	public static final STGroup createBindingAndBlackTemplates() {
		final STGroup group = new STGroup();
		group.setListener(new LoggingSTErrorListener(logger));
		group.loadGroupFile("/democles/", getDemoclesCoreURI() + "templates/stringtemplate/DemoclesCommon.stg");
		group.loadGroupFile("/regular/", getCompilerURI() + "templates/stringtemplate/RegularPatternMatcher.stg");
		group.loadGroupFile("/priority/", getCompilerURI() + "templates/stringtemplate/PrioritizedPatternCall.stg");
		final ImportHandler importRenderer = new ImportHandler();
		group.registerModelAdaptor(ImportManager.class, importRenderer);
		group.registerModelAdaptor(FullyQualifiedName.class, importRenderer);

		final PatternMatcherModelAdaptor parameterRenderer = new PatternMatcherModelAdaptor();
		group.registerModelAdaptor(GeneratorOperation.class, parameterRenderer);
		group.registerModelAdaptor(ConstraintVariable.class, parameterRenderer);
		group.registerModelAdaptor(VariableRuntime.class, parameterRenderer);
		group.registerModelAdaptor(Integer.class, new AdornmentHandler());
		group.registerRenderer(String.class, new StringRenderer());

		group.registerModelAdaptor(GenBase.class, new GenModelAdaptor());
		return group;
	}

	@SuppressWarnings("unchecked")
	public static final OperationSequenceCompiler createBindingOperationSequenceCompiler() {
		return new OperationSequenceCompiler(new AssignmentTemplateProvider(), new EMFTemplateProvider());
	}

	public static final STGroup createBindingTemplates() {
		final STGroup group = new STGroup();
		group.setListener(new LoggingSTErrorListener(logger));
		group.loadGroupFile("/democles/", getDemoclesCoreURI() + "templates/stringtemplate/DemoclesCommon.stg");
		group.loadGroupFile("/regular/", getCompilerURI() + "templates/stringtemplate/RegularPatternMatcher.stg");
		group.loadGroupFile("/assignment/", getCompilerURI() + "templates/stringtemplate/Assignment.stg");
		group.loadGroupFile("/emf/", getDemoclesEMFURI() + "templates/stringtemplate/EMFOperation.stg");
		group.loadGroupFile("/democles/", getDemoclesEMFURI() + "templates/stringtemplate/EMFConstant.stg");
		group.loadGroupFile("/democles/", getCompilerURI() + "templates/stringtemplate/Number.stg");
		final ImportHandler importRenderer = new ImportHandler();
		group.registerModelAdaptor(ImportManager.class, importRenderer);
		group.registerModelAdaptor(FullyQualifiedName.class, importRenderer);

		final PatternMatcherModelAdaptor parameterRenderer = new PatternMatcherModelAdaptor();
		group.registerModelAdaptor(ConstraintVariable.class, parameterRenderer);
		group.registerModelAdaptor(VariableRuntime.class, parameterRenderer);
		group.registerModelAdaptor(Integer.class, new AdornmentHandler());
		group.registerRenderer(String.class, new StringRenderer());

		group.registerModelAdaptor(GenBase.class, new GenModelAdaptor());
		return group;
	}

	@SuppressWarnings("unchecked")
	public static OperationSequenceCompiler createBlackOperationSequenceCompiler() {
		return new OperationSequenceCompiler(new PatternInvocationConstraintTemplateProvider(),
				new RelationalConstraintTemplateProvider(), new EMFTemplateProvider(),
				new AttributeConstraintsTemplateProvider());
	}

	public static final STGroup createBlackTemplates() {
		final STGroup group = new STGroup();
		group.setListener(new LoggingSTErrorListener(logger));
		group.loadGroupFile("/democles/", getDemoclesCoreURI() + "templates/stringtemplate/DemoclesCommon.stg");
		group.loadGroupFile("/regular/", getCompilerURI() + "templates/stringtemplate/RegularPatternMatcher.stg");
		group.loadGroupFile("/core/", getDemoclesCoreURI() + "templates/stringtemplate/RelationalOperation.stg");
		group.loadGroupFile("/emf/", getDemoclesEMFURI() + "templates/stringtemplate/EMFOperation.stg");
		group.loadGroupFile("/pattern/", getDemoclesCoreURI() + "templates/stringtemplate/PatternCallOperation.stg");
		group.loadGroupFile("/democles/", getDemoclesEMFURI() + "templates/stringtemplate/EMFConstant.stg");
		group.loadGroupFile("/democles/", getCompilerURI() + "templates/stringtemplate/Number.stg");
		final ImportHandler importRenderer = new ImportHandler();
		group.registerModelAdaptor(ImportManager.class, importRenderer);
		group.registerModelAdaptor(FullyQualifiedName.class, importRenderer);

		final PatternMatcherModelAdaptor parameterRenderer = new PatternMatcherModelAdaptor();
		group.registerModelAdaptor(ConstraintVariable.class, parameterRenderer);
		group.registerModelAdaptor(VariableRuntime.class, parameterRenderer);
		group.registerModelAdaptor(Integer.class, new AdornmentHandler());
		group.registerRenderer(String.class, new StringRenderer());

		group.registerModelAdaptor(GenBase.class, new GenModelAdaptor());
		return group;
	}

	@SuppressWarnings("unchecked")
	public static final OperationSequenceCompiler createRedOperationSequenceCompiler() {
		return new OperationSequenceCompiler(new EMFRedTemplateProvider());
	}

	public static final STGroup createRedTemplates() {
		final STGroup group = new STGroup();
		group.setListener(new LoggingSTErrorListener(logger));
		group.loadGroupFile("/democles/", getDemoclesCoreURI() + "templates/stringtemplate/DemoclesCommon.stg");
		group.loadGroupFile("/regular/", getCompilerURI() + "templates/stringtemplate/RegularPatternMatcher.stg");
		group.loadGroupFile("/emf-delete/", getCompilerURI() + "templates/stringtemplate/EMFDeleteOperation.stg");
		group.loadGroupFile("/democles/", getDemoclesEMFURI() + "templates/stringtemplate/EMFConstant.stg");
		final ImportHandler importRenderer = new ImportHandler();
		group.registerModelAdaptor(ImportManager.class, importRenderer);
		group.registerModelAdaptor(FullyQualifiedName.class, importRenderer);

		final PatternMatcherModelAdaptor parameterRenderer = new PatternMatcherModelAdaptor();
		group.registerModelAdaptor(ConstraintVariable.class, parameterRenderer);
		group.registerModelAdaptor(VariableRuntime.class, parameterRenderer);
		group.registerModelAdaptor(Integer.class, new AdornmentHandler());
		group.registerRenderer(String.class, new StringRenderer());

		group.registerModelAdaptor(GenBase.class, new GenModelAdaptor());
		return group;
	}

	@SuppressWarnings("unchecked")
	public static final OperationSequenceCompiler createGreenOperationSequenceCompiler() {
		return new OperationSequenceCompiler(new AttributeAssignmentTemplateProvider(), new EMFGreenTemplateProvider());
	}

	public static final STGroup createGreenTemplates() {
		final STGroup group = new STGroup();
		group.setListener(new LoggingSTErrorListener(logger));
		group.loadGroupFile("/democles/", getDemoclesCoreURI() + "templates/stringtemplate/DemoclesCommon.stg");
		group.loadGroupFile("/regular/", getCompilerURI() + "templates/stringtemplate/RegularPatternMatcher.stg");
		group.loadGroupFile("/assignment/", getCompilerURI() + "templates/stringtemplate/Assignment.stg");
		group.loadGroupFile("/emf-create/", getCompilerURI() + "templates/stringtemplate/EMFCreateOperation.stg");
		group.loadGroupFile("/emf/", getDemoclesEMFURI() + "templates/stringtemplate/EMFOperation.stg");
		group.loadGroupFile("/democles/", getDemoclesEMFURI() + "templates/stringtemplate/EMFConstant.stg");
		group.loadGroupFile("/democles/", getCompilerURI() + "templates/stringtemplate/Number.stg");
		final ImportHandler importRenderer = new ImportHandler();
		group.registerModelAdaptor(ImportManager.class, importRenderer);
		group.registerModelAdaptor(FullyQualifiedName.class, importRenderer);

		final PatternMatcherModelAdaptor parameterRenderer = new PatternMatcherModelAdaptor();
		group.registerModelAdaptor(ConstraintVariable.class, parameterRenderer);
		group.registerModelAdaptor(VariableRuntime.class, parameterRenderer);
		group.registerModelAdaptor(Integer.class, new AdornmentHandler());
		group.registerRenderer(String.class, new StringRenderer());

		group.registerModelAdaptor(GenBase.class, new GenModelAdaptor());
		return group;
	}

	@SuppressWarnings("unchecked")
	public static final OperationSequenceCompiler createExpressionOperationSequenceCompiler() {
		return new OperationSequenceCompiler(new AssignmentTemplateProvider(), new EMFTemplateProvider());
	}

	public static final STGroup createExpressionTemplates() {
		final STGroup group = new STGroup();
		group.setListener(new LoggingSTErrorListener(logger));
		group.loadGroupFile("/democles/", getDemoclesCoreURI() + "templates/stringtemplate/DemoclesCommon.stg");
		group.loadGroupFile("/expression/", getCompilerURI() + "templates/stringtemplate/ExpressionPatternMatcher.stg");
		group.loadGroupFile("/assignment/", getCompilerURI() + "templates/stringtemplate/Assignment.stg");
		group.loadGroupFile("/emf/", getDemoclesEMFURI() + "templates/stringtemplate/EMFOperation.stg");
		group.loadGroupFile("/democles/", getDemoclesEMFURI() + "templates/stringtemplate/EMFConstant.stg");
		group.loadGroupFile("/democles/", getCompilerURI() + "templates/stringtemplate/Number.stg");
		final ImportHandler importRenderer = new ImportHandler();
		group.registerModelAdaptor(ImportManager.class, importRenderer);
		group.registerModelAdaptor(FullyQualifiedName.class, importRenderer);

		final PatternMatcherModelAdaptor parameterRenderer = new PatternMatcherModelAdaptor();
		group.registerModelAdaptor(ConstraintVariable.class, parameterRenderer);
		group.registerModelAdaptor(VariableRuntime.class, parameterRenderer);
		group.registerModelAdaptor(Integer.class, new AdornmentHandler());
		group.registerRenderer(String.class, new StringRenderer());

		group.registerModelAdaptor(GenBase.class, new GenModelAdaptor());
		return group;
	}

	private static String getCompilerURI() {
		final String pluginId = WorkspaceHelper.getPluginId(TieGtTemplateConfiguration.class);
		return "platform:/plugin/" + pluginId + "/";
	}

	private static String getDemoclesCoreURI() {
		return "platform:/plugin/org.gervarro.democles.codegen.stringtemplate/";
	}

	private static String getDemoclesEMFURI() {
		return "platform:/plugin/org.gervarro.democles.codegen.emf/";
	}

	/**
	 * Adds the templates for user-defined constraints to the template group for
	 * black patterns (i.e., patterns that represent preserved variables).
	 *
	 * @param attributeConstraintLibs the library containing user-defined attribute
	 *                                constraints and operations
	 */
	private void addAttributeConstraintTemplatesToBlackTemplates(
			final List<AttributeConstraintLibrary> attributeConstraintLibs) {
		final STGroup group = getTemplateGroup(TieGtCodeGenerationConfiguration.BLACK_PATTERN_MATCHER_GENERATOR);
		for (final AttributeConstraintLibrary library : attributeConstraintLibs) {

			for (final OperationSpecificationGroup operationSpecificationGroup : library.getOperationSpecifications()) {

				if (!operationSpecificationGroup.isTemplateGroupGenerated()) {
					operationSpecificationGroup.gernerateTemplate();
				}

				final STGroup newGroup = new STGroupString("someName",
						operationSpecificationGroup.getTemplateGroupString(),
						AttributeConstraintsOperationActivator.OUTER_ST_DELIMITER,
						AttributeConstraintsOperationActivator.OUTER_ST_DELIMITER);

				for (final String templateName : newGroup.getTemplateNames()) {
					final ST template = newGroup.getInstanceOf(templateName);
					final String fullyQualifiedTemplateName = "/" + library.getPrefix() + "/"
							+ operationSpecificationGroup.getOperationIdentifier() + template.getName();
					group.rawDefineTemplate(fullyQualifiedTemplateName, template.impl, null);
				}

			}

		}

	}
}
