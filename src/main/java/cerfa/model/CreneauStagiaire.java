package cerfa.model;

public class CreneauStagiaire {

	private Integer fk_stagiaire;
	private Integer fk_creneau;
	
	public Integer getFk_stagiaire() {
		return fk_stagiaire;
	}
	public void setFk_stagiaire(Integer fk_formateur) {
		this.fk_stagiaire = fk_formateur;
	}
	public Integer getFk_creneau() {
		return fk_creneau;
	}
	public void setFk_creneau(Integer fk_creneau) {
		this.fk_creneau = fk_creneau;
	}
	
	public CreneauStagiaire(Integer fk_stagiaire, Integer fk_creneau) {
		this.fk_stagiaire = fk_stagiaire;
		this.fk_creneau = fk_creneau;
	}
}
