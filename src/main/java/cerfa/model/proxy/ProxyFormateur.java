package cerfa.model.proxy;

import cerfa.model.impl.Formateur;
import cerfa.model.impl.Formation;
import cerfa.model.interfaces.IFormateur;

public class ProxyFormateur implements IFormateur {

	private long idFormateur;
	private Formateur instance = null;
	
	public ProxyFormateur(long idFormateur) {
		this.idFormateur = idFormateur;
	}
	@Override
	public long getIdFormateur() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdFormateur();
	}

	@Override
	public void setIdFormateur(long idFormateur) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdFormateur(idFormateur);
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
	public long getIdPersonne() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdPersonne();
	}

	@Override
	public void setIdPersonne(long idPersonne) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdPersonne(idPersonne);
		}
	}

	@Override
	public String getNom() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getNom();
	}

	@Override
	public void setNom(String nom) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setNom(nom);
		}
		
	}

	@Override
	public String getPrenom() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getPrenom();
	}

	@Override
	public void setPrenom(String prenom) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setPrenom(prenom);
		}
		
	}

}
