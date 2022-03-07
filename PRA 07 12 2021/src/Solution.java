import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = 5;

		Bill d[] = new Bill[n];

		for (int i = 0; i < d.length; i++) {
			int billid = sc.nextInt();
			sc.nextLine();
			String CusName = sc.nextLine();
			int uits = sc.nextInt();
			sc.nextLine();
			d[i] = new Bill(billid, CusName, uits);
		}

		char c = sc.next().charAt(0);

		int m1 = findcount(d, c);
		if (m1 != 0) {
			System.out.println(m1);

		} else {
			System.out.println("No bill in the given category");
		}

	}

	public static int findcount(Bill[] ar, char ch) {
		int c = 0;
		if (ch == 'A' || ch == 'a') {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i].getUits() >= 1000) {
					c++;
				}
			}
		} else if (ch == 'B' || ch == 'b') {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i].getUits() >= 500 && ar[i].getUits() < 1000) {
					c++;
				}
			}
		} else if (ch == 'C' || ch == 'c') {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i].getUits() < 500) {
					c++;
				}
			}
		}
		return c;
	}
	
	
	
//	public static Bill getsecondlowestnumberofcustumerbank(Bill[] d, char c) {
//
//		Bill aa = null;
//		for (int i = 0; i < d.length; i++) {
//	
//			if (d[i].getBankNmae().equalsIgnoreCase(name)) {
//				aa = d[i];
//				break;
//			}
//		}
//
//		return aa;
//
//	}

}

class Bill {
	private int billid;
	private String CusName;
	private int uits;

	public Bill(int billid, String cusName, int uits) {
		super();
		this.billid = billid;
		CusName = cusName;
		this.uits = uits;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public String getCusName() {
		return CusName;
	}

	public void setCusName(String cusName) {
		CusName = cusName;
	}

	public int getUits() {
		return uits;
	}

	public void setUits(int uits) {
		this.uits = uits;
	}

}