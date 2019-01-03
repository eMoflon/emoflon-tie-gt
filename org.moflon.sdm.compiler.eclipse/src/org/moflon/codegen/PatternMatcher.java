/**
 */
package org.moflon.codegen;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

public abstract class PatternMatcher {

	public abstract ValidationReport generateSearchPlan(Pattern pattern, Adornment adornment, boolean isMultipleMatch);
}
