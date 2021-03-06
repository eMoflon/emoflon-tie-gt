package org.moflon.tie.gt.mosl.controlflow.language.ui.quickfix

import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodDec
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MoslControlFlowFactory
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.EClassDef

class ControlFlowObjectVariableQuickfixes {
	
	static def createThisObjectVariable(Issue issue,IssueResolutionAcceptor acceptor){
		val label = '''Create this ObjectVariable.'''
		acceptor.accept(issue,label,label,null,[element,context|
			if(element instanceof MethodDec){
				val operation=element as MethodDec
				var newObjectVariableStatement= MoslControlFlowFactory.eINSTANCE.createObjectVariableStatement
				newObjectVariableStatement.name="this"
				operation.statements.add(0, newObjectVariableStatement)
				newObjectVariableStatement.EType=(operation.eContainer as EClassDef).name
			}
		])
	}
}