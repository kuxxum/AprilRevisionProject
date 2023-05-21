package basic;

public class ConstructorInJava {
	
	public ConstructorInJava () {
System.out.println("Hrithik Roshan");//constructor1
}
	public ConstructorInJava (int a) {
		System.out.println(a);//constructor2 non parameterized
	}
	public static void main(String[] args) {
		new ConstructorInJava(55);//object
		new ConstructorInJava ();//object
	}}
