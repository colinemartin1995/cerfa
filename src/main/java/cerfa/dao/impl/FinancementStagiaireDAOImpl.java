package cerfa.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import cerfa.dao.interfaces.IFinancementStagiaireDAO;
import cerfa.db.DbException;
import cerfa.model.impl.Financement;
import cerfa.model.impl.FinancementStagiaire;
import cerfa.model.impl.Stagiaire;
import cerfa.model.interfaces.IFinancementStagiaire;

public class FinancementStagiaireDAOImpl extends DAO<IFinancementStagiaire> implements IFinancementStagiaireDAO {

	public FinancementStagiaireDAOImpl() throws ClassNotFoundException, DbException {
		super();
		// TODO Auto-generated constructor stub
	}

	public IFinancementStagiaire create(IFinancementStagiaire obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("INSERT INTO financementstagiaire (fk_stagiaire, fk_financement, dateDebut, dateFin)VALUES(?,?,?,?)")){
			
			
			preparedStatement.setLong(1,obj.getStagiaire().getIdStagiaire());
			preparedStatement.setLong(2,obj.getFinancement().getIdFinancement());
			preparedStatement.setDate(3,Date.valueOf(obj.getDateDebut()));
			preparedStatement.setDate(4,Date.valueOf(obj.getDateFin()));
			
			preparedStatement.executeQuery();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			//obj.setIdCreneau(rs.getLong(1));
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public IFinancementStagiaire update(IFinancementStagiaire obj) {
		try(PreparedStatement preparedStatement =con.prepareStatement("UPDATE financementstagiaire SET  fk_stagiaire =?, fk_financement= ?, dateDebut = ?, dateFin = ? WHERE fk_stagiaire = ?")){
			preparedStatement.setDate(1,Date.valueOf(obj.getDateDebut()));
			preparedStatement.setDate(2,Date.valueOf(obj.getDateFin()));
			preparedStatement.setLong(3,obj.getStagiaire().getIdStagiaire());
			preparedStatement.setLong(4,obj.getFinancement().getIdFinancement());
			preparedStatement.setLong(5,obj.getStagiaire().getIdStagiaire());
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}

	public Boolean delete(IFinancementStagiaire obj) {
		boolean isDeleted = false;
		try(PreparedStatement preparedStatement =con.prepareStatement("DELETE FROM financementstagiaire WHERE fk_stagiaire = ?")){
			preparedStatement.setLong(1,obj.getStagiaire().getIdStagiaire());
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

	public List<IFinancementStagiaire> findAll() {
ArrayList<IFinancementStagiaire> listeFinancementStagiaires = new ArrayList<IFinancementStagiaire>();
		Stagiaire stagiaire = null;
		Financement financement  = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT fk_stagiaire, fk_financement, idStagiaire, nom, prenom, interne, idFinancement, libelle, dateDebut, dateFin FROM financementstagiaire INNER JOIN stagiaire ON fk_stagiaire = stagiaire.idStagiaire INNER JOIN financement ON fk_financement = idFinancement INNER JOIN personne ON stagiaire.idStagiaire = personne.idPersonne")){
		
			ResultSet rs = preparedStatement.executeQuery();
					
			while(rs.next()){
				
				//long fk_stagiaire = rs.getLong("fk_stagiaire");
				Long idStagiaire = rs.getLong("fk_Stagiaire");
				String nom = rs.getString("personne.nom");
				String prenom = rs.getString("personne.prenom");
				Boolean interne = rs.getBoolean("stagiair.einterne");
			    stagiaire = new Stagiaire(idStagiaire,interne,nom,prenom);
			    
			    long idFinancement= rs.getLong("fk_Financement");
				String libelle = rs.getString("financement.libelle");
				financement = new Financement(idFinancement,libelle);
				
				LocalDate dateDebut = rs.getDate("dateDebut").toLocalDate();
				LocalDate dateFin = rs.getDate("dateFin").toLocalDate();
				//long fk_financement = rs.getLong("fk_financement");
				
				
				FinancementStagiaire financementStagiaire = new FinancementStagiaire(stagiaire,financement,dateDebut,dateFin);
				
				listeFinancementStagiaires.add(financementStagiaire);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listeFinancementStagiaires;
		
	}

	public IFinancementStagiaire find(long id) {
		
		FinancementStagiaire fntStagiaire = null;
		Stagiaire stagiaire = null;
		Financement financement  = null;
		try(PreparedStatement preparedStatement =con.prepareStatement("SELECT fk_stagiaire, fk_financement, dateDebut, dateFin, personne.nom, personne.prenom, stagiaire.interne, financement.libelle FROM financementstagiaire INNER JOIN stagiaire ON fk_stagiaire = stagiaire.idStagiaire INNER JOIN financement ON fk_financement = idFinancement INNER JOIN personne ON stagiaire.idStagiaire = personne.idPersonne WHERE fk_stagiaire = ?")){
			preparedStatement.setLong(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				
				Long idStagiaire = rs.getLong("fk_Stagiaire");
				String nom = rs.getString("personne.nom");
				String prenom = rs.getString("personne.prenom");
				Boolean interne = rs.getBoolean("stagiaire.interne");
			    stagiaire = new Stagiaire(idStagiaire,interne,nom,prenom);
			    
			    long idFinancement= rs.getLong("fk_Financement");
				String libelle = rs.getString("financement.libelle");
				financement = new Financement(idFinancement,libelle);
				
				//long fk_stagiaire = rs.getLong("fk_stagiaire");
				LocalDate dateDebut = rs.getDate("dateDebut").toLocalDate();
				LocalDate dateFin = rs.getDate("dateFin").toLocalDate();
				//long fk_financement = rs.getLong("fk_financement");
				fntStagiaire = new FinancementStagiaire(stagiaire,financement,dateDebut,dateFin);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return fntStagiaire;
	}

}
