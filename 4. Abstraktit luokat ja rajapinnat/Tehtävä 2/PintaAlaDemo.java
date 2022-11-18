/**
 * Luokka PintaAlaDemo geometristen pinta-alojen 
 * laskemiseen kuormitetuilla metodeilla.
 *
 * @author	Kaisu Pietarinen
 * @version 1.00 2021/11/21
 */
public class PintaAlaDemo{

	/** Ohjelma luo PintaAlat-luokasta geometriset oliot, 
	* tulostaa niiden pinta-alat kutsumalla metodia.
	*/
	public static void main (String[] args){
		
		PintaAlat ympyra = new PintaAlat(14.5, 0, 0);
		ympyra.pintaAla(14.5);
		
		PintaAlat suorakulmio = new PintaAlat(0, 12.4, 13.2);
		suorakulmio.pintaAla(12.4, 13.2);
		
		PintaAlat sylinteri = new PintaAlat(4.6, 0, 11);
		sylinteri.pintaAla(4.6, 11);
	}
}