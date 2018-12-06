package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JTextField;

public class Transition extends Element {
	private State start, end;
	private float thickness, curvature;
	private EditeurLabel label;
	private Color color;

	public Transition(State start, State end, Color color, Float thickness, Float curvature, String text) {
		super();
		this.setStart(start);
		this.setEnd(end);
		this.setThickness(thickness);
		this.setCurvature(curvature);
		this.setColor(color);
		this.setLabel(new EditeurLabel(text, Color.BLACK, (start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2));

	}

	public Transition(State start, State end, Color color, Float thickness, Float curvature, String text,
			Point textPosition) {
		super();
		this.setStart(start);
		this.setEnd(end);
		this.setThickness(thickness);
		this.setCurvature(curvature);
		this.setLabel(new EditeurLabel(text,color,textPosition));
	
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

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	@Deprecated
	public boolean isInBounds(Point other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public JTextField labelToJtext() {
		JTextField txt = new JTextField(label.getText());
		txt.setLocation(label.getLocation());
		txt.setBounds(label.getBounds());
		txt.setEditable(true);
		return txt;
	}
}
