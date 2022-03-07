import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		Stationery d[] = new Stationery[n];

		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			int quantit = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			d[i] = new Stationery(id, quantit, name, price);
		}
		int fs1 = sc.nextInt();

		Stationery temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getPrice() > d[j].getPrice()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		if (n != 0) {
			System.out.println("id-" + d[n - 1].getId());
			System.out.println("quantity-" + d[n - 1].getQuantit());
			System.out.println("name-" + d[n - 1].getName());
			System.out.println("price-" + d[n - 1].getPrice());
		} else {
			System.out.println("No Stationery found with mentioned attribute");

		}

		Stationery ans2 = searchbyid(d, fs1);

		if (ans2 != null) {
			System.out.println("id-" + ans2.getId());
			System.out.println("quantity-" + ans2.getQuantit());
			System.out.println("name-" + ans2.getName());
			System.out.println("price-" + ans2.getPrice());
		} else {
			System.out.println("No Stationery found with mentioned attribute");

		}

	}

	public static Stationery searchbyid(Stationery[] fabrics, int fs1) {
		Stationery b = null;
		int s = 0, abc = 1;
		for (int i = 0; i < fabrics.length; i++) {
			if (fabrics[i].getId() == fs1) {

				b = fabrics[i];

			}
		}
		return b;
	}
}

class Stationery {
	private int id;
	private int quantit;
	private String name;
	private int price;

	public Stationery(int id, int quantit, String name, int price) {
		super();
		this.id = id;
		this.quantit = quantit;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantit() {
		return quantit;
	}

	public void setQuantit(int quantit) {
		this.quantit = quantit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}



///////////////////////// UNIX ///////////////
/*

awk 'BEGIN{FS=",";OFS="#";count = 0;IGNORECASE = 1}
{
    if($5 == "yes"){
        if($3 > 60){
            print $2,$3
            count = count + 1
        }
    }
}END{
    if(count == 0){
        print "No records found"
    }
    else{
        print count
    }
}'
*/
///////////////////////////////////////