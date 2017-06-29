package cerfa.dao.factory;

import cerfa.dao.impl.CreneauDAOImpl;
import cerfa.dao.impl.DAO;
import cerfa.dao.impl.FinancementDAOImpl;
import cerfa.dao.impl.FinancementStagiaireDAOImpl;
import cerfa.dao.impl.FormateurDAOImpl;
import cerfa.dao.impl.FormationDAOImpl;
import cerfa.dao.impl.ObjectifDAOImpl;
import cerfa.dao.impl.SpecialiteDAOImpl;
import cerfa.dao.impl.StagiaireDAOImpl;
import cerfa.db.DbException;

public class DAOFactory {

	/* constantes */
	public static final String FORMATEUR = "formateur";
	public static final String STAGIAIRE = "stagiaire";
	public static final String OBJECTIF = "objectif";
	public static final String SPECIALITE = "soecialite";
	public static final String FINANCEMENT = "financement";
	public static final String FINANCEMENT_STAGIAIRE = "financement_stagiaire";
	public static final String CRENEAU = "creneau";
	public static final String FORMATION = "formation";

	public static DAO getInstance(String type) throws DbException {
		switch (type) {
		case FORMATEUR:
			try {
				return new FormateurDAOImpl();
			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}

		case STAGIAIRE:
			try {
				return new StagiaireDAOImpl();
			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}

		case OBJECTIF:
			try {
				return new ObjectifDAOImpl();
			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}
			
		case SPECIALITE:
			try {
				return new SpecialiteDAOImpl();

			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}
		case FINANCEMENT:
			try {
				return new FinancementDAOImpl();

			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}
		case FINANCEMENT_STAGIAIRE:
			try {
				return new FinancementStagiaireDAOImpl();

			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}
		case CRENEAU:
			try {
				return new CreneauDAOImpl();

			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}
		case FORMATION:
			try {
				return new FormationDAOImpl();

			} catch (Exception e) {
				throw new DbException("classe DAO non connue");
			}

		default:
			throw new DbException("classe DAO non connue");

		}

	}

}
