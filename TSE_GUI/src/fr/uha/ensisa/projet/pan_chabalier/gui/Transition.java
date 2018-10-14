package fr.uha.ensisa.projet.pan_chabalier.gui;

import java.awt.Color;

public class Transition {
	private State start, end;
	private float thickness, curvature;
	private EditeurLabel label;
	public Transition(State start,State end,Color color,String label, float thickness, float curvature) {
		this.start=start;
		this.end=end;
		this.label=new EditeurLabel(label,color,(start.getX()+end.getX())/2,(start.getY()+end.getY())/2);
		
	}
	
}
