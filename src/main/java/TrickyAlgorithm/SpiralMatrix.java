package TrickyAlgorithm;

public class SpiralMatrix {

    /****
     *  [1,2,3,4
     *  5,6,7,8,       ========>
     *  9,10,11,12
     *  13,14,15,16]
     *
     *
     *
     *
     *
     */

    static void  print_sprial(int rowSize,int colZise,char[][] char2dArray)
    {
        int i = 0 , k= 0 , l=0;

        int last_row    = rowSize -1 ;
        int last_col    = colZise -1 ;

        while(k <= last_row && l <= last_col)
        {
            for(i=l ; i<rowSize ; i++)
            {
                System.out.print(char2dArray[k][i]+" ");
            }

                    k++ ;

        }
    }


    public static void main(String args[])
    {
        char[][] char2dArray = {{'a','b','c','d','e'},{'f','g','h','i'},{'j','k','l','m'},{'n','o','p','q'}};

        int rowSize = char2dArray.length;
        int colZise = char2dArray[0].length ;

        print_sprial(rowSize,colZise,char2dArray);
    }
}
