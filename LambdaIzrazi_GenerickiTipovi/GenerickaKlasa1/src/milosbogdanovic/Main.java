package milosbogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A<Integer> intObjekat = new A<Integer>(100);
		
		intObjekat.prikaziTip();
		int vrednostIntObjekta = intObjekat.getOb();
		System.out.println("Vrednost: " + vrednostIntObjekta);
		
		A<String> stringOb = new A<String>("Proba");
		stringOb.prikaziTip();
		String vrednostStingOb = stringOb.getOb();
		System.out.println("Sting: " + vrednostStingOb);
		
 
	}

}
