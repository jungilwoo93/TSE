package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JTextField;

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;

public class State extends Element{
	private Point p;
	private Color color;
	private float thickness;
	private String id;
	private EditeurLabel label;
	private int sizeOval = 50;

	public State(String id, Color color, Float thickness, int x, int y) {
		super();
		setId(id);
		EditeurLabel label = new EditeurLabel(id, color,x + sizeOval / 2, y + sizeOval / 2);
		setLabel(label);
		setP(new Point(x,y));
		setColor(color);
		setThickness(thickness);
	}

	public State(String id, Color color, Float thickness, Point p) {
		super();
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

	@Deprecated
	@Override
	public boolean isInBounds(Point other) {
		// Check if the coordinates of the other point is in the circle ( (xa + xb)² + (ya + yb) = radius)
		return Math.pow(this.p.getX()+other.getX(), 2)+Math.pow(this.p.getY()+other.getY(), 2)==Constants.DEFAULT_STATE_RADIUS;
	}
	
	@Override
	public Rectangle getBounds() {
		Point upPoint = new Point((int) (this.p.getX()), (int) (this.p.getY()));
		Dimension dim = new Dimension(Constants.DEFAULT_STATE_RADIUS, Constants.DEFAULT_STATE_RADIUS);
		return (new Rectangle(upPoint, dim));
	}
	@Override
	public EditeurLabel getLabel() {
		return label;
	}

	public void setLabel(EditeurLabel label) {
		this.label = label;
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
