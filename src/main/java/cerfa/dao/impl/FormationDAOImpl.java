package cerfa.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import cerfa.dao.interfaces.IFormationDAO;
import cerfa.db.DbException;
import cerfa.model.Formation;

public class FormationDAOImpl extends DAO<Formation> implements IFormationDAO{

	public FormationDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation create(Formation obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO formation (nom, fk_specialite, fk_objectif)VALUES(?,?,?)")){
			preparedStatement.setDate(1,Date.valueOf(obj.getNom()));
			preparedStatement.setLong(2,obj.getFk_specialite());
			preparedStatement.setLong(4,obj.getFk_objectif());
			
			preparedStatement.executeQuery();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			obj.setIdFormation(rs.getLong(1));
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Formation update(Formation obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE formation SET nom = ?, fk_specialite = ?, fk_objectif = ? WHERE idFormation = ?")){
			preparedStatement.setString(1,obj.getNom());
			preparedStatement.setLong(2,obj.getFk_specialite());
			preparedStatement.setLong(3,obj.getFk_objectif());
			preparedStatement.setLong(4,obj.getIdFormation());
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(Formation obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM formation WHERE idFormation = ?")){
			preparedStatement.setLong(1,obj.getIdFormation());
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

	public List<Formation> findAll() {
        ArrayList<Formation> listeFormations = new ArrayList<Formation>();
		
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idFormation, nom,fk_specialite,fk_objectif FROM formation")){
		
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				
				long idFormation = rs.getLong("idFormation");
				String nom = rs.getString("nom");
				
				long fk_specialite = rs.getLong("fk_specialite");
				long fk_objectif = rs.getLong("fk_objectif");
				
				Formation formation = new Formation(idFormation,nom,fk_specialite,fk_objectif);
				listeFormations.add(formation);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeFormations;
	}

	public Formation find(long id) {
		  Formation formation = null;
			
			try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idFormation, nom,fk_specialite,fk_objectif FROM formation WHERE idFormation = ?")){
				preparedStatement.setLong(1, id);
				ResultSet rs = preparedStatement.executeQuery();
				
				while(rs.next()){
					
					long idFormation = rs.getLong("idFormation");
					String nom = rs.getString("nom");
					long fk_specialite = rs.getLong("fk_specialite");
					long fk_objectif = rs.getLong("fk_objectif");
					
					formation = new Formation(idFormation,nom,fk_specialite,fk_objectif);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return formation;
	}

}
