package basic;

public class MethodsCalling {
	
	public static void m1 () {
		System.out.println("static method called under non static method");
	}
	public void m2 () {
	m1();
}
public static void main(String[] args) {
	MethodsCalling ob = new MethodsCalling();
	ob.m2();	
}
}
