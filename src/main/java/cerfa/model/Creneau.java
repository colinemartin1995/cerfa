package cerfa.model;

import java.time.LocalDate;

public class Creneau {

	private long idCreneau;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private boolean interne;
	private long fk_formation;
	

	public long getIdCreneau() {
		return idCreneau;
	}
	public void setIdCreneau(Long idCreneau){
		this.idCreneau = idCreneau;
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
	public boolean isInterne() {
		return interne;
	}
	public void setInterne(boolean interne) {
		this.interne = interne;
	}
	public long getFk_formation() {
		return fk_formation;
	}
	public void setFk_formation(long fk_formation) {
		this.fk_formation = fk_formation;
	}
	public Creneau(long idCreneau, LocalDate dateDebut, LocalDate dateFin, boolean interne, long fk_formation) {
		this.idCreneau = idCreneau;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.interne = interne;
		this.fk_formation = fk_formation;
	}

	
}
