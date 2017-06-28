package cerfa.dao.impl;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cerfa.dao.interfaces.IFormateurDAO;
import cerfa.db.DbException;
import cerfa.model.impl.Formateur;
import cerfa.model.interfaces.IFormateur;


public class FormateurDAOImpl extends DAO<IFormateur> implements IFormateurDAO{

	public FormateurDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public IFormateur create(IFormateur obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO formateur (idFormateur, nom, prenom, interne) VALUES(?,?,?,?)"
				+ "INNER JOIN personne ON idFormateur = personne.idPersonne ")){
			preparedStatement.setLong(1,obj.getIdPersonne());
			preparedStatement.setString(2,obj.getNom());
			preparedStatement.setString(3,obj.getPrenom());
			preparedStatement.setBoolean(4, obj.isInterne());
			
			preparedStatement.executeQuery();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			obj.setIdFormateur(rs.getLong(1));
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public IFormateur update(IFormateur obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE formation SET nom = ?, prenom = ?, interne = ? WHERE idFormateur = ? INNER JOIN personne ON idFormateur = personne.idPersonne")){
			preparedStatement.setString(1,obj.getNom());
			preparedStatement.setString(2,obj.getPrenom());
			preparedStatement.setBoolean(3, obj.isInterne());
			preparedStatement.setLong(4,obj.getIdFormateur());
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}
	public Boolean delete(IFormateur obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM formateur WHERE idFormateur = ?")) {
			preparedStatement.setLong(1, obj.getIdFormateur());
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

	public List<IFormateur> findAll() {
		 ArrayList<IFormateur> listeFormateurs = new ArrayList<IFormateur>();
			
			try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idFormateur, nom, prenom, interne FROM formateur INNER JOIN personne ON idFormateur = personne.idPersonne")){
			
				ResultSet rs = preparedStatement.executeQuery();
				
				while(rs.next()){
			
					Long idFormateur = rs.getLong("idFormateur");
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					Boolean interne = rs.getBoolean("interne");
					Formateur formateur = new Formateur(idFormateur,interne,nom,prenom);
					listeFormateurs.add(formateur);
					
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return listeFormateurs;
		}

	public IFormateur find(long id) {
		
			IFormateur formateur = null;
			try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idFormateur, nom, prenom, interne FROM formateur INNER JOIN personne ON idFormateur = personne.idPersonne")){
				preparedStatement.setLong(1,id);
				ResultSet rs = preparedStatement.executeQuery();
				
				while(rs.next()){
			
					Long idFormateur = rs.getLong("idFormateur");
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					Boolean interne = rs.getBoolean("interne");
					formateur = new Formateur(idFormateur,interne,nom,prenom);
				
					
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return formateur;
	}	

}
