package basic;

public class Triangle {

	public void triangle() {
			for(int a=1; a<=5; a++)
			{
				for(int b=1; b<=a; b++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			Triangle obj = new Triangle();
			obj.triangle();
	
	}

}
