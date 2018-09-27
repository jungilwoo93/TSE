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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DEFAULT", "RULE_INT", "RULE_ID", "RULE_COLOR", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'color'", "'thickness'", "'position'", "'transition'", "'initialTransition'", "'label'", "'->'", "'reflexive'", "'curvature'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_COLOR=7;
    public static final int RULE_DEFAULT=4;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
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

                if ( (LA1_0==14||(LA1_0>=18 && LA1_0<=19)) ) {
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


    // $ANTLR start "entryRuleEndTransition"
    // InternalTSE.g:203:1: entryRuleEndTransition : ruleEndTransition EOF ;
    public final void entryRuleEndTransition() throws RecognitionException {
        try {
            // InternalTSE.g:204:1: ( ruleEndTransition EOF )
            // InternalTSE.g:205:1: ruleEndTransition EOF
            {
             before(grammarAccess.getEndTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleEndTransition();

            state._fsp--;

             after(grammarAccess.getEndTransitionRule()); 
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
    // $ANTLR end "entryRuleEndTransition"


    // $ANTLR start "ruleEndTransition"
    // InternalTSE.g:212:1: ruleEndTransition : ( ( rule__EndTransition__Alternatives ) ) ;
    public final void ruleEndTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:216:2: ( ( ( rule__EndTransition__Alternatives ) ) )
            // InternalTSE.g:217:2: ( ( rule__EndTransition__Alternatives ) )
            {
            // InternalTSE.g:217:2: ( ( rule__EndTransition__Alternatives ) )
            // InternalTSE.g:218:3: ( rule__EndTransition__Alternatives )
            {
             before(grammarAccess.getEndTransitionAccess().getAlternatives()); 
            // InternalTSE.g:219:3: ( rule__EndTransition__Alternatives )
            // InternalTSE.g:219:4: rule__EndTransition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EndTransition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndTransitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEndTransition"


    // $ANTLR start "entryRuletransitionProperties"
    // InternalTSE.g:228:1: entryRuletransitionProperties : ruletransitionProperties EOF ;
    public final void entryRuletransitionProperties() throws RecognitionException {
        try {
            // InternalTSE.g:229:1: ( ruletransitionProperties EOF )
            // InternalTSE.g:230:1: ruletransitionProperties EOF
            {
             before(grammarAccess.getTransitionPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruletransitionProperties();

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
    // $ANTLR end "entryRuletransitionProperties"


    // $ANTLR start "ruletransitionProperties"
    // InternalTSE.g:237:1: ruletransitionProperties : ( ( rule__TransitionProperties__Alternatives ) ) ;
    public final void ruletransitionProperties() throws RecognitionException {

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
    // $ANTLR end "ruletransitionProperties"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalTSE.g:252:1: rule__Element__Alternatives : ( ( ( rule__Element__StatesAssignment_0 ) ) | ( ( rule__Element__TransitionsAssignment_1 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:256:1: ( ( ( rule__Element__StatesAssignment_0 ) ) | ( ( rule__Element__TransitionsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTSE.g:257:2: ( ( rule__Element__StatesAssignment_0 ) )
                    {
                    // InternalTSE.g:257:2: ( ( rule__Element__StatesAssignment_0 ) )
                    // InternalTSE.g:258:3: ( rule__Element__StatesAssignment_0 )
                    {
                     before(grammarAccess.getElementAccess().getStatesAssignment_0()); 
                    // InternalTSE.g:259:3: ( rule__Element__StatesAssignment_0 )
                    // InternalTSE.g:259:4: rule__Element__StatesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__StatesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getStatesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:263:2: ( ( rule__Element__TransitionsAssignment_1 ) )
                    {
                    // InternalTSE.g:263:2: ( ( rule__Element__TransitionsAssignment_1 ) )
                    // InternalTSE.g:264:3: ( rule__Element__TransitionsAssignment_1 )
                    {
                     before(grammarAccess.getElementAccess().getTransitionsAssignment_1()); 
                    // InternalTSE.g:265:3: ( rule__Element__TransitionsAssignment_1 )
                    // InternalTSE.g:265:4: rule__Element__TransitionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__TransitionsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getTransitionsAssignment_1()); 

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
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
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

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
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


    // $ANTLR start "rule__EndTransition__Alternatives"
    // InternalTSE.g:327:1: rule__EndTransition__Alternatives : ( ( ( rule__EndTransition__Group_0__0 ) ) | ( ( rule__EndTransition__Group_1__0 ) ) );
    public final void rule__EndTransition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:331:1: ( ( ( rule__EndTransition__Group_0__0 ) ) | ( ( rule__EndTransition__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTSE.g:332:2: ( ( rule__EndTransition__Group_0__0 ) )
                    {
                    // InternalTSE.g:332:2: ( ( rule__EndTransition__Group_0__0 ) )
                    // InternalTSE.g:333:3: ( rule__EndTransition__Group_0__0 )
                    {
                     before(grammarAccess.getEndTransitionAccess().getGroup_0()); 
                    // InternalTSE.g:334:3: ( rule__EndTransition__Group_0__0 )
                    // InternalTSE.g:334:4: rule__EndTransition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndTransition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEndTransitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:338:2: ( ( rule__EndTransition__Group_1__0 ) )
                    {
                    // InternalTSE.g:338:2: ( ( rule__EndTransition__Group_1__0 ) )
                    // InternalTSE.g:339:3: ( rule__EndTransition__Group_1__0 )
                    {
                     before(grammarAccess.getEndTransitionAccess().getGroup_1()); 
                    // InternalTSE.g:340:3: ( rule__EndTransition__Group_1__0 )
                    // InternalTSE.g:340:4: rule__EndTransition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndTransition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEndTransitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EndTransition__Alternatives"


    // $ANTLR start "rule__TransitionProperties__Alternatives"
    // InternalTSE.g:348:1: rule__TransitionProperties__Alternatives : ( ( ( rule__TransitionProperties__Group_0__0 ) ) | ( ( rule__TransitionProperties__Group_1__0 ) ) | ( ( rule__TransitionProperties__Group_2__0 ) ) | ( ( rule__TransitionProperties__Group_3__0 ) ) );
    public final void rule__TransitionProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:352:1: ( ( ( rule__TransitionProperties__Group_0__0 ) ) | ( ( rule__TransitionProperties__Group_1__0 ) ) | ( ( rule__TransitionProperties__Group_2__0 ) ) | ( ( rule__TransitionProperties__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case RULE_DEFAULT:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTSE.g:353:2: ( ( rule__TransitionProperties__Group_0__0 ) )
                    {
                    // InternalTSE.g:353:2: ( ( rule__TransitionProperties__Group_0__0 ) )
                    // InternalTSE.g:354:3: ( rule__TransitionProperties__Group_0__0 )
                    {
                     before(grammarAccess.getTransitionPropertiesAccess().getGroup_0()); 
                    // InternalTSE.g:355:3: ( rule__TransitionProperties__Group_0__0 )
                    // InternalTSE.g:355:4: rule__TransitionProperties__Group_0__0
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
                    // InternalTSE.g:359:2: ( ( rule__TransitionProperties__Group_1__0 ) )
                    {
                    // InternalTSE.g:359:2: ( ( rule__TransitionProperties__Group_1__0 ) )
                    // InternalTSE.g:360:3: ( rule__TransitionProperties__Group_1__0 )
                    {
                     before(grammarAccess.getTransitionPropertiesAccess().getGroup_1()); 
                    // InternalTSE.g:361:3: ( rule__TransitionProperties__Group_1__0 )
                    // InternalTSE.g:361:4: rule__TransitionProperties__Group_1__0
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
                    // InternalTSE.g:365:2: ( ( rule__TransitionProperties__Group_2__0 ) )
                    {
                    // InternalTSE.g:365:2: ( ( rule__TransitionProperties__Group_2__0 ) )
                    // InternalTSE.g:366:3: ( rule__TransitionProperties__Group_2__0 )
                    {
                     before(grammarAccess.getTransitionPropertiesAccess().getGroup_2()); 
                    // InternalTSE.g:367:3: ( rule__TransitionProperties__Group_2__0 )
                    // InternalTSE.g:367:4: rule__TransitionProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionProperties__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionPropertiesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTSE.g:371:2: ( ( rule__TransitionProperties__Group_3__0 ) )
                    {
                    // InternalTSE.g:371:2: ( ( rule__TransitionProperties__Group_3__0 ) )
                    // InternalTSE.g:372:3: ( rule__TransitionProperties__Group_3__0 )
                    {
                     before(grammarAccess.getTransitionPropertiesAccess().getGroup_3()); 
                    // InternalTSE.g:373:3: ( rule__TransitionProperties__Group_3__0 )
                    // InternalTSE.g:373:4: rule__TransitionProperties__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionProperties__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionPropertiesAccess().getGroup_3()); 

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
    // InternalTSE.g:381:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:385:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalTSE.g:386:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalTSE.g:393:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:397:1: ( ( 'state' ) )
            // InternalTSE.g:398:1: ( 'state' )
            {
            // InternalTSE.g:398:1: ( 'state' )
            // InternalTSE.g:399:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalTSE.g:408:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:412:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalTSE.g:413:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalTSE.g:420:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:424:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalTSE.g:425:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalTSE.g:425:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalTSE.g:426:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalTSE.g:427:2: ( rule__State__NameAssignment_1 )
            // InternalTSE.g:427:3: rule__State__NameAssignment_1
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
    // InternalTSE.g:435:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:439:1: ( rule__State__Group__2__Impl )
            // InternalTSE.g:440:2: rule__State__Group__2__Impl
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
    // InternalTSE.g:446:1: rule__State__Group__2__Impl : ( ( rule__State__StatesProprietyAssignment_2 )* ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:450:1: ( ( ( rule__State__StatesProprietyAssignment_2 )* ) )
            // InternalTSE.g:451:1: ( ( rule__State__StatesProprietyAssignment_2 )* )
            {
            // InternalTSE.g:451:1: ( ( rule__State__StatesProprietyAssignment_2 )* )
            // InternalTSE.g:452:2: ( rule__State__StatesProprietyAssignment_2 )*
            {
             before(grammarAccess.getStateAccess().getStatesProprietyAssignment_2()); 
            // InternalTSE.g:453:2: ( rule__State__StatesProprietyAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DEFAULT||(LA7_0>=15 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTSE.g:453:3: rule__State__StatesProprietyAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__State__StatesProprietyAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getStatesProprietyAssignment_2()); 

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
    // InternalTSE.g:462:1: rule__StatesProperties__Group_0__0 : rule__StatesProperties__Group_0__0__Impl rule__StatesProperties__Group_0__1 ;
    public final void rule__StatesProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:466:1: ( rule__StatesProperties__Group_0__0__Impl rule__StatesProperties__Group_0__1 )
            // InternalTSE.g:467:2: rule__StatesProperties__Group_0__0__Impl rule__StatesProperties__Group_0__1
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
    // InternalTSE.g:474:1: rule__StatesProperties__Group_0__0__Impl : ( 'color' ) ;
    public final void rule__StatesProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:478:1: ( ( 'color' ) )
            // InternalTSE.g:479:1: ( 'color' )
            {
            // InternalTSE.g:479:1: ( 'color' )
            // InternalTSE.g:480:2: 'color'
            {
             before(grammarAccess.getStatesPropertiesAccess().getColorKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTSE.g:489:1: rule__StatesProperties__Group_0__1 : rule__StatesProperties__Group_0__1__Impl ;
    public final void rule__StatesProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:493:1: ( rule__StatesProperties__Group_0__1__Impl )
            // InternalTSE.g:494:2: rule__StatesProperties__Group_0__1__Impl
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
    // InternalTSE.g:500:1: rule__StatesProperties__Group_0__1__Impl : ( ( rule__StatesProperties__ColorAssignment_0_1 ) ) ;
    public final void rule__StatesProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:504:1: ( ( ( rule__StatesProperties__ColorAssignment_0_1 ) ) )
            // InternalTSE.g:505:1: ( ( rule__StatesProperties__ColorAssignment_0_1 ) )
            {
            // InternalTSE.g:505:1: ( ( rule__StatesProperties__ColorAssignment_0_1 ) )
            // InternalTSE.g:506:2: ( rule__StatesProperties__ColorAssignment_0_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getColorAssignment_0_1()); 
            // InternalTSE.g:507:2: ( rule__StatesProperties__ColorAssignment_0_1 )
            // InternalTSE.g:507:3: rule__StatesProperties__ColorAssignment_0_1
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
    // InternalTSE.g:516:1: rule__StatesProperties__Group_1__0 : rule__StatesProperties__Group_1__0__Impl rule__StatesProperties__Group_1__1 ;
    public final void rule__StatesProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:520:1: ( rule__StatesProperties__Group_1__0__Impl rule__StatesProperties__Group_1__1 )
            // InternalTSE.g:521:2: rule__StatesProperties__Group_1__0__Impl rule__StatesProperties__Group_1__1
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
    // InternalTSE.g:528:1: rule__StatesProperties__Group_1__0__Impl : ( 'thickness' ) ;
    public final void rule__StatesProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:532:1: ( ( 'thickness' ) )
            // InternalTSE.g:533:1: ( 'thickness' )
            {
            // InternalTSE.g:533:1: ( 'thickness' )
            // InternalTSE.g:534:2: 'thickness'
            {
             before(grammarAccess.getStatesPropertiesAccess().getThicknessKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTSE.g:543:1: rule__StatesProperties__Group_1__1 : rule__StatesProperties__Group_1__1__Impl ;
    public final void rule__StatesProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:547:1: ( rule__StatesProperties__Group_1__1__Impl )
            // InternalTSE.g:548:2: rule__StatesProperties__Group_1__1__Impl
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
    // InternalTSE.g:554:1: rule__StatesProperties__Group_1__1__Impl : ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) ) ;
    public final void rule__StatesProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:558:1: ( ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) ) )
            // InternalTSE.g:559:1: ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) )
            {
            // InternalTSE.g:559:1: ( ( rule__StatesProperties__ThicknessAssignment_1_1 ) )
            // InternalTSE.g:560:2: ( rule__StatesProperties__ThicknessAssignment_1_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getThicknessAssignment_1_1()); 
            // InternalTSE.g:561:2: ( rule__StatesProperties__ThicknessAssignment_1_1 )
            // InternalTSE.g:561:3: rule__StatesProperties__ThicknessAssignment_1_1
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
    // InternalTSE.g:570:1: rule__StatesProperties__Group_2__0 : rule__StatesProperties__Group_2__0__Impl rule__StatesProperties__Group_2__1 ;
    public final void rule__StatesProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:574:1: ( rule__StatesProperties__Group_2__0__Impl rule__StatesProperties__Group_2__1 )
            // InternalTSE.g:575:2: rule__StatesProperties__Group_2__0__Impl rule__StatesProperties__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTSE.g:582:1: rule__StatesProperties__Group_2__0__Impl : ( 'position' ) ;
    public final void rule__StatesProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:586:1: ( ( 'position' ) )
            // InternalTSE.g:587:1: ( 'position' )
            {
            // InternalTSE.g:587:1: ( 'position' )
            // InternalTSE.g:588:2: 'position'
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTSE.g:597:1: rule__StatesProperties__Group_2__1 : rule__StatesProperties__Group_2__1__Impl ;
    public final void rule__StatesProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:601:1: ( rule__StatesProperties__Group_2__1__Impl )
            // InternalTSE.g:602:2: rule__StatesProperties__Group_2__1__Impl
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
    // InternalTSE.g:608:1: rule__StatesProperties__Group_2__1__Impl : ( ( rule__StatesProperties__PositionAssignment_2_1 ) ) ;
    public final void rule__StatesProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:612:1: ( ( ( rule__StatesProperties__PositionAssignment_2_1 ) ) )
            // InternalTSE.g:613:1: ( ( rule__StatesProperties__PositionAssignment_2_1 ) )
            {
            // InternalTSE.g:613:1: ( ( rule__StatesProperties__PositionAssignment_2_1 ) )
            // InternalTSE.g:614:2: ( rule__StatesProperties__PositionAssignment_2_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionAssignment_2_1()); 
            // InternalTSE.g:615:2: ( rule__StatesProperties__PositionAssignment_2_1 )
            // InternalTSE.g:615:3: rule__StatesProperties__PositionAssignment_2_1
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
    // InternalTSE.g:624:1: rule__StatesProperties__Group_3__0 : rule__StatesProperties__Group_3__0__Impl rule__StatesProperties__Group_3__1 ;
    public final void rule__StatesProperties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:628:1: ( rule__StatesProperties__Group_3__0__Impl rule__StatesProperties__Group_3__1 )
            // InternalTSE.g:629:2: rule__StatesProperties__Group_3__0__Impl rule__StatesProperties__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTSE.g:636:1: rule__StatesProperties__Group_3__0__Impl : ( RULE_DEFAULT ) ;
    public final void rule__StatesProperties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:640:1: ( ( RULE_DEFAULT ) )
            // InternalTSE.g:641:1: ( RULE_DEFAULT )
            {
            // InternalTSE.g:641:1: ( RULE_DEFAULT )
            // InternalTSE.g:642:2: RULE_DEFAULT
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
    // InternalTSE.g:651:1: rule__StatesProperties__Group_3__1 : rule__StatesProperties__Group_3__1__Impl ;
    public final void rule__StatesProperties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:655:1: ( rule__StatesProperties__Group_3__1__Impl )
            // InternalTSE.g:656:2: rule__StatesProperties__Group_3__1__Impl
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
    // InternalTSE.g:662:1: rule__StatesProperties__Group_3__1__Impl : ( ( rule__StatesProperties__PositionAssignment_3_1 ) ) ;
    public final void rule__StatesProperties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:666:1: ( ( ( rule__StatesProperties__PositionAssignment_3_1 ) ) )
            // InternalTSE.g:667:1: ( ( rule__StatesProperties__PositionAssignment_3_1 ) )
            {
            // InternalTSE.g:667:1: ( ( rule__StatesProperties__PositionAssignment_3_1 ) )
            // InternalTSE.g:668:2: ( rule__StatesProperties__PositionAssignment_3_1 )
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionAssignment_3_1()); 
            // InternalTSE.g:669:2: ( rule__StatesProperties__PositionAssignment_3_1 )
            // InternalTSE.g:669:3: rule__StatesProperties__PositionAssignment_3_1
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
    // InternalTSE.g:678:1: rule__Transition__Group_0__0 : rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 ;
    public final void rule__Transition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:682:1: ( rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 )
            // InternalTSE.g:683:2: rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1
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
    // InternalTSE.g:690:1: rule__Transition__Group_0__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:694:1: ( ( 'transition' ) )
            // InternalTSE.g:695:1: ( 'transition' )
            {
            // InternalTSE.g:695:1: ( 'transition' )
            // InternalTSE.g:696:2: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTSE.g:705:1: rule__Transition__Group_0__1 : rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 ;
    public final void rule__Transition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:709:1: ( rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 )
            // InternalTSE.g:710:2: rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTSE.g:717:1: rule__Transition__Group_0__1__Impl : ( ( rule__Transition__StartAssignment_0_1 ) ) ;
    public final void rule__Transition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:721:1: ( ( ( rule__Transition__StartAssignment_0_1 ) ) )
            // InternalTSE.g:722:1: ( ( rule__Transition__StartAssignment_0_1 ) )
            {
            // InternalTSE.g:722:1: ( ( rule__Transition__StartAssignment_0_1 ) )
            // InternalTSE.g:723:2: ( rule__Transition__StartAssignment_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getStartAssignment_0_1()); 
            // InternalTSE.g:724:2: ( rule__Transition__StartAssignment_0_1 )
            // InternalTSE.g:724:3: rule__Transition__StartAssignment_0_1
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
    // InternalTSE.g:732:1: rule__Transition__Group_0__2 : rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3 ;
    public final void rule__Transition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:736:1: ( rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3 )
            // InternalTSE.g:737:2: rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTSE.g:744:1: rule__Transition__Group_0__2__Impl : ( ( rule__Transition__EndAssignment_0_2 ) ) ;
    public final void rule__Transition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:748:1: ( ( ( rule__Transition__EndAssignment_0_2 ) ) )
            // InternalTSE.g:749:1: ( ( rule__Transition__EndAssignment_0_2 ) )
            {
            // InternalTSE.g:749:1: ( ( rule__Transition__EndAssignment_0_2 ) )
            // InternalTSE.g:750:2: ( rule__Transition__EndAssignment_0_2 )
            {
             before(grammarAccess.getTransitionAccess().getEndAssignment_0_2()); 
            // InternalTSE.g:751:2: ( rule__Transition__EndAssignment_0_2 )
            // InternalTSE.g:751:3: rule__Transition__EndAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__EndAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEndAssignment_0_2()); 

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
    // InternalTSE.g:759:1: rule__Transition__Group_0__3 : rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4 ;
    public final void rule__Transition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:763:1: ( rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4 )
            // InternalTSE.g:764:2: rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalTSE.g:771:1: rule__Transition__Group_0__3__Impl : ( ( rule__Transition__ProprietyStatesAssignment_0_3 )* ) ;
    public final void rule__Transition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:775:1: ( ( ( rule__Transition__ProprietyStatesAssignment_0_3 )* ) )
            // InternalTSE.g:776:1: ( ( rule__Transition__ProprietyStatesAssignment_0_3 )* )
            {
            // InternalTSE.g:776:1: ( ( rule__Transition__ProprietyStatesAssignment_0_3 )* )
            // InternalTSE.g:777:2: ( rule__Transition__ProprietyStatesAssignment_0_3 )*
            {
             before(grammarAccess.getTransitionAccess().getProprietyStatesAssignment_0_3()); 
            // InternalTSE.g:778:2: ( rule__Transition__ProprietyStatesAssignment_0_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DEFAULT||(LA8_0>=15 && LA8_0<=16)||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTSE.g:778:3: rule__Transition__ProprietyStatesAssignment_0_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Transition__ProprietyStatesAssignment_0_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getProprietyStatesAssignment_0_3()); 

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
    // InternalTSE.g:786:1: rule__Transition__Group_0__4 : rule__Transition__Group_0__4__Impl ;
    public final void rule__Transition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:790:1: ( rule__Transition__Group_0__4__Impl )
            // InternalTSE.g:791:2: rule__Transition__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__4__Impl();

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
    // InternalTSE.g:797:1: rule__Transition__Group_0__4__Impl : ( ( rule__Transition__LabelAssignment_0_4 )? ) ;
    public final void rule__Transition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:801:1: ( ( ( rule__Transition__LabelAssignment_0_4 )? ) )
            // InternalTSE.g:802:1: ( ( rule__Transition__LabelAssignment_0_4 )? )
            {
            // InternalTSE.g:802:1: ( ( rule__Transition__LabelAssignment_0_4 )? )
            // InternalTSE.g:803:2: ( rule__Transition__LabelAssignment_0_4 )?
            {
             before(grammarAccess.getTransitionAccess().getLabelAssignment_0_4()); 
            // InternalTSE.g:804:2: ( rule__Transition__LabelAssignment_0_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTSE.g:804:3: rule__Transition__LabelAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__LabelAssignment_0_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getLabelAssignment_0_4()); 

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


    // $ANTLR start "rule__Transition__Group_1__0"
    // InternalTSE.g:813:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:817:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalTSE.g:818:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
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
    // InternalTSE.g:825:1: rule__Transition__Group_1__0__Impl : ( 'initialTransition' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:829:1: ( ( 'initialTransition' ) )
            // InternalTSE.g:830:1: ( 'initialTransition' )
            {
            // InternalTSE.g:830:1: ( 'initialTransition' )
            // InternalTSE.g:831:2: 'initialTransition'
            {
             before(grammarAccess.getTransitionAccess().getInitialTransitionKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTSE.g:840:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:844:1: ( rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 )
            // InternalTSE.g:845:2: rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTSE.g:852:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__InitAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:856:1: ( ( ( rule__Transition__InitAssignment_1_1 ) ) )
            // InternalTSE.g:857:1: ( ( rule__Transition__InitAssignment_1_1 ) )
            {
            // InternalTSE.g:857:1: ( ( rule__Transition__InitAssignment_1_1 ) )
            // InternalTSE.g:858:2: ( rule__Transition__InitAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getInitAssignment_1_1()); 
            // InternalTSE.g:859:2: ( rule__Transition__InitAssignment_1_1 )
            // InternalTSE.g:859:3: rule__Transition__InitAssignment_1_1
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
    // InternalTSE.g:867:1: rule__Transition__Group_1__2 : rule__Transition__Group_1__2__Impl ;
    public final void rule__Transition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:871:1: ( rule__Transition__Group_1__2__Impl )
            // InternalTSE.g:872:2: rule__Transition__Group_1__2__Impl
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
    // InternalTSE.g:878:1: rule__Transition__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__Transition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:882:1: ( ( RULE_INT ) )
            // InternalTSE.g:883:1: ( RULE_INT )
            {
            // InternalTSE.g:883:1: ( RULE_INT )
            // InternalTSE.g:884:2: RULE_INT
            {
             before(grammarAccess.getTransitionAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getINTTerminalRuleCall_1_2()); 

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
    // InternalTSE.g:894:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:898:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalTSE.g:899:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTSE.g:906:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:910:1: ( ( 'label' ) )
            // InternalTSE.g:911:1: ( 'label' )
            {
            // InternalTSE.g:911:1: ( 'label' )
            // InternalTSE.g:912:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTSE.g:921:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:925:1: ( rule__Label__Group__1__Impl )
            // InternalTSE.g:926:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__1__Impl();

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
    // InternalTSE.g:932:1: rule__Label__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:936:1: ( ( RULE_INT ) )
            // InternalTSE.g:937:1: ( RULE_INT )
            {
            // InternalTSE.g:937:1: ( RULE_INT )
            // InternalTSE.g:938:2: RULE_INT
            {
             before(grammarAccess.getLabelAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getINTTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__EndTransition__Group_0__0"
    // InternalTSE.g:948:1: rule__EndTransition__Group_0__0 : rule__EndTransition__Group_0__0__Impl rule__EndTransition__Group_0__1 ;
    public final void rule__EndTransition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:952:1: ( rule__EndTransition__Group_0__0__Impl rule__EndTransition__Group_0__1 )
            // InternalTSE.g:953:2: rule__EndTransition__Group_0__0__Impl rule__EndTransition__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__EndTransition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndTransition__Group_0__1();

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
    // $ANTLR end "rule__EndTransition__Group_0__0"


    // $ANTLR start "rule__EndTransition__Group_0__0__Impl"
    // InternalTSE.g:960:1: rule__EndTransition__Group_0__0__Impl : ( '->' ) ;
    public final void rule__EndTransition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:964:1: ( ( '->' ) )
            // InternalTSE.g:965:1: ( '->' )
            {
            // InternalTSE.g:965:1: ( '->' )
            // InternalTSE.g:966:2: '->'
            {
             before(grammarAccess.getEndTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEndTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 

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
    // $ANTLR end "rule__EndTransition__Group_0__0__Impl"


    // $ANTLR start "rule__EndTransition__Group_0__1"
    // InternalTSE.g:975:1: rule__EndTransition__Group_0__1 : rule__EndTransition__Group_0__1__Impl ;
    public final void rule__EndTransition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:979:1: ( rule__EndTransition__Group_0__1__Impl )
            // InternalTSE.g:980:2: rule__EndTransition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndTransition__Group_0__1__Impl();

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
    // $ANTLR end "rule__EndTransition__Group_0__1"


    // $ANTLR start "rule__EndTransition__Group_0__1__Impl"
    // InternalTSE.g:986:1: rule__EndTransition__Group_0__1__Impl : ( ( rule__EndTransition__EndAssignment_0_1 ) ) ;
    public final void rule__EndTransition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:990:1: ( ( ( rule__EndTransition__EndAssignment_0_1 ) ) )
            // InternalTSE.g:991:1: ( ( rule__EndTransition__EndAssignment_0_1 ) )
            {
            // InternalTSE.g:991:1: ( ( rule__EndTransition__EndAssignment_0_1 ) )
            // InternalTSE.g:992:2: ( rule__EndTransition__EndAssignment_0_1 )
            {
             before(grammarAccess.getEndTransitionAccess().getEndAssignment_0_1()); 
            // InternalTSE.g:993:2: ( rule__EndTransition__EndAssignment_0_1 )
            // InternalTSE.g:993:3: rule__EndTransition__EndAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EndTransition__EndAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEndTransitionAccess().getEndAssignment_0_1()); 

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
    // $ANTLR end "rule__EndTransition__Group_0__1__Impl"


    // $ANTLR start "rule__EndTransition__Group_1__0"
    // InternalTSE.g:1002:1: rule__EndTransition__Group_1__0 : rule__EndTransition__Group_1__0__Impl rule__EndTransition__Group_1__1 ;
    public final void rule__EndTransition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1006:1: ( rule__EndTransition__Group_1__0__Impl rule__EndTransition__Group_1__1 )
            // InternalTSE.g:1007:2: rule__EndTransition__Group_1__0__Impl rule__EndTransition__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__EndTransition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndTransition__Group_1__1();

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
    // $ANTLR end "rule__EndTransition__Group_1__0"


    // $ANTLR start "rule__EndTransition__Group_1__0__Impl"
    // InternalTSE.g:1014:1: rule__EndTransition__Group_1__0__Impl : ( 'reflexive' ) ;
    public final void rule__EndTransition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1018:1: ( ( 'reflexive' ) )
            // InternalTSE.g:1019:1: ( 'reflexive' )
            {
            // InternalTSE.g:1019:1: ( 'reflexive' )
            // InternalTSE.g:1020:2: 'reflexive'
            {
             before(grammarAccess.getEndTransitionAccess().getReflexiveKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEndTransitionAccess().getReflexiveKeyword_1_0()); 

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
    // $ANTLR end "rule__EndTransition__Group_1__0__Impl"


    // $ANTLR start "rule__EndTransition__Group_1__1"
    // InternalTSE.g:1029:1: rule__EndTransition__Group_1__1 : rule__EndTransition__Group_1__1__Impl ;
    public final void rule__EndTransition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1033:1: ( rule__EndTransition__Group_1__1__Impl )
            // InternalTSE.g:1034:2: rule__EndTransition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndTransition__Group_1__1__Impl();

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
    // $ANTLR end "rule__EndTransition__Group_1__1"


    // $ANTLR start "rule__EndTransition__Group_1__1__Impl"
    // InternalTSE.g:1040:1: rule__EndTransition__Group_1__1__Impl : ( ( rule__EndTransition__EndAssignment_1_1 ) ) ;
    public final void rule__EndTransition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1044:1: ( ( ( rule__EndTransition__EndAssignment_1_1 ) ) )
            // InternalTSE.g:1045:1: ( ( rule__EndTransition__EndAssignment_1_1 ) )
            {
            // InternalTSE.g:1045:1: ( ( rule__EndTransition__EndAssignment_1_1 ) )
            // InternalTSE.g:1046:2: ( rule__EndTransition__EndAssignment_1_1 )
            {
             before(grammarAccess.getEndTransitionAccess().getEndAssignment_1_1()); 
            // InternalTSE.g:1047:2: ( rule__EndTransition__EndAssignment_1_1 )
            // InternalTSE.g:1047:3: rule__EndTransition__EndAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EndTransition__EndAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEndTransitionAccess().getEndAssignment_1_1()); 

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
    // $ANTLR end "rule__EndTransition__Group_1__1__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_0__0"
    // InternalTSE.g:1056:1: rule__TransitionProperties__Group_0__0 : rule__TransitionProperties__Group_0__0__Impl rule__TransitionProperties__Group_0__1 ;
    public final void rule__TransitionProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1060:1: ( rule__TransitionProperties__Group_0__0__Impl rule__TransitionProperties__Group_0__1 )
            // InternalTSE.g:1061:2: rule__TransitionProperties__Group_0__0__Impl rule__TransitionProperties__Group_0__1
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
    // InternalTSE.g:1068:1: rule__TransitionProperties__Group_0__0__Impl : ( 'color' ) ;
    public final void rule__TransitionProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1072:1: ( ( 'color' ) )
            // InternalTSE.g:1073:1: ( 'color' )
            {
            // InternalTSE.g:1073:1: ( 'color' )
            // InternalTSE.g:1074:2: 'color'
            {
             before(grammarAccess.getTransitionPropertiesAccess().getColorKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTSE.g:1083:1: rule__TransitionProperties__Group_0__1 : rule__TransitionProperties__Group_0__1__Impl ;
    public final void rule__TransitionProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1087:1: ( rule__TransitionProperties__Group_0__1__Impl )
            // InternalTSE.g:1088:2: rule__TransitionProperties__Group_0__1__Impl
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
    // InternalTSE.g:1094:1: rule__TransitionProperties__Group_0__1__Impl : ( ( rule__TransitionProperties__ColorAssignment_0_1 ) ) ;
    public final void rule__TransitionProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1098:1: ( ( ( rule__TransitionProperties__ColorAssignment_0_1 ) ) )
            // InternalTSE.g:1099:1: ( ( rule__TransitionProperties__ColorAssignment_0_1 ) )
            {
            // InternalTSE.g:1099:1: ( ( rule__TransitionProperties__ColorAssignment_0_1 ) )
            // InternalTSE.g:1100:2: ( rule__TransitionProperties__ColorAssignment_0_1 )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getColorAssignment_0_1()); 
            // InternalTSE.g:1101:2: ( rule__TransitionProperties__ColorAssignment_0_1 )
            // InternalTSE.g:1101:3: rule__TransitionProperties__ColorAssignment_0_1
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
    // InternalTSE.g:1110:1: rule__TransitionProperties__Group_1__0 : rule__TransitionProperties__Group_1__0__Impl rule__TransitionProperties__Group_1__1 ;
    public final void rule__TransitionProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1114:1: ( rule__TransitionProperties__Group_1__0__Impl rule__TransitionProperties__Group_1__1 )
            // InternalTSE.g:1115:2: rule__TransitionProperties__Group_1__0__Impl rule__TransitionProperties__Group_1__1
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
    // InternalTSE.g:1122:1: rule__TransitionProperties__Group_1__0__Impl : ( 'thickness' ) ;
    public final void rule__TransitionProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1126:1: ( ( 'thickness' ) )
            // InternalTSE.g:1127:1: ( 'thickness' )
            {
            // InternalTSE.g:1127:1: ( 'thickness' )
            // InternalTSE.g:1128:2: 'thickness'
            {
             before(grammarAccess.getTransitionPropertiesAccess().getThicknessKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTSE.g:1137:1: rule__TransitionProperties__Group_1__1 : rule__TransitionProperties__Group_1__1__Impl ;
    public final void rule__TransitionProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1141:1: ( rule__TransitionProperties__Group_1__1__Impl )
            // InternalTSE.g:1142:2: rule__TransitionProperties__Group_1__1__Impl
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
    // InternalTSE.g:1148:1: rule__TransitionProperties__Group_1__1__Impl : ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) ) ;
    public final void rule__TransitionProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1152:1: ( ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) ) )
            // InternalTSE.g:1153:1: ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) )
            {
            // InternalTSE.g:1153:1: ( ( rule__TransitionProperties__ThicknessAssignment_1_1 ) )
            // InternalTSE.g:1154:2: ( rule__TransitionProperties__ThicknessAssignment_1_1 )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getThicknessAssignment_1_1()); 
            // InternalTSE.g:1155:2: ( rule__TransitionProperties__ThicknessAssignment_1_1 )
            // InternalTSE.g:1155:3: rule__TransitionProperties__ThicknessAssignment_1_1
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
    // InternalTSE.g:1164:1: rule__TransitionProperties__Group_2__0 : rule__TransitionProperties__Group_2__0__Impl rule__TransitionProperties__Group_2__1 ;
    public final void rule__TransitionProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1168:1: ( rule__TransitionProperties__Group_2__0__Impl rule__TransitionProperties__Group_2__1 )
            // InternalTSE.g:1169:2: rule__TransitionProperties__Group_2__0__Impl rule__TransitionProperties__Group_2__1
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
    // InternalTSE.g:1176:1: rule__TransitionProperties__Group_2__0__Impl : ( 'curvature' ) ;
    public final void rule__TransitionProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1180:1: ( ( 'curvature' ) )
            // InternalTSE.g:1181:1: ( 'curvature' )
            {
            // InternalTSE.g:1181:1: ( 'curvature' )
            // InternalTSE.g:1182:2: 'curvature'
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
    // InternalTSE.g:1191:1: rule__TransitionProperties__Group_2__1 : rule__TransitionProperties__Group_2__1__Impl ;
    public final void rule__TransitionProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1195:1: ( rule__TransitionProperties__Group_2__1__Impl )
            // InternalTSE.g:1196:2: rule__TransitionProperties__Group_2__1__Impl
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
    // InternalTSE.g:1202:1: rule__TransitionProperties__Group_2__1__Impl : ( ( rule__TransitionProperties__CurveAssignment_2_1 ) ) ;
    public final void rule__TransitionProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1206:1: ( ( ( rule__TransitionProperties__CurveAssignment_2_1 ) ) )
            // InternalTSE.g:1207:1: ( ( rule__TransitionProperties__CurveAssignment_2_1 ) )
            {
            // InternalTSE.g:1207:1: ( ( rule__TransitionProperties__CurveAssignment_2_1 ) )
            // InternalTSE.g:1208:2: ( rule__TransitionProperties__CurveAssignment_2_1 )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getCurveAssignment_2_1()); 
            // InternalTSE.g:1209:2: ( rule__TransitionProperties__CurveAssignment_2_1 )
            // InternalTSE.g:1209:3: rule__TransitionProperties__CurveAssignment_2_1
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


    // $ANTLR start "rule__TransitionProperties__Group_3__0"
    // InternalTSE.g:1218:1: rule__TransitionProperties__Group_3__0 : rule__TransitionProperties__Group_3__0__Impl rule__TransitionProperties__Group_3__1 ;
    public final void rule__TransitionProperties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1222:1: ( rule__TransitionProperties__Group_3__0__Impl rule__TransitionProperties__Group_3__1 )
            // InternalTSE.g:1223:2: rule__TransitionProperties__Group_3__0__Impl rule__TransitionProperties__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TransitionProperties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_3__1();

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
    // $ANTLR end "rule__TransitionProperties__Group_3__0"


    // $ANTLR start "rule__TransitionProperties__Group_3__0__Impl"
    // InternalTSE.g:1230:1: rule__TransitionProperties__Group_3__0__Impl : ( RULE_DEFAULT ) ;
    public final void rule__TransitionProperties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1234:1: ( ( RULE_DEFAULT ) )
            // InternalTSE.g:1235:1: ( RULE_DEFAULT )
            {
            // InternalTSE.g:1235:1: ( RULE_DEFAULT )
            // InternalTSE.g:1236:2: RULE_DEFAULT
            {
             before(grammarAccess.getTransitionPropertiesAccess().getDEFAULTTerminalRuleCall_3_0()); 
            match(input,RULE_DEFAULT,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getDEFAULTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__TransitionProperties__Group_3__0__Impl"


    // $ANTLR start "rule__TransitionProperties__Group_3__1"
    // InternalTSE.g:1245:1: rule__TransitionProperties__Group_3__1 : rule__TransitionProperties__Group_3__1__Impl ;
    public final void rule__TransitionProperties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1249:1: ( rule__TransitionProperties__Group_3__1__Impl )
            // InternalTSE.g:1250:2: rule__TransitionProperties__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__Group_3__1__Impl();

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
    // $ANTLR end "rule__TransitionProperties__Group_3__1"


    // $ANTLR start "rule__TransitionProperties__Group_3__1__Impl"
    // InternalTSE.g:1256:1: rule__TransitionProperties__Group_3__1__Impl : ( ( rule__TransitionProperties__PositionAssignment_3_1 ) ) ;
    public final void rule__TransitionProperties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1260:1: ( ( ( rule__TransitionProperties__PositionAssignment_3_1 ) ) )
            // InternalTSE.g:1261:1: ( ( rule__TransitionProperties__PositionAssignment_3_1 ) )
            {
            // InternalTSE.g:1261:1: ( ( rule__TransitionProperties__PositionAssignment_3_1 ) )
            // InternalTSE.g:1262:2: ( rule__TransitionProperties__PositionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionPropertiesAccess().getPositionAssignment_3_1()); 
            // InternalTSE.g:1263:2: ( rule__TransitionProperties__PositionAssignment_3_1 )
            // InternalTSE.g:1263:3: rule__TransitionProperties__PositionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionProperties__PositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionPropertiesAccess().getPositionAssignment_3_1()); 

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
    // $ANTLR end "rule__TransitionProperties__Group_3__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalTSE.g:1272:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1276:1: ( ( ruleElement ) )
            // InternalTSE.g:1277:2: ( ruleElement )
            {
            // InternalTSE.g:1277:2: ( ruleElement )
            // InternalTSE.g:1278:3: ruleElement
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


    // $ANTLR start "rule__Element__StatesAssignment_0"
    // InternalTSE.g:1287:1: rule__Element__StatesAssignment_0 : ( ruleState ) ;
    public final void rule__Element__StatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1291:1: ( ( ruleState ) )
            // InternalTSE.g:1292:2: ( ruleState )
            {
            // InternalTSE.g:1292:2: ( ruleState )
            // InternalTSE.g:1293:3: ruleState
            {
             before(grammarAccess.getElementAccess().getStatesStateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getElementAccess().getStatesStateParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Element__StatesAssignment_0"


    // $ANTLR start "rule__Element__TransitionsAssignment_1"
    // InternalTSE.g:1302:1: rule__Element__TransitionsAssignment_1 : ( ruleTransition ) ;
    public final void rule__Element__TransitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1306:1: ( ( ruleTransition ) )
            // InternalTSE.g:1307:2: ( ruleTransition )
            {
            // InternalTSE.g:1307:2: ( ruleTransition )
            // InternalTSE.g:1308:3: ruleTransition
            {
             before(grammarAccess.getElementAccess().getTransitionsTransitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getElementAccess().getTransitionsTransitionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Element__TransitionsAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalTSE.g:1317:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1321:1: ( ( RULE_ID ) )
            // InternalTSE.g:1322:2: ( RULE_ID )
            {
            // InternalTSE.g:1322:2: ( RULE_ID )
            // InternalTSE.g:1323:3: RULE_ID
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


    // $ANTLR start "rule__State__StatesProprietyAssignment_2"
    // InternalTSE.g:1332:1: rule__State__StatesProprietyAssignment_2 : ( ruleStatesProperties ) ;
    public final void rule__State__StatesProprietyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1336:1: ( ( ruleStatesProperties ) )
            // InternalTSE.g:1337:2: ( ruleStatesProperties )
            {
            // InternalTSE.g:1337:2: ( ruleStatesProperties )
            // InternalTSE.g:1338:3: ruleStatesProperties
            {
             before(grammarAccess.getStateAccess().getStatesProprietyStatesPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatesProperties();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatesProprietyStatesPropertiesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__State__StatesProprietyAssignment_2"


    // $ANTLR start "rule__StatesProperties__ColorAssignment_0_1"
    // InternalTSE.g:1347:1: rule__StatesProperties__ColorAssignment_0_1 : ( RULE_COLOR ) ;
    public final void rule__StatesProperties__ColorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1351:1: ( ( RULE_COLOR ) )
            // InternalTSE.g:1352:2: ( RULE_COLOR )
            {
            // InternalTSE.g:1352:2: ( RULE_COLOR )
            // InternalTSE.g:1353:3: RULE_COLOR
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
    // InternalTSE.g:1362:1: rule__StatesProperties__ThicknessAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__StatesProperties__ThicknessAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1366:1: ( ( RULE_FLOAT ) )
            // InternalTSE.g:1367:2: ( RULE_FLOAT )
            {
            // InternalTSE.g:1367:2: ( RULE_FLOAT )
            // InternalTSE.g:1368:3: RULE_FLOAT
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
    // InternalTSE.g:1377:1: rule__StatesProperties__PositionAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__StatesProperties__PositionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1381:1: ( ( RULE_ID ) )
            // InternalTSE.g:1382:2: ( RULE_ID )
            {
            // InternalTSE.g:1382:2: ( RULE_ID )
            // InternalTSE.g:1383:3: RULE_ID
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getPositionIDTerminalRuleCall_2_1_0()); 

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
    // InternalTSE.g:1392:1: rule__StatesProperties__PositionAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__StatesProperties__PositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1396:1: ( ( RULE_ID ) )
            // InternalTSE.g:1397:2: ( RULE_ID )
            {
            // InternalTSE.g:1397:2: ( RULE_ID )
            // InternalTSE.g:1398:3: RULE_ID
            {
             before(grammarAccess.getStatesPropertiesAccess().getPositionIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatesPropertiesAccess().getPositionIDTerminalRuleCall_3_1_0()); 

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
    // InternalTSE.g:1407:1: rule__Transition__StartAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Transition__StartAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1411:1: ( ( RULE_ID ) )
            // InternalTSE.g:1412:2: ( RULE_ID )
            {
            // InternalTSE.g:1412:2: ( RULE_ID )
            // InternalTSE.g:1413:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStartIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getStartIDTerminalRuleCall_0_1_0()); 

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


    // $ANTLR start "rule__Transition__EndAssignment_0_2"
    // InternalTSE.g:1422:1: rule__Transition__EndAssignment_0_2 : ( ruleEndTransition ) ;
    public final void rule__Transition__EndAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1426:1: ( ( ruleEndTransition ) )
            // InternalTSE.g:1427:2: ( ruleEndTransition )
            {
            // InternalTSE.g:1427:2: ( ruleEndTransition )
            // InternalTSE.g:1428:3: ruleEndTransition
            {
             before(grammarAccess.getTransitionAccess().getEndEndTransitionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndTransition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEndEndTransitionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Transition__EndAssignment_0_2"


    // $ANTLR start "rule__Transition__ProprietyStatesAssignment_0_3"
    // InternalTSE.g:1437:1: rule__Transition__ProprietyStatesAssignment_0_3 : ( ruletransitionProperties ) ;
    public final void rule__Transition__ProprietyStatesAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1441:1: ( ( ruletransitionProperties ) )
            // InternalTSE.g:1442:2: ( ruletransitionProperties )
            {
            // InternalTSE.g:1442:2: ( ruletransitionProperties )
            // InternalTSE.g:1443:3: ruletransitionProperties
            {
             before(grammarAccess.getTransitionAccess().getProprietyStatesTransitionPropertiesParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruletransitionProperties();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getProprietyStatesTransitionPropertiesParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Transition__ProprietyStatesAssignment_0_3"


    // $ANTLR start "rule__Transition__LabelAssignment_0_4"
    // InternalTSE.g:1452:1: rule__Transition__LabelAssignment_0_4 : ( ruleLabel ) ;
    public final void rule__Transition__LabelAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1456:1: ( ( ruleLabel ) )
            // InternalTSE.g:1457:2: ( ruleLabel )
            {
            // InternalTSE.g:1457:2: ( ruleLabel )
            // InternalTSE.g:1458:3: ruleLabel
            {
             before(grammarAccess.getTransitionAccess().getLabelLabelParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getLabelLabelParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__Transition__LabelAssignment_0_4"


    // $ANTLR start "rule__Transition__InitAssignment_1_1"
    // InternalTSE.g:1467:1: rule__Transition__InitAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Transition__InitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1471:1: ( ( RULE_ID ) )
            // InternalTSE.g:1472:2: ( RULE_ID )
            {
            // InternalTSE.g:1472:2: ( RULE_ID )
            // InternalTSE.g:1473:3: RULE_ID
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


    // $ANTLR start "rule__EndTransition__EndAssignment_0_1"
    // InternalTSE.g:1482:1: rule__EndTransition__EndAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__EndTransition__EndAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1486:1: ( ( RULE_ID ) )
            // InternalTSE.g:1487:2: ( RULE_ID )
            {
            // InternalTSE.g:1487:2: ( RULE_ID )
            // InternalTSE.g:1488:3: RULE_ID
            {
             before(grammarAccess.getEndTransitionAccess().getEndIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndTransitionAccess().getEndIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__EndTransition__EndAssignment_0_1"


    // $ANTLR start "rule__EndTransition__EndAssignment_1_1"
    // InternalTSE.g:1497:1: rule__EndTransition__EndAssignment_1_1 : ( ( 'reflexive' ) ) ;
    public final void rule__EndTransition__EndAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1501:1: ( ( ( 'reflexive' ) ) )
            // InternalTSE.g:1502:2: ( ( 'reflexive' ) )
            {
            // InternalTSE.g:1502:2: ( ( 'reflexive' ) )
            // InternalTSE.g:1503:3: ( 'reflexive' )
            {
             before(grammarAccess.getEndTransitionAccess().getEndReflexiveKeyword_1_1_0()); 
            // InternalTSE.g:1504:3: ( 'reflexive' )
            // InternalTSE.g:1505:4: 'reflexive'
            {
             before(grammarAccess.getEndTransitionAccess().getEndReflexiveKeyword_1_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEndTransitionAccess().getEndReflexiveKeyword_1_1_0()); 

            }

             after(grammarAccess.getEndTransitionAccess().getEndReflexiveKeyword_1_1_0()); 

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
    // $ANTLR end "rule__EndTransition__EndAssignment_1_1"


    // $ANTLR start "rule__TransitionProperties__ColorAssignment_0_1"
    // InternalTSE.g:1516:1: rule__TransitionProperties__ColorAssignment_0_1 : ( RULE_COLOR ) ;
    public final void rule__TransitionProperties__ColorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1520:1: ( ( RULE_COLOR ) )
            // InternalTSE.g:1521:2: ( RULE_COLOR )
            {
            // InternalTSE.g:1521:2: ( RULE_COLOR )
            // InternalTSE.g:1522:3: RULE_COLOR
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
    // InternalTSE.g:1531:1: rule__TransitionProperties__ThicknessAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__TransitionProperties__ThicknessAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1535:1: ( ( RULE_FLOAT ) )
            // InternalTSE.g:1536:2: ( RULE_FLOAT )
            {
            // InternalTSE.g:1536:2: ( RULE_FLOAT )
            // InternalTSE.g:1537:3: RULE_FLOAT
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
    // InternalTSE.g:1546:1: rule__TransitionProperties__CurveAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__TransitionProperties__CurveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1550:1: ( ( RULE_FLOAT ) )
            // InternalTSE.g:1551:2: ( RULE_FLOAT )
            {
            // InternalTSE.g:1551:2: ( RULE_FLOAT )
            // InternalTSE.g:1552:3: RULE_FLOAT
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


    // $ANTLR start "rule__TransitionProperties__PositionAssignment_3_1"
    // InternalTSE.g:1561:1: rule__TransitionProperties__PositionAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__TransitionProperties__PositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTSE.g:1565:1: ( ( RULE_ID ) )
            // InternalTSE.g:1566:2: ( RULE_ID )
            {
            // InternalTSE.g:1566:2: ( RULE_ID )
            // InternalTSE.g:1567:3: RULE_ID
            {
             before(grammarAccess.getTransitionPropertiesAccess().getPositionIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionPropertiesAccess().getPositionIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TransitionProperties__PositionAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000918010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000818012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});

}