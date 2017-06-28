package cerfa.model.interfaces;

public interface IFormation {

	long getIdFormation();

	void setIdFormation(long idFormation);

	String getNom();

	void setNom(String nom);

	IObjectif getObjectif();

	void setObjectif(IObjectif objectif);

	ISpecialite getSpecialite();

	void setSpecialite(ISpecialite specialite);

}