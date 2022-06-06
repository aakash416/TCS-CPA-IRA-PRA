import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;

		// search on telegram @codewithvirus
		IPL codewithvirus[] = new IPL[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String owner = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			int cup = sc.nextInt();
			sc.nextLine();
			codewithvirus[i] = new IPL(id, name, owner, price, cup);
		}
		int fs1 = sc.nextInt();
		int ans1 = codewithvirus2(codewithvirus, fs1);

		if (ans1 != 0) {
			System.out.println(ans1);
		} else {
			System.out.println("No ipl seasons won");

		}
		IPL ans2 = codewithvirus1(codewithvirus);
		if (ans2 != null) {
			System.out.println(ans2.getOwner());

		} else {
			System.out.println("No ipl seasons won");
		}
	}

	public static int codewithvirus2(IPL[] d, int s) {
		int p = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getId() == s) {
				p += d[i].getCup();
			}

		}
		return p;
	}

	public static IPL codewithvirus1(IPL[] d) {

		IPL p = null;

		IPL temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getPrice() < d[j].getPrice()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		// search on telegram @codewithvirus

		return d[1];
	}

}

class IPL {
	private int id;
	private String name;
	private String owner;
	private int price;
	private int cup;

	public IPL(int id, String name, String owner, int price, int cup) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.price = price;
		this.cup = cup;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCup() {
		return cup;
	}

	public void setCup(int cup) {
		this.cup = cup;
	}
}



/*
awk 'BEGIN{FS="|";count=0;}
{
    if(tolower(substr($4,1,2))=="dl")
    {
      print ($1":"$2":Delhi"); 
        count++;
    }
   else if(tolower(substr($4,1,2))=="gw")
    {
    print ($1":"$2":Guwahati"); 
    count++;
    }
}
END{
    if(count==0) 
    {
        print "No License records found."
    }
}' 





*/