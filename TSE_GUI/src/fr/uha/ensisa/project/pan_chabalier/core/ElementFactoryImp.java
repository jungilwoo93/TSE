package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;

public class ElementFactoryImp implements ElementFactory{

	private HashMap<String,State> states = new HashMap<String,State>();
	private ArrayList<Transition> transitions = new ArrayList<Transition>();
	
	@Override
	public State createState(String id, Color color, Float thickness, Point p) {
		State s = new State(id, color, thickness, p);
		states.put(id,s);
		return s;
	}
	
	@Override
	public Transition createTransition(String startId, String endId, Color color, Float thickness, Float curvature, String text, Point textPosition) {
		Transition t = new Transition(states.get(startId), states.get(endId), color, thickness, curvature, text, textPosition);
		transitions.add(t);
		return t;
	}
	
	/*public State createState(String id, Point point, Color color, Float thickness) {
		State s = new State(id,color,thickness,point);
		states.put(id,s);
		return s;
	}

	public Transition createTransition(String startId, String endId, String labelText, Point LabelPoint) {
		Transition t = new Transition(states.get(startId), states.get(endId), Constants.DEFAULT_COLOR, Constants.DEFAULT_THICKNESS, Constants.DEFAULT_CURVATURE, labelText, LabelPoint);
		transitions.add(t);
		return t;
	}*/

	public HashMap<String, State> getStates() {
		return states;
	}

	public ArrayList<Transition> getTransitions() {
		return transitions;
	}

	public void erase() {
		this.states.clear();
		this.transitions.clear();
	}
}
