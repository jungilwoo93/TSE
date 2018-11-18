package fr.uha.ensisa.project.pan_chabalier.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JPanel;

import fr.uha.ensisa.project.pan_chabalier.core.EditeurLabel;
import fr.uha.ensisa.project.pan_chabalier.core.State;
import fr.uha.ensisa.project.pan_chabalier.core.Transition;

public class EditeurPanel extends JPanel {
	private static final long serialVersionUID = 8977236653006925656L;
	private Graphics2D g2d = null;
	// String s = "coucou";
	private List<EditeurLabel> listLabel;
	private List<State> listState;
	private List<Transition> listTransition;
	private int sizeOval = 50;

	/*
	 * public String getS() { return s; }
	 * 
	 * public void setS(String s) { this.s = s; this.revalidate(); }
	 */

	public EditeurPanel() {
		this.listLabel = new ArrayList<EditeurLabel>();
		this.listState = new ArrayList<State>();
		this.listTransition = new ArrayList<Transition>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		this.g2d = (Graphics2D) g;
		//super.repaint();
		super.paintComponent(g2d);
		/*
		 * System.out.println("Repaint called"); if(s!="coucou") {
		 * this.g2d.drawString(s, 200, 200); }else { this.g2d.drawString(s, 10, 200); }
		 */
		if(listLabel.size()>0) {
			for(EditeurLabel label : listLabel) {
				g2d.drawString(label.getText(), label.getX(), label.getY());
			}
		}
		if(listTransition.size()>0) {
			for(Transition t : listTransition) {
				g2d.setColor(t.getColor());
				g2d.setStroke(new BasicStroke(t.getThickness()));
				g2d.drawLine(t.getStart().getX(), t.getStart().getY(), t.getEnd().getX(), t.getEnd().getY());
			}
		}
		if(listState.size()>0)
			for(State s : listState) {
				// System.out.println("draw");
				g2d.setColor(Color.WHITE);
				g2d.fillOval(s.getX(), s.getY(), sizeOval, sizeOval);
				g2d.setColor(s.getColor());
				g2d.setStroke(new BasicStroke(s.getThickness()));
				g2d.drawOval(s.getX(), s.getY(), sizeOval, sizeOval);
				// this.g2d.setStroke(new BasicStroke(s.getThickness()));
				g2d.drawString(s.getId(), s.getX() + sizeOval / 2, s.getY() + sizeOval / 2);
			}
		
		
//		if(listTransition.size()>0) {
//			for(Transition t :listTransition) {
//				System.out.println("draw");
//				this.g2d.setColor(t.getColor());
//				this.g2d.setStroke(new BasicStroke(t.getThickness()));
//				//this.g2d.drawArc(10, 50, 100, 200, 0, 60);
//				/*System.out.println(t.getStart().getX());
//				System.out.println(t.getStart().getY());
//				System.out.println(t.getEnd().getX()-t.getStart().getX());
//				System.out.println(t.getEnd().getY()-t.getStart().getY());
//				System.out.println((int)t.getCurvature());*/
//				//this.g2d.drawArc(t.getStart().getX(),t.getStart().getY(),t.getEnd().getX()-t.getStart().getX(),t.getEnd().getY()-t.getStart().getY(),0,(int)t.getCurvature());
//				this.g2d.setFont(new Font("Arial", Font.PLAIN,20));
//				this.g2d.drawString(t.getLabel().getText(), t.getLabel().getX(), t.getLabel().getY());
//			}
//		}
	}

	public void addLabel(EditeurLabel label) {
		//System.out.println("ajouter label");
		listLabel.add(label);
		this.repaint();
	}

	public void removeLabel(EditeurLabel label) {

	}

	public void addState(State s) {
		System.out.println("ajouter state");
		listState.add(s);
		this.repaint();
	}

	public void addTransition(Transition t) {
		System.out.println("ajouter transition");
		listTransition.add(t);
		this.repaint();
	}
	
	public void addStates(Collection<State> collection) {
		this.listState.addAll(collection);
	}
	
	public void cleanStates() {
		this.listState.clear();
	}
	
	public void addTransitions(List<Transition> transitions) {
		this.listTransition.addAll(transitions);
	}
	
	public void cleanTransitions() {
		this.listTransition.clear();
	}
	
	public void addLabels(List<Transition> transitions) {
		for(Transition t : transitions) {
			this.listLabel.add(t.getLabel());
		}
	}
	
	public void cleanLabels() {
		this.listLabel.clear();
	}

	public void cleanLists() {
		cleanLabels();
		cleanTransitions();
		cleanStates();
	}
	
	
//	public void drawLabel(EditeurLabel label) {
//		g2d.drawString(label.getText(), label.getX(), label.getY());
//	}
//
//	public void drawState(State s) {
//		g2d.drawOval(s.getX(), s.getY(), 5, 5);
//	}
}
