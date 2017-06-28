package cerfa.model.proxy;


import cerfa.model.impl.Stagiaire;
import cerfa.model.interfaces.IStagiaire;

public class ProxyStagiaire implements IStagiaire{
	private long idStagiaire;
	private Stagiaire instance = null;
	
	public ProxyStagiaire(long idStagiaire) {
		this.idStagiaire = idStagiaire;
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
	public long getIdStagiaire() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdStagiaire();
	}

	@Override
	public void setIdStagiaire(long idStagiaire) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdStagiaire(idStagiaire);
		}
		
	}

	@Override
	public boolean isInterne() {
		// TODO Auto-generated method stub
		return false;
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
