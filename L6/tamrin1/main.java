import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static Scanner Scan = new Scanner(System.in) ;
    public static void main(String[] args) {


        System.out.println("1 : enter information \n 2 : update information");
        switch (Scan.nextInt()) {
            case 1 : enter() ;
            break ;
            case 2 : update();
        }
    }
    public static void enter() {
        person person1  = new person() ;
        System.out.print("enter username : ");
        person1.username=Scan.next();

        System.out.print("enter pass : ");
        person1.pass = Scan.next() ;

        System.out.print("enter education : ");
        person1.education = Scan.next() ;

        System.out.print("enter email : ");
        person1.email = Scan.next() ;


        System.out.print("enter code : ");
        person1.code = Scan.nextInt() ;

        System.out.print("enter age : ");
        person1.age = Scan.nextInt() ;
        person1.DBcom() ;
    }
    public static void update(){
        person person1  = new person() ;
        System.out.print("enter person code you want to update : ");
        person1.code=Scan.nextInt() ;
        System.out.print("enter new password : ");
        person1.pass= Scan.next();
        person1.update();

    }
}
