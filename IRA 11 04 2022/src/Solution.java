import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;

		// search on telegram @codewithvirus
		Window codewithvirus[] = new Window[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double uFactor = sc.nextDouble();
			sc.nextLine();
			double airleek = sc.nextDouble();
			sc.nextLine();
			codewithvirus[i] = new Window(id, name, uFactor, airleek);
		}
		String fs1 = sc.nextLine();
		double fs2 = sc.nextDouble();
		// search on telegram @codewithvirus

		double ans1 = codewithvirus2(codewithvirus, fs1);

		if (ans1 != 0) {
			System.out.println(ans1);

		} else {
			System.out.println("No Window found.");

		}
		// search on telegram @codewithvirus

		Window temp = null;
		for (int i = 0; i < codewithvirus.length; i++) {
			for (int j = i + 1; j < codewithvirus.length; j++) {
				if (codewithvirus[i].getuFactor() > codewithvirus[j].getuFactor()) {
					temp = codewithvirus[i];
					codewithvirus[i] = codewithvirus[j];
					codewithvirus[j] = temp;
				}
			}
		}
		// search on telegram @codewithvirus

		int count = 0;
		for (int i = 0; i < codewithvirus.length; i++) {
			if (codewithvirus[i].getuFactor() < fs2) {
				System.out.println(codewithvirus[i].getName());
				count++;
				// search on telegram @codewithvirus
			}

		}

		if (count == 0) {
			System.out.println("No Window matches with mentioned criteria.");

		}

	}
	// search on telegram @codewithvirus

	public static double codewithvirus2(Window[] d, String s) {
		Window p = null;
		double ab = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getName().equalsIgnoreCase(s)) {
				ab = d[i].getAirleek();
				break;
			}

		}
		return ab;
	}

}
// search on telegram @codewithvirus

class Window {
	private int id;
	private String name;
	private double uFactor;
	private double airleek;

	public Window(int id, String name, double uFactor, double airleek) {
		super();
		this.id = id;
		this.name = name;
		this.uFactor = uFactor;
		this.airleek = airleek;
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

	public double getuFactor() {
		return uFactor;
	}

	public void setuFactor(double uFactor) {
		this.uFactor = uFactor;
	}

	public double getAirleek() {
		return airleek;
	}

	public void setAirleek(double airleek) {
		this.airleek = airleek;
	}

}


////////////////// UNIX////////////

/*
awk 'BEGIN{FS="-", codewithvirus=0;}
{
    if($3<250)
    {codewithvirus++;}
}
END { if(codewithvirus!=0){print "Total count: " codewithvirus;
}
else
{
    print "No Window found.";
}}'
*/