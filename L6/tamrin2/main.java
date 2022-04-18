import java.util.Scanner;

public class main {
        public static Scanner Scan = new Scanner(System.in) ;
        public static void main(String[] args) {

            System.out.println("1 : enter information \n 2 : del information");
            switch (Scan.nextInt()) {
                case 1 : enter() ;
                    break ;
                case 2 : del();
            }
        }
        public static void enter() {
            person person1  = new person() ;

            System.out.print("enter code : ");
            person1.code = Scan.nextInt() ;

            System.out.print("enter name : ");
            person1.name=Scan.next();

            System.out.print("enter melli code : ");
            person1.melli = Scan.next() ;

            System.out.print("enter father name : ");
            person1.father = Scan.next() ;

            System.out.print("enter job : ");
            person1.job = Scan.next() ;

            System.out.print("enter hoghogh : ");
            person1.hoghogh = Scan.next() ;
            person1.DBcom() ;
        }
        public static void del(){
            person person1  = new person() ;
            System.out.print("enter person code you want to delete : ");
            person1.code=Scan.nextInt() ;
            person1.del();

        }

}
