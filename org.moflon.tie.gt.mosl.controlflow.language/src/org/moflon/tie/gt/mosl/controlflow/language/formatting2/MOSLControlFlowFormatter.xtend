/*
 * generated by Xtext 2.12.0
 */
package org.moflon.tie.gt.mosl.controlflow.language.formatting2

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameter
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Condition
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ConditionStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.EClassDef
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Import
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.IncludePattern
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.LoopStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodDec
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodParameter
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MoslControlFlowPackage
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Statement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternReference

class MOSLControlFlowFormatter extends AbstractFormatter2 {

  static final String BRACE_LEFT = "{"
  static final String BRACE_RIGHT = "}"
  static final String COMMA = ","

  def dispatch void format(GraphTransformationControlFlowFile file, extension IFormattableDocument document) {
    // No space before first import.
    if (file.imports.size > 0) {
      file.imports.get(0).prepend[noSpace]
    }

    // Empty line after imports.
    formatList(file.imports, document, 0, 1, 2)
    formatList(file.includedPatterns, document, 0, 1, 2)

    file.regionFor.keyword("package").append[oneSpace]

    formatList(file.EClasses, document, 0, 2, 2)
  }

  def dispatch void format(Import importStatement, extension IFormattableDocument document) {
    importStatement.regionFor.keyword("import").append[oneSpace]
  }

  def dispatch void format(IncludePattern include, extension IFormattableDocument document) {
    include.regionFor.keyword("using").append[oneSpace]
  }

  def dispatch void format(EClassDef eclassDef, extension IFormattableDocument document) {
    eclassDef.regionFor.keyword("class").append[oneSpace]
    eclassDef.regionFor.feature(MoslControlFlowPackage.Literals.ECLASS_DEF__NAME).append[oneSpace]
    eclassDef.regionFor.keyword(BRACE_LEFT).prepend[oneSpace].append[newLine]
    eclassDef.regionFor.keyword(BRACE_RIGHT).prepend[newLine].append[noSpace]

    val body = eclassDef.regionFor.keywordPairs(BRACE_LEFT, BRACE_RIGHT)
    for (var i = 0; i < body.size; i++)
      body.get(i).interior[indent]

    formatList(eclassDef.operations, document, 1, 2, 1)
  }

  def dispatch void format(MethodDec method, extension IFormattableDocument document) {
    method.regionFor.keyword("operation").append[oneSpace]
    method.regionFor.keyword("(").prepend[noSpace] // Closing ')' already covered by ':' rule
    for (comma : method.regionFor.keywords(COMMA))
      comma.append[oneSpace]

    for (parameter : method.EParameters)
      parameter.format(document)

    // Return type
    method.regionFor.keyword(':').surround[noSpace]

    method.regionFor.keyword(BRACE_LEFT).prepend[oneSpace].append[newLine]
    method.regionFor.keyword(BRACE_RIGHT).prepend[newLine]

    // Indent everything between "{" and "}".
    val body = method.regionFor.keywordPairs(BRACE_LEFT, BRACE_RIGHT)
    for (var i = 0; i < body.size; i++)
      body.get(i).interior[indent]

    formatStatementList(method.statements, document)
  }

  def dispatch void format(MethodParameter parameter, extension IFormattableDocument document) {
    parameter.regionFor.keyword(':').surround[noSpace]
  }

  def dispatch void format(PatternStatement stmnt, extension IFormattableDocument document) {
    stmnt.patternReference.format(document)
    for (comma : stmnt.regionFor.keywords(COMMA))
      comma.append[oneSpace]
    stmnt.regionFor.keyword(')')

    stmnt.parameters.forEach[it.format(document)]
  }

  def dispatch void format(Condition stmnt, extension IFormattableDocument document) {
    stmnt.patternReference.format(document)
    for (comma : stmnt.regionFor.keywords(COMMA))
      comma.append[oneSpace]
    stmnt.regionFor.keyword(')').append[noSpace]
    stmnt.parameters.forEach[it.format(document)]
  }

  def dispatch void format(PatternReference stmnt, extension IFormattableDocument document) {
    stmnt.append[noSpace]
  }
  
  def dispatch void format(CalledPatternParameter stmnt, extension IFormattableDocument document) {
    stmnt.regionFor.keyword('=').surround[noSpace]
  }

  def dispatch void format(ConditionStatement stmnt, extension IFormattableDocument document) {
    stmnt.regionFor.keyword(')').append[oneSpace]
    stmnt.regionFor.keyword('if').append[oneSpace]
    stmnt.regionFor.keyword('while').append[oneSpace]
    stmnt.regionFor.keyword('do').append[oneSpace]
    stmnt.regionFor.keyword(BRACE_LEFT).append[newLine]
    stmnt.regionFor.keyword(BRACE_RIGHT).prepend[newLine]

    val body = stmnt.regionFor.keywordPairs(BRACE_LEFT, BRACE_RIGHT)
    for (var i = 0; i < body.size; i++)
      body.get(i).interior[indent]

    stmnt.cond.format(document)
    formatStatementList(stmnt.thenStatements, document)
    formatStatementList(stmnt.elseStatements, document)
  }

  def dispatch void format(LoopStatement loopStatement, extension IFormattableDocument document) {
    loopStatement.regionFor.keyword('for').append[oneSpace]
    loopStatement.regionFor.keyword(BRACE_LEFT).append[newLine]
    loopStatement.regionFor.keyword(BRACE_RIGHT).prepend[newLine]

    val body = loopStatement.regionFor.keywordPairs(BRACE_LEFT, BRACE_RIGHT)
    for (var i = 0; i < body.size; i++)
      body.get(i).interior[indent]

    formatStatementList(loopStatement.loopStatements, document)
  }

  def dispatch void format(ObjectVariableStatement stmnt, extension IFormattableDocument document) {
    stmnt.regionFor.keyword(':').surround[oneSpace]
  }

  def dispatch void format(OperationCallStatement stmnt, extension IFormattableDocument document) {
    stmnt.regionFor.keyword('.').surround[noSpace]
    stmnt.regionFor.keyword('(').surround[noSpace]
    stmnt.regionFor.keyword(')').surround[noSpace]
    stmnt.regionFor.keyword(',').append[oneSpace]
  }

  def dispatch void format(ReturnStatement stmnt, extension IFormattableDocument document) {
    stmnt.regionFor.keyword('return').append[oneSpace]
  }

  /**
   * Invokes #formatList for Statements
   */
  def formatStatementList(List<? extends Statement> statements, IFormattableDocument document) {
    formatList(statements, document, 1, 1, 1)
  }

  /**
   * Formats a list.
   */
  private static def formatList(List<? extends EObject> items, extension IFormattableDocument document,
    int newLinesBeforeFirst, int newLinesAfterItem, int newLinesAfterLastItem) {
    if (items.size() == 0) {
      return;
    }

    if (newLinesBeforeFirst > 0) {
      items.get(0).prepend[newLines = newLinesBeforeFirst]
    }

    for (var index = 0; index < items.size() - 1; index++) {
      items.get(index).format.append[newLines = newLinesAfterItem]
    }

    items.get(items.size() - 1).format.append[newLines = newLinesAfterLastItem]
  }
}
