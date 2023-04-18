package milosbogdanovic;

// Novu nit pokrecete tako sto napravite instancu objekta tipa Thread
// To se moze uraditi na dva nacina
// I Nacin: Implementacija interfejsa Runnable *
// II Nacin: Prosirivanjem klase Thread

//U main klasi: 
//Nakon kreiranja klase koja implementira interfejs Runnable, potrebno je napraviti instancu objekta tipa Thread

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");
		
		t1.start(); // metoda start poziva metodu run();
		t2.start();
		t3.start();
		
		
	}

}
