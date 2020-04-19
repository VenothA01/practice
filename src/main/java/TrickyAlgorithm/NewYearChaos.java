package TrickyAlgorithm;

public class NewYearChaos {


    // Complete the minimumBribes function below.

    static void minimumBribes(int[] arr) {

        int queueNumber = 0;
        int numberOfBribes = 0;
        for(int i=(arr.length)-1;i>=0;i--)
        {
            queueNumber = arr.length ;
            if(queueNumber == arr[i])
            {
                numberOfBribes = queueNumber - i;
                if(numberOfBribes > 3)
                {
                    System.out.println("Too chaotic");
                    return;
                }
            }

        }

        System.out.println(numberOfBribes);

    }


    public static void main(String args[])
    {
//        int[] arr = {2,1,5,3,4};
//        int[] arr = {2,5,1,3,4};
        int[] arr = {5,1,2,3,7,8,6,4};
        minimumBribes(arr);


    }
}
