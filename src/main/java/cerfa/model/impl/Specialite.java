package cerfa.model.impl;

import cerfa.model.interfaces.ISpecialite;

public class Specialite implements ISpecialite {
	private Long idSpecialite;
	private String nom;
	private String code;
	
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ISpecialite#getIdSpecialite()
	 */
	@Override
	public Long getIdSpecialite() {
		return idSpecialite;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ISpecialite#setIdSpecialite(java.lang.Long)
	 */
	@Override
	public void setIdSpecialite(Long idSpecialite) {
		this.idSpecialite = idSpecialite;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ISpecialite#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ISpecialite#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ISpecialite#getCode()
	 */
	@Override
	public String getCode() {
		return code;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.ISpecialite#setCode(java.lang.String)
	 */
	@Override
	public void setCode(String code) {
		this.code = code;
	}
	
	public Specialite(String nom, String code){
		this.nom = nom;
		this.code = code;
		
	}
	public Specialite(long id, String nom, String code){
		this.idSpecialite = id;
		this.nom = nom;
		this.code = code;
		
	}

}
