import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;
		Student d[] = new Student[n];
		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int score = sc.nextInt();
			sc.nextLine();
			String Cname = sc.nextLine();

			d[i] = new Student(id, name, score, Cname);
		}

		String Cname1 = sc.nextLine();
		Student ans1 = searchbyid(d, Cname1);
		if (ans1 != null) {
			System.out.println(ans1.getId());
			System.out.println(ans1.getName());
			System.out.println(ans1.getScore());
			System.out.println(ans1.getCname());

		} else {
			System.out.println("No such student found");

		}
		Student ans2 = searchbyid1(d, Cname1);
		if (ans2 != null) {
			System.out.println(ans2.getId());
			System.out.println(ans2.getName());
			System.out.println(ans2.getScore());
			System.out.println(ans2.getCname());

		} else {
			System.out.println("No such student found");

		}

	}

	public static Student searchbyid(Student[] d, String lastvalue) {
		Student b = null;

		Student temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getScore() > d[j].getScore()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		for (int i = 0; i < d.length; i++) {
			if (d[i].getCname().equalsIgnoreCase(lastvalue))

			{
				b = d[i];
				break;

			}
		}

		return b;
	}

	public static Student searchbyid1(Student[] d, String lastvalue) {
		Student b = null;
		int s = 0;
		Student temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getScore() < d[j].getScore()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		for (int i = 0; i < d.length; i++) {
			if (d[i].getScore() % 2 != 0 && d[i].getScore() > 500)

			{
				if (s == 1) {
					b = d[i];
					break;
				}
				s++;

			}
		}

		return b;
	}

}

class Student {
	private int id;
	private String name;
	private int score;
	private String Cname;

	public Student(int id, String name, int score, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		Cname = cname;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

}


/////////////////////// UNIX //////////////////////////
/*
awk 'BEGIN 
{ 
    FS="&", count=0,c=0; 
    } 
    { 
    if(tolower($3)=="banking" && tolower($4)=="2nd") 
    { 
    c++; 
    } 
    } 
END {  
    if(c==0) 
    { 
        print "No records found"; 
        } 
    else 
    { 
        print c; 
        } 
}'

*/

/////////////////////////////////