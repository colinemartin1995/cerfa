package cerfa.model.interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ICreneau {

	long getIdCreneau();

	void setIdCreneau(long idCreneau);

	LocalDate getDateDebut();

	void setDateDebut(LocalDate dateDebut);

	LocalDate getDateFin();

	void setDateFin(LocalDate dateFin);

	boolean isInterne();

	void setInterne(boolean interne);

	IFormation getFormation();

	void setFormation(IFormation formation);
	
	ArrayList<IFormateur> getListeFormateurs();
	
	void setListeFormateurs(ArrayList<IFormateur> lstFormateurs);
	
    ArrayList<IStagiaire> getListeStagiaires();
	
	void setListeStagiaires(ArrayList<IStagiaire> lstStagiaires);


}