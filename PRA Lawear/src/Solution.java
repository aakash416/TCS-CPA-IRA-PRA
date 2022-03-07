import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating object of scanner class

		int n = sc.nextInt(); // calling nextInt() method of Scanner class to accept number of lawyer objects

		Lawyer d[] = new Lawyer[n]; // n represents size of the array

		for (int i = 0; i < d.length; i++) {
			int id = sc.nextInt(); // accept id
			sc.nextLine();
			String name = sc.nextLine(); // accept name
			double salary = sc.nextDouble();
			int age = sc.nextInt();
			d[i] = new Lawyer(id, name, salary, age); // creating object
		}
		sc.nextLine();
		String newname = sc.nextLine(); // accepting name of lawyer for method 2

		double l1 = findAverageAgeOfLawyer(d); // calling method1
		if (l1 != 0) {
			System.out.println("Average of age " + l1);

		} else {
			System.out.println("No Lawyer found with mentioned attribute.");
		}

		Lawyer l2 = searchLawyerByName(d, newname); // calling method 2

		if (l2 != null) {
			System.out.println("id-" + l2.getId());
			System.out.println("name-" + l2.getName());
			System.out.println("salary-" + l2.getSalary());
			System.out.println("age-" + l2.getAge());
		} else {
			System.out.println("No Lawyer found with mentioned attribute.");

		}

	}

	public static double findAverageAgeOfLawyer(Lawyer[] ar) {
		double sum = 0, avg = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i].getAge();
		}
		avg = (sum / (ar.length));
		return avg;
	}

	public static Lawyer searchLawyerByName(Lawyer[] d, String name) {

		Lawyer l3 = null;
		for (int i = 0; i < d.length; i++) {
			// System.out.println(d[i].getName());
			// System.out.println(name);
			if (d[i].getName().equalsIgnoreCase(name)) {
				l3 = d[i]; // assigning object value to l3
				break;
			}
		}

		return l3;

	}
}

class Lawyer {
	private int id;
	private String name;
	private double salary;
	private int age;

	public Lawyer(int id, String name, double salary, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}
}