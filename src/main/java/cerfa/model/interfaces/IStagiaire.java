package cerfa.model.interfaces;

public interface IStagiaire {

	long getIdPersonne();

	void setIdPersonne(long idPersonne);

	long getIdStagiaire();

	void setIdStagiaire(long idStagiaire);

	boolean isInterne();

	void setInterne(boolean interne);

	String getNom();

	void setNom(String nom);

	String getPrenom();

	void setPrenom(String prenom);

}