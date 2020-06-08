package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {

    void printArray(char[] arr){

        System.out.println("===============================================PRINTING ARRAY===============================================================");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }

        System.out.println("\n");
    }

    void printArray(int[] arr){

        System.out.println("===============================================PRINTING ARRAY===============================================================");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }

        System.out.println("\n");
    }

    boolean isValidAnagram(char[] str1,char[] str2){

        if(str1.length!=str2.length)
        {
            return false;
        }

        int[] count = new int[256];
        Arrays.fill(count,0);

        for(int i=0;i<str1.length;i++)
        {
            count[str1[i]]++;
            count[str2[i]]--;
        }




        for(int i=0;i<256;i++)
        {
            if(count[i]!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){

        char str1[] = ("geeksforgeeks").toCharArray();
        char str2[] = ("forgeeksgeeks").toCharArray();

        ValidAnagram obj  = new ValidAnagram();

        String sout =(obj.isValidAnagram(str1,str2)) ? "valid" : "Invalid" ;

        System.out.println(sout);

    }
}
