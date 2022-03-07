import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in); // creating object of scanner class

		int n = sc.nextInt(); // calling nextInt() method of Scanner class to accept number of lawyer objects

		Sanitizer d[] = new Sanitizer[n]; // n represents size of the array

		for (int i = 0; i < d.length; i++) {
			int rackid = sc.nextInt(); // accept id
			sc.nextLine();
			String name = sc.nextLine(); // accept name
			int ave = sc.nextInt();
			sc.nextLine();
			int price = sc.nextInt();
			d[i] = new Sanitizer(rackid, name, ave, price); // creating object
		}
		sc.nextLine();
		int lastvalue = sc.nextInt();	
		
		

		int ans1 = findtotalstock(d);

		if (ans1 > 0) {
			System.out.println("Total Stock : " + ans1);

		} else {
			System.out.println("No Sanitizer found with mentioned attribute.");
		}
		
		
		
		Sanitizer ans2 = searchbyid(d, lastvalue);

		if (ans2 != null) {
			System.out.println("rackId-" + ans2.getRackid());
			System.out.println("name-" + ans2.getName());
			System.out.println("availableStock-" + ans2.getAve());
			System.out.println("price-" + ans2.getPrice());
		} else {
			System.out.println("No Sanitizer found with mentioned attribute.");

		}
		
		
		
		
		
		
	}
	
	
	
	
	public static int findtotalstock(Sanitizer[] Sanitize) {

		int sum = 0;
		for (int i = 0; i < Sanitize.length; i++) {
			sum += Sanitize[i].getAve();

		}
		return sum;

	}

	public static Sanitizer searchbyid(Sanitizer[] fabrics, int lastvalue) {
		Sanitizer b = null;
		for (int i = 0; i < fabrics.length; i++) {
			if (fabrics[i].getRackid() == lastvalue) {
				b = fabrics[i];
			}
		}
		return b;
	}

}



class Sanitizer
{
	private int rackid;
	private String name;
	private int ave;
	private int price;
	public Sanitizer(int rackid, String name, int ave, int price) {
		super();
		this.rackid = rackid;
		this.name = name;
		this.ave = ave;
		this.price = price;
	}
	public int getRackid() {
		return rackid;
	}
	public void setRackid(int rackid) {
		this.rackid = rackid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAve() {
		return ave;
	}
	public void setAve(int ave) {
		this.ave = ave;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}