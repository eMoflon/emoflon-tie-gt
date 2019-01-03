# emoflon-tie-gt

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7566bf29bf0546a6a75c52be30b85c79)](https://www.codacy.com/app/RolandKluge/emoflon-tie-gt?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=eMoflon/emoflon-tie-gt&amp;utm_campaign=Badge_Grade)
[![codebeat badge](https://codebeat.co/badges/5d38ead2-f38e-472c-99b5-9f7408970d8e)](https://codebeat.co/projects/github-com-emoflon-emoflon-tie-gt-master)
[![Project Stats](https://www.openhub.net/p/emoflon-tie-gt/widgets/project_thin_badge.gif)](https://www.openhub.net/p/emoflon-tie-gt)
[![Run Status](https://api.shippable.com/projects/5b0413d69f890e0700fdeb2e/badge?branch=master)]()

eMoflon Tool Integration Environment with Unidirectional Graph Transformation

## Prerequisites
- Xtext Complete SDK
   * Update site: http://download.eclipse.org/modeling/tmf/xtext/updates/releases/
- eMoflon::Core
   * Update site: https://emoflon.org/emoflon-core-updatesite/stable/updatesite/
- StringTemplate 
   * Update site: http://gervarro.org/external/
- Democles 0.4.0
   * Update site: http://gervarro.org/democles/integration-0.4.0/
   * Install
      * Pattern Matcher Specification
      * Pattern Matcher Compiler
   
## Setup of eMoflon::TIE-GT Developer Workspace
1. Install the following team project set (via *Import &rarr; Team Project Set*) https://raw.githubusercontent.com/eMoflon/emoflon-tie-gt/master/developerWorkspace.psf
1. Run MWE2 workflows (Search for files ending with *.mwe2* via *Ctrl+Shift+R*).
   * Proceed even if Eclipse warns you about "Errors in the Workspace"
1. The subsequent build should complete without errors.

## Run the test suite 
1. Start Runtime Eclipse
1. Check out all projects from *https://github.com/eMoflon/emoflon-tie-gt-examples*
1. Run JUnit test suite *EMoflonTieGtTestSuite*
   * Runner class *org.moflon.tie.gt.testsuite.EMoflonTieGtTestSuite*
   
   
