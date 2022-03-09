import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String name;
        Scanner Scan = new Scanner(System.in);
        dars riazi2 = new dars("riazi2", 3, "nadarad", "riazi1");
        dars barnamesazi = new dars("barnamesazi", 3, "nadarad", "mabani computer");
        dars madarmanteghi = new dars("madar manteghi", 3, "riaziat gosaste", "nadarad");
        while (true) {
            System.out.print("name dars ra vared konid (for exit enter exit) : ");
            name = Scan.nextLine();
            if (name=="exit") {
                break ;
            }
            switch (name){
                case "riazi2" : riazi2.darsPrint();
                break ;
                case "barnamesazi" : barnamesazi.darsPrint();
                break;
                case "madar manteghi" : madarmanteghi.darsPrint();
                break;
                default:
                    System.out.println("lotfan name dars ra be dorosti vared konid!");
                    break;
            }

        }
    }
}
