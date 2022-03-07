import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = 4;
        Corn d[] = new Corn[n];
        for (int i = 0; i < d.length; i++) {
            String ct = sc.nextLine();
            String cn = sc.nextLine();
            double protine = sc.nextDouble();
            sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            d[i] = new Corn(ct, cn, protine, price);
        }

        String ct1 = sc.nextLine();
        int price1 = sc.nextInt();

        double ans1 = searchbyid(d, ct1);

        if (ans1 != 0) {
            System.out.println(ans1);

        } else {
            System.out.println("There is no such Corn available.");
        }
        
        
        Corn temp = null;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i].getPrice() > d[j].getPrice()) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        
        
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(d[i].getPrice()<price1)
            {
                System.out.println(d[i].getCn());
                a++;

            }
        }
        if(a==0)
        {
            System.out.println("No Corn found.");

        }

    }

    public static double searchbyid(Corn[] fabrics, String ct1) {
        double b = 0;
        double s = 0, a = 0;
        for (int i = 0; i < fabrics.length; i++) {
            if (fabrics[i].getCt().equalsIgnoreCase(ct1)) {

                s += fabrics[i].getProtine();
                a++;
            }
        }
        if (a == 0) {
            return 0;
        } else {
            b = s / a;
            return b;
        }
    }

}

class Corn {
    private String ct;
    private String cn;
    private double protine;
    private int price;

    public Corn(String ct, String cn, double protine, int price) {
        super();
        this.ct = ct;
        this.cn = cn;
        this.protine = protine;
        this.price = price;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public double getProtine() {
        return protine;
    }

    public void setProtine(double protine) {
        this.protine = protine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}




/////////////////// UNIX ///////////////


/*

awk 'BEGIN{FS="#", count=0;}
{
    if($3>25)
    {count+=$3;}
}
END { if(count!=0){print "Total count: " count;
}
else
{
    print "Total count: 0";
}}'



*/