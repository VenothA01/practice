package company.Palantir;

public class MaximumSubArrayDP {


    static int maxCrossingSum(int arr[], int left, int mid, int right)
    {
        int sum = 0 ;
        int left_sum    = Integer.MIN_VALUE;


        for(int i=mid;i>=left;i--)
        {

            sum = sum+arr[i];

            if(sum>left_sum){
                left_sum=sum;
            }
        }
        int right_sum   =   Integer.MIN_VALUE;
        sum = 0;

        for (int j=mid+1;j<=right;j++)
        {
            sum = sum+arr[j];

            if(sum>right_sum)
            {
                right_sum=sum;
            }
        }


        return left_sum+right_sum;

    }

    static int max(int a,int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        return c;
    }
    static int maxSubArraySum(int[] arr, int left, int right)
    {
        if(left==right){
            return  arr[left];
        }

        int mid = (left+right)/2;

        int maxLeftSubArray         = maxSubArraySum(arr,left,mid);
        int maxRightSubArray        = maxSubArraySum(arr,mid+1,right);
        int maxCrossingSubArray     = maxCrossingSum(arr,left,mid,right);

        return max(maxLeftSubArray,maxRightSubArray,maxCrossingSubArray);
    }



    public static void main (String args[])
    {
        int arr[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
        int n = arr.length;
        long start = System.currentTimeMillis();
        int max_sum = maxSubArraySum(arr, 0, n-1);

        System.out.println("max_sum::"+max_sum);
    }
}
