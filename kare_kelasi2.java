import java.util.Scanner;

public class kare_kelasi2 {
    public static Scanner Scan = new Scanner(System.in) ;
    public static class ketab {

        public void ret() {
        System.out.println("ketab bargardande shod ! \n");
    }
        public void amanat () {
            System.out.println("shoma ketab ra be amanat bordid ! \n ");
        }
        public void kharid () {
            System.out.println("shoma in ketab ra kharidid ! \n");
        }
    }
    public static void main(String[] args) {
        ketab ketab1 = new ketab();
        while (true) {
            System.out.print(" 1-bargardandane ketab \n 2-amanat gereftane ketab \n 3- kharide ketab \n 4-exit \n enter function number :  ");
            int num = Scan.nextInt();
            if (num==4) break ;
            switch (num) {
                case 1:
                    ketab1.ret();
                    break;
                case 2:
                    ketab1.amanat();
                    break;
                case 3:
                    ketab1.kharid();
                    break;
                default:
                    System.out.println(" adad be eshtebah vared shode ast ! ");
                    break;
            }
        }
    }
}
