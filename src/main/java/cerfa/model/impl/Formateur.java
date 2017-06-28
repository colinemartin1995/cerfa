package cerfa.model.impl;

import cerfa.model.interfaces.IFormateur;

public class Formateur implements IFormateur {
	private long idFormateur;
	private boolean interne;
	private long idPersonne;
	private String nom;
	private String prenom;
	
	

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#getIdFormateur()
	 */
	@Override
	public long getIdFormateur() {
		return idFormateur;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#setIdFormateur(long)
	 */
	@Override
	public void setIdFormateur(long idFormateur) {
		this.idFormateur = idFormateur;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#isInterne()
	 */
	@Override
	public boolean isInterne() {
		return interne;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#setInterne(boolean)
	 */
	@Override
	public void setInterne(boolean interne) {
		this.interne = interne;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#getIdPersonne()
	 */
	@Override
	public long getIdPersonne() {
		return idPersonne;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#setIdPersonne(long)
	 */
	@Override
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#getPrenom()
	 */
	@Override
	public String getPrenom() {
		return prenom;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFormateur#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Formateur(boolean interne, String nom, String prenom){
		this.interne = interne;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Formateur(long idFormateur, boolean interne, String nom, String prenom){
		this.idFormateur = idFormateur;
		this.interne = interne;
		this.nom = nom;
		this.prenom = prenom;
	}
	
}
