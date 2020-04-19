package Strings;

import java.util.*;

public class MakeAnagram {

    static int makeAnagram(String a,String b)
    {
        int numberOfMatchingCharacters = 0;
        int numberOfDeletion = 0 ;
        Set<Character> set = new HashSet<Character>();

        for(int i=0;i<a.length();i++)
        {
            char Acurrent = a.charAt(i);
            System.out.println("Acurrent::"+Acurrent);
            for(int j=0;j<b.length();j++)
            {
                char BCurrent = b.charAt(j);

                System.out.println("BCurrent::"+BCurrent);


                if((Acurrent-BCurrent)==0)
                {
                    System.out.println(Acurrent+"::Match"+BCurrent);
                    set.add(Acurrent);
                    numberOfMatchingCharacters++ ;
                }
            }
        }

            numberOfDeletion = (a.length()-numberOfMatchingCharacters)+(b.length()-numberOfMatchingCharacters);

            return numberOfDeletion;

    }

    public static void main(String args[])
    {
        String a = "dcf";
        String b = "cde";

        System.out.println(makeAnagram(a,b));
    }
}
