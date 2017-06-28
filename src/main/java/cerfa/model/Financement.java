package cerfa.model;

public class Financement {
	
	private long idFinancement;
	private String libelle;
	
	public long getIdFinancement() {
		return idFinancement;
	}
	public void setIdFinancement(long idFinancement) {
		this.idFinancement = idFinancement;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Financement(long idFinancement, String libelle) {
		this.idFinancement = idFinancement;
		this.libelle = libelle;
	}
	public Financement( String libelle) {
		
		this.libelle = libelle;
	}
	
	
}
