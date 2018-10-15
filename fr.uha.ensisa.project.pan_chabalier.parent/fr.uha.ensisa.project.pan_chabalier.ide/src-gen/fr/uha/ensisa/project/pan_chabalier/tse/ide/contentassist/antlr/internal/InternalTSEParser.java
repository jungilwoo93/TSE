package fr.uha.ensisa.project.pan_chabalier.tse.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.uha.ensisa.project.pan_chabalier.tse.services.TSEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTSEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DEFAULT", "RULE_COORDINATES", "RULE_ID", "RULE_COLOR", "RULE_FLOAT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'color'", "'thickness'", "'position'", "'transition'", "'->'", "'initialTransition'", "'label'", "'curvature'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_COORDINATES=5;
    public static final int RULE_COLOR=7;
    public static final int RULE_DEFAULT=4;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int RULE_FLOAT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTSEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTSEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTSEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTSE.g"; }


    	private TSEGrammarAccess grammarAccess;

    	public void setGrammarAccess(TSEGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalTSE.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTSE.g:54:1: ( ruleModel EOF )
            // InternalTSE.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTSE.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalTSE.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalTSE.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalTSE.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalTSE.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==19||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTSE.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalTSE.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalTSE.g:79:1: ( ruleElement EOF )
            // InternalTSE.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTSE.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalTSE.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalTSE.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalTSE.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalTSE.g:94:3: ( rule__Element__Alternatives )
            // InternalTSE.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleState"
    // InternalTSE.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalTSE.g:104:1: ( ruleState EOF )
            // InternalTSE.g:105:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalTSE.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalTSE.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalTSE.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalTSE.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalTSE.g:119:3: ( rule__State__Group__0 )
            // InternalTSE.g:119:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStatesProperties"
    // InternalTSE.g:128:1: entryRuleStatesProperties : ruleStatesProperties EOF ;
    public final void entryRuleStatesProperties() throws RecognitionException {
        try {
            // InternalTSE.g:129:1: ( ruleStatesProperties EOF )
            // InternalTSE.g:130:1: ruleStatesProperties EOF
            {
             before(grammarAccess.getStatesPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleStatesProperties();

            state._fsp--;

             after(grammarAccess.getStatesPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatesProperties"


    // $ANTLR start "ruleStatesProperties"
    // InternalTSE.g:137:1: ruleStatesProperties : ( ( rule__StatesProperties__Alternatives ) ) ;
    public final void ruleStatesProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:141:2: ( ( ( rule__StatesProperties__Alternatives ) ) )
            // InternalTSE.g:142:2: ( ( rule__StatesProperties__Alternatives ) )
            {
            // InternalTSE.g:142:2: ( ( rule__StatesProperties__Alternatives ) )
            // InternalTSE.g:143:3: ( rule__StatesProperties__Alternatives )
            {
             before(grammarAccess.getStatesPropertiesAccess().getAlternatives()); 
            // InternalTSE.g:144:3: ( rule__StatesProperties__Alternatives )
            // InternalTSE.g:144:4: rule__StatesProperties__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatesPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatesProperties"


    // $ANTLR start "entryRuleTransition"
    // InternalTSE.g:153:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalTSE.g:154:1: ( ruleTransition EOF )
            // InternalTSE.g:155:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalTSE.g:162:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:166:2: ( ( ( rule__Transition__Alternatives ) ) )
            // InternalTSE.g:167:2: ( ( rule__Transition__Alternatives ) )
            {
            // InternalTSE.g:167:2: ( ( rule__Transition__Alternatives ) )
            // InternalTSE.g:168:3: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // InternalTSE.g:169:3: ( rule__Transition__Alternatives )
            // InternalTSE.g:169:4: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleLabel"
    // InternalTSE.g:178:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalTSE.g:179:1: ( ruleLabel EOF )
            // InternalTSE.g:180:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalTSE.g:187:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:191:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalTSE.g:192:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalTSE.g:192:2: ( ( rule__Label__Group__0 ) )
            // InternalTSE.g:193:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalTSE.g:194:3: ( rule__Label__Group__0 )
            // InternalTSE.g:194:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleCoordinatesStatesTransition"
    // InternalTSE.g:203:1: entryRuleCoordinatesStatesTransition : ruleCoordinatesStatesTransition EOF ;
    public final void entryRuleCoordinatesStatesTransition() throws RecognitionException {
        try {
            // InternalTSE.g:204:1: ( ruleCoordinatesStatesTransition EOF )
            // InternalTSE.g:205:1: ruleCoordinatesStatesTransition EOF
            {
             before(grammarAccess.getCoordinatesStatesTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinatesStatesTransition();

            state._fsp--;

             after(grammarAccess.getCoordinatesStatesTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinatesStatesTransition"


    // $ANTLR start "ruleCoordinatesStatesTransition"
    // InternalTSE.g:212:1: ruleCoordinatesStatesTransition : ( ( rule__CoordinatesStatesTransition__StateTransitionAssignment ) ) ;
    public final void ruleCoordinatesStatesTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:216:2: ( ( ( rule__CoordinatesStatesTransition__StateTransitionAssignment ) ) )
            // InternalTSE.g:217:2: ( ( rule__CoordinatesStatesTransition__StateTransitionAssignment ) )
            {
            // InternalTSE.g:217:2: ( ( rule__CoordinatesStatesTransition__StateTransitionAssignment ) )
            // InternalTSE.g:218:3: ( rule__CoordinatesStatesTransition__StateTransitionAssignment )
            {
             before(grammarAccess.getCoordinatesStatesTransitionAccess().getStateTransitionAssignment()); 
            // InternalTSE.g:219:3: ( rule__CoordinatesStatesTransition__StateTransitionAssignment )
            // InternalTSE.g:219:4: rule__CoordinatesStatesTransition__StateTransitionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CoordinatesStatesTransition__StateTransitionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesStatesTransitionAccess().getStateTransitionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinatesStatesTransition"


    // $ANTLR start "entryRuleTransitionProperties"
    // InternalTSE.g:228:1: entryRuleTransitionProperties : ruleTransitionProperties EOF ;
    public final void entryRuleTransitionProperties() throws RecognitionException {
        try {
            // InternalTSE.g:229:1: ( ruleTransitionProperties EOF )
            // InternalTSE.g:230:1: ruleTransitionProperties EOF
            {
             before(grammarAccess.getTransitionPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionProperties();

            state._fsp--;

             after(grammarAccess.getTransitionPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionProperties"


    // $ANTLR start "ruleTransitionProperties"
    // InternalTSE.g:237:1: ruleTransitionProperties : ( ( rule__TransitionProperties__Alternatives ) ) ;
    public final void ruleTransitionProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:241:2: ( ( ( rule__TransitionProperties__Alternatives ) ) )
            // InternalTSE.g:242:2: ( ( rule__TransitionProperties__Alternatives ) )
            {
            // InternalTSE.g:242:2: ( ( rule__TransitionProperties__Alternatives ) )
            // InternalTSE.g:243:3: ( rule__TransitionProperties__Alternatives )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getAlternatives()); 
            // InternalTSE.g:244:3: ( rule__TransitionProperties__Alternatives )
            // InternalTSE.g:244:4: rule__TransitionProperties__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionProperties"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalTSE.g:252:1: rule__Element__Alternatives : ( ( ( rule__Element__StateAssignment_0 ) ) | ( ( rule__Element__TransitionAssignment_1 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:256:1: ( ( ( rule__Element__StateAssignment_0 ) ) | ( ( rule__Element__TransitionAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==19||LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTSE.g:257:2: ( ( rule__Element__StateAssignment_0 ) )
                    {
                    // InternalTSE.g:257:2: ( ( rule__Element__StateAssignment_0 ) )
                    // InternalTSE.g:258:3: ( rule__Element__StateAssignment_0 )
                    {
                     before(grammarAccess.getElementAccess().getStateAssignment_0()); 
                    // InternalTSE.g:259:3: ( rule__Element__StateAssignment_0 )
                    // InternalTSE.g:259:4: rule__Element__StateAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__StateAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getStateAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:263:2: ( ( rule__Element__TransitionAssignment_1 ) )
                    {
                    // InternalTSE.g:263:2: ( ( rule__Element__TransitionAssignment_1 ) )
                    // InternalTSE.g:264:3: ( rule__Element__TransitionAssignment_1 )
                    {
                     before(grammarAccess.getElementAccess().getTransitionAssignment_1()); 
                    // InternalTSE.g:265:3: ( rule__Element__TransitionAssignment_1 )
                    // InternalTSE.g:265:4: rule__Element__TransitionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__TransitionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getTransitionAssignment_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__StatesProperties__Alternatives"
    // InternalTSE.g:273:1: rule__StatesProperties__Alternatives : ( ( ( rule__StatesProperties__Group_0__0 ) ) | ( ( rule__StatesProperties__Group_1__0 ) ) | ( ( rule__StatesProperties__Group_2__0 ) ) | ( ( rule__StatesProperties__Group_3__0 ) ) );
    public final void rule__StatesProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:277:1: ( ( ( rule__StatesProperties__Group_0__0 ) ) | ( ( rule__StatesProperties__Group_1__0 ) ) | ( ( rule__StatesProperties__Group_2__0 ) ) | ( ( rule__StatesProperties__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case RULE_DEFAULT:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTSE.g:278:2: ( ( rule__StatesProperties__Group_0__0 ) )
                    {
                    // InternalTSE.g:278:2: ( ( rule__StatesProperties__Group_0__0 ) )
                    // InternalTSE.g:279:3: ( rule__StatesProperties__Group_0__0 )
                    {
                     before(grammarAccess.getStatesPropertiesAccess().getGroup_0()); 
                    // InternalTSE.g:280:3: ( rule__StatesProperties__Group_0__0 )
                    // InternalTSE.g:280:4: rule__StatesProperties__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatesProperties__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatesPropertiesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:284:2: ( ( rule__StatesProperties__Group_1__0 ) )
                    {
                    // InternalTSE.g:284:2: ( ( rule__StatesProperties__Group_1__0 ) )
                    // InternalTSE.g:285:3: ( rule__StatesProperties__Group_1__0 )
                    {
                     before(grammarAccess.getStatesPropertiesAccess().getGroup_1()); 
                    // InternalTSE.g:286:3: ( rule__StatesProperties__Group_1__0 )
                    // InternalTSE.g:286:4: rule__StatesProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatesProperties__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatesPropertiesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTSE.g:290:2: ( ( rule__StatesProperties__Group_2__0 ) )
                    {
                    // InternalTSE.g:290:2: ( ( rule__StatesProperties__Group_2__0 ) )
                    // InternalTSE.g:291:3: ( rule__StatesProperties__Group_2__0 )
                    {
                     before(grammarAccess.getStatesPropertiesAccess().getGroup_2()); 
                    // InternalTSE.g:292:3: ( rule__StatesProperties__Group_2__0 )
                    // InternalTSE.g:292:4: rule__StatesProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatesProperties__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatesPropertiesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTSE.g:296:2: ( ( rule__StatesProperties__Group_3__0 ) )
                    {
                    // InternalTSE.g:296:2: ( ( rule__StatesProperties__Group_3__0 ) )
                    // InternalTSE.g:297:3: ( rule__StatesProperties__Group_3__0 )
                    {
                     before(grammarAccess.getStatesPropertiesAccess().getGroup_3()); 
                    // InternalTSE.g:298:3: ( rule__StatesProperties__Group_3__0 )
                    // InternalTSE.g:298:4: rule__StatesProperties__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatesProperties__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatesPropertiesAccess().getGroup_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Alternatives"


    // $ANTLR start "rule__Transition__Alternatives"
    // InternalTSE.g:306:1: rule__Transition__Alternatives : ( ( ( rule__Transition__Group_0__0 ) ) | ( ( rule__Transition__Group_1__0 ) ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:310:1: ( ( ( rule__Transition__Group_0__0 ) ) | ( ( rule__Transition__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTSE.g:311:2: ( ( rule__Transition__Group_0__0 ) )
                    {
                    // InternalTSE.g:311:2: ( ( rule__Transition__Group_0__0 ) )
                    // InternalTSE.g:312:3: ( rule__Transition__Group_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0()); 
                    // InternalTSE.g:313:3: ( rule__Transition__Group_0__0 )
                    // InternalTSE.g:313:4: rule__Transition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:317:2: ( ( rule__Transition__Group_1__0 ) )
                    {
                    // InternalTSE.g:317:2: ( ( rule__Transition__Group_1__0 ) )
                    // InternalTSE.g:318:3: ( rule__Transition__Group_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_1()); 
                    // InternalTSE.g:319:3: ( rule__Transition__Group_1__0 )
                    // InternalTSE.g:319:4: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives"


    // $ANTLR start "rule__TransitionProperties__Alternatives"
    // InternalTSE.g:327:1: rule__TransitionProperties__Alternatives : ( ( ( rule__TransitionProperties__Group_0__0 ) ) | ( ( rule__TransitionProperties__Group_1__0 ) ) | ( ( rule__TransitionProperties__Group_2__0 ) ) );
    public final void rule__TransitionProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:331:1: ( ( ( rule__TransitionProperties__Group_0__0 ) ) | ( ( rule__TransitionProperties__Group_1__0 ) ) | ( ( rule__TransitionProperties__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTSE.g:332:2: ( ( rule__TransitionProperties__Group_0__0 ) )
                    {
                    // InternalTSE.g:332:2: ( ( rule__TransitionProperties__Group_0__0 ) )
                    // InternalTSE.g:333:3: ( rule__TransitionProperties__Group_0__0 )
                    {
                     before(grammarAccess.getTransitionPropertiesAccess().getGroup_0()); 
                    // InternalTSE.g:334:3: ( rule__TransitionProperties__Group_0__0 )
                    // InternalTSE.g:334:4: rule__TransitionProperties__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionProperties__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionPropertiesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:338:2: ( ( rule__TransitionProperties__Group_1__0 ) )
                    {
                    // InternalTSE.g:338:2: ( ( rule__TransitionProperties__Group_1__0 ) )
                    // InternalTSE.g:339:3: ( rule__TransitionProperties__Group_1__0 )
                    {
                     before(grammarAccess.getTransitionPropertiesAccess().getGroup_1()); 
                    // InternalTSE.g:340:3: ( rule__TransitionProperties__Group_1__0 )
                    // InternalTSE.g:340:4: rule__TransitionProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionProperties__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionPropertiesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTSE.g:344:2: ( ( rule__TransitionProperties__Group_2__0 ) )
                    {
                    // InternalTSE.g:344:2: ( ( rule__TransitionProperties__Group_2__0 ) )
                    // InternalTSE.g:345:3: ( rule__TransitionProperties__Group_2__0 )
                    {
                     before(grammarAccess.getTransitionPropertiesAccess().getGroup_2()); 
                    // InternalTSE.g:346:3: ( rule__TransitionProperties__Group_2__0 )
                    // InternalTSE.g:346:4: rule__TransitionProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionProperties__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionPropertiesAccess().getGroup_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Alternatives"


    // $ANTLR start "rule__State__Group__0"
    // InternalTSE.g:354:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:358:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalTSE.g:359:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalTSE.g:366:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:370:1: ( ( 'state' ) )
            // InternalTSE.g:371:1: ( 'state' )
            {
            // InternalTSE.g:371:1: ( 'state' )
            // InternalTSE.g:372:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalTSE.g:381:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:385:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalTSE.g:386:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalTSE.g:393:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:397:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalTSE.g:398:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalTSE.g:398:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalTSE.g:399:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalTSE.g:400:2: ( rule__State__NameAssignment_1 )
            // InternalTSE.g:400:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalTSE.g:408:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:412:1: ( rule__State__Group__2__Impl )
            // InternalTSE.g:413:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalTSE.g:419:1: rule__State__Group__2__Impl : ( ( ( rule__State__StatesPropertiesAssignment_2 ) ) ( ( rule__State__StatesPropertiesAssignment_2 )* ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:423:1: ( ( ( ( rule__State__StatesPropertiesAssignment_2 ) ) ( ( rule__State__StatesPropertiesAssignment_2 )* ) ) )
            // InternalTSE.g:424:1: ( ( ( rule__State__StatesPropertiesAssignment_2 ) ) ( ( rule__State__StatesPropertiesAssignment_2 )* ) )
            {
            // InternalTSE.g:424:1: ( ( ( rule__State__StatesPropertiesAssignment_2 ) ) ( ( rule__State__StatesPropertiesAssignment_2 )* ) )
            // InternalTSE.g:425:2: ( ( rule__State__StatesPropertiesAssignment_2 ) ) ( ( rule__State__StatesPropertiesAssignment_2 )* )
            {
            // InternalTSE.g:425:2: ( ( rule__State__StatesPropertiesAssignment_2 ) )
            // InternalTSE.g:426:3: ( rule__State__StatesPropertiesAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getStatesPropertiesAssignment_2()); 
            // InternalTSE.g:427:3: ( rule__State__StatesPropertiesAssignment_2 )
            // InternalTSE.g:427:4: rule__State__StatesPropertiesAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__State__StatesPropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatesPropertiesAssignment_2()); 

            }

            // InternalTSE.g:430:2: ( ( rule__State__StatesPropertiesAssignment_2 )* )
            // InternalTSE.g:431:3: ( rule__State__StatesPropertiesAssignment_2 )*
            {
             before(grammarAccess.getStateAccess().getStatesPropertiesAssignment_2()); 
            // InternalTSE.g:432:3: ( rule__State__StatesPropertiesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DEFAULT||(LA6_0>=16 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTSE.g:432:4: rule__State__StatesPropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__State__StatesPropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getStatesPropertiesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__StatesProperties__Group_0__0"
    // InternalTSE.g:442:1: rule__StatesProperties__Group_0__0 : rule__StatesProperties__Group_0__0__Impl rule__StatesProperties__Group_0__1 ;
    public final void rule__StatesProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:446:1: ( rule__StatesProperties__Group_0__0__Impl rule__StatesProperties__Group_0__1 )
            // InternalTSE.g:447:2: rule__StatesProperties__Group_0__0__Impl rule__StatesProperties__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__StatesProperties__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_0__0"


    // $ANTLR start "rule__StatesProperties__Group_0__0__Impl"
    // InternalTSE.g:454:1: rule__StatesProperties__Group_0__0__Impl : ( 'color' ) ;
    public final void rule__StatesProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:458:1: ( ( 'color' ) )
            // InternalTSE.g:459:1: ( 'color' )
            {
            // InternalTSE.g:459:1: ( 'color' )
            // InternalTSE.g:460:2: 'color'
            {
             before(grammarAccess.getStatesPropertiesAccess().getColorKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getColorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_0__0__Impl"


    // $ANTLR start "rule__StatesProperties__Group_0__1"
    // InternalTSE.g:469:1: rule__StatesProperties__Group_0__1 : rule__StatesProperties__Group_0__1__Impl ;
    public final void rule__StatesProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:473:1: ( rule__StatesProperties__Group_0__1__Impl )
            // InternalTSE.g:474:2: rule__StatesProperties__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_0__1"


    // $ANTLR start "rule__StatesProperties__Group_0__1__Impl"
    // InternalTSE.g:480:1: rule__StatesProperties__Group_0__1__Impl : ( ( rule__StatesProperties__ColorAssignment_0_1 ) ) ;
    public final void rule__StatesProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:484:1: ( ( ( rule__StatesProperties__ColorAssignment_0_1 ) ) )
            // InternalTSE.g:485:1: ( ( rule__StatesProperties__ColorAssignment_0_1 ) )
            {
            // InternalTSE.g:485:1: ( ( rule__StatesProperties__ColorAssignment_0_1 ) )
            // InternalTSE.g:486:2: ( rule__StatesProperties__ColorAssignment_0_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getColorAssignment_0_1()); 
            // InternalTSE.g:487:2: ( rule__StatesProperties__ColorAssignment_0_1 )
            // InternalTSE.g:487:3: rule__StatesProperties__ColorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__ColorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStatesPropertiesAccess().getColorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_0__1__Impl"


    // $ANTLR start "rule__StatesProperties__Group_1__0"
    // InternalTSE.g:496:1: rule__StatesProperties__Group_1__0 : rule__StatesProperties__Group_1__0__Impl rule__StatesProperties__Group_1__1 ;
    public final void rule__StatesProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:500:1: ( rule__StatesProperties__Group_1__0__Impl rule__StatesProperties__Group_1__1 )
            // InternalTSE.g:501:2: rule__StatesProperties__Group_1__0__Impl rule__StatesProperties__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__StatesProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_1__0"


    // $ANTLR start "rule__StatesProperties__Group_1__0__Impl"
    // InternalTSE.g:508:1: rule__StatesProperties__Group_1__0__Impl : ( 'thickness' ) ;
    public final void rule__StatesProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:512:1: ( ( 'thickness' ) )
            // InternalTSE.g:513:1: ( 'thickness' )
            {
            // InternalTSE.g:513:1: ( 'thickness' )
            // InternalTSE.g:514:2: 'thickness'
            {
             before(grammarAccess.getStatesPropertiesAccess().getThicknessKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getThicknessKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_1__0__Impl"


    // $ANTLR start "rule__StatesProperties__Group_1__1"
    // InternalTSE.g:523:1: rule__StatesProperties__Group_1__1 : rule__StatesProperties__Group_1__1__Impl ;
    public final void rule__StatesProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:527:1: ( rule__StatesProperties__Group_1__1__Impl )
            // InternalTSE.g:528:2: rule__StatesProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_1__1"


    // $ANTLR start "rule__StatesProperties__Group_1__1__Impl"
    // InternalTSE.g:534:1: rule__StatesProperties__Group_1__1__Impl : ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) ) ;
    public final void rule__StatesProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:538:1: ( ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) ) )
            // InternalTSE.g:539:1: ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) )
            {
            // InternalTSE.g:539:1: ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) )
            // InternalTSE.g:540:2: ( rule__StatesProperties__ThicknessAssignment_1_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getThicknessAssignment_1_1()); 
            // InternalTSE.g:541:2: ( rule__StatesProperties__ThicknessAssignment_1_1 )
            // InternalTSE.g:541:3: rule__StatesProperties__ThicknessAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__ThicknessAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatesPropertiesAccess().getThicknessAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_1__1__Impl"


    // $ANTLR start "rule__StatesProperties__Group_2__0"
    // InternalTSE.g:550:1: rule__StatesProperties__Group_2__0 : rule__StatesProperties__Group_2__0__Impl rule__StatesProperties__Group_2__1 ;
    public final void rule__StatesProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:554:1: ( rule__StatesProperties__Group_2__0__Impl rule__StatesProperties__Group_2__1 )
            // InternalTSE.g:555:2: rule__StatesProperties__Group_2__0__Impl rule__StatesProperties__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__StatesProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_2__0"


    // $ANTLR start "rule__StatesProperties__Group_2__0__Impl"
    // InternalTSE.g:562:1: rule__StatesProperties__Group_2__0__Impl : ( 'position' ) ;
    public final void rule__StatesProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:566:1: ( ( 'position' ) )
            // InternalTSE.g:567:1: ( 'position' )
            {
            // InternalTSE.g:567:1: ( 'position' )
            // InternalTSE.g:568:2: 'position'
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getPositionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_2__0__Impl"


    // $ANTLR start "rule__StatesProperties__Group_2__1"
    // InternalTSE.g:577:1: rule__StatesProperties__Group_2__1 : rule__StatesProperties__Group_2__1__Impl ;
    public final void rule__StatesProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:581:1: ( rule__StatesProperties__Group_2__1__Impl )
            // InternalTSE.g:582:2: rule__StatesProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_2__1"


    // $ANTLR start "rule__StatesProperties__Group_2__1__Impl"
    // InternalTSE.g:588:1: rule__StatesProperties__Group_2__1__Impl : ( ( rule__StatesProperties__PositionAssignment_2_1 ) ) ;
    public final void rule__StatesProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:592:1: ( ( ( rule__StatesProperties__PositionAssignment_2_1 ) ) )
            // InternalTSE.g:593:1: ( ( rule__StatesProperties__PositionAssignment_2_1 ) )
            {
            // InternalTSE.g:593:1: ( ( rule__StatesProperties__PositionAssignment_2_1 ) )
            // InternalTSE.g:594:2: ( rule__StatesProperties__PositionAssignment_2_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionAssignment_2_1()); 
            // InternalTSE.g:595:2: ( rule__StatesProperties__PositionAssignment_2_1 )
            // InternalTSE.g:595:3: rule__StatesProperties__PositionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__PositionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatesPropertiesAccess().getPositionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_2__1__Impl"


    // $ANTLR start "rule__StatesProperties__Group_3__0"
    // InternalTSE.g:604:1: rule__StatesProperties__Group_3__0 : rule__StatesProperties__Group_3__0__Impl rule__StatesProperties__Group_3__1 ;
    public final void rule__StatesProperties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:608:1: ( rule__StatesProperties__Group_3__0__Impl rule__StatesProperties__Group_3__1 )
            // InternalTSE.g:609:2: rule__StatesProperties__Group_3__0__Impl rule__StatesProperties__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__StatesProperties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_3__0"


    // $ANTLR start "rule__StatesProperties__Group_3__0__Impl"
    // InternalTSE.g:616:1: rule__StatesProperties__Group_3__0__Impl : ( RULE_DEFAULT ) ;
    public final void rule__StatesProperties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:620:1: ( ( RULE_DEFAULT ) )
            // InternalTSE.g:621:1: ( RULE_DEFAULT )
            {
            // InternalTSE.g:621:1: ( RULE_DEFAULT )
            // InternalTSE.g:622:2: RULE_DEFAULT
            {
             before(grammarAccess.getStatesPropertiesAccess().getDEFAULTTerminalRuleCall_3_0()); 
            match(input,RULE_DEFAULT,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getDEFAULTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_3__0__Impl"


    // $ANTLR start "rule__StatesProperties__Group_3__1"
    // InternalTSE.g:631:1: rule__StatesProperties__Group_3__1 : rule__StatesProperties__Group_3__1__Impl ;
    public final void rule__StatesProperties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:635:1: ( rule__StatesProperties__Group_3__1__Impl )
            // InternalTSE.g:636:2: rule__StatesProperties__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_3__1"


    // $ANTLR start "rule__StatesProperties__Group_3__1__Impl"
    // InternalTSE.g:642:1: rule__StatesProperties__Group_3__1__Impl : ( ( rule__StatesProperties__PositionAssignment_3_1 ) ) ;
    public final void rule__StatesProperties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:646:1: ( ( ( rule__StatesProperties__PositionAssignment_3_1 ) ) )
            // InternalTSE.g:647:1: ( ( rule__StatesProperties__PositionAssignment_3_1 ) )
            {
            // InternalTSE.g:647:1: ( ( rule__StatesProperties__PositionAssignment_3_1 ) )
            // InternalTSE.g:648:2: ( rule__StatesProperties__PositionAssignment_3_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionAssignment_3_1()); 
            // InternalTSE.g:649:2: ( rule__StatesProperties__PositionAssignment_3_1 )
            // InternalTSE.g:649:3: rule__StatesProperties__PositionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StatesProperties__PositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatesPropertiesAccess().getPositionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_0__0"
    // InternalTSE.g:658:1: rule__Transition__Group_0__0 : rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 ;
    public final void rule__Transition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:662:1: ( rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 )
            // InternalTSE.g:663:2: rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0"


    // $ANTLR start "rule__Transition__Group_0__0__Impl"
    // InternalTSE.g:670:1: rule__Transition__Group_0__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:674:1: ( ( 'transition' ) )
            // InternalTSE.g:675:1: ( 'transition' )
            {
            // InternalTSE.g:675:1: ( 'transition' )
            // InternalTSE.g:676:2: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0__1"
    // InternalTSE.g:685:1: rule__Transition__Group_0__1 : rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 ;
    public final void rule__Transition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:689:1: ( rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 )
            // InternalTSE.g:690:2: rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Transition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1"


    // $ANTLR start "rule__Transition__Group_0__1__Impl"
    // InternalTSE.g:697:1: rule__Transition__Group_0__1__Impl : ( ( rule__Transition__StartAssignment_0_1 ) ) ;
    public final void rule__Transition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:701:1: ( ( ( rule__Transition__StartAssignment_0_1 ) ) )
            // InternalTSE.g:702:1: ( ( rule__Transition__StartAssignment_0_1 ) )
            {
            // InternalTSE.g:702:1: ( ( rule__Transition__StartAssignment_0_1 ) )
            // InternalTSE.g:703:2: ( rule__Transition__StartAssignment_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getStartAssignment_0_1()); 
            // InternalTSE.g:704:2: ( rule__Transition__StartAssignment_0_1 )
            // InternalTSE.g:704:3: rule__Transition__StartAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__StartAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStartAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0__2"
    // InternalTSE.g:712:1: rule__Transition__Group_0__2 : rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3 ;
    public final void rule__Transition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:716:1: ( rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3 )
            // InternalTSE.g:717:2: rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__2"


    // $ANTLR start "rule__Transition__Group_0__2__Impl"
    // InternalTSE.g:724:1: rule__Transition__Group_0__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:728:1: ( ( '->' ) )
            // InternalTSE.g:729:1: ( '->' )
            {
            // InternalTSE.g:729:1: ( '->' )
            // InternalTSE.g:730:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_0__3"
    // InternalTSE.g:739:1: rule__Transition__Group_0__3 : rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4 ;
    public final void rule__Transition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:743:1: ( rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4 )
            // InternalTSE.g:744:2: rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__3"


    // $ANTLR start "rule__Transition__Group_0__3__Impl"
    // InternalTSE.g:751:1: rule__Transition__Group_0__3__Impl : ( ( rule__Transition__EndAssignment_0_3 ) ) ;
    public final void rule__Transition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:755:1: ( ( ( rule__Transition__EndAssignment_0_3 ) ) )
            // InternalTSE.g:756:1: ( ( rule__Transition__EndAssignment_0_3 ) )
            {
            // InternalTSE.g:756:1: ( ( rule__Transition__EndAssignment_0_3 ) )
            // InternalTSE.g:757:2: ( rule__Transition__EndAssignment_0_3 )
            {
             before(grammarAccess.getTransitionAccess().getEndAssignment_0_3()); 
            // InternalTSE.g:758:2: ( rule__Transition__EndAssignment_0_3 )
            // InternalTSE.g:758:3: rule__Transition__EndAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__EndAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEndAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__3__Impl"


    // $ANTLR start "rule__Transition__Group_0__4"
    // InternalTSE.g:766:1: rule__Transition__Group_0__4 : rule__Transition__Group_0__4__Impl rule__Transition__Group_0__5 ;
    public final void rule__Transition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:770:1: ( rule__Transition__Group_0__4__Impl rule__Transition__Group_0__5 )
            // InternalTSE.g:771:2: rule__Transition__Group_0__4__Impl rule__Transition__Group_0__5
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__4"


    // $ANTLR start "rule__Transition__Group_0__4__Impl"
    // InternalTSE.g:778:1: rule__Transition__Group_0__4__Impl : ( ( rule__Transition__TransitionPropertiesAssignment_0_4 )* ) ;
    public final void rule__Transition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:782:1: ( ( ( rule__Transition__TransitionPropertiesAssignment_0_4 )* ) )
            // InternalTSE.g:783:1: ( ( rule__Transition__TransitionPropertiesAssignment_0_4 )* )
            {
            // InternalTSE.g:783:1: ( ( rule__Transition__TransitionPropertiesAssignment_0_4 )* )
            // InternalTSE.g:784:2: ( rule__Transition__TransitionPropertiesAssignment_0_4 )*
            {
             before(grammarAccess.getTransitionAccess().getTransitionPropertiesAssignment_0_4()); 
            // InternalTSE.g:785:2: ( rule__Transition__TransitionPropertiesAssignment_0_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTSE.g:785:3: rule__Transition__TransitionPropertiesAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Transition__TransitionPropertiesAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getTransitionPropertiesAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__4__Impl"


    // $ANTLR start "rule__Transition__Group_0__5"
    // InternalTSE.g:793:1: rule__Transition__Group_0__5 : rule__Transition__Group_0__5__Impl ;
    public final void rule__Transition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:797:1: ( rule__Transition__Group_0__5__Impl )
            // InternalTSE.g:798:2: rule__Transition__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__5"


    // $ANTLR start "rule__Transition__Group_0__5__Impl"
    // InternalTSE.g:804:1: rule__Transition__Group_0__5__Impl : ( ( rule__Transition__LabelAssignment_0_5 )? ) ;
    public final void rule__Transition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:808:1: ( ( ( rule__Transition__LabelAssignment_0_5 )? ) )
            // InternalTSE.g:809:1: ( ( rule__Transition__LabelAssignment_0_5 )? )
            {
            // InternalTSE.g:809:1: ( ( rule__Transition__LabelAssignment_0_5 )? )
            // InternalTSE.g:810:2: ( rule__Transition__LabelAssignment_0_5 )?
            {
             before(grammarAccess.getTransitionAccess().getLabelAssignment_0_5()); 
            // InternalTSE.g:811:2: ( rule__Transition__LabelAssignment_0_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTSE.g:811:3: rule__Transition__LabelAssignment_0_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__LabelAssignment_0_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getLabelAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__5__Impl"


    // $ANTLR start "rule__Transition__Group_1__0"
    // InternalTSE.g:820:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:824:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalTSE.g:825:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0"


    // $ANTLR start "rule__Transition__Group_1__0__Impl"
    // InternalTSE.g:832:1: rule__Transition__Group_1__0__Impl : ( 'initialTransition' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:836:1: ( ( 'initialTransition' ) )
            // InternalTSE.g:837:1: ( 'initialTransition' )
            {
            // InternalTSE.g:837:1: ( 'initialTransition' )
            // InternalTSE.g:838:2: 'initialTransition'
            {
             before(grammarAccess.getTransitionAccess().getInitialTransitionKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInitialTransitionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1__1"
    // InternalTSE.g:847:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:851:1: ( rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 )
            // InternalTSE.g:852:2: rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1"


    // $ANTLR start "rule__Transition__Group_1__1__Impl"
    // InternalTSE.g:859:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__InitAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:863:1: ( ( ( rule__Transition__InitAssignment_1_1 ) ) )
            // InternalTSE.g:864:1: ( ( rule__Transition__InitAssignment_1_1 ) )
            {
            // InternalTSE.g:864:1: ( ( rule__Transition__InitAssignment_1_1 ) )
            // InternalTSE.g:865:2: ( rule__Transition__InitAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getInitAssignment_1_1()); 
            // InternalTSE.g:866:2: ( rule__Transition__InitAssignment_1_1 )
            // InternalTSE.g:866:3: rule__Transition__InitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__InitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_1__2"
    // InternalTSE.g:874:1: rule__Transition__Group_1__2 : rule__Transition__Group_1__2__Impl ;
    public final void rule__Transition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:878:1: ( rule__Transition__Group_1__2__Impl )
            // InternalTSE.g:879:2: rule__Transition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__2"


    // $ANTLR start "rule__Transition__Group_1__2__Impl"
    // InternalTSE.g:885:1: rule__Transition__Group_1__2__Impl : ( RULE_COORDINATES ) ;
    public final void rule__Transition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:889:1: ( ( RULE_COORDINATES ) )
            // InternalTSE.g:890:1: ( RULE_COORDINATES )
            {
            // InternalTSE.g:890:1: ( RULE_COORDINATES )
            // InternalTSE.g:891:2: RULE_COORDINATES
            {
             before(grammarAccess.getTransitionAccess().getCOORDINATESTerminalRuleCall_1_2()); 
            match(input,RULE_COORDINATES,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCOORDINATESTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__2__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalTSE.g:901:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:905:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalTSE.g:906:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalTSE.g:913:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:917:1: ( ( 'label' ) )
            // InternalTSE.g:918:1: ( 'label' )
            {
            // InternalTSE.g:918:1: ( 'label' )
            // InternalTSE.g:919:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalTSE.g:928:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:932:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalTSE.g:933:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalTSE.g:940:1: rule__Label__Group__1__Impl : ( ( rule__Label__TextAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:944:1: ( ( ( rule__Label__TextAssignment_1 ) ) )
            // InternalTSE.g:945:1: ( ( rule__Label__TextAssignment_1 ) )
            {
            // InternalTSE.g:945:1: ( ( rule__Label__TextAssignment_1 ) )
            // InternalTSE.g:946:2: ( rule__Label__TextAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment_1()); 
            // InternalTSE.g:947:2: ( rule__Label__TextAssignment_1 )
            // InternalTSE.g:947:3: rule__Label__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Label__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalTSE.g:955:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:959:1: ( rule__Label__Group__2__Impl )
            // InternalTSE.g:960:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalTSE.g:966:1: rule__Label__Group__2__Impl : ( ( rule__Label__PositionAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:970:1: ( ( ( rule__Label__PositionAssignment_2 ) ) )
            // InternalTSE.g:971:1: ( ( rule__Label__PositionAssignment_2 ) )
            {
            // InternalTSE.g:971:1: ( ( rule__Label__PositionAssignment_2 ) )
            // InternalTSE.g:972:2: ( rule__Label__PositionAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getPositionAssignment_2()); 
            // InternalTSE.g:973:2: ( rule__Label__PositionAssignment_2 )
            // InternalTSE.g:973:3: rule__Label__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__PositionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getPositionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_0__0"
    // InternalTSE.g:982:1: rule__TransitionProperties__Group_0__0 : rule__TransitionProperties__Group_0__0__Impl rule__TransitionProperties__Group_0__1 ;
    public final void rule__TransitionProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:986:1: ( rule__TransitionProperties__Group_0__0__Impl rule__TransitionProperties__Group_0__1 )
            // InternalTSE.g:987:2: rule__TransitionProperties__Group_0__0__Impl rule__TransitionProperties__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__TransitionProperties__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_0__0"


    // $ANTLR start "rule__TransitionProperties__Group_0__0__Impl"
    // InternalTSE.g:994:1: rule__TransitionProperties__Group_0__0__Impl : ( 'color' ) ;
    public final void rule__TransitionProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:998:1: ( ( 'color' ) )
            // InternalTSE.g:999:1: ( 'color' )
            {
            // InternalTSE.g:999:1: ( 'color' )
            // InternalTSE.g:1000:2: 'color'
            {
             before(grammarAccess.getTransitionPropertiesAccess().getColorKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getColorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_0__0__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_0__1"
    // InternalTSE.g:1009:1: rule__TransitionProperties__Group_0__1 : rule__TransitionProperties__Group_0__1__Impl ;
    public final void rule__TransitionProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1013:1: ( rule__TransitionProperties__Group_0__1__Impl )
            // InternalTSE.g:1014:2: rule__TransitionProperties__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_0__1"


    // $ANTLR start "rule__TransitionProperties__Group_0__1__Impl"
    // InternalTSE.g:1020:1: rule__TransitionProperties__Group_0__1__Impl : ( ( rule__TransitionProperties__ColorAssignment_0_1 ) ) ;
    public final void rule__TransitionProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1024:1: ( ( ( rule__TransitionProperties__ColorAssignment_0_1 ) ) )
            // InternalTSE.g:1025:1: ( ( rule__TransitionProperties__ColorAssignment_0_1 ) )
            {
            // InternalTSE.g:1025:1: ( ( rule__TransitionProperties__ColorAssignment_0_1 ) )
            // InternalTSE.g:1026:2: ( rule__TransitionProperties__ColorAssignment_0_1 )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getColorAssignment_0_1()); 
            // InternalTSE.g:1027:2: ( rule__TransitionProperties__ColorAssignment_0_1 )
            // InternalTSE.g:1027:3: rule__TransitionProperties__ColorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__ColorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionPropertiesAccess().getColorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_0__1__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_1__0"
    // InternalTSE.g:1036:1: rule__TransitionProperties__Group_1__0 : rule__TransitionProperties__Group_1__0__Impl rule__TransitionProperties__Group_1__1 ;
    public final void rule__TransitionProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1040:1: ( rule__TransitionProperties__Group_1__0__Impl rule__TransitionProperties__Group_1__1 )
            // InternalTSE.g:1041:2: rule__TransitionProperties__Group_1__0__Impl rule__TransitionProperties__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__TransitionProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_1__0"


    // $ANTLR start "rule__TransitionProperties__Group_1__0__Impl"
    // InternalTSE.g:1048:1: rule__TransitionProperties__Group_1__0__Impl : ( 'thickness' ) ;
    public final void rule__TransitionProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1052:1: ( ( 'thickness' ) )
            // InternalTSE.g:1053:1: ( 'thickness' )
            {
            // InternalTSE.g:1053:1: ( 'thickness' )
            // InternalTSE.g:1054:2: 'thickness'
            {
             before(grammarAccess.getTransitionPropertiesAccess().getThicknessKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getThicknessKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_1__0__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_1__1"
    // InternalTSE.g:1063:1: rule__TransitionProperties__Group_1__1 : rule__TransitionProperties__Group_1__1__Impl ;
    public final void rule__TransitionProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1067:1: ( rule__TransitionProperties__Group_1__1__Impl )
            // InternalTSE.g:1068:2: rule__TransitionProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_1__1"


    // $ANTLR start "rule__TransitionProperties__Group_1__1__Impl"
    // InternalTSE.g:1074:1: rule__TransitionProperties__Group_1__1__Impl : ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) ) ;
    public final void rule__TransitionProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1078:1: ( ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) ) )
            // InternalTSE.g:1079:1: ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) )
            {
            // InternalTSE.g:1079:1: ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) )
            // InternalTSE.g:1080:2: ( rule__TransitionProperties__ThicknessAssignment_1_1 )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getThicknessAssignment_1_1()); 
            // InternalTSE.g:1081:2: ( rule__TransitionProperties__ThicknessAssignment_1_1 )
            // InternalTSE.g:1081:3: rule__TransitionProperties__ThicknessAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__ThicknessAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionPropertiesAccess().getThicknessAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_1__1__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_2__0"
    // InternalTSE.g:1090:1: rule__TransitionProperties__Group_2__0 : rule__TransitionProperties__Group_2__0__Impl rule__TransitionProperties__Group_2__1 ;
    public final void rule__TransitionProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1094:1: ( rule__TransitionProperties__Group_2__0__Impl rule__TransitionProperties__Group_2__1 )
            // InternalTSE.g:1095:2: rule__TransitionProperties__Group_2__0__Impl rule__TransitionProperties__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__TransitionProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_2__0"


    // $ANTLR start "rule__TransitionProperties__Group_2__0__Impl"
    // InternalTSE.g:1102:1: rule__TransitionProperties__Group_2__0__Impl : ( 'curvature' ) ;
    public final void rule__TransitionProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1106:1: ( ( 'curvature' ) )
            // InternalTSE.g:1107:1: ( 'curvature' )
            {
            // InternalTSE.g:1107:1: ( 'curvature' )
            // InternalTSE.g:1108:2: 'curvature'
            {
             before(grammarAccess.getTransitionPropertiesAccess().getCurvatureKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getCurvatureKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_2__0__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_2__1"
    // InternalTSE.g:1117:1: rule__TransitionProperties__Group_2__1 : rule__TransitionProperties__Group_2__1__Impl ;
    public final void rule__TransitionProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1121:1: ( rule__TransitionProperties__Group_2__1__Impl )
            // InternalTSE.g:1122:2: rule__TransitionProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_2__1"


    // $ANTLR start "rule__TransitionProperties__Group_2__1__Impl"
    // InternalTSE.g:1128:1: rule__TransitionProperties__Group_2__1__Impl : ( ( rule__TransitionProperties__CurveAssignment_2_1 ) ) ;
    public final void rule__TransitionProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1132:1: ( ( ( rule__TransitionProperties__CurveAssignment_2_1 ) ) )
            // InternalTSE.g:1133:1: ( ( rule__TransitionProperties__CurveAssignment_2_1 ) )
            {
            // InternalTSE.g:1133:1: ( ( rule__TransitionProperties__CurveAssignment_2_1 ) )
            // InternalTSE.g:1134:2: ( rule__TransitionProperties__CurveAssignment_2_1 )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getCurveAssignment_2_1()); 
            // InternalTSE.g:1135:2: ( rule__TransitionProperties__CurveAssignment_2_1 )
            // InternalTSE.g:1135:3: rule__TransitionProperties__CurveAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__CurveAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionPropertiesAccess().getCurveAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__Group_2__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalTSE.g:1144:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1148:1: ( ( ruleElement ) )
            // InternalTSE.g:1149:2: ( ruleElement )
            {
            // InternalTSE.g:1149:2: ( ruleElement )
            // InternalTSE.g:1150:3: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Element__StateAssignment_0"
    // InternalTSE.g:1159:1: rule__Element__StateAssignment_0 : ( ruleState ) ;
    public final void rule__Element__StateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1163:1: ( ( ruleState ) )
            // InternalTSE.g:1164:2: ( ruleState )
            {
            // InternalTSE.g:1164:2: ( ruleState )
            // InternalTSE.g:1165:3: ruleState
            {
             before(grammarAccess.getElementAccess().getStateStateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getElementAccess().getStateStateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__StateAssignment_0"


    // $ANTLR start "rule__Element__TransitionAssignment_1"
    // InternalTSE.g:1174:1: rule__Element__TransitionAssignment_1 : ( ruleTransition ) ;
    public final void rule__Element__TransitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1178:1: ( ( ruleTransition ) )
            // InternalTSE.g:1179:2: ( ruleTransition )
            {
            // InternalTSE.g:1179:2: ( ruleTransition )
            // InternalTSE.g:1180:3: ruleTransition
            {
             before(grammarAccess.getElementAccess().getTransitionTransitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getElementAccess().getTransitionTransitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TransitionAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalTSE.g:1189:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1193:1: ( ( RULE_ID ) )
            // InternalTSE.g:1194:2: ( RULE_ID )
            {
            // InternalTSE.g:1194:2: ( RULE_ID )
            // InternalTSE.g:1195:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__StatesPropertiesAssignment_2"
    // InternalTSE.g:1204:1: rule__State__StatesPropertiesAssignment_2 : ( ruleStatesProperties ) ;
    public final void rule__State__StatesPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1208:1: ( ( ruleStatesProperties ) )
            // InternalTSE.g:1209:2: ( ruleStatesProperties )
            {
            // InternalTSE.g:1209:2: ( ruleStatesProperties )
            // InternalTSE.g:1210:3: ruleStatesProperties
            {
             before(grammarAccess.getStateAccess().getStatesPropertiesStatesPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatesProperties();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatesPropertiesStatesPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatesPropertiesAssignment_2"


    // $ANTLR start "rule__StatesProperties__ColorAssignment_0_1"
    // InternalTSE.g:1219:1: rule__StatesProperties__ColorAssignment_0_1 : ( RULE_COLOR ) ;
    public final void rule__StatesProperties__ColorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1223:1: ( ( RULE_COLOR ) )
            // InternalTSE.g:1224:2: ( RULE_COLOR )
            {
            // InternalTSE.g:1224:2: ( RULE_COLOR )
            // InternalTSE.g:1225:3: RULE_COLOR
            {
             before(grammarAccess.getStatesPropertiesAccess().getColorCOLORTerminalRuleCall_0_1_0()); 
            match(input,RULE_COLOR,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getColorCOLORTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__ColorAssignment_0_1"


    // $ANTLR start "rule__StatesProperties__ThicknessAssignment_1_1"
    // InternalTSE.g:1234:1: rule__StatesProperties__ThicknessAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__StatesProperties__ThicknessAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1238:1: ( ( RULE_FLOAT ) )
            // InternalTSE.g:1239:2: ( RULE_FLOAT )
            {
            // InternalTSE.g:1239:2: ( RULE_FLOAT )
            // InternalTSE.g:1240:3: RULE_FLOAT
            {
             before(grammarAccess.getStatesPropertiesAccess().getThicknessFLOATTerminalRuleCall_1_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getThicknessFLOATTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__ThicknessAssignment_1_1"


    // $ANTLR start "rule__StatesProperties__PositionAssignment_2_1"
    // InternalTSE.g:1249:1: rule__StatesProperties__PositionAssignment_2_1 : ( RULE_COORDINATES ) ;
    public final void rule__StatesProperties__PositionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1253:1: ( ( RULE_COORDINATES ) )
            // InternalTSE.g:1254:2: ( RULE_COORDINATES )
            {
            // InternalTSE.g:1254:2: ( RULE_COORDINATES )
            // InternalTSE.g:1255:3: RULE_COORDINATES
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionCOORDINATESTerminalRuleCall_2_1_0()); 
            match(input,RULE_COORDINATES,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getPositionCOORDINATESTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__PositionAssignment_2_1"


    // $ANTLR start "rule__StatesProperties__PositionAssignment_3_1"
    // InternalTSE.g:1264:1: rule__StatesProperties__PositionAssignment_3_1 : ( RULE_COORDINATES ) ;
    public final void rule__StatesProperties__PositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1268:1: ( ( RULE_COORDINATES ) )
            // InternalTSE.g:1269:2: ( RULE_COORDINATES )
            {
            // InternalTSE.g:1269:2: ( RULE_COORDINATES )
            // InternalTSE.g:1270:3: RULE_COORDINATES
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionCOORDINATESTerminalRuleCall_3_1_0()); 
            match(input,RULE_COORDINATES,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getPositionCOORDINATESTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatesProperties__PositionAssignment_3_1"


    // $ANTLR start "rule__Transition__StartAssignment_0_1"
    // InternalTSE.g:1279:1: rule__Transition__StartAssignment_0_1 : ( ruleCoordinatesStatesTransition ) ;
    public final void rule__Transition__StartAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1283:1: ( ( ruleCoordinatesStatesTransition ) )
            // InternalTSE.g:1284:2: ( ruleCoordinatesStatesTransition )
            {
            // InternalTSE.g:1284:2: ( ruleCoordinatesStatesTransition )
            // InternalTSE.g:1285:3: ruleCoordinatesStatesTransition
            {
             before(grammarAccess.getTransitionAccess().getStartCoordinatesStatesTransitionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinatesStatesTransition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getStartCoordinatesStatesTransitionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StartAssignment_0_1"


    // $ANTLR start "rule__Transition__EndAssignment_0_3"
    // InternalTSE.g:1294:1: rule__Transition__EndAssignment_0_3 : ( ruleCoordinatesStatesTransition ) ;
    public final void rule__Transition__EndAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1298:1: ( ( ruleCoordinatesStatesTransition ) )
            // InternalTSE.g:1299:2: ( ruleCoordinatesStatesTransition )
            {
            // InternalTSE.g:1299:2: ( ruleCoordinatesStatesTransition )
            // InternalTSE.g:1300:3: ruleCoordinatesStatesTransition
            {
             before(grammarAccess.getTransitionAccess().getEndCoordinatesStatesTransitionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinatesStatesTransition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEndCoordinatesStatesTransitionParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EndAssignment_0_3"


    // $ANTLR start "rule__Transition__TransitionPropertiesAssignment_0_4"
    // InternalTSE.g:1309:1: rule__Transition__TransitionPropertiesAssignment_0_4 : ( ruleTransitionProperties ) ;
    public final void rule__Transition__TransitionPropertiesAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1313:1: ( ( ruleTransitionProperties ) )
            // InternalTSE.g:1314:2: ( ruleTransitionProperties )
            {
            // InternalTSE.g:1314:2: ( ruleTransitionProperties )
            // InternalTSE.g:1315:3: ruleTransitionProperties
            {
             before(grammarAccess.getTransitionAccess().getTransitionPropertiesTransitionPropertiesParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionProperties();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTransitionPropertiesTransitionPropertiesParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TransitionPropertiesAssignment_0_4"


    // $ANTLR start "rule__Transition__LabelAssignment_0_5"
    // InternalTSE.g:1324:1: rule__Transition__LabelAssignment_0_5 : ( ruleLabel ) ;
    public final void rule__Transition__LabelAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1328:1: ( ( ruleLabel ) )
            // InternalTSE.g:1329:2: ( ruleLabel )
            {
            // InternalTSE.g:1329:2: ( ruleLabel )
            // InternalTSE.g:1330:3: ruleLabel
            {
             before(grammarAccess.getTransitionAccess().getLabelLabelParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getLabelLabelParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__LabelAssignment_0_5"


    // $ANTLR start "rule__Transition__InitAssignment_1_1"
    // InternalTSE.g:1339:1: rule__Transition__InitAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Transition__InitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1343:1: ( ( RULE_ID ) )
            // InternalTSE.g:1344:2: ( RULE_ID )
            {
            // InternalTSE.g:1344:2: ( RULE_ID )
            // InternalTSE.g:1345:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getInitIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInitIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__InitAssignment_1_1"


    // $ANTLR start "rule__Label__TextAssignment_1"
    // InternalTSE.g:1354:1: rule__Label__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Label__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1358:1: ( ( RULE_STRING ) )
            // InternalTSE.g:1359:2: ( RULE_STRING )
            {
            // InternalTSE.g:1359:2: ( RULE_STRING )
            // InternalTSE.g:1360:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__TextAssignment_1"


    // $ANTLR start "rule__Label__PositionAssignment_2"
    // InternalTSE.g:1369:1: rule__Label__PositionAssignment_2 : ( RULE_COORDINATES ) ;
    public final void rule__Label__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1373:1: ( ( RULE_COORDINATES ) )
            // InternalTSE.g:1374:2: ( RULE_COORDINATES )
            {
            // InternalTSE.g:1374:2: ( RULE_COORDINATES )
            // InternalTSE.g:1375:3: RULE_COORDINATES
            {
             before(grammarAccess.getLabelAccess().getPositionCOORDINATESTerminalRuleCall_2_0()); 
            match(input,RULE_COORDINATES,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getPositionCOORDINATESTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__PositionAssignment_2"


    // $ANTLR start "rule__CoordinatesStatesTransition__StateTransitionAssignment"
    // InternalTSE.g:1384:1: rule__CoordinatesStatesTransition__StateTransitionAssignment : ( RULE_ID ) ;
    public final void rule__CoordinatesStatesTransition__StateTransitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1388:1: ( ( RULE_ID ) )
            // InternalTSE.g:1389:2: ( RULE_ID )
            {
            // InternalTSE.g:1389:2: ( RULE_ID )
            // InternalTSE.g:1390:3: RULE_ID
            {
             before(grammarAccess.getCoordinatesStatesTransitionAccess().getStateTransitionIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinatesStatesTransitionAccess().getStateTransitionIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinatesStatesTransition__StateTransitionAssignment"


    // $ANTLR start "rule__TransitionProperties__ColorAssignment_0_1"
    // InternalTSE.g:1399:1: rule__TransitionProperties__ColorAssignment_0_1 : ( RULE_COLOR ) ;
    public final void rule__TransitionProperties__ColorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1403:1: ( ( RULE_COLOR ) )
            // InternalTSE.g:1404:2: ( RULE_COLOR )
            {
            // InternalTSE.g:1404:2: ( RULE_COLOR )
            // InternalTSE.g:1405:3: RULE_COLOR
            {
             before(grammarAccess.getTransitionPropertiesAccess().getColorCOLORTerminalRuleCall_0_1_0()); 
            match(input,RULE_COLOR,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getColorCOLORTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__ColorAssignment_0_1"


    // $ANTLR start "rule__TransitionProperties__ThicknessAssignment_1_1"
    // InternalTSE.g:1414:1: rule__TransitionProperties__ThicknessAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__TransitionProperties__ThicknessAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1418:1: ( ( RULE_FLOAT ) )
            // InternalTSE.g:1419:2: ( RULE_FLOAT )
            {
            // InternalTSE.g:1419:2: ( RULE_FLOAT )
            // InternalTSE.g:1420:3: RULE_FLOAT
            {
             before(grammarAccess.getTransitionPropertiesAccess().getThicknessFLOATTerminalRuleCall_1_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getThicknessFLOATTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__ThicknessAssignment_1_1"


    // $ANTLR start "rule__TransitionProperties__CurveAssignment_2_1"
    // InternalTSE.g:1429:1: rule__TransitionProperties__CurveAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__TransitionProperties__CurveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1433:1: ( ( RULE_FLOAT ) )
            // InternalTSE.g:1434:2: ( RULE_FLOAT )
            {
            // InternalTSE.g:1434:2: ( RULE_FLOAT )
            // InternalTSE.g:1435:3: RULE_FLOAT
            {
             before(grammarAccess.getTransitionPropertiesAccess().getCurveFLOATTerminalRuleCall_2_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getCurveFLOATTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionProperties__CurveAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000288002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C30000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000830002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});

}