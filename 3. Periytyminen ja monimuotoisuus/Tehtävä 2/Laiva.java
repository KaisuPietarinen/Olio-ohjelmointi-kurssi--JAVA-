/**
 * Luokka laivan tietojen luomiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/17
 */
public class Laiva {

	/**
	* Attribuutit
	*
	* @param nimi Laivan nimi
	* @param vuosi Laivan rakennusvuosi
	*/
	protected String nimi;
	protected int vuosi;
	
	/** Oletuskonstruktori */
	protected Laiva(){
		
	}
	
	/**
	* Konstruktori luo Laiva-olion.
	*
	* @param nimi Laivan nimi
	* @param vuosi Laivan rakennusvuosi
	*/
	protected Laiva(String uusiNimi, int uusiVuosi){
		this.nimi = uusiNimi;
		this.vuosi = uusiVuosi;
		
	}
	
	/**
	 * Metodi asettaa laivan nimen.
	 *
	 * @param nimi Laivan nimi
	 */
	public void setNimi (String uusiNimi) {
		this.nimi = uusiNimi;
	}
	
	/**
	 * Metodi asettaa laivan rakennusvuoden.
	 *
	 * @param vuosi Laivan rakennusvuosi
	 */
	public void setVuosi (int uusiVuosi) {
		this.vuosi = uusiVuosi;
	}
	
	/** 
	* Metodi palauttaa laivan nimen.
	*	
	* @return nimi
	*/
	public String getNimi() {
		return nimi;
	}
	
	/** 
	* Metodi palauttaa laivan rakennusvuoden.
	*	
	* @return vuosi
	*/
	public int getVuosi() {
		return vuosi;
	}
	
	/**
	 * Metodi palauttaa tiedot laiva-oliosta.
	 *
	 * @return laiva-olion tiedot
	 */
	public String toString(){
		return "Laivan nimi on " + getNimi() + " ja valmistusvuosi " + getVuosi() + ".";
	}
}