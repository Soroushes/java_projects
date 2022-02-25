import java.util.Scanner;

public class tamrin2_3 {
    public static Scanner Scan = new Scanner(System.in) ;
    public static class moadele{
        /**
         ax+by=e
         cx+dy=f
         */
        public float a , b , e , c , d , f , x , y;
        public void result() {
            if (a / c != b / d && b / d != e / f) {
                x = (e * d - b * f) / (a * d - b * c);
                y = (a * f - e * c) / (a * d - b * c);
                System.out.println("moadele daraye javab ast ! ,  x = " + x + " va y = " + y);
            } else if (a / c == b / d && b / d == e / f) System.out.println("moadele daraye bi nahayat javab ast ! ");
            else System.out.println("moadele javab nadarad !");
        }
    }

    public static void main(String[] args) {
        moadele moadele1 = new moadele() ;
        System.out.print("zarib x ra dar moadele aval vared konid : ");
        moadele1.a = Scan.nextFloat() ;
        System.out.print("zarib y ra dar moadele aval vared konid : ");
        moadele1.b = Scan.nextFloat() ;
        System.out.print("adad sabet ra dar moadele aval vared konid : ");
        moadele1.e = Scan.nextFloat() ;
        System.out.print("zarib x ra dar moadele dovom vared konid : ");
        moadele1.c = Scan.nextFloat() ;
        System.out.print("zarib y ra dar moadele dovom vared konid : ");
        moadele1.d = Scan.nextFloat() ;
        System.out.print("adad sabet ra dar moadele dovom vared konid : ");
        moadele1.f = Scan.nextFloat() ;
        moadele1.result();

    }
}
