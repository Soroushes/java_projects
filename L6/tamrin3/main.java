import java.util.Scanner;

public class main {
    public static Scanner Scan = new Scanner(System.in) ;
    public static void main(String[] args) {
        System.out.println("1 : enter information\n2 : del information\n3 : update information");
        switch (Scan.nextInt()){
            case 1 : enter() ;
            break;
            case 2 : del() ;
            break ;
            case 3 : update() ;
            break ;
        }
    }
    public static void enter(){
        daneshjo daneshjo1 = new daneshjo() ;
        System.out.print("enter your name : ");
        daneshjo1.name =Scan.next() ;

        System.out.print("enter your student code : ");
        daneshjo1.studentcode =Scan.next() ;

        System.out.print("enter your gpa : ");
        daneshjo1.gpa =Scan.nextInt() ;

        System.out.print("enter your entry year : ");
        daneshjo1.year =Scan.nextInt() ;

        daneshjo1.DBcom();
    }
    public static void del(){
        daneshjo person1  = new daneshjo() ;
        System.out.print("enter student code you want to delete : ");
        person1.studentcode=Scan.next() ;
        person1.del();

    }
    public static void update() {
        daneshjo daneshjo1 = new daneshjo() ;
        System.out.print("enter student number you want to update gpa : ");
        daneshjo1.studentcode = Scan.next() ;

        System.out.print("enter new gpa : ");
        daneshjo1.gpa = Scan.nextInt() ;

        daneshjo1.update();
    }
}
