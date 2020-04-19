package TrickyAlgorithm;

public class MinimumSwapsToSortAnArray {

    static int minimumSwapsRequired(int[] arr)
    {
        int arrayLength =arr.length ;
        boolean[] visited = new boolean[arrayLength];
        int newIndex , index;
        int swaps = 0 ;

        for(index=0;index<arrayLength;index++)
        {
            int cycles = 0 ;
            while (!(visited[index]))
            {
                visited[index] = true;
                newIndex = arr[index]-1;
                index = newIndex ;
                cycles ++ ;
            }
            if(cycles>0)
            {
                swaps += cycles-1;
            }
        }


        return swaps;
    }

    public static void main(String args[])
    {
        int[] arr =  {7, 1, 3, 2, 4, 5, 6};
        int minSwapsRequired    = minimumSwapsRequired(arr);
        System.out.println("minSwapsRequired::"+minSwapsRequired);
    }
}
