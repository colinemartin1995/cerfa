package cerfa.dao.impl;

import java.sql.Connection;

import cerfa.dao.interfaces.IDAO;
import cerfa.db.ConnectionFactory;
import cerfa.db.DbException;

public abstract class DAO<T> implements IDAO<T>{
	protected final Connection con ;
	public DAO() throws ClassNotFoundException, DbException {
		
		this.con = ConnectionFactory.getConnection(ConnectionFactory.PROJETJAVA);
	
	}
	
	
	
	

}
