package fr.uha.ensisa.projet.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

import fr.uha.ensisa.projet.pan_chabalier.gui.State;
import fr.uha.ensisa.projet.pan_chabalier.gui.Transition;

public interface ElementFactory {
	
	public State createState(String id, Color color, float thickness, Point p);

	public Transition createTransition(String startId, String endId, Color color, float thickness, float curvature, String text, Point textPosition);
}
