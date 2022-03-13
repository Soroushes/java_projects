import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String str = entry() ;
        try {
            Strcheck(str);
        }catch (NumberException e){
            e.printStackTrace();
        }
    }
    public static String entry(){
        Scanner Scan = new Scanner(System.in) ;
        System.out.print("enter your string : ");
        return Scan.nextLine() ;
    }
    public static void Strcheck(String str) throws NumberException {
        boolean number = false ;
        char x[] = {'0','1','2','3','4','5','6','7','8','9'} ;
        for (int i = 0 ; i<str.length() ; i++) {
            for (int j = 0 ; j<10 ; j++) {
                if (x[j]==str.charAt(i)) {
                    number=true ;
                    throw new NumberException("dar reshte adad vojud darad ! ") ;
                }
            }
        }
        if(!number) {
            System.out.println("tule reshe = " + str.length());
        }
    }
}
