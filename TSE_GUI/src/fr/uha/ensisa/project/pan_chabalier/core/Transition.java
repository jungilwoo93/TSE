package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;
import fr.uha.ensisa.project.pan_chabalier.gui.EditeurLabel;

public class Transition {
	private State start, end;
	private float thickness, curvature;
	private EditeurLabel label;

	public Transition(State start, State end, Color color, String text, Float thickness, Float curvature) {
		this.setStart(start);
		this.setEnd(end);
		this.setLabel(new EditeurLabel(text, color, (start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2));

	}

	public Transition(State start, State end, Color color, Float thickness, Float curvature, String text,
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

	//always use setStart before setEnd
	public void setEnd(State end) {
//		if(end.equals(null)) {
//			end = start;
//		}
		this.end = end;
	}

	public float getThickness() {
		return thickness;
	}

	public void setThickness(Float thickness) {
//		if(thickness.equals(null)) {
//			thickness = Constants.DEFAULT_THICKNESS;
//		}
		this.thickness = thickness;
	}

	public float getCurvature() {
		return curvature;
	}

	public void setCurvature(Float curvature) {
//		if(curvature.equals(null)) {
//			curvature = Constants.DEFAULT_CURVATURE;
//		}
		this.curvature = curvature;
	}

	public EditeurLabel getLabel() {
		return label;
	}

	public void setLabel(EditeurLabel label) {
		this.label = label;
	}

}
