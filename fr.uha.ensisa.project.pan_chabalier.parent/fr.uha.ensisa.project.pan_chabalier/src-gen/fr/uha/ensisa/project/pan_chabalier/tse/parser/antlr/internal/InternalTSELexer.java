package fr.uha.ensisa.project.pan_chabalier.tse.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTSELexer extends Lexer {
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_COLOR=5;
    public static final int RULE_DEFAULT=7;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalTSELexer() {;} 
    public InternalTSELexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTSELexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTSE.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:11:7: ( 'state' )
            // InternalTSE.g:11:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:12:7: ( 'color' )
            // InternalTSE.g:12:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:13:7: ( 'thickness' )
            // InternalTSE.g:13:9: 'thickness'
            {
            match("thickness"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:14:7: ( 'position' )
            // InternalTSE.g:14:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:15:7: ( 'transition' )
            // InternalTSE.g:15:9: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:16:7: ( 'initialTransition' )
            // InternalTSE.g:16:9: 'initialTransition'
            {
            match("initialTransition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:17:7: ( 'label' )
            // InternalTSE.g:17:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:18:7: ( '->' )
            // InternalTSE.g:18:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:19:7: ( 'reflexive' )
            // InternalTSE.g:19:9: 'reflexive'
            {
            match("reflexive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:20:7: ( 'curvature' )
            // InternalTSE.g:20:9: 'curvature'
            {
            match("curvature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_DEFAULT"
    public final void mRULE_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:677:14: ( ( 'DEFAULT' | 'default' ) )
            // InternalTSE.g:677:16: ( 'DEFAULT' | 'default' )
            {
            // InternalTSE.g:677:16: ( 'DEFAULT' | 'default' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='D') ) {
                alt1=1;
            }
            else if ( (LA1_0=='d') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTSE.g:677:17: 'DEFAULT'
                    {
                    match("DEFAULT"); 


                    }
                    break;
                case 2 :
                    // InternalTSE.g:677:27: 'default'
                    {
                    match("default"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT"

    // $ANTLR start "RULE_COLOR"
    public final void mRULE_COLOR() throws RecognitionException {
        try {
            int _type = RULE_COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:679:12: ( ( 'WHITE' | 'BLACK' | 'BLUE' | 'CYAN' | 'DARK_GRAY' | 'GRAY' | 'LIGHT_GRAY' | 'GREEN' | 'MAGENTA' | 'ORANGE' | 'PINK' | 'RED' | 'YELLOW' ) )
            // InternalTSE.g:679:14: ( 'WHITE' | 'BLACK' | 'BLUE' | 'CYAN' | 'DARK_GRAY' | 'GRAY' | 'LIGHT_GRAY' | 'GREEN' | 'MAGENTA' | 'ORANGE' | 'PINK' | 'RED' | 'YELLOW' )
            {
            // InternalTSE.g:679:14: ( 'WHITE' | 'BLACK' | 'BLUE' | 'CYAN' | 'DARK_GRAY' | 'GRAY' | 'LIGHT_GRAY' | 'GREEN' | 'MAGENTA' | 'ORANGE' | 'PINK' | 'RED' | 'YELLOW' )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalTSE.g:679:15: 'WHITE'
                    {
                    match("WHITE"); 


                    }
                    break;
                case 2 :
                    // InternalTSE.g:679:23: 'BLACK'
                    {
                    match("BLACK"); 


                    }
                    break;
                case 3 :
                    // InternalTSE.g:679:31: 'BLUE'
                    {
                    match("BLUE"); 


                    }
                    break;
                case 4 :
                    // InternalTSE.g:679:38: 'CYAN'
                    {
                    match("CYAN"); 


                    }
                    break;
                case 5 :
                    // InternalTSE.g:679:45: 'DARK_GRAY'
                    {
                    match("DARK_GRAY"); 


                    }
                    break;
                case 6 :
                    // InternalTSE.g:679:57: 'GRAY'
                    {
                    match("GRAY"); 


                    }
                    break;
                case 7 :
                    // InternalTSE.g:679:64: 'LIGHT_GRAY'
                    {
                    match("LIGHT_GRAY"); 


                    }
                    break;
                case 8 :
                    // InternalTSE.g:679:77: 'GREEN'
                    {
                    match("GREEN"); 


                    }
                    break;
                case 9 :
                    // InternalTSE.g:679:85: 'MAGENTA'
                    {
                    match("MAGENTA"); 


                    }
                    break;
                case 10 :
                    // InternalTSE.g:679:95: 'ORANGE'
                    {
                    match("ORANGE"); 


                    }
                    break;
                case 11 :
                    // InternalTSE.g:679:104: 'PINK'
                    {
                    match("PINK"); 


                    }
                    break;
                case 12 :
                    // InternalTSE.g:679:111: 'RED'
                    {
                    match("RED"); 


                    }
                    break;
                case 13 :
                    // InternalTSE.g:679:117: 'YELLOW'
                    {
                    match("YELLOW"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLOR"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:681:12: ( RULE_INT '.' RULE_INT )
            // InternalTSE.g:681:14: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:683:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTSE.g:683:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTSE.g:683:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTSE.g:683:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTSE.g:683:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTSE.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:685:10: ( ( '0' .. '9' )+ )
            // InternalTSE.g:685:12: ( '0' .. '9' )+
            {
            // InternalTSE.g:685:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTSE.g:685:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:687:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTSE.g:687:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTSE.g:687:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTSE.g:687:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTSE.g:687:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTSE.g:687:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTSE.g:687:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTSE.g:687:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTSE.g:687:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTSE.g:687:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTSE.g:687:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:689:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTSE.g:689:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTSE.g:689:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTSE.g:689:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:691:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTSE.g:691:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTSE.g:691:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTSE.g:691:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalTSE.g:691:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTSE.g:691:41: ( '\\r' )? '\\n'
                    {
                    // InternalTSE.g:691:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTSE.g:691:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:693:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTSE.g:693:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTSE.g:693:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTSE.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTSE.g:695:16: ( . )
            // InternalTSE.g:695:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTSE.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_DEFAULT | RULE_COLOR | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=20;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTSE.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalTSE.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalTSE.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalTSE.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalTSE.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalTSE.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalTSE.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalTSE.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalTSE.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalTSE.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalTSE.g:1:70: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 12 :
                // InternalTSE.g:1:83: RULE_COLOR
                {
                mRULE_COLOR(); 

                }
                break;
            case 13 :
                // InternalTSE.g:1:94: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 14 :
                // InternalTSE.g:1:105: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalTSE.g:1:113: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalTSE.g:1:122: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalTSE.g:1:134: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalTSE.g:1:150: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalTSE.g:1:166: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // InternalTSE.g:1:174: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\22\uffff";
    static final String DFA2_eofS =
        "\22\uffff";
    static final String DFA2_minS =
        "\1\102\1\uffff\1\114\2\uffff\1\122\6\uffff\2\101\4\uffff";
    static final String DFA2_maxS =
        "\1\131\1\uffff\1\114\2\uffff\1\122\6\uffff\1\125\1\105\4\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\uffff\1\7\1\11\1\12\1\13\1\14\1\15\2\uffff\1\2\1\3\1\6\1\10";
    static final String DFA2_specialS =
        "\22\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\1\4\2\uffff\1\5\4\uffff\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1\12\4\uffff\1\1\1\uffff\1\13",
            "",
            "\1\14",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\23\uffff\1\17",
            "\1\20\3\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "679:14: ( 'WHITE' | 'BLACK' | 'BLUE' | 'CYAN' | 'DARK_GRAY' | 'GRAY' | 'LIGHT_GRAY' | 'GREEN' | 'MAGENTA' | 'ORANGE' | 'PINK' | 'RED' | 'YELLOW' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\6\36\1\34\15\36\1\65\1\34\1\uffff\3\34\2\uffff\1\36\1\uffff\7\36\1\uffff\16\36\1\uffff\1\65\5\uffff\26\36\1\152\17\36\3\152\4\36\1\152\1\uffff\1\36\1\177\1\u0080\5\36\1\u0086\4\36\3\152\4\36\2\uffff\5\36\1\uffff\6\36\2\152\6\36\1\u00a0\1\36\1\u00a0\1\36\1\152\3\36\1\u00a6\2\36\1\uffff\2\36\1\u00ab\1\u00ac\1\36\1\uffff\1\36\1\u00af\1\152\1\36\2\uffff\1\u00b1\1\36\1\uffff\1\152\1\uffff\6\36\1\u00b9\1\uffff";
    static final String DFA14_eofS =
        "\u00ba\uffff";
    static final String DFA14_minS =
        "\1\0\1\164\1\157\1\150\1\157\1\156\1\141\1\76\1\145\1\101\1\145\1\110\1\114\1\131\1\122\1\111\1\101\1\122\1\111\2\105\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\141\1\uffff\1\154\1\162\1\151\1\141\1\163\1\151\1\142\1\uffff\1\146\1\106\1\122\1\146\1\111\3\101\2\107\1\101\1\116\1\104\1\114\1\uffff\1\56\5\uffff\1\164\1\157\1\166\1\143\1\156\1\151\1\164\1\145\1\154\1\101\1\113\1\141\1\124\1\103\1\105\1\116\1\131\1\105\1\110\1\105\1\116\1\113\1\60\1\114\1\145\1\162\1\141\1\153\1\163\1\164\1\151\1\154\1\145\1\125\1\137\1\165\1\105\1\113\3\60\1\116\1\124\1\116\1\107\1\60\1\uffff\1\117\2\60\1\164\1\156\2\151\1\141\1\60\1\170\1\114\1\107\1\154\3\60\1\137\1\124\1\105\1\127\2\uffff\1\165\1\145\1\164\1\157\1\154\1\uffff\1\151\1\124\1\122\1\164\1\107\1\101\2\60\1\162\1\163\1\151\1\156\1\124\1\166\1\60\1\101\1\60\1\122\1\60\1\145\1\163\1\157\1\60\1\162\1\145\1\uffff\1\131\1\101\2\60\1\156\1\uffff\1\141\2\60\1\131\2\uffff\1\60\1\156\1\uffff\1\60\1\uffff\1\163\1\151\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\164\1\165\1\162\1\157\1\156\1\141\1\76\1\145\1\105\1\145\1\110\1\114\1\131\1\122\1\111\1\101\1\122\1\111\2\105\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\141\1\uffff\1\154\1\162\1\151\1\141\1\163\1\151\1\142\1\uffff\1\146\1\106\1\122\1\146\1\111\1\125\1\101\1\105\2\107\1\101\1\116\1\104\1\114\1\uffff\1\71\5\uffff\1\164\1\157\1\166\1\143\1\156\1\151\1\164\1\145\1\154\1\101\1\113\1\141\1\124\1\103\1\105\1\116\1\131\1\105\1\110\1\105\1\116\1\113\1\172\1\114\1\145\1\162\1\141\1\153\1\163\1\164\1\151\1\154\1\145\1\125\1\137\1\165\1\105\1\113\3\172\1\116\1\124\1\116\1\107\1\172\1\uffff\1\117\2\172\1\164\1\156\2\151\1\141\1\172\1\170\1\114\1\107\1\154\3\172\1\137\1\124\1\105\1\127\2\uffff\1\165\1\145\1\164\1\157\1\154\1\uffff\1\151\1\124\1\122\1\164\1\107\1\101\2\172\1\162\1\163\1\151\1\156\1\124\1\166\1\172\1\101\1\172\1\122\1\172\1\145\1\163\1\157\1\172\1\162\1\145\1\uffff\1\131\1\101\2\172\1\156\1\uffff\1\141\2\172\1\131\2\uffff\1\172\1\156\1\uffff\1\172\1\uffff\1\163\1\151\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\27\uffff\1\16\3\uffff\1\23\1\24\1\uffff\1\16\7\uffff\1\10\16\uffff\1\17\1\uffff\1\15\1\20\1\21\1\22\1\23\56\uffff\1\14\24\uffff\1\1\1\2\5\uffff\1\7\31\uffff\1\13\5\uffff\1\4\4\uffff\1\12\1\3\2\uffff\1\11\1\uffff\1\5\7\uffff\1\6";
    static final String DFA14_specialS =
        "\1\1\27\uffff\1\0\1\2\u00a0\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\5\34\1\7\1\34\1\32\12\25\7\34\1\27\1\14\1\15\1\11\2\27\1\16\4\27\1\17\1\20\1\27\1\21\1\22\1\27\1\23\4\27\1\13\1\27\1\24\1\27\3\34\1\26\1\27\1\34\2\27\1\2\1\12\4\27\1\5\2\27\1\6\3\27\1\4\1\27\1\10\1\1\1\3\6\27\uff85\34",
            "\1\35",
            "\1\37\5\uffff\1\40",
            "\1\41\11\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51\3\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\67\1\uffff\12\66",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\70",
            "\0\70",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\23\uffff\1\112",
            "\1\113",
            "\1\114\3\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\67\1\uffff\12\66",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\176",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a1",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b0",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b2",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_DEFAULT | RULE_COLOR | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFF')) ) {s = 56;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='s') ) {s = 1;}

                        else if ( (LA14_0=='c') ) {s = 2;}

                        else if ( (LA14_0=='t') ) {s = 3;}

                        else if ( (LA14_0=='p') ) {s = 4;}

                        else if ( (LA14_0=='i') ) {s = 5;}

                        else if ( (LA14_0=='l') ) {s = 6;}

                        else if ( (LA14_0=='-') ) {s = 7;}

                        else if ( (LA14_0=='r') ) {s = 8;}

                        else if ( (LA14_0=='D') ) {s = 9;}

                        else if ( (LA14_0=='d') ) {s = 10;}

                        else if ( (LA14_0=='W') ) {s = 11;}

                        else if ( (LA14_0=='B') ) {s = 12;}

                        else if ( (LA14_0=='C') ) {s = 13;}

                        else if ( (LA14_0=='G') ) {s = 14;}

                        else if ( (LA14_0=='L') ) {s = 15;}

                        else if ( (LA14_0=='M') ) {s = 16;}

                        else if ( (LA14_0=='O') ) {s = 17;}

                        else if ( (LA14_0=='P') ) {s = 18;}

                        else if ( (LA14_0=='R') ) {s = 19;}

                        else if ( (LA14_0=='Y') ) {s = 20;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 21;}

                        else if ( (LA14_0=='^') ) {s = 22;}

                        else if ( (LA14_0=='A'||(LA14_0>='E' && LA14_0<='F')||(LA14_0>='H' && LA14_0<='K')||LA14_0=='N'||LA14_0=='Q'||(LA14_0>='S' && LA14_0<='V')||LA14_0=='X'||LA14_0=='Z'||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='e' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {s = 23;}

                        else if ( (LA14_0=='\"') ) {s = 24;}

                        else if ( (LA14_0=='\'') ) {s = 25;}

                        else if ( (LA14_0=='/') ) {s = 26;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 27;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=',')||LA14_0=='.'||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_25 = input.LA(1);

                        s = -1;
                        if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFF')) ) {s = 56;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}