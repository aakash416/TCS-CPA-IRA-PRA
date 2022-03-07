import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 

		int n = 4 ;

		Bank d[] = new Bank[n]; 

		for (int i = 0; i < d.length; i++) {
			int bankid = sc.nextInt(); 
			sc.nextLine();
			String bankNmae = sc.nextLine(); 
			int numberofCustumer = sc.nextInt(); 
			sc.nextLine();
			String city = sc.nextLine(); 
			d[i] = new Bank(bankid, bankNmae, numberofCustumer, city); 
		}
		String newname = sc.nextLine();
		
		
		
		double m1 = findavgnumberofcustumerbycity(d); // calling method1
		if (m1 != 0) {
			System.out.println(m1);

		} else {
			System.out.println("Bank not found");
		}

		Bank m2 = getsecondlowestnumberofcustumerbank(d, newname); // calling method 2

		if (m2 != null) {
			System.out.println("id-" + m2.getBankid());
			System.out.println("name-" + m2.getBankNmae());
			System.out.println("salary-" + m2.getNumberofCustumer());
			System.out.println("age-" + m2.getCity());
		} else {
			System.out.println("Bank not found");

		}
		

	}
	
	
	public static double findavgnumberofcustumerbycity(Bank[] ar) {
		double sum = 0, avg = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i].getNumberofCustumer();
		}
		avg = (sum / (ar.length));
		return avg;
	}

	public static Bank getsecondlowestnumberofcustumerbank(Bank[] d, String name) {

		Bank l3 = null;
		for (int i = 0; i < d.length; i++) {
			// System.out.println(d[i].getName());
			// System.out.println(name);
			if (d[i].getBankNmae().equalsIgnoreCase(name)) {
				l3 = d[i]; // assigning object value to l3
				break;
			}
		}

		return l3;

	}

}
class Bank
{
	private int bankid;
	private String bankNmae;
	private int numberofCustumer;
	private String city;
	public Bank(int bankid, String bankNmae, int numberofCustumer, String city) {
		super();
		this.bankid = bankid;
		this.bankNmae = bankNmae;
		this.numberofCustumer = numberofCustumer;
		this.city = city;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankNmae() {
		return bankNmae;
	}
	public void setBankNmae(String bankNmae) {
		this.bankNmae = bankNmae;
	}
	public int getNumberofCustumer() {
		return numberofCustumer;
	}
	public void setNumberofCustumer(int numberofCustumer) {
		this.numberofCustumer = numberofCustumer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}