package cerfa.model.proxy;

import cerfa.model.impl.Specialite;
import cerfa.model.interfaces.ISpecialite;

public class ProxySpecialite implements ISpecialite{
	private long idSpecialite;
	private Specialite instance = null;
	
	public ProxySpecialite(long idSpecialite) {
		this.idSpecialite = idSpecialite;
	}

	@Override
	public Long getIdSpecialite() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdSpecialite();
	}


	@Override
	public void setIdSpecialite(Long idSpecialite) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdSpecialite(idSpecialite);
		}
		
	}

	@Override
	public String getNom() {
		if (instance == null) {
			// charger l'instance en utilisant la dao
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
	public String getCode() {
		if (instance == null) {
			// charger l'instance en utilisant la dao
		}
		return this.instance.getCode();
	}

	@Override
	public void setCode(String code) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setCode(code);	
		}
		
		
	}

}
