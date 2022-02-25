
import java.util.Scanner;

public class tamrin2_1 {
    public static Scanner Scan = new Scanner(System.in) ;
    public static class mostatil {
        public float tul ;
        public float arz ;
        public float masahat;
        public float mohit ;

        public mostatil(float tul , float arz) {
            this.tul = tul ;
            this.arz=arz ;
        }
        public void result(){
        mohit = (tul+arz)*2 ;
        masahat = tul* arz ;
            System.out.println("masahate mostatile shoma : " + masahat + " va mohit mostatil : " + mohit);
        }

    }
    public static class moraba {
        public float tul ;
        public float masahat ;
        public float mohit ;


        public void result(){
            mohit = tul*4;
            masahat = tul*tul ;
            System.out.println("masahate moraba : " + masahat + " va mohit moraba = " + mohit);

        }

    }

    public static void main(String[] args) {
        System.out.print("tule mostatil ra vared konid : ");
        float tul = Scan.nextFloat() ;
        System.out.print("arze mostatil ra vared konid : ");
        float arz = Scan.nextFloat() ;
        mostatil mostatil1 = new mostatil(tul , arz) ;
        mostatil1.result();

        moraba moraba1 = new moraba() ;
        System.out.print("andaze zele moraba ra vared konid : ");
        moraba1.tul= Scan.nextFloat() ;
        moraba1.result();

    }

}
