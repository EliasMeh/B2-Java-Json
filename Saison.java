package dk.ns.series;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Saison {
	    private int numero;
	    private int anneeSortie;
	    private List<Episode> episodes;
		
	    public Saison(int numero, int anneeSortie) {
			super();
			this.numero = numero;
			this.anneeSortie = anneeSortie;
			this.episodes = new ArrayList<>();
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAnneeSortie() {
			return anneeSortie;
		}

		public void setAnneeSortie(int anneeSortie) {
			this.anneeSortie = anneeSortie;
		}

		public List<Episode> getEpisodes() {
			return episodes;
		}

		public void ajouterEpisode(Episode episode) {
	        episodes.add(episode);
		}

		@Override
		public String toString() {
			return "Saison [numero=" + numero + ", anneeSortie=" + anneeSortie + ", episodes=" + episodes + "]";
		}
		
		public String toJson() {
			Gson gson = new Gson();
			return gson.toJson(this);
		}	
}