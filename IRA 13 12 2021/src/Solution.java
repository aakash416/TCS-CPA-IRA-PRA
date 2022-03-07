import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in); // creating object of scanner class

		int n = 4; // calling nextInt() method of Scanner class to accept number of lawyer objects

		Restaurent d[] = new Restaurent[n]; // n represents size of the array

		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt(); // accept id
			sc.nextLine();
			String name = sc.nextLine(); // accept name
			String type = sc.nextLine(); // accept name
			double aver=sc.nextDouble();
			int rating = sc.nextInt();
			d[i] = new Restaurent(id, name, type, aver,rating); // creating object
		}
		sc.nextLine();
		double dbvalau=sc.nextDouble();
		sc.nextLine();
		String retype = sc.nextLine(); // accept name


		

		int ans1 = countofrestrunt(d,dbvalau);

		if (ans1 > 0) {
			System.out.println(ans1);

		} else {
			System.out.println("There is no such restaurants availabel");
		}
		
		Restaurent ans2 = searchRestreun(d, retype);

		if (ans2 != null) {
			System.out.println(ans2.getName());
			System.out.println(ans2.getRating());

		} else {
			System.out.println("The given restaurant type is not available");

		}
		
		
	}
	
	public static int countofrestrunt(Restaurent[] Sanitize, double dbvalau) {

		int sum = 0;
		for (int i = 0; i < Sanitize.length; i++) {
			if(Sanitize[i].getRating()>3 && Sanitize[i].getAver()<dbvalau)
			{
				sum++;
			}

		}
		return sum;

	}
	
	public static Restaurent searchRestreun(Restaurent[] fabrics, String retype) {
		Restaurent b = null;
		for (int i = 0; i < fabrics.length; i++) {
			if (fabrics[i].getType().equalsIgnoreCase(retype)) {
				b = fabrics[i];
			}
		}
		return b;
	}
	
	
	

}


class  Restaurent
{
	private int id;
	private String name;
	private String type;
	private double aver;
	private int rating;
	public Restaurent(int id, String name, String type, double aver, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.aver = aver;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
}




/*

999
Apple Bees
Non veg
350
5
888
Delhi Darbar
Non veg
200
4
777
Banana Leaf
Non veg
600
4
666
Sangeetha
Veg
400
3
500
Non veg



*/