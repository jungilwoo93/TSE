package fr.uha.ensisa.project.pan_chabalier.controller;

import java.awt.Point;
import java.util.Iterator;

import fr.uha.ensisa.project.pan_chabalier.core.Element;
import fr.uha.ensisa.project.pan_chabalier.core.Systeme;

public class ElementController extends Controller {

	private Point posMouse;
	
	public ElementController(Object newModel) {
		super(newModel);
	}

	public Element selectShape() {
		Systeme model = (Systeme) getModel();
		Iterator<Element> iter = model.iterator(); // we try to find which element is under the mouse
		while (iter.hasNext()) {
			Element element = iter.next();
			if (element.isInBounds((this.posMouse))) { // if the location of mouse is on the element
				return element;
			}

		}
		return null; // if no element under mouse
	}
}
