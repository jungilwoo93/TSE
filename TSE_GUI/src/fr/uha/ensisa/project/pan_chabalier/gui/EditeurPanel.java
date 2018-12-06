package fr.uha.ensisa.project.pan_chabalier.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;
import fr.uha.ensisa.project.pan_chabalier.controller.Controller;
import fr.uha.ensisa.project.pan_chabalier.controller.ElementController;
import fr.uha.ensisa.project.pan_chabalier.core.EditeurLabel;
import fr.uha.ensisa.project.pan_chabalier.core.State;
import fr.uha.ensisa.project.pan_chabalier.core.Systeme;
import fr.uha.ensisa.project.pan_chabalier.core.Transition;

public class EditeurPanel extends JPanel {
	private static final long serialVersionUID = 8977236653006925656L;
	private Systeme model;
	private Controller controller;
	private Graphics2D g2d = null;
	private List<EditeurLabel> listLabel;
	private List<State> listState;
	private List<Transition> listTransition;

	public EditeurPanel() {
		this.listLabel = new ArrayList<EditeurLabel>();
		this.listState = new ArrayList<State>();
		this.listTransition = new ArrayList<Transition>();
		
		this.model = new Systeme();
		this.controller = defaultController(model);
		this.controller.setView(this);
		this.addMouseListener(this.controller);
		this.addMouseMotionListener(this.controller);
		this.addKeyListener(this.controller);

		
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
		/*if(listLabel.size()>0) {
			for(EditeurLabel label : listLabel) {
				g2d.drawString(label.getText(), label.getX(), label.getY());
			}
		}*/
		if(listTransition.size()>0) {
			for(Transition t : listTransition) {
				g2d.setColor(t.getColor());
				g2d.setStroke(new BasicStroke(t.getThickness()));
				Point start = t.getStart().getP();
				Point end = t.getEnd().getP();
				double distance = start.distance(end);
				Point2D cp = new Point();
				//TODO corriger formule
				if(t.getCurvature()==0) {
					g2d.drawLine((int)start.getX()+Constants.DEFAULT_STATE_RADIUS/2, (int)start.getY()+Constants.DEFAULT_STATE_RADIUS/2, (int)end.getX()+Constants.DEFAULT_STATE_RADIUS/2, (int)end.getY()+Constants.DEFAULT_STATE_RADIUS/2);
					//this.add(t.getLabel().getLabel());
					//this.repaint();
					this.addLabel(t.getLabel());
					//g2d.drawString(t.getLabel().getText(),(int)(start.getX()+distance/2),(int)(start.getY()+distance/2)-50);
				}/*else if(t.getCurvature() == 90){
					cp.setLocation(start.getX()+Constants.STATE_RADIUS/2,start.getY()+Constants.STATE_RADIUS);
					QuadCurve2D curve = new QuadCurve2D.Double();
					curve.setCurve(start.getX()+Constants.STATE_RADIUS/2,start.getY(), cp.getX()+100,cp.getY()+100,  start.getX()+Constants.STATE_RADIUS/2,start.getY());
					g2d.draw(curve);
					System.out.println("90!!!");
				}*/else {
					if(Math.abs(start.getX()-end.getX())==0) {
						cp.setLocation(start.getX()+Math.sin(t.getCurvature())*distance/2+Constants.DEFAULT_STATE_RADIUS/2,start.getY()+distance/2+Constants.DEFAULT_STATE_RADIUS/2);
						
					}
					else if(Math.abs(start.getY()-end.getY())==0) {
						cp.setLocation(start.getX()+distance/2+Constants.DEFAULT_STATE_RADIUS/2, start.getY()+Math.sin(t.getCurvature())*distance/2+Constants.DEFAULT_STATE_RADIUS/2);
						
					}else {
						if(Math.abs(t.getCurvature())==45) {
							cp.setLocation(start.getX(),end.getY());
						}else {
							double disX = Math.abs(start.getX()-end.getX());
							double disY = Math.abs(start.getY()-end.getY());
							cp.setLocation(start.getX()+disX/2, end.getY()+disY/2);
						}
							
					}
					//Point2D cp = calculateControlPoint(start,end,(float)Math.PI/4);
					//P path = new Path2D.Double();
					//path.moveTo(start.getX()+Constants.STATE_RADIUS/2, start.getY()+Constants.STATE_RADIUS/2);
					//path.curveTo(start.getX(), start.getY(), cp.getX(), cp.getY(), end.getX(), end.getY());
					QuadCurve2D curve = new QuadCurve2D.Double();
					curve.setCurve(start.getX()+Constants.DEFAULT_STATE_RADIUS/2,start.getY()+Constants.DEFAULT_STATE_RADIUS/2, cp.getX(),cp.getY(),  end.getX()+Constants.DEFAULT_STATE_RADIUS/2, end.getY()+Constants.DEFAULT_STATE_RADIUS/2);
					g2d.draw(curve);
					if(t.getCurvature()>0) {
						this.addLabel(t.getLabel());
						//this.repaint();
						//g2d.drawString(t.getLabel().getText(),(int)cp.getX(),(int)cp.getY()+40);
					}else {
						this.addLabel(t.getLabel());
						//this.repaint();
						//g2d.drawString(t.getLabel().getText(),(int)cp.getX(),(int)cp.getY()-30);
					}
				}
				
				//g2d.drawLine(t.getStart().getX()+Constants.STATE_RADIUS/2, t.getStart().getY()+Constants.STATE_RADIUS/2, t.getEnd().getX()+Constants.STATE_RADIUS/2, t.getEnd().getY()+Constants.STATE_RADIUS/2);
			}
		}
		if(listState.size()>0) {
			for(State s : listState) {
				// System.out.println("draw");
				g2d.setColor(Color.WHITE);
				g2d.fillOval(s.getX(), s.getY(), Constants.DEFAULT_STATE_RADIUS, Constants.DEFAULT_STATE_RADIUS);
				g2d.setColor(s.getColor());
				g2d.setStroke(new BasicStroke(s.getThickness()));
				g2d.drawOval(s.getX(), s.getY(), Constants.DEFAULT_STATE_RADIUS, Constants.DEFAULT_STATE_RADIUS);
				this.addLabel(s.getLabel());
				// this.g2d.setStroke(new BasicStroke(s.getThickness()));
				/*JLabel label = new JLabel(s.getId());
				label.setLocation(s.getX() + Constants.STATE_RADIUS / 2, s.getY() + Constants.STATE_RADIUS / 2);
				label.setVisible(true);
				this.add(label);
				this.repaint();*/
				//g2d.drawString(s.getId(), s.getX() + Constants.STATE_RADIUS / 2, s.getY() + Constants.STATE_RADIUS / 2);
			}
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

	/**
	 * Method to get the control point of the "bezier" curve. 
	 * Math formula: 
	 * x_c = x_a(x_b-x_a)/(2cos(theta))*(cos(delta)-sin(delta)tan(theta))
	 * y_c = y_a(x_b-x_a)/(2cos(theta))*(sin(delta)+cos(delta)tan(theta))
	 * 
	 * with delta=arctan((y_b-y_a)/(x_b-x_a))
	 * 
	 * @param A First control Point (start)
	 * @param B Last control Point (end)
	 * @param theta Angle of the curve
	 * @return The new control point
	 */
	public Point2D.Double calculateControlPoint(Point A, Point B,Float theta) {
		Double delta = Math.atan((B.getY()-A.getY())/(B.getX()-A.getX()));
		Double com = (B.getX()-A.getX())/(2*Math.cos(theta));
		Double X_c = A.getX()*com*(Math.cos(delta)-Math.sin(delta)*Math.tan(theta));
		Double Y_c = A.getY()*com*(Math.sin(delta)+Math.cos(delta)*Math.tan(theta));
		return new Point2D.Double(X_c, Y_c);
	}
	
	public void addLabel(EditeurLabel label) {
		//listLabel.add(label);
		label.setBounds(label.getX(), label.getY(), (int)label.getBounds().getWidth(), (int)label.getBounds().getHeight());
		/*System.out.println("wd " + (int)label.getBounds().getWidth());
		System.out.println("wd " + (int)label.getBounds().getHeight());*/
		this.add(label);
		/*System.out.println("click");
		JTextField txt = new JTextField(label.getText());
		txt.setEditable(true);
		remove(label);//label.add(txt);
		add(txt);
		repaint();*/

		this.repaint();
	}

	public void removeLabel(EditeurLabel label) {
		listLabel.remove(label);
		this.repaint();
	}

	public void addState(State s) {
		listState.add(s);
		this.model.add(s);
		this.repaint();
	}

	public void addTransition(Transition t) {
		listTransition.add(t);
		this.model.add(t);
		this.repaint();
	}
	
	public void addStates(Collection<State> collection) {
		this.listState.addAll(collection);
		this.model.addAll(collection);
	}
	
	public void cleanStates() {
		this.listState.clear();
	}
	
	public void addTransitions(Collection<Transition> transitions) {
		this.listTransition.addAll(transitions);
		this.model.addAll(transitions);
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
	
	public void setModel(Object model) {
		this.model = (Systeme) model;
		this.controller.setModel(model);
	}

	public Object getModel() {
		return this.model;
	}

	public Controller defaultController(Object model) {
		return new ElementController(this.getModel());
	}

	final public Controller getController() {
		return this.controller;
	}
}
