public class main {
    public static void main(String[] args){
        Inf p1 = new Inf() ;
        Inf p2 = null ;
        Inf p3 = null ;
        Inf p4 = null ;
        p1.name="soroush" ;
        p1.family="esmailian" ;
        p1.age = 18 ;

        try{
            p2= (Inf) p1.clone();
            p3= (Inf) p1.clone() ;
            p4= (Inf) p1.clone() ;
        }catch (CloneNotSupportedException e) {
            System.out.println("clone not supported");
        }
        System.out.println(p1+" " +p1.name + " "+ p1.family+" " + p1.age);
        System.out.println(p2+" " +p2.name + " "+ p2.family+" " + p2.age);
        System.out.println(p3+" " +p3.name + " "+ p3.family+" " + p3.age);
        System.out.println(p4+" " +p4.name + " "+ p4.family+" " + p4.age);
    }
}