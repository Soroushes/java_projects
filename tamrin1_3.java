import java.util.Scanner;

public class tamrin1_3 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter two integers");
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            System.out.println("please select an option: \n" +
                    "1) add numbers\n" +
                    "2) absolute difference\n" +
                    "3) product\n" +
                    "4) division");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Sum is equal to:" + (x1+x2));
                    break;
                case 2:
                    System.out.println("Difference is equal to:" + Math.abs(x1 - x2));
                    break;
                case 3:
                    System.out.println("Product is equal to:" + x1 * x2);
                    break;
                case 4:
                    System.out.println("Division is equal to:" + (double) x1 / x2);
                    break;
            }
        }
    }
}