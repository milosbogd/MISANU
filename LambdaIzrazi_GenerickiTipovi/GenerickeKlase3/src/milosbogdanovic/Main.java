package milosbogdanovic;

public class Main {

	public static<T> void stampajNiz(T[]pocetniNiz){
		for(T element : pocetniNiz)
			System.out.print(element + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // inicijalizacija niza
		Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] c = {'a', 'b', 'c', 'd'};
		
		System.out.println("Sadrzaj celobrojnog niza: ");
		stampajNiz(i);
		
		System.out.println("\nSadrzaj double niza: ");
		stampajNiz(d);
		
		System.out.println("\nSadrzaj niza karaktera: ");
		stampajNiz(c);
		

	}

}
