import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in) ;
        Mynum mynum = new Mynum() ;
        System.out.print("enter an Integer number : ");
        mynum.number = Scan.nextInt();
        mynum.isEven(mynum.number);
        mynum.isOdd(mynum.number);
        mynum.isNegative(mynum.number);
        mynum.isPositive(mynum.number);
        mynum.isZero(mynum.number);
    }
}
