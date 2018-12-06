package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;

public class State {
	private Point p;
	private Color color;
	private float thickness;
	private String id;
	private EditeurLabel label;
	private int sizeOval = 50;

	public State(String id, Color color, Float thickness, int x, int y) {
		setId(id);
		EditeurLabel label = new EditeurLabel(id, color,x + sizeOval / 2, y + sizeOval / 2);
		setLabel(label);
		setP(new Point(x,y));
		setColor(color);
		setThickness(thickness);
	}

	public State(String id, Color color, Float thickness, Point p) {
		setId(id);
		EditeurLabel label = new EditeurLabel(id, color,(int)p.getX() + sizeOval / 2, (int)p.getY() + sizeOval / 2);
		setLabel(label);
		setP(p);
		setColor(color);
		setThickness(thickness);	
	}


	public int getX() {
		return p.x;
	}

	public void setX(int x) {
		p.setLocation(x, p.y);
	}

	public int getY() {
		return p.y;
	}


	public void setY(int y) {
		p.setLocation(p.x, y);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
//		if(color.equals(null)) {
//			color = Constants.DEFAULT_COLOR;
//		}
		this.color = color;
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

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public EditeurLabel getLabel() {
		return label;
	}

	public void setLabel(EditeurLabel label) {
		this.label = label;
	}
}
