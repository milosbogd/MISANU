package milosbogdanovic;

public class A<T, V> {

	T ob1;
	V ob2;
	
	A(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}
	
	public T getOb1() {
		return ob1;
	}
	
	public void setOb1(T ob1) {
		this.ob1 = ob1;
	}
	
	public V getOb2() {
		return ob2;
	}
	
	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}
	
	void prikaziTip() {
		System.out.println("Tip T je: " + ob1.getClass().getName());
		System.out.println("Tip V je: " + ob2.getClass().getName());
	}
	
	
}
