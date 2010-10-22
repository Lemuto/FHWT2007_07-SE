//FHWT Sem.7 Jg. 2007 - Stephan Massmann
//Berechnung der Zahl Pi - Variable Angabe der Nachkommastellen

//Mathematische Operationen
import java.lang.Math;

public class Pi {

	public static void main(String[] args) {
		pi(Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Anzahl der Nachkommastellen angeben")));
	}	
	
	private static void pi(int genauigkeit) {
		double pi, pi_old = 4, factor = 1, stellen = Math.pow(10.,genauigkeit);
		boolean check = true;
		long i = 3;
		int vorzeichen = 1;
		while (check){
			vorzeichen *= -1;
			//Berechnung des neuen Faktors
			factor += (1./i) * vorzeichen;
			//Runden auf Nachkommastellen, Anzahl in genauigkeit definiert
			pi = Math.round(4 * factor * stellen) / stellen;
			//Prüfen, ob sich der gerundete Wert seit dem letzten Durchgang geändert hat
			if (pi == pi_old){
				//Keine Verbesserung der Genauigkeit ==> Ausgabe + Abbruch
				check = false;
				System.out.println("Nach " + (i/2) + " Durchläufen wurde die Zahl pi (" + pi + ") bis auf die " + genauigkeit + ". Stelle genau ermittelt!");
				javax.swing.JOptionPane.showMessageDialog(null, "Nach " + (i/2) + " Durchläufen wurde die Zahl pi (" + pi + ") bis auf die " + genauigkeit + ". Stelle genau ermittelt!", null, vorzeichen, null);
			}
			else {
				pi_old = pi;
				i+=2;
			}
		}
	}

}