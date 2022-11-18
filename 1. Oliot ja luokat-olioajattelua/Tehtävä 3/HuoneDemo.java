/**
 * @(#)HuoneDemo.java
 *
 * Ohjelma laskee huoneen pinta-alan ja kertoo tapetoinnin hinnan.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/6
 *
 */

public class HuoneDemo {
	
/**
* Annetaan oliolle parametreiksi huoneen mitat ja tapetin hinta sekä tulostetaan olion avulla tapetoinnin hinta.
* Asetetaan uusi hinta tapetille ja tulostetana tapaetoinnin hinta uudella hinnalla.
* Annetaan toiselle oliolle huoneen mitat ja hinta ja tulostetaan tapetoinnin uusi hinta.
*
*/
	public static void main(String [] args){
		
		HuoneTapetti ekaHuone = new HuoneTapetti(3.5, 2.7, 31.50);
		System.out.println(ekaHuone);
		
		
		ekaHuone.setHinta(19.90);
		System.out.println(ekaHuone);
		
		
		HuoneTapetti tokaHuone = new HuoneTapetti(3.0, 2.5, 27.90);
		System.out.println(tokaHuone);
	}		
}