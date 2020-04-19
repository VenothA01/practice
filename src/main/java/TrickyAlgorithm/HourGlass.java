package TrickyAlgorithm;

public class HourGlass {

    static int findMaximumSum(int[][] mat)
    {
        int sum = 0 ;

        int rows    = mat.length -1;
        int cols    =  mat[0].length -1;

        int i,j;

        if(rows<3 || cols<3)
        {
            return  -1 ;
        }
        int MaxiSum = Integer.MIN_VALUE;

        for(i=0;i<rows-2;i++)
        {
            for(j=0;j<cols-2;j++)
            {
                sum = (mat[i][j]
                        +mat[i][j+1]
                        +mat[i][j+2]
                        +mat[i+1][j+1]
                        +mat[i+2][j]
                        +mat[i+2][j+1]
                        +mat[i+2][j+2]);

                MaxiSum = Math.max(MaxiSum,sum);
            }


        }

                return sum;
    }

    public static void main(String args[])
    {
        int [][]mat = {{1, 2, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {2, 1, 4, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0}};


        int maximumSum = findMaximumSum(mat);
        if(maximumSum    == -1)
        {
            System.out.println("Not possible");
        }
        else
        {
            System.out.println("Maximum sum of hour glass = "
                    + maximumSum);
        }
    }
}
