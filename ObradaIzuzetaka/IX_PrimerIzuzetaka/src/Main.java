
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 10;
			int b = 10 / a;
			System.out.println("a = " + a);
			
			try {
				if(a == 1)
					a = a / (a - a);
				if(a == 2) {
					int c[] = {1};
					c[10] = 100;
				}
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Indeski");
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Izuzetak");
		}

	}

}
