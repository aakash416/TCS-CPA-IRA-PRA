import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		College d[] = new College[n];

		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int contactno = sc.nextInt();
			sc.nextLine();
			String address = sc.nextLine();
			int pincode = sc.nextInt();
			sc.nextLine();
			d[i] = new College(id, name, contactno, address, pincode);
		}
		String fs1 = sc.nextLine();
		
		College temp = null;
	        for (int i = 0; i < d.length; i++) {
	            for (int j = i + 1; j < d.length; j++) {
	                if (d[i].getPincode() > d[j].getPincode()) {
	                    temp = d[i];
	                    d[i] = d[j];
	                    d[j] = temp;
	                }
	            }
	        }
	        
	        System.out.println("id-"+d[n-1].getId());
	        System.out.println("id-"+d[n-1].getName());
	        System.out.println("id-"+d[n-1].getContactno());
	        System.out.println("id-"+d[n-1].getAddress());
	        System.out.println("id-"+d[n-1].getPincode());

	}

}

class College {
	private int id;
	private String name;
	private int contactno;
	private String address;
	private int pincode;

	public College(int id, String name, int contactno, String address, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.contactno = contactno;
		this.address = address;
		this.pincode = pincode;
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

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}