/**
 * Luokka tankkerin tietojen luomiseen.
 * Luokka perii tietoja Laiva-luokasta.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/17
 */
public class Tankkeri extends Laiva{

	/**
	* Atrribuutit
	* 
	* @param lasti Lastin maksimimäärä tonneina
	*/
	protected int lasti;
	
	/** Oletuskonstruktori */
	protected Tankkeri(){
		super();
	}
	
	/**
	* Konstruktori luo tankkeri-olion.
	*
	* @param nimi Tankkerin nimi
	* @param vuosi Tankkerin valmistusvuosi
	* @param lasti Lastin maksimimäärä tonneina
	*/
	protected Tankkeri(String nimi, int vuosi, int uusiLasti){
		super(nimi, vuosi);
		this.lasti = uusiLasti;
	}
	
	/**
	 * Metodi asettaa lastin maksimimäärän tonneina.
	 *
	 * @param lasti Lastin maksimimäärä tonneina
	 */
	protected void setLasti (int uusiLasti) {
		this.lasti = uusiLasti;
		
	}
	
	/** 
	* Metodi palauttaa lastin maksimimäärän tonneina.
	*	
	* @return lasti
	*/
	protected int getLasti() {
		return lasti;
	}
	
	
	
	/**
	 * Metodi ylikirjottaa yliluokan toString metodin.
	 * Metodi palauttaa tiedot tankkeri-oliosta.
	 *
	 * @return tankkeri-olion tiedot
	 */
	@Override
	public String toString(){
		return "Tankkerin nimi on " + getNimi() + " ja lastin maksimimaara on " + getLasti() + ".";
	}
}