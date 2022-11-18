/**
* Ohjelma luo Eläinluokan aliluokkien olentoja.
*/
public class ElainDemo{
	
	/** 
	* Ohjelma testaa Eläin-luokalta perittyjä tietoja aliluokkien olennoissa.
	* Käyttäjä voi asettaa ja selvittää eri eläinten tietoja.
	*/
	public static void main(String[] args){
		
		Kissa ekaKissa = new Kissa("Misse", "elossa", 9, 2);
		System.out.println(ekaKissa);
		System.out.println(ekaKissa.Jaljella());
		
		System.out.println();
		
		Papukaija ekaPapukaija = new Papukaija("Kaija", "elossa", "Pete Mustaparta");
		System.out.println(ekaPapukaija);
		
		System.out.println();
		
		Lammas ekaLammas = new Lammas("Late", "elossa", "valkoinen");
		System.out.println(ekaLammas);
		
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
		
	}
}