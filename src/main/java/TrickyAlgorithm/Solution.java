package TrickyAlgorithm;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here


        int leftAbsoluteDiagonalDifference = arr.get(0).get(0);

        return leftAbsoluteDiagonalDifference;

    }

    public static void main(String[] args) throws IOException {

        List<Integer> aList = new ArrayList<Integer>();
        aList.add(5);
        aList.add(6);
        aList.add(7);

        List<Integer> bList = new ArrayList<Integer>();
        bList.add(10);
        bList.add(6);
        bList.add(11);

        int maxSize = Math.max(aList.size(),bList.size());

            int[] ar = {1,2,4};

        long sum = 0 ;
        long n = ar[ar.length-1];
        long a = ar[0];


        if(n==1)
        {
            sum = ar[1];
        }
        else
        {
            long d = ar[1] - ar[0];
             sum = a + (n-1) * d ;
        }




    }
}
