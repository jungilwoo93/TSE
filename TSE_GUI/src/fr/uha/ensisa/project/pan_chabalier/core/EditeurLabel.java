package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

import javax.swing.JLabel;
import javax.swing.JTextField;

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;

public class EditeurLabel extends JLabel{
	//private String text;
	//private Point p;
	//private JLabel label;
	private Color color;

	public EditeurLabel(String text, Color color, int x, int y) {
		//label=new JLabel(text);
		//label.setLocation(x, y);
		// label.setLocation(x, y);
		// label.setForeground(color);
		//System.out.println("create");
		//setText(text);
		//this.setEditable(false);
		this.setText(text);
		this.setLocation(x, y);
		this.setColor(color);
		this.setLocation(x, y);
	}

	public EditeurLabel(String text, Color color, Point textPosition) {
		//setText(text);
		//label=new JLabel(text);
		//label.setLocation(textPosition);
		//this.setEditable(false);
		this.setText(text);
		this.setLocation(textPosition);
		this.setColor(color);
		this.setLocation(textPosition);
	}

	/*public String getText() {
		// return this.label.getText();
		
		return this.getText();
	}

	public void setText(String text) {
		this.setText(text);
		// this.label.setText(text);
	}*/

	/*public int getX() {
		return this.getX();
	}

	public void setX(int x) {
		p.setLocation(x, p.y);
	}

	public int getY() {
		return this.getY();
	}*/

	/*public void setY(int y) {
		p.setLocation(p.x, y);
	}*/

	/*public JLabel getLabel() { 
		return this; 
	}*/
	
	/*public void setLabel(JLabel label) {
		this.setLabel(label);
	}*/
	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		if(color.equals(null)) {
			color = Constants.DEFAULT_COLOR;
		}
		this.color = color;
		//this.setColor(color);
	}
	
	public Rectangle getBounds() {
		Font font = new Font("SANS_SERIF",0,15);
		AffineTransform affinetransform = new AffineTransform();
		FontRenderContext frc = new FontRenderContext(affinetransform, true, true);
		int textwidth = (int) (font.getStringBounds(this.getText(), frc).getWidth()+5);
		int textheight = (int) (font.getStringBounds(this.getText(), frc).getHeight());
		Point upPoint = new Point((int) (this.getX()), (int) (this.getY()) - textheight);
		Dimension dim = new Dimension(textwidth, textheight);
		return (new Rectangle(upPoint, dim));
	}



	/*public Point getP() {
		return this.getLocation();
	}*/

	/*public void setP(Point p) {
		this.setLocation(p);
	}*/
}
