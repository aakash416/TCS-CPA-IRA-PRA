import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // creating object of scanner class

		int n = 5; // calling nextInt() method of Scanner class to accept number of lawyer objects

		TOy d[] = new TOy[n]; // n represents size of the array

		for (int i = 0; i < d.length; i++) {
			int toyid = sc.nextInt(); // accept id
			sc.nextLine();
			String toyName = sc.nextLine(); // accept name
			String category = sc.nextLine(); // accept name
			double price = sc.nextDouble();
			sc.nextLine();
			double discount = sc.nextDouble();
			d[i] = new TOy(toyid, toyName, category, price, discount); // creating object
		}
		sc.nextLine();
		String fs1 = sc.nextLine();
		String fs2 = sc.nextLine();

		int ans1 = findtotalstock(d, fs1);

		if (ans1 > 0) {
			System.out.println(ans1);

		} else {
			System.out.println("Category doesn't exist");
		}

		TOy ans2 = searchbyid(d, fs2);

		if (ans2 != null) {
			System.out.println(ans2.getToyid());
			System.out.println(ans2.getToyName());
			System.out.println(ans2.getCategory());
		} else {
			System.out.println("No Match found for the Category");

		}

	}

	public static int findtotalstock(TOy[] Sanitize, String fs1) {

		int sum = 0;
		for (int i = 0; i < Sanitize.length; i++) {

			if (Sanitize[i].getCategory().equalsIgnoreCase(fs1))
				sum++;

		}
		return sum;

	}

	public static TOy searchbyid(TOy[] fabrics, String fs2) {
		TOy b = null;
		double d = 0;
		double a[] = new double[fabrics.length];// declaration and instantiation

		for (int i = 0; i < fabrics.length; i++) {
			if (fabrics[i].getCategory().equalsIgnoreCase(fs2)) {
				d = (fabrics[i].getPrice() * fabrics[i].getDiscount()) / 100;
				b = fabrics[i];
				break;

			}
		}

		return b;
	}

}

class TOy {
	private int toyid;
	private String toyName;
	private String category;
	private double price;
	private double discount;

	public TOy(int toyid, String toyName, String category, double price, double discount) {
		super();
		this.toyid = toyid;
		this.toyName = toyName;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}

	public int getToyid() {
		return toyid;
	}

