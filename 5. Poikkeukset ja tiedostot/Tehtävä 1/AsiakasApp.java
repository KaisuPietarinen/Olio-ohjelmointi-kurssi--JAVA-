import java.util.Scanner;

/**
* Ohjelma luo kaksi asiakasta, joiden tiedot tallennetaan tiedostoon. 
* Molempien asiakkaiden tiedot tulostetaan ja käyttäjä voi tulostaa 
* halutun asiakkaan tiedot asiakasnumeron perusteella.
*
* Sisältää tehtävät 1 ja 2.
*/
public class AsiakasApp{
	
	/** 
	* Asiakas-olioiden luominen, olioiden tietojen tallentaminen tiedostoon ja 
	* kaikkien olioiden sekä halutun olion tietojen tulostaminen. */
	public static void main(String[] args) throws Exception{

	// TEHTÄVÄ 1

	Asiakas ekaAsiakas = new Asiakas("1", "Tino Torni",  "TT@gmail.com", "12345");
	ekaAsiakas.kirjoitetaan("Asiakkaat.txt");
	
	Asiakas tokaAsiakas = new Asiakas("2", "Andy Ant", "AA@luukku.com", "56789");
	tokaAsiakas.kirjoitetaan("Asiakkaat.txt");
	
	// TEHTÄVÄ 2
	
	String tulos = Asiakas.luetaan("Asiakkaat.txt");
	System.out.println(tulos);
	
	System.out.println("Anna etsittava ID:");
	Scanner lukija = new Scanner(System.in);
	String etsiId = lukija.nextLine();

    Asiakas.etsitaan(etsiId);
	
	}
}