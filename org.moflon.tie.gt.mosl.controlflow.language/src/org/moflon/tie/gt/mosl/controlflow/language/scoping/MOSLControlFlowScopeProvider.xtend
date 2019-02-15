/*
 * generated by Xtext 2.11.0
 */
package org.moflon.tie.gt.mosl.controlflow.language.scoping

import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.emoflon.ibex.gt.editor.gT.EditorGTFile
import org.emoflon.ibex.gt.editor.gT.EditorParameterOrNode
import org.emoflon.ibex.gt.editor.gT.EditorPattern
import org.moflon.core.utilities.eMoflonEMFUtil
import org.moflon.core.xtext.exceptions.CannotFindScopeException
import org.moflon.core.xtext.scoping.MoflonSimpleScope
import org.moflon.core.xtext.utils.ResourceUtil
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameter
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledPatternParameterName
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ConditionStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.EClassDef
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.EnumExpression
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.LoopStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodDec
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MoslControlFlowFactory
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MoslControlFlowPackage
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableAttributeExpression
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternReference
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ReturnStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Statement
import org.moflon.tie.gt.mosl.controlflow.language.utils.MOSLGTControlFlowUtil

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MOSLControlFlowScopeProvider extends AbstractMOSLControlFlowScopeProvider {
  var resolvingCache = new HashMap<GraphTransformationControlFlowFile, List<EditorGTFile>>();

  val log = Logger.getLogger(MOSLControlFlowScopeProvider.getClass());

  override getScope(EObject context, EReference reference) {
    MOSLGTControlFlowUtil.resolvePatterns(context, resolvingCache, context.eResource.resourceSet)
    try {
      if (searchForEClass(context, reference))
        return getScopeByType(context, EClass)
      if (searchForEClassifier(context, reference))
        return getScopeByType(context, EClassifier)
      if (searchForPattern(context))
        return MOSLGTControlFlowUtil.getScopeByPattern(context, reference, resolvingCache)
      if (searchForPatternParameter(context, reference))
        return getScopeByPatternParameter(context as PatternStatement, reference)
      if (searchForCalledPatternParameter(context, reference))
        return getScopeForCalledPatternParameter(context as CalledPatternParameter, reference)
      if (searchForTypedElement(context, reference))
        return getScopeByTypedElement(context, reference)
      if (isEnumExpression(context, reference))
        return getScopeForEnumLiterals(context as EnumExpression)
      if (isObjectVariableAttributeExpression(context, reference))
        return getScopeForbjectVariableAttributeExpression(context as ObjectVariableAttributeExpression)
      if (isOperationCallStatement(context, reference))
        return getScopeForOperationCallStatement(context as OperationCallStatement, reference)
      if (searchForReturnObject(context, reference))
        return getScopeForReturnObject(context as ReturnStatement, reference)

    } catch (CannotFindScopeException e) {
      log.error(String.format("Cannot find Scope for context %s and reference %s", context, reference), e)
    }

    super.getScope(context, reference);
  }
  
  def isOperationCallStatement(EObject object, EReference reference) {
    return object instanceof OperationCallStatement &&
      reference == MoslControlFlowPackage.Literals.OPERATION_CALL_STATEMENT__CALL;
  }

  def getScopeForOperationCallStatement(OperationCallStatement statement, EReference reference) {
    val objectVariable = statement.object
    if (objectVariable instanceof ObjectVariableStatement) {
      val type = objectVariable.EType
      if (type instanceof EClass) {
        return Scopes.scopeFor(type.EOperations)
      }
    }
    return Scopes.scopeFor([])
  }

  def isObjectVariableAttributeExpression(EObject object, EReference reference) {
    return object instanceof ObjectVariableAttributeExpression &&
      reference == MoslControlFlowPackage.Literals.OBJECT_VARIABLE_ATTRIBUTE_EXPRESSION__ATTRIBUTE;
  }

  def getScopeForbjectVariableAttributeExpression(ObjectVariableAttributeExpression expression) {
    val type = expression.variable.EType
    if (type instanceof EClass) {
      return Scopes.scopeFor(type.EAllAttributes);
    } else {
      return Scopes.scopeFor([]);
    }
  }

  def boolean searchForPatternParameter(EObject context, EReference reference) {
    return context instanceof PatternStatement &&
      reference == MoslControlFlowPackage.Literals.PATTERN_STATEMENT__PARAMETERS;
  }

  def boolean searchForTypedElement(EObject context, EReference reference) {
    return context instanceof CalledPatternParameter &&
      reference == MoslControlFlowPackage.Literals.CALLED_PATTERN_PARAMETER__PARAMETER;
  }

  def IScope getScopeByTypedElement(EObject context, EReference reference) {
    val candidates = new ArrayList()
    var candidate = context.eContainer;
    while (!(candidate instanceof MethodDec)) {
      if (candidate instanceof ObjectVariableStatement) {
        candidates.add(candidate as EObject)
      }
      candidate = candidate.eContainer;
    }
    val methodDec = candidate as MethodDec
    methodDec.EParameters.forEach[candidates.add(it as EObject)]
    return Scopes.scopeFor(candidates)
  }

  def IScope getScopeByPatternParameter(PatternStatement patternStmt, EReference reference) {
    val patternRef = patternStmt.patternReference
    val pattern = patternRef.pattern
    val patternList = <EditorPattern>newArrayList
    patternList.add(pattern)

    val targets = <EditorParameterOrNode>newArrayList
    targets.addAll(pattern.nodes)
    targets.addAll(pattern.parameters)
    val names = targets.map(target|createCalledPatternParameterName(target, patternStmt))
    return Scopes.scopeFor(names)
  }

  def CalledPatternParameterName createCalledPatternParameterName(EditorParameterOrNode target,
    PatternStatement statement) {
    val parameterName = MoslControlFlowFactory.eINSTANCE.createCalledPatternParameterName();
    parameterName.name = target.name
    statement.eResource.contents.add(parameterName)
    return parameterName
  }

  def boolean searchForCalledPatternParameter(EObject context, EReference reference) {
    return context instanceof CalledPatternParameter &&
      reference == MoslControlFlowPackage.eINSTANCE.calledPatternParameter_Object;
  }

  def getScopeForCalledPatternParameter(CalledPatternParameter parameter, EReference reference) {
    Scopes.scopeFor(collectObjectVariablesInAllParentScopes(parameter))
  }
  
  def collectObjectVariables(EList<Statement> statements) {
    return statements.filter[it instanceof ObjectVariableStatement].toList
  }

  def boolean searchForPattern(EObject context) {
    return context instanceof PatternReference
  }

  def getScopeByType(EObject context, Class<? extends EObject> type) throws CannotFindScopeException{
    val set = context.eResource.resourceSet
    eMoflonEMFUtil.createPluginToResourceMapping(set);
    var gtf = ResourceUtil.getRootObject(context, GraphTransformationControlFlowFile)
    var uris = gtf.imports.map[importValue|URI.createURI(importValue.name)];
    return createScope(uris, EPackage, type, set);
  }

  def isEnumExpression(EObject context, EReference reference) {
    return (context instanceof EnumExpression && reference == MoslControlFlowPackage.Literals.ENUM_EXPRESSION__LITERAL)
  }

  /**
   * The scope for EnumExpression's is derived from the return value of the method declaration.
   */
  def getScopeForEnumLiterals(EnumExpression enumExpression) {
    if (enumExpression.eContainer instanceof ReturnStatement) {
      val returnStatement = enumExpression.eContainer as ReturnStatement
      var container = returnStatement.eContainer
      while (!(container instanceof MethodDec)) {
        container = container.eContainer
      }

      val methodDeclaration = container as MethodDec
      val type = methodDeclaration.EType
      if (type instanceof EEnum) {
        return Scopes.scopeFor(type.ELiterals)
      }
    }
    return Scopes.scopeFor([])
  }

  def boolean searchForEClass(EObject context, EReference reference) {
    return context instanceof EClassDef
  }

  def boolean searchForEClassifier(EObject context, EReference reference) {
    return context instanceof MethodDec || context instanceof ObjectVariableStatement ||
      (context instanceof EParameter && reference.name.equals("eType"))
  }
  
  def searchForReturnObject(EObject object, EReference reference) {
    return object instanceof ReturnStatement && reference == MoslControlFlowPackage.eINSTANCE.returnStatement_Obj
  }
  
  def getScopeForReturnObject(ReturnStatement object, EReference reference) {
    Scopes.scopeFor(collectObjectVariablesInAllParentScopes(object))
  }
  

  def EObject getScopingObject(URI uri, Class<? extends EObject> clazz, ResourceSet resourceSet) throws IOException{

    var res = resourceSet.getResource(uri, false);
    if (res === null) {
      res = resourceSet.createResource(uri);
    }
    res.load(Collections.EMPTY_MAP);
    var scopingRoot = clazz.cast(res.getContents().get(0));
    return scopingRoot;
  }

  def IScope createScope(List<URI> uris, Class<? extends EObject> clazz, Class<? extends EObject> type,
    ResourceSet set) throws CannotFindScopeException{
    return createScope(uris, clazz, type, null, set);
  }

  def <T extends EObject> IScope createScope(List<URI> uris, Class<? extends EObject> clazz, Class<T> type,
    List<T> currentFound, ResourceSet set) throws CannotFindScopeException{
    try {
      var candidates = newArrayList;

      for (URI uri : uris) {
        var scopingObject = getScopingObject(uri, clazz, set);
        candidates.addAll(EcoreUtil2.eAllOfType(scopingObject, type));
      }
      if (currentFound !== null) {
        candidates.addAll(currentFound);
      }
      return new MoflonSimpleScope(candidates);
    } catch (Exception e) {
      throw new CannotFindScopeException("Cannot find Resource");
    }
  }
  
  private def List<? extends EObject> collectObjectVariablesInAllParentScopes(EObject parameter) {
    var EObject currentContainer = parameter
    var EObject previousContainer = parameter
    val variablesList = newArrayList
    do {
      if (currentContainer instanceof MethodDec) {
        variablesList.addAll(collectObjectVariables(currentContainer.statements))
        variablesList.addAll(currentContainer.EParameters)
      }
      if (currentContainer instanceof LoopStatement)
        variablesList.addAll(collectObjectVariables(currentContainer.loopStatements))
      if (currentContainer instanceof ConditionStatement) {
        if (currentContainer.thenStatements.contains(previousContainer))
          variablesList.addAll(collectObjectVariables(currentContainer.thenStatements))
        else
          variablesList.addAll(collectObjectVariables(currentContainer.elseStatements))
      }
    
      previousContainer = currentContainer
      currentContainer = currentContainer.eContainer
    } while (!(currentContainer instanceof EClassDef))
    
    return variablesList
  }
  
}
