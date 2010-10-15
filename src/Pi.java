//FHWT Sem.7 Jg. 2007 - Stephan Massmann
//Berechnung der Zahl Pi auf f�nf Nachkommastellen

//Mathematische Operationen
import java.lang.Math;

public class Pi {

	public static void main(String[] args) {
		pi(5);
	}
	
	private static void pi(int genauigkeit) {
		double pi, pi_old = 4, factor = 1;
		boolean check = true;
		int i = 3, vorzeichen = 1;
		while (check){
			//Vorzeichenwechsel bei jedem Durchgang
			vorzeichen *= -1;
			//Berechnung des neuen Faktors
			factor += (1./i) * vorzeichen;
			//Runden auf Nachkommastellen, Anzahl in genauigkeit definiert
			pi = Math.round(4 * factor * Math.pow(10.,genauigkeit)) / Math.pow(10.,genauigkeit);
			//Pr�fen, ob sich der gerundete Wert seit dem letzten Durchgang ge�ndert hat
			if (pi == pi_old){
				//Keine Verbesserung der Genauigkeit ==> Ausgabe + Abbruch
				check = false;
				System.out.println("Nach " + (i/2) + " Durchl�ufen wurde die Zahl pi (" + pi + ") ermittelt!");
			}
			else {
				pi_old = pi;
				i+=2;
			}
		}
	}

}