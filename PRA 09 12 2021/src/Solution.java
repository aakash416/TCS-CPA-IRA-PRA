import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // creating object of scanner class


		int n = 4; // calling nextInt() method of Scanner class to accept number of lawyer objects

				Item d[] = new Item[n]; // n represents size of the array

		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt(); // accept id
			sc.nextLine();
			int quantity = sc.nextInt();
			sc.nextLine();

			String name = sc.nextLine(); // accept name
			int price = sc.nextInt();
			d[i] = new Item(id, quantity,name , price); // creating object
		}
		sc.nextLine();
		int lastvalue = sc.nextInt();

	}

}
class Item
{
	private int id;
	private int quantity;
	private String name;
	private int price;
	public Item(int id, int quantity, String name, int price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}