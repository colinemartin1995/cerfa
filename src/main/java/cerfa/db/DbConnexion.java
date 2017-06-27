package cerfa.db;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnexion {
	private String url;
	private String utilisateur;
	private String motdepasse;
	private String driver;
	private Connection connexion;

	
	public DbConnexion() throws DbException{
		Properties properties = new Properties();
		try(FileInputStream in = new FileInputStream("src/main/ressources/db.properties")){
			
			properties.load(in);
		}
		catch(IOException e ){
			
			throw new DbException ("Impossible de lire le fichier db.properties",e);
		}	 
		
		
		
		this.url = properties.getProperty("url");
		this.utilisateur = properties.getProperty("user");
		this.motdepasse = properties.getProperty("password");
		this.driver = properties.getProperty("driver");
		
	}

	public Connection ConnexionDataBase() throws ClassNotFoundException {
		try {
			Class.forName(this.driver);
		} catch (ClassNotFoundException  e) {
			System.out.println("Impossible de charger le driver");
			throw e;
		}
		try{
			this.connexion = DriverManager.getConnection(this.url,this.utilisateur,this.motdepasse);
			System.out.println("connexion ok");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return connexion;
	}
	
	
	
}
