package cerfa.model.proxy;

import cerfa.model.impl.Formation;

import cerfa.model.interfaces.IFormation;
import cerfa.model.interfaces.IObjectif;
import cerfa.model.interfaces.ISpecialite;

public class ProxyFormation implements IFormation{
	
	private long idFormation;
	private Formation instance = null;
	
	public ProxyFormation(long idFormation) {
		this.idFormation = idFormation;
	}
	
	@Override
	public long getIdFormation() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdFormation();
	}

	@Override
	public void setIdFormation(long idFormation) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdFormation(idFormation);
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
	public IObjectif getObjectif() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getObjectif();
	}

	@Override
	public void setObjectif(IObjectif objectif) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setObjectif(objectif);
		}
		
	}

	@Override
	public ISpecialite getSpecialite() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getSpecialite();
	}

	@Override
	public void setSpecialite(ISpecialite specialite) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setSpecialite(specialite);
		}
		
	}

}
