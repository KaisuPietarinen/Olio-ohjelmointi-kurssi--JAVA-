import java.util.*;
/**
* Ohjelma luo Eläinluokan aliluokkien olentoja.
*
* @author Kaisu Pietarinen
* @version 1.00 2021/11/21
*/
public class ElainDemo{
	
	/** 
	* Ohjelma testaa Eläin-luokalta perittyjä tietoja aliluokkien olennoissa.
	* Käyttäjä voi asettaa ja selvittää eri eläinten tietoja sekä tulostaa
	* eläimen ääntelyn.
	*/
	public static void main(String[] args){
		
		Kissa ekaKissa = new Kissa("Misse", "elossa", 9, 2);
		System.out.println(ekaKissa);
		System.out.println(ekaKissa.Jaljella());
		ekaKissa.puhu();
		
		
		System.out.println();
		
		Papukaija ekaPapukaija = new Papukaija("Kaija", "elossa", "Pete Mustaparta");
		System.out.println(ekaPapukaija);
		ekaPapukaija.puhu();
		
		
		System.out.println();
		
		Lammas ekaLammas = new Lammas("Late", "elossa", "valkoinen");
		System.out.println(ekaLammas);
		ekaLammas.puhu();
		
		System.out.println();
		
		ekaKissa.setElamia(11);
		ekaKissa.setVahenee(5);
		System.out.println(ekaKissa);
		System.out.println(ekaKissa.Jaljella());
		
		System.out.println();
		
		ekaPapukaija.setIsantaNimi("Kapteeni Koukku");
		System.out.println(ekaPapukaija.getIsantaNimi());
		
		System.out.println();
		
		ekaLammas.setVari("musta");
		ekaLammas.setElossa("kuollut");
		System.out.println(ekaLammas);
		
		System.out.println();
		
		ekaLammas.setVari("valkoinen");
		System.out.println(ekaLammas.getVari());
		
		System.out.println();
		
		/** 
		* Taulukon läpi käyminen ja tulostetaan 
		* puhu-metodilla eläimen ääntely.
		*/
		Elain [] elaimet = new Elain [3];
		
		elaimet [0] = ekaKissa;
		elaimet [1] = ekaPapukaija;
		elaimet [2] = ekaLammas;
		
		for(Elain elain: elaimet){
			elain.puhu();
		}
		
	}
}