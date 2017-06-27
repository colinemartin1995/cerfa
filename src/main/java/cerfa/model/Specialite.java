package cerfa.model;

public class Specialite {
	private Integer idSpecialite;
	private String nom;
	private String code;
	
	public Integer getIdSpecialite() {
		return idSpecialite;
	}
	public void setIdSpecialite(Integer idSpecialite) {
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

}
