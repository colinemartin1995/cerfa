package cerfa.model;

public class Formation {
	
	private Integer idFormation;
	private String nom;
	private Integer fk_specialite;
	private Integer fk_objectif;

	public Integer getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(Integer idFormation) {
		this.idFormation = idFormation;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getFk_specialite() {
		return fk_specialite;
	}
	public void setFk_specialite(Integer fk_specialite) {
		this.fk_specialite = fk_specialite;
	}
	public Integer getFk_objectif() {
		return fk_objectif;
	}
	public void setFk_objectif(Integer fk_objectif) {
		this.fk_objectif = fk_objectif;
	}
	
	
	public Formation(Integer idFormation, String nom, Integer fk_specialite, Integer fk_objectif) {
		this.idFormation = idFormation;
		this.nom = nom;
		this.fk_specialite = fk_specialite;
		this.fk_objectif = fk_objectif;
	}

}
