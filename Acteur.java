package dk.ns.series;

import com.google.gson.Gson;

public class Acteur {
	private String nom ;
	private String prenom ;
	
	public Acteur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Acteur [nom=" + nom + ", prenom=" + prenom + "]";
	}	
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}	
}