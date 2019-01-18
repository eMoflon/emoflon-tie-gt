package org.moflon.tie.gt.ide.core.codegeneration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeConditionAdornment;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeConditionLibrary;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeConditionOperationalization;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeConditionParameter;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeConditionSpecification;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeConditionTargetPlatform;
import org.emoflon.ibex.gt.editor.gT.EditorAttributeConditionType;
import org.emoflon.ibex.gt.editor.gT.EditorGTFile;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintsLibraryRegistry;
import org.moflon.tie.gt.constraints.operationspecification.ConstraintSpecification;
import org.moflon.tie.gt.constraints.operationspecification.OperationSpecification;
import org.moflon.tie.gt.constraints.operationspecification.OperationSpecificationGroup;
import org.moflon.tie.gt.constraints.operationspecification.OperationspecificationFactory;
import org.moflon.tie.gt.constraints.operationspecification.ParamIdentifier;
import org.moflon.tie.gt.constraints.operationspecification.ParameterType;

public class AttributeConstraintsLibraryLoader {

	public AttributeConstraintsLibraryRegistry run(final ResourceSet resourceSet) {

		final AttributeConstraintsLibraryRegistry attributeConstraintLibraries = new AttributeConstraintsLibraryRegistry();
		for (final Resource resource : resourceSet.getResources()) {
			if (!resource.getContents().isEmpty()) {
				final EObject firstObject = resource.getContents().get(0);
				if (firstObject instanceof EditorGTFile) {
					final EditorGTFile editorGtFile = (EditorGTFile) firstObject;
					attributeConstraintLibraries.add(resource.getURI(), loadAttributeConstraintsLibrary(editorGtFile));
				}
			}
		}
		return attributeConstraintLibraries;
	}

	private AttributeConstraintLibrary loadAttributeConstraintsLibrary(final EditorGTFile gtFile) {
		final AttributeConstraintLibrary democlesLibrary = OperationspecificationFactory.eINSTANCE
				.createAttributeConstraintLibrary();
		democlesLibrary.setPrefix(deriveAttributeConstraintsLibraryPrefix(gtFile));
		for (final EditorAttributeConditionLibrary editorLibrary : gtFile.getAttributeConditionLibraries()) {

			for (final EditorAttributeConditionSpecification editorConditionSpecification : editorLibrary
					.getConditionSpecifications()) {

				final ConstraintSpecification democlesConstraintSpecification = createConstraintSpecification(
						democlesLibrary, editorConditionSpecification);

				final OperationSpecificationGroup democlesOperationSpecificationGroup = createOperationSpecificationGroup(
						democlesLibrary, editorConditionSpecification, democlesConstraintSpecification);

				loadParameters(editorConditionSpecification, democlesConstraintSpecification,
						democlesOperationSpecificationGroup);

				final EditorAttributeConditionSpecification reusedConditionSpecification = getReusedSpecification(
						editorConditionSpecification);
				if (reusedConditionSpecification != null) {
					loadOperationalizations(reusedConditionSpecification, democlesOperationSpecificationGroup);
				} else {
					loadOperationalizations(editorConditionSpecification, democlesOperationSpecificationGroup);
				}
			}
		}
		return democlesLibrary;
	}

	private EditorAttributeConditionSpecification getReusedSpecification(
			final EditorAttributeConditionSpecification editorConditionSpecification) {
		EditorAttributeConditionSpecification reusedConditionSpecification = editorConditionSpecification
				.getReusedConditionSpecification();
		if (reusedConditionSpecification == null) {
			return null;
		}
		while (reusedConditionSpecification.getReusedConditionSpecification() != null) {
			reusedConditionSpecification = reusedConditionSpecification.getReusedConditionSpecification();
		}
		return reusedConditionSpecification;
	}

	private OperationSpecificationGroup createOperationSpecificationGroup(
			final AttributeConstraintLibrary democlesLibrary,
			final EditorAttributeConditionSpecification editorConditionSpecification,
			final ConstraintSpecification democlesConstraintSpecification) {
		final OperationSpecificationGroup democlesOperationSpecificationGroup = OperationspecificationFactory.eINSTANCE
				.createOperationSpecificationGroup();
		democlesOperationSpecificationGroup.setOperationIdentifier(editorConditionSpecification.getName());
		democlesLibrary.getOperationSpecifications().add(democlesOperationSpecificationGroup);
		democlesConstraintSpecification.setOperationSpecificationGroup(democlesOperationSpecificationGroup);
		return democlesOperationSpecificationGroup;
	}

