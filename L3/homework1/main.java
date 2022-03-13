import java.util.Locale;
import java.util.Scanner;

public class main {
    public static login user1 = new login("soroushes1" , "soroush" , "Soroush1382") ;
    public static void main(String[] args) {
        try {
            usercheck();
        }catch (LoginException e) {
            e.printStackTrace();
        }

    }
    public static void usercheck() throws LoginException{
        Scanner Scan = new Scanner(System.in) ;

        System.out.print("enter your name : ");
        String name = Scan.nextLine() ;
        name=name.toLowerCase(Locale.ROOT) ;

        System.out.print("enter your username : ");
        String username = Scan.nextLine() ;
        username=username.toLowerCase(Locale.ROOT) ;

        System.out.print("enter your password : ");
        String pass = Scan.nextLine() ;

        if (name.equals(user1.name) && username.equals(user1.username) && pass.equals(user1.pass)) {
            System.out.println("loginned succesfully");
        }
        else {
            throw new LoginException("name or username or password is incorrect ! ") ;
        }
    }
}
