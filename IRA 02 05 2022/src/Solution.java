import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;

		// search on telegram @codewithvirus
		Crop codewithvirus[] = new Crop[n];
		for (int i = 0; i < codewithvirus.length; i++) {
			String ctype = sc.nextLine();
			String cname = sc.nextLine();
			String hmonth = sc.nextLine();
			double period = sc.nextDouble();
			sc.nextLine();
			codewithvirus[i] = new Crop(ctype, cname, hmonth, period);
		}
		String fs1 = sc.nextLine();
		double fs2 = sc.nextDouble();
		double ans1 = codewithvirus2(codewithvirus, fs1);

		if (ans1 != 0) {
			System.out.println(ans1);

		} else {
			System.out.println("There is no such Crop available.");

		}

		Crop temp = null;
		for (int i = 0; i < codewithvirus.length; i++) {
			for (int j = i + 1; j < codewithvirus.length; j++) {
				if (codewithvirus[i].getPeriod() > codewithvirus[j].getPeriod()) {
					temp = codewithvirus[i];
					codewithvirus[i] = codewithvirus[j];
					codewithvirus[j] = temp;
				}
			}
		}
		int c = 0;
		for (int i = 0; i < codewithvirus.length; i++) {
			if (codewithvirus[i].getPeriod() <= fs2) {
				System.out.println(codewithvirus[i].getCname());
				System.out.println(codewithvirus[i].getHmonth());
				c++;

			}

		}
		if (c == 0) {
			System.out.println("No Crop found.");

		}

	}

	public static double codewithvirus2(Crop[] d, String s) {
		double p = 0;
		int ab = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i].getCtype().equalsIgnoreCase(s)) {
				p += d[i].getPeriod();
				ab++;
			}

		}
		if (ab == 0)
			return 0;
		return p / ab;
	}

}

class Crop {
	private String ctype;
	private String cname;
	private String hmonth;
	private double period;

	public Crop(String ctype, String cname, String hmonth, double period) {
		super();
		this.ctype = ctype;
		this.cname = cname;
		this.hmonth = hmonth;
		this.period = period;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getHmonth() {
		return hmonth;
	}

	public void setHmonth(String hmonth) {
		this.hmonth = hmonth;
	}

	public double getPeriod() {
		return period;
	}

	public void setPeriod(double period) {
		this.period = period;
	}

}

///////////////////// UNIX /////////////////////
/*
 * awk 'BEGIN{FS=":", deep=0;} { if(tolower($3)=="may") { print $0; deep++;} }
 * END { if(deep==0){ print "No record found with matching criteria"; } }'
 * 
 * 
 */

////////////////////////////////////////////////