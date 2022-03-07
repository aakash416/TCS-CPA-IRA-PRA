import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner sc = new Scanner(System.in); 
    int n=5;
    Toy aary[] = new Toy[n]; 

    for(int i=0;i<n;i++)
    {
    int Toyid=sc.nextInt();
    sc.nextLine();
    String Toyname=sc.nextLine();
    String category=sc.nextLine();
    double price=sc.nextDouble();
    sc.nextLine();
    double discount =sc.nextDouble();
    sc.nextLine();
    aary[i] = new Toy(Toyid,Toyname,category,price,discount); 
    
    }  
    
    String fs1=sc.nextLine();
    String fs2=sc.nextLine();
    int ans1=findtotalstock(aary,fs1);
    if(ans1!=0)
    {
    System.out.println(ans1);
    }
    else
    {
      System.out.println("Category doesn't exist");

    }
    
    Toy ans2 = searchbyid(aary, fs2);

    if (ans2 != null) {
      System.out.println(ans2.getToyid());
      System.out.println(ans2.getToyName());
      System.out.println(ans2.getCategeroy());
    } else {
      System.out.println("No Match found for the Category");

    }
    
    
    
    
  }
  

  public static int findtotalstock(Toy[] arry, String fs1) {
    int sum = 0;
    for (int i = 0; i < arry.length; i++) {

      if (arry[i].getCategeroy().equalsIgnoreCase(fs1))
        sum++;
    }
    return sum;
  }
  
  
    public static Toy searchbyid(Toy[] arry, String fs2) {
      Toy b = null;
        double d = 0;
        double a[] = new double[arry.length];// declaration and instantiation

        for (int i = 0; i < arry.length; i++) {
          if (arry[i].getCategeroy().equalsIgnoreCase(fs2)) {
            d = (arry[i].getPrice() * arry[i].getDiscount()) / 100;
            b = arry[i];
            break;

          }
        }

        return b;
      }

}






class Toy
{
  private int Toyid; 
  private String ToyName;
  private String categeroy;
  private double price;
  private double discount;
  public Toy(int Toyid, String ToyName, String categeroy, double price, double discount) {
    super();
    this.Toyid = Toyid;
    this.ToyName = ToyName;
    this.categeroy = categeroy;
    this.price = price;
    this.discount = discount;
  }
  public int getToyid() {
    return Toyid;
  }
  public void setToyid(int Toyid) {
    this.Toyid = Toyid;
  }
  public String getToyName() {
    return ToyName;
  }
  public void setToyName(String ToyName) {
    this.ToyName = ToyName;
  }
  public String getCategeroy() {
    return categeroy;
  }
  public void setCategeroy(String categeroy) {
    this.categeroy = categeroy;
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