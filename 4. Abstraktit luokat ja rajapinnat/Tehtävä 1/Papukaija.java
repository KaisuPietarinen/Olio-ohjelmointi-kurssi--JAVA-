/**
 * Luokka papukaijan tietojen luomiseen.
 * Luokka perii tietoja Eläin-luokasta.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/17
 */
public class Papukaija extends Elain{

	/**
	* Atrribuutit
	* 
	* @param isantaNimi Papukaijan merirosvoisännän nimi
	*/
	protected String isantaNimi;
	
	/** Oletuskonstruktori */
	protected Papukaija(){
		super();
	}
	
	/**
	* Konstruktori luo papukaija-olion
	*
	* @param nimi Papukaijan nimi
	* @param elossa Onko papukaija elossa vai kuollut
	* @param isantaNimi Papukaijan merirosvoisännän nimi
	*/
	protected Papukaija(String nimi, String elossa, String uusiIsantaNimi){
		super(nimi, elossa);
		this.isantaNimi = uusiIsantaNimi;
	}
	
	/**
	 * Metodi asettaa papukaijan merirosvoisännän nimen.
	 *
	 * @param isantaNimi Papukaijan merirosvoisännän nimi
	 */
	protected void setIsantaNimi (String uusiIsantaNimi){
		this.isantaNimi = uusiIsantaNimi;
	}
	
	/** 
	* Metodi palauttaa papukaijan merirosvoisännän nimen.
	*	
	* @return isantaNimi
	*/
	protected String getIsantaNimi(){
		return isantaNimi;
	}
	
	/** 
	* Eläin-luokan abstraktin metodin toteutus,
	* metodi tulostaa papukaijan ääntelyn.	
	*/
	public void puhu(){
		System.out.println(getNimi() + " tahtoo keksin.");
	}
	
	/**
	 * Metodi palauttaa tiedot papukaija-oliosta.
	 *
	 * @return papukaija-olion tiedot
	 */
	public String toString(){
		return  getNimi() + " papukaija on " + getElossa() + " ja sen merirosvoisannan nimi on " + getIsantaNimi() + ".";
	}
}