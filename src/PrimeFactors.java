//FHWT Sem.7 Jg. 2007 - Stephan Massmann
public class PrimeFactors {

	public static void main(String[] args) {
		for (int i=1; i<=1000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	//Funktion isPrime ermittelt, ob zahl eine Primzahl ist (Rückgabewert true/false)
	private static boolean isPrime(int zahl) {
		boolean check = true;
		int i = 2;
		int gegenzahl = zahl;
		while ((check) && (i<zahl) && (gegenzahl > i)) {
			if (zahl % i == 0) {
				check = false;
			}
			else {
				gegenzahl = zahl / i;
				//Wenn i > gegenzahl, sind keine Primzahlen mehr möglich ==> Abbruch
				i++;
			}
		}
		if (zahl < 2){
			check = false;
		}
		return check;
	}
}
