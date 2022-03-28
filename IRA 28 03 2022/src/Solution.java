import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		// search on telegram @codewithvirus
		Photo codewithvirus[] = new Photo[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			int length = sc.nextInt();
			sc.nextLine();
			int breath = sc.nextInt();
			sc.nextLine();
			String material = sc.nextLine();
			codewithvirus[i] = new Photo(id, length, breath, material);
		}

		String fs1 = sc.nextLine();

		double ans1 = codewithvirus2(codewithvirus, fs1);

		if (ans1 != 0) {
			System.out.println(ans1);

		} else {
			System.out.println("No such Photo Frame available.");

		}

		Photo ans = codewithvirus1(codewithvirus);

		if (ans != null) {
			System.out.println("Id-" + ans.getId());
			System.out.println("Length-" + ans.getLength());
			System.out.println("Breadth-" + ans.getBreath());
			System.out.println("Material-" + ans.getMaterial());

		} else {
			System.out.println("No such Photo Frame available.");

		}
	}

	public static double codewithvirus2(Photo[] d, String s) {

		double ans = 0;
		double ans1 = 0;
		int c = 0;
		int ab = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getMaterial().equalsIgnoreCase(s)) {
				ans1 += d[i].getLength() * d[i].getBreath();
				c++;
			}

		}
		ans = ans1 / c;

		if (ans >= 25) {
			ans = ans1 / c;
			return ans;
		} else {
			return 0;

		}
	}

	public static Photo codewithvirus1(Photo[] d) {

		Photo p = null;

		Photo temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getBreath() > d[j].getBreath()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}

		if (d[d.length - 2].getLength() < 5 && d[d.length - 2].getBreath() < 5) {
			return p = null;
		} else {
			p = d[d.length - 2];
			return p;
		}
	}

}

class Photo {
	private int id;
	private int length;
	private int breath;
	private String material;

	public Photo(int id, int length, int breath, String material) {
		super();
		this.id = id;
		this.length = length;
		this.breath = breath;
		this.material = material;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}