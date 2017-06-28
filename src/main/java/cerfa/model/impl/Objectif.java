package cerfa.model.impl;

import cerfa.model.interfaces.IObjectif;

public class Objectif implements IObjectif {
	private long idObjectif;
	private String libelle;
	

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public long getIdObjectif() {
		return idObjectif;
	}
	public void setIdObjectif(long idObjectif) {
		this.idObjectif = idObjectif;
	}
	
	public Objectif(long idObjectif, String libelle) {
		this.idObjectif = idObjectif;
		this.libelle = libelle;
	}
	
}
