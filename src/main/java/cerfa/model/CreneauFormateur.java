package cerfa.model;

public class CreneauFormateur {

	private Integer fk_formateur;
	private Integer fk_creneau;
	
	public Integer getFk_formateur() {
		return fk_formateur;
	}
	public void setFk_formateur(Integer fk_formateur) {
		this.fk_formateur = fk_formateur;
	}
	public Integer getFk_creneau() {
		return fk_creneau;
	}
	public void setFk_creneau(Integer fk_creneau) {
		this.fk_creneau = fk_creneau;
	}
	
	public CreneauFormateur(Integer fk_formateur, Integer fk_creneau) {
		this.fk_formateur = fk_formateur;
		this.fk_creneau = fk_creneau;
	}
}
