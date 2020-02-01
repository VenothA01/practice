package CreationDesignPattern;

public class MathUtils {

    static double aDouble ;
    static double bDouble ;
    public static double average(int a, int b) {

        aDouble = a ;
        bDouble = b ;

        return (aDouble + bDouble) / 2;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}
