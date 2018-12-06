package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTextField;

public class Systeme extends Element{
	protected List<Element> list = new ArrayList<Element>();

	public Systeme() {
		
	}

	public List<Element> getList() {
		return this.list;
	}

	public Iterator<Element> iterator() {
		return this.list.iterator();
	}

	public void add(Element e) {
		this.list.add(e);

	}
	
	public void addAll(Collection<? extends Element> collection) {
		this.list.addAll(collection);
	}
	
	public void setList(List<Element> list) {
		this.list = list;
	}

	public void remove(Element e) {
		this.remove(e);
	}

	@Deprecated
	@Override
	public boolean isInBounds(Point other) {
		for(Element e : this.list) {
			if(e.isInBounds(other)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Rectangle getBounds() {
		Rectangle rect = list.get(0).getBounds();// for an initial bounds of the first item in the list
		for (Element e : list)
			rect = rect.union(e.getBounds());// compute union of rectangle and return a new rectangle
		return rect;
	}
	
	@Override
	public JTextField labelToJtext() {
		return null;
	}

	@Override
	public EditeurLabel getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

}
