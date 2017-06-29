package cerfa.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cerfa.dao.interfaces.IFinancementDAO;
import cerfa.db.DbException;
import cerfa.model.impl.Financement;
import cerfa.model.interfaces.IFinancement;


public class FinancementDAOImpl  extends DAO<IFinancement> implements IFinancementDAO{

	public FinancementDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public IFinancement create(IFinancement obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO financement (libelle) VALUES (?)")){
			preparedStatement.setString(1,obj.getLibelle());
			preparedStatement.executeQuery();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			obj.setIdFinancement(rs.getLong(1));
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public IFinancement update(IFinancement obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE financement SET libelle = ? WHERE idFinancement = ?")){
			preparedStatement.setString(1,obj.getLibelle());
			preparedStatement.setLong(2,obj.getIdFinancement());
			preparedStatement.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(IFinancement obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM financement WHERE idFinancement = ?")){
			preparedStatement.setLong(1,obj.getIdFinancement());
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

	public List<IFinancement> findAll() {
ArrayList<IFinancement> listeFinancements = new ArrayList<IFinancement>();
		
		try(Statement stm = (Statement)con.createStatement()){
		
			ResultSet rs = stm.executeQuery("SELECT 'idFinancement', `libelle` FROM financement");
			
			while(rs.next()){
				
				long idFinancement = rs.getLong("idFinancement");
				String libelle = rs.getString("libelle");
		
				Financement financement = new Financement(idFinancement,libelle);
				listeFinancements.add(financement);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeFinancements;
	}

	public IFinancement find(long id) {
		IFinancement financement = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT 'idFinancement', `libelle` FROM financement WHERE idFinancement = ?")){
			ResultSet rs = preparedStatement.executeQuery();
			preparedStatement.setLong(1,id);
			
			while(rs.next()){
				
				long idFinancement= rs.getLong("idFinancement");
				String libelle = rs.getString("libelle");
				financement = new Financement(idFinancement,libelle);
				
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return financement;
	}

}
