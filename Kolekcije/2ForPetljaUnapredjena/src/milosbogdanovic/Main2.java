package milosbogdanovic;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[5];
		
		for(int i : x) {
			System.out.println("Unesite elemente: ");
			x[i] = sc.nextInt();
		}
		
		for(int i : x) {
			System.out.print(i + " ");
			
		}
		
		

	}

}
