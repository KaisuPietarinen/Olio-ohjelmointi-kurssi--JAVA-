/**
 * @(#)PelihahmoDemo.java
 *
 * Ohjelma luo käyttäjälle pelihahmon ja tulostaa sen tiedot.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */

public class PelihahmoDemo {
	
	/** 
	* Annetaan oliolle parametreina pelihahmon tiedot ja tulostetaan ne.
	* Luodaan olio, jolle annetaan parametreina uuden aseen tiedot ja tulostetaan ne.
	* Pyydetään käyttäjältä aseen tiedot olioon ja tulostetaan ne.
	*
	*/
	public static void main(String [] args){
		
		Pelihahmo ekaPelihahmo = new Pelihahmo("Mikko Mallikas", "poika", 5, "varas", 1, "krokotiilin kyyneleet", "ritsa", 10, 20);
		System.out.println(ekaPelihahmo);
		
		Ase tokaAse = new Ase();
		tokaAse.setTyyppi ("hernepyssy");
		tokaAse.setVahinko (25);
		tokaAse.setBonus (50);
		
		System.out.println();
		
		System.out.println(tokaAse);
		
		System.out.println();
		
		Ase vastaus = new Ase();
		System.out.println(vastaus.kysy());
	}
}