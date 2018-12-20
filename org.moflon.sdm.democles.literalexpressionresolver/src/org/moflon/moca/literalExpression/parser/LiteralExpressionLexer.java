// $ANTLR 3.5.2 C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g 2018-08-09 17:33:58

package org.moflon.moca.literalExpression.parser;
import java.util.Collection;
import org.moflon.core.moca.processing.ProcessingFactory;
import org.moflon.core.moca.processing.Problem;
import org.moflon.core.moca.processing.ProblemType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LiteralExpressionLexer extends Lexer {
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
	          problem.setMessage("Lexer: " + getErrorMessage(e, tokenNames));

	          problems.add(problem);
	          super.displayRecognitionError(tokenNames, e);
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LiteralExpressionLexer() {} 
	public LiteralExpressionLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LiteralExpressionLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g"; }

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:38:4: ( ( ' ' )+ )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:38:6: ( ' ' )+
			{
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:38:6: ( ' ' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:38:7: ' '
					{
					match(' '); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:42:6: ( '\"' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:42:7: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:43:6: ( ':' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:43:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:44:6: ( '/' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:44:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			int _type = UNDERSCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:45:11: ( '_' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:45:12: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:46:4: ( '.' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:46:5: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "OP"
	public final void mOP() throws RecognitionException {
		try {
			int _type = OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:47:3: ( '+' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:47:4: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:48:5: ( '(' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:48:6: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:49:5: ( ')' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:49:6: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:50:5: ( 'true' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:50:6: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:51:6: ( 'false' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:51:7: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:52:5: ( 'null' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:52:6: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "FLOAT_SUFFIX_SMALL"
	public final void mFLOAT_SUFFIX_SMALL() throws RecognitionException {
		try {
			int _type = FLOAT_SUFFIX_SMALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:53:19: ( 'f' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:53:20: 'f'
			{
			match('f'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_SUFFIX_SMALL"

	// $ANTLR start "FLOAT_SUFFIX_LARGE"
	public final void mFLOAT_SUFFIX_LARGE() throws RecognitionException {
		try {
			int _type = FLOAT_SUFFIX_LARGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:54:19: ( 'F' )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:54:20: 'F'
			{
			match('F'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_SUFFIX_LARGE"

	// $ANTLR start "SMALL_LETTER"
	public final void mSMALL_LETTER() throws RecognitionException {
		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:57:13: ( ( 'a' .. 'z' ) )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALL_LETTER"

	// $ANTLR start "CAPITAL_LETTER"
	public final void mCAPITAL_LETTER() throws RecognitionException {
		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:59:15: ( ( 'A' .. 'Z' ) )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAPITAL_LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:61:6: ( ( '0' .. '9' ) )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:63:7: ( SMALL_LETTER | CAPITAL_LETTER )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:65:3: ( LETTER | DIGIT | UNDERSCORE )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:67:8: ( QUOTE (~ ( '\\r' | '\\n' | QUOTE ) | '\\\\' QUOTE )* QUOTE )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:67:10: QUOTE (~ ( '\\r' | '\\n' | QUOTE ) | '\\\\' QUOTE )* QUOTE
			{
			mQUOTE(); 

			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:67:16: (~ ( '\\r' | '\\n' | QUOTE ) | '\\\\' QUOTE )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\\') ) {
					int LA2_2 = input.LA(2);
					if ( (LA2_2=='\"') ) {
						int LA2_4 = input.LA(3);
						if ( ((LA2_4 >= '\u0000' && LA2_4 <= '\t')||(LA2_4 >= '\u000B' && LA2_4 <= '\f')||(LA2_4 >= '\u000E' && LA2_4 <= '\uFFFF')) ) {
							alt2=2;
						}
						else {
							alt2=1;
						}

					}
					else if ( ((LA2_2 >= '\u0000' && LA2_2 <= '\t')||(LA2_2 >= '\u000B' && LA2_2 <= '\f')||(LA2_2 >= '\u000E' && LA2_2 <= '!')||(LA2_2 >= '#' && LA2_2 <= '\uFFFF')) ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:67:17: ~ ( '\\r' | '\\n' | QUOTE )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:67:37: '\\\\' QUOTE
					{
					match('\\'); 
					mQUOTE(); 

					}
					break;

				default :
					break loop2;
				}
			}

			mQUOTE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ENUM_LITERAL"
	public final void mENUM_LITERAL() throws RecognitionException {
		try {
			int _type = ENUM_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:68:13: ( CAPITAL_LETTER ( CAPITAL_LETTER | UNDERSCORE | DIGIT )+ )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:68:15: CAPITAL_LETTER ( CAPITAL_LETTER | UNDERSCORE | DIGIT )+
			{
			mCAPITAL_LETTER(); 

			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:68:30: ( CAPITAL_LETTER | UNDERSCORE | DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM_LITERAL"

	// $ANTLR start "SMALL_ID"
	public final void mSMALL_ID() throws RecognitionException {
		try {
			int _type = SMALL_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:69:9: ( SMALL_LETTER ( ID )* )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:69:11: SMALL_LETTER ( ID )*
			{
			mSMALL_LETTER(); 

			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:69:24: ( ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALL_ID"

	// $ANTLR start "CAPITAL_ID"
	public final void mCAPITAL_ID() throws RecognitionException {
		try {
			int _type = CAPITAL_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:70:11: ( CAPITAL_LETTER ( ID )* )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:70:13: CAPITAL_LETTER ( ID )*
			{
			mCAPITAL_LETTER(); 

			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:70:28: ( ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAPITAL_ID"

	// $ANTLR start "PNUMBER"
	public final void mPNUMBER() throws RecognitionException {
		try {
			int _type = PNUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:8: ( ( '+' | '-' )? ( DIGIT )+ ( DOT ( DIGIT )+ )? ( FLOAT_SUFFIX_SMALL | FLOAT_SUFFIX_LARGE )? )
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:10: ( '+' | '-' )? ( DIGIT )+ ( DOT ( DIGIT )+ )? ( FLOAT_SUFFIX_SMALL | FLOAT_SUFFIX_LARGE )?
			{
			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:10: ( '+' | '-' )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='+'||LA6_0=='-') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:21: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:28: ( DOT ( DIGIT )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='.') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:29: DOT ( DIGIT )+
					{
					mDOT(); 

					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:33: ( DIGIT )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					}
					break;

			}

			// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:71:42: ( FLOAT_SUFFIX_SMALL | FLOAT_SUFFIX_LARGE )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='F'||LA10_0=='f') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:
					{
					if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PNUMBER"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:8: ( WS | QUOTE | COLON | SLASH | UNDERSCORE | DOT | OP | LPAR | RPAR | TRUE | FALSE | NULL | FLOAT_SUFFIX_SMALL | FLOAT_SUFFIX_LARGE | STRING | ENUM_LITERAL | SMALL_ID | CAPITAL_ID | PNUMBER )
		int alt11=19;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:10: WS
				{
				mWS(); 

				}
				break;
			case 2 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:13: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 3 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:19: COLON
				{
				mCOLON(); 

				}
				break;
			case 4 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:25: SLASH
				{
				mSLASH(); 

				}
				break;
			case 5 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:31: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 6 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:42: DOT
				{
				mDOT(); 

				}
				break;
			case 7 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:46: OP
				{
				mOP(); 

				}
				break;
			case 8 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:49: LPAR
				{
				mLPAR(); 

				}
				break;
			case 9 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:54: RPAR
				{
				mRPAR(); 

				}
				break;
			case 10 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:59: TRUE
				{
				mTRUE(); 

				}
				break;
			case 11 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:64: FALSE
				{
				mFALSE(); 

				}
				break;
			case 12 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:70: NULL
				{
				mNULL(); 

				}
				break;
			case 13 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:75: FLOAT_SUFFIX_SMALL
				{
				mFLOAT_SUFFIX_SMALL(); 

				}
				break;
			case 14 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:94: FLOAT_SUFFIX_LARGE
				{
				mFLOAT_SUFFIX_LARGE(); 

				}
				break;
			case 15 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:113: STRING
				{
				mSTRING(); 

				}
				break;
			case 16 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:120: ENUM_LITERAL
				{
				mENUM_LITERAL(); 

				}
				break;
			case 17 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:133: SMALL_ID
				{
				mSMALL_ID(); 

				}
				break;
			case 18 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:142: CAPITAL_ID
				{
				mCAPITAL_ID(); 

				}
				break;
			case 19 :
				// C:\\data\\ws\\MoflonDev\\git\\emoflon-tool\\org.moflon.sdm.democles.literalexpressionresolver\\src\\org\\moflon\\moca\\literalExpression\\parser\\LiteralExpressionLexer.g:1:153: PNUMBER
				{
				mPNUMBER(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\2\uffff\1\21\4\uffff\1\23\2\uffff\1\17\1\26\1\17\1\30\1\32\5\uffff\2"+
		"\17\1\uffff\1\17\1\uffff\1\36\1\uffff\3\17\1\uffff\1\42\1\17\1\44\1\uffff"+
		"\1\45\2\uffff";
	static final String DFA11_eofS =
		"\46\uffff";
	static final String DFA11_minS =
		"\1\40\1\uffff\1\0\4\uffff\1\60\2\uffff\1\162\1\60\1\165\2\60\5\uffff\1"+
		"\165\1\154\1\uffff\1\154\1\uffff\1\60\1\uffff\1\145\1\163\1\154\1\uffff"+
		"\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
	static final String DFA11_maxS =
		"\1\172\1\uffff\1\uffff\4\uffff\1\71\2\uffff\1\162\1\172\1\165\1\172\1"+
		"\137\5\uffff\1\165\1\154\1\uffff\1\154\1\uffff\1\172\1\uffff\1\145\1\163"+
		"\1\154\1\uffff\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\5\uffff\1\21\1"+
		"\23\1\2\1\17\1\7\2\uffff\1\15\1\uffff\1\16\1\uffff\1\22\3\uffff\1\20\3"+
		"\uffff\1\12\1\uffff\1\14\1\13";
	static final String DFA11_specialS =
		"\2\uffff\1\0\43\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\1\1\uffff\1\2\5\uffff\1\10\1\11\1\uffff\1\7\1\uffff\1\20\1\6\1\4\12"+
			"\20\1\3\6\uffff\5\16\1\15\24\16\4\uffff\1\5\1\uffff\5\17\1\13\7\17\1"+
			"\14\5\17\1\12\6\17",
			"",
			"\12\22\1\uffff\2\22\1\uffff\ufff2\22",
			"",
			"",
			"",
			"",
			"\12\20",
			"",
			"",
			"\1\24",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\1\25\31\17",
			"\1\27",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\32",
			"\12\31\7\uffff\32\31\4\uffff\1\31",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"\1\34",
			"",
			"\1\35",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\32",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\43",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | QUOTE | COLON | SLASH | UNDERSCORE | DOT | OP | LPAR | RPAR | TRUE | FALSE | NULL | FLOAT_SUFFIX_SMALL | FLOAT_SUFFIX_LARGE | STRING | ENUM_LITERAL | SMALL_ID | CAPITAL_ID | PNUMBER );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_2 = input.LA(1);
						s = -1;
						if ( ((LA11_2 >= '\u0000' && LA11_2 <= '\t')||(LA11_2 >= '\u000B' && LA11_2 <= '\f')||(LA11_2 >= '\u000E' && LA11_2 <= '\uFFFF')) ) {s = 18;}
						else s = 17;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
