import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in); // creating object of scanner class

        int n = 4; // calling nextInt() method of Scanner class to accept number of lawyer objects

        Shivaksjdsfdlhjb d[] = new Shivaksjdsfdlhjb[n]; // n represents size of the array

        for (int i = 0; i < d.length; i++) {
            int feedid = sc.nextInt(); // accept id
            sc.nextLine();
            String name = sc.nextLine(); // accept name
            int count = sc.nextInt();
            sc.nextLine();
            int feedQun = sc.nextInt();
            sc.nextLine();
            d[i] = new Shivaksjdsfdlhjb(feedid, name, count, feedQun); // creating object
        }
        int fs1 = sc.nextInt();
        sc.nextLine();
        int fs2 = sc.nextInt();
        
        
        
         int sum = 0, avg ;
        int a = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i].getCount() < fs1) {
                sum += d[i].getCount();
                a++;
            }
        }
       
        
try
{
            avg = sum / a;

        // int ans1 = findAverageAgeOfLawyer(d, fs1); // calling method1
        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("No record found.");
        }
    }
    catch (ArithmeticException e) {
                    System.out.println("No record found.");

    }
        
        
        
        
        
        
        Shivaksjdsfdlhjb temp=null;
         for (int i = 0; i < d.length; i++) {     
                for (int j = i+1; j < d.length; j++) {     
                   if(d[i].getFeedQun() > d[j].getFeedQun()) {    
                       temp = d[i];    
                       d[i] = d[j];    
                       d[j] = temp;    
                   }     
                }     
            } 
         
         int b=0;
        for(int i=0;i<d.length;i++)
        {
            if(d[i].getFeedQun()<fs2)
            {
            System.out.println(d[i].getName());
            b++;

            }
            
        }
        
        if(b==0)
        {
            System.out.println("No record found with mentioned attribute.");

        }
        

    }

    
    
    
    
    
    // public static int findAverageAgeOfLawyer(Shivaksjdsfdlhjb[] ar, int fs1) {
    //     int sum = 0, avg = 0;
    //     int a = 0;
    //     for (int i = 0; i < ar.length; i++) {
    //         if (ar[i].getCount() < fs1) {
    //             sum += ar[i].getCount();
    //             a++;
    //         }
    //     }
    //     avg = (sum / a);
    //     return avg;
    // }

}

class Shivaksjdsfdlhjb {

    private int feedid;
    private String name;
    private int count;
    private int feedQun;

    public Shivaksjdsfdlhjb(int feedid, String name, int count, int feedQun) {
        super();
        this.feedid = feedid;
        this.name = name;
        this.count = count;
        this.feedQun = feedQun;
    }

    public int getFeedid() {
        return feedid;
    }

    public void setFeedid(int feedid) {
        this.feedid = feedid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFeedQun() {
        return feedQun;
    }

    public void setFeedQun(int feedQun) {
        this.feedQun = feedQun;
    }

}