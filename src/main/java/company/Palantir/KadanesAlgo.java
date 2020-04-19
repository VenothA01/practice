package company.Palantir;

public class KadanesAlgo {


    public int Kadane(int[] arr){
        int max_so_far = 0;
        int max_end_here = 0 ;

        for(int i=0;i<arr.length;i++){

            max_end_here = max_end_here+arr[i];

            if(max_end_here<0)
            {
                max_end_here=0;
            }
            if(max_so_far<max_end_here)
            {
                max_so_far = max_end_here;
            }
        }

        return max_so_far;
    }


    public static void main(String args[])
    {
        int arrA[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
        KadanesAlgo kadanesAlgo = new KadanesAlgo();
        System.out.println(kadanesAlgo.Kadane(arrA));

    }
}
