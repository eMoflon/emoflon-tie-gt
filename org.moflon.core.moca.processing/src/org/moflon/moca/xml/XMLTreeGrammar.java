// $ANTLR 3.5.2 C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g 2018-08-09 17:33:53
 
  package org.moflon.moca.xml; 
  import MocaTree.Attribute;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class XMLTreeGrammar extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIBUTE", "ID", "STRING", "TAG", 
		"TEXT"
	};
	public static final int EOF=-1;
	public static final int ATTRIBUTE=4;
	public static final int ID=5;
	public static final int STRING=6;
	public static final int TAG=7;
	public static final int TEXT=8;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XMLTreeGrammar(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XMLTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("XMLTreeGrammarTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return XMLTreeGrammar.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g"; }


		public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)	throws RecognitionException  {
			try {
	        		return super.recoverFromMismatchedToken(input, ttype, follow);
	            } catch(java.util.NoSuchElementException e){
	                throw new IllegalArgumentException("Your tree does not comply with your tree grammar!\n"
	                		+ " Problems encountered at: [" + "..." + getTreeNodeStream().LT(-1) + " " 
	                		+ getTreeNodeStream().LT(1) + "..." + "] in tree.");
			}
	    }


	public static class prog_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "prog"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:37:1: prog : emftree EOF -> {$emftree.st};
	public final XMLTreeGrammar.prog_return prog() throws RecognitionException {
		XMLTreeGrammar.prog_return retval = new XMLTreeGrammar.prog_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope emftree1 =null;

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:38:3: ( emftree EOF -> {$emftree.st})
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:39:5: emftree EOF
			{
			pushFollow(FOLLOW_emftree_in_prog101);
			emftree1=emftree();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_prog103); 
			// TEMPLATE REWRITE
			// 40:7: -> {$emftree.st}
			{
				retval.st = (emftree1!=null?((StringTemplate)emftree1.getTemplate()):null);
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class emftree_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "emftree"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:43:1: emftree : ( ^( TEXT content= STRING ) -> text(content=$content)| ^(label= STRING (attributes+= attribute )* (children+= emftree )* ) -> node(label=$labelchildren=$childrenattributes=$attributes));
	public final XMLTreeGrammar.emftree_return emftree() throws RecognitionException {
		XMLTreeGrammar.emftree_return retval = new XMLTreeGrammar.emftree_return();
		retval.start = input.LT(1);

		CommonTree content=null;
		CommonTree label=null;
		List<Object> list_attributes=null;
		List<Object> list_children=null;
		RuleReturnScope attributes = null;
		RuleReturnScope children = null;
		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:44:3: ( ^( TEXT content= STRING ) -> text(content=$content)| ^(label= STRING (attributes+= attribute )* (children+= emftree )* ) -> node(label=$labelchildren=$childrenattributes=$attributes))
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TEXT) ) {
				alt3=1;
			}
			else if ( (LA3_0==STRING) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:45:5: ^( TEXT content= STRING )
					{
					match(input,TEXT,FOLLOW_TEXT_in_emftree133); 
					match(input, Token.DOWN, null); 
					content=(CommonTree)match(input,STRING,FOLLOW_STRING_in_emftree137); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 46:7: -> text(content=$content)
					{
						retval.st = templateLib.getInstanceOf("text",new STAttrMap().put("content", content));
					}



					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:47:5: ^(label= STRING (attributes+= attribute )* (children+= emftree )* )
					{
					label=(CommonTree)match(input,STRING,FOLLOW_STRING_in_emftree164); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:47:30: (attributes+= attribute )*
						loop1:
						while (true) {
							int alt1=2;
							int LA1_0 = input.LA(1);
							if ( (LA1_0==ATTRIBUTE) ) {
								alt1=1;
							}

							switch (alt1) {
							case 1 :
								// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:47:30: attributes+= attribute
								{
								pushFollow(FOLLOW_attribute_in_emftree168);
								attributes=attribute();
								state._fsp--;

								if (list_attributes==null) list_attributes=new ArrayList<Object>();
								list_attributes.add(attributes.getTemplate());
								}
								break;

							default :
								break loop1;
							}
						}

						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:47:51: (children+= emftree )*
						loop2:
						while (true) {
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==STRING||LA2_0==TEXT) ) {
								alt2=1;
							}

							switch (alt2) {
							case 1 :
								// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:47:51: children+= emftree
								{
								pushFollow(FOLLOW_emftree_in_emftree173);
								children=emftree();
								state._fsp--;

								if (list_children==null) list_children=new ArrayList<Object>();
								list_children.add(children.getTemplate());
								}
								break;

							default :
								break loop2;
							}
						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 48:7: -> node(label=$labelchildren=$childrenattributes=$attributes)
					{
						retval.st = templateLib.getInstanceOf("node",new STAttrMap().put("label", label).put("children", list_children).put("attributes", list_attributes));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "emftree"


	public static class attribute_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "attribute"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:51:1: attribute : ^( ATTRIBUTE name= ID value= STRING ) -> attribute(name=$namevalue=$value);
	public final XMLTreeGrammar.attribute_return attribute() throws RecognitionException {
		XMLTreeGrammar.attribute_return retval = new XMLTreeGrammar.attribute_return();
		retval.start = input.LT(1);

		CommonTree name=null;
		CommonTree value=null;

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:52:3: ( ^( ATTRIBUTE name= ID value= STRING ) -> attribute(name=$namevalue=$value))
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.core.moca.processing\\src\\org\\moflon\\moca\\xml\\XMLTreeGrammar.g:53:5: ^( ATTRIBUTE name= ID value= STRING )
			{
			match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute224); 
			match(input, Token.DOWN, null); 
			name=(CommonTree)match(input,ID,FOLLOW_ID_in_attribute228); 
			value=(CommonTree)match(input,STRING,FOLLOW_STRING_in_attribute232); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 54:7: -> attribute(name=$namevalue=$value)
			{
				retval.st = templateLib.getInstanceOf("attribute",new STAttrMap().put("name", name).put("value", value));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attribute"

	// Delegated rules



	public static final BitSet FOLLOW_emftree_in_prog101 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_emftree133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_emftree137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STRING_in_emftree164 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_attribute_in_emftree168 = new BitSet(new long[]{0x0000000000000158L});
	public static final BitSet FOLLOW_emftree_in_emftree173 = new BitSet(new long[]{0x0000000000000148L});
	public static final BitSet FOLLOW_ATTRIBUTE_in_attribute224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_attribute228 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STRING_in_attribute232 = new BitSet(new long[]{0x0000000000000008L});
}
