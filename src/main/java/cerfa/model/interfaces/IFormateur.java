package cerfa.model.interfaces;

public interface IFormateur {

	long getIdFormateur();

	void setIdFormateur(long idFormateur);

	boolean isInterne();

	void setInterne(boolean interne);

	long getIdPersonne();

	void setIdPersonne(long idPersonne);

	String getNom();

	void setNom(String nom);

	String getPrenom();

	void setPrenom(String prenom);

}