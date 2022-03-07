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
			int student = sc.nextInt();
			sc.nextLine();
			String addressh = sc.nextLine();
			int pincode = sc.nextInt();
			d[i] = new College(id, name, student, addressh, pincode);
		}
		double s = 0;
		for (int i = 0; i < n; i++) {
			s += d[i].getStudent();
		}
		double average = s / n;

		if (n != 0) {
			System.out.println("Average students " + average);
		} else {
			System.out.println("");
		}

		College temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getStudent() > d[j].getStudent()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}

		System.out.println("id-" + d[0].getId());
		System.out.println("name-" + d[0].getName());
		System.out.println("students-" + d[0].getStudent());
		System.out.println("address-" + d[0].getAddressh());
		System.out.println("pincode-" + d[0].getPincode());

	}

}

class College {
	private int id;
	private String name;
	private int student;
	private String addressh;
	private int pincode;

	public College(int id, String name, int student, String addressh, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
		this.addressh = addressh;
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

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	public String getAddressh() {
		return addressh;
	}

	public void setAddressh(String addressh) {
		this.addressh = addressh;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}



/*///////////////////////////////////////////////////////////
  
 UNIX CODE
 
/////////////////////////////////////////////////////////////
awk 'BEGIN{FS="|";c=0}
{
    if($3>20) 
    {
        print $1"|"$2"|"$3"|"$4;
        c++;
    }
}
END
    {
        if(c==0) 
        {
            print"No record found with matching criteria."
        }
    }'

*/
/////////////////////////////////////////////////////////////