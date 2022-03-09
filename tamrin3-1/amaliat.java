public class amaliat {
    public float num1 , num2 ;
    public amaliat(float num1 , float num2){
        this.num1=num1 ;
        this.num2=num2 ;
    }
    public void jam(){
        System.out.println("jam = " + (num2+num1));
    }
    public void tafrigh(){
        System.out.println("tafrigh " + Math.abs(num1-num2));
    }
    public void zarb(){
        System.out.println("zarb = " + num2*num1);
    }
    public void taghsim(){
        System.out.println("taghsim = " + num1/num2);
    }
}
