import java.util.ArrayList;

/**
* Ohjelma käsittelee Laiva-, RisteilyAlus- ja Tankkeri-luokkien olioita taulukossa.
*/
public class LaivaDemo{

	/** Ohjelma luo Laiva-, RisteilyAlus- ja Tankkeri-luokista oliot, 
	* käy taulukon läpi ja tulostaa olioiden tiedot.
	*/
	public static void main (String[] args){
		
		Laiva [] alukset = new Laiva [3];
		
		Laiva ekaLaiva = new Laiva("Aallotar", 1965);
		Laiva ekaRisteilyAlus = new RisteilyAlus ("Pohjanneito", 1934, 1500);
		Laiva ekaTankkeri = new Tankkeri("Tankki", 1989, 1200);
		
		alukset [0] = ekaLaiva;
		alukset [1] = ekaRisteilyAlus;
		alukset [2] = ekaTankkeri;
		
		for(Laiva alus: alukset){
			System.out.println(alus);
		}
	}
}