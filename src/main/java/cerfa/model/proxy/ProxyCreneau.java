package cerfa.model.proxy;

import java.time.LocalDate;

import cerfa.model.impl.Creneau;
import cerfa.model.interfaces.ICreneau;

public class ProxyCreneau implements ICreneau {
	private Creneau instance = null;
	private long idCreneau;

	public ProxyCreneau(long idCreneau) {
		this.idCreneau = idCreneau;
	}
	@Override
	public long getIdCreneau() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdCreneau();
	}

	@Override
	public void setIdCreneau(Long idCreneau) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdCreneau(idCreneau);
		}
		
	}

	@Override
	public LocalDate getDateDebut() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getDateDebut();
	}

	@Override
	public void setDateDebut(LocalDate dateDebut) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setDateDebut(dateDebut);
		}
		
	}

	@Override
	public LocalDate getDateFin() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getDateFin();
	}

	@Override
	public void setDateFin(LocalDate dateFin) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setDateFin(dateFin);
		}
		
	}

	@Override
	public boolean isInterne() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.isInterne();
	}

	@Override
	public void setInterne(boolean interne) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setInterne(interne);
		}
		
	}

	@Override
	public long getFk_formation() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getFk_formation();
	}
	@Override
	public void setFk_formation(long fk_formation) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setFk_formation(fk_formation);
		}
		
	}



}


