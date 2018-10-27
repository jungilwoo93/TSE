package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

import fr.uha.ensisa.project.pan_chabalier.gui.EditeurLabel;

public class Transition {
	private State start, end;
	private float thickness, curvature;
	private EditeurLabel label;

	public Transition(State start, State end, Color color, String text, float thickness, float curvature) {
		this.setStart(start);
		this.setEnd(end);
		this.setLabel(new EditeurLabel(text, color, (start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2));

	}

	public Transition(State start, State end, Color color, float thickness, float curvature, String text,
			Point textPosition) {
		setStart(start);
		setEnd(end);
		setThickness(thickness);
		setCurvature(curvature);
		setLabel(new EditeurLabel(text,color,textPosition));
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
