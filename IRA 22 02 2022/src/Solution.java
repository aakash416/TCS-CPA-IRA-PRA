import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = 4;

        // search on telegram @codewithvirus
        Moistru codewithvirus[] = new Moistru[n];
        for (int i = 0; i < codewithvirus.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            String bname = sc.nextLine();
            codewithvirus[i] = new Moistru(id, name, price, bname);
        }

        String fs1 = sc.nextLine();
        
        Moistru ans = codewithvirus1(codewithvirus,fs1);

        if (ans != null) {
            System.out.println(ans.getId());
            System.out.println(ans.getName());
            System.out.println(ans.getPrice());
            System.out.println(ans.getBname());

        } else {
            System.out.println("No such moisturizer found");

        }
        
        Moistru ans1 = codewithvirus2(codewithvirus);

        if (ans1 != null) {
               System.out.println(ans1.getId());
            System.out.println(ans1.getName());
            System.out.println(ans1.getPrice());
            System.out.println(ans1.getBname());


        } else {
            System.out.println("No such moisturizer found");

        }

    }

    public static Moistru codewithvirus1(Moistru[] d, String s) {

        Moistru p = null;

        Moistru temp = null;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i].getPrice() > d[j].getPrice()) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            if (d[i].getBname().equalsIgnoreCase(s)) {
                p = d[i];
            }
        }

        return p;
    }
    
    public static Moistru codewithvirus2(Moistru[] d) {

        Moistru p = null;

        Moistru temp = null;
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
        for (int i = 0; i < d.length; i++) {
            if (d[i].getPrice()%2==0 && d[i].getPrice()>350) {
                a++;
                if(a==2)
                {
                p = d[i];
                }
            }
        }

        return p;
    }


}

class Moistru {
    private int id;
    private String name;
    private int price;
    private String bname;

    public Moistru(int id, String name, int price, String bname) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.bname = bname;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

}


/////////////// UNIX/////////////////

/*



awk 'BEGIN{FS="*"; count=0;}
{ if(tolower($3)=="tata motors" && tolower($4)=="ev")
    count++;
}
END{if(count==0){print "No records found"}
    else print count;
}'
*/