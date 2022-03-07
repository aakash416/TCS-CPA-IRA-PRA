import java.util.Scanner;

class Bird {

	private int feedid;
	private String name;
	private int count;
	private int feedQun;

	public Bird(int feedid, String name, int count, int feedQun) {
		super();
		this.feedid = feedid;
		this.name = name;
		this.count = count;
		this.feedQun = feedQun;
	}

	public int getFeedid() {
		return feedid;
	}

	public void setFeedid(int feedid) {
		this.feedid = feedid;
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

	public int getFeedQun() {
		return feedQun;
	}

	public void setFeedQun(int feedQun) {
		this.feedQun = feedQun;
	}

}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 

		int n = 4; 

		Bird d[] = new Bird[n]; 

		for (int i = 0; i < d.length; i++) {
			int feedid = sc.nextInt(); 
			sc.nextLine();
			String name = sc.nextLine(); 
			int count = sc.nextInt();
			sc.nextLine();
			int feedQun = sc.nextInt();
			sc.nextLine();
			d[i] = new Bird(feedid, name, count, feedQun);
		}
		int fs1 = sc.nextInt();
		sc.nextLine();
		int fs2 = sc.nextInt();

		int sum = 0, avg;
		int a = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getCount() < fs1) {
				sum += d[i].getCount();
				a++;
			}
		}

		try {
			avg = sum / a;

			if (avg != 0) {
				System.out.println(avg);
			} else {
				System.out.println("No record found.");
			}
		} catch (ArithmeticException e) {
			System.out.println("No record found.");

		}

		Bird temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getFeedQun() > d[j].getFeedQun()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}

		int b = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getFeedQun() < fs2) {
				System.out.println(d[i].getName());
				b++;

			}

		}

		if (b == 0) {
			System.out.println("No record found with mentioned attribute.");

		}

	}

}
