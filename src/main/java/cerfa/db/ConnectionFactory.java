package cerfa.db;

import java.sql.Connection;

public class ConnectionFactory {

	public static final String REPERTOIRE = "database";
	
	public static Connection getConnection(String type) throws ClassNotFoundException, DbException{
		if(type == REPERTOIRE){
			
			DbConnexion connexionDB = new DbConnexion();
			Connection connexion = connexionDB.ConnexionDataBase();
			return connexion;
			
		}
		else{
			throw new DbException("Erreur pas de connexion");
		}

		
	}
}
