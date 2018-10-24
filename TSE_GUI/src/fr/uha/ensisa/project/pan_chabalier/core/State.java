package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Point;

public class State {
	private int x, y;
	private Color color;
	private float thickness;
	private String id;

	public State(String id, Color color, float thickness, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.setColor(color);
		this.setThickness(thickness);

	}

	public State(String id2, Color color2, float thickness2, Point p) {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
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
}
