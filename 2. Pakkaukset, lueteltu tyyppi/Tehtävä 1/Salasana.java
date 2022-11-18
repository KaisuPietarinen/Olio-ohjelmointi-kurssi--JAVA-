/**
 * Luokka salasanan tietojen luomiseen ja salasanan ehtojen tarkistamiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/14
 */
public class Salasana { 

	/**
	* Attribuutti
	* 
	* @param sana Käyttäjän salasana
	*/
	protected String sana;
	
	/** Oletuskonstruktori */
	public Salasana(){
	
	}
	
	/**
	* Konstruktori luo Salasana-olion
	*
	* @param sana Käyttäjän salasana
	*/
	public Salasana(String uusiSana){
		sana = uusiSana;
		
	}
	
	/**
	 * Metodi asettaa käyttäjän salasanan.
	 *
	 * @param sana Käyttäjän salasana
	 */
	public void setSana(String uusiSana){
		sana = uusiSana;
	
	}
	
	/** 
	* Metodi palauttaa käyttäjän salasanan.
	*	
	* @return sana
	*/
	public String getSana(){
		return sana;
		
	}
	/**
	* Metodi tarkistaa täyttääkö salasana kaikki sille asetetut ehdot.
	* 
	* @return True, jos salasana täyttää ehdot. False, jos salasana ei täytä ehtoja.
	*/
	protected Boolean Kelpaa(){
		
		if (sana.length() >= 10){
			
			int laskuriNro = 0;
			int laskuriIso = 0;
			int laskuriPieni = 0;
			
			for(int i = 0; i < sana.length(); i++){
				
				char merkki = sana.charAt(i);
			
			
				if(merkki >= '0' && merkki <= '9') {
					laskuriNro++;
				}
			
				if(merkki >= 'A' && merkki <= 'Z'){
					laskuriIso++;
				}
			
				if(merkki >= 'a' && merkki <= 'z'){
					laskuriPieni++;
				}
			
				if (laskuriIso >= 1 && laskuriPieni >= 1 && laskuriNro >= 1){
					System.out.println("Salasana kelpaa.");
					return true;
				
				}	
			}
		}
			System.out.println("Salasana ei kelpaa.");
			return false;
	}
}