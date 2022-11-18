import java.util.*; 

/**
* Ohjelma pyytää käyttäjältä salasanaa ja tarkistaa täyttääkö salasana sille asetetut ehdot.
* Ohjelma pyytää käyttäjältä salasanaa niin kauan, että ehdot täyttyvät.
*/
public class SalasanaDemo {

	/**
	* Tulostetaan salasanan ehdot.
	* Pyydetään käyttäjältä salasanaa.
	* Palautetaan sanasanan kelpaavuus.
	* Kysytään käyttäjältä salasanaa niin kauan, että ehdot täyttyvät.
	*/
	public static void main(String [] args){
	
	System.out.println("Salasanan tulee sisaltaa:\n- 10 merkkia\n- 1 iso kirjain\n- 1 pieni kirjain\n- 1 numero");
	
	Toisto();
	
	}
	
	/** Metodi palauttaa salasanan kelpaavuuden
	* ja pyytää käyttäjältä uutta salasanaa, 
	* jos salasanan ehdot eivät täyttyneet.
	*/
	protected static void Toisto(){
		
		Salasana ekaSana = new Salasana(Kysy());
		boolean kelpaavuus = ekaSana.Kelpaa();
		
		if (kelpaavuus == true){
			
		}
		
		while(kelpaavuus == false){
			
			ekaSana.setSana(Kysy());
			kelpaavuus = ekaSana.Kelpaa();
			
		}
	}
	
	/**
	* Metodi pyytää käyttäjältä salasanan.
	* Metodi palauttaa käyttäjän syöttämän salasanan.
	* 
	* @return vastaus
	*/
	protected static String Kysy(){
		
		Scanner input = new Scanner (System.in);
		
		System.out.println();
		
		System.out.println ("Anna salasana:");
		String vastaus = input.nextLine();
		
		return vastaus;
	
	}	
}