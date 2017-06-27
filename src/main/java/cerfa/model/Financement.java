package cerfa.model;

public class Financement {
	
	private Integer idFinancement;
	private String libelle;
	
	public Integer getIdFinancement() {
		return idFinancement;
	}
	public void setIdFinancement(Integer idFinancement) {
		this.idFinancement = idFinancement;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Financement(Integer idFinancement, String libelle) {
		this.idFinancement = idFinancement;
		this.libelle = libelle;
	}
	
	
}
