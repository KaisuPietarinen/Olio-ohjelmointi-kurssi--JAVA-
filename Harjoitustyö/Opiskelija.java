import java.util.*;
import java.io.*;
import java.lang.*;

/**
* Luokka opiskelija-olioiden luomiseen ja olion tietojen tulostamiseen.
* <p>
* Harjoitustyö, Olio-ohjelmointi-kurssi 2021.
* <p>
* @author Kaisu Pietarinen
* @version 1.00 2021/12/8
*/
public class Opiskelija implements Serializable{

	/**
	* Opiskelijan opiskelijanumero.
	* @serial opiskelija_id
	*/
	protected int opiskelija_id;
	
	/**
	* Opiskelijan etunimi.
	* @serial etunimi
	*/
	protected String etunimi;
	
	/**
	* Opiskelijan sukunimi.
	* @serial sukunimi
	*/
	protected String sukunimi;
	
	/**
	* Opiskelijan lähiosoite.
	* @serial lahiosoite
	*/
	protected String lahiosoite;
	
	/**
	* Opiskelijan lähiosoitteen postitoimipaikka.
	* @serial postitoimipaikka
	*/
	protected String postitoimipaikka;
	
	/**
	* Opiskelijan postitoimipaikan postinumero.
	* @serial postinro
	*/
	protected String postinro;
	
	/**
	* Opiskelijan sähköpostiosoite.
	* @serial email
	*/
	protected String email;
	
	/**
	* Opiskelijan puhelinumero.
	* @serial puhelinnro
	*/
	protected String puhelinnro;
	
	/**
	* Opiskelijan suoritukset.
	* @serial suoritus
	*/
	protected LinkedList<Suoritus> suoritus = new LinkedList <Suoritus>();
		
		
	/** Oletuskonstruktori */
	protected Opiskelija(){
		
	}
	
	/**
	* Konstruktori luo opiskelija-olion.
	*
	* @param opiskelija_id Opiskelijan opiskelijanumero.
	* @param etunimi Opiskelijan etunimi.
	* @param sukunimi Opiskelijan sukunimi.
	* @param lahiosoite Opiskelijan lähiosoite.
	* @param postitoimipaikka Lähiosoitteen postitoimipaikka.
	* @param postinro Postitoimipaikan postinumero.
	* @param email Opiskelijan sähköpostiosoite.
	* @param puhelinnro Opiskelijan puhelinnumero.
	*/
	protected Opiskelija(int opiskelija_id,String etunimi, String sukunimi, String lahiosoite, String postitoimipaikka, String postinro, String email, String puhelinnro){
		this.opiskelija_id = opiskelija_id;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.lahiosoite = lahiosoite;
		this.postitoimipaikka = postitoimipaikka;
		this.postinro = postinro;
		this.email = email;
		this.puhelinnro = puhelinnro;
	}
	
	/**
	* Metodi asettaa opiskelijan opiskelijanumeron.
	*
	* @param opiskelija_id Opiskelijan opiskelijanumero.
	*/
	protected void setOpiskelija_id(int opiskelija_id){
		this.opiskelija_id = opiskelija_id;
	}
	
	/**
	* Metodi asettaa opiskelijan etunimen.
	*
	* @param etunimi Opiskelijan etunimi.
	*/
	protected void setEtunimi(String etunimi){
		this.etunimi = etunimi;
	}
	
	/**
	* Metodi asettaa opiskelijan sukunimen.
	*
	* @param sukunimi Opiskelijan sukunimi.
	*/
	protected void setSukunimi(String sukunimi){
		this.sukunimi = sukunimi;
	}
	
	/**
	 * Metodi asettaa opiskelijan lähiosoiteen.
	 *
	 * @param lahiosoite Opiskelijan lähiosoite.
	 */
	protected void setLahiosoite(String lahiosoite){
		this.lahiosoite = lahiosoite;
	}
	
	/**
	 * Metodi asettaa lähiosoitteen postitoimipaikan.
	 *
	 * @param postitoimipaikka Lähiosoitteen postitoimipaikka.
	 */
	protected void setPostitoimipaikka(String postitoimipaikka){
		this.postitoimipaikka = postitoimipaikka;
	}
	
	/**
	* Metodi asettaa postitoimipaikan postinumeron.
	*
	* @param postinro Postitoimipaikan postinumeron.
	*/
	protected void setPostinro(String postinro){
		this.postinro = postinro;
	}
	
	/**
	* Metodi asettaa opiskelijan sähköpostiosoiteen.
	*
	* @param email Opiskelijan sähköpostiosoite.
	*/
	protected void setEmail(String email){
		this.email = email;
	}
	
	/**
	* Metodi asettaa opiskelijan puhelinnumeron.
	*
	* @param puhelinnro Opiskelijan puhelinnumero.
	*/
	protected void setPuhelinnro(String puhelinnro){
		this.puhelinnro = puhelinnro;
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
	* Metodi palauttaa opiskelijan etunimen.
	*	
	* @return Opiskelijan etunimen.
	*/
	protected String getEtunimi(){
		return etunimi;
	}
	
	/** 
	* Metodi palauttaa opiskelijan sukunimen.
	*	
	* @return Opiskelijan sukunimen.
	*/
	protected String getSukunimi(){
		return sukunimi;
	}
	
	/** 
	* Metodi palauttaa opiskelijan lähiosoitteen.
	*	
	* @return Opiskelijan lähiosoitteen.
	*/
	protected String getLahiosoite(){
		return lahiosoite;
	}
	
	/** 
	* Metodi palauttaa opiskelijan lähiosoitteen postitoimipaikan.
	*	
	* @return Opiskelijan lähiosoitteen postitoimipaikan. 
	*/
	protected String getPostitoimipaikka(){
		return postitoimipaikka;
	}
	
	/** 
	* Metodi palauttaa opiskelijan postitoimipaikan postinumeron.
	*	
	* @return Opiskelijan postitoimipaikan postinumeron.
	*/
	protected String getPostinro(){
		return postinro;
	}
	
	/** 
	* Metodi palauttaa opiskelijan sähköpostiosoitteen.
	*	
	* @return Opiskelijan sähköpostiosoitteen.
	*/
	protected String getEmail(){
		return email;
	}
	
	/** 
	* Metodi palauttaa opiskelijan puhelinnumeron.
	*	
	* @return Opiskelijan puhelinnumeron.
	*/
	protected String getPuhelinnro(){
		return puhelinnro;
	}
	
	/** 
	* Metodi palauttaa kokoelman opiskelijan suorituksista.
	*
	* @param opiskSuoritukset Opiskelijan suoritukset.
	* @return Kokoelma opiskelijan suorituksista.
	*/
	protected LinkedList<Suoritus> getOpiskelijanSuoritukset(LinkedList<Suoritus> opiskSuoritukset) {
		return opiskSuoritukset;
		
	}
	
	/**
	* Metodi palauttaa opiskelija-olion tiedot.
	*
	* @return Opiskelija-olion tiedot.
	*/
	public String toString(){
		return "\nOpiskelijanumero: " + getOpiskelijaID() + "\nEtunimi: " + etunimi + "\nSukunimi: "  + sukunimi + "\nOsoite: " + lahiosoite + " " + postitoimipaikka + " " + postinro + "\nSahkoposti: " + email + "\nPuhelinnumero: " + puhelinnro;
	}
}