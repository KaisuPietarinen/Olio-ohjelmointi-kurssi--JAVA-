import java.io.Serializable;
import java.io.*;
import java.util.*;

/**
 * Luokka Asiakas-olion luomiseen, olion tietojen tallentamiseen tiedostoon 
 * ja sieltä tulostamiseen sekä halutun asiakkaan tietojen tulostamiseen.
 *
 * Sisältää tehtävät 1 ja 2.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/12/2
 */
public class Asiakas implements Serializable{

	//TEHTÄVÄ 1
	
	/** Atribuutit
	*
	* @param ID Asiakkaan asiakasnumero
	* @param nimi Asiakkaan nimi
	* @param sPosti Asiakkaan sähköposti
	* @param pNum Asiakkaan puhelinnumero
	*/
	static public String ID = " ";
	public String nimi;
	public String sPosti;
	public String pNum;
	
	/** Oletuskonstruktori */
	public Asiakas(){
		
	}

	/** Konstruktori luo asiakas-olion.
	*
	* @param ID Asiakkaan asiakasnumero
	* @param nimi Asiakkaan nimi
	* @param sPosti Asiakkaan sähköposti
	* @param pNum Asiakkaan puhelinnumero
	*/
	public Asiakas(String ID, String nimi, String sPosti, String pNum){
		this.ID = ID;
		this.nimi = nimi;
		this.sPosti = sPosti;
		this.pNum = pNum;
	}
	
	/** Metodi tiedostoon kirjoittamiseksi.*/
	public void kirjoitetaan(String tiedostoNimi) throws IOException{ // Minne kirjoitetaan
		
		PrintWriter writer = new PrintWriter(new FileWriter(tiedostoNimi,true));
		writer.println("Data for customer # " + ID);
		writer.println("Name: " + nimi);
		writer.println("E-mail: " + sPosti);
		writer.println("Phone number: " + pNum);
		
		writer.close();
		
	}
	
	// TEHTÄVÄ 2
	
	/** Metodi tiedostosta lukemiseen.
	*
	* @return tulos
	*/
	public static String luetaan(String tiedostoNimi) throws FileNotFoundException{
		
		String tulos = ""; 
		
		File tiedosto = new File(tiedostoNimi);
		Scanner tiedostoLukija = new Scanner(tiedosto);
		
		
		while(tiedostoLukija.hasNext()){ 
			tulos += tiedostoLukija.nextLine() + "\n";
		}
		
		return tulos;
	}
	
	/** Metodi halutun asiakkaan tietojen etsimiseen ja 
	* tulostamiseen asiakasnumeron perusteella 
	*/
	public static void etsitaan(String searchID) throws FileNotFoundException{
		
		Scanner tiedosto = new Scanner(new File("Asiakkaat.txt"));
		
		int count = 0;
		
		while (tiedosto.hasNextLine()){
			String rivi = tiedosto.nextLine();
			StringTokenizer pilkottava = new StringTokenizer(rivi, " ");
			int id = 0;
			
			while(pilkottava.hasMoreTokens()){
				id = id +1;
				String osa = pilkottava.nextToken();
				
				if(id == 5){
			
				}		  
			}
			
			if(count < 4){
				count = count +1;
				System.out.println(rivi);
			}
		}
	}
}
			
			