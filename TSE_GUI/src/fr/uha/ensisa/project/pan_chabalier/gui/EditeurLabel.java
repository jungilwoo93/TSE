package fr.uha.ensisa.project.pan_chabalier.gui;

import java.awt.Color;
import java.awt.Point;

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;

public class EditeurLabel {
	private String text;
	private Point p;
	// private JLabel label;
	private Color color;

	public EditeurLabel(String text, Color color, int x, int y) {
		// label=new JLabel(text);
		// label.setLocation(x, y);
		// label.setForeground(color);
		System.out.println("create");
		setText(text);
		setColor(color);
		setP(new Point(x, y));
	}

	public EditeurLabel(String text, Color color, Point textPosition) {
		setText(text);
		setColor(color);
		setP(textPosition);
	}

	public String getText() {
		// return this.label.getText();
		return text;
	}

	public void setText(String text) {
		this.text = text;
		// this.label.setText(text);
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

	/*
	 * public JLabel getLabel() { return this.label; }
	 */

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		if(color.equals(null)) {
			color = Constants.DEFAULT_COLOR;
		}
		this.color = color;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
}
