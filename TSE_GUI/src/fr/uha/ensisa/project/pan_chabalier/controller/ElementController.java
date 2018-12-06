package fr.uha.ensisa.project.pan_chabalier.controller;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import fr.uha.ensisa.project.pan_chabalier.core.EditeurLabel;
import fr.uha.ensisa.project.pan_chabalier.core.Element;
import fr.uha.ensisa.project.pan_chabalier.core.State;
import fr.uha.ensisa.project.pan_chabalier.core.Systeme;
import fr.uha.ensisa.project.pan_chabalier.core.attributes.SelectionAttributes;

public class ElementController extends Controller {

	private Point posMouse;
	private boolean isShiftPressed;
	private Systeme collect;

	public ElementController(Object newModel) {
		super(newModel);
	}

	public Element selectElement() {
		Systeme model = (Systeme) getModel();
		Iterator<Element> iter = model.iterator(); // we try to find which element is under the mouse
		while (iter.hasNext()) {
			Element iElement = iter.next();
			if (iElement.getBounds().contains(this.posMouse)) { // if the location of mouse is on the Element's
																// boundedRectagle
				return iElement;
			}

		}
		return null; // if no element under mouse
	}

	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		int buttonDown = e.getButton();
		this.posMouse = e.getPoint();
		Element element = selectElement();
		if (buttonDown == MouseEvent.BUTTON1) {
	           // Bouton GAUCHE enfoncé
			
			if (!isShiftPressed) {
				for (Iterator<Element> iter = ((Systeme) this.getModel()).iterator(); iter.hasNext();) {
					Element iElement = iter.next();
					SelectionAttributes attrs = (SelectionAttributes) iElement.getSelectionAttributes();
					if (attrs != null) {
						attrs.unSelected();
					}
				}
			} else {
				this.collect.remove(element);
			}
			if (element != null) {
				SelectionAttributes attrSelect = (SelectionAttributes) element.getSelectionAttributes();
				if (attrSelect != null) {
					attrSelect.toggleSelection();
				}
				if (!isShiftPressed) {
					this.collect.add(element);
				}
			}
			getView().repaint();
	    } else if(buttonDown == MouseEvent.BUTTON2) {
	           // Bouton du MILIEU enfoncé
	    	
	    	
	    } else if(buttonDown == MouseEvent.BUTTON3) {
	           // Bouton DROIT enfoncé
	    	//getView().remove();
	    	//getView().add(element.labelToJtext());
	    	getView().toChange(true);
	    	//getView().removeLabel(element.getLabel());
	    	//getView().repaint();
	    }
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		Element element = selectElement();
		if (element != null) {
			SelectionAttributes attrSelect = (SelectionAttributes) element.getSelectionAttributes();
			attrSelect.toggleSelection();

		}
		getView().repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		this.posMouse = e.getPoint();
		Element element = selectElement();
		if (!isShiftPressed) {
			for (Iterator<Element> iter = ((Systeme) this.getModel()).iterator(); iter.hasNext();) {
				Element iElement = iter.next();
				SelectionAttributes attrs = (SelectionAttributes) iElement.getSelectionAttributes();
				if (attrs != null) {
					attrs.unSelected();
				}
			}
		}

		if (element != null) {
			SelectionAttributes attrSelect = (SelectionAttributes) element.getSelectionAttributes();
			if (attrSelect != null) {
				attrSelect.toggleSelection();
			}
		}
		getView().repaint();

	}

	@Override
	public void mouseDragged(MouseEvent evt) {
		for (Iterator<Element> iter = ((Systeme) this.getModel()).iterator(); iter.hasNext();) {
			Element element = iter.next();
			if (element instanceof State) {
				if (((SelectionAttributes) element.getSelectionAttributes()).isSelected()) {
					State s = (State) element;
					int dx = evt.getPoint().x - s.getX();
					int dy = evt.getPoint().y - s.getY();
					s.getP().translate(dx, dy);
					System.out.println("deplacement");
				}
			}
		}
		getView().repaint();
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		super.keyPressed(evt);
		if (evt.isShiftDown()) {
			this.isShiftPressed = true;
		}
	}

	@Override
	public void keyTyped(KeyEvent evt) {
		super.keyPressed(evt);
		if (evt.isShiftDown()) {
			this.isShiftPressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent evt) {
		super.keyReleased(evt);
		if (!evt.isShiftDown()) {
			this.isShiftPressed = false;
		}
	}
}
