package milosbogdanovic;

public class Main {
	
	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DivljaPatka patka = new DivljaPatka();
		Curka curka = new DivljaCurka();
		
		// Umotavamo curku u CurkaAdapter zahvaljujuci kome ce izgledati kao patka
		
		Patka curkaAdapter = new CurkaAdapter(curka);
		
		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();
				
		System.out.println("Patka: ");
		testPatka(curkaAdapter); // ne zna da je dobila curku prerusenu u patku

	}

}
