package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class TwoDArrSort {

    static void print2DArray(int[][] arr){
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[i].length;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]){
        int[][] data ={
                {7, 0},
                {4, 4},
                {7, 1},
                {5, 0},
                {6,1},
                {5,2}};
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[0],o1[0]);
            }
        });
        print2DArray(data);
    }
}
