import java.util.*;
import java.io.Serializable;
import java.io.*;

/**
 * Luokka Ympyrä-olion käsittelemiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/12/2
 */
public class Ympyra implements Serializable{
	
	/** Atribuutti
	*
	* @param sade Ympyrän sade
	*/
	private double sade;
	
	/** Konstruktori luo ympyrä-olion
	*
	* @param sade Ympyrän säde
	*/
	public Ympyra(double r) {
		sade = r;  
	}
   
	/** 
	* Metodi palauttaa ympyrän alan.
	*	
	* @return ympyrän ala
	*/
	public double getAla() {
		return Math.PI * sade * sade; 
	}
	
	/** 
	* Metodi palauttaa ympyrän säteen.
	*	
	* @return sade
	*/
	public double getSade() {
		return sade;  
	}
   
	/**
	* Metodi palauttaa ympyrä-olion tiedot.
	*
	* @return ympyrä-olion sade ja ala
	*/
	public String toString() {
		return "Ympyran sade on " + sade + " ja pinta-ala on " + getAla();
	}
   
	/**
	* Metodi vertaa ovatko ympyrät samat.
	*
	* @return true Jos ympyrät ovat samat.
	* @return false Jos ympyrät eivät ole samat.
	*/
	public boolean equals(Ympyra y) {
		if (this.sade == y.getSade())
			return true;
		else
			return false;
    }
	
	/**
	* Metodi vertaa onko ensimmäinen ympyrä suurempi 
	* kuin toinen ympyrä.
	*
	* @return true Jos ensimmäinen ympyrä on suurempi.
	* @return false Jos ensimmäinen ympyrä ei ole suurempi.
	*/
    public boolean suurempiKuin(Ympyra y) {
		if (this.getAla() > y.getAla())
			return true;
		else
			return false;    
    }
	
	/** Metodi luokan viemiseksi tiedostoon.*/
	public static void kirjoitaYmpyra(Ympyra[] ympyrat, String tiedostoNimi) throws Exception{
		
		FileOutputStream tiedosto = new FileOutputStream(tiedostoNimi); 
		ObjectOutputStream virta = new ObjectOutputStream(tiedosto);
		
		virta.writeObject(ympyrat);
	}
	
	/** Metodi tiedoston lukemiseksi muuttujaan.*/
	public static Ympyra[] lueYmpyra(String tiedostoNimi){
		
		try{
		FileInputStream tiedosto = new FileInputStream(tiedostoNimi);
		ObjectInputStream virta = new ObjectInputStream(tiedosto);	
	
		Ympyra[] ympyrat = (Ympyra[])virta.readObject();   
	
		return ympyrat;
		
		}catch (Exception ex){
			System.out.println("Ei saatu luettua" + tiedostoNimi);
			return null;
		}
		
	}
	
	/**
	* Ympyrä-olioiden luominen ja sijoittaminen taulukkoon 
	* sekä olioiden vieminen tiedostoon ja tiedostosta tulostaminen.
	*/
    public static void main(String[] args) throws Exception{
		
        Scanner input = new Scanner(System.in);
		double s1 = 0;
		double s2 = 0;
		
		try {
        System.out.println("anna ekan ympyran sade: ");
        s1 = input.nextDouble();
		
        System.out.println("anna tokan ympyran sade: ");
        s2 = input.nextDouble();
		}
		catch (InputMismatchException ex) {
    			System.out.println("Vaara tyyppi: tarvitaan liukuluku");
				}
				
        Ympyra y1 = new Ympyra(s1);
        Ympyra y2 = new Ympyra(s2);
		
        System.out.println(y1);
        System.out.println(y2);
		
        if (y1.equals(y2))
           System.out.println("Ympyrat samat");
        else
           System.out.println("Ympyrat ei ole samat");
	   
        if (y1.suurempiKuin(y2))
           System.out.println("Eka suurempi");
        else
           System.out.println("Eka ei ole suurempi");
		
		
		Ympyra[] ympyrat = new Ympyra[10];
		ympyrat[0] = new Ympyra (s1);
		ympyrat[1] = new Ympyra (s1);
		ympyrat[2] = new Ympyra (2.4);
		ympyrat[3] = new Ympyra (7.1);
		ympyrat[4] = new Ympyra (8.3);
		ympyrat[5] = new Ympyra (2.2);
		ympyrat[6] = new Ympyra (5.7);
		ympyrat[7] = new Ympyra (6.8);
		ympyrat[8] = new Ympyra (9.9);
		ympyrat[9] = new Ympyra (1.1);
		
		kirjoitaYmpyra(ympyrat, "Ympyrat.dat");
		
		Ympyra[] YmpyraTiedostosta = lueYmpyra("Ympyrat.dat");
		
		for(Ympyra muoto: YmpyraTiedostosta){
			System.out.println(muoto);
		}
    }
}