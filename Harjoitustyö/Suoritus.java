import java.io.*;
import java.lang.*;
import java.util.*;

/**
* Luokka suoritus-olioiden luomiseen ja olion tietojen tulostamiseen.
* <p>
* Harjoitustyö, Olio-ohjelmointi-kurssi 2021.
* <p>
* @author Kaisu Pietarinen
* @version 1.00 2021/12/8
*/
public class Suoritus implements Serializable{

	/**
	* Opiskelijan opiskelijanumero.
	* @serial opiskelija_id
	*/
	protected int opiskelija_id;
	
	/**
	* Kurssin kurssinumero.
	* @serial kurssi_id
	*/
	protected int kurssi_id;
	
	/**
	* Suorituksen arvosana.
	* @serial arvosana
	*/
	protected int arvosana;
	
	/**
	* Suorituksen päivämäärä.
	* @serial suoritus_pvm
	*/
	protected String suoritus_pvm;
		
		
	/** Oletuskonstruktori */
	protected Suoritus(){
		
	}
	
	/**
	* Konstruktori luo suoritus-olion.
	*
	* @param opiskelija_id Opiskelijan opiskelijanumero.
	* @param kurssi_id Kurssin kurssinumero.
	* @param arvosana Kurssin arvosana.
	* @param suoritus_pvm Suorituksen päivämäärä (vvvvkkpp).
	*/
	protected Suoritus(int opiskelija_id, int kurssi_id, int arvosana, String suoritus_pvm){
		this.opiskelija_id = opiskelija_id;
		this.kurssi_id = kurssi_id;
		this.arvosana = arvosana;
		this.suoritus_pvm = suoritus_pvm;
	}
	
	/**
	 * Metodi asettaa opiskelijan opiskelijanumeron.
	 *
	 * @param opiskelija_id Opiskelijan opiskelijanumero.
	 */
	protected void setOpiskelijaID(int opiskelija_id){
		this.opiskelija_id = opiskelija_id;
	}
	
	/**
	* Metodi asettaa kurssin kurssinumeron.
	*
	* @param kurssi_id Kurssin kurssinumero.
	*/
	protected void setKurssiID(int kurssi_id){
		this.kurssi_id = kurssi_id;
	}
	
	/**
	* Metodi asettaa kurssin arvosanan.
	*
	* @param arvosana Kurssin arvosana.
	*/
	protected void setArvosana(int arvosana){
		this.arvosana = arvosana;
	}
	
	/**
	* Metodi asettaa suorituksen päivämäärän.
	*
	* @param suoritus_pvm Suorituksen päivämäärä.
	*/
	protected void setSuoritusPvm(String suoritus_pvm){
		this.suoritus_pvm = suoritus_pvm;
	}
	
	/** 
	* Metodi palauttaa opiskelijan opiskelijanumeron.
	*	
	* @return Opiskelijan opiskelijanumeron.
	*/
	protected int getOpiskelijaID(){
		return opiskelija_id;
	}
	
	/** 
	* Metodi palauttaa kurssin kurssinumeron.
	*	
	* @return Kurssin kurssinumeron.
	*/
	protected int getKurssiID(){
		return kurssi_id;
	}
	
	/** 
	* Metodi palauttaa kurssin arvosanan.
	*	
	* @return Kurssin arvosanan.
	*/
	protected int getArvosana(){
		return arvosana;
	}
	
	/** 
	* Metodi palauttaa suorituksen päivämäärän.
	*	
	* @return Suorituksen päivämäärän.
	*/
	protected String getSuoritusPvm(){
		return suoritus_pvm;
	}
	
	/**
	* Metodi palauttaa suoritus-olion tiedot.
	*
	* @return Suoritus-olion tiedot.
	*/
	public String toString(){
		return "Opiskelijanumero: " + getOpiskelijaID() + " Kurssinumero: " + kurssi_id + " Arvosana: "  + arvosana + " Suorituspvm: " + suoritus_pvm;
	}
}