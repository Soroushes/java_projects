
import java.util.Scanner;

public class tamrin2_1 {
    public static Scanner Scan = new Scanner(System.in) ;
    public static class mostatil {
        public float tul ;
        public float arz ;
        public float masahat;

        public mostatil(float tul , float arz) {
            this.tul = tul ;
            this.arz=arz ;
        }
        public void result(){

        masahat = tul* arz ;
            System.out.println("masahate mostatile shoma : " + masahat);
        }

    }
    public static class mosalas {
        public float ghaede ;
        public float ertefa ;
        public float masahat ;


        public void result(){
            masahat = (ghaede * ertefa)/2 ;
            System.out.println("masahate mosalas : " + masahat);

        }

    }

    public static void main(String[] args) {
        System.out.print("tule mostatil ra vared konid : ");
        float tul = Scan.nextFloat() ;
        System.out.print("arze mostatil ra vared konid : ");
        float arz = Scan.nextFloat() ;
        mostatil mostatil1 = new mostatil(tul , arz) ;
        mostatil1.result();

        mosalas mosalas1 = new mosalas() ;
        System.out.print("ghaede mosalas ra vared konid : ");
        mosalas1.ghaede= Scan.nextFloat() ;
        System.out.print("ertefa mosalas ra vared konid : ");
        mosalas1.ertefa = Scan.nextFloat() ;
        mosalas1.result();

    }

}
