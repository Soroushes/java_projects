import java.util.Scanner;

public class main {
    public static Scanner Scan = new Scanner(System.in) ;

    public static void main(String[] args) {
        saipa_val car = new saipa_val() ;
        boolean color = true , model=true ;

        System.out.print("name mashin ra vared konid : ");
        car.name=Scan.next() ;

        while(color) {
            System.out.print("rang mashin ra vared konid : ");
            car.color = Scan.next();
            color=car.color() ;
        }
        while (model) {
            System.out.print("model mashin ra vared konid : ");
            car.model = Scan.nextInt();
            model=car.model()  ;
        }
        System.out.print("etelaat ezafi mashin ra vared konid : ");
        car.information=Scan.next() ;

        car.insert();
    }

}

