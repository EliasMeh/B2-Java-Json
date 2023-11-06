package dk.ns.series;

import com.google.gson.Gson;

public class Episode {
    private int numero ;
    private String titre ;
    private int duree ;
	
    public Episode(int numero, String titre, int duree) {
		super();
		this.numero = numero;
		this.titre = titre;
		this.duree = duree;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Episode [numero=" + numero + ", titre=" + titre + ", duree=" + duree + "]";
	}
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}	
	
}