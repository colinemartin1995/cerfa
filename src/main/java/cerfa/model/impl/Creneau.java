package cerfa.model.impl;

import java.time.LocalDate;

import cerfa.model.interfaces.ICreneau;

public class Creneau implements ICreneau {

	private long idCreneau;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private boolean interne;
	private long fk_formation;
	

	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#getIdCreneau()
	 */
	@Override
	public long getIdCreneau() {
		return idCreneau;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#setIdCreneau(java.lang.Long)
	 */
	@Override
	public void setIdCreneau(Long idCreneau){
		this.idCreneau = idCreneau;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#getDateDebut()
	 */
	@Override
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#setDateDebut(java.time.LocalDate)
	 */
	@Override
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#getDateFin()
	 */
	@Override
	public LocalDate getDateFin() {
		return dateFin;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#setDateFin(java.time.LocalDate)
	 */
	@Override
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#isInterne()
	 */
	@Override
	public boolean isInterne() {
		return interne;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#setInterne(boolean)
	 */
	@Override
	public void setInterne(boolean interne) {
		this.interne = interne;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#getFk_formation()
	 */
	@Override
	public long getFk_formation() {
		return fk_formation;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#setFk_formation(long)
	 */
	@Override
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
	public Creneau( LocalDate dateDebut, LocalDate dateFin, boolean interne, long fk_formation) {
		
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.interne = interne;
		this.fk_formation = fk_formation;
	}

	
}
