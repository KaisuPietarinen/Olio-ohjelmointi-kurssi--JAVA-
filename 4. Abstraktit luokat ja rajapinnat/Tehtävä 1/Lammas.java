/**
 * Luokka lampaan tietojen luomiseen.
 * Luokka perii tietoja Eläin-luokasta.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/17
 */
public class Lammas extends Elain{

	/**
	* Atrribuutit
	* 
	* @param vari Lampaan vari
	*/
	protected String vari = "valkoinen";
	
	/** Oletuskonstruktori */
	protected Lammas(){
		super();
	}
	
	/**
	* Konstruktori luo lammas-olion
	*
	* @param nimi Lampaan nimi
	* @param elossa Onko lammas elossa vai kuollut
	* @param vari Lampaan väri
	*/
	protected Lammas(String nimi, String elossa, String uusiVari){
		super(nimi, elossa);
		this.vari = uusiVari;
	}
	
	/**
	 * Metodi asettaa lampaan värin.
	 *
	 * @param vari Lampaan väri
	 */
	protected void setVari (String uusiVari){
		this.vari = uusiVari;
		
	}
	
	/** 
	* Metodi palauttaa lampaan värin.
	*	
	* @return vari
	*/
	protected String getVari(){
		return vari;
	}
	
	/** 
	* Eläin-luokan abstraktin metodin toteutus,
	* metodi tulostaa lampaan ääntelyn.	
	*/
	public void puhu(){
		System.out.println("Baaaa...");
	}
	
	/**
	 * Metodi palauttaa tiedot lammas-oliosta.
	 *
	 * @return lammas-olion tiedot
	 */
	public String toString(){
		return  getNimi() + " lammas on " + getElossa() + " ja variltaan " + getVari() + ".";
	}
}