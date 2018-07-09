package org.moflon.tie.gt.ide.core.patterns;

import java.util.function.Predicate;

import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorNode;
import org.emoflon.ibex.gt.editor.gT.EditorOperator;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.emoflon.ibex.gt.editor.gT.EditorPatternType;
import org.emoflon.ibex.gt.editor.gT.EditorReference;
import org.emoflon.ibex.gt.editor.gT.EditorRelation;

public class EditorPatternClassifier {

	
	private static boolean checkOperator(EditorPattern p, Predicate<? super EditorNode> pred) {
		return p.getNodes().stream().allMatch(pred);
	}

	private static boolean checkReferences(EditorPattern p, Predicate<? super EditorReference> pred) {
		return p.getNodes().stream().allMatch(n-> {
			return n.getReferences().stream().allMatch(pred);
		});
	}
	
	private static boolean checkAttributes(EditorPattern p, Predicate<? super EditorAttribute> pred) {
		return p.getNodes().stream().allMatch(n-> {
			return n.getAttributes().stream().allMatch(pred);
		});
	}

	public static boolean isRedPattern(EditorPattern p) {
		boolean result=true;
		//TODO: implement predicates
		result&=checkOperator(p, n-> false);
		result&=checkReferences(p,ref -> false);
		result&=checkAttributes(p,att ->false);
		return result;
	}

	public static boolean isGreenPattern(EditorPattern p) {
		boolean result=true;
		//TODO: implement predicates
		result&=checkOperator(p, n-> false);
		result&=checkReferences(p,ref -> false);
		result&=checkAttributes(p,att ->false);
		return result;
	}

	public static boolean isExpressionPattern(EditorPattern p) {
		boolean result=true;
		//TODO: implement predicates
		result&=checkOperator(p, n-> false);
		result&=checkReferences(p,ref -> false);
		result&=checkAttributes(p,att ->false);
		return result;
	}
}
