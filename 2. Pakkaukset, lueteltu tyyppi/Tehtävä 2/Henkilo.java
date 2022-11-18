/**
 * Luokka henkilön tietojen luomiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/14
 */
public class Henkilo {

	/** 
	* Attribuutit
	* 
	* @param nimi Henkilön nimi
	* @param osoite Henkilön osoite
	* @param ika Henkilön ikä
	* @param pNum Henkilön puhelinnumero
	*/
	private String nimi;
	private String osoite;
	private String ika;
	private String pNum;
	
	/** Oletuskonstruktori */
	protected Henkilo(){
		
	}
	
	/**
     * Konstruktori luo Henkilo-olion.
	 *
     * @param nimi Henkilön nimi
	 * @param osoite Henkilön osoite
	 * @param ika Henkilön ikä
	 * @param pNum Henkilön puhelinnumero
     */
	protected Henkilo(String uusiNimi, String uusiOsoite, String uusiIka, String uusipNum){
		this.nimi = uusiNimi;
		this.osoite = uusiOsoite;
		this.ika = uusiIka;
		this.pNum = uusipNum;
	}
	
	/**
	 * Metodi asettaa henkilön nimen.
	 *
	 * @param nimi Henkilön nimi
	 */
	protected void setNimi (String uusiNimi) {
		this.nimi = nimi;
	}
	
	/**
	 * Metodi asettaa henkilön osoitteen.
	 *
	 * @param osoite Henkilön osoite
	 */
	protected void setOsoite (String uusiOsoite) {
		this.osoite = osoite;
	}
	
	/**
	 * Metodi asettaa henkilön iän.
	 *
	 * @param ika Henkilön ikä
	 */
	protected void setIka (String uusiIka) {
		this.ika = ika;
	}
	
	/**
	 * Metodi asettaa henkilön puhelinnumeron.
	 *
	 * @param pNum Henkilön puhelinnumero
	 */
	protected void setPuhNum (String uusipNum) {
		this.pNum = pNum;
	}
	
	/** 
	* Metodi palauttaa henkilön nimen.
	*	
	* @return nimi
	*/
	protected String getNimi () {
		return nimi;
	}
	
	/** 
	* Metodi palauttaa henkilö osoitteen.
	*	
	* @return osoite
	*/
	protected String getOsoite () {
		return osoite;
	}
	
	/** 
	* Metodi palauttaa henkilön iän.
	*	
	* @return ika
	*/
	protected String getIka () {
		return ika;
	}
	
	/** 
	* Metodi palauttaa henkilön puhelinnumeron.
	*	
	* @return pNum 
	*/
	protected String getPuhNum () {
		return pNum;
	}
	
	/**
	* Metodi luo uuden Henkilo-olion, joka saa kopioitavan olion tiedot 
	* ja palauttaa luodun olion.
	*
	* @return kopio
	*/
	protected Henkilo copy(){
		
		Henkilo kopio = new Henkilo(nimi, osoite, ika, pNum);
		
		return kopio;
	}
	
	/**
	* Metodi vertaa Henkilo-luokan olioita. 
	* Oliot ovat samat jos niiden kaikki tiedot ovat samat.
	*
	* @return True, jos oliot ovat samat. False, jos oliot eivät ole samat.
	*/
	public boolean equals(Object verrattava){
		
		Henkilo verrattavaHenkilo = (Henkilo) verrattava;
		if (this.nimi.equals(verrattavaHenkilo.getNimi()) 
			&& this.osoite.equals(verrattavaHenkilo.getOsoite()) 
			&& this.ika.equals(verrattavaHenkilo.getIka()) 
			&& this.pNum.equals(verrattavaHenkilo.getPuhNum())){
			
			System.out.println("Vertailtavien olioiden tiedot ovat samat.");
			return true;
		}
		
		System.out.println("Vertailtavien olioiden tiedot eivät ole samat.");
		return false;
		
	}
	
	/**
	* Metodi palauttaa tiedot Henkilö-oliosta.
	*
	* @return Henkilo-olion tiedot
	*/
	public String toString(){
		return getNimi() + " " + getOsoite() + " " + getIka() + " " + getPuhNum();
	}
}