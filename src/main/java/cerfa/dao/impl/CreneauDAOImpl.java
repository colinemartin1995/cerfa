package cerfa.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		// TODO Auto-generated method stub
		return null;
	}

	public Creneau delete(Creneau obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Creneau> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Creneau find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
