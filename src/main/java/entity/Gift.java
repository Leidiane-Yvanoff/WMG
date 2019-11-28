package entity;

public class Gift {

	//Attributs
	private Long id;
	private String nom;
	private String lien;
	private Long id_event_list;
	
	//Constructeur
	
	public Gift(Long id, String nom, String lien, Long id_event_list) {
	
		this.id = id;
		this.nom = nom;
		this.lien = lien;
		this.id_event_list= id_event_list;
	}
	
	public Gift() {
		
		
	}
	//Getters et setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}
	
	public Long getId_event_list() {
		return id_event_list;
	}


	public void setId_event_list(Long id_event_list) {
		this.id_event_list = id_event_list;
	}

}
