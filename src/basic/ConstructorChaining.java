package basic;

public class ConstructorChaining {

	public ConstructorChaining (boolean a) {
System.out.println("avdut");//constructor1
}
	public ConstructorChaining (int a) {
		this(true);
		System.out.println(a);//constructor2 non parameterized
	}
	public static void main(String[] args) {
		new ConstructorInJava(55);//object
	}
}
