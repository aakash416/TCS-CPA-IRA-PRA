import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		// search on telegram @codewithvirus
		News codewithvirus[] = new News[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			int no = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int year = sc.nextInt();
;			sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			codewithvirus[i] = new News(no, name, year, price);
		}
		int year1 = sc.nextInt();
		sc.nextLine();
		String name1 = sc.nextLine();
		int ans1 = codewithvirus2(codewithvirus,year1);

		if (ans1 != 0) {
			System.out.println("Protein Sum:" + ans1);

		} else {
			System.out.println("No Corn found with mentioned attribute.");

		}
	}

	
	
	
	public static int codewithvirus2(News[] d,int a) {

		int s = 0;

		for (int i = 0; i < d.length; i++) {
			if(d[i].getYear() ==a)
			{
				s+=d[i].getPrice();
			}
		}
		return s;
	}
}

class News
{
	private int no;
	private String name;
	private int year;
	private int price;
	public News(int no, String name, int year, int price) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}