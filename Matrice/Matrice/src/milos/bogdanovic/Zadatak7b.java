package milos.bogdanovic;

import java.util.Scanner;

public class Zadatak7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Broj redova ");
		int red = sc.nextInt();

		System.out.print("Broj kolona ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]= ");
				niz[i][j] = sc.nextInt();
			}
		}

		// ispisivanje elmenata
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		// Stampanje dijagonale
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i + j == red - 1)

					System.out.print("Dijagonala: " + niz[i][j] + " ");
			}
			// System.out.print("Dijagonala: " + niz[i][j] + " ");
			System.out.println();
		}

	}

}