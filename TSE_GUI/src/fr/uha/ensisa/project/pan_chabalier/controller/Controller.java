package fr.uha.ensisa.project.pan_chabalier.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import fr.uha.ensisa.project.pan_chabalier.gui.EditeurPanel;


public class Controller implements MouseListener, MouseMotionListener, KeyListener {

	private Object model;
	private EditeurPanel view;

	public Controller(Object newModel) {
		model = newModel;
	}

	public void setView(EditeurPanel view) {
		this.view = view;
	}

	final public EditeurPanel getView() {
		return this.view;
	}

	public void setModel(Object model) {
		this.model = model;
	}

	public Object getModel() {
		return this.model;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
