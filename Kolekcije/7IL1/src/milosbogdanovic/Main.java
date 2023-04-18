package milosbogdanovic;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ll = new LinkedList<String>();
		
		//Dodavanje elemenata u povezanoj listi
		ll.add("A"); //0
		ll.add("B"); //1
		
		ll.add(2, "C"); //2
		
		System.out.println("Elementi povezane liste su: " + ll);
		
		ll.remove(0);
		ll.remove("B");
		
		System.out.println("Elementi povezane liste su: " + ll);
		
		ll.add("D");
		ll.add("F");
		ll.add("E");
		
		System.out.println("Elementi povezane liste su: " + ll);
		
		// Trazenje elementa u povezanoj listi
		
		boolean sadrzi = ll.contains("E");
		if(sadrzi)
			System.out.println("Lista sadrzi Element E");
		else
			System.out.println("Lista ne sadrzi Element E");
		
		// Pristupanje(uzimanje) vrednosti elementa iz povezane liste
		
		Object element = ll.get(2);
		System.out.println("Zatrazeni objekat je: " + element);
		
		// Postavljanje vrednosti elementa u povezanoj listi
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene: " + ll);

	}

}
