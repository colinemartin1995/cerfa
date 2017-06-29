package cerfa.model.proxy;

import java.time.LocalDate;
import java.util.ArrayList;

import cerfa.dao.factory.DAOFactory;
import cerfa.dao.interfaces.ICreneauDAO;
import cerfa.db.DbException;
import cerfa.model.interfaces.ICreneau;
import cerfa.model.interfaces.IFormateur;
import cerfa.model.interfaces.IFormation;
import cerfa.model.interfaces.IStagiaire;

public class ProxyCreneau implements ICreneau {
	private ICreneau instance = null;
	private long idCreneau;
	private CreneauDAO CreneauDAO;


	public ProxyCreneau(long idCreneau) {
		this.idCreneau = idCreneau;
	}

	@Override
	public long getIdCreneau() {
		return this.idCreneau;
	}

	@Override
	public void setIdCreneau(long idCreneau) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdCreneau(idCreneau);
		}
		
	}

	@Override
	public LocalDate getDateDebut() {
		if (instance == null) {
			
			try {
				ICreneauDAO creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.find(this.idCreneau);
			} catch (DbException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			
			try {
				ICreneauDAO creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.find(this.idCreneau);
			} catch (DbException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return this.instance.getDateFin();
	}

	@Override
	public void setDateFin(LocalDate dateFin) {
		if (instance == null) {
			ICreneauDAO creneauDAO;
			try {
				creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.find(this.idCreneau);
			} catch (DbException e) {
				
				e.printStackTrace();
			}
			
			
		}else{
			
			this.instance.setDateFin(dateFin);
			try {
				ICreneauDAO creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.update(instance);
			} catch (DbException e) {
				// 
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public boolean isInterne() {
		if (instance == null) {
			
			try {
				ICreneauDAO creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.find(this.idCreneau);
			} catch (DbException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	public IFormation getFormation() {
		if (instance == null) {
			
			try {
				ICreneauDAO creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.find(this.idCreneau);
			} catch (DbException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return this.instance.getFormation();
	}

	@Override
	public void setFormation(IFormation formation) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setFormation(formation);
		}
		
	}

	@Override
	public ArrayList<IFormateur> getListeFormateurs() {
		if (instance == null) {
			
			try {
				ICreneauDAO creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.find(this.idCreneau);
			} catch (DbException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} return this.instance.getListeFormateurs();
	}

	@Override
	public void setListeFormateurs(ArrayList<IFormateur> lstFormateurs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<IStagiaire> getListeStagiaires() {
		if (instance == null) {
			
			try {
				ICreneauDAO creneauDAO = (ICreneauDAO)DAOFactory.getInstance(DAOFactory.CRENEAU);
				this.instance = creneauDAO.find(this.idCreneau);
			} catch (DbException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} return this.instance.getListeStagiaires();
	}

	@Override
	public void setListeStagiaires(ArrayList<IStagiaire> lstStagiaires) {
		// TODO Auto-generated method stub
		
	}
	



}
/*
 * @Override
	public long getFformation() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getFk_formation();
	}
	@Override
	public void setFormation(long fk_formation) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setFk_formation(fk_formation);
		}
		
	}
*/

