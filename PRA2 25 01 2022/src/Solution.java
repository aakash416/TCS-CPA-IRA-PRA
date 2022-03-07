import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Doctor d[] = new Doctor[n];

        for (int i = 0; i < d.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double salary=sc.nextDouble();
            sc.nextLine();
            int age = sc.nextInt();
            d[i] = new Doctor(id, name, salary, age);
        }
        
        String fs1 = sc.nextLine();

        Doctor temp = null;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i].getAge() > d[j].getAge()) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        if(n!=0)
        {
        System.out.println("id-" + d[n-1].getId());
            System.out.println("name-" + d[n-1].getName());
            System.out.println("salary-" + d[n-1].getSalary());
            System.out.println("age-" + d[n-1].getAge());
        
        }
        else
        {
            System.out.println("No Doctor found with mentioned attribute.");

        }
        Doctor ans= searchbyid1(d,fs1);
        
      
        
        if(ans!=null)
        {
            System.out.println("id-" + ans.getId());
            System.out.println("name-" + ans.getName());
            System.out.println("salary-" + ans.getSalary());
            System.out.println("age-" + ans.getAge());
        }
        else
        {
            System.out.println("No Doctor found with mentioned attribute.");

        }
        
    }
    
    
    
     public static Doctor searchbyid1(Doctor[] d, String fs1) {
         Doctor b = null;
            
            for(int i=0;i<d.length;i++)
            {
            if (d[i].getName().equalsIgnoreCase(fs1)) 
                {
                    b=d[i];
                }
                    
            }
            
            return b;
        }

}


class Doctor
{
    private int id;
    private String name;
    private double salary;
    private int age;
    public Doctor(int id, String name, double salary, int age) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    

}



////////////////UNIX //////////////

/*
awk 'BEGIN{FS="|";IGNORECASE=1;c=0}
{
    split($3,a," ")
    if(a[1]=="tata" && $4>15)
    {
        print($1","$3","$5);
        }
}'


*/