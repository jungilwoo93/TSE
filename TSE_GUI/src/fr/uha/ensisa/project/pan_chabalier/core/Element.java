package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Point;

import fr.uha.ensisa.project.pan_chabalier.core.attributes.Attributes;
import fr.uha.ensisa.project.pan_chabalier.core.attributes.SelectionAttributes;

public abstract class Element {

	SelectionAttributes sAttr;
	
	public Element() {
		this.sAttr = new SelectionAttributes();
	}
	
	public Attributes getSelectionAttributes() {
		return sAttr;
	}
	
	/**
	 * Check if the point is in the element bound
	 * @param other the point to check
	 * @return true if the point is in bounds
	 */
	public abstract boolean isInBounds(Point other);

}
