package fr.uha.ensisa.projet.pan_chabalier.gui;

import java.awt.Color;

import javax.swing.JLabel;

public class EditeurLabel {
	private String text;
	private int x;
	private int y;
	//private JLabel label;
	private Color color;

	public EditeurLabel(String text,Color color, int x,int y) {
		//label=new JLabel(text);
		//label.setLocation(x, y);
		//label.setForeground(color);
		System.out.println("create");
		this.color=color;
		this.text=text;
		this.x=x;
		this.y=y;
	}

	public String getText() {
		//return this.label.getText();
		return text;
	}

	public void setText(String text) {
		this.text = text;
		//this.label.setText(text);
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
	
	/*public JLabel getLabel() {
		return this.label;
	}*/

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
