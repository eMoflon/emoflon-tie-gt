// $ANTLR 3.5.2 C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g 2018-08-09 17:33:58

package org.moflon.moca.literalExpression.parser; 
import java.util.Collection;
import org.moflon.core.moca.processing.ProcessingFactory;
import org.moflon.core.moca.processing.Problem;
import org.moflon.core.moca.processing.ProblemType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LiteralExpressionParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITAL_ID", "CAPITAL_LETTER", 
		"COLON", "DIGIT", "DOT", "ENUM_LITERAL", "FALSE", "FLOAT_SUFFIX_LARGE", 
		"FLOAT_SUFFIX_SMALL", "ID", "LETTER", "LPAR", "NULL", "OP", "PNUMBER", 
		"QUOTE", "RPAR", "SLASH", "SMALL_ID", "SMALL_LETTER", "STRING", "TRUE", 
		"UNDERSCORE", "WS", "CONSTANT", "ENUMLITERAL", "FIELD", "LITERAL", "NUMBER", 
		"OPERATION"
	};
	public static final int EOF=-1;
	public static final int CAPITAL_ID=4;
	public static final int CAPITAL_LETTER=5;
	public static final int COLON=6;
	public static final int DIGIT=7;
	public static final int DOT=8;
	public static final int ENUM_LITERAL=9;
	public static final int FALSE=10;
	public static final int FLOAT_SUFFIX_LARGE=11;
	public static final int FLOAT_SUFFIX_SMALL=12;
	public static final int ID=13;
	public static final int LETTER=14;
	public static final int LPAR=15;
	public static final int NULL=16;
	public static final int OP=17;
	public static final int PNUMBER=18;
	public static final int QUOTE=19;
	public static final int RPAR=20;
	public static final int SLASH=21;
	public static final int SMALL_ID=22;
	public static final int SMALL_LETTER=23;
	public static final int STRING=24;
	public static final int TRUE=25;
	public static final int UNDERSCORE=26;
	public static final int WS=27;
	public static final int CONSTANT=28;
	public static final int ENUMLITERAL=29;
	public static final int FIELD=30;
	public static final int LITERAL=31;
	public static final int NUMBER=32;
	public static final int OPERATION=33;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LiteralExpressionParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LiteralExpressionParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LiteralExpressionParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g"; }


	  public Collection<Problem> problems = new ArrayList<Problem>();

	      public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	          Problem problem = ProcessingFactory.eINSTANCE.createProblem();
	          int line  = e.line;
	          int charPos = e.charPositionInLine;
	          int tokenLenght = 1;
	          Token token = e.token;
	          if(token != null) 
	            tokenLenght = token.getText().length();
	                  
	          
	          problem.setType(ProblemType.ERROR);
	          problem.setLine(line); 
	          problem.setCharacterPositionStart(charPos); 
	          problem.setCharacterPositionEnd(charPos+tokenLenght);
	          problem.setMessage("Parser: " + getErrorMessage(e, tokenNames));
	          
	          problems.add(problem);
	          super.displayRecognitionError(tokenNames, e);
	    }


	public static class main_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:1: main : (ex1= operatorExpression ( OP ex2+= operatorExpression )+ -> ^( OPERATION ^( OP $ex1 ( $ex2)+ ) ) |ex3= expression -> $ex3);
	public final LiteralExpressionParser.main_return main() throws RecognitionException {
		LiteralExpressionParser.main_return retval = new LiteralExpressionParser.main_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OP1=null;
		List<Object> list_ex2=null;
		ParserRuleReturnScope ex1 =null;
		ParserRuleReturnScope ex3 =null;
		RuleReturnScope ex2 = null;
		Object OP1_tree=null;
		RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_operatorExpression=new RewriteRuleSubtreeStream(adaptor,"rule operatorExpression");

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:5: (ex1= operatorExpression ( OP ex2+= operatorExpression )+ -> ^( OPERATION ^( OP $ex1 ( $ex2)+ ) ) |ex3= expression -> $ex3)
			int alt2=2;
			switch ( input.LA(1) ) {
			case SMALL_ID:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOT) ) {
					int LA2_8 = input.LA(3);
					if ( (LA2_8==SMALL_ID) ) {
						switch ( input.LA(4) ) {
						case LPAR:
							{
							int LA2_11 = input.LA(5);
							if ( (LA2_11==RPAR) ) {
								int LA2_12 = input.LA(6);
								if ( (LA2_12==OP) ) {
									alt2=1;
								}
								else if ( (LA2_12==EOF) ) {
									alt2=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case OP:
							{
							alt2=1;
							}
							break;
						case EOF:
							{
							alt2=2;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==OP) ) {
					alt2=1;
				}
				else if ( (LA2_2==EOF) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PNUMBER:
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3==OP) ) {
					alt2=1;
				}
				else if ( (LA2_3==EOF) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL:
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4==OP) ) {
					alt2=1;
				}
				else if ( (LA2_4==EOF) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TRUE:
				{
				int LA2_5 = input.LA(2);
				if ( (LA2_5==OP) ) {
					alt2=1;
				}
				else if ( (LA2_5==EOF) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==OP) ) {
					alt2=1;
				}
				else if ( (LA2_6==EOF) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CAPITAL_ID:
			case ENUM_LITERAL:
				{
				alt2=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:7: ex1= operatorExpression ( OP ex2+= operatorExpression )+
					{
					pushFollow(FOLLOW_operatorExpression_in_main84);
					ex1=operatorExpression();
					state._fsp--;

					stream_operatorExpression.add(ex1.getTree());
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:30: ( OP ex2+= operatorExpression )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==OP) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:31: OP ex2+= operatorExpression
							{
							OP1=(Token)match(input,OP,FOLLOW_OP_in_main87);  
							stream_OP.add(OP1);

							pushFollow(FOLLOW_operatorExpression_in_main91);
							ex2=operatorExpression();
							state._fsp--;

							stream_operatorExpression.add(ex2.getTree());
							if (list_ex2==null) list_ex2=new ArrayList<Object>();
							list_ex2.add(ex2.getTree());
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					// AST REWRITE
					// elements: ex1, OP, ex2
					// token labels: 
					// rule labels: retval, ex1
					// token list labels: 
					// rule list labels: ex2
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.getTree():null);
					RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"token ex2",list_ex2);
					root_0 = (Object)adaptor.nil();
					// 55:60: -> ^( OPERATION ^( OP $ex1 ( $ex2)+ ) )
					{
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:63: ^( OPERATION ^( OP $ex1 ( $ex2)+ ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATION, "OPERATION"), root_1);
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:75: ^( OP $ex1 ( $ex2)+ )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot(stream_OP.nextNode(), root_2);
						adaptor.addChild(root_2, stream_ex1.nextTree());
						if ( !(stream_ex2.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_ex2.hasNext() ) {
							adaptor.addChild(root_2, stream_ex2.nextTree());
						}
						stream_ex2.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:55:95: ex3= expression
					{
					pushFollow(FOLLOW_expression_in_main116);
					ex3=expression();
					state._fsp--;

					stream_expression.add(ex3.getTree());
					// AST REWRITE
					// elements: ex3
					// token labels: 
					// rule labels: ex3, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_ex3=new RewriteRuleSubtreeStream(adaptor,"rule ex3",ex3!=null?ex3.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 55:110: -> $ex3
					{
						adaptor.addChild(root_0, stream_ex3.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:57:1: expression : (enumliteral= enumLiteral -> $enumliteral|op= operatorExpression -> $op);
	public final LiteralExpressionParser.expression_return expression() throws RecognitionException {
		LiteralExpressionParser.expression_return retval = new LiteralExpressionParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope enumliteral =null;
		ParserRuleReturnScope op =null;

		RewriteRuleSubtreeStream stream_operatorExpression=new RewriteRuleSubtreeStream(adaptor,"rule operatorExpression");
		RewriteRuleSubtreeStream stream_enumLiteral=new RewriteRuleSubtreeStream(adaptor,"rule enumLiteral");

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:57:11: (enumliteral= enumLiteral -> $enumliteral|op= operatorExpression -> $op)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CAPITAL_ID||LA3_0==ENUM_LITERAL) ) {
				alt3=1;
			}
			else if ( (LA3_0==FALSE||LA3_0==NULL||LA3_0==PNUMBER||LA3_0==SMALL_ID||(LA3_0 >= STRING && LA3_0 <= TRUE)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:58:2: enumliteral= enumLiteral
					{
					pushFollow(FOLLOW_enumLiteral_in_expression133);
					enumliteral=enumLiteral();
					state._fsp--;

					stream_enumLiteral.add(enumliteral.getTree());
					// AST REWRITE
					// elements: enumliteral
					// token labels: 
					// rule labels: enumliteral, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_enumliteral=new RewriteRuleSubtreeStream(adaptor,"rule enumliteral",enumliteral!=null?enumliteral.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:26: -> $enumliteral
					{
						adaptor.addChild(root_0, stream_enumliteral.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:59:2: op= operatorExpression
					{
					pushFollow(FOLLOW_operatorExpression_in_expression145);
					op=operatorExpression();
					state._fsp--;

					stream_operatorExpression.add(op.getTree());
					// AST REWRITE
					// elements: op
					// token labels: 
					// rule labels: op, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op",op!=null?op.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 59:24: -> $op
					{
						adaptor.addChild(root_0, stream_op.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class operatorExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operatorExpression"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:61:1: operatorExpression : (attrcall= attrCall -> $attrcall|string= STRING -> ^( LITERAL $string) |number= PNUMBER -> ^( NUMBER $number) |constant= ( NULL | TRUE | FALSE ) -> ^( CONSTANT $constant) );
	public final LiteralExpressionParser.operatorExpression_return operatorExpression() throws RecognitionException {
		LiteralExpressionParser.operatorExpression_return retval = new LiteralExpressionParser.operatorExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string=null;
		Token number=null;
		Token constant=null;
		ParserRuleReturnScope attrcall =null;

		Object string_tree=null;
		Object number_tree=null;
		Object constant_tree=null;
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_PNUMBER=new RewriteRuleTokenStream(adaptor,"token PNUMBER");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
		RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
		RewriteRuleSubtreeStream stream_attrCall=new RewriteRuleSubtreeStream(adaptor,"rule attrCall");

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:61:19: (attrcall= attrCall -> $attrcall|string= STRING -> ^( LITERAL $string) |number= PNUMBER -> ^( NUMBER $number) |constant= ( NULL | TRUE | FALSE ) -> ^( CONSTANT $constant) )
			int alt5=4;
			switch ( input.LA(1) ) {
			case SMALL_ID:
				{
				alt5=1;
				}
				break;
			case STRING:
				{
				alt5=2;
				}
				break;
			case PNUMBER:
				{
				alt5=3;
				}
				break;
			case FALSE:
			case NULL:
			case TRUE:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:62:2: attrcall= attrCall
					{
					pushFollow(FOLLOW_attrCall_in_operatorExpression162);
					attrcall=attrCall();
					state._fsp--;

					stream_attrCall.add(attrcall.getTree());
					// AST REWRITE
					// elements: attrcall
					// token labels: 
					// rule labels: attrcall, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_attrcall=new RewriteRuleSubtreeStream(adaptor,"rule attrcall",attrcall!=null?attrcall.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 62:19: -> $attrcall
					{
						adaptor.addChild(root_0, stream_attrcall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:64:2: string= STRING
					{
					string=(Token)match(input,STRING,FOLLOW_STRING_in_operatorExpression174);  
					stream_STRING.add(string);

					 string.setText((string!=null?string.getText():null).substring(1,(string!=null?string.getText():null).length() - 1)); 
					// AST REWRITE
					// elements: string
					// token labels: string
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_string=new RewriteRuleTokenStream(adaptor,"token string",string);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 64:90: -> ^( LITERAL $string)
					{
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:64:92: ^( LITERAL $string)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);
						adaptor.addChild(root_1, stream_string.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:65:2: number= PNUMBER
					{
					number=(Token)match(input,PNUMBER,FOLLOW_PNUMBER_in_operatorExpression191);  
					stream_PNUMBER.add(number);

					// AST REWRITE
					// elements: number
					// token labels: number
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_number=new RewriteRuleTokenStream(adaptor,"token number",number);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:17: -> ^( NUMBER $number)
					{
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:65:20: ^( NUMBER $number)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUMBER, "NUMBER"), root_1);
						adaptor.addChild(root_1, stream_number.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:66:2: constant= ( NULL | TRUE | FALSE )
					{
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:66:11: ( NULL | TRUE | FALSE )
					int alt4=3;
					switch ( input.LA(1) ) {
					case NULL:
						{
						alt4=1;
						}
						break;
					case TRUE:
						{
						alt4=2;
						}
						break;
					case FALSE:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:66:12: NULL
							{
							constant=(Token)match(input,NULL,FOLLOW_NULL_in_operatorExpression208);  
							stream_NULL.add(constant);

							}
							break;
						case 2 :
							// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:66:19: TRUE
							{
							constant=(Token)match(input,TRUE,FOLLOW_TRUE_in_operatorExpression212);  
							stream_TRUE.add(constant);

							}
							break;
						case 3 :
							// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:66:26: FALSE
							{
							constant=(Token)match(input,FALSE,FOLLOW_FALSE_in_operatorExpression216);  
							stream_FALSE.add(constant);

							}
							break;

					}

					// AST REWRITE
					// elements: constant
					// token labels: constant
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_constant=new RewriteRuleTokenStream(adaptor,"token constant",constant);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 66:33: -> ^( CONSTANT $constant)
					{
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:66:35: ^( CONSTANT $constant)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANT, "CONSTANT"), root_1);
						adaptor.addChild(root_1, stream_constant.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operatorExpression"


	public static class attrCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attrCall"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:70:1: attrCall : var= SMALL_ID DOT name= attrName -> ^( FIELD $var $name) ;
	public final LiteralExpressionParser.attrCall_return attrCall() throws RecognitionException {
		LiteralExpressionParser.attrCall_return retval = new LiteralExpressionParser.attrCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token var=null;
		Token DOT2=null;
		ParserRuleReturnScope name =null;

		Object var_tree=null;
		Object DOT2_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_SMALL_ID=new RewriteRuleTokenStream(adaptor,"token SMALL_ID");
		RewriteRuleSubtreeStream stream_attrName=new RewriteRuleSubtreeStream(adaptor,"rule attrName");

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:70:9: (var= SMALL_ID DOT name= attrName -> ^( FIELD $var $name) )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:71:2: var= SMALL_ID DOT name= attrName
			{
			var=(Token)match(input,SMALL_ID,FOLLOW_SMALL_ID_in_attrCall237);  
			stream_SMALL_ID.add(var);

			DOT2=(Token)match(input,DOT,FOLLOW_DOT_in_attrCall239);  
			stream_DOT.add(DOT2);

			pushFollow(FOLLOW_attrName_in_attrCall243);
			name=attrName();
			state._fsp--;

			stream_attrName.add(name.getTree());
			// AST REWRITE
			// elements: name, var
			// token labels: var
			// rule labels: name, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
			RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:33: -> ^( FIELD $var $name)
			{
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:71:36: ^( FIELD $var $name)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);
				adaptor.addChild(root_1, stream_var.nextNode());
				adaptor.addChild(root_1, stream_name.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attrCall"


	public static class attrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attrName"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:73:1: attrName : (name= SMALL_ID -> $name|getter= SMALL_ID LPAR RPAR -> $getter);
	public final LiteralExpressionParser.attrName_return attrName() throws RecognitionException {
		LiteralExpressionParser.attrName_return retval = new LiteralExpressionParser.attrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name=null;
		Token getter=null;
		Token LPAR3=null;
		Token RPAR4=null;

		Object name_tree=null;
		Object getter_tree=null;
		Object LPAR3_tree=null;
		Object RPAR4_tree=null;
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_SMALL_ID=new RewriteRuleTokenStream(adaptor,"token SMALL_ID");

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:73:9: (name= SMALL_ID -> $name|getter= SMALL_ID LPAR RPAR -> $getter)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==SMALL_ID) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==LPAR) ) {
					alt6=2;
				}
				else if ( (LA6_1==EOF||LA6_1==OP) ) {
					alt6=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:74:2: name= SMALL_ID
					{
					name=(Token)match(input,SMALL_ID,FOLLOW_SMALL_ID_in_attrName266);  
					stream_SMALL_ID.add(name);

					// AST REWRITE
					// elements: name
					// token labels: name
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 74:16: -> $name
					{
						adaptor.addChild(root_0, stream_name.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:75:2: getter= SMALL_ID LPAR RPAR
					{
					getter=(Token)match(input,SMALL_ID,FOLLOW_SMALL_ID_in_attrName278);  
					stream_SMALL_ID.add(getter);

					LPAR3=(Token)match(input,LPAR,FOLLOW_LPAR_in_attrName280);  
					stream_LPAR.add(LPAR3);

					RPAR4=(Token)match(input,RPAR,FOLLOW_RPAR_in_attrName282);  
					stream_RPAR.add(RPAR4);

					 getter.setText((getter!=null?getter.getText():null).substring(3, 4).toLowerCase() + (getter!=null?getter.getText():null).substring(4)); 
					// AST REWRITE
					// elements: getter
					// token labels: getter
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_getter=new RewriteRuleTokenStream(adaptor,"token getter",getter);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:121: -> $getter
					{
						adaptor.addChild(root_0, stream_getter.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attrName"


	public static class enumLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enumLiteral"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:77:1: enumLiteral : (en= ENUM_LITERAL -> ^( ENUMLITERAL $en) | CAPITAL_ID DOT capital= internalEnumLiteral -> $capital);
	public final LiteralExpressionParser.enumLiteral_return enumLiteral() throws RecognitionException {
		LiteralExpressionParser.enumLiteral_return retval = new LiteralExpressionParser.enumLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token en=null;
		Token CAPITAL_ID5=null;
		Token DOT6=null;
		ParserRuleReturnScope capital =null;

		Object en_tree=null;
		Object CAPITAL_ID5_tree=null;
		Object DOT6_tree=null;
		RewriteRuleTokenStream stream_ENUM_LITERAL=new RewriteRuleTokenStream(adaptor,"token ENUM_LITERAL");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_CAPITAL_ID=new RewriteRuleTokenStream(adaptor,"token CAPITAL_ID");
		RewriteRuleSubtreeStream stream_internalEnumLiteral=new RewriteRuleSubtreeStream(adaptor,"rule internalEnumLiteral");

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:77:12: (en= ENUM_LITERAL -> ^( ENUMLITERAL $en) | CAPITAL_ID DOT capital= internalEnumLiteral -> $capital)
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ENUM_LITERAL) ) {
				alt7=1;
			}
			else if ( (LA7_0==CAPITAL_ID) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:78:2: en= ENUM_LITERAL
					{
					en=(Token)match(input,ENUM_LITERAL,FOLLOW_ENUM_LITERAL_in_enumLiteral299);  
					stream_ENUM_LITERAL.add(en);

					// AST REWRITE
					// elements: en
					// token labels: en
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_en=new RewriteRuleTokenStream(adaptor,"token en",en);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:18: -> ^( ENUMLITERAL $en)
					{
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:78:21: ^( ENUMLITERAL $en)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENUMLITERAL, "ENUMLITERAL"), root_1);
						adaptor.addChild(root_1, stream_en.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:79:2: CAPITAL_ID DOT capital= internalEnumLiteral
					{
					CAPITAL_ID5=(Token)match(input,CAPITAL_ID,FOLLOW_CAPITAL_ID_in_enumLiteral313);  
					stream_CAPITAL_ID.add(CAPITAL_ID5);

					DOT6=(Token)match(input,DOT,FOLLOW_DOT_in_enumLiteral315);  
					stream_DOT.add(DOT6);

					pushFollow(FOLLOW_internalEnumLiteral_in_enumLiteral319);
					capital=internalEnumLiteral();
					state._fsp--;

					stream_internalEnumLiteral.add(capital.getTree());
					// AST REWRITE
					// elements: capital
					// token labels: 
					// rule labels: capital, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_capital=new RewriteRuleSubtreeStream(adaptor,"rule capital",capital!=null?capital.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 79:45: -> $capital
					{
						adaptor.addChild(root_0, stream_capital.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumLiteral"


	public static class internalEnumLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "internalEnumLiteral"
	// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:81:1: internalEnumLiteral : (en= ENUM_LITERAL -> ^( ENUMLITERAL $en) | SMALL_ID DOT small= internalEnumLiteral -> $small| CAPITAL_ID DOT capital= internalEnumLiteral -> $capital);
	public final LiteralExpressionParser.internalEnumLiteral_return internalEnumLiteral() throws RecognitionException {
		LiteralExpressionParser.internalEnumLiteral_return retval = new LiteralExpressionParser.internalEnumLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token en=null;
		Token SMALL_ID7=null;
		Token DOT8=null;
		Token CAPITAL_ID9=null;
		Token DOT10=null;
		ParserRuleReturnScope small =null;
		ParserRuleReturnScope capital =null;

		Object en_tree=null;
		Object SMALL_ID7_tree=null;
		Object DOT8_tree=null;
		Object CAPITAL_ID9_tree=null;
		Object DOT10_tree=null;
		RewriteRuleTokenStream stream_ENUM_LITERAL=new RewriteRuleTokenStream(adaptor,"token ENUM_LITERAL");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_SMALL_ID=new RewriteRuleTokenStream(adaptor,"token SMALL_ID");
		RewriteRuleTokenStream stream_CAPITAL_ID=new RewriteRuleTokenStream(adaptor,"token CAPITAL_ID");
		RewriteRuleSubtreeStream stream_internalEnumLiteral=new RewriteRuleSubtreeStream(adaptor,"rule internalEnumLiteral");

		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:81:20: (en= ENUM_LITERAL -> ^( ENUMLITERAL $en) | SMALL_ID DOT small= internalEnumLiteral -> $small| CAPITAL_ID DOT capital= internalEnumLiteral -> $capital)
			int alt8=3;
			switch ( input.LA(1) ) {
			case ENUM_LITERAL:
				{
				alt8=1;
				}
				break;
			case SMALL_ID:
				{
				alt8=2;
				}
				break;
			case CAPITAL_ID:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:82:2: en= ENUM_LITERAL
					{
					en=(Token)match(input,ENUM_LITERAL,FOLLOW_ENUM_LITERAL_in_internalEnumLiteral334);  
					stream_ENUM_LITERAL.add(en);

					// AST REWRITE
					// elements: en
					// token labels: en
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_en=new RewriteRuleTokenStream(adaptor,"token en",en);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:18: -> ^( ENUMLITERAL $en)
					{
						// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:82:21: ^( ENUMLITERAL $en)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENUMLITERAL, "ENUMLITERAL"), root_1);
						adaptor.addChild(root_1, stream_en.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:83:2: SMALL_ID DOT small= internalEnumLiteral
					{
					SMALL_ID7=(Token)match(input,SMALL_ID,FOLLOW_SMALL_ID_in_internalEnumLiteral348);  
					stream_SMALL_ID.add(SMALL_ID7);

					DOT8=(Token)match(input,DOT,FOLLOW_DOT_in_internalEnumLiteral350);  
					stream_DOT.add(DOT8);

					pushFollow(FOLLOW_internalEnumLiteral_in_internalEnumLiteral354);
					small=internalEnumLiteral();
					state._fsp--;

					stream_internalEnumLiteral.add(small.getTree());
					// AST REWRITE
					// elements: small
					// token labels: 
					// rule labels: small, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_small=new RewriteRuleSubtreeStream(adaptor,"rule small",small!=null?small.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:41: -> $small
					{
						adaptor.addChild(root_0, stream_small.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionParser.g:84:2: CAPITAL_ID DOT capital= internalEnumLiteral
					{
					CAPITAL_ID9=(Token)match(input,CAPITAL_ID,FOLLOW_CAPITAL_ID_in_internalEnumLiteral364);  
					stream_CAPITAL_ID.add(CAPITAL_ID9);

					DOT10=(Token)match(input,DOT,FOLLOW_DOT_in_internalEnumLiteral366);  
					stream_DOT.add(DOT10);

					pushFollow(FOLLOW_internalEnumLiteral_in_internalEnumLiteral370);
					capital=internalEnumLiteral();
					state._fsp--;

					stream_internalEnumLiteral.add(capital.getTree());
					// AST REWRITE
					// elements: capital
					// token labels: 
					// rule labels: capital, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_capital=new RewriteRuleSubtreeStream(adaptor,"rule capital",capital!=null?capital.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:45: -> $capital
					{
						adaptor.addChild(root_0, stream_capital.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "internalEnumLiteral"

	// Delegated rules



	public static final BitSet FOLLOW_operatorExpression_in_main84 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_OP_in_main87 = new BitSet(new long[]{0x0000000003450400L});
	public static final BitSet FOLLOW_operatorExpression_in_main91 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_expression_in_main116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumLiteral_in_expression133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operatorExpression_in_expression145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrCall_in_operatorExpression162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_operatorExpression174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PNUMBER_in_operatorExpression191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_operatorExpression208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operatorExpression212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operatorExpression216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALL_ID_in_attrCall237 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOT_in_attrCall239 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_attrName_in_attrCall243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALL_ID_in_attrName266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALL_ID_in_attrName278 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LPAR_in_attrName280 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RPAR_in_attrName282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_LITERAL_in_enumLiteral299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITAL_ID_in_enumLiteral313 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOT_in_enumLiteral315 = new BitSet(new long[]{0x0000000000400210L});
	public static final BitSet FOLLOW_internalEnumLiteral_in_enumLiteral319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_LITERAL_in_internalEnumLiteral334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALL_ID_in_internalEnumLiteral348 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOT_in_internalEnumLiteral350 = new BitSet(new long[]{0x0000000000400210L});
	public static final BitSet FOLLOW_internalEnumLiteral_in_internalEnumLiteral354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITAL_ID_in_internalEnumLiteral364 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOT_in_internalEnumLiteral366 = new BitSet(new long[]{0x0000000000400210L});
	public static final BitSet FOLLOW_internalEnumLiteral_in_internalEnumLiteral370 = new BitSet(new long[]{0x0000000000000002L});
}
