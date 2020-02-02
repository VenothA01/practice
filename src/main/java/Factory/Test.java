package Factory;

import java.util.Scanner;

public class Test {

    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number");
        double num1 = in.nextDouble() ;

        System.out.println("Enter second Number");
        double num2 = in.nextDouble() ;

        CalculateFactory factory = new CalculateFactory() ;
        System.out.println("Enter the operation type");
        String type = in.next();

        Calculate obj = factory.getCalculate(type);

        obj.calculate(num1,num2);






    }



}
