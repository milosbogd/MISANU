package milos.bogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 10 / a;
		}
		catch(ArithmeticException e) {
			System.out.println("Deljenje nulom");
		}
		try {
			
			
			int c[] = {1}; // jedan od nacina inicijalizacije nizova
			c[10] = 100;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Nepostojeci indeks unutar niza!");
		}
		
		System.out.println("Nakon try/catch, catch bloka");

	}

}
