public class dars {
    public String name;
    public int vahed;
    public String hamniaz;
    public String pishniaz;

    public dars(String name, int vahed, String hamniaz, String pishniaz) {
        this.name = name;
        this.vahed = vahed;
        this.hamniaz = hamniaz;
        this.pishniaz = pishniaz;
    }
    public void darsPrint(){
        System.out.println("name dars : " + name + " ast va " + vahed+ " vahed mibashad //"+ "hamniaz : " + hamniaz + " // va pishniaz : " + pishniaz);

    }
}