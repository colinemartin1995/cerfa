package cerfa.db;

import java.sql.Connection;

public class ConnectionFactory {

	public static final String PROJETJAVA = "database";
	
	public static Connection getConnection(String type) throws DbException{
		if(type == PROJETJAVA){
			
			DbConnexion connexionDB = new DbConnexion();
			Connection connexion = connexionDB.ConnexionDataBase();
			return connexion;
			
		}
		else{
			throw new DbException("Erreur pas de connexion");
		}

		
	}
}
