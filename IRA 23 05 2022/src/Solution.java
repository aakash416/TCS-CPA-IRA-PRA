import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;

		// search on telegram @codewithvirus
		Hostel codewithvirus[] = new Hostel[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int vacinness = sc.nextInt();
			sc.nextLine();
			double moths = sc.nextDouble();
			sc.nextLine();
			codewithvirus[i] = new Hostel(id, name, vacinness, moths);
		}
		String fs1 = sc.nextLine();
		double fs2 = sc.nextDouble();

		int ans1 = codewithvirus2(codewithvirus, fs1);

		if (ans1 != 0) {
			System.out.println(ans1);
		} else {
			System.out.println("There is no such Hostel available.");

		}

		Hostel p = null;

		Hostel temp = null;
		for (int i = 0; i < codewithvirus.length; i++) {
			for (int j = i + 1; j < codewithvirus.length; j++) {
				if (codewithvirus[i].getMoths() > codewithvirus[j].getMoths()) {
					temp = codewithvirus[i];
					codewithvirus[i] = codewithvirus[j];
					codewithvirus[j] = temp;
				}
			}
		}
		int a = 0;
		for (int i = 0; i < codewithvirus.length; i++) {
			if (codewithvirus[i].getMoths() < fs2) {
				System.out.println(codewithvirus[i].getName());
				a++;
			}

		}
		if (a == 0) {
			System.out.println("No Hostel found.");

		}

	}

	public static int codewithvirus2(Hostel[] d, String s) {
		int p = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getName().equalsIgnoreCase(s)) {
				p = d[i].getVacinness();
				break;
			}

		}
		return p;
	}

}

class Hostel {
	private int id;
	private String name;
	private int vacinness;
	private double moths;

	public Hostel(int id, String name, int vacinness, double moths) {
		super();
		this.id = id;
		this.name = name;
		this.vacinness = vacinness;
		this.moths = moths;
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

	public int getVacinness() {
		return vacinness;
	}

	public void setVacinness(int vacinness) {
		this.vacinness = vacinness;
	}

	public double getMoths() {
		return moths;
	}

	public void setMoths(double moths) {
		this.moths = moths;
	}

}



/////////////////UNIX///////////////
/*
awk 'BEGIN{FS="/", count=0;}
{
    if($3<8000)
    {
        print $0;
        count++;}
}
END { if(count==0){
    print "No record found with matching criteria";
}
}'


*/