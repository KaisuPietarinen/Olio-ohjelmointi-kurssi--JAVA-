/**
 * Luokka geometristen pinta-alojen 
 * laskemiseen kuormitetuilla metodeilla.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/21
 */
public class PintaAlat {

	/**
	* Attribuutit
	*
	* @param sade Geometrisen kuvion sade
	* @param leveys Geometrien kuvion leveys
	* @param korkeus Geometrisen kuvion korkeus
	**/
	double sade;
	double leveys;
	double korkeus;
	
	
	/** Oletuskonstruktori */
	protected PintaAlat(){
		
	}
	
	/**
	* Konstruktori luo geometrisen olion.
	*
	* @param sade sade Geometrisen kuvion sade
	* @param leveys Geometrien kuvion leveys
	* @param korkeus Geometrisen kuvion korkeus
	*/
	public PintaAlat(double uusiSade, double uusiLeveys, double uusiKorkeus){
		sade = uusiSade;
		leveys = uusiLeveys;
		korkeus = uusiKorkeus;
	}
	
	/**
	* Metodi ympyran pinta-alan laskemiseen.
	* 
	* @param sade Ympyran sade
	* @param ympyra Ympyran pinta-ala
	*/
	public static void pintaAla(double ekaSade){
		double sade = ekaSade;
		double ympyra = Math.PI * (sade * sade);
		System.out.println("Ympyran pinta-ala: " + ympyra);
	}
	
	/**
	* Metodi suorakulmion pinta-alan laskemiseen.
	* 
	* @param leveys Suorakulmion leveys
	* @param korkeus Suorakulmion korkeus
	* @param suorakulmio Suorakulmion pinta-ala
	*/
	public static void pintaAla(double ekaLeveys, double ekaKorkeus){
		double leveys = ekaLeveys;
		double korkeus = ekaKorkeus;
		double suorakulmio = leveys * korkeus;
		System.out.println("Suorakulmion pinta-ala: " + suorakulmio);
	}
	
	/**
	* Metodi sylinterin vaipan pinta-alan laskemiseen.
	* 
	* @param sade Sylinterin sade
	* @param korkeus Sylinterin korkeus
	* @param sylinteri Sylinterin vaipan pinta-ala
	*/
	public static void pintaAla(double tokaSade, int tokaKorkeus){
		double sade = tokaSade;
		int korkeus = tokaKorkeus;
		double sylinteri = 2 * (Math.PI * sade *korkeus);
		System.out.println("Sylinterin pinta-ala: " + sylinteri);
	}
}