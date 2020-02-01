package  CreationDesignPattern ;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {

    public static void toStr(String[] arr)
    {
        for(String s: arr)
        {
            System.out.print(s+",");
        }
    }
    public static String[] uniqueNames(String[] names1, String[] names2) {

        HashMap<String,Integer> nameHashMap = new HashMap<String, Integer>();
        HashMap<String,Integer> duplicateHashMap = new HashMap<String, Integer>();
        int name1Arrlen     = names1.length ;
        int name2Arrlen     = names2.length ;
        int resultArrayLen  = name1Arrlen + name2Arrlen ;
        Set<String> resultSet       = new HashSet<String>();


        System.out.println("resultArrayLen::"+resultArrayLen);

        String[] resultArray = new String[resultArrayLen] ;

        for(int idx= 0 ; idx < resultArray.length ; idx++ )
        {

            /** Assigning name1 arr value to resultant Array **/
            /** check loop is not exceeding the name1 arr */
            if(idx <= (name1Arrlen-1))
            {
                resultArray[idx] = names1[idx] ;
                nameHashMap.put(resultArray[idx],idx);
                resultSet.add( resultArray[idx]);
            }
            /** after exceeding names1 arr, name2 arr is copied to resutlArr */
            else
            {
                if((nameHashMap.containsKey(names2[idx - name1Arrlen])))
                {
                   continue;
                }
                resultArray[idx] = names2[idx - name1Arrlen] ;
                nameHashMap.put(resultArray[idx],idx);
                resultSet.add( resultArray[idx]);
            }

         }



    //        throw new UnsupportedOperationException("Waiting to be implemented.");

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


        String[] finalResultArray = new String[resultSet.size()];

        return resultSet.toArray(finalResultArray) ;



    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        String[] resultArr = new String[names1.length + names2.length] ;

//        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia

        resultArr = MergeNames.uniqueNames(names1,names2);

        toStr(resultArr);
    }
}