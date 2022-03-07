import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;
	
		// search on telegram @codewithvirus
		Fabric codewithvirus[] = new Fabric[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int avi = sc.nextInt();
			sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine();
			codewithvirus[i] = new Fabric(id, name, avi, price);
		}
		String fs1 = sc.nextLine();
		// search on telegram @codewithvirus
		Fabric ans = codewithvirus1(codewithvirus);

		if (ans != null) {
			System.out.println("id-" + ans.getId());
			System.out.println("name-" + ans.getName());
			System.out.println("availableStock-" + ans.getAvi());
			System.out.println("price-" + ans.getPrice());

		} else {
			System.out.println("No Fabric found with mentioned attribute.");

		}
		// search on telegram @codewithvirus
		Fabric ans1 = codewithvirus2(codewithvirus, fs1);

		if (ans1 != null) {
			System.out.println("id-" + ans1.getId());
			System.out.println("name-" + ans1.getName());
			System.out.println("availableStock-" + ans1.getAvi());
			System.out.println("price-" + ans1.getPrice());

		} else {
			System.out.println("No Fabric found with mentioned attribute.");

		}

	}
	// search on telegram @codewithvirus
	public static Fabric codewithvirus1(Fabric[] d) {

		Fabric p = null;

		Fabric temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getPrice() > d[j].getPrice()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		if (d.length > 1)
			p = d[d.length - 1];

		return p;
	}
	// search on telegram @codewithvirus
	public static Fabric codewithvirus2(Fabric[] d, String s) {
		Fabric p = null;
		int ab = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getName().equalsIgnoreCase(s)) {
				p = d[i];
				break;
			}

		}
		return p;
	}
}
// search on telegram @codewithvirus
class Fabric {
	private int id;
	private String name;
	private int avi;
	private double price;


	public Fabric(int id, String name, int avi, double price) {
		super();
		this.id = id;
		this.name = name;
		this.avi = avi;
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


	public int getAvi() {
		return avi;
	}


	public void setAvi(int avi) {
		this.avi = avi;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


}

// search on telegram @codewithvirus


////////////////////UNIX///////////////////

/*



awk 'BEGIN{FS="#";IGNORECASE=1;count=0;}
{
    if($3>25){
        count+=1;
    }
}
END{
print "Total count: "  count;}
'

*/