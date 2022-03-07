import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 

		int n = 4; 

		Spud d[] = new Spud[n]; 

		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt(); 
			sc.nextLine();
			String tpye = sc.nextLine(); 
			String product = sc.nextLine(); 
			int price = sc.nextInt();
			d[i] = new Spud(id, tpye, product, price); 
		}
		sc.nextLine();
		String fs1 = sc.nextLine(); 
		int lastvalue = sc.nextInt();
		
		
		
		
//		int ans1 = findtotalstock(d,fs1);

		int sum=0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getTpye().equalsIgnoreCase(fs1))

				System.out.println(d[i].getTpye());

			sum =1;

		}
		
		
		
		
		if (sum != 0) {
			System.out.println(fs1);

		} else {
			System.out.println("State not found.");
		}
		

		int b = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getPrice() <lastvalue) {

				System.out.println( d[i].getTpye());
				System.out.println( d[i].getPrice());
				b=1+b;

				
			}
			
		}
		if(b < 0)
		{
			System.out.println("No Spud found.");

		}
		

		

	}
	
//	
//	public static int findtotalstock(Spud[] Sanitize, String fs1) {
//
//		int sum=0;
//		for (int i = 0; i < Sanitize.length; i++) {
//			if(Sanitize[i].getTpye().equalsIgnoreCase(fs1))
//			sum =1;
//
//		}
//		return sum;
//	}
	
	


}
class Spud
{
	private int id;
	private String tpye;
	private String product;
	private int price;
	public Spud(int id, String tpye, String product, int price) {
		super();
		this.id = id;
		this.tpye = tpye;
		this.product = product;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTpye() {
		return tpye;
	}
	public void setTpye(String tpye) {
		this.tpye = tpye;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}