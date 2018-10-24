package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

import fr.uha.ensisa.project.pan_chabalier.gui.EditeurLabel;

public class Transition {
	private State start, end;
	private float thickness, curvature;
	private EditeurLabel label;

	public Transition(State start, State end, Color color, String label, float thickness, float curvature) {
		this.setStart(start);
		this.setEnd(end);
		this.setLabel(new EditeurLabel(label, color, (start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2));

	}

	public Transition(State state, State state2, Color color, float thickness2, float curvature2, String text,
			Point textPosition) {
		// TODO Auto-generated constructor stub
	}

	public State getStart() {
		return start;
	}

	public void setStart(State start) {
		this.start = start;
	}

	public State getEnd() {
		return end;
	}

	public void setEnd(State end) {
		this.end = end;
	}

	public float getThickness() {
		return thickness;
	}

	public void setThickness(float thickness) {
		this.thickness = thickness;
	}

	public float getCurvature() {
		return curvature;
	}

	public void setCurvature(float curvature) {
		this.curvature = curvature;
	}

	public EditeurLabel getLabel() {
		return label;
	}

	public void setLabel(EditeurLabel label) {
		this.label = label;
	}

}
