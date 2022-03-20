import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in) ;
        Person person = new Person() ;
        System.out.print("enter your name : ");
        person.name = Scan.nextLine() ;
        System.out.print("enter your student number : ");
        person.number = Scan.nextLine() ;
        System.out.print("enter your GPA : ");
        person.gpa = Scan.nextDouble() ;
        person.put();
        person.get();
    }
}
