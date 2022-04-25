import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;

		// search on telegram @codewithvirus
		Theatre codewithvirus[] = new Theatre[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int num = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();

			int cap = sc.nextInt();
			sc.nextLine();
			int rating = sc.nextInt();
			sc.nextLine();
			String Type = sc.nextLine();

			codewithvirus[i] = new Theatre(num, name, cap, rating, Type);
		}
		int num1 = sc.nextInt();
		sc.nextLine();
		String Type1 = sc.nextLine();

		int ans1 = codewithvirus2(codewithvirus, num1);

		if (ans1 != 0) {
			System.out.println(ans1);

		} else {
			System.out.println("No Fabric found with mentioned attribute.");

		}

		Theatre ans2 = codewithvirus1(codewithvirus, Type1);

		if (ans2 != null) {
			System.out.println(ans2.getName());
			System.out.println(ans2.getRating());

		} else {
			System.out.println("No Fabric found with mentioned attribute.");

		}

	}

	public static int codewithvirus2(Theatre[] d, int num) {
		int p = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getNum() == num) {
				p = d[i].getCap();
				break;
			}

		}
		return p;
	}

	public static Theatre codewithvirus1(Theatre[] d, String s) {

		Theatre p = null;

		Theatre temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getRating() > d[j].getRating()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}

		int a = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getType().equalsIgnoreCase(s)) {
				a++;
				if (a == 2) {
					p = d[i];
					break;
				}
			}

		}
		return p;

	}

}

class Theatre {
	private int num;
	private String name;
	private int cap;
	private int rating;
	private String Type;

	public Theatre(int num, String name, int cap, int rating, String type) {
		super();
		this.num = num;
		this.name = name;
		this.cap = cap;
		this.rating = rating;
		Type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}



//////////////////////// UNIX /////////////////
/*

awk 'BEGIN{FS="-";c=0}
{split($4,ar,"/");
if($3=="RCB")
{c++;
print $1, $2, ar[3];
}
}END{if(c==0) 
{print"No date found"}}'


*/