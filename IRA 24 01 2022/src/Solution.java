import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = 4;
        Managemefs d[] = new Managemefs[n];

        for (int i = 0; i < d.length; i++) {
            int busno = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int count = sc.nextInt();
            sc.nextLine();            
            int busstop = sc.nextInt();
            sc.nextLine();            
            d[i] = new Managemefs(busno, name, count, busstop);
        }
        
        int fs1 = sc.nextInt();
        sc.nextLine();            
        int fs2 = sc.nextInt();
        
        int ans1=searchbyid(d,fs1);
        
        if(ans1!=0)
        {
            System.out.println(ans1);

        }
        else
        {
            System.out.println("no such bus found");

        }
       
        
        Managemefs ans2=searchbyid1(d,fs2);
        if(ans2!=null)
        {
            System.out.println(ans2.getName());
            System.out.println(ans2.getBusstop());

        }
        else
        {
            System.out.println("no such bus found");

        }

    }
    
    
    
    public static int searchbyid(Managemefs[] fabrics, int fs1) {
        int b = 0;
        int s = 0, abc = 1;
        for (int i = 0; i < fabrics.length; i++) {
            if (fabrics[i].getBusstop() > fs1) {

                b += fabrics[i].getCount();

            }
        }
        return b;
    }

    
    
    public static Managemefs searchbyid1(Managemefs[] d, int fs2) {
    	Managemefs b = null;
        int s = 0, abc = 1;
        Managemefs temp = null;

        for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i].getBusstop() > d[j].getBusstop()) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
        b=d[d.length-2];
        return b;
    }
}

class Managemefs
{
    private int busno;
    private String name;
    private int count;
    private int busstop;
    public Managemefs(int busno, String name, int count, int busstop) {
        super();
        this.busno = busno;
        this.name = name;
        this.count = count;
        this.busstop = busstop;
    }
    public int getBusno() {
        return busno;
    }
    public void setBusno(int busno) {
        this.busno = busno;
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
    public int getBusstop() {
        return busstop;
    }
    public void setBusstop(int busstop) {
        this.busstop = busstop;
    }
    
    
    
    

}