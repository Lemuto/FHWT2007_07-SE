//FHWT Sem.7 Jg. 2007 - Stephan Massmann
public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println(2);
		for (int i=3; i<=1000; i+=2) {
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
		if (zahl < 2){
			check = false;
		}
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
		return check;
	}
}
