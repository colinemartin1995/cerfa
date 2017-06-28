package cerfa.model.impl;

import java.time.LocalDate;

import cerfa.model.interfaces.IFinancement;
import cerfa.model.interfaces.IFinancementStagiaire;
import cerfa.model.interfaces.IStagiaire;

public class FinancementStagiaire implements IFinancementStagiaire {
	
	private IStagiaire stagiaire;
	private IFinancement financement;
	private LocalDate dateDebut;
	private LocalDate dateFin;

	
	@Override
	public IStagiaire getStagiaire() {
		return stagiaire;
	}
	
	@Override
	public void setStagiaire(IStagiaire stagaire) {
		this.stagiaire = stagaire;
	}
	
	@Override
	public IFinancement getFinancement() {
		return financement;
	}
	
	@Override
	public void setFinancement(IFinancement financement) {
		this.financement = financement;
	}
	
	@Override
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	
	@Override
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	@Override
	public LocalDate getDateFin() {
		return dateFin;
	}
	
	@Override
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public FinancementStagiaire(IStagiaire stagiaire, IFinancement financement, LocalDate dateDebut, LocalDate dateFin) {
		this.stagiaire = stagiaire;
		this.financement = financement;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
}
