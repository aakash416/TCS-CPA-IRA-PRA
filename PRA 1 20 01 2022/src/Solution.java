import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		Student d[] = new Student[n];

		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double marks = sc.nextDouble();
			int age = sc.nextInt();
			sc.nextLine();
			d[i] = new Student(id, name, marks, age);
		}
		int fs1 = sc.nextInt();
		Student ans2 = searchbyid(d, fs1);

		if (ans2 != null) {
			System.out.println("id-" + ans2.getId());
			System.out.println("name-" + ans2.getName());
			System.out.println("marks-" + ans2.getMarks());
			System.out.println("age-" + ans2.getAge());
		} else {
			System.out.println("No Student found with mentioned age.");

		}

		Student temp = null;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getMarks() > d[j].getMarks()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		if (n != 0) {
			System.out.println("id-" + d[0].getId());
			System.out.println("name-" + d[0].getName());
			System.out.println("marks-" + d[0].getMarks());
			System.out.println("age-" + d[0].getAge());
		} else {
			System.out.println("No Student found with mentioned age.");

		}

	}

	public static Student searchbyid(Student[] fabrics, int fs1) {
		Student b = null;
		int s = 0, abc = 1;
		for (int i = 0; i < fabrics.length; i++) {
			if (fabrics[i].getAge() == fs1) {

				b = fabrics[i];

			}
		}
		return b;
	}

}

class Student {
	private int id;
	private String name;
	private double marks;
	private int age;

	public Student(int id, String name, double marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}



/////////////////////// UNIX ///////////////////

/*

tr "/" " "|awk 'BEGIN{FS=" ";count = 0} 
(NR>1){ 
    if($4 == 2019){ 
        print $1,$5 
        count = count + 1; 
    } 
}END{ 
    if(count == 0){ 
        print "No orders found." 
    } 
}'


*/