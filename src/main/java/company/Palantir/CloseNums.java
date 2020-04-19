package company.Palantir;

import com.sun.imageio.plugins.common.I18N;

import java.util.HashMap;
import java.util.Map;

public class CloseNums {

    static boolean containsCloseNumsSolution1(int[] arr,int k)
    {
        long start = System.currentTimeMillis();

        int n = arr.length;
        boolean contains = false;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j] && Math.abs(j-i)<=k)
                {
                    return true;
                }
            }
        }

        System.out.println("Time elapsed : in solution1:"+((System.currentTimeMillis()-start)));
        return contains;
    }

    static boolean containsCloseNumsSolution2(int[] arr,int k)
    {
        long start = System.currentTimeMillis();
        Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
           Integer lastSeen = hashMap.get(arr[i]);

           if(lastSeen != null && Math.abs(lastSeen-i)<=k)
           {
               return true;
           }

           hashMap.put(arr[i],i);


           return false;
        }

        System.out.println("Time elapsed : in solution2:"+((System.currentTimeMillis()-start)));

        return false;
    }

    public static void main(String args[])
    {
        int[] arr = {0,1,2,3,5,2};
        int k = 4;


        System.out.println(containsCloseNumsSolution1(arr,k));
        System.out.println(containsCloseNumsSolution2(arr,k));

    }

}
