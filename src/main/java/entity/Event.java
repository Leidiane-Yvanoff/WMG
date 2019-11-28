package entity;

import java.lang.String;
import java.sql.Date;


public class Event {
	
	  	private Long id;
	    private String intitule;
	    private String adresse;
	    private String message;
	    private Date dateEvent;
	    private String occasion;
	    
	    //constructor
	    public Event(Long id, String intitule, String adresse,  String message, Date dateEvent, String occasion) {
	        this.id = id;        
	        this.intitule = intitule;
	        this.adresse = adresse;
	        this.message = message;
	        this.setDateEvent(dateEvent);
	        this.occasion = occasion;
	      
	    }
	    public Event() {
	    	
	    }
	    
	    //getters and setters
	    
	    public Long getId() {
			return id;
		}
	    
	    public void setId(Long id) {
			this.id = id;
		}


	    public String getIntitule() {
			return intitule;
		}


		public void setIntitule(String intitule) {
			this.intitule = intitule;
		}
	    
		public String getAdresse() {
			return adresse;
		}


		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}


		public Date getDateEvent() {
			return dateEvent;
		}


		public void setDateEvent(Date dateEvent) {
			this.dateEvent = dateEvent;
		}
		
		public String getOccasion() {
			return occasion;
		}


		public void setOccasion(String occasion) {
			this.occasion = occasion;
		}
	
	    

}
