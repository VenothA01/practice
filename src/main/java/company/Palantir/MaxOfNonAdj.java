package company.Palantir;

import java.util.Set;

public class MaxOfNonAdj {

    private int MaxOfNonAdj(int[] arr)
    {
        //3 7 4 6 5
        int inclusive = arr[1];
        int exclusive = 0;
        int exclusive_new;
        int n = arr.length;

        for(int i=1;i<n;i++){

            exclusive_new = (inclusive > exclusive) ? inclusive : inclusive;

            inclusive   = exclusive+arr[i];
            exclusive   = exclusive_new;
        }

        return ((inclusive > exclusive) ? inclusive : exclusive);
    }

    public static void main(String args[]) {

        ///3 7 4 6 5
        int[] arr = {3,7,4,6,5};
//        int[] arr = {5, 5, 10, 100, 10, 5}; ;
        MaxOfNonAdj maxOfNonAdj = new MaxOfNonAdj();
        System.out.println("maxOfNonAdj.MaxOfNonAdj(arr)::"+maxOfNonAdj.MaxOfNonAdj(arr));
    }
}
