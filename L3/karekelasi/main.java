import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in) ;
        String[] user1 = new String[3] ;
        String[] user2 = new String[3] ;
        System.out.print("user1: enter name : ");
        user1[0]=Scan.nextLine().toLowerCase(Locale.ROOT) ;
        System.out.print("user1: enter family : ");
        user1[1]=Scan.nextLine().toLowerCase(Locale.ROOT) ;
        System.out.print("user1: enter age : ");
        user1[2]=Scan.nextLine() ;

        System.out.print("user2: enter name : ");
        user2[0]=Scan.nextLine().toLowerCase(Locale.ROOT) ;
        System.out.print("user2: enter family : ");
        user2[1]=Scan.nextLine().toLowerCase(Locale.ROOT) ;
        System.out.print("user2: enter age : ");
        user2[2]=Scan.nextLine() ;

        try {
            checkuser(user1,user2);
        }catch (UserException e) {
            e.printStackTrace();
        }

    }
    public static void checkuser(String[] user1 , String[] user2) throws UserException {

        boolean repeat = true ;
        for (int i = 0 ; i<3 ; i++) {
           if (!(user1[i].equals(user2[i]))) {
               repeat = false;
           }
        }
        if (repeat) throw new UserException("user haye vared shode tekrari hastand !");
        else {
            System.out.println("user ha tekrari nistand.");
        }
    }
}
