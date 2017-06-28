package cerfa.model.proxy;

import cerfa.model.impl.Objectif;
import cerfa.model.impl.Specialite;
import cerfa.model.interfaces.IObjectif;

public class ProxyObjectif implements IObjectif {
	
	private long idObjectif;
	private Objectif instance = null;
	
	public ProxyObjectif(long idObjectif) {
		this.idObjectif = idObjectif;
	}

	@Override
	public String getLibelle() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getLibelle();
	}
	@Override
	public void setLibelle(String libelle) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setLibelle(libelle);
		}
		
	}

	@Override
	public long getIdObjectif() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdObjectif();
	}

	@Override
	public void setIdObjectif(long idObjectif) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdObjectif(idObjectif);
		}
		
	}
	/*public Long getIdSpecialite() {
	if (instance == null) {
		//TODO DAO.factory 
	}
	return this.instance.getIdSpecialite();
}


@Override
public void setIdSpecialite(Long idSpecialite) {
	
	
*/

}
