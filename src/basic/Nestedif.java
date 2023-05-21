package basic;

public class Nestedif {

	public static void main (String args []){
		
		int variety =10;
		int discount =25;
		boolean nocostemi=true;
		if (variety>=10)	
		{
		System.out.println("shop has more variety");
		if (discount>=25)
		{
			System.out.println("shop has required discount");
			if (nocostemi==	true)
			{
				System.out.println("lets buy the furniture from this shop");
			}
			else  
			{
				System.out.println("no cost emi is not available");
			}
		}
		else 
		{
			System.out.println("discount is less");
		}
		}
		else
		{
			System.out.println("variety are less");
				
		}
	}
}
