package thalia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainProgramm {

	public static void main(String[] args) {
		System.out.println("\nAUFGABE1:\n");
		
		List<String> daten = new ArrayList<String>();
		daten = Daten.verkaufteBuecherDatenHolen();
		
		List<Buch> alleBuecher = new ArrayList<Buch>();
		
		for(String buchString : daten) {
			String tokens[] = buchString.split(";");
			String titel = tokens[0];
			String typ = tokens[1];
			Double preis = Double.parseDouble(tokens[2]);
			int auflage = Integer.parseInt(tokens[3]);
			
			switch(typ) {
				case "Buch":
					Buch buchObjekt = new Buch(titel, typ, preis, auflage);
					alleBuecher.add(buchObjekt);
					break;
				case "Ebuch":
					int version = Integer.parseInt(tokens[4]);
					EBuch ebuchObjekt = new EBuch(titel, typ, preis, auflage, version);
					alleBuecher.add(ebuchObjekt);
					break;
				case "Hoerbuch":
					String modus = tokens[4];
					Hoerbuch hbuchObjekt = new Hoerbuch(titel, typ, preis, auflage, modus);
					alleBuecher.add(hbuchObjekt);
					break;
				default:
					System.out.println("FEHLER");
			}
			
		}
			double allePreise = 0;
			double buchPreise = 0;
			double ebuchPreise = 0;
			double hbuchPreise = 0;
			
			for(Buch buch : alleBuecher) {
				allePreise += buch.getPreis();
				if(buch.getTyp().equals("Buch"))
					buchPreise += buch.getPreis();
				else if(buch.getTyp().equals("Ebuch"))
					ebuchPreise += buch.getPreis();
				else if(buch.getTyp().equals("Hoerbuch"))
					hbuchPreise += buch.getPreis();
				else
					System.out.println("FEHEEHEELER!");
			}
			
			System.out.println("Alle Preise: " + allePreise);
			System.out.println("Buchpreise: " + buchPreise);
			System.out.println("EBuchpreise: " + ebuchPreise);
			System.out.println("Hoeruchpreise: " + hbuchPreise);
			
			System.out.println("\nAUFGABE2:\n");
			
			int anzahlTolino3 = 0;
			
			for(Buch buch : alleBuecher) {
				if(buch.getTyp().equals("Ebuch")) 
					if(((EBuch) buch).getVersion() == 3) {
						anzahlTolino3++;
					}
				
			}
			
			System.out.println("Anzahl Tolino 3 Bücher: " + anzahlTolino3);
			
			System.out.println("\nAUFGABE3:\n");
			
			int anzahlStreaming = 0;
			
			for(Buch buch : alleBuecher) {
				if(buch.getTyp().equals("Hoerbuch")) 
					if(((Hoerbuch) buch).getModus().equals("Streaming")) {
						anzahlStreaming++;
					}
				
			}
			
			System.out.println("Anzahl Streaming: " + anzahlStreaming);
			
			System.out.println("\nAUFGABE4:\n");
			
			Set<String> buecher = new HashSet<String>();
			Set<String> ebuecher = new HashSet<String>();
			Set<String> hbuecher = new HashSet<String>();
			
			
			for(Buch buch : alleBuecher) {
				if(buch.getTyp().equals("Buch"))
					buecher.add(buch.getTitel() + "\t" + buch.getTyp());
				if(buch.getTyp().equals("Ebuch"))
					ebuecher.add(buch.getTitel() + "\t" + buch.getTyp());
				if(buch.getTyp().equals("Hoerbuch"))
					hbuecher.add(buch.getTitel() + "\t" + buch.getTyp());
			}
			
			for(String string : buecher) {
				System.out.println(string);
			}
			
			System.out.println();
			
			for(String string : ebuecher) {
				System.out.println(string);
			}
			
			System.out.println();
			
			for(String string : hbuecher) {
				System.out.println(string);
			}
			System.out.println();
	}
}
