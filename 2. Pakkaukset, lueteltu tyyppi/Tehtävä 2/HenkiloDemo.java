import java.util.*;

/**
* Ohjelma pyytää henkilön tiedot, kopioi tiedot uuteen olioon ja testaa
* ovatko tiedot samat.
*/
public class HenkiloDemo {
	
	/**
	* Ohjelma pyytää henkilön nimen, muut tiedot annetaan attribuutteina oliolle. 
	* Palautetaan copy metodi ja tulostetaan tiedot.
	* Palautetaan tieto ovatko oliot samat.
	* Tulostetaan kaikkien olioiden tiedot.
	*/
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Anna nimi:");
		String olionNimi = input.nextLine();
	
		System.out.println();
	
		Henkilo ekaHenkilo = new Henkilo(olionNimi, "Kuminakuja 13", "13", "0504567892");
		Henkilo tokaHenkilo = new Henkilo("Sanna", "Pilvitie 23 a 12", "21", "0446582391");
		
		Henkilo ekaHenkiloKopio = ekaHenkilo.copy();
		
		System.out.println(ekaHenkilo.equals(ekaHenkiloKopio));
		
		System.out.println();
		
		System.out.println(ekaHenkilo);
		System.out.println(tokaHenkilo);
		System.out.println(ekaHenkiloKopio);
	}
}