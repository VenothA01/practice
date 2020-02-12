package TrickyAlgorithm;

import java.util.Scanner;

public class ClosestPerfectSquare {

    static boolean isPerfectSquare(int n)
    {
        if(Math.sqrt(n) - Math.floor(Math.sqrt(n))!=0)
        {
            return  false ;
        }

        return  true ;
    }

    static void getClosestPerfectSquare(int N)
    {

        if(isPerfectSquare(N))
        {
            System.out.println("The given number "+N+" is perfect squarre");

            return;
        }


        int aboveN = -1 ;
        int belowN = -1 ;

        int n1 ;

        n1 = N + 1 ;

        while (true)
        {
            if(isPerfectSquare(n1))
            {
                aboveN = n1 ;
                break;
            }
            else
            {
                n1 ++ ;
            }
        }

        n1 = N -1 ;
        while (true)
        {
            if(isPerfectSquare(n1))
            {
                belowN = n1 ;
                break;
            }
            else
            {
                n1 -- ;
            }
        }

        int diff1   = aboveN - N ;
        int diff2   = N - belowN ;

        System.out.println("diff1::"+diff1+",diff2::"+diff2);

        System.out.println(Math.min(diff1,diff2));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for perfect square root");

        int N = sc.nextInt();

        getClosestPerfectSquare(N);
    }
}
