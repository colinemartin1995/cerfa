package cerfa.model;

public class Specialite {
	private Long idSpecialite;
	private String nom;
	private String code;
	
	public Long getIdSpecialite() {
		return idSpecialite;
	}
	public void setIdSpecialite(Long idSpecialite) {
		this.idSpecialite = idSpecialite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public Specialite(String nom, String code){
		this.nom = nom;
		this.code = code;
		
	}
	public Specialite(long id, String nom, String code){
		this.idSpecialite = id;
		this.nom = nom;
		this.code = code;
		
	}

}
