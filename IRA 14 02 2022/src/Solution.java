import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;
		// search on telegram @codewithvirus
		Market codewithvirus[] = new Market[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String category = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			boolean ava = sc.nextBoolean();
			sc.nextLine();
			codewithvirus[i] = new Market(id, name, category, price, ava);
		}
		String f1 = sc.nextLine();

		int ans1 = codewithvirus2(codewithvirus, f1);

		if (ans1 != 0) {
			System.out.println(ans1);

		} else {
			System.out.println("No item available with the given category");

		}

		Market ans2 = codewithvirus1(codewithvirus);
		if (ans2 != null) {
			System.out.println(ans2.getId());
			System.out.println(ans2.getPrice());

		} else {
			System.out.println("No such item available");

		}

	}

	public static int codewithvirus2(Market[] d, String s) {

		int p = 0;

		for (int i = 0; i < d.length; i++) {
			if (d[i].getCategory().equalsIgnoreCase(s)) {
				p += d[i].getPrice();
			}

		}
		return p;
	}

	public static Market codewithvirus1(Market[] d) {

		Market p = null;

		Market temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getPrice() > d[j].getPrice()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}

		int a = 0;
		for (int i = 0; i < d.length - 1; i++) {
			if (d[i].getPrice() == d[i + 1].getPrice()) {
				a++;
			}

		}
		if (a != 0) {
			return p;
		} else {
			return d[2];
		}
	}

}

class Market {
	private int id;
	private String name;
	private String category;
	private int price;
	private boolean ava;

	public Market(int id, String name, String category, int price, boolean ava) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.ava = ava;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAva() {
		return ava;
	}

	public void setAva(boolean ava) {
		this.ava = ava;
	}

}