/**
 * Luokka kissan tietojen luomiseen.
 * Luokka perii tietoja Eläin-luokasta.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/17
 */
public class Kissa extends Elain{

	/**
	* Atrribuutit
	* 
	* @param elamia Kissan elämien lukumäärä
	*/
	protected int elamia;
	protected int vahenee;
	
	/** Oletuskonstruktori */
	protected Kissa(){
		super();
	}
	
	/**
	* Konstruktori luo kissa-olion
	*
	* @param nimi Kissan nimi
	* @param elossa Onko kissa elossa vai kuollut
	* @param elamia Kissan elämien lukumäärä
	*/
	protected Kissa(String nimi, String elossa, int uusiElamia, int uusiVahenee){
		super(nimi, elossa);
		this.elamia = uusiElamia;
		this.vahenee = uusiVahenee;
	}
	
	/**
	 * Metodi asettaa kissan eläväksi tai kuolleeksi.
	 *
	 * @param elossa Onko kissa elossa vai kuollut
	 */
	protected void setElamia (int uusiElamia) {
		this.elamia = uusiElamia;
		
	}
	
	/** 
	* Metodi palauttaa kissan elamien lukumäärän.
	*	
	* @return elamia
	*/
	protected int getElamia() {
		return elamia;
	}
	
	/**
	* Metodi asettaa lukumäärän, kuinka paljon kissan elämät vähenevät.
	* 
	* @param vahenee Kuinka paljon kissan elamat vahenevat
	*/
	protected void setVahenee(int uusiVahenee){
		this.vahenee = vahenee;
	}
	
	/**
	* Metodi palauttaa lukumäärän, kuinka paljon kissan elämät vähenevät.
	* 
	* @return vahenee
	*/
	protected int getVahenee() {
		return vahenee;
	}
	
	/**
	* Metodi palauttaa kissan jäljellä olevien elämien lukumäärän.
	*
	* @ return jaljella
	*/
	protected String Jaljella(){
		int lkm = elamia - vahenee;
		String jaljella = "Kissalla on jaljella enaa " + lkm + " elamaa.";
		return jaljella;
	}
	
	/**
	 * Metodi palauttaa tiedot kissa-oliosta.
	 *
	 * @return kissa-olion tiedot
	 */
	public String toString(){
		return getNimi() + " kissa on " + getElossa() + " ja silla on " + getElamia() + " elamaa, joista vahennetaan " + getVahenee() + " elamaa.";
	}
}