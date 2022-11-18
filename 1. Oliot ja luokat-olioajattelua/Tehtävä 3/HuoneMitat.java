/**
 * @(#)HuoneMitat.java
 *
 * Luokka huoneen pinta-alan laskemiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */ 

 /** Luokka huoneen pinta-alan laskemiseen. */
public class HuoneMitat {
	
	/** Attribuutit */
	double leveys;
	double korkeus;
	
	/** Oletuskonstruktori*/
	public HuoneMitat(){
		
	}
	
	/** Konstruktori*/
	public HuoneMitat(double uusiLeveys, double uusiKorkeus){
		leveys = uusiLeveys;
		korkeus = uusiKorkeus;
		
	}
	
	/** Laskee huoneen pinta-alan*/
	public double pintaAla(){
		return leveys * korkeus;
	}
	
	/** Palauttaa merkkijonon ja huoneen pinta-alan*/
	public String toString(){
		return "Huoneen pinta-ala: " + pintaAla();
		
		
	}
}