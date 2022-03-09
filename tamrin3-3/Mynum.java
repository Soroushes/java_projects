public class Mynum implements MyInteger {
    public int number ;

    @Override
    public void isEven(int number) {
        if (number%2==0 && number!=0) System.out.println(number + " is an Even number ! ");
    }

    @Override
    public void isOdd(int number) {
        if (number%2!=0) System.out.println(number + " is an odd number ! ");
    }

    @Override
    public void isPositive(int number) {
        if (number>0) System.out.println(" and is positive ! ");
    }

    @Override
    public void isNegative(int number) {
        if (number<0) System.out.println("and is Negative ! ");
    }

    @Override
    public void isZero(int number) {
        if(number==0) System.out.println("the number is Zero !");
    }
}
