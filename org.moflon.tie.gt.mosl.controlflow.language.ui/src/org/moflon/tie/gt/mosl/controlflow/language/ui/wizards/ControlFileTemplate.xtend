package org.moflon.tie.gt.mosl.controlflow.language.ui.wizards

import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.moflon.tie.gt.mosl.ide.ui.wizards.WizardFileTemplate

class ControlFileTemplate extends WizardFileTemplate {

  override setContent(IFile file) {
    val project = file.project
    val path = file.location.makeRelativeTo(project.location).removeFileExtension
    val packageName = convertPathToPackageNotation(path)
    val content = createTemplate(packageName)
    save(file, content)
  }

  def convertPathToPackageNotation(IPath path){
    val pathString = path.toString
    pathString.replaceAll("/", "\\.")
  }

  def String createImportText(){

    '''
    «FOR epackage : epackageImports»
      import "«epackage.nsURI»"
    «ENDFOR»
    '''
  }

  def String createTemplate(String packageName){
    '''
    /*
    * import section
    *
    * For imports from plugins use:
    * import "platform:/plugin/something/ecoreFile.ecore"
    *
    *
    * For imports in your current eclipse runtime use:
    * import "platform:/resource/something/ecoreFile.ecore"
    */
    «createImportText»

    /*
    * For every defined pattern file you want to use:
    * using "platform:/.../patternFile.gt"
    */

    package «packageName»

    // EClass declaration
    '''
  }
}