import java.util.*;
import java.io.*;
import java.lang.*;

/**
* Ohjelma kirjoittaa tiedostoon tiedot suorituksista, opiskelijoista sekä kursseista.
* <p>
* Luetaan tietoja tiedostosta linkitetyille listoille sekä HashMappeihin.
* <p>
* Testataan luokkien toimintaa.
* <p>
* @author Kaisu Pietarinen
* @version 1.00 2021/12/8
*/
public class HarjoitustyoDemo{
	
	/**
	* Main-metodi luokkien toiminnan testaamiseen sekä tietojen kirjoittamiseksi tiedostoon.
	*
	* @param args Komentoriviargumentit
	* @exception IOException Otetaan poikkeus kiinni.
	*/
	public static void main(String[] args) throws IOException{
	
		// SUORITUSTIEDOSTO
	
		System.out.println("---- SUORITUKSET ----");
		System.out.println();
		
		// Kirjoitetaan suoritukset tiedostoon
		String tiedostoNimi2 = "suoritukset.txt";
		ObjectOutputStream suor = null;
		FileOutputStream suoritusTiedosto = null;
		
		try {

			suoritusTiedosto = new FileOutputStream(tiedostoNimi2);
			suor = new ObjectOutputStream(suoritusTiedosto);
			
			Suoritus suoritus = new Suoritus (215978, 378290, 5, "20211210");
			suor.writeObject(suoritus);
			suoritus = new Suoritus (218854, 374092, 4, "20211112");
			suor.writeObject(suoritus);
			suoritus = new Suoritus (219623, 370976, 2, "20211005");
			suor.writeObject(suoritus);
			suoritus = new Suoritus (215978, 370976, 4, "20211005");
			suor.writeObject(suoritus);
			suoritus = new Suoritus (215978, 374092, 3, "20211112");
			suor.writeObject(suoritus);
			suoritus = new Suoritus (219623, 378290, 5, "20211210");
			suor.writeObject(suoritus);
			
			suor.close ();
		}
		catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
		
		// Luetaan opiskelijoiden suoritukset linkitetyille listoille
		LinkedList<Suoritus> opiskSuoritusLista1 = new LinkedList<Suoritus>();
		LinkedList<Suoritus> opiskSuoritusLista2 = new LinkedList<Suoritus>();
		LinkedList<Suoritus> opiskSuoritusLista3 = new LinkedList<Suoritus>();
		
		// Luetaan kurssien suoritukset linkitetyille listoille
		LinkedList<Suoritus> kurssinSuoritusLista1 = new LinkedList<Suoritus>();
		LinkedList<Suoritus> kurssinSuoritusLista2 = new LinkedList<Suoritus>();
		LinkedList<Suoritus> kurssinSuoritusLista3 = new LinkedList<Suoritus>();
		
		FileInputStream suoritukset = null;
		ObjectInputStream suoritusIn = null;
		
		try {
            suoritukset = new FileInputStream(tiedostoNimi2);
            suoritusIn = new ObjectInputStream(suoritukset);
            Suoritus suoritus = null;
			
            for (int i = 0; i < 6; i++) {
				// Luetaan olio ja muunnetaan Suoritus-luokan olioksi
                suoritus = (Suoritus)suoritusIn.readObject();
                System.out.println(suoritus);
				
				if (suoritus.getOpiskelijaID() == 219623) {
					opiskSuoritusLista1.add(suoritus);
				}
				if (suoritus.getOpiskelijaID() == 215978) {
					opiskSuoritusLista2.add(suoritus);
				}
				if (suoritus.getOpiskelijaID() == 218854) {
					opiskSuoritusLista3.add(suoritus);
				}
				if(suoritus.getKurssiID() == 378290){
					kurssinSuoritusLista1.add(suoritus);
				}
				if(suoritus.getKurssiID() == 374092){
					kurssinSuoritusLista2.add(suoritus);
				}
				if(suoritus.getKurssiID() == 370976){
					kurssinSuoritusLista3.add(suoritus);
				}
            }
		} 
		catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
	
	
		// OPISKELIJATIEDOSTO
		
		System.out.println("\n");
		System.out.println("---- OPISKELIJAT ----");
		
		// Kirjoitetaan opiskelijat tiedostoon
		String tiedostoNimi = "Opiskelijat.txt";
		ObjectOutputStream opisk = null;
		FileOutputStream opiskTiedosto = null;
		
		try {

			opiskTiedosto = new FileOutputStream(tiedostoNimi);
			opisk = new ObjectOutputStream(opiskTiedosto);
			
			Opiskelija opiskelija = new Opiskelija (215978, "Pasi", "Kontkanen", "Kielotie 16a", "80230", "Joensuu", "pasi.kontkanen@gmail.com", "044-5748334");
			opisk.writeObject(opiskelija);
			opiskelija = new Opiskelija (218854, "Niko", "Kohonen", "Suvikatu 36 A 23", "80230", "Joensuu", "niko.kohonen@gmail.com", "050-2948377");
			opisk.writeObject(opiskelija);
			opiskelija = new Opiskelija (219623, "Sanni", "Niiranen", "Pohjoiskatu 12 b 9", "80230", "Joensuu", "sanni.niiranen@gmail.com", "040-4839775");
			opisk.writeObject(opiskelija);
			
			opisk.close ();
		}
		catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
		
		// Luetaan opiskelijoiden tiedot HashMapiin
		HashMap<Integer, Opiskelija> opiskelijaMap = new HashMap<Integer, Opiskelija>();
		
		FileInputStream opiskelijat = null;
		ObjectInputStream opiskelijatIn = null;
		
		try {
            opiskelijat = new FileInputStream(tiedostoNimi);
            opiskelijatIn = new ObjectInputStream(opiskelijat);
            Opiskelija opiskelijaOlio = null;
			
				for (int i = 0; i < 3; i++) {
				// Luetaan olio ja muunnetaan Opiskelija-luokan olioksi
                opiskelijaOlio = (Opiskelija)opiskelijatIn.readObject();
				
				if (opiskelijaOlio.getOpiskelijaID() == 215978) {
				opiskelijaMap.put(215978, opiskelijaOlio);
				}
				if (opiskelijaOlio.getOpiskelijaID() == 218854) {
				opiskelijaMap.put(218854, opiskelijaOlio);
				}
				if (opiskelijaOlio.getOpiskelijaID() == 219623) {
				opiskelijaMap.put(219623, opiskelijaOlio);
				}
				
				System.out.println(opiskelijaOlio);
            }
			
			// Tulostetaan opiskelijoiden suoritukset linkitetyiltä listoilta
			System.out.println("\n");
			System.out.println("---- OPISKELIJAN SUORITUKSET ----");
			System.out.println();
			
			System.out.println("Opiskelija Sanni Niirasen suoritukset: ");
			System.out.println();
		
			LinkedList<Suoritus> suoritus1 = opiskelijaOlio.getOpiskelijanSuoritukset(opiskSuoritusLista1);
			ListIterator<Suoritus> listIterator = suoritus1.listIterator();
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next() + " ");
			}
			
