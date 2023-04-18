package milosbogdanovic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imena[] = {"Mika", "Zika", "Ana", "Lana", "Hana", "Una"};
		List<String> listaImena = new ArrayList<String>();
		for(String s : imena)
			listaImena.add(s);
		
		String imenaZaBrisanje[] = {"Mika", "Lana", "Hana"};
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		for(String s : imenaZaBrisanje)
			listaImenaZaBrisanje.add(s);
		
		// Kreiranje iteratora kolekcije i stampanje liste pomocu iteratora
		Iterator<String> iter = listaImena.iterator();
		System.out.println("Stampanje elemenata pomoci iteratora: ");
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		
		// Brisanje elemenata liste imena koja se nalaze u listi listaImenaZaBrisanje
		
		iter = listaImena.iterator();
		while(iter.hasNext())
			if(listaImenaZaBrisanje.contains(iter.next()))
				iter.remove();
		
		System.out.println("Lista nakon brisanja: ");
		for(int i = 0; i < listaImena.size(); i++) {
			System.out.print(listaImena.get(i) + " ");
		}

	}

}
