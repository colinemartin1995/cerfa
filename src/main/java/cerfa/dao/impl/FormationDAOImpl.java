package cerfa.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import cerfa.dao.interfaces.IFormationDAO;
import cerfa.db.DbException;
import cerfa.model.impl.Formation;
import cerfa.model.impl.Objectif;
import cerfa.model.impl.Specialite;
import cerfa.model.interfaces.IFormation;
import cerfa.model.proxy.ProxyObjectif;
import cerfa.model.proxy.ProxySpecialite;

public class FormationDAOImpl extends DAO<Formation> implements IFormationDAO{

	public FormationDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public IFormation create(IFormation obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO formation (nom, fk_specialite, fk_objectif)VALUES(?,?,?)")){
			preparedStatement.setDate(1,Date.valueOf(obj.getNom()));
			preparedStatement.setLong(2,obj.getSpecialite().getIdSpecialite());
			preparedStatement.setLong(4,obj.getObjectif().getIdObjectif());
			
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

	public IFormation update(IFormation obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE formation SET nom = ?, fk_specialite = ?, fk_objectif = ? WHERE idFormation = ?")){
			preparedStatement.setString(1,obj.getNom());
			preparedStatement.setLong(2,obj.getSpecialite().getIdSpecialite());
			preparedStatement.setLong(3,obj.getObjectif().getIdObjectif());
			preparedStatement.setLong(4,obj.getIdFormation());
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(IFormation obj) {
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
        ProxySpecialite specialite = null;
        ProxyObjectif objectif = null;
        Formation formation = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idFormation, nom,fk_specialite,fk_objectif FROM formation")){
		
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				
				long idFormation = rs.getLong("idFormation");
				String nom = rs.getString("nom");
				
				long idSpecialite = rs.getLong("fk_specialite");
				long idObjectif = rs.getLong("fk_objectif");
				
				specialite = new ProxySpecialite(idSpecialite);
				objectif = new ProxyObjectif(idObjectif);
				formation = new Formation(idFormation,nom,specialite,objectif);
				listeFormations.add(formation);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeFormations;
	}

	public IFormation find(long id) {
		 Specialite specialite = null;
	     Objectif objectif = null;
		 IFormation formation = null;
			
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idFormation, nom,fk_specialite,fk_objectif FROM formation WHERE idFormation = ?")){
				preparedStatement.setLong(1, id);
				ResultSet rs = preparedStatement.executeQuery();
				
				while(rs.next()){
					
					long idFormation = rs.getLong("idFormation");
					long idSpecialite = rs.getLong("fk_specialite");
					long idObjectif = rs.getLong("fk_objectif");
					String nom = rs.getString("nom");
										
					
					
					
					
					
					
					//TODO
					
					
					
					
					
					
					
					
					
					
					
					
					formation = new Formation(idFormation,nom,specialite,objectif);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return formation;
	}

}
