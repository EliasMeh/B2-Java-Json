package dk.ns.series;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class AppSeries {

	public static void main(String[] args) {
//		List<Acteur> acteurs = new ArrayList<>() ;
//		
//		acteurs.add( new Acteur( "BRUH" , "Nina") ) ;
//		acteurs.add( new Acteur( "MAMA" , "Immacula" ) ) ;
//		acteurs.add( new Acteur( "MEHDAOUI" , "Elias" ) ) ;

		//System.out.println(acteurs);
		//for (Acteur acteur : acteurs) {
		//	System.out.println(acteur.getNom());
		//}
		List<Serie> series = new ArrayList<>() ;
		
		Serie se1 = new Serie("Arcane");
		
		Saison sa1se1 = new Saison(1, 2021);
		sa1se1.ajouterEpisode(new Episode(1, "Welcome to the playground", 43));
		sa1se1.ajouterEpisode(new Episode(2, "Some Mysteries Are Better Left Unsolved", 40));
		sa1se1.ajouterEpisode(new Episode(3, "The Base Violence Necessary for Change", 44));
		se1.ajouterSaison(sa1se1);
		
		Saison sa2se1 = new Saison(2, 2022);
		sa2se1.ajouterEpisode(new Episode(1, "Happy Progress Day!", 40));
		sa2se1.ajouterEpisode(new Episode(2, "Everybody Wants to Be My Enemy", 39));
		sa2se1.ajouterEpisode(new Episode(3, "When These Walls Come Tumbling Down", 42));
		se1.ajouterSaison(sa2se1);
		
	
		Serie se2 = new Serie("Brooklyn Nine-Nine");

		Saison sa1se2 = new Saison(1, 2020);
		sa1se2.ajouterEpisode(new Episode(1, "Pilot", 22));
		sa1se2.ajouterEpisode(new Episode(2, "The Tagger", 21));
		sa1se2.ajouterEpisode(new Episode(3, "The Slump", 21));
		sa1se2.ajouterEpisode(new Episode(4, "M.E. Time", 21));

		se2.ajouterSaison(sa1se2);
		
		series.add(se1);
		series.add(se2);
		
		//for(Serie serie : series) {
		//	System.out.println("Titre :" + serie.getTitre());
		//	System.out.println("Nbsaisons :"+ serie.getSaisons().size() );
		//}

		//for (Serie serie : series) {
		//    if (serie.getTitre().equals("Arcane")) {
		//        for (Saison saison : serie.getSaisons()) {
		//           if (saison.getNumero() == 2) {
		//                System.out.println("Saison " + saison.getNumero() + ", Année " + saison.getAnneeSortie());
		//                for (Episode episode : saison.getEpisodes()) {
		//                    System.out.println("  Titre : " + episode.getTitre() + ", Durée : " + episode.getDuree() + " minutes");
		//                }
		//            }
		//        }
		//    }
		//}
		
		
		//for (Serie serie : series) {
	    //System.out.println("Titre de la série : " + serie.getTitre());
	    //for (Saison saison : serie.getSaisons()) {
	    //    System.out.println("  Saison " + saison.getNumero() + ", Année " + saison.getAnneeSortie());
	    //    for (Episode episode : saison.getEpisodes()) {
	    //        System.out.println("    Titre : " + episode.getTitre() + ", Durée : " + episode.getDuree() + " minutes");
	    //    }
	    //}
		//}
		
		//String tl = "";
		//		int dl = 0;
		//		int nS = 0;
		//		String nomSerie = "";

		//		for (Serie serie : series) {
		//		    for (Saison saison : serie.getSaisons()) {
		//		        for (Episode episode : saison.getEpisodes()) {
		//		            if (episode.getDuree() > dl) {
		//		                tl = episode.getTitre();
		//		                nS = saison.getNumero();
		//		                nomSerie = serie.getTitre();
		//		            }
		//		        }
		//		    }
		//		}
		//	System.out.println("Episode le plus long : " + tl + " , " + nS+ " , " + nomSerie);
		
		
//		List<Role> roles = new ArrayList<>();

//		roles.add(new Role(acteurs.get(0), series.get(0), "Jinx", "Piltover"));
//		roles.add(new Role(acteurs.get(1), series.get(1), "Vi", "Zaun"));

		
		//for (Role role : roles) {
		//    System.out.println("\n Nom : " + role.getNom() + "\n Prénom : " + role.getPrenom());
		//}

		
		
		
		//for (Role role : roles) {
		//    System.out.println("\n Série : " + role.getSerie().getTitre() + "\n Nom : " + role.getNom() + "\n Prénom : " + role.getPrenom() + "\n Acteur : " + role.getActeur().getNom() + " " + role.getActeur().getPrenom());
		//}
		

		
		
		//Acteur secondActeur = acteurs.get(1);
        //for (Role role : roles) {
        //    if (role.getActeur().equals(deuxiemeActeur)) {
        //        System.out.println(role.getSerie().getTitre());
        //   }
        //}
		
		//System.out.println(acteurs.get(1).toJson());
		//System.out.println(series.get(1).getSaisons().get(0).getEpisodes().get(0).toJson());
		//System.out.println(series.get(1).getSaisons().get(0).toJson());
		//System.out.println(series.get(1).toJson());
		//for(Serie serie : series) {
		//	System.out.println(serie.toJson());
		//}
		
		
		//String json = "" ;
		//for(Acteur acteur: acteurs) {
		//	json = json + acteur.toJson() ;
		//};
		//String fileName = "ns-acteurs.json";
		//try (FileWriter writer = new FileWriter(fileName)) {
		//	writer.write(json);
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
		
		//String json = "" ;
		//for(Serie serie: series) {
		//	json = json + serie.toJson() ;
		//};
		//String fileName = "ns-series.json";
		//try (FileWriter writer = new FileWriter(fileName)) {
		//	writer.write(json);
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
		File input = new File("C:/Users/bydof/eclipse-workspace/NS01v2/ns-acteurs.json");
		try {
			JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
			JsonObject fileObject = fileElement.getAsJsonObject();
			
			String nom = fileObject.get("nom").getAsString();
			String prenom = fileObject.get("prenom").getAsString();
			System.out.println("Nom : " + nom);
			System.out.println("Nom : " + prenom);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}



