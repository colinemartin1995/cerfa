package cerfa.model.impl;

import cerfa.model.interfaces.IStagiaire;

public class Stagiaire implements IStagiaire {

	private long idStagiaire;
	private boolean interne;
	private long idPersonne;
	private String nom;
	private String prenom;
	

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#getIdPersonne()
	 */
	@Override
	public long getIdPersonne() {
		return idPersonne;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#setIdPersonne(long)
	 */
	@Override
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}
	
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#getIdStagiaire()
	 */
	@Override
	public long getIdStagiaire() {
		return idStagiaire;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#setIdStagiaire(long)
	 */
	@Override
	public void setIdStagiaire(long idStagiaire) {
		this.idStagiaire = idStagiaire;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#isInterne()
	 */
	@Override
	public boolean isInterne() {
		return interne;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#setInterne(boolean)
	 */
	@Override
	public void setInterne(boolean interne) {
		this.interne = interne;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#getPrenom()
	 */
	@Override
	public String getPrenom() {
		return prenom;
	}

	/* (non-Javadoc)
	 * @see cerfa.model.impl.IStagiaire#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Stagiaire( long idPersonne, boolean interne, String nom, String prenom){
		this.idPersonne = idPersonne;
		this.interne = interne;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Stagiaire(boolean interne, String nom, String prenom){
		this.interne = interne;
		this.nom = nom;
		this.prenom = prenom;
	}


	
}
