import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person {
    public String name,number ;
    public double gpa ;
    Map inf = new HashMap<>() ;
    public void put() {
        inf.put("name" , name) ;
        inf.put("student number" , number) ;
        inf.put("gpa" , gpa) ;
    }
    public void get () {
        Set set = inf.keySet() ;
        for(Object i : set){
            System.out.println(i + " = " +inf.get(i)) ;
        }
    }
}
