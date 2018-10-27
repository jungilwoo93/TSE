package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

public class State {
	private Point p;
	private Color color;
	private float thickness;
	private String id;

	public State(String id, Color color, float thickness, int x, int y) {
		setId(id);
		setP(new Point(x,y));
		setColor(color);
		setThickness(thickness);
	}

	public State(String id, Color color, float thickness, Point p) {
		setId(id);
		setP(p);
		setColor(color);
		setThickness(thickness);	}

	@Deprecated
	public int getX() {
		return p.x;
	}

	@Deprecated
	public void setX(int x) {
		p.setLocation(x, p.y);
	}

	@Deprecated
	public int getY() {
		return p.y;
	}

	@Deprecated
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
		this.color = color;
	}

	public float getThickness() {
		return thickness;
	}

	public void setThickness(float thickness) {
		this.thickness = thickness;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
}
