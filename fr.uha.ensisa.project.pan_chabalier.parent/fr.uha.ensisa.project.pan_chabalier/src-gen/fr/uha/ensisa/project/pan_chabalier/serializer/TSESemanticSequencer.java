/*
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.serializer;

import com.google.inject.Inject;
import fr.uha.ensisa.project.pan_chabalier.services.TSEGrammarAccess;
import fr.uha.ensisa.project.pan_chabalier.tSE.CoordinatesStatesTransition;
import fr.uha.ensisa.project.pan_chabalier.tSE.Element;
import fr.uha.ensisa.project.pan_chabalier.tSE.Label;
import fr.uha.ensisa.project.pan_chabalier.tSE.Model;
import fr.uha.ensisa.project.pan_chabalier.tSE.State;
import fr.uha.ensisa.project.pan_chabalier.tSE.StatesProperties;
import fr.uha.ensisa.project.pan_chabalier.tSE.TSEPackage;
import fr.uha.ensisa.project.pan_chabalier.tSE.Transition;
import fr.uha.ensisa.project.pan_chabalier.tSE.TransitionProperties;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TSESemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TSEGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TSEPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TSEPackage.COORDINATES_STATES_TRANSITION:
				sequence_CoordinatesStatesTransition(context, (CoordinatesStatesTransition) semanticObject); 
				return; 
			case TSEPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case TSEPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case TSEPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TSEPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case TSEPackage.STATES_PROPERTIES:
				sequence_StatesProperties(context, (StatesProperties) semanticObject); 
				return; 
			case TSEPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case TSEPackage.TRANSITION_PROPERTIES:
				sequence_TransitionProperties(context, (TransitionProperties) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CoordinatesStatesTransition returns CoordinatesStatesTransition
	 *
	 * Constraint:
	 *     stateTransition=ID
	 */
	protected void sequence_CoordinatesStatesTransition(ISerializationContext context, CoordinatesStatesTransition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TSEPackage.Literals.COORDINATES_STATES_TRANSITION__STATE_TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TSEPackage.Literals.COORDINATES_STATES_TRANSITION__STATE_TRANSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinatesStatesTransitionAccess().getStateTransitionIDTerminalRuleCall_0(), semanticObject.getStateTransition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Element
	 *
	 * Constraint:
	 *     (state=State | transition=Transition)
	 */
	protected void sequence_Element(ISerializationContext context, Element semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Label returns Label
	 *
	 * Constraint:
	 *     (text=STRING position=COORDINATES)
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TSEPackage.Literals.LABEL__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TSEPackage.Literals.LABEL__TEXT));
			if (transientValues.isValueTransient(semanticObject, TSEPackage.Literals.LABEL__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TSEPackage.Literals.LABEL__POSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getLabelAccess().getPositionCOORDINATESTerminalRuleCall_2_0(), semanticObject.getPosition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Element+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID statesProperties+=StatesProperties+)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StatesProperties returns StatesProperties
	 *
	 * Constraint:
	 *     (color=COLOR | thickness=FLOAT | position=COORDINATES | position=COORDINATES)
	 */
	protected void sequence_StatesProperties(ISerializationContext context, StatesProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionProperties returns TransitionProperties
	 *
	 * Constraint:
	 *     (color=COLOR | thickness=FLOAT | curve=FLOAT)
	 */
	protected void sequence_TransitionProperties(ISerializationContext context, TransitionProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     ((start=CoordinatesStatesTransition end=CoordinatesStatesTransition transitionProperties+=TransitionProperties* label=Label?) | init=ID)
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
