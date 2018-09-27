package fr.uha.ensisa.project.pan_chabalier.tse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.uha.ensisa.project.pan_chabalier.tse.services.TSEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTSEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_COLOR", "RULE_FLOAT", "RULE_DEFAULT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'color'", "'thickness'", "'position'", "'transition'", "'initialTransition'", "'label'", "'->'", "'reflexive'", "'curvature'"
    };
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


        public InternalTSEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTSEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTSEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTSE.g"; }



     	private TSEGrammarAccess grammarAccess;

        public InternalTSEParser(TokenStream input, TSEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TSEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTSE.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTSE.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTSE.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTSE.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTSE.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalTSE.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalTSE.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTSE.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalTSE.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalTSE.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"fr.uha.ensisa.project.pan_chabalier.tse.TSE.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalTSE.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalTSE.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalTSE.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTSE.g:107:1: ruleElement returns [EObject current=null] : ( ( (lv_states_0_0= ruleState ) ) | ( (lv_transitions_1_0= ruleTransition ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;

        EObject lv_transitions_1_0 = null;



        	enterRule();

        try {
            // InternalTSE.g:113:2: ( ( ( (lv_states_0_0= ruleState ) ) | ( (lv_transitions_1_0= ruleTransition ) ) ) )
            // InternalTSE.g:114:2: ( ( (lv_states_0_0= ruleState ) ) | ( (lv_transitions_1_0= ruleTransition ) ) )
            {
            // InternalTSE.g:114:2: ( ( (lv_states_0_0= ruleState ) ) | ( (lv_transitions_1_0= ruleTransition ) ) )
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
                    // InternalTSE.g:115:3: ( (lv_states_0_0= ruleState ) )
                    {
                    // InternalTSE.g:115:3: ( (lv_states_0_0= ruleState ) )
                    // InternalTSE.g:116:4: (lv_states_0_0= ruleState )
                    {
                    // InternalTSE.g:116:4: (lv_states_0_0= ruleState )
                    // InternalTSE.g:117:5: lv_states_0_0= ruleState
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getStatesStateParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_states_0_0=ruleState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					add(
                    						current,
                    						"states",
                    						lv_states_0_0,
                    						"fr.uha.ensisa.project.pan_chabalier.tse.TSE.State");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:135:3: ( (lv_transitions_1_0= ruleTransition ) )
                    {
                    // InternalTSE.g:135:3: ( (lv_transitions_1_0= ruleTransition ) )
                    // InternalTSE.g:136:4: (lv_transitions_1_0= ruleTransition )
                    {
                    // InternalTSE.g:136:4: (lv_transitions_1_0= ruleTransition )
                    // InternalTSE.g:137:5: lv_transitions_1_0= ruleTransition
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTransitionsTransitionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_transitions_1_0=ruleTransition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					add(
                    						current,
                    						"transitions",
                    						lv_transitions_1_0,
                    						"fr.uha.ensisa.project.pan_chabalier.tse.TSE.Transition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleState"
    // InternalTSE.g:158:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalTSE.g:158:46: (iv_ruleState= ruleState EOF )
            // InternalTSE.g:159:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalTSE.g:165:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statesPropriety_2_0= ruleStatesProperties ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_statesPropriety_2_0 = null;



        	enterRule();

        try {
            // InternalTSE.g:171:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statesPropriety_2_0= ruleStatesProperties ) )* ) )
            // InternalTSE.g:172:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statesPropriety_2_0= ruleStatesProperties ) )* )
            {
            // InternalTSE.g:172:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statesPropriety_2_0= ruleStatesProperties ) )* )
            // InternalTSE.g:173:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statesPropriety_2_0= ruleStatesProperties ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalTSE.g:177:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTSE.g:178:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTSE.g:178:4: (lv_name_1_0= RULE_ID )
            // InternalTSE.g:179:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTSE.g:195:3: ( (lv_statesPropriety_2_0= ruleStatesProperties ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DEFAULT||(LA3_0>=15 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTSE.g:196:4: (lv_statesPropriety_2_0= ruleStatesProperties )
            	    {
            	    // InternalTSE.g:196:4: (lv_statesPropriety_2_0= ruleStatesProperties )
            	    // InternalTSE.g:197:5: lv_statesPropriety_2_0= ruleStatesProperties
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getStatesProprietyStatesPropertiesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_statesPropriety_2_0=ruleStatesProperties();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statesPropriety",
            	    						lv_statesPropriety_2_0,
            	    						"fr.uha.ensisa.project.pan_chabalier.tse.TSE.StatesProperties");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStatesProperties"
    // InternalTSE.g:218:1: entryRuleStatesProperties returns [EObject current=null] : iv_ruleStatesProperties= ruleStatesProperties EOF ;
    public final EObject entryRuleStatesProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatesProperties = null;


        try {
            // InternalTSE.g:218:57: (iv_ruleStatesProperties= ruleStatesProperties EOF )
            // InternalTSE.g:219:2: iv_ruleStatesProperties= ruleStatesProperties EOF
            {
             newCompositeNode(grammarAccess.getStatesPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatesProperties=ruleStatesProperties();

            state._fsp--;

             current =iv_ruleStatesProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatesProperties"


    // $ANTLR start "ruleStatesProperties"
    // InternalTSE.g:225:1: ruleStatesProperties returns [EObject current=null] : ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'position' ( (lv_position_5_0= RULE_ID ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleStatesProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_color_1_0=null;
        Token otherlv_2=null;
        Token lv_thickness_3_0=null;
        Token otherlv_4=null;
        Token lv_position_5_0=null;
        Token this_DEFAULT_6=null;
        Token lv_position_7_0=null;


        	enterRule();

        try {
            // InternalTSE.g:231:2: ( ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'position' ( (lv_position_5_0= RULE_ID ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) ) )
            // InternalTSE.g:232:2: ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'position' ( (lv_position_5_0= RULE_ID ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) )
            {
            // InternalTSE.g:232:2: ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'position' ( (lv_position_5_0= RULE_ID ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case RULE_DEFAULT:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTSE.g:233:3: (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) )
                    {
                    // InternalTSE.g:233:3: (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) )
                    // InternalTSE.g:234:4: otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getStatesPropertiesAccess().getColorKeyword_0_0());
                    			
                    // InternalTSE.g:238:4: ( (lv_color_1_0= RULE_COLOR ) )
                    // InternalTSE.g:239:5: (lv_color_1_0= RULE_COLOR )
                    {
                    // InternalTSE.g:239:5: (lv_color_1_0= RULE_COLOR )
                    // InternalTSE.g:240:6: lv_color_1_0= RULE_COLOR
                    {
                    lv_color_1_0=(Token)match(input,RULE_COLOR,FOLLOW_2); 

                    						newLeafNode(lv_color_1_0, grammarAccess.getStatesPropertiesAccess().getColorCOLORTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatesPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"color",
                    							lv_color_1_0,
                    							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.COLOR");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:258:3: (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalTSE.g:258:3: (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) )
                    // InternalTSE.g:259:4: otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatesPropertiesAccess().getThicknessKeyword_1_0());
                    			
                    // InternalTSE.g:263:4: ( (lv_thickness_3_0= RULE_FLOAT ) )
                    // InternalTSE.g:264:5: (lv_thickness_3_0= RULE_FLOAT )
                    {
                    // InternalTSE.g:264:5: (lv_thickness_3_0= RULE_FLOAT )
                    // InternalTSE.g:265:6: lv_thickness_3_0= RULE_FLOAT
                    {
                    lv_thickness_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_thickness_3_0, grammarAccess.getStatesPropertiesAccess().getThicknessFLOATTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatesPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"thickness",
                    							lv_thickness_3_0,
                    							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.FLOAT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTSE.g:283:3: (otherlv_4= 'position' ( (lv_position_5_0= RULE_ID ) ) )
                    {
                    // InternalTSE.g:283:3: (otherlv_4= 'position' ( (lv_position_5_0= RULE_ID ) ) )
                    // InternalTSE.g:284:4: otherlv_4= 'position' ( (lv_position_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatesPropertiesAccess().getPositionKeyword_2_0());
                    			
                    // InternalTSE.g:288:4: ( (lv_position_5_0= RULE_ID ) )
                    // InternalTSE.g:289:5: (lv_position_5_0= RULE_ID )
                    {
                    // InternalTSE.g:289:5: (lv_position_5_0= RULE_ID )
                    // InternalTSE.g:290:6: lv_position_5_0= RULE_ID
                    {
                    lv_position_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_position_5_0, grammarAccess.getStatesPropertiesAccess().getPositionIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatesPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"position",
                    							lv_position_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTSE.g:308:3: (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) )
                    {
                    // InternalTSE.g:308:3: (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) )
                    // InternalTSE.g:309:4: this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) )
                    {
                    this_DEFAULT_6=(Token)match(input,RULE_DEFAULT,FOLLOW_4); 

                    				newLeafNode(this_DEFAULT_6, grammarAccess.getStatesPropertiesAccess().getDEFAULTTerminalRuleCall_3_0());
                    			
                    // InternalTSE.g:313:4: ( (lv_position_7_0= RULE_ID ) )
                    // InternalTSE.g:314:5: (lv_position_7_0= RULE_ID )
                    {
                    // InternalTSE.g:314:5: (lv_position_7_0= RULE_ID )
                    // InternalTSE.g:315:6: lv_position_7_0= RULE_ID
                    {
                    lv_position_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_position_7_0, grammarAccess.getStatesPropertiesAccess().getPositionIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatesPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"position",
                    							lv_position_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatesProperties"


    // $ANTLR start "entryRuleTransition"
    // InternalTSE.g:336:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalTSE.g:336:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalTSE.g:337:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalTSE.g:343:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'transition' ( (lv_start_1_0= RULE_ID ) ) ( (lv_end_2_0= ruleEndTransition ) ) ( (lv_proprietyStates_3_0= ruletransitionProperties ) )* ( (lv_label_4_0= ruleLabel ) )? ) | (otherlv_5= 'initialTransition' ( (lv_init_6_0= RULE_ID ) ) this_INT_7= RULE_INT ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_start_1_0=null;
        Token otherlv_5=null;
        Token lv_init_6_0=null;
        Token this_INT_7=null;
        EObject lv_end_2_0 = null;

        EObject lv_proprietyStates_3_0 = null;

        AntlrDatatypeRuleToken lv_label_4_0 = null;



        	enterRule();

        try {
            // InternalTSE.g:349:2: ( ( (otherlv_0= 'transition' ( (lv_start_1_0= RULE_ID ) ) ( (lv_end_2_0= ruleEndTransition ) ) ( (lv_proprietyStates_3_0= ruletransitionProperties ) )* ( (lv_label_4_0= ruleLabel ) )? ) | (otherlv_5= 'initialTransition' ( (lv_init_6_0= RULE_ID ) ) this_INT_7= RULE_INT ) ) )
            // InternalTSE.g:350:2: ( (otherlv_0= 'transition' ( (lv_start_1_0= RULE_ID ) ) ( (lv_end_2_0= ruleEndTransition ) ) ( (lv_proprietyStates_3_0= ruletransitionProperties ) )* ( (lv_label_4_0= ruleLabel ) )? ) | (otherlv_5= 'initialTransition' ( (lv_init_6_0= RULE_ID ) ) this_INT_7= RULE_INT ) )
            {
            // InternalTSE.g:350:2: ( (otherlv_0= 'transition' ( (lv_start_1_0= RULE_ID ) ) ( (lv_end_2_0= ruleEndTransition ) ) ( (lv_proprietyStates_3_0= ruletransitionProperties ) )* ( (lv_label_4_0= ruleLabel ) )? ) | (otherlv_5= 'initialTransition' ( (lv_init_6_0= RULE_ID ) ) this_INT_7= RULE_INT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTSE.g:351:3: (otherlv_0= 'transition' ( (lv_start_1_0= RULE_ID ) ) ( (lv_end_2_0= ruleEndTransition ) ) ( (lv_proprietyStates_3_0= ruletransitionProperties ) )* ( (lv_label_4_0= ruleLabel ) )? )
                    {
                    // InternalTSE.g:351:3: (otherlv_0= 'transition' ( (lv_start_1_0= RULE_ID ) ) ( (lv_end_2_0= ruleEndTransition ) ) ( (lv_proprietyStates_3_0= ruletransitionProperties ) )* ( (lv_label_4_0= ruleLabel ) )? )
                    // InternalTSE.g:352:4: otherlv_0= 'transition' ( (lv_start_1_0= RULE_ID ) ) ( (lv_end_2_0= ruleEndTransition ) ) ( (lv_proprietyStates_3_0= ruletransitionProperties ) )* ( (lv_label_4_0= ruleLabel ) )?
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0_0());
                    			
                    // InternalTSE.g:356:4: ( (lv_start_1_0= RULE_ID ) )
                    // InternalTSE.g:357:5: (lv_start_1_0= RULE_ID )
                    {
                    // InternalTSE.g:357:5: (lv_start_1_0= RULE_ID )
                    // InternalTSE.g:358:6: lv_start_1_0= RULE_ID
                    {
                    lv_start_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_start_1_0, grammarAccess.getTransitionAccess().getStartIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"start",
                    							lv_start_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalTSE.g:374:4: ( (lv_end_2_0= ruleEndTransition ) )
                    // InternalTSE.g:375:5: (lv_end_2_0= ruleEndTransition )
                    {
                    // InternalTSE.g:375:5: (lv_end_2_0= ruleEndTransition )
                    // InternalTSE.g:376:6: lv_end_2_0= ruleEndTransition
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getEndEndTransitionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_end_2_0=ruleEndTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						add(
                    							current,
                    							"end",
                    							lv_end_2_0,
                    							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.EndTransition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTSE.g:393:4: ( (lv_proprietyStates_3_0= ruletransitionProperties ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_DEFAULT||(LA5_0>=15 && LA5_0<=16)||LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTSE.g:394:5: (lv_proprietyStates_3_0= ruletransitionProperties )
                    	    {
                    	    // InternalTSE.g:394:5: (lv_proprietyStates_3_0= ruletransitionProperties )
                    	    // InternalTSE.g:395:6: lv_proprietyStates_3_0= ruletransitionProperties
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransitionAccess().getProprietyStatesTransitionPropertiesParserRuleCall_0_3_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_proprietyStates_3_0=ruletransitionProperties();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"proprietyStates",
                    	    							lv_proprietyStates_3_0,
                    	    							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.transitionProperties");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalTSE.g:412:4: ( (lv_label_4_0= ruleLabel ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTSE.g:413:5: (lv_label_4_0= ruleLabel )
                            {
                            // InternalTSE.g:413:5: (lv_label_4_0= ruleLabel )
                            // InternalTSE.g:414:6: lv_label_4_0= ruleLabel
                            {

                            						newCompositeNode(grammarAccess.getTransitionAccess().getLabelLabelParserRuleCall_0_4_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_label_4_0=ruleLabel();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTransitionRule());
                            						}
                            						set(
                            							current,
                            							"label",
                            							lv_label_4_0,
                            							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.Label");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:433:3: (otherlv_5= 'initialTransition' ( (lv_init_6_0= RULE_ID ) ) this_INT_7= RULE_INT )
                    {
                    // InternalTSE.g:433:3: (otherlv_5= 'initialTransition' ( (lv_init_6_0= RULE_ID ) ) this_INT_7= RULE_INT )
                    // InternalTSE.g:434:4: otherlv_5= 'initialTransition' ( (lv_init_6_0= RULE_ID ) ) this_INT_7= RULE_INT
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getInitialTransitionKeyword_1_0());
                    			
                    // InternalTSE.g:438:4: ( (lv_init_6_0= RULE_ID ) )
                    // InternalTSE.g:439:5: (lv_init_6_0= RULE_ID )
                    {
                    // InternalTSE.g:439:5: (lv_init_6_0= RULE_ID )
                    // InternalTSE.g:440:6: lv_init_6_0= RULE_ID
                    {
                    lv_init_6_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_init_6_0, grammarAccess.getTransitionAccess().getInitIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"init",
                    							lv_init_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_7, grammarAccess.getTransitionAccess().getINTTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleLabel"
    // InternalTSE.g:465:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // InternalTSE.g:465:45: (iv_ruleLabel= ruleLabel EOF )
            // InternalTSE.g:466:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalTSE.g:472:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'label' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTSE.g:478:2: ( (kw= 'label' this_INT_1= RULE_INT ) )
            // InternalTSE.g:479:2: (kw= 'label' this_INT_1= RULE_INT )
            {
            // InternalTSE.g:479:2: (kw= 'label' this_INT_1= RULE_INT )
            // InternalTSE.g:480:3: kw= 'label' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,20,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getLabelAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleEndTransition"
    // InternalTSE.g:496:1: entryRuleEndTransition returns [EObject current=null] : iv_ruleEndTransition= ruleEndTransition EOF ;
    public final EObject entryRuleEndTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndTransition = null;


        try {
            // InternalTSE.g:496:54: (iv_ruleEndTransition= ruleEndTransition EOF )
            // InternalTSE.g:497:2: iv_ruleEndTransition= ruleEndTransition EOF
            {
             newCompositeNode(grammarAccess.getEndTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndTransition=ruleEndTransition();

            state._fsp--;

             current =iv_ruleEndTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndTransition"


    // $ANTLR start "ruleEndTransition"
    // InternalTSE.g:503:1: ruleEndTransition returns [EObject current=null] : ( (otherlv_0= '->' ( (lv_end_1_0= RULE_ID ) ) ) | (otherlv_2= 'reflexive' ( (lv_end_3_0= 'reflexive' ) ) ) ) ;
    public final EObject ruleEndTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_end_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;


        	enterRule();

        try {
            // InternalTSE.g:509:2: ( ( (otherlv_0= '->' ( (lv_end_1_0= RULE_ID ) ) ) | (otherlv_2= 'reflexive' ( (lv_end_3_0= 'reflexive' ) ) ) ) )
            // InternalTSE.g:510:2: ( (otherlv_0= '->' ( (lv_end_1_0= RULE_ID ) ) ) | (otherlv_2= 'reflexive' ( (lv_end_3_0= 'reflexive' ) ) ) )
            {
            // InternalTSE.g:510:2: ( (otherlv_0= '->' ( (lv_end_1_0= RULE_ID ) ) ) | (otherlv_2= 'reflexive' ( (lv_end_3_0= 'reflexive' ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTSE.g:511:3: (otherlv_0= '->' ( (lv_end_1_0= RULE_ID ) ) )
                    {
                    // InternalTSE.g:511:3: (otherlv_0= '->' ( (lv_end_1_0= RULE_ID ) ) )
                    // InternalTSE.g:512:4: otherlv_0= '->' ( (lv_end_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getEndTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0());
                    			
                    // InternalTSE.g:516:4: ( (lv_end_1_0= RULE_ID ) )
                    // InternalTSE.g:517:5: (lv_end_1_0= RULE_ID )
                    {
                    // InternalTSE.g:517:5: (lv_end_1_0= RULE_ID )
                    // InternalTSE.g:518:6: lv_end_1_0= RULE_ID
                    {
                    lv_end_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_end_1_0, grammarAccess.getEndTransitionAccess().getEndIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndTransitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:536:3: (otherlv_2= 'reflexive' ( (lv_end_3_0= 'reflexive' ) ) )
                    {
                    // InternalTSE.g:536:3: (otherlv_2= 'reflexive' ( (lv_end_3_0= 'reflexive' ) ) )
                    // InternalTSE.g:537:4: otherlv_2= 'reflexive' ( (lv_end_3_0= 'reflexive' ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getEndTransitionAccess().getReflexiveKeyword_1_0());
                    			
                    // InternalTSE.g:541:4: ( (lv_end_3_0= 'reflexive' ) )
                    // InternalTSE.g:542:5: (lv_end_3_0= 'reflexive' )
                    {
                    // InternalTSE.g:542:5: (lv_end_3_0= 'reflexive' )
                    // InternalTSE.g:543:6: lv_end_3_0= 'reflexive'
                    {
                    lv_end_3_0=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_end_3_0, grammarAccess.getEndTransitionAccess().getEndReflexiveKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndTransitionRule());
                    						}
                    						addWithLastConsumed(current, "end", lv_end_3_0, "reflexive");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndTransition"


    // $ANTLR start "entryRuletransitionProperties"
    // InternalTSE.g:560:1: entryRuletransitionProperties returns [EObject current=null] : iv_ruletransitionProperties= ruletransitionProperties EOF ;
    public final EObject entryRuletransitionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletransitionProperties = null;


        try {
            // InternalTSE.g:560:61: (iv_ruletransitionProperties= ruletransitionProperties EOF )
            // InternalTSE.g:561:2: iv_ruletransitionProperties= ruletransitionProperties EOF
            {
             newCompositeNode(grammarAccess.getTransitionPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletransitionProperties=ruletransitionProperties();

            state._fsp--;

             current =iv_ruletransitionProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletransitionProperties"


    // $ANTLR start "ruletransitionProperties"
    // InternalTSE.g:567:1: ruletransitionProperties returns [EObject current=null] : ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'curvature' ( (lv_curve_5_0= RULE_FLOAT ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruletransitionProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_color_1_0=null;
        Token otherlv_2=null;
        Token lv_thickness_3_0=null;
        Token otherlv_4=null;
        Token lv_curve_5_0=null;
        Token this_DEFAULT_6=null;
        Token lv_position_7_0=null;


        	enterRule();

        try {
            // InternalTSE.g:573:2: ( ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'curvature' ( (lv_curve_5_0= RULE_FLOAT ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) ) )
            // InternalTSE.g:574:2: ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'curvature' ( (lv_curve_5_0= RULE_FLOAT ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) )
            {
            // InternalTSE.g:574:2: ( (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) ) | (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) ) | (otherlv_4= 'curvature' ( (lv_curve_5_0= RULE_FLOAT ) ) ) | (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case RULE_DEFAULT:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTSE.g:575:3: (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) )
                    {
                    // InternalTSE.g:575:3: (otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) ) )
                    // InternalTSE.g:576:4: otherlv_0= 'color' ( (lv_color_1_0= RULE_COLOR ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionPropertiesAccess().getColorKeyword_0_0());
                    			
                    // InternalTSE.g:580:4: ( (lv_color_1_0= RULE_COLOR ) )
                    // InternalTSE.g:581:5: (lv_color_1_0= RULE_COLOR )
                    {
                    // InternalTSE.g:581:5: (lv_color_1_0= RULE_COLOR )
                    // InternalTSE.g:582:6: lv_color_1_0= RULE_COLOR
                    {
                    lv_color_1_0=(Token)match(input,RULE_COLOR,FOLLOW_2); 

                    						newLeafNode(lv_color_1_0, grammarAccess.getTransitionPropertiesAccess().getColorCOLORTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"color",
                    							lv_color_1_0,
                    							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.COLOR");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTSE.g:600:3: (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalTSE.g:600:3: (otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) ) )
                    // InternalTSE.g:601:4: otherlv_2= 'thickness' ( (lv_thickness_3_0= RULE_FLOAT ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionPropertiesAccess().getThicknessKeyword_1_0());
                    			
                    // InternalTSE.g:605:4: ( (lv_thickness_3_0= RULE_FLOAT ) )
                    // InternalTSE.g:606:5: (lv_thickness_3_0= RULE_FLOAT )
                    {
                    // InternalTSE.g:606:5: (lv_thickness_3_0= RULE_FLOAT )
                    // InternalTSE.g:607:6: lv_thickness_3_0= RULE_FLOAT
                    {
                    lv_thickness_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_thickness_3_0, grammarAccess.getTransitionPropertiesAccess().getThicknessFLOATTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"thickness",
                    							lv_thickness_3_0,
                    							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.FLOAT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTSE.g:625:3: (otherlv_4= 'curvature' ( (lv_curve_5_0= RULE_FLOAT ) ) )
                    {
                    // InternalTSE.g:625:3: (otherlv_4= 'curvature' ( (lv_curve_5_0= RULE_FLOAT ) ) )
                    // InternalTSE.g:626:4: otherlv_4= 'curvature' ( (lv_curve_5_0= RULE_FLOAT ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionPropertiesAccess().getCurvatureKeyword_2_0());
                    			
                    // InternalTSE.g:630:4: ( (lv_curve_5_0= RULE_FLOAT ) )
                    // InternalTSE.g:631:5: (lv_curve_5_0= RULE_FLOAT )
                    {
                    // InternalTSE.g:631:5: (lv_curve_5_0= RULE_FLOAT )
                    // InternalTSE.g:632:6: lv_curve_5_0= RULE_FLOAT
                    {
                    lv_curve_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_curve_5_0, grammarAccess.getTransitionPropertiesAccess().getCurveFLOATTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"curve",
                    							lv_curve_5_0,
                    							"fr.uha.ensisa.project.pan_chabalier.tse.TSE.FLOAT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTSE.g:650:3: (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) )
                    {
                    // InternalTSE.g:650:3: (this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) ) )
                    // InternalTSE.g:651:4: this_DEFAULT_6= RULE_DEFAULT ( (lv_position_7_0= RULE_ID ) )
                    {
                    this_DEFAULT_6=(Token)match(input,RULE_DEFAULT,FOLLOW_4); 

                    				newLeafNode(this_DEFAULT_6, grammarAccess.getTransitionPropertiesAccess().getDEFAULTTerminalRuleCall_3_0());
                    			
                    // InternalTSE.g:655:4: ( (lv_position_7_0= RULE_ID ) )
                    // InternalTSE.g:656:5: (lv_position_7_0= RULE_ID )
                    {
                    // InternalTSE.g:656:5: (lv_position_7_0= RULE_ID )
                    // InternalTSE.g:657:6: lv_position_7_0= RULE_ID
                    {
                    lv_position_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_position_7_0, grammarAccess.getTransitionPropertiesAccess().getPositionIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionPropertiesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"position",
                    							lv_position_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletransitionProperties"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038082L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000918082L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});

}