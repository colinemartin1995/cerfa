package cerfa.model;

public class Formateur {
	private long idFormateur;
	private boolean interne;
	private long idPersonne;
	private String nom;
	private String prenom;
	
	

	public long getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(long idFormateur) {
		this.idFormateur = idFormateur;
	}

	public boolean isInterne() {
		return interne;
	}

	public void setInterne(boolean interne) {
		this.interne = interne;
	}

	public long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
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
