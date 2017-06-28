package cerfa.model.impl;

import cerfa.model.interfaces.IFinancement;

public class Financement implements IFinancement {
	
	private long idFinancement;
	private String libelle;
	
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancement#getIdFinancement()
	 */
	@Override
	public long getIdFinancement() {
		return idFinancement;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancement#setIdFinancement(long)
	 */
	@Override
	public void setIdFinancement(long idFinancement) {
		this.idFinancement = idFinancement;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancement#getLibelle()
	 */
	@Override
	public String getLibelle() {
		return libelle;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancement#setLibelle(java.lang.String)
	 */
	@Override
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Financement(long idFinancement, String libelle) {
		this.idFinancement = idFinancement;
		this.libelle = libelle;
	}
	public Financement( String libelle) {
		
		this.libelle = libelle;
	}
	
	
}
