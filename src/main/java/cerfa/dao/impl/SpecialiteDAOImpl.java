package cerfa.dao.impl;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import cerfa.dao.interfaces.ISpecialiteDAO;
import cerfa.db.DbException;
import cerfa.model.impl.Specialite;
import cerfa.model.interfaces.ISpecialite;
import cerfa.model.proxy.ProxySpecialite;

public class SpecialiteDAOImpl extends DAO<Specialite> implements ISpecialiteDAO {

	public SpecialiteDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ISpecialite create(ISpecialite obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO specialite (nom, code)VALUES(?,?)")){
			preparedStatement.setString(1,obj.getNom());
			preparedStatement.setString(2,obj.getCode());
			preparedStatement.executeQuery();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			obj.setIdSpecialite(rs.getLong(1));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	
	}

	public ISpecialite update(ISpecialite obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE specialite SET nom = ?, code = ? WHERE idSpecialite = ?")){
			preparedStatement.setString(1,obj.getNom());
			preparedStatement.setString(2,obj.getCode());
			preparedStatement.setLong(3,obj.getIdSpecialite());
			preparedStatement.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(ISpecialite obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM specialite WHERE idSpecialite = ?")){
			preparedStatement.setLong(1,obj.getIdSpecialite());
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

	public List<Specialite> findAll() {
		ArrayList<Specialite> listeSpecialite = new ArrayList<Specialite>();
		
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT 'idSpecialite', `nom','code' FROM specialite")){
		
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				
				long idSpecialite = rs.getLong("idCreneau");
				String nom = rs.getString("nom");
				String code = rs.getString("code");
				
				Specialite specialite = new Specialite(idSpecialite,nom,code);
				listeSpecialite.add(specialite);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeSpecialite;
	}

	public ISpecialite find(long id) {

		 Specialite specialite = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT 'idSpecialite', `nom','code' FROM Specialite WHERE idSpecialite = ?")){
		
			ResultSet rs = preparedStatement.executeQuery();
			preparedStatement.setLong(1,id);
			
			while(rs.next()){
				long idSpecialite = rs.getLong("idSpecialite");
				String nom = rs.getString("nom");
				String code = rs.getString("code");
				specialite = new Specialite(idSpecialite, nom, code);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return specialite;
	}

}