	private ConstraintSpecification createConstraintSpecification(final AttributeConstraintLibrary democlesLibrary,
			final EditorAttributeConditionSpecification editorConditionSpecification) {
		final ConstraintSpecification democlesConstraintSpecification = OperationspecificationFactory.eINSTANCE
				.createConstraintSpecification();
		democlesConstraintSpecification.setSymbol(editorConditionSpecification.getName());
		democlesLibrary.getConstraintSpecifications().add(democlesConstraintSpecification);
		return democlesConstraintSpecification;
	}

	private void loadParameters(final EditorAttributeConditionSpecification editorConditionSpecification,
			final ConstraintSpecification democlesConstraintSpecification,
			final OperationSpecificationGroup democlesOperationSpecificationGroup) {
		for (final EditorAttributeConditionParameter editorParameter : editorConditionSpecification.getParameters()) {
			final EDataType parameterType = editorParameter.getType();
			final ParameterType democlesParameterType = OperationspecificationFactory.eINSTANCE.createParameterType();
			democlesParameterType.setType(parameterType);
			democlesConstraintSpecification.getParameterTypes().add(democlesParameterType);

			final ParamIdentifier democlesParameterIdentifier = OperationspecificationFactory.eINSTANCE
					.createParamIdentifier();
			democlesParameterIdentifier.setIdentifier(editorParameter.getName());
			democlesOperationSpecificationGroup.getParameterIDs().add(democlesParameterIdentifier);
		}
	}

	private void loadOperationalizations(final EditorAttributeConditionSpecification editorConditionSpecification,
			final OperationSpecificationGroup democlesOperationSpecificationGroup) {
		for (final EditorAttributeConditionOperationalization editorOperationalization : editorConditionSpecification
				.getOperationalizations()) {
			loadOperationalization(democlesOperationSpecificationGroup, editorOperationalization);
		}
	}

	private void loadOperationalization(final OperationSpecificationGroup democlesOperationSpecificationGroup,
			final EditorAttributeConditionOperationalization editorOperationalization) {
		if (editorOperationalization.getTarget() == EditorAttributeConditionTargetPlatform.JAVA) {
			final OperationSpecification operationSpecification = OperationspecificationFactory.eINSTANCE
					.createOperationSpecification();
			operationSpecification.setAdornmentString(mapToAdornmentString(editorOperationalization.getAdornments()));
			operationSpecification.setAlwaysSuccessful(isAlwaysSuccessfull(editorOperationalization));
			operationSpecification.setSpecification(editorOperationalization.getSpecification());
			democlesOperationSpecificationGroup.getOperationSpecifications().add(operationSpecification);
		}
	}

	private String deriveAttributeConstraintsLibraryPrefix(final EditorGTFile gtFile) {
		return "constraintLibraryFrom" + gtFile.eResource().getURI().lastSegment().replaceAll(".gt", "");
	}

	private boolean isAlwaysSuccessfull(final EditorAttributeConditionOperationalization editorOperationalization) {
		return editorOperationalization.getOperationalizationType() == EditorAttributeConditionType.EXTEND;
	}

	private String mapToAdornmentString(final EList<EditorAttributeConditionAdornment> editorAdornments) {
		final StringBuilder adornmentString = new StringBuilder();
		for (final EditorAttributeConditionAdornment editorAdornment : editorAdornments) {
			switch (editorAdornment) {
			case BOUND:
				adornmentString.append(Adornments.ADORNMENT_SYMBOL_BOUND);
				break;
			case FREE:
				adornmentString.append(Adornments.ADORNMENT_SYMBOL_FREE);
				break;
			default:
				throw new IllegalArgumentException(
						String.format("Unsupported adornment in editor %s", editorAdornment));
			}
		}
		return adornmentString.toString();
	}
}
