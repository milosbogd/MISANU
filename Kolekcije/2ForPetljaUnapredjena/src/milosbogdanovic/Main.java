package milosbogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int niz[] = {2, 5, 7, 9, 29};
		
		//stampanje elementa niza standardnom for petljom
		System.out.println("Stampanje elemenata niza for petljom: ");
		for(int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		
		// stampanje elemenata niza poboljsanom for petljom
		System.out.println("\nStampanje elemenata niza usavrsenom for petljom: ");
		for(int i : niz)
			System.out.print(i + " ");
		
		

	}

}
