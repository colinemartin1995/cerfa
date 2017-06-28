package cerfa.model.impl;

import java.time.LocalDate;

public class FinancementStagiaire {
	
	private long fk_stagiaire;
	private long fk_financement;
	private LocalDate dateDebut;
	private LocalDate dateFin;

	public long getFk_stagiaire() {
		return fk_stagiaire;
	}
	public void setFk_stagiaire(long fk_stagaire) {
		this.fk_stagiaire = fk_stagaire;
	}
	public long getFk_financement() {
		return fk_financement;
	}
	public void setFk_financement(long fk_financement) {
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
	public FinancementStagiaire(long fk_stagiaire, long fk_financement, LocalDate dateDebut, LocalDate dateFin) {
		this.fk_stagiaire = fk_stagiaire;
		this.fk_financement = fk_financement;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
}
