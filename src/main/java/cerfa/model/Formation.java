package cerfa.model;

public class Formation {
	
	private long idFormation;
	private String nom;
	private long fk_specialite;
	private long fk_objectif;

	public long getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(long idFormation) {
		this.idFormation = idFormation;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getFk_specialite() {
		return fk_specialite;
	}
	public void setFk_specialite(long fk_specialite) {
		this.fk_specialite = fk_specialite;
	}
	public long getFk_objectif() {
		return fk_objectif;
	}
	public void setFk_objectif(Integer fk_objectif) {
		this.fk_objectif = fk_objectif;
	}
	
	
	public Formation(long idFormation, String nom, long fk_specialite, long fk_objectif) {
		this.idFormation = idFormation;
		this.nom = nom;
		this.fk_specialite = fk_specialite;
		this.fk_objectif = fk_objectif;
	}
	public Formation(String nom, long fk_specialite, long fk_objectif) {
		
		this.nom = nom;
		this.fk_specialite = fk_specialite;
		this.fk_objectif = fk_objectif;
	}

}
