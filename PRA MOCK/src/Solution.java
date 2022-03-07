import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Player d[] = new Player[n];

        for (int i = 0; i < d.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            int mmatchpalyed = sc.nextInt();
            sc.nextLine();
            int totalrun = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String team = sc.nextLine();
            d[i] = new Player(id, mmatchpalyed, totalrun, name, team);
        }
        int fs1 = sc.nextInt();

        Player temp = null;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i].getMmatchpalyed() > d[j].getMmatchpalyed()) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        if (d[0].getMmatchpalyed() != d[1].getMmatchpalyed()) {
            System.out.println("id-" + d[0].getId());
            System.out.println("matchesPlayed-" + d[0].getMmatchpalyed());
            System.out.println("totalRuns-" + d[0].getTotalrun());
            System.out.println("name-" + d[0].getName());
            System.out.println("team-" + d[0].getTeam());
        } else {
            System.out.println("No Player found with mentioned attribute");
        }
        
        int c=0;
       Player b=null;
        for (int i = 0; i < d.length; i++) {
                    if (d[i].getId() == fs1) {
                        b=d[i];
                    }

        }
        
        if (b!=null) {
                System.out.println("id-" + b.getId());
                System.out.println("matchesPlayed-" + b.getMmatchpalyed());
                System.out.println("totalRuns-" + b.getTotalrun());
                System.out.println("name-" + b.getName());
                System.out.println("team-" + b.getTeam());
            
            } else {
                System.out.println("No Player found with mentioned attribute");

            }

    }

}

class Player {
    private int id;
    private int mmatchpalyed;
    private int totalrun;
    private String name;
    private String team;

    public Player(int id, int mmatchpalyed, int totalrun, String name, String team) {
        super();
        this.id = id;
        this.mmatchpalyed = mmatchpalyed;
        this.totalrun = totalrun;
        this.name = name;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMmatchpalyed() {
        return mmatchpalyed;
    }

    public void setMmatchpalyed(int mmatchpalyed) {
        this.mmatchpalyed = mmatchpalyed;
    }

    public int getTotalrun() {
        return totalrun;
    }

    public void setTotalrun(int totalrun) {
        this.totalrun = totalrun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}