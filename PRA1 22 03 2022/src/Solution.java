import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); // creating object of scanner class
        int n = sc.nextInt(); // calling nextInt() method of Scanner class to accept number of lawyer objects
        sc.nextLine();
        UserManaagement d[] = new UserManaagement[n]; // n represents size of the array
        for (int i = 0; i < d.length; i++) {
            int number = sc.nextInt(); // accept id
            sc.nextLine();
            int noofaccountholder = sc.nextInt(); // accept id
            sc.nextLine();
            String Actype = sc.nextLine(); // accept name
            int blance = sc.nextInt(); // accept id
            sc.nextLine();
            d[i] = new UserManaagement(number, noofaccountholder, Actype, blance); // creating object
        }
        String f1 = sc.nextLine(); // accept name
        // search on telegram @codewithvirus
        UserManaagement ans = codewithvirus1(d);

        if (ans != null) {
            System.out.println("number-" + ans.getNumber());
            System.out.println("noOfAccountHolders-" + ans.getNoofaccountholder());
            System.out.println("acType-" + ans.getActype());
            System.out.println("balance-" + ans.getBlance());

        } else {
            System.out.println("No Account found with mentioned attribute");

        }
        UserManaagement ans1 = codewithvirus2(d, f1);

        if (ans1 != null) {
            System.out.println("number-" + ans1.getNumber());
            System.out.println("noOfAccountHolders-" + ans1.getNoofaccountholder());
            System.out.println("acType-" + ans1.getActype());
            System.out.println("balance-" + ans1.getBlance());

        } else {
            System.out.println("No Account found with mentioned attribute");

        }
    }
    // search on telegram @codewithvirus

    public static UserManaagement codewithvirus1(UserManaagement[] d) {

        UserManaagement p = null;

        UserManaagement temp = null;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i].getNoofaccountholder() > d[j].getNoofaccountholder()) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        p = d[d.length - 1];

        return p;
    }

    // search on telegram @codewithvirus
    public static UserManaagement codewithvirus2(UserManaagement[] d, String s) {
        UserManaagement p = null;
        int ab = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i].getActype().equalsIgnoreCase(s)) {
                p = d[i];
                break;
            }

        }
        return p;
    }

}
// search on telegram @codewithvirus


class UserManaagement {
    private int number;
    private int noofaccountholder;
    private String Actype;
    private int blance;

    public UserManaagement(int number, int noofaccountholder, String actype, int blance) {
        super();
        this.number = number;
        this.noofaccountholder = noofaccountholder;
        Actype = actype;
        this.blance = blance;
    }

    public int getNumber() {
        return number;
    }
    // search on telegram @codewithvirus

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNoofaccountholder() {
        return noofaccountholder;
    }

    public void setNoofaccountholder(int noofaccountholder) {
        this.noofaccountholder = noofaccountholder;
    }

    public String getActype() {
        return Actype;
    }

    public void setActype(String actype) {
        Actype = actype;
    }

    public int getBlance() {
        return blance;
    }
    // search on telegram @codewithvirus

    public void setBlance(int blance) {
        this.blance = blance;
    }

}
// search on telegram @codewithvirus


////////////////////////////////UNIX////////////////////


/*


awk 'BEGIN
{
    FS=",";codewithvirus=0;
}
{
    print $2 " "$4;
}'

*/