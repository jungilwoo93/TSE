package fr.uha.ensisa.projet.pan_chabalier.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class EditeurPanel extends JPanel{
	Graphics2D g2d=null;
	//String s = "coucou";
	List<EditeurLabel> listLabel;
	List<State> listState;
	List<Transition> listTransition;
	/*public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
		this.revalidate();
	}*/

	public EditeurPanel() {
		this.listLabel = new ArrayList<EditeurLabel>();
		this.listState = new ArrayList<State>();
		this.listTransition = new ArrayList<Transition>();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		this.g2d = (Graphics2D) g;
		super.paintComponent(this.g2d);
		/*System.out.println("Repaint called");
		if(s!="coucou") {
			this.g2d.drawString(s, 200, 200);
		}else {
			this.g2d.drawString(s, 10, 200);
		}*/
		if(listLabel.size()>0) {
			for(EditeurLabel label : listLabel)
				g2d.drawString(label.getText(), label.getX(), label.getY());
		}
		
		
	}
	
	public void addLabel(EditeurLabel label) {
		System.out.println("ajouter label");
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
	
	public void drawLabel(EditeurLabel label) {
		this.g2d.drawString(label.getText(), label.getX(),label.getY());
	}
}
