package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

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

	public HashMap<String, State> getStates() {
		return states;
	}

	public ArrayList<Transition> getTransitions() {
		return transitions;
	}

	public State createState(String id, Point point, Object object, Float float1) {
		// TODO Auto-generated method stub
		State s = null;
		states.put(id,s);
		return s;
	}

	public State createState(String id, Point point, Object object, Float float1, Point point2, Object object2,
			Float float2, Point point3, Color gray, Float float3) {
		// TODO Auto-generated method stub
		State s = null;
		states.put(id,s);
		return s;
	}

	public Transition createTransition(String string, String string2, Color gray, Float float1, Float float2, Object object,
			Float float3, Float float4, Object object2, Float float5, Float float6, String string3, Point point) {
		// TODO Auto-generated method stub
		Transition t = null;
		transitions.add(t);
		return t;
	}

	public Transition createTransition(String string, String string2, String string3, Point point) {
		// TODO Auto-generated method stub
		Transition t = null;
		transitions.add(t);
		return t;
	}

}
