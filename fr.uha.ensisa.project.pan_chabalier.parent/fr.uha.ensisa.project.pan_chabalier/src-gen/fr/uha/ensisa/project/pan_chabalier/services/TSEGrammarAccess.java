/*
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TSEGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=Element*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Element*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_0() { return cElementsElementParserRuleCall_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cStateAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cStateStateParserRuleCall_0_0 = (RuleCall)cStateAssignment_0.eContents().get(0);
		private final Assignment cTransitionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_1_0 = (RuleCall)cTransitionAssignment_1.eContents().get(0);
		
		//Element:
		//	state=State
		//	| transition=Transition;
		@Override public ParserRule getRule() { return rule; }
		
		//state=State | transition=Transition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//state=State
		public Assignment getStateAssignment_0() { return cStateAssignment_0; }
		
		//State
		public RuleCall getStateStateParserRuleCall_0_0() { return cStateStateParserRuleCall_0_0; }
		
		//transition=Transition
		public Assignment getTransitionAssignment_1() { return cTransitionAssignment_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_1_0() { return cTransitionTransitionParserRuleCall_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStatesPropertiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatesPropertiesStatesPropertiesParserRuleCall_2_0 = (RuleCall)cStatesPropertiesAssignment_2.eContents().get(0);
		
		//State:
		//	"state" name=ID statesProperties+=StatesProperties+;
		@Override public ParserRule getRule() { return rule; }
		
		//"state" name=ID statesProperties+=StatesProperties+
		public Group getGroup() { return cGroup; }
		
		//"state"
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//statesProperties+=StatesProperties+
		public Assignment getStatesPropertiesAssignment_2() { return cStatesPropertiesAssignment_2; }
		
		//StatesProperties
		public RuleCall getStatesPropertiesStatesPropertiesParserRuleCall_2_0() { return cStatesPropertiesStatesPropertiesParserRuleCall_2_0; }
	}
	public class StatesPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.StatesProperties");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cColorKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cColorAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cColorCOLORTerminalRuleCall_0_1_0 = (RuleCall)cColorAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cThicknessKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cThicknessAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cThicknessFLOATTerminalRuleCall_1_1_0 = (RuleCall)cThicknessAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cPositionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPositionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPositionCOORDINATESTerminalRuleCall_2_1_0 = (RuleCall)cPositionAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final RuleCall cDEFAULTTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Assignment cPositionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPositionCOORDINATESTerminalRuleCall_3_1_0 = (RuleCall)cPositionAssignment_3_1.eContents().get(0);
		
		//StatesProperties:
		//	"color" color=COLOR
		//	| "thickness" thickness=FLOAT
		//	| "position" position=COORDINATES
		//	| DEFAULT position=COORDINATES;
		@Override public ParserRule getRule() { return rule; }
		
		//"color" color=COLOR | "thickness" thickness=FLOAT | "position" position=COORDINATES | DEFAULT position=COORDINATES
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"color" color=COLOR
		public Group getGroup_0() { return cGroup_0; }
		
		//"color"
		public Keyword getColorKeyword_0_0() { return cColorKeyword_0_0; }
		
		//color=COLOR
		public Assignment getColorAssignment_0_1() { return cColorAssignment_0_1; }
		
		//COLOR
		public RuleCall getColorCOLORTerminalRuleCall_0_1_0() { return cColorCOLORTerminalRuleCall_0_1_0; }
		
		//"thickness" thickness=FLOAT
		public Group getGroup_1() { return cGroup_1; }
		
		//"thickness"
		public Keyword getThicknessKeyword_1_0() { return cThicknessKeyword_1_0; }
		
		//thickness=FLOAT
		public Assignment getThicknessAssignment_1_1() { return cThicknessAssignment_1_1; }
		
		//FLOAT
		public RuleCall getThicknessFLOATTerminalRuleCall_1_1_0() { return cThicknessFLOATTerminalRuleCall_1_1_0; }
		
		//"position" position=COORDINATES
		public Group getGroup_2() { return cGroup_2; }
		
		//"position"
		public Keyword getPositionKeyword_2_0() { return cPositionKeyword_2_0; }
		
		//position=COORDINATES
		public Assignment getPositionAssignment_2_1() { return cPositionAssignment_2_1; }
		
		//COORDINATES
		public RuleCall getPositionCOORDINATESTerminalRuleCall_2_1_0() { return cPositionCOORDINATESTerminalRuleCall_2_1_0; }
		
		//DEFAULT position=COORDINATES
		public Group getGroup_3() { return cGroup_3; }
		
		//DEFAULT
		public RuleCall getDEFAULTTerminalRuleCall_3_0() { return cDEFAULTTerminalRuleCall_3_0; }
		
		//position=COORDINATES
		public Assignment getPositionAssignment_3_1() { return cPositionAssignment_3_1; }
		
		//COORDINATES
		public RuleCall getPositionCOORDINATESTerminalRuleCall_3_1_0() { return cPositionCOORDINATESTerminalRuleCall_3_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.Transition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cTransitionKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cStartAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cStartCoordinatesStatesTransitionParserRuleCall_0_1_0 = (RuleCall)cStartAssignment_0_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cEndAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cEndCoordinatesStatesTransitionParserRuleCall_0_3_0 = (RuleCall)cEndAssignment_0_3.eContents().get(0);
		private final Assignment cTransitionPropertiesAssignment_0_4 = (Assignment)cGroup_0.eContents().get(4);
		private final RuleCall cTransitionPropertiesTransitionPropertiesParserRuleCall_0_4_0 = (RuleCall)cTransitionPropertiesAssignment_0_4.eContents().get(0);
		private final Assignment cLabelAssignment_0_5 = (Assignment)cGroup_0.eContents().get(5);
		private final RuleCall cLabelLabelParserRuleCall_0_5_0 = (RuleCall)cLabelAssignment_0_5.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cInitialTransitionKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cInitAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cInitIDTerminalRuleCall_1_1_0 = (RuleCall)cInitAssignment_1_1.eContents().get(0);
		private final RuleCall cCOORDINATESTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		
		//Transition:
		//	"transition"? start=CoordinatesStatesTransition "->" end=CoordinatesStatesTransition
		//	transitionProperties+=TransitionProperties* label=Label?
		//	| "initialTransition" init=ID COORDINATES;
		@Override public ParserRule getRule() { return rule; }
		
		//"transition"? start=CoordinatesStatesTransition "->" end=CoordinatesStatesTransition
		//transitionProperties+=TransitionProperties* label=Label? | "initialTransition" init=ID COORDINATES
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"transition"? start=CoordinatesStatesTransition "->" end=CoordinatesStatesTransition
		//transitionProperties+=TransitionProperties* label=Label?
		public Group getGroup_0() { return cGroup_0; }
		
		//"transition"?
		public Keyword getTransitionKeyword_0_0() { return cTransitionKeyword_0_0; }
		
		//start=CoordinatesStatesTransition
		public Assignment getStartAssignment_0_1() { return cStartAssignment_0_1; }
		
		//CoordinatesStatesTransition
		public RuleCall getStartCoordinatesStatesTransitionParserRuleCall_0_1_0() { return cStartCoordinatesStatesTransitionParserRuleCall_0_1_0; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_0_2() { return cHyphenMinusGreaterThanSignKeyword_0_2; }
		
		//end=CoordinatesStatesTransition
		public Assignment getEndAssignment_0_3() { return cEndAssignment_0_3; }
		
		//CoordinatesStatesTransition
		public RuleCall getEndCoordinatesStatesTransitionParserRuleCall_0_3_0() { return cEndCoordinatesStatesTransitionParserRuleCall_0_3_0; }
		
		//transitionProperties+=TransitionProperties*
		public Assignment getTransitionPropertiesAssignment_0_4() { return cTransitionPropertiesAssignment_0_4; }
		
		//TransitionProperties
		public RuleCall getTransitionPropertiesTransitionPropertiesParserRuleCall_0_4_0() { return cTransitionPropertiesTransitionPropertiesParserRuleCall_0_4_0; }
		
		//label=Label?
		public Assignment getLabelAssignment_0_5() { return cLabelAssignment_0_5; }
		
		//Label
		public RuleCall getLabelLabelParserRuleCall_0_5_0() { return cLabelLabelParserRuleCall_0_5_0; }
		
		//"initialTransition" init=ID COORDINATES
		public Group getGroup_1() { return cGroup_1; }
		
		//"initialTransition"
		public Keyword getInitialTransitionKeyword_1_0() { return cInitialTransitionKeyword_1_0; }
		
		//init=ID
		public Assignment getInitAssignment_1_1() { return cInitAssignment_1_1; }
		
		//ID
		public RuleCall getInitIDTerminalRuleCall_1_1_0() { return cInitIDTerminalRuleCall_1_1_0; }
		
		//COORDINATES
		public RuleCall getCOORDINATESTerminalRuleCall_1_2() { return cCOORDINATESTerminalRuleCall_1_2; }
	}
	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.Label");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLabelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Assignment cPositionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPositionCOORDINATESTerminalRuleCall_2_0 = (RuleCall)cPositionAssignment_2.eContents().get(0);
		
		//Label:
		//	"label" text=STRING position=COORDINATES;
		@Override public ParserRule getRule() { return rule; }
		
		//"label" text=STRING position=COORDINATES
		public Group getGroup() { return cGroup; }
		
		//"label"
		public Keyword getLabelKeyword_0() { return cLabelKeyword_0; }
		
		//text=STRING
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_1_0() { return cTextSTRINGTerminalRuleCall_1_0; }
		
		//position=COORDINATES
		public Assignment getPositionAssignment_2() { return cPositionAssignment_2; }
		
		//COORDINATES
		public RuleCall getPositionCOORDINATESTerminalRuleCall_2_0() { return cPositionCOORDINATESTerminalRuleCall_2_0; }
	}
	public class CoordinatesStatesTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.CoordinatesStatesTransition");
		private final Assignment cStateTransitionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStateTransitionIDTerminalRuleCall_0 = (RuleCall)cStateTransitionAssignment.eContents().get(0);
		
		//CoordinatesStatesTransition:
		//	stateTransition=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//stateTransition=ID
		public Assignment getStateTransitionAssignment() { return cStateTransitionAssignment; }
		
		//ID
		public RuleCall getStateTransitionIDTerminalRuleCall_0() { return cStateTransitionIDTerminalRuleCall_0; }
	}
	public class TransitionPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.TransitionProperties");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cColorKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cColorAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cColorCOLORTerminalRuleCall_0_1_0 = (RuleCall)cColorAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cThicknessKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cThicknessAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cThicknessFLOATTerminalRuleCall_1_1_0 = (RuleCall)cThicknessAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cCurvatureKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cCurveAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cCurveFLOATTerminalRuleCall_2_1_0 = (RuleCall)cCurveAssignment_2_1.eContents().get(0);
		
		//TransitionProperties:
		//	"color" color=COLOR | "thickness" thickness=FLOAT | "curvature" curve=FLOAT;
		@Override public ParserRule getRule() { return rule; }
		
		//"color" color=COLOR | "thickness" thickness=FLOAT | "curvature" curve=FLOAT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"color" color=COLOR
		public Group getGroup_0() { return cGroup_0; }
		
		//"color"
		public Keyword getColorKeyword_0_0() { return cColorKeyword_0_0; }
		
		//color=COLOR
		public Assignment getColorAssignment_0_1() { return cColorAssignment_0_1; }
		
		//COLOR
		public RuleCall getColorCOLORTerminalRuleCall_0_1_0() { return cColorCOLORTerminalRuleCall_0_1_0; }
		
		//"thickness" thickness=FLOAT
		public Group getGroup_1() { return cGroup_1; }
		
		//"thickness"
		public Keyword getThicknessKeyword_1_0() { return cThicknessKeyword_1_0; }
		
		//thickness=FLOAT
		public Assignment getThicknessAssignment_1_1() { return cThicknessAssignment_1_1; }
		
		//FLOAT
		public RuleCall getThicknessFLOATTerminalRuleCall_1_1_0() { return cThicknessFLOATTerminalRuleCall_1_1_0; }
		
		//"curvature" curve=FLOAT
		public Group getGroup_2() { return cGroup_2; }
		
		//"curvature"
		public Keyword getCurvatureKeyword_2_0() { return cCurvatureKeyword_2_0; }
		
		//curve=FLOAT
		public Assignment getCurveAssignment_2_1() { return cCurveAssignment_2_1; }
		
		//FLOAT
		public RuleCall getCurveFLOATTerminalRuleCall_2_1_0() { return cCurveFLOATTerminalRuleCall_2_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final StateElements pState;
	private final StatesPropertiesElements pStatesProperties;
	private final TransitionElements pTransition;
	private final LabelElements pLabel;
	private final CoordinatesStatesTransitionElements pCoordinatesStatesTransition;
	private final TransitionPropertiesElements pTransitionProperties;
	private final TerminalRule tDEFAULT;
	private final TerminalRule tCOLOR;
	private final TerminalRule tFLOAT;
	private final TerminalRule tCOORDINATES;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TSEGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pState = new StateElements();
		this.pStatesProperties = new StatesPropertiesElements();
		this.pTransition = new TransitionElements();
		this.pLabel = new LabelElements();
		this.pCoordinatesStatesTransition = new CoordinatesStatesTransitionElements();
		this.pTransitionProperties = new TransitionPropertiesElements();
		this.tDEFAULT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.DEFAULT");
		this.tCOLOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.COLOR");
		this.tFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.FLOAT");
		this.tCOORDINATES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.uha.ensisa.project.pan_chabalier.TSE.COORDINATES");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.uha.ensisa.project.pan_chabalier.TSE".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=Element*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element:
	//	state=State
	//	| transition=Transition;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//State:
	//	"state" name=ID statesProperties+=StatesProperties+;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//StatesProperties:
	//	"color" color=COLOR
	//	| "thickness" thickness=FLOAT
	//	| "position" position=COORDINATES
	//	| DEFAULT position=COORDINATES;
	public StatesPropertiesElements getStatesPropertiesAccess() {
		return pStatesProperties;
	}
	
	public ParserRule getStatesPropertiesRule() {
		return getStatesPropertiesAccess().getRule();
	}
	
	//Transition:
	//	"transition"? start=CoordinatesStatesTransition "->" end=CoordinatesStatesTransition
	//	transitionProperties+=TransitionProperties* label=Label?
	//	| "initialTransition" init=ID COORDINATES;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Label:
	//	"label" text=STRING position=COORDINATES;
	public LabelElements getLabelAccess() {
		return pLabel;
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}
	
	//CoordinatesStatesTransition:
	//	stateTransition=ID;
	public CoordinatesStatesTransitionElements getCoordinatesStatesTransitionAccess() {
		return pCoordinatesStatesTransition;
	}
	
	public ParserRule getCoordinatesStatesTransitionRule() {
		return getCoordinatesStatesTransitionAccess().getRule();
	}
	
	//TransitionProperties:
	//	"color" color=COLOR | "thickness" thickness=FLOAT | "curvature" curve=FLOAT;
	public TransitionPropertiesElements getTransitionPropertiesAccess() {
		return pTransitionProperties;
	}
	
	public ParserRule getTransitionPropertiesRule() {
		return getTransitionPropertiesAccess().getRule();
	}
	
	//terminal DEFAULT:
	//	"DEFAULT" | "default";
	public TerminalRule getDEFAULTRule() {
		return tDEFAULT;
	}
	
	//terminal COLOR:
	//	"WHITE" | "BLACK" | "BLUE" | "CYAN" | "DARK_GRAY" | "GRAY" | "LIGHT_GRAY" | "GREEN" | "MAGENTA" | "ORANGE" | "PINK"
	//	| "RED" | "YELLOW";
	public TerminalRule getCOLORRule() {
		return tCOLOR;
	}
	
	//terminal FLOAT:
	//	INT '.' INT;
	public TerminalRule getFLOATRule() {
		return tFLOAT;
	}
	
	//terminal COORDINATES:
	//	INT ',' INT;
	public TerminalRule getCOORDINATESRule() {
		return tCOORDINATES;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
