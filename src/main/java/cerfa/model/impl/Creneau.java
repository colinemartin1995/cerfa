package cerfa.model.impl;

import java.time.LocalDate;
import java.util.ArrayList;

import cerfa.model.interfaces.ICreneau;
import cerfa.model.interfaces.IFormateur;
import cerfa.model.interfaces.IFormation;
import cerfa.model.interfaces.IStagiaire;

public class Creneau implements ICreneau  {

	private long idCreneau;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private boolean interne;
	private IFormation formation;
	private ArrayList<Formateur> formateur;
	
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#getIdCreneau()
	 */
	@Override
	public long getIdCreneau() {
		return idCreneau;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#setIdCreneau(long)
	 */
	@Override
	public void setIdCreneau(long idCreneau) {
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
	 * @see cerfa.model.impl.ICreneau#getFormation()
	 */
	@Override
	public IFormation getFormation() {
		return formation;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ICreneau#setFormation(cerfa.model.interfaces.IFormation)
	 */
	@Override
	public void setFormation(IFormation formation) {
		this.formation = formation;
	}
	
	@Override
	public ArrayList<IFormateur> getListeFormateurs() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setListeFormateurs(ArrayList<IFormateur> lstFormateurs) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<IStagiaire> getListeStagiaires() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setListeStagiaires(ArrayList<IStagiaire> lstStagiaires) {
		// TODO Auto-generated method stub
		
	}
	public Creneau(long idCreneau, LocalDate dateDebut, LocalDate dateFin, boolean interne, IFormation formation) {
		this.idCreneau = idCreneau;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.interne = interne;
		this.formation = formation;
	}
	public Creneau(LocalDate dateDebut, LocalDate dateFin, boolean interne, IFormation formation) {
		
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.interne = interne;
		this.formation = formation;
	}
	
	

	
	
	

	
}
