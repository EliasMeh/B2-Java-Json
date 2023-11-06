package dk.ns.series;

public class Role {
    private Acteur acteur ;
    private Serie serie ;
    private String nom ;
    private String prenom ;
	
    public Role(Acteur acteur, Serie serie, String nom, String prenom) {
		super();
		this.acteur = acteur;
		this.serie = serie;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Acteur getActeur() {
		return acteur;
	}

	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
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
		return "Role [acteur=" + acteur + ", serie=" + serie + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}