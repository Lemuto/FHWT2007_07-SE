import java.util.*;

public class Minesweeper {

	public static void main(String[] args) {
		int[] size = {3,5};
		int [][] solution = new int[size[0]][size[1]];
		char[][] field = {{'*','*','.','.','.'}, 
						  {'.','*','*','.','.'},
						  {'.','*','*','*','.'}};
		String line;
		
		solution = minesweeper(size, field);
		System.out.println("=====Minesweeper=====");
		System.out.println("Eingabe: n="+size[0]+", m="+size[1]);
		for (int i=0; i<=size[0]-1; i++){
			line = "        ";
			for (int j=0; j<=size[1]-1; j++){
				line+=field[i][j];
			}
			System.out.println(line);
		}
		System.out.println("Ausgabe:");
		for (int i=0; i<=size[0]-1; i++){
			line = "        ";
			for (int j=0; j<=size[1]-1; j++){
				if (solution[i][j] >= 0){
					line += solution[i][j];	
				}
				else {
					line += "*";
				}
			}
			System.out.println(line);
		}
		System.out.println("=====================");
	}
	
	private static int[][] minesweeper(int[] size, char[][] field) {
		int n = size[0]-1, m = size[1]-1;
		int [][] out = new int[size[0]][size[1]];
		//DEFINITION der Ausgabemenge:
		//Die Zahlen in der Variablen "out" zeigen an, wie viele Bomben das jeweilige
		//Feld umgeben. Wenn eine Zahl negativ ist, befindet sich an dieser Stelle eine Bombe!
		
		for (int i=0; i<=n; i++){ //Zeilenweise durchlaufen
			for (int j=0; j<=m; j++){ //Spaltenweise durchlaufen
				if (field[i][j] == '*') {
					out[i][j] = -9; //Markierung der Bombe in der Ausgabestruktur
					if (i>0) {
						out[i-1][j]+=1; //Oben
						if (j>0) {
							out[i-1][j-1]+=1; //Oben-Links
						}
						if (j<m) {
							out[i-1][j+1]+=1; //Oben-Rechts
						}
					}
					if (i<n) {
						out[i+1][j]+=1; //Unten
						if (j>0) {
							out[i+1][j-1]+=1; //Unten-Links
						}
						if (j<m) {
							out[i+1][j+1]+=1; //Unten-Rechts
						}
					}
					if (j>0) { //Links
						out[i][j-1]+=1;
					}
					if (j<m) { //Rechts
						out[i][j+1]+=1;
					}	
				}				
			}
		}
		return out;
	}
}
