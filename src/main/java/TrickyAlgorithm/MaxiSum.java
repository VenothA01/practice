package TrickyAlgorithm;

public class MaxiSum {


    static int findMaxiSum(int[] arr)
    {
        int arrLen      = arr.length ;
        int inclusive   = arr[0] ;
        int exclusive   = 0 ;
        int excal_new ;
        int idx ;

        for(idx = 0;idx<arrLen;idx++)
        {
            /* override inclusive */

            excal_new   = (inclusive > exclusive ) ? inclusive : exclusive ;
            inclusive   = exclusive+arr[idx];
            exclusive   = excal_new ;
        }

            return (inclusive > exclusive ? inclusive : exclusive) ;

    }

    public static void main(String ar[])
    {
        int arr[] = {5, 5, 10, 100, 10, 5} ;

        System.out.println("MaxiSum is "+findMaxiSum(arr));



    }
}
