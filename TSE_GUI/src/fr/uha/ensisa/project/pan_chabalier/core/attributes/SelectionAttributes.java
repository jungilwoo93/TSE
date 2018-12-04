package fr.uha.ensisa.project.pan_chabalier.core.attributes;

public class SelectionAttributes extends Attributes {
	private static final String ID = "select";
	private static final Boolean DEFAULT_ETAT = false;

	private Boolean selected;

	public SelectionAttributes() {
		this.selected = DEFAULT_ETAT;
	}

	public SelectionAttributes(Boolean etat) {
		this.selected = etat;
	}

	public String getId() {
		return ID;
	}

	public Boolean isSelected() {
		return selected;
	}

	public void selected() {
		this.selected = true;
	}

	public void unSelected() {
		this.selected = false;
	}

	public void toggleSelection() {
		this.selected = !this.selected;
	}
}
