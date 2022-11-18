import java.io.*;
import java.lang.*;
import java.util.*;

/**
* Luokka kurssi-olioiden luomiseen ja olion tietojen tulostamiseen.
* <p>
* Harjoitustyö, Olio-ohjelmointi-kurssi 2021.
* <p>
* @author Kaisu Pietarinen
* @version 1.00 2021/12/8
*/
public class Kurssi implements Serializable{

	/**
	* Kurssin kurssinumero.
	* @serial kurssi_id
	*/
	protected int kurssi_id;
	
	/**
	* Kurssin nimi.
	* @serial nimi
	*/
	protected String nimi;
	
	/**
	* Kurssin opintopisteet.
	* @serial opintopisteet
	*/
	protected int opintopisteet;
	
	/**
	* Kurssin kuvaus.
	* @serial kuvaus
	*/
	protected String kuvaus;
	
	/**
	* Kokoelma kurssin suorituksista.
	* @serial suoritukset
	*/
	protected LinkedList<Suoritus> suoritukset = new LinkedList<Suoritus>();
	
	/**
	* Kokoelma opiskelijoista.
	* @serial opiskelijat
	*/
	protected HashMap<Integer, Opiskelija> opiskelijat = new HashMap<Integer, Opiskelija>(); 
	
	
	/** Oletuskonstruktori */
	protected Kurssi(){
		
	}
	
	/**
	* Konstruktori luo kurssi-olion.
	*
	* @param kurssi_id Kurssin kurssinumero.
	* @param nimi Kurssin nimi.
	* @param opintopisteet Kurssin opintopisteet.
	* @param kuvaus Kurssin kuvaus.
	*/
	protected Kurssi(int kurssi_id, String nimi, int opintopisteet, String kuvaus){
		this.kurssi_id = kurssi_id;
		this.nimi = nimi;
		this.opintopisteet = opintopisteet;
		this.kuvaus = kuvaus;
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
	* Metodi asettaa kurssin nimen.
	*
	* @param nimi Kurssin nimi.
	*/
	protected void setNimi(String nimi){
		this.nimi = nimi;
	}
	
	/**
	* Metodi asettaa kurssin opintopisteet.
	*
	* @param opintopisteet Kurssin opintopisteet.
	*/
	protected void setOpintopisteet(int opintopisteet){
		this.opintopisteet = opintopisteet;
	}
	
	/**
	* Metodi asettaa kurssin kuvauksen.
	*
	* @param kuvaus Kurssin kuvaus.
	*/
	protected void setKuvaus(String kuvaus){
		this.kuvaus = kuvaus;
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
	* Metodi palauttaa kurssin nimen.
	*	
	* @return Kurssin nimen.
	*/
	protected String getNimi(){
		return nimi;
	}
	
	/** 
	* Metodi palauttaa kurssin opintopisteet.
	*	
	* @return Kurssin opintopisteet.
	*/
	protected int getOpintopisteet(){
		return opintopisteet;
	}
	
	/** 
	* Metodi palauttaa kurssin kuvauksen.
	*	
	* @return Kurssin kuvaus.
	*/
	protected String getKuvaus(){
		return kuvaus;
	}
	
	/** 
	* Metodi palauttaa kokoelman kurssin suorituksista.
	*	
	* @param suoritukset Opiskelijan suoritukset.
	* @return Kokoelma kurssin suorituksista.
	*/
	protected LinkedList<Suoritus> getKurssinSuoritukset(LinkedList<Suoritus> suoritukset){
		return suoritukset;
	}
	
	/** 
	* Metodi palauttaa kokoelman opiskelijoista.
	*
	* @param opiskelijat Opiskelijat.
	* @return Kokoelma opiskelijoista.
	*/
	protected HashMap <Integer, Opiskelija> getKurssinOpiskelijat(HashMap <Integer, Opiskelija> opiskelijat){
		return opiskelijat;
	}
	
	/**
	* Metodi palauttaa kurssi-olion tiedot.
	*
	* @return Kurssi-olion tiedot.
	*/
	public String toString(){
		return "Kurssinumero: " + kurssi_id + "\nKurssin nimi: " + nimi + " "  + opintopisteet + "op \n" + "Kurssin kuvaus: " + kuvaus + "\n";
	}
}