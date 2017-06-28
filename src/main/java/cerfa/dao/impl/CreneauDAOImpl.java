package cerfa.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import cerfa.dao.interfaces.ICreneauDAO;
import cerfa.db.DbException;
import cerfa.model.Creneau;


public class CreneauDAOImpl extends DAO<Creneau> implements ICreneauDAO{

	public CreneauDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Creneau create(Creneau obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO creneau (dateDebut, dateFin, interne, fk_formation)VALUES(?,?,?,?)")){
			preparedStatement.setDate(1,Date.valueOf(obj.getDateDebut()));
			preparedStatement.setDate(2,Date.valueOf(obj.getDateFin()));
			preparedStatement.setBoolean(3,obj.isInterne());
			preparedStatement.setLong(4,obj.getFk_formation());
			
			preparedStatement.executeQuery();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			obj.setIdCreneau(rs.getLong(1));
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Creneau update(Creneau obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE creneau SET dateDebut = ?, dateFin = ?, interne = ?, fk_formation =? WHERE idCreneau = ?")){
			preparedStatement.setDate(1,Date.valueOf(obj.getDateDebut()));
			preparedStatement.setDate(2,Date.valueOf(obj.getDateFin()));
			preparedStatement.setBoolean(3,obj.isInterne());
			preparedStatement.setLong(4,obj.getFk_formation());
			preparedStatement.setLong(5,obj.getIdCreneau());
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(Creneau obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM creneau WHERE idCreneau = ?")){
			preparedStatement.setLong(1,obj.getIdCreneau());
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

	public List<Creneau> findAll() {
		
		ArrayList<Creneau> listeCreneaux = new ArrayList<Creneau>();
		
		try(Statement stm = (Statement)con.createStatement()){
		
			ResultSet rs = stm.executeQuery("SELECT idCreneau, dateDebut,dateFin,interne,fk_Formation FROM creneau INNER JOIN formation WHERE fk_formation = idFormation");
			
			while(rs.next()){
				
				long idCreneau = rs.getLong("idCreneau");
				LocalDate dateDebut = rs.getDate("dateDebut").toLocalDate();
				LocalDate dateFin = rs.getDate("dateFin").toLocalDate();
				boolean interne = rs.getBoolean("interne");
				long fk_formation = rs.getLong("fk_formation");
				
				Creneau creneau = new Creneau(idCreneau,dateDebut,dateFin,interne,fk_formation);
				listeCreneaux.add(creneau);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeCreneaux;
		
	}

	public Creneau find(long id) {
		Creneau creneau = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT 'idCreneau', `dateDebut`,`dateFin`,`interne`,`fk_Formation` FROM creneau WHERE idCreneau = ?")){
			ResultSet rs = preparedStatement.executeQuery();
			preparedStatement.setLong(1,id);
			
			while(rs.next()){
				
				long idCreneau = rs.getLong("idCreneau");
				LocalDate dateDebut = rs.getDate("dateDebut").toLocalDate();
				LocalDate dateFin = rs.getDate("dateFin").toLocalDate();
				boolean interne = rs.getBoolean("interne");
				long fk_formation = rs.getLong("fk_formation");
				creneau = new Creneau(idCreneau,dateDebut,dateFin,interne,fk_formation);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return creneau;
	}

}
