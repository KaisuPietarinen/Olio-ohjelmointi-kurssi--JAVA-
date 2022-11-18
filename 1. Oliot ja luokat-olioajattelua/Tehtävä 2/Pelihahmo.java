/**
 * @(#)Pelihahmo.java
 *
 * Luokka pelihahmon luomiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */ 

 /** Luokka pelihahmon luomiseen. */
public class Pelihahmo {
	
	/** Attribuutit */
	String nimi;
	Hahmoluokka hahmoTiedot;
	String sukupuoli;
	int ika;
	Ase aseTiedot;
	
	/** Oletuskonstruktori*/
	public Pelihahmo(){
		
	}
	
	/** Konstruktori*/
	public Pelihahmo (String uusiNimi, String uusiSukupuoli, int uusiIka, String rooli, int taso, String taidot, String tyyppi, int vahinko, int bonus){
		nimi = uusiNimi;
		hahmoTiedot = new Hahmoluokka(rooli, taso, taidot);
		sukupuoli = uusiSukupuoli;
		ika = uusiIka;
		aseTiedot = new Ase(tyyppi, vahinko, bonus);
		
	}
	
	/** Palauttaa merkkijonot ja pelihahmon tiedot*/
	public String toString(){
		return "Nimi: " + nimi + "\n" + "Sukupuoli: " + sukupuoli + "\n" + "Ika: " + ika + "\n" + "\n" + 
				"Hahmoluokka " + "\n" + hahmoTiedot + "\n" + "\n" + "Ase " + "\n" + aseTiedot;
	}
}