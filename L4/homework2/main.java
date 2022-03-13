import java.util.Scanner;

public class main {
    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            delta();
        } catch (DeltaException e) {
            e.printStackTrace();
        }


    }

    public static void delta() throws DeltaException {
        float a , b , c ;
        System.out.print("enter a : ");
        a = Scan.nextFloat();
        System.out.print("enter b : ");
        b = Scan.nextFloat() ;
        System.out.print("enter c : ");
        c = Scan.nextFloat();

        float delta = (b*b) - (4*a*c) ;
        if (delta<0) {
            throw new DeltaException("delta manfi ast !") ;
        }
        else if (delta==0){
            System.out.println("javabe moadele : " + (-b) / (2*a));
        }
        else{
            System.out.println("javabe aval : " + (-b + Math.sqrt(delta)) / (2*a));
            System.out.println("javabe dovom : " + (-b - Math.sqrt(delta)) / (2*a));
        }
    }
}
