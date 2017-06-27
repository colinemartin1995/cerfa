package cerfa.model;

public class Student {

	private Integer idStagiaire;
	private boolean interne;
	private Integer idPersonne;
	private String nom;
	private String prenom;
	

	public Integer getIdStagiaire() {
		return idStagiaire;
	}

	public void setIdStagiaire(Integer idStagiaire) {
		this.idStagiaire = idStagiaire;
	}

	public boolean isInterne() {
		return interne;
	}

	public void setInterne(boolean interne) {
		this.interne = interne;
	}
	
	public Integer getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(Integer idPersonne) {
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
	
	public Student(boolean interne, String nom, String prenom){
		this.interne = interne;
		this.nom = nom;
		this.prenom = prenom;
	}


	
}
