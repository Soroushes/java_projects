import java.util.Locale;

public class saipa_val {
    String name, color, information;
    int model ;
    db_saipa car = new db_saipa() ;
    public boolean color() {
        if (color.toLowerCase().equals("sefid") || color.toLowerCase().equals("meshki") || color.toLowerCase().equals("ghermez") || color.toLowerCase().equals("abi")|| color.toLowerCase().equals("toosi"))
        {
            return false;
        }
        else return true;
    }
    public boolean model(){
        if (model<1402 && model>1390) return false ;
        else return true ;
    }
    public void insert(){
        car.color=color ;
        car.model=model ;
        car.information=information ;
        car.name=name ;
        car.insert() ;
    }
}
