package TrickyAlgorithm;

import java.io.IOException;

public class RotateLeft {

    static void printArray(int[] arr)
    {
        int i,lenth=arr.length;

        for(i=0;i<lenth;i++)
        {
            System.out.print(arr[i]+" ");

        }

    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        /**** d =2
         0 =>[1,2,3,4,5]
         1 =>[2,3,4,5,1]
         0 =>[3,4,5,1,2]
         ****/
        int i ,rotations;
        int n = a.length ;

        for(rotations = 1 ; rotations <= d ;rotations++)
        {
            int temp ;
            temp = a[0];

            for(i=0; i< n; i++)
            {
                if(i ==(n-1))
                {
                    a[i]=temp;
                }
                else
                {
                    a[i]=a[i+1];
                }


            }
        }
        return a ;
    }



    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        int d = 2 ;
        rotLeft(a,d);
        printArray(a);

    }
}
