import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = 4;
        ContainerStore d[] = new ContainerStore[n];

        for (int i = 0; i < d.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String material = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            d[i] = new ContainerStore(id, material, price, brand);
        }

        String f1 = sc.nextLine();

        int a = 0, c = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i].getMaterial().equalsIgnoreCase(f1)) {
                a += d[i].getPrice();

                c++;
            }
        }

        try {

            double avg = a / c;
            if (avg != 0) {
                System.out.println(avg);

            } else {
                System.out.println("No such container found");

            }
        } catch (ArithmeticException e) {
            System.out.println("No such container found");

        }

        ContainerStore temp = null;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i].getPrice() > d[j].getPrice()) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }

//        int s=0,abc=1;
//        for (int i = 0; i < d.length; i++) {
//            if (d[i].getPrice() %2==0  ) {
//                s++;
//                if(s==2)
//                {
//                    abc++;
//        System.out.println(d[i].getId());
//        System.out.println(d[i].getMaterial());
//        System.out.println(d[i].getPrice());
//        System.out.println(d[i].getBrand());
//
//                }
//
//            }
//        }

        ContainerStore ans2 = searchbyid(d);

        if (ans2 != null) {
            System.out.println(ans2.getId());
            System.out.println(ans2.getMaterial());
            System.out.println(ans2.getPrice());
            System.out.println(ans2.getBrand());
        } else {
            System.out.println("No such container found");

        }
        
        
//        if (abc < 1) {
//
//            System.out.println("No such container found");
//        }

    }

    public static ContainerStore searchbyid(ContainerStore[] fabrics) {
        ContainerStore b = null;
        int s = 0, abc = 1;
        for (int i = 0; i < fabrics.length; i++) {
            if (fabrics[i].getPrice() % 2 == 0) {
                s++;
                if (s == 2) {
                    b = fabrics[i];

                }

            }
        }
        return b;
    }

}

class ContainerStore {
    private int id;
    private String material;
    private int price;
    private String brand;

    public ContainerStore(int id, String material, int price, String brand) {
        super();
        this.id = id;
        this.material = material;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}