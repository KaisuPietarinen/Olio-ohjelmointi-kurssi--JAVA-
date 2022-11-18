/**
 * Luokka risteilyaluksen tietojen luomiseen.
 * Luokka perii tietoja Laiva-luokasta.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/17
 */
public class RisteilyAlus extends Laiva{

	/**
	* Atrribuutit
	* 
	* @param maxMaara Matkustajien maksimi lukumäärä
	*/
	protected int maxMaara;
	
	/** Oletuskonstruktori */
	protected RisteilyAlus(){
		super();
	}
	
	/**
	* Konstruktori luo risteilyalus-olion.
	*
	* @param nimi Risteilyaluksen nimi
	* @param vuosi Risteilyaluksen valmistusvuosi
	* @param maxMaara Matkustajien maksimi lukumäärä
	*/
	protected RisteilyAlus(String nimi, int vuosi, int uusiMaxMaara){
		super(nimi, vuosi);
		this.maxMaara = uusiMaxMaara;
	}
	
	/**
	 * Metodi asettaa matkustajien lukumäärän.
	 *
	 * @param maxMaara
	 */
	protected void setMaxMaara (int uusiMaxMaara) {
		this.maxMaara = uusiMaxMaara;
		
	}
	
	/** 
	* Metodi palauttaa matkustajien lukumäärän.
	*	
	* @return maxMaara
	*/
	protected int getMaxMaara() {
		return maxMaara;
	}
	
	
	
	/**
	 * Metodi ylikirjottaa yliluokan toString metodin.
	 * Metodi palauttaa tiedot risteilyalus-oliosta.
	 *
	 * @return risteilyalus-olion tiedot
	 */
	@Override
	public String toString(){
		return "Risteilyaluksen nimi on " + getNimi() + " ja matkustajamaara on " + getMaxMaara() + ".";
	}
}