package cerfa.model.impl;

import cerfa.model.interfaces.IObjectif;
import cerfa.model.interfaces.ISpecialite;
import cerfa.model.interfaces.IFormation;

public class Formation implements IFormation{
	
	private long idFormation;
	private String nom;
	private ISpecialite specialite;
	private IObjectif objectif;

	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#getIdFormation()
	 */
	@Override
	public long getIdFormation() {
		return idFormation;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#setIdFormation(long)
	 */
	@Override
	public void setIdFormation(long idFormation) {
		this.idFormation = idFormation;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#getObjectif()
	 */
	@Override
	public IObjectif getObjectif() {
		return objectif;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#setObjectif(cerfa.model.interfaces.IObjectif)
	 */
	@Override
	public void setObjectif(IObjectif objectif) {
		this.objectif = objectif;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#getSpecialite()
	 */
	@Override
	public ISpecialite getSpecialite() {
		return specialite;
	}
	/* (non-Javadoc)
	 * @see cerfa.model.impl.Iformation#setSpecialite(cerfa.model.interfaces.ISpecialite)
	 */
	@Override
	public void setSpecialite(ISpecialite specialite) {
		this.specialite = specialite;
	}


	public Formation(long idFormation, String nom, ISpecialite specialite, IObjectif objectif) {
		this.idFormation = idFormation;
		this.nom = nom;
		this.specialite = specialite;
		this.objectif = objectif;
	}
	

	public Formation(String nom, ISpecialite specialite, IObjectif objectif) {
		this.nom = nom;
		this.specialite = specialite;
		this.objectif = objectif;
	}
	
}
