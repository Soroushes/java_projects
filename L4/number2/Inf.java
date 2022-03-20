public class Inf<First , Second , Third> implements Cloneable{
    public First name ;
    public Second family ;
    public Third age ;
    protected Object clone () throws CloneNotSupportedException {

        return super.clone ();
    }

}
