/**
 * @(#)HuoneTapetti.java
 *
 * Luokka tapetoinnin hinnan laskemiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */ 

 /** Luokka tapetoinnin hinnan laskemiseen. */
public class HuoneTapetti {

	/** Attribuutit */
	HuoneMitat mitat;
	double tapettiHinta;
	
	/** Oletuskonstruktori */
	public HuoneTapetti(){
		
	}
	
	/** Kontruktori */
	public HuoneTapetti(double leveys, double korkeus, double uusiTapettiHinta){
		mitat = new HuoneMitat(leveys, korkeus);
		tapettiHinta = uusiTapettiHinta;
		
	}	
	
	/** Asettaa tapetin hinnan */
	public void setHinta(double uusiTapettiHinta){
		tapettiHinta = uusiTapettiHinta;
		
	}
	
	/** Palauttaa tapetin hinnan */
	public double getHinta(){
		return tapettiHinta;
		
	}
	
	/** laskee tapetoinnin hinnan*/ 
	public double TapetinHinta(){
		return mitat.pintaAla() * tapettiHinta;
		
	}
	
	/** palauttaa merkkijonon ja tapetoinnin hinnan */
	public String toString(){
		return "Tapetoinnin hinta: " + TapetinHinta() + " euroa.";
		
	}
}