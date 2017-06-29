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
import cerfa.model.impl.Creneau;
import cerfa.model.impl.Formation;
import cerfa.model.impl.Objectif;
import cerfa.model.impl.Specialite;
import cerfa.model.interfaces.ICreneau;


public class CreneauDAOImpl extends DAO<ICreneau> implements ICreneauDAO{

	public CreneauDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICreneau create(ICreneau obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO creneau (dateDebut, dateFin, interne, fk_formation)VALUES(?,?,?,?)")){
			preparedStatement.setDate(1,Date.valueOf(obj.getDateDebut()));
			preparedStatement.setDate(2,Date.valueOf(obj.getDateFin()));
			preparedStatement.setBoolean(3,obj.isInterne());
			preparedStatement.setLong(4,obj.getFormation().getIdFormation());
			
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

	public ICreneau update(ICreneau obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE creneau SET dateDebut = ?, dateFin = ?, interne = ?, fk_formation =? WHERE idCreneau = ?")){
			preparedStatement.setDate(1,Date.valueOf(obj.getDateDebut()));
			preparedStatement.setDate(2,Date.valueOf(obj.getDateFin()));
			preparedStatement.setBoolean(3,obj.isInterne());
			preparedStatement.setLong(4,obj.getFormation().getIdFormation());
			preparedStatement.setLong(5,obj.getIdCreneau());
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(ICreneau obj) {
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

	public List<ICreneau> findAll() {
		
		ArrayList<ICreneau> listeCreneaux = new ArrayList<ICreneau>();
		Specialite specialite = null;
		Objectif objectif = null;
		Formation formation = null;
		
		try(Statement stm = (Statement)con.createStatement()){
		
			ResultSet rs = stm.executeQuery("SELECT idCreneau, dateDebut,dateFin,interne,fk_Formation,sp.nom, sp.code, obj.libelle, f.fk.specialite, f.fk_objectif, f.nom FROM creneau INNER JOIN formation f ON f.idFormation = fk_formation INNER JOIN specialite sp ON sp.idSpecialite = fk_specialite INNER JOIN objectif obj ON obj.idObjectif = fk_objectif");
			
			while(rs.next()){
				
				long idSpecialite = rs.getLong("f.fk_specialite");
				String nomSpecialite = rs.getString("sp.nom");
				String code = rs.getString("sp.code");
				specialite = new Specialite(idSpecialite, nomSpecialite, code);
				
				long idObjectif = rs.getLong("f.fk_objectif");
				String libelle = rs.getString("obj.libelle");
				objectif = new Objectif(idObjectif,libelle);
				
				long fk_formation = rs.getLong("fk_formation");
				String nomFormation = rs.getString("f.nom");
				formation = new Formation(fk_formation, nomFormation, specialite, objectif);
				
				long idCreneau = rs.getLong("idCreneau");
				LocalDate dateDebut = rs.getDate("dateDebut").toLocalDate();
				LocalDate dateFin = rs.getDate("dateFin").toLocalDate();
				boolean interne = rs.getBoolean("interne");
				
				
		
				cerfa.model.interfaces.ICreneau creneau = new Creneau(idCreneau,dateDebut,dateFin,interne,formation);
				listeCreneaux.add(creneau);
				
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeCreneaux;
		
	}

	public ICreneau find(long id) {
		Creneau creneau = null;
		Specialite specialite = null;
		Objectif objectif = null;
		Formation formation = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT idCreneau, dateDebut,dateFin,interne,fk_Formation,sp.nom, sp.code, obj.libelle, f.fk.specialite, f.fk_objectif, f.nom FROM creneau INNER JOIN formation f ON f.idFormation = fk_formation INNER JOIN specialite sp ON sp.idSpecialite = fk_specialite INNER JOIN objectif obj ON obj.idObjectif = fk_objectif WHERE idCreneau = ?")){
			ResultSet rs = preparedStatement.executeQuery();
			preparedStatement.setLong(1,id);
			
			while(rs.next()){
				
				
				long idSpecialite = rs.getLong("f.fk_specialite");
				String nomSpecialite = rs.getString("sp.nom");
				String code = rs.getString("sp.code");
				specialite = new Specialite(idSpecialite, nomSpecialite, code);
				
				long idObjectif = rs.getLong("f.fk_objectif");
				String libelle = rs.getString("obj.libelle");
				objectif = new Objectif(idObjectif,libelle);
				
				long fk_formation = rs.getLong("fk_formation");
				String nomFormation = rs.getString("f.nom");
				formation = new Formation(fk_formation, nomFormation, specialite, objectif);
				
				long idCreneau = rs.getLong("idCreneau");
				LocalDate dateDebut = rs.getDate("dateDebut").toLocalDate();
				LocalDate dateFin = rs.getDate("dateFin").toLocalDate();
				boolean interne = rs.getBoolean("interne");
				
				
				creneau = new Creneau(idCreneau,dateDebut,dateFin,interne,formation);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return creneau;
	}

}
