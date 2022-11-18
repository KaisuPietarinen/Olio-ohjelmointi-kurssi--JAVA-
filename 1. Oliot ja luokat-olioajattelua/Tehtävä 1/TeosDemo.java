/**
 * @(#)TeosDemo.java
 *
 * Ohjelma luo ja tulostaa käyttäjälle teoksen tiedot ja tilan.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */ 

/** Tuodaan Javan kirjastot käyttöön.*/
import java.util.*;

/** Ohjelma luo ja tulostaa käyttäjälle teoksen tiedot ja tilan.*/
public class TeosDemo {
	
	/** 
	* Käyttäjältä pyydetään teoksen tekijän nimi ja tulostetaan teoksen tiedot.
	* Annetaan oliolle parametrina teoksen tiedot ja tulostetaan ne. 
	* Annetaan toiselle oliolle parametrina toisen teoksen tiedot ja tulostetaan ne.
	* Muutetaan teoksien tilaa ja tulostetaan tiedot uudelleen.
	* Palautetaan ensimmäisen teoksen muutettu tila.
	*/
	public static void main (String [] args) {
	
	String nimi;
	Scanner input = new Scanner (System.in);
	System.out.println ("Anna tekijan nimi: (vastaus on Jansson, Anna)");
	nimi = input.nextLine();
	System.out.println();
	
	
	
	Teos ekaTeos = new Teos(nimi, "Kuolon kosketus", "Jannitys", "975-47583-9-7", 345, "Lainassa");
	
	System.out.println(ekaTeos);
	
	Teos tokaTeos = new Teos("Lindgren, Astrid", "Veljeni, Leijonamieli", "Lasten kirjallisuus", "943-34545-9-2", 130, "Saatavilla");
	
	System.out.println(tokaTeos); 
	
	
	ekaTeos.setTila("Havinnyt");
	tokaTeos.setTila("Korjattavana");
	
	System.out.println(ekaTeos); 
	System.out.println(tokaTeos); 
	
	
	System.out.println(ekaTeos.getTila());
	
	}
}