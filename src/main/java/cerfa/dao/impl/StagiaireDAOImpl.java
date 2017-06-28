package cerfa.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cerfa.dao.interfaces.IEtudiantDAO;
import cerfa.db.DbException;
import cerfa.model.Stagiaire;

public class StagiaireDAOImpl extends DAO<Stagiaire> implements IEtudiantDAO {

	public StagiaireDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stagiaire create(Stagiaire obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO stagiaire (idStagiaire, nom, prenom, interne) VALUES(?,?,?,?)"
				+ "INNER JOIN personne ON idStagiaire = personne.idPersonne ")){
			preparedStatement.setLong(1,obj.getIdPersonne());
			preparedStatement.setString(2,obj.getNom());
			preparedStatement.setString(3,obj.getPrenom());
			preparedStatement.setBoolean(4, obj.isInterne());
			
			preparedStatement.executeQuery();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			obj.setIdStagiaire(rs.getLong(1));
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Stagiaire update(Stagiaire obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE stagiaire SET nom = ?, prenom = ?, interne = ? WHERE idStagiaire = ? INNER JOIN personne ON idStagiaire = personne.idPersonne")){
			preparedStatement.setString(1,obj.getNom());
			preparedStatement.setString(2,obj.getPrenom());
			preparedStatement.setBoolean(3, obj.isInterne());
			preparedStatement.setLong(4,obj.getIdStagiaire());
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(Stagiaire obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM stagiaire WHERE idStagiaire = ?")) {
			preparedStatement.setLong(1, obj.getIdStagiaire());
			preparedStatement.execute();
			int rows = preparedStatement.executeUpdate();
			

            if (rows > 0) {
                isDeleted = true;
            }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isDeleted;
	}

	public List<Stagiaire> findAll() {
		 ArrayList<Stagiaire> listeStagiaires = new ArrayList<Stagiaire>();
			
			try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idStagiaire, nom, prenom, interne FROM stagiaire INNER JOIN personne ON idStagiaire = personne.idPersonne")){
			
				ResultSet rs = preparedStatement.executeQuery();
				
				while(rs.next()){
			
					Long idStagiaire = rs.getLong("idStagiaire");
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					Boolean interne = rs.getBoolean("interne");
					Stagiaire stagiaire = new Stagiaire(idStagiaire,interne,nom,prenom);
					listeStagiaires.add(stagiaire);
					
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return listeStagiaires;
	}

	public Stagiaire find(long id) {
		 
			Stagiaire stagiaire = null;
			try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idStagiaire, nom, prenom, interne FROM stagiaire INNER JOIN personne ON idStagiaire = personne.idPersonne WHERE idStagiaire = ?")){
			
				ResultSet rs = preparedStatement.executeQuery();
				
				while(rs.next()){
			
					Long idStagiaire = rs.getLong("idStagiaire");
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					Boolean interne = rs.getBoolean("interne");
				    stagiaire = new Stagiaire(idStagiaire,interne,nom,prenom);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return stagiaire;
	}

}