			System.out.println();
			System.out.println("Opiskelija Pasi Kontkasen suoritukset: ");
			System.out.println();
				
			LinkedList<Suoritus> suoritus2 = opiskelijaOlio.getOpiskelijanSuoritukset(opiskSuoritusLista2);
			listIterator = suoritus2.listIterator();
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next() + " ");
			}
			
			System.out.println();
			System.out.println("Opiskelija Niko Kohosen suoritukset: ");
			System.out.println();
		
			LinkedList<Suoritus> suoritus3 = opiskelijaOlio.getOpiskelijanSuoritukset(opiskSuoritusLista3);
			listIterator = suoritus3.listIterator();
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next() + " ");
			}
		} 
        catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
		
		
		// KURSSITIEDOSTO
		
		System.out.println("\n");
		System.out.println("--- KURSSIT ----");
		System.out.println();
		
		// Kirjoitetaan kurssit tiedostoon
		String tiedostoNimi1 = "kurssit.txt";
		ObjectOutputStream kurs = null;
		FileOutputStream kurssiTiedosto = null;
		
		try {
			
			kurssiTiedosto = new FileOutputStream(tiedostoNimi1);
			kurs = new ObjectOutputStream(kurssiTiedosto);
			
			Kurssi kurssi = new Kurssi (378290, "Olio-ohjelmointi", 5, "Kurssilla opiskellaan olio-ohjelmoinnin perusteita.");
			kurs.writeObject(kurssi);
			kurssi = new Kurssi (374092, "Tiedonhallinta ja SQL", 3, "Kurssilla opiskellaan SQL-kielen perusteita seka tietokannan hallintajarjestelmia.");
			kurs.writeObject(kurssi);
			kurssi = new Kurssi (370976, "Ohjelmistotuotanto 1", 4, "Kurssilla opiskellaan mm. vaatimustenhallintaa, elinkaarimalleja ja dokumentointia.");
			kurs.writeObject(kurssi);
			
			kurs.close ();
		}
		catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
		
		// Luetaan kurssien tiedot HashMapiin
		HashMap<Integer, Kurssi> kurssiMap = new HashMap<Integer, Kurssi>();
		
		FileInputStream kurssit = null;
		ObjectInputStream kurssitIn = null;
		
		try {
            kurssit = new FileInputStream(tiedostoNimi1);
            kurssitIn = new ObjectInputStream(kurssit);
            Kurssi kurssiOlio = null;
			
            for (int i = 0; i < 3; i++) {
				// Luetaan olio ja muunnetaan Kurssi-luokan olioksi
                kurssiOlio = (Kurssi)kurssitIn.readObject();
				
				if (kurssiOlio.getKurssiID() == 378290) {
				kurssiMap.put(378290, kurssiOlio);
				}
				if (kurssiOlio.getKurssiID() == 374092) {
				kurssiMap.put(374092, kurssiOlio);
				}
				if (kurssiOlio.getKurssiID() == 370976) {
				kurssiMap.put(370976, kurssiOlio);
				}

				System.out.println(kurssiOlio);
            }
			
		// Tulostetaan kurssin suoritukset linkitetyiltä listoilta
		System.out.println();
		System.out.println("---- KURSSIN SUORITUKSET ----");
		System.out.println();
		
		System.out.println("Olio-ohjelmointi -kurssin suoritukset:");
		System.out.println();
		
		LinkedList<Suoritus> kurssiSuoritus1 = kurssiOlio.getKurssinSuoritukset(kurssinSuoritusLista1);
		ListIterator<Suoritus> listIterator = kurssiSuoritus1.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next() + " ");
		}
		
		System.out.println();
		System.out.println("Tiedonhallinta ja SQL -kurssin suoritukset:");
		System.out.println();
		
		LinkedList<Suoritus> kurssiSuoritus2 = kurssiOlio.getKurssinSuoritukset(kurssinSuoritusLista2);
		listIterator = kurssiSuoritus2.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next() + " ");
		}
		
		System.out.println();
		System.out.println("Ohjelmistotuotanto 1 -kurssin suoritukset:");
		System.out.println();
		
		LinkedList<Suoritus> kurssiSuoritus3 = kurssiOlio.getKurssinSuoritukset(kurssinSuoritusLista3);
		listIterator = kurssiSuoritus3.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next() + " ");
		}
		
		// Tulostetaan kurssien opiskelijat ja heidän arvosanansa
		System.out.println("\n");
		System.out.println("---- KURSSIEN OPISKELIJAT JA ARVOSANAT----");
		System.out.println();
		
		HashMap <Integer, Opiskelija> kurssinOpiskelijat = kurssiOlio.getKurssinOpiskelijat(opiskelijaMap);
		
		System.out.println("Olio-ohjelmointi -kurssin opiskelijat:");
		System.out.println(kurssinOpiskelijat.get(215978));
		System.out.println(kurssinOpiskelijat.get(219623));
		System.out.println();
		
		System.out.println("Kurssin arvosanat:");
		LinkedList<Suoritus> kurssi1 = new LinkedList<Suoritus>(kurssinSuoritusLista1);
		for (int i = 0; i < kurssi1.size(); i++) {
			Suoritus olio1 = kurssi1.get(i);
			System.out.println("Opiskelijanumero: " + olio1.getOpiskelijaID() + " Arvosana: " + olio1.getArvosana());
		}
		
		System.out.println("\n");
		System.out.println("Tiedonhallinta ja SQL -kurssin opiskelijat:");
		System.out.println(kurssinOpiskelijat.get(218854));
		System.out.println(kurssinOpiskelijat.get(215978));
		System.out.println();
		
		System.out.println("Kurssin arvosanat:");
		LinkedList<Suoritus> kurssi2 = new LinkedList<Suoritus>(kurssinSuoritusLista2);
		for (int i = 0; i < kurssi2.size(); i++) {
			Suoritus olio2 = kurssi2.get(i);
			System.out.println("Opiskelijanumero: " + olio2.getOpiskelijaID() + " Arvosana: " + olio2.getArvosana());
		}
		
		System.out.println("\n");
		System.out.println("Ohjelmistotuotanto 1 -kurssin opiskelijat:");
		
		System.out.println(kurssinOpiskelijat.get(219623));
		System.out.println(kurssinOpiskelijat.get(215978));
		System.out.println();
		
		System.out.println("Kurssin arvosanat:");
		LinkedList<Suoritus> kurssi3 = new LinkedList<Suoritus>(kurssinSuoritusLista3);
		for (int i = 0; i < kurssi3.size(); i++) {
			Suoritus olio3 = kurssi3.get(i);
			System.out.println("Opiskelijanumero: " + olio3.getOpiskelijaID() + " Arvosana: " + olio3.getArvosana());
		}
		
		} 
        catch (IOException ioe) {
           ioe.printStackTrace ();
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
    }
}