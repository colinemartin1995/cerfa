package cerfa.model.proxy;
import cerfa.model.impl.Financement;
import cerfa.model.interfaces.IFinancement;


public class ProxyFinancement implements IFinancement{
	
	private long idFinancement;
	private Financement instance = null;
	
	public ProxyFinancement(long idFinancement) {
		this.idFinancement = idFinancement;
	}

	@Override
	public long getIdFinancement() {
		if (instance == null) {
			//TODO DAO.factory 
		}
		return this.instance.getIdFinancement();
	}

	@Override
	public void setIdFinancement(long idFinancement) {
		if (instance == null) {
			//TODO DAO.factory 
		}else{
			this.instance.setIdFinancement(idFinancement);
		}
		
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

}
