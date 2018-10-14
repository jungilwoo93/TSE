package fr.uha.ensisa.projet.pan_chabalier.gui;

import java.awt.Color;

public class State {
	private int x,y,id;
	private Color color;
	private float thickness;
	
	public State(int id,Color color, float thickness,int x,int y) {
		this.id=id;
		this.x=x;
		this.y=y;
		this.color=color;
		this.thickness=thickness;
		
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getId() {
		return id;
	}
}
