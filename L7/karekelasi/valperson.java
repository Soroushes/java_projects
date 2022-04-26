public class valperson {
    String email , username , pass ,name ;
    dbperson p1 = new dbperson() ;

    public boolean emailval() {
        boolean val = true;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                val = false;
            }
        }
        return val ;
    }
    public boolean usernameval() {
        boolean val = true;
        if (username.length()<15) val=false ;
        return val ;
    }
    public void send() {
        p1.email=email;
        p1.pass=pass;
        p1.name=name;
        p1.username=username;
        p1.insert() ;

    }
    public void Dblogin(){
        p1.username = username ;
        p1.pass = pass ;
        p1.DBlogin();
    }

}
