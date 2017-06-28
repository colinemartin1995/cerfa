package cerfa.model.impl;

public class Stagiaire {

	private long idStagiaire;
	private boolean interne;
	private long idPersonne;
	private String nom;
	private String prenom;
	

	public long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}
	
	public long getIdStagiaire() {
		return idStagiaire;
	}

	public void setIdStagiaire(long idStagiaire) {
		this.idStagiaire = idStagiaire;
	}

	public boolean isInterne() {
		return interne;
	}

	public void setInterne(boolean interne) {
		this.interne = interne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

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
