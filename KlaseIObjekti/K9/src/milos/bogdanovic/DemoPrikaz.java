package milos.bogdanovic;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		Box b2 = new Box(10, 15, 20);
		Box b3 = new Box(10);
		Box b4 = new Box(b3);
		
		System.out.println("Zapremina1: " + b1.volume());
		System.out.println("Zapremina2: " + b2.volume());
		System.out.println("Zapremina3: " + b3.volume());
		System.out.println("Zapremina4: " + b4.volume());

	}

}
