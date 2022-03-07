import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Item item[]=new Item[n];
        int i=0;
        while(i<n)
        {
            int id=sc.nextInt();
            int quantity =sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int price=sc.nextInt();
            item[i]=new Item(id,quantity,name,price);
            i++;
            
        }
        int id1=sc.nextInt();
        Item res=findItemWithMaximumPrice(item);
        System.out.println("id-"+res.getid());
        System.out.println("quantity-"+res.getquantity());
        System.out.println("name-"+res.getname());
        System.out.println("price-"+res.getprice());
        
        Item res2=searchItemById(item, id1);
        if(res2!=null)
        {
            System.out.println("id-"+res2.getid());
        System.out.println("quantity-"+res2.getquantity());
        System.out.println("name-"+res2.getname());
        System.out.println("price-"+res2.getprice());
        }
        else
        {
         System.out.println("No Item found with mentioned attribute");   
        }
    }
    
    public static Item findItemWithMaximumPrice(Item[] a)
        {
              Item res=null;
            int pr[]=new int[a.length];
            for(int i=0;i<pr.length;i++)
            {
                pr[i]=a[i].getprice();
                
            }
            Arrays.sort(pr);
            int k=pr[pr.length-1];
            
            for(int i=0;i<pr.length;i++)
            {
                if(a[i].getprice()==k)
                {
                    res=a[i];
                    break;
                }
            }  
             return res;       
       }
        public static Item searchItemById(Item[] a,int id1)
        {
           Item res=null;
           for(int i=0;i<a.length;i++)
           {
               if(a[i].getid()==id1)
               {
                   res=a[i];
                   break;
               }
           }
           return res;
        }

}

 class Item {
     private int id;
     private int quantity;
     private String name;
     private int price;
     public Item(int id,int quantity,String name,int price)
     {   
          super();
         this.id=id;
         this.quantity=quantity;
         this.name=name;
         this.price=price;
     }
     public int getid()
     {
         return id;
     }
     public int getquantity()
     {
         return quantity;
     }
     public String getname()
     {
         return name;
     }
     
     public int getprice()
     {
         return price;
     }
}
 
 
 
 
 
 
 /*
  						UNIX Coding Solution
..................................................................................  
  
   awk 'BEGIN{FS="|"; OFS=","; c=0;}
{
    if(NR>1)
    {
        print $1,","$3;
        c++;
    }
}
END{
    if(c==0)
    print "No records found.";
}'

....................................................................................
  
 */