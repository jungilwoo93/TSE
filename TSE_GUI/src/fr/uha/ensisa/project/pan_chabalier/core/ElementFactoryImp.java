package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

public class ElementFactoryImp implements ElementFactory{

	private HashMap<String,State> states = new HashMap<String,State>();
	private ArrayList<Transition> transitions = new ArrayList<Transition>();
	
	@Override
	public State createState(String id, Color color, float thickness, Point p) {
		State s = new State(id, color, thickness, p);
		states.put(id,s);
		return s;
	}
	
	@Override
	public Transition createTransition(String startId, String endId, Color color, float thickness, float curvature, String text, Point textPosition) {
		Transition t = new Transition(states.get(startId), states.get(endId), color, thickness, curvature, text, textPosition);
		transitions.add(t);
		return t;
	}

	public HashMap<String, State> getStates() {
		return states;
	}

	public ArrayList<Transition> getTransitions() {
		return transitions;
	}

}
