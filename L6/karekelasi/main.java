import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


public class main {
    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("1 : login \n2 : sign-up\nenter number : ");
        switch (Scan.nextInt()) {
            case 2: signup();
                break;
            case 1 : login();

        }
    }

    public static void signup() {
        information p1 = new information();
        System.out.print("enter username : ");
        p1.username = Scan.next();
        System.out.print("enter password : ");
        p1.pass = Scan.next();
        System.out.print("enter email : ");
        p1.email = Scan.next();
        System.out.print("enter name : ");
        p1.name = Scan.next();
        p1.DBcom();
    }
    public static void login() {
        information p2 = new information();
        System.out.print("enter username : ");
        p2.username = Scan.next();
        System.out.print("enter password : ");
        p2.pass = Scan.next();
        p2.DBlogin();
    }
}
