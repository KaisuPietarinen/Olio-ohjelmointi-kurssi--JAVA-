/**
 * Luokka toteuttaa Nimeava rajapinnan.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/21
 */
public class Henkilo implements Nimeava{
	
	/**
	* Atrribuutit
	* 
	* @param n Henkilön nimi
	*/
	protected String n;
	
	/** Oletuskonstruktori */
	protected Henkilo(){
		
	}
	
	/**
	* Konstruktori luo Henkilö-olion
	*
	* @param n Henkilön nimi
	*/
	protected Henkilo(String uusiN){
		this.n = uusiN;
	}
	
	/**
	 * Metodi toteuttaa rajapinnan setMetodin 
	 * ja asettaa henkilön nimen.
	 *
	 * @param n Henkilön nimi
	 */
	public void setNimi (String uusiN) {
		this.n = uusiN;
		
	}
	
	/** 
	* Metodi toteuttaa rajapinnan getMetodin
	* ja palauttaa henkilön nimen.
	*	
	* @return n
	*/
	public String getNimi() {
		return n;
	}
	
	/**
	* Metodi palauttaa Henkilö-olion nimen.
	*
	* @return Henkilo-olion nimi
	*/
	public String toString(){
		return getNimi();
	}
}