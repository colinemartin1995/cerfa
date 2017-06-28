package cerfa.model.impl;

import cerfa.model.interfaces.IObjectif;

public class Objectif implements IObjectif {
	private long idObjectif;
	private String libelle;
	

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IObjectif#getLibelle()
	 */
	@Override
	public String getLibelle() {
		return libelle;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IObjectif#setLibelle(java.lang.String)
	 */
	@Override
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IObjectif#getIdObjectif()
	 */
	@Override
	public long getIdObjectif() {
		return idObjectif;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IObjectif#setIdObjectif(long)
	 */
	@Override
	public void setIdObjectif(long idObjectif) {
		this.idObjectif = idObjectif;
	}
	
	public Objectif(long idObjectif, String libelle) {
		this.idObjectif = idObjectif;
		this.libelle = libelle;
	}
	
}
