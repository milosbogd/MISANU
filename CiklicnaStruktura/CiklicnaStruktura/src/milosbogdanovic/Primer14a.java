package milosbogdanovic;

import java.text.DecimalFormat;

public class Primer14a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.####");

		double f, x;

		System.out.println("\tX\tF(X)");

		for (x = 1.0; x <= 2.0; x += 0.2) {
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3));

			System.out.println("\t" + df.format(x) + "\t" + df.format(f));
		}

	}

}
