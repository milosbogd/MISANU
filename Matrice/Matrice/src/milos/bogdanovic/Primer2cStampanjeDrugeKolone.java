package milos.bogdanovic;

import java.util.Scanner;

public class Primer2cStampanjeDrugeKolone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova ");
		int red = sc.nextInt();

		System.out.println("Broj kolona ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + ", " + j + "]= ");
				niz[i][j] = sc.nextInt();
			}
		}

		// ispisivanje lemenata prvog reda

		System.out.println("Elementi druge kolone su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 1)
					System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
