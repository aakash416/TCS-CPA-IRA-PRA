import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		// search on telegram @codewithvirus
		Corn codewithvirus[] = new Corn[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double gram = sc.nextDouble();
			sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			codewithvirus[i] = new Corn(id, name, gram, price);
		}
//  search on telegram @codewithvirus
		String name1 = sc.nextLine();
		double ans1 = codewithvirus2(codewithvirus);

		if (ans1 != 0) {
			System.out.println("Protein Sum:" + ans1);

		} else {
			System.out.println("No Corn found with mentioned attribute.");

		}
		// search on telegram @codewithvirus

		Corn ans2 = codewithvirus1(codewithvirus, name1);
		if (ans2 != null) {
			System.out.println("cornId:" + ans2.getId());
			System.out.println("cornName:" + ans2.getNaem());
			System.out.println("protein:" + ans2.getGram());
			System.out.println("price:" + ans2.getPrice());

		} else {
			System.out.println("No Corn found with mentioned attribute.");

		}
		// search on telegram @codewithvirus
	}
	public static double codewithvirus2(Corn[] d) {

		double s = 0;

		for (int i = 0; i < d.length; i++) {
			s += d[i].getGram();
		}
		return s;
	}
//  search on telegram @codewithvirus
	public static Corn codewithvirus1(Corn[] d, String name1) {
		Corn b = null;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getNaem().equalsIgnoreCase(name1)) {
				b = d[i];
				break;
			}
		}
		return b;
	}
}
//search on telegram @codewithvirus

class Corn {
	private int id;
	private String naem;
	private double gram;
	private int price;
//  search on telegram @codewithvirus

	public Corn(int id, String naem, double gram, int price) {
		super();
		this.id = id;
		this.naem = naem;
		this.gram = gram;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
//  search on telegram @codewithvirus

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public double getGram() {
		return gram;
	}
//  search on telegram @codewithvirus

	public void setGram(double gram) {
		this.gram = gram;
	}

	public int getPrice() {
		return price;
	}
//  search on telegram @codewithvirus

	public void setPrice(int price) {
		this.price = price;
	}

}

////////////////////// UNIX ////////////////////
/*
 * 
 * awk 'BEGIN { FS="|", count=0,c=0; } { if($3>20) {print $1"|"$2"|"$3"|"$4;
 * c++; } } END { if(c==0) { print "No record found with matching criteria."; }
 * }'
 * 
 * 
 */