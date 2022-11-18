/**
 * @(#)Hahmoluokka.java
 *
 * Luokka hahmon tietojen luomiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */ 

/** Tuodaan Javan kirjastot käyttöön.*/
import java.util.*; 

 /** Luokka hahmon tietojen luomiseen. */
public class Hahmoluokka {
	
	/** Attribuutit */
	String rooli;
	int taso;
	String taidot;
	
	/** Oletuskonstruktori*/
	public Hahmoluokka(){
		
	}
	
	/** Konstruktori*/
	public Hahmoluokka(String uusiRooli, int uusiTaso, String uusiTaidot){
		rooli = uusiRooli;
		taso = uusiTaso;
		taidot = uusiTaidot;
	}
	
	/** Palauttaa merkkijonot ja hahmoon liittyvät tiedot*/
	public String toString(){
		return "Rooli: " + rooli + "\n" + "Taso: " + taso + "\n" + "Taidot: " + taidot;
	
	}
}
