//FHWT Sem.7 Jg. 2007 - Stephan Massmann
//Code-Kata zum Spiel FizzBuzz

public class FizzBuzz {

	public static void main(String[] args) {
		for ( int i = 1; i<=100; i++) {
			System.out.println(wert(i));
		}
	}
	
	private static String wert(int zahl){
		String wert = "";
		if (zahl % 3 == 0) {
			wert += "Fizz";
		}
		if (zahl % 5 == 0) {
			wert += "Buzz";
		}
		if (wert == "") {
			wert = String.valueOf(zahl);
		}
		return wert;
	}
}
