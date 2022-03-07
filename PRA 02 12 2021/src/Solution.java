import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in); // creating object of scanner class

        int n = 5;
        Employee d[] = new Employee[n]; // n represents size of the array

        for (int i = 0; i < d.length; i++) {
            int empid = sc.nextInt(); // accept id
            sc.nextLine();
            String empname = sc.nextLine(); // accept name
            int mgrld = sc.nextInt();
            sc.nextLine();

            String depname = sc.nextLine(); // accept name

            double salary = sc.nextDouble();
            d[i] = new Employee(empid, empname, mgrld, depname,salary); // creating object
        }
        
        double min = sc.nextDouble();
        double max = sc.nextDouble();

        int ans1 = findtotalstock(d,min,max);

        if (ans1 > 0) {
            System.out.println(ans1);

        } else {
            System.out.println("No Sanitizer found with mentioned attribute.");
        }
        
        
        Employee ans2 = searchbyid(d);

        if (ans2 != null) {
            System.out.println(ans2.getEmpid()+"#"+ans2.getEmpname()+"#"+ans2.getSalary());
        } else {
            System.out.println("No Sanitizer found with mentioned attribute.");

        }

    }
    
    public static int findtotalstock(Employee[] d, double min,double max) {

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            if(d[i].getSalary()>min&&d[i].getSalary()<max)
            sum ++;

        }
        return sum;

    }

    public static Employee searchbyid(Employee[] fabrics) {
        Employee b = null;
                        double a = fabrics[0].getSalary();

        for (int i = 0; i < fabrics.length; i++) {
            if (fabrics[i].getSalary()>a) {
                b = fabrics[i];
            }
        }

        
        return b;
    }

}


// for (int i = 1; i < 5; i++) {
//       max=emp.getSalary(0);
//             if (emp.getSalary(i) > max) {
//                 max = arr.getempSalary(i);
//             }
//         }


// int max = arr[0];
 
//     // Traverse array elements
//     // from second and compare
//     // every element with current max
//     for (i = 1; i < n; i++)
//         if (arr[i] > max)
//             max = arr[i];
 
//     return max;

class Employee {
    private int empid;
    private String empname;
    private int mgrld;
    private String depname;
    private double salary;

    public Employee(int empid, String empname, int mgrld, String depname, double salary) {
        super();
        this.empid = empid;
        this.empname = empname;
        this.mgrld = mgrld;
        this.depname = depname;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getMgrld() {
        return mgrld;
    }

    public void setMgrld(int mgrld) {
        this.mgrld = mgrld;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}