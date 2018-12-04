package fr.uha.ensisa.project.pan_chabalier.core;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Systeme extends Element{
	protected List<Element> list;

	public Systeme() {
		this.list = new ArrayList<Element>();
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

	public void remove(Element e) {
		this.remove(e);
	}

	@Override
	public boolean isInBounds(Point other) {
		for(Element e : this.list) {
			if(e.isInBounds(other)) {
				return true;
			}
		}
		return false;
	}

}
