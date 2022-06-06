import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Fabric itte[] = new Fabric[num];
		for (int i = 0; i < num; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int availbaleStock = sc.nextInt();
			sc.nextLine();
			double price = sc.nextDouble();
			itte[i] = new Fabric(id, name, availbaleStock, price);

		}

		sc.nextLine();
		String flannel = sc.nextLine();

		Fabric ans1 = findFabric(itte);
		String n;
		Fabric ans2 = Search1(itte, flannel);

		if (ans1 != null) {
			System.out.println("Id:" + ans1.getId());
			System.out.println("name:" + ans1.getName());
			System.out.println("availableStock:" + ans1.getAvailbaleStock());
			System.out.println("price:" + ans1.getPrice());
		} else {
			System.out.println("No Fabric found with mentioned attribute.");
		}

		if (ans2 != null) {
			System.out.println("Id:" + ans2.getId());
			System.out.println("name:" + ans2.getName());
			System.out.println("availableStock:" + ans2.getAvailbaleStock());
			System.out.println("price:" + ans2.getPrice());
		} else {
			System.out.println("No Fabric found with mentioned attribute.");

		}

	}

	public static Fabric findFabric(Fabric[] fabrics) {
		Fabric l = null;
		int m = 0;
		for (int i = 0; i < fabrics.length; i++) {
			m = m + fabrics[i].getAvailbaleStock();
		}
		return l;
	}

	public static Fabric Search1(Fabric[] fabrics, String name) {
		Fabric b = null;
		for (int i = 0; i < fabrics.length; i++) {
			if (fabrics[i].getName().equalsIgnoreCase(name)) {
				b = fabrics[i];
			}
		}
		return b;
	}

}

class Fabric {
	private int id;
	private String name;
	private int availbaleStock;
	private double price;

	public Fabric(int id, String name, int availbaleStock, double price) {
		super();
		this.id = id;
		this.name = name;
		this.availbaleStock = availbaleStock;
		this.price = price;
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

	public int getAvailbaleStock() {
		return availbaleStock;
	}

	public void setAvailbaleStock(int availbaleStock) {
		this.availbaleStock = availbaleStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}