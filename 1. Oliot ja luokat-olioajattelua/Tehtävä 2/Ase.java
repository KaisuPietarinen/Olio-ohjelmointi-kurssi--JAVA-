/**
 * @(#)Ase.java
 *
 * Luokka aseen tietojen luomiseen.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */ 

/** Tuodaan Javan kirjastot käyttöön.*/
import java.util.*; 

/** Luokka aseen tietojen luomiseen. */
public class Ase {
	
	/** Attribuutit */
	String tyyppi;
	int vahinko;
	int bonus;
	
	/** Oletuskonstruktori*/
	public Ase(){
		
	}
	
	/** Konstruktori*/
	public Ase(String uusiTyyppi, int uusiVahinko, int uusiBonus){
		tyyppi = uusiTyyppi;
		vahinko = uusiVahinko;
		bonus = uusiBonus;
		
	}
	
	/** Asettaa aseen tyypin */
	public void setTyyppi(String uusiTyyppi){
		tyyppi = uusiTyyppi;
		
	}
	
	/** Asettaa aseen vahingon */
	public void setVahinko(int uusiVahinko){
		vahinko = uusiVahinko;
		
	}
	
	/** Asettaa aseen bonuksen */
	public void setBonus(int uusiBonus){
		bonus = uusiBonus;
		
	}
	
	/** Palauttaa aseen tyypin */
	public String getTyyppi(){
		return tyyppi;
		
	}
	
	/** Palauttaa aseen vahingon */
	public int getVahinko(){
		return vahinko;
		
	}
	
	/** Palauttaa aseen bonuksen */
	public int getBonus(){
		return bonus;
		
	}
	
	/** Palauttaa käyttäjältä pyydetyt aseen tiedot*/
	public String kysy(){
		Scanner input = new Scanner (System.in);
		System.out.println ("Anna aseen tyyppi:");
		tyyppi = input.nextLine();
		System.out.println ("Anna vahinko (kokoluku):");
		vahinko = input.nextInt();
		System.out.println ("Anna bonus (kokoluku):");
		bonus = input.nextInt();
		
		return "\n" + tyyppi + "\n" + vahinko + "\n" + bonus;
	}
	
	/** Palauttaa merkkijonot ja aseen tiedot*/
	public String toString(){
		return "Tyyppi: " + tyyppi + "\n" + "Vahinko: " + vahinko + "\n" +  "Bonus: " + bonus;
		
	}
}