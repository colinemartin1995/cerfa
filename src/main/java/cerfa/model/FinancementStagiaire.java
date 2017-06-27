package cerfa.model;

import java.time.LocalDate;

public class FinancementStagiaire {
	
	private Integer fk_stagaire;
	private Integer fk_financement;
	private LocalDate dateDebut;
	private LocalDate dateFin;

	public Integer getFk_stagaire() {
		return fk_stagaire;
	}
	public void setFk_stagaire(Integer fk_stagaire) {
		this.fk_stagaire = fk_stagaire;
	}
	public Integer getFk_financement() {
		return fk_financement;
	}
	public void setFk_financement(Integer fk_financement) {
		this.fk_financement = fk_financement;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public FinancementStagiaire(Integer fk_stagaire, Integer fk_financement, LocalDate dateDebut, LocalDate dateFin) {
		this.fk_stagaire = fk_stagaire;
		this.fk_financement = fk_financement;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
}
