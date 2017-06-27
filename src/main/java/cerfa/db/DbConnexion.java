package cerfa.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnexion {
	private String url;
	private String utilisateur;
	private String motdepasse;
	private Connection connexion;
	
	public DbConnexion(){
		this.url = "jdbc:mysql://localhost:3306/projetjava";
		this.utilisateur = "root";
		this.motdepasse = "";
		
	}

	public Connection ConnexionDataBase() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
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
