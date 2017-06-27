package cerfa.model;

public class Objectif {
	private Integer idObjectif;
	private String libelle;
	

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Integer getIdObjectif() {
		return idObjectif;
	}
	public void setIdObjectif(Integer idObjectif) {
		this.idObjectif = idObjectif;
	}
	
	public Objectif(Integer idObjectif, String libelle) {
		this.idObjectif = idObjectif;
		this.libelle = libelle;
	}
	
}
