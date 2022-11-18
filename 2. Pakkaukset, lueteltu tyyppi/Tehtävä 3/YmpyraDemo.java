import java.util.*;

/**
* Ohjelma pyytää käyttäjältä ympyrän säteen, palauttaa ympyrän tiedot,
* kopioi tiedot uuteen olioon ja vertailee ovatko oliot samanlaisia.
*/
public class YmpyraDemo {

	/**
	* Kysytään käyttäjältä ympyrän säde.
	* Tulostetaan Ympyrä-olioiden tiedot.
	* Palautetaan copy metodi ja tulostetaan tiedot.
	* Palautetaan tieto ovatko oliot samat.
	*/
	public static void main (String [] args) {
		
		Ympyra ekaYmpyra = new Ympyra(Kysy());
		Ympyra tokaYmpyra = new Ympyra(Kysy());
		Ympyra kolmasYmpyra = new Ympyra(Kysy());
		Ympyra neljasYmpyra = new Ympyra(Kysy());
	
		System.out.println();
		
		System.out.println(ekaYmpyra);
		System.out.println(tokaYmpyra);
		System.out.println(kolmasYmpyra);
		System.out.println(neljasYmpyra);
		
		System.out.println();
		
		System.out.println(ekaYmpyra.equals(tokaYmpyra));
		System.out.println(ekaYmpyra.equals(kolmasYmpyra));
		System.out.println(ekaYmpyra.equals(neljasYmpyra));
		System.out.println(tokaYmpyra.equals(kolmasYmpyra));
		System.out.println(tokaYmpyra.equals(neljasYmpyra));
		System.out.println(kolmasYmpyra.equals(neljasYmpyra));
				
		System.out.println();
		
		Ympyra ekaYmpyraKopio = ekaYmpyra.copy();
		System.out.println(ekaYmpyraKopio);
		
	}
	/**
	* Metodi pyytää käyttäjältä ympyrän säteen ja pyytää uuden luvun, 
	* jos luku ei ole positiivinen.
	* Metodi palauttaa käyttäjän syöttämän ympyrän säteen.
	* 
	* @return syoteSade
	*/
	public static double Kysy(){
		
		double syoteSade;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Anna olion ympyran sade (kayta pilkkua):");
		syoteSade = input.nextDouble();
		
		while (syoteSade < 0 ){
			System.out.println("Luku ei ole positiivinen, syötä positiivinen luku");
			System.out.println ("Anna ympyran sade:");
			syoteSade = input.nextDouble();
		}
		return syoteSade;
	}
}