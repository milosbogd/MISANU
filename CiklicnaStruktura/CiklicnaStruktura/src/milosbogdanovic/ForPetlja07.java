package milosbogdanovic;

import java.util.Scanner;

public class ForPetlja07 {

	public static void main(String[] args) {

		/* Unos podataka */
		int n, m, s = 1;

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		System.out.println("Unesite vrednost za m: ");
		m = ulaz.nextInt();
		ulaz.close();

		/* Obrada podataka */
		for (int i = 1; i <= m; i++) {
			s *= n + i * m;
		}

		/* Ispisivanje izlaznog rezultata za S */
		System.out.println("Vrednost za S je: " + (n * s));

	}

}