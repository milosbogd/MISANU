package milosbogdanovic;

// Nit se moze napraviti za svaki objekat koji implementiira intefejs runnable
// Da bi klasa implementirala interfejs Runnable potrebno je samo da ima metodu koja se zove run()
// i koja je deklarisana u sledecem obliku: public void run()


// U main klasi: 
// Nakon kreiranja klase koja implementira interfejs Runnable, potrebno je napraviti instancu objekta tipa Thread

public class A implements Runnable {

	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}	

}