	public void setToyid(int toyid) {
		this.toyid = toyid;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
// Xplore IRA Java_19 july 2021

/*
 * input 101 Blix Puzzle 100.0 10.0 102 SoftBall Doll 150.0 12.0 103 Lira Wiggle
 * 95.0 2.0 104 TeddyBear Doll 1525.0 12.0 105 RubikCube Puzzle 1500.0 15.0
 * Puzzle Doll
 * 
 * output 2 102 SoftBall Doll
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * D_ID;D_Name;No_of_Students 1;Electrical;30 2;Civil;40 3;CSE;80
 * 4;Mechanical;10 5;ECE;30
 * 
 * 
 * 
 * 
 * 
 * 
 * 1) Find the occurrences of word and print its occurrence count. grep –o –i
 * “unix” myfile| wc –l
 * 
 * 
 * 2) To count the numbers of words in the first 3 lines of a file. head –n3
 * filename|wc -w
 * 
 * 3) Find sum of even numbers in the given list read nes=0for((i = 1 ; i <= n ;
 * i++)) doread noif [ `expr $no % 2` = 0 ]thenes=`expr $es + $no`fidoneecho
 * “Total = “$es
 * 
 * Input (stdin)•
 * 
 * 4
 * 
 * 1
 * 
 * 2
 * 
 * 5
 * 
 * 6
 * 
 * Your Output (stdout) Total = 8
 * 
 * 4) Highest score. To find the highest score in and print the name of the max
 * score obtained. sort -n -k3 | tail -n1 |awk ‘{print $2}’ input: RollNo Name
 * Score•
 * 
 * 234 ABC 70•
 * 
 * 567 QWE 12•
 * 
 * 457 RTE 56•
 * 
 * 234 XYZ 80•
 * 
 * 456 ERT 45 Your Output (stdout) XYZ Expected Output XYZ
 * 
 * 5) To find the count of salary that are less than the average salary of
 * employees in the given list.
 * 
 * awk -F’;’ ‘NR>1{e[$1]=$3;s+=$3}END{avg=s/(NR-1);for(x in
 * e)if(e[x<avg)c++;print c}’
 * 
 * Input (stdin) EmpID;EmpName;Salary
 * 
 * 100;A;30000
 * 
 * 102;B;45000•
 * 
 * 103;C;15000•
 * 
 * 104;D;40000 Your Output (stdout)• 2
 * 
 * 2020 OPA Student details are stored in a file in the following format .
 * Fields in the file are separated by comma(,).If the input file has following
 * data:
 * 
 * Roll,Name,Subject,Score
 * 
 * 101,Adam,CsC,30
 * 
 * 102,Juhi,Math,78
 * 
 * 101,Adam,Math,90
 * 
 * 103,Adam,Math,50
 * 
 * 101,Adam,CHM,50
 * 
 * 102,Juhi,CsC,50 Expected Output: 102 103 Here the above output related
 * students have failed only in one subject
 * 
 * Solutions:
 * 
 * awk ‘BEGIN{FS=”,”;}{if($4<60){a[$1]+=1;}}END{for(i in
 * a){if(a[i]==1){print(i)}}}’ 2. Fetch employee ,skill wise Skill details are
 * stored in comma separated.
 * 
 * Test case Input
 * 
 * 
 * 1,Raja,Python,Oracle 2,Latha,Oracle,Python 3,Raghu,Python,MySQL
 * 4,Likit,MySQL,Oracle 5,Latha,Python,Oracle
 * 
 * 
 * Test case output: 5&Latha&Python&Oracle l&Raja&Python&Oracle
 * 
 * In the input list of employees, there are two records with the given primary
 * and secondary skill and the records displayed in the ascending order of Name.
 * Hence record of Latha is displayed as first then record of Raja.
 * 
 * Solutions:
 * 
 * awk ‘BEGIN {FS=”,”} {if($3==”Python” && $4==”Oracle”) {print
 * $1″&”$2″&”$3″&”$4}}’| sort -k2 -r
 * 
 * 3.Fetch Store records ,Profit wise Store details are stored in comma
 * separated format.
 * 
 * Test case Input
 * 
 * 1,RamsDeptStore,Stationary,100,50
 * 
 * 2,RajStore,Departmental,85,81
 * 
 * 3,HealthyStore,Grocery,95,97
 * 
 * 4,MiniStore,Medical,60,55
 * 
 * ​
 * 
 * Test case output:
 * 
 * 1|RamsDeptStore|Stationary|100|50 |50
 * 
 * 4|MiniStore|Medical|60|55|5
 * 
 * 2|RajStore|Departmental|85|81 |4
 * 
 * Solutions:
 * 
 * sort -k5 -n -t “,” | awk ‘BEGIN {FS=”,”} { if(($4-$5>0)) {print
 * $1″|”$2″|”$3″|”$4″|”$5″|”$4-$5}}’
 * 
 * 4. Fetch Store records ,Profit wise Store details are stored in comma
 * separated format
 * 
 * Test case Input: 1,RamsDeptStore,Stationary,100,50
 * 2,RajStore,Departmental,85,80 3,HealthyStore,Grocery,95,92
 * 4,MiniStore,Medical,60,55
 * 
 * 
 * Test case output:
 * 
 * 2|RajStorepepartmental|85|80 3|HealthyStorelGrocery|95|92
 * 
 * solutions:
 * 
 * sort -k3 -n -t “,” | awk ‘BEGIN {FS=”,”} { if(($5>=80)) {print
 * $1″|”$2″|”$3″|”$4″|”$5}}’
 * 
 * 5. Student details are stored in comma separated format.
 * 
 * Sample test case Test case Input
 * 
 * 
 * 1,RajaR,9,60,85,SM 2,Pooja,10,85,80,DAV 3,RaghuRam,10,95,92,DAV
 * 4,Akhil,9,60,55,SM 5,Bharath,10,80,88,SM 6,Chandra,9,75,92,DAV
 * 
 * 
 * Test case output:
 * 
 * 1|RajaR|9|60|85|SM
 * 
 * 6|Chandra|9|75|92|DAV
 * 
 * 5|Bharath|10|80|88|SM
 * 
 * sort -k3 -n -t “,” | awk ‘BEGIN{FS=”,”};{if(($5>80 && $5>$4)) {print $1 “|”
 * $2 “|” $3 “|” $4 “|” $5 “|” $6}}’ 6.Student details are stored in comma
 * separated format
 * 
 * Sample input:
 * 
 * Roll no,Name,Subject1_Score,Subject2_Score 101,kumar,80,75 102,suresh,50,35
 * 103,ramesh,35,80 104,shiva,82,77
 * 
 * sample output:
 * 
 * 104 shiva 79.5
 * 
 * 101 kumar 77.5
 * 
 * Solutions:
 * 
 * read
 * 
 * awk ‘BEGIN{FS=”,”} { if($3>50 && $4>40) { avg=($3+$4)/2; if(avg>=75) print
 * $1,$2,avg}}’|sort -k3 -nr
 * 
 * 7. OPA-Java-Unix : Student Details
 * 
 * Test case Input
 * 
 * ​
 * 
 * Roll No,Name,Score1,Score2
 * 
 * 123,Hari,87,78
 * 
 * 367,Madhav,40,50
 * 
 * 400,Naina,99,87
 * 
 * 567,Amy,35,68
 * 
 * 812,Ravi,58,98
 * 
 * Test case output
 * 
 * 400 Naina
 * 
 * 123 Hari
 * 
 * 812 Ravi
 * 
 * 567 Amy
 * 
 * Solutions:
 * 
 * read
 * 
 * awk -F “,” ‘{s=$3+$4; if (s>99) {print $1,$2,s}}’| sort -k3rn|cut -d ‘ ‘
 * -f1,2
 * 
 * 8. Find and display the average number of characters per word in the string.
 * 
 * test case Input:
 * 
 * Welcome to this tutorial on Unix where we are practicing some commands
 * 
 * test case output:
 * 
 * 5
 * 
 * Solutions:
 * 
 * ​readarray f first=$(echo $f |wc -w ) second=$(echo $f | wc -c ) k=$((
 * second/first )) echo $k
 * 
 * 9. Covert time to seconds
 * 
 * eg1: input recored for player:
 * 
 * 780|Papu|0:89
 * 
 * 102|Babu|1:47
 * 
 * 103 |lalu|2
 * 
 * 104|kalu|
 * 
 * output:
 * 
 * 780 Papu 89
 * 
 * 102 Babu 107
 * 
 * 103 lalu 120
 * 
 * 104 kalu 0
 * 
 * ANS:
 * 
 * read tr “:” “|” | awk ‘BEGIN{FS=”|”;}{print $1,$2,$3*60+$4}’
 * 
 */
