import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;

		// search on telegram @codewithvirus
		company codewithvirus[] = new company[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int count = sc.nextInt();
			sc.nextLine();
			double anualtrunover = sc.nextDouble();
			sc.nextLine();
			codewithvirus[i] = new company(id, name, count, anualtrunover);
		}
		double fs1 = sc.nextDouble();
		sc.nextLine();
		int fs2 = sc.nextInt();
		int ans = codewithvirus2(codewithvirus, fs1);

		if (ans != 0) {
			System.out.println(ans);

		} else {
			System.out.println("no such company found");

		}
		company ans1 = codewithvirus1(codewithvirus, fs2);

		if (ans1 != null) {
			System.out.println(ans1.getName());
			System.out.println(ans1.getAnualtrunover());

		} else {
			System.out.println("no such company exists");

		}

	}

	public static int codewithvirus2(company[] d, double s) {
		int p = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getAnualtrunover() > s) {
				p += d[i].getCount();
			}

		}
		return p;
	}

	public static company codewithvirus1(company[] d, int s) {

		company p = null;

		company temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getAnualtrunover() > d[j].getAnualtrunover()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		int a = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getCount() > s) {
				if (a == 1) {
					p = d[i];
				}
				a++;
			}

		}

		return p;
	}
}

class company {
	private int id;
	private String name;
	private int count;
	private double anualtrunover;

	public company(int id, String name, int count, double anualtrunover) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		this.anualtrunover = anualtrunover;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getAnualtrunover() {
		return anualtrunover;
	}

	public void setAnualtrunover(double anualtrunover) {
		this.anualtrunover = anualtrunover;
	}

}



//////////////UNIX//////////

/*
awk 'BEGIN{FS=";"; count=0;}
{if($3>=55 && $4>=55 && $5>=55){
count++;
    total=$3+$4+$5;
    print $2","$3","$4","$5","total;
}
}
END{if(count==0) print "No Student Found"}'





*/