package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Point;

public abstract class Element {

	/**
	 * Check if the point is in the element bound
	 * @param other the point to check
	 * @return true if the point is in bounds
	 */
	public abstract boolean isInBounds(Point other);

}
