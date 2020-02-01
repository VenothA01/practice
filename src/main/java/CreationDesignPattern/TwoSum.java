package CreationDesignPattern;

import java.util.Collection;
import java.util.HashMap;

public class TwoSum {


    public static int[] findTwoSum(int[] list, int sum) {


        int listLength      = list.length ;
        int outerIdx , innerIdx ;
        int[] tempData = new int[listLength*2] ;


        /**
         for(int i = 0 ; i < resultArrayLen ; i++)
         {
         for(int j = i+1 ; j < resultArrayLen ; j++)
         {
         if(!(resultArray[i]==resultArray[j])){
         resultSet.add(resultArray[i]) ;
         }
         }
         }
         **/

        for(outerIdx = 0; outerIdx < listLength ; outerIdx ++)
        {
            for(innerIdx = outerIdx+1 ; innerIdx < listLength ; innerIdx++)
            {
                if((list[innerIdx]+list[outerIdx]) == sum)
                {
                    int tempDataIdx  = 0 ;
                    tempData[tempDataIdx]  = list[outerIdx] ;
                    tempDataIdx ++ ;
                    tempData[tempDataIdx] = list[innerIdx] ;

                }
            }
        }
                    return tempData;

    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]+" "+indices[2]);
        }
    }
}