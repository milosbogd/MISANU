package milosbogdanovic;

import java.util.Scanner;

public class Primer10 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int n;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		int i = 1;
		while (i <= n) {
			s += 1 / (double) (2 * i);
			i++;
		}
		System.out.println("n = " + n + " s = " + s);
		ulaz.close();
	}
}