import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList score = new ArrayList() ;
        Information p1 = new Information() ;
        p1.Setname("soroush esmailian");
        p1.Setstudentnum("40012588974");
        p1.Setfather("mohammad");
        score.add(12) ;
        score.add(18) ;
        score.add(20) ;
        score.add(18.75) ;
        score.add(15) ;
        System.out.println("name: "+ p1.Getname());
        System.out.println("Student number : " + p1.Getstudentnum());
        System.out.println("Father name : " + p1.Getfather());
        System.out.print("nomre ha : ");
        for (Object i :  score) {
            System.out.print(i + " - ");
        }


    }
}
