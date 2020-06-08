package company.Palantir;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class ToString {

     static String intToString(int n) {
         String s = "";
         int rem = 0;

         if (n == 0) {
             return "0";
         }
         else if(n<0){
             s = "-";
             n = Math.abs(n);
         }

         while (n > 0) {
             rem = n % 10;
             s += rem;
             n = n / 10;
         }

         String temp ="" ;
         for(int i=s.length()-1;i>=0;i--){
             temp += s.charAt(i);
         }

         return temp;

     }

    public static void main(String ar[]){

        System.out.println(intToString(-123));
    }
}
