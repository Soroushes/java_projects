import java.util.Scanner;

public class tamrin1_2{
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("how many numbers do you want to enter ? : ");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter a number : ");
            numbers[i] = scan.nextInt();
        }
        int result = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > result) result = numbers[i];
        }
        System.out.println("biggest number is : " + result);
    }
}