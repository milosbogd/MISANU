package milosbogdanovic;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imena[] = {"Mika", "Zika", "Fica"};
		
		List<String> listaImena = new LinkedList<String>();
		for(String s : imena)
			listaImena.add(s);
		
		
		String imena1[] = {"Ana", "Lana", "Hana", "Una"};
		List<String> listaImena1 = new LinkedList<String>();
		for(String s : imena1) 
			listaImena1.add(s);
		
		System.out.println("Lista imena 1: " + listaImena);
		System.out.println("Lista imena 2: " + listaImena1);
		
		
		listaImena.addAll(listaImena1);
		System.out.println("Lista imena posle dodavanja: " + listaImena);

		listaImena.subList(1, 2).clear();
		System.out.println("Lista nakon brisanja elemenata sa indeksima od 1 - 2: " + listaImena);
		
	}

}
