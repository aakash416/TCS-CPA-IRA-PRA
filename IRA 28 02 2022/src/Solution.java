import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = 4;

        Sdalshfoaasfjfgsaldjf ASJFasjbfjsadbdf[] = new Sdalshfoaasfjfgsaldjf[n];
        for (int i = 0; i < ASJFasjbfjsadbdf.length; i++) {
            int no = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();
            int count = sc.nextInt();
            sc.nextLine();
            double duration = sc.nextDouble();
            sc.nextLine();
            ASJFasjbfjsadbdf[i] = new Sdalshfoaasfjfgsaldjf(no, type, count, duration);
        }

        int count1 = sc.nextInt();
        sc.nextLine();
        double duration1 = sc.nextDouble();

        int ans = ASJFasjbfjsadbdf1(ASJFasjbfjsadbdf, count1);

        if (ans != 0) {
            System.out.println(ans);

        } else {
            System.out.println("No playlist found.");

        }

        Sdalshfoaasfjfgsaldjf temp = null;
        for (int i = 0; i < ASJFasjbfjsadbdf.length; i++) {
            for (int j = i + 1; j < ASJFasjbfjsadbdf.length; j++) {
                if (ASJFasjbfjsadbdf[i].getCount() > ASJFasjbfjsadbdf[j].getCount()) {
                    temp = ASJFasjbfjsadbdf[i];
                    ASJFasjbfjsadbdf[i] = ASJFasjbfjsadbdf[j];
                    ASJFasjbfjsadbdf[j] = temp;
                }
            }
        }
        int snd = 0;
        for (int i = 0; i < ASJFasjbfjsadbdf.length; i++) {

            if (ASJFasjbfjsadbdf[i].getDuration() > duration1) {
                snd++;
                System.out.println(ASJFasjbfjsadbdf[i].getType());

            }

        }

        if (snd == 0) {
            System.out.println("No playlist found with mentioned attribute.");

        }

    }

    public static int ASJFasjbfjsadbdf1(Sdalshfoaasfjfgsaldjf[] d, int s) {
        int ave = 0;
        int n = 0, c = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i].getCount() > s) {
                c += d[i].getCount();
                n++;

            }
        }
        try
        {
                    ave = c / n;
                  return ave;

        }
        catch(ArithmeticException e)
        {
            return 0;
        }
    }

}

class Sdalshfoaasfjfgsaldjf {
    private int no;
    private String type;
    private int count;
    private double duration;

    public Sdalshfoaasfjfgsaldjf(int no, String type, int count, double duration) {
        super();
        this.no = no;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

}


// //////////////// UNIX //////

/*
awk 'BEGIN{FS="#", chanegeme=0;}
{
    if($3<25)
    {chanegeme+=$3;}
}
END { if(chanegeme!=0){print "Total sum: " chanegeme;
}
else
{
    print "No record found.";
}}'

*/