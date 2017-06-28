package cerfa.model.interfaces;

import java.time.LocalDate;

public interface ICreneau {

	long getIdCreneau();

	void setIdCreneau(Long idCreneau);

	LocalDate getDateDebut();

	void setDateDebut(LocalDate dateDebut);

	LocalDate getDateFin();

	void setDateFin(LocalDate dateFin);

	boolean isInterne();

	void setInterne(boolean interne);

	long getFk_formation();

	void setFk_formation(long fk_formation);

}