package milosbogdanovic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ForPetlja14 {

	public static void main(String[] args) {
		// Deklaracija promenljivih
		double imenilac, brojilac = 0d;

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);

		// 1. Unos podataka
		System.out.println("Koliko cifara zelite da unesete? ");
		imenilac = ulaz.nextDouble();

		// 2. Obrada podataka primenom for petlje
		for (int i = 1; i <= imenilac; i++) {
			System.out.println("Unesite " + i + ". cifru: ");
			double j = ulaz.nextDouble();
			brojilac += j;
		}

		// Stampanje izlaznog rezultata
		System.out.println("Aritmeticka sredina je " + df.format((brojilac / imenilac)));
		ulaz.close(); // Zatvarenja skenera kako bi se izbeglo "curenje" podataka

	}

}
