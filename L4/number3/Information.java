import java.util.ArrayList;
import java.util.List;

public class Information<first , second , third> {
    private first name ;
    private second father;
    private third studentnum ;
    public void Setname (first name){
        this.name = name ;
    }
    public void Setfather (second father){
        this.father = father ;
    }
    public void Setstudentnum (third studentnum){
        this.studentnum = studentnum ;
    }
    public first Getname() {
        return name ;
    }
    public second Getfather() {
        return father ;
    }
    public third Getstudentnum(){
        return studentnum ;
    }
}
