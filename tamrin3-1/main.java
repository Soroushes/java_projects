import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in) ;
        float num1 , num2 ;
        System.out.print("enter first number : ");
        num1 = Scan.nextFloat() ;
        System.out.print("enter second number : ");
        num2 = Scan.nextFloat();
        amaliat amaliat1 = new amaliat(num1 , num2) ;
        amaliat1.jam();
        amaliat1.tafrigh();
        amaliat1.zarb();
        amaliat1.taghsim();
    }
}
