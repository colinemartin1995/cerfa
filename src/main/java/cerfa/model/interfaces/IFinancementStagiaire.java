package cerfa.model.interfaces;

import java.time.LocalDate;

public interface IFinancementStagiaire {

	IStagiaire getStagiaire();
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancementStagiaire#setFk_stagiaire(long)
	 */

	void setStagiaire(IStagiaire stagaire);
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancementStagiaire#getFk_financement()
	 */

	IFinancement getFinancement();
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancementStagiaire#setFk_financement(long)
	 */

	void setFinancement(IFinancement financement);
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancementStagiaire#getDateDebut()
	 */

	LocalDate getDateDebut();
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancementStagiaire#setDateDebut(java.time.LocalDate)
	 */

	void setDateDebut(LocalDate dateDebut);
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancementStagiaire#getDateFin()
	 */

	LocalDate getDateFin();
	/* (non-Javadoc)
	 * @see cerfa.model.impl.IFinancementStagiaire#setDateFin(java.time.LocalDate)
	 */

	void setDateFin(LocalDate dateFin);

}