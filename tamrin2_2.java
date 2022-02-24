import java.util.ArrayList;
import java.util.Scanner;

public  class tamrin2_2 {
    public static int zarib_riazi, zarib_fizik, zarib_farsi, zarib_zaban, zarib_mabani;
    public static Scanner Scan = new Scanner(System.in);

    public static class Student {
        public String name;
        public float riazi;
        public float fizik;
        public float zaban;
        public float mabani;
        public float farsi ;

        public void moaddel() {
            float moaddel = (riazi * zarib_riazi + fizik * zarib_fizik + mabani * zarib_mabani + zaban * zarib_zaban + farsi * zarib_farsi) / (zarib_farsi + zarib_zaban + zarib_fizik + zarib_mabani + zarib_riazi);
            System.out.println("moadele " + name + ": " + moaddel);
            if (moaddel>12) System.out.println("mashrot nashodid!");
            else System.out.println("mashrot!!");

        }
    }
        public static void main(String[] args) {
            Student student1 = new Student();
            System.out.print("esm daneshjo ra vared konid : ");
            student1.name = Scan.nextLine();


            System.out.print("nomre riazi ra vared konid : ");
            student1.riazi = Scan.nextFloat();
            System.out.print("zarib dars riazi ra vared konid : ");
            zarib_riazi = Scan.nextInt();

            System.out.print("nomre fizik ra vared konid : ");
            student1.fizik = Scan.nextFloat();
            System.out.print("zarib dars fizik ra vared konid : ");
            zarib_fizik = Scan.nextInt();

            System.out.print("nomre mabani ra vared konid : ");
            student1.mabani = Scan.nextFloat();
            System.out.print("zarib dars mabani ra vared konid : ");
            zarib_mabani = Scan.nextInt();

            System.out.print("nomre zaban ra vared konid : ");
            student1.zaban = Scan.nextFloat();
            System.out.print("zarib dars zaban ra vared konid : ");
            zarib_zaban = Scan.nextInt();

            System.out.print("nomre farsi ra vared konid : ");
            student1.farsi = Scan.nextFloat();
            System.out.print("zarib dars farsi ra vared konid : ");
            zarib_farsi = Scan.nextInt();
            student1.moaddel() ;
        }
    }

