//FHWT Sem.7 Jg. 2007 - Stephan Massmann
//Berechnung der Zahl Pi auf fünf Nachkommastellen

//Mathematische Operationen
import java.lang.Math;

public class Pi {

	public static void main(String[] args) {
		double pi, pi_old = 4, factor = 1;
		boolean positiv = false, check = true;
		int i = 3; //Laufvariable
		while (check){
			//Berechnung des neuen Faktors
			if (positiv) {
				factor = factor + (1./i);
				positiv = false;
			}
			else {
				factor = factor - (1./i);
				positiv = true;
			}
			//Runden auf 5 Nachkommastellen
			pi = Math.round(4 * factor * 100000.) / 100000.;
			//Prüfen, ob sich der gerundete Wert seit dem letzten Durchgang geändert hat
			if (pi == pi_old){
				//Keine Verbesserung der Genauigkeit ==> Ausgabe + Abbruch
				check = false;
				System.out.println("Nach " + (i/2) + " Versuchen wurde die Zahl pi (" + pi + ") ermittelt!");
			}
			else {
				pi_old = pi;
				i+=2;
			}
		}
	}

}
