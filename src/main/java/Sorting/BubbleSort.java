package Sorting;

public class BubbleSort {


    static void sortArray(int[] arr)
    {
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                int current = arr[j];
                int next    = arr[j+1];

                if(current > next)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr)
    {
        for(int i: arr)
        {
            System.out.print(i+" ");
        }

        System.out.println("");
    }

    public static void main(String args[])
    {

        int arr[] = {5,1,4,2,8};
        printArray(arr);
        sortArray(arr);
        System.out.println("After sorting ");
        printArray(arr);
    }
}
