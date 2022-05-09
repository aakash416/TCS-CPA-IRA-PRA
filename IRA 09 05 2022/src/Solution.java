import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		// search on telegram @codewithvirus
		Truck codewithvirus[] = new Truck[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int capcity = sc.nextInt();
			sc.nextLine();
			int rate = sc.nextInt();
			sc.nextLine();
			codewithvirus[i] = new Truck(id, name, capcity, rate);
		}
		int capcity1 = sc.nextInt();
		sc.nextLine();
		int rate1 = sc.nextInt();
		sc.nextLine();
		String name1 = sc.nextLine();
		int ans1 = codewithvirus2(codewithvirus, capcity1, rate1);

		if (ans1 != 0) {
			System.out.println(ans1);

		} else {
			System.out.println("No Truck found with mentioned attribute");

		}

		Truck ans = codewithvirus1(codewithvirus, name1);

		if (ans != null) {
			System.out.println(ans.getId());
			System.out.println(ans.getName());
			System.out.println(ans.getCapcity());
			System.out.println(ans.getRate());

		} else {
			System.out.println("No Truck found with mentioned attribute");

		}
	}

	public static int codewithvirus2(Truck[] d, int capcity1, int rate1) {
		int p = 0;
		int ab = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getCapcity() >= capcity1 && d[i].getRate() <= rate1) {
				p++;
			}

		}
		return p;
	}

	public static Truck codewithvirus1(Truck[] d, String s) {
		Truck p = null;

		Truck temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getCapcity() > d[j].getCapcity()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		int a = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getName().equalsIgnoreCase(s)) {
				if (a == 1) {
					p = d[i];
				}
				a++;
			}
		}
		return p;

	}

}

class Truck {
	private int id;
	private String name;
	private int capcity;
	private int rate;

	public Truck(int id, String name, int capcity, int rate) {
		super();
		this.id = id;
		this.name = name;
		this.capcity = capcity;
		this.rate = rate;
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

	public int getCapcity() {
		return capcity;
	}

	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}

//////////////////////UNIX ///////////
/*
 * awk 'BEGIN{FS="|";count=0;} { if(tolower($4)=="asia" && $5>=100) {
 * 
 * print ($1"*"$2"*"$3"*"$4); count++; }
 * 
 * } END{ if(count==0) { print "No record found with matching criteria." } }' |
 * sort -t "*" -k 1n
 * 
 */
////////////////////////////////