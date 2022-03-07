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

/*


101 
Blix 
Puzzle 
100.0 
10.0 
102 
SoftBall 
Doll 
150.0 
12.0 
103 
Lira 
Wiggle
95.0 
2.0 
104 
TeddyBear 
Doll 
1525.0 
12.0 
105 
RubikCube 
Puzzle 
1500.0 
15.0
Puzzle 
Doll

*/