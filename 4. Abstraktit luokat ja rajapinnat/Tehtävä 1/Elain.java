/**
 * Abstrakti luokka eläimen tietojen luomiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/17
 */
public abstract class Elain {

	/**
	* Attribuutit
	*
	* @param nimi Eläimen nimi
	* @param elossa Onko eläin elossa vai kuollut.
	*/
	protected String nimi;
	protected String elossa;
	
	/** Oletuskonstruktori */
	protected Elain(){
		
	}
	
	/**
	* Konstruktori luo Eläin-olion
	*
	* @param nimi Eläimen nimi
	* @param elossa Onko eläin elossa vai kuollut
	*/
	protected Elain(String uusiNimi, String uusiElossa){
		this.nimi = uusiNimi;
		this.elossa = uusiElossa;
		
	}
	
	/**
	 * Metodi asettaa eläimen nimen.
	 *
	 * @param nimi Eläimen nimi
	 */
	public void setNimi (String uusiNimi) {
		this.nimi = uusiNimi;
	}
	
	/**
	 * Metodi asettaa eläimen eläväksi tai kuolleeksi.
	 *
	 * @param elossa Onko eläin elossa vai kuollut
	 */
	public void setElossa (String uusiElossa) {
		this.elossa = uusiElossa;
	}
	
	/** 
	* Metodi palauttaa eläimen nimen.
	*	
	* @return nimi
	*/
	public String getNimi() {
		return nimi;
	}
	
	/** 
	* Metodi palauttaa onko eläin elossa vai kuollut.
	*	
	* @return elossa
	*/
	public String getElossa() {
		return elossa;
	}
	
	/** Abstrakti metodi toteutettavaksi perivissä luokissa.*/
	public abstract void puhu();
}