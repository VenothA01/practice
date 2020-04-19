package Sorting;

public class MergeSort {

    static void merge(int[] arr,int low,int high,int mid)
    {
        //*** Get Size of the sub Array **/
        int n1 = mid-low+1;
        int n2 = high-mid+1;

        /** create temp Array* /
         *
         */
        int[] Left  = new int[n1];
        int[] Right = new int[n2];

        /**copy data to temp Array **/
        for(int i=0;i<n1;i++)
        {
            Left[i] = arr[low+i];
        }
        for(int j=0;j<n2;j++)
        {
            Right[j]= arr[mid+1+j];
        }

        int i= 0,j=0,k=low;

        while (i<n1 && i<n2)
        {
            if(Left[i]<=Right[j])
            {
                arr[k]=Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k]=Left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=Right[j];
            j++;
            k++;
        }
    }

    static void sort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int mid = (low+high/2);
            System.out.println("mid::"+mid+"high::"+high+"low::"+low);
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,high,mid);
        }
    }

    static void printArr(int[] arr)
    {
        for(int i: arr)
        {
            System.out.print(i+" ");
        }

        System.out.println();
    }

    public static void main(String args[])
    {
        int[] arr= {38,27,43,3,9,82,10};
        System.out.println("Before Sorting");
        printArr(arr);
        System.out.println("Before Sorting");
        sort(arr,0,arr.length-1);
        System.out.println("After Sorting");
        printArr(arr);
    }
}
