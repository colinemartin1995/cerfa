package cerfa.db;

public class DbException extends Exception {

	public DbException(String string) {
		super(string);
	}
	public DbException(String message, Exception parent){
		super(message,parent);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 942827741674776181L;
	

}
