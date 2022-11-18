/**
 * Luokka ympyrän tietojen luomiseen, kopioimiseen ja vertailemiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/14
 */
public class Ympyra {
	
	/** 
	* Attribuutit
	* 
	* @param sade Ympyrän säde
	* @param PII Piin arvo vakiona
	*/
	protected double sade;
	protected final double PII = 3.14159;
	
	/**
	* Oletuskonstruktori
	*
	* @param sade Ympyrän säde
	*/
	protected Ympyra(){
		sade = 0.0;
	}
	
	/**
	* Konstruktori luo Ympyra-olion
	*
	* @param sade Ympyrän säde
	*/
	protected Ympyra(double uusiSade){
		this.sade = uusiSade;
	}
	
	/**
	 * Metodi asettaa ympyrän säteen.
	 *
	 * @param sade Ympyrän sade
	 */
	protected void setSade(double uusiSade){
		this.sade = uusiSade;
	}
	
	/** 
	* Metodi palauttaa ympyrän säteen.
	*	
	* @return sade
	*/
	protected double getSade() {
		return sade;
	}
	
	/** 
	* Metodi palauttaa ympyrän alan.
	*	
	* @return ympAla
	*/
	protected double getAla() {
		double ympAla = PII * sade * sade;
		return ympAla;
	}
	
	/** 
	* Metodi palauttaa ympyrän halkaisijan.
	*	
	* @return ympHalkaisija
	*/
	protected double getHalkaisija(){
		double ympHalkaisija = sade * 2;
		return ympHalkaisija;
	}
	
	/** 
	* Metodi palauttaa ympyrän kehän.
	*	
	* @return ympKehaPituus
	*/
	protected double getKeha(){
		double ympKehaPituus = 2 * PII * sade;
		return ympKehaPituus;
	}
	
	/**
	* Metodi luo uuden Ympyra-olion, joka saa kopioitavan olion tiedot 
	* ja palauttaa luodun olion.
	*
	* @return kopio
	*/
	protected Ympyra copy(){
		
		Ympyra kopio = new Ympyra(sade);
		
		return kopio;
	}
	
	/**
	* Metodi vertaa Ympyra-luokan olioita. 
	* Oliot ovat samat jos niiden säde on sama.
	*
	* @return True, jos oliot ovat samat. False, jos oliot eivät ole samat.
	*/
	public boolean equals(Object verrattava){

		Ympyra verrattavaYmpyra = (Ympyra) verrattava;
		if (this.sade == verrattavaYmpyra.getSade()){
			System.out.println("Vertailtavien olioiden tiedot ovat samat.");
			return true;
		}
		
		System.out.println("Vertailtavien olioiden tiedot eivat ole samat.");
		return false;
	}
	
	/**
	 * Metodi palauttaa tiedot Ympyrä-oliosta.
	 *
	 * @return Ympyra-olion tiedot
	 */
	public String toString(){
		return "Sade on: " + getSade() + ". Halkaisija on: " + getHalkaisija() + ". Keha on: " + getKeha() + ".";
	}
}