/**
 * @(#)Teos.java
 *
 * Luokka teoksen tietojen luomiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */ 

public class Teos {
	
	/** Attribuutit */
	String tekija; 
	String nimi;
	String genre;
	String ISBN;
	int sivumaara;
	String tila;

	/** Oletuskonstruktori*/
	public Teos () {
	
	}
	
	/** Konstruktori*/
	public Teos (String uusiTekija, String uusiNimi, String uusiGenre, String uusiISBN, int uusiSivumaara, String uusiTila){
		tekija = uusiTekija;
		nimi = uusiNimi;
		genre = uusiGenre;
		ISBN = uusiISBN;
		sivumaara = uusiSivumaara;
		tila = uusiTila;
		
	}		
	
	/** Asettaa teoksen tilan */
	public void setTila (String uusiTila){
		tila = uusiTila;
		
	}
	
	/** Palauttaa teoksen tilan */
	public String getTila(){
		return tila;
	
	}
	
	/** Palauttaa merkkijonot ja teoksen tiedot*/
	public String toString (){
		return "Tekija: " + tekija + "\n" + "Teoksen nimi: " + nimi + "\n" + "Genre: " + genre + "\n" + "ISBN: " + ISBN + "\n" + "Sivumaara: " + sivumaara + "\n" + "Tila: " + getTila() + "\n";
	
	}
}