package cerfa.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import cerfa.dao.interfaces.IObjectifDAO;
import cerfa.db.DbException;
import cerfa.model.impl.Objectif;
import cerfa.model.interfaces.IObjectif;

public class ObjectifDAOImpl extends DAO<Objectif> implements IObjectifDAO{

	public ObjectifDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public IObjectif create(IObjectif obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO objectif (libelle) VALUES (?)")){
			preparedStatement.setString(1,obj.getLibelle());
			preparedStatement.executeQuery();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			obj.setIdObjectif(rs.getLong(1));
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public IObjectif update(IObjectif obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE objectif SET libelle = ? WHERE idObjecfif = ?")){
			preparedStatement.setString(1,obj.getLibelle());
			preparedStatement.setLong(2,obj.getIdObjectif());
			preparedStatement.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(IObjectif obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM objectif WHERE idObjectif = ?")){
			preparedStatement.setLong(1,obj.getIdObjectif());
			preparedStatement.execute();
			int rows = preparedStatement.executeUpdate();
			

            if (rows > 0) {
                isDeleted = true;
            }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	public List<Objectif> findAll() {

		ArrayList<Objectif> listeObjectifs = new ArrayList<Objectif>();
		
		try(Statement stm = (Statement)con.createStatement()){
		
			ResultSet rs = stm.executeQuery("SELECT 'idObjectif', `libelle` FROM objectif");
			
			while(rs.next()){
				
				long idObjectif = rs.getLong("idObjectif");
				String libelle = rs.getString("libelle");
		
				Objectif objectif = new Objectif(idObjectif,libelle);
				listeObjectifs.add(objectif);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeObjectifs;
		
	}

	public IObjectif find(long id) {
		IObjectif objectif = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT 'idObjectif', `libelle` FROM objectif WHERE idObjectif = ?")){
			ResultSet rs = preparedStatement.executeQuery();
			preparedStatement.setLong(1,id);
			
			while(rs.next()){
				
				long idObjectif = rs.getLong("idObjectif");
				String libelle = rs.getString("libelle");
				objectif = new Objectif(idObjectif,libelle);
				
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objectif;
		
	}


}
