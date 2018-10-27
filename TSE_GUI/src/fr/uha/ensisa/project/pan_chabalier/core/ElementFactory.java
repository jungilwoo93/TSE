package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

public interface ElementFactory {
	
	public State createState(String id, Color color, Float thickness, Point p);

	public Transition createTransition(String startId, String endId, Color color, Float thickness, Float curvature, String text, Point textPosition);
}
