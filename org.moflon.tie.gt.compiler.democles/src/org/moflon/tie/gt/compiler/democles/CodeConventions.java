package org.moflon.tie.gt.compiler.democles;

import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class CodeConventions {

	private CodeConventions() {
		throw new UtilityClassNotInstantiableException();
	}

	public static final String RESULT_VARIABLE_NAME = "_result";
	public static final String GENERATED_VARIABLE_NAME_PREFIX = "temp_";
	public static final String CASTING_SOURCE_PREFIX = "__castingSourceFor_";
	public static final String FREE_VARIABLE_SUFFIX = "prime";
	public static final String PREFIX_PARAMETERS = "__param_";

	public static String deriveCastingSourceNodeName(final EditorNode invokedNode) {
		return String.format("%s%s", CASTING_SOURCE_PREFIX, invokedNode.getName());
	}

	public static String getPatternParameterName(final String string) {
		return PREFIX_PARAMETERS + string;
	}

}
